package lt.mano.web.controller;

import lt.mano.web.Main;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.io.IOException;

@Controller
public class ReadFile {
    @RequestMapping(Main.READ_FILE)
    @ResponseBody
    String[] index() throws IOException {

        return Main.dbActions.ReadFile();

    }
}
