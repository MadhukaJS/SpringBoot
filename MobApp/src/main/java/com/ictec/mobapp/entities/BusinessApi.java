package com.ictec.mobapp.entities;

import com.ictec.mobapp.Business;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Api")
public class BusinessApi {

    @GetMapping("/show")
    public ResponseEntity<Business> showbusiness(){


}
