package org.example.pharmasy.controller;

import org.example.pharmasy.domain.Message;
import org.example.pharmasy.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo")
public class MyController {

    @Autowired
    private MessageRepository messageRepository;

    @PostMapping(path="/add")
    public @ResponseBody
    String addNewMessage (@RequestParam String text
            , @RequestParam String tag) {

        Message message = new Message();
        message.setText(text);
        message.setTag(tag);
        messageRepository.save(message);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Message> getAllUsers() {

        return messageRepository.findAll();
    }
}
