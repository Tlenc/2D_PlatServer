package lt.mano.web.controller;

import lt.mano.web.Main;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @RequestMapping(Main.HOME)
    @ResponseBody
    String index(){
        return "Menu:" +
                "<div id = menu><ul><li><a href='"+Main.REZULT+"'>High scores</a></li>" +
                "<ul><li><a href='"+Main.READ_FILE+"'>Read scores from file</a></li>" +
                "<style>" +
                "ul { padding: 10px;" +
                "    font-size: 15px;" +
                "    width: 50%;" +
                "    margin: 10px;" +
                "    border: 3px solid green;}" +
                "body{background-image: url(http://notgoaway.com/wp-content/uploads/2017/07/Background-75.png);" +
                "background-repeat :no-repeat; " +
                "background-position: center;}";


    }
}
