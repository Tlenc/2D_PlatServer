package lt.mano.web.controller;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;


public class DBActions {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/2d_platdb";
    public static final String DB_USER = "root";
    public static final String DB_PASS = "";

    private Connection _conn = null;


    public DBActions() throws IOException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            _conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public String RodykRezultatus(ResultSet values) throws IOException {

        String result = "";
        ResultSetMetaData lentelesInfo = null;
        try {
            lentelesInfo = values.getMetaData();

            while (values.next()) {
                for (int i = 1; i <= lentelesInfo.getColumnCount(); i++) {
                    result += values.getString(i) + " ";

                }



            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public String RodykRezultatus() {
        Statement statement = null;
        try {

            statement = _conn.createStatement();

            ResultSet set = statement.executeQuery("SELECT *" +  " FROM `vartotojai`");

            return RodykRezultatus(set);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }


    public String[] ReadFile() throws IOException {


        File file = new File("C:\\Users\\Ryver\\IdeaProjects\\2D_PlatV2\\core\\assets\\duomenys.txt");
        Scanner inputFile = new Scanner(file);
        inputFile.useDelimiter(",");
         String[] ret = new String[2];
        while (inputFile.hasNext()) {

            ret[0] = inputFile.next();
            ret[1] = inputFile.next();

            System.out.print(ret[0]+""+ret[1]);
            Statement statement = null;

            try {

                statement = _conn.createStatement();


               statement.executeUpdate("INSERT INTO `vartotojai`(`Username`,`Score`) VALUES ('"+ret[0]+"','"+ret[1]+"')");


            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return ret;

    }

}

