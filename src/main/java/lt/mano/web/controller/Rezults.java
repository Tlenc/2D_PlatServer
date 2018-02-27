package lt.mano.web.controller;

import lt.mano.web.Main;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Rezults {
    @RequestMapping(Main.REZULT)
    @ResponseBody
    String index(){

        return Main.dbActions.RodykRezultatus();

    }
}
