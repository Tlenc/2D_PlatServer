package lt.mano.web;

import lt.mano.web.controller.DBActions;
import lt.mano.web.controller.ReadFile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication

public class Main {
    public static final String HOME ="/";
    public static final String REZULT ="/Rezults";
    public static final String READ_FILE ="/ReadFile";
    public static DBActions dbActions;

    public static void main(String[] args) throws IOException {
        dbActions= new DBActions();

        SpringApplication.run(Main.class,args);
    }
}
