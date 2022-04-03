package demo.aihomepage.controller;

import demo.aihomepage.S3Uploader;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class WebController {
    private final S3Uploader s3Uploader;


    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("data") MultipartFile multipartFile, Model model) throws IOException {
        return s3Uploader.upload(multipartFile, "static");
    }
}

