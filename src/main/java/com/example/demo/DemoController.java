package com.example.demo;


import com.example.demo.entity.Rsvn;
import com.example.demo.service.RsvnService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    RsvnService rsvnService;
    
    @GetMapping("/")
    //public  List<Rsvn> index(){

        public  Rsvn index(){
        var obj= rsvnService.get();
        return obj;



        //Integer x = com.delisoft.exam.MyUtil.sum(10, 30);
        
        //return "hello world "+x.toString();
    }
}
