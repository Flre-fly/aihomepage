package demo.aihomepage.controller;

import demo.aihomepage.VO.myTextVO;
import demo.aihomepage.entity.myText;
import demo.aihomepage.repository.DBSubmitTestRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
public class DBSubmitTestController {

    @Autowired
    private DBSubmitTestRepository repository;

    @PostMapping("/submit")
    public String sumbitDB(@ModelAttribute myTextVO text){
        myText mytext = new myText();
        mytext.setText(text.getText());
        repository.save(mytext);

        return "redirect:/";
    }



}
