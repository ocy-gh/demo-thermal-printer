package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrinterController {

    @GetMapping("/printqr")
    public String printqr (Model model){
        String ab = "hoelddddddddddddddd455ddddddddddddddddde";
        model.addAttribute("a",ab);
        return "printQR";
    }

    @GetMapping("/airwaybill")
    public String printAWB (){

        return "printAWB";
    }

//    @PostMapping("/print")
//    @ResponseBody
//    public JSONObject print(@RequestBody JSONObject requestBodyJO){
//        System.out.println("****************************");
//        System.out.println(requestBodyJO.toString());
//
////        model.addAttribute("requestBodyJO", requestBodyJO);
//        return requestBodyJO;
//    }
}
