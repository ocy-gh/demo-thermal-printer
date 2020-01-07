package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
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

    @GetMapping("/check")
    public String check (){

        return "checkLodop";
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
