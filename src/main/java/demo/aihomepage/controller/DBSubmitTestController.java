package demo.aihomepage.controller;

import demo.aihomepage.VO.myTextVO;
import demo.aihomepage.repository.DBSubmitTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping
public class DBSubmitTestController {

    @Autowired
    private DBSubmitTestRepository repository;

    @PostMapping("/submit")
    public myTextVO sumbitDB(myTextVO text){
        System.out.println(text);
        System.out.println(text.getText());
        //return "redirect:/";
        return text;
    }



}
