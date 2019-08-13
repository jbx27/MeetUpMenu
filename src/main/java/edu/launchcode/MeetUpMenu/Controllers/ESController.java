package edu.launchcode.MeetUpMenu.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ESController {

    @RequestMapping(value="")
    @ResponseBody
    public String index() {
        return "MeetUpMenu";
    }

}
