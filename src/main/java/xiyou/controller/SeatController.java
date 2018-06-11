package xiyou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import xiyou.service.impl.WebSeatServiceImpl;

@CrossOrigin
@Controller
public class SeatController {
    @Autowired
    WebSeatServiceImpl webSeatService;

    @RequestMapping("/toseat")
    public String toseat(){
        return "seat";
    }
}
