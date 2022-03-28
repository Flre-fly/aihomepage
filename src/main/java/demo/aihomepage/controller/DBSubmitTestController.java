package demo.aihomepage.controller;

import demo.aihomepage.VO.myTextVO;
import demo.aihomepage.repository.DBSubmitTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class DBSubmitTestController {

    @Autowired
    private DBSubmitTestRepository repository;

    @PostMapping
    public String sumbitDB(@RequestParam("editorHtml") String text){
        System.out.println("---------");
        System.out.println(text);
        return "index";
    }



}
