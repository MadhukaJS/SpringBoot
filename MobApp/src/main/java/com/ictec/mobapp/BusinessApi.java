package com.ictec.mobapp;

import com.ictec.mobapp.entities.Business;
import com.ictec.mobapp.entities.address;
import com.ictec.mobapp.entities.location;
import com.ictec.mobapp.repo.BusinessRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Api")
public class BusinessApi {

    @Autowired
    private BusinessRepo repo;

    //we can use autowired methos or this.repo methd.
    //prefered is autowired
//    BusinessApi(BusinessRepo repo){
//        this.repo=repo;
//    }

    @GetMapping("/show")
    public ResponseEntity<Business> showbusiness() {
        Business b = new Business();
        b.setName("");
        b.setPhone("071454643");

        address a = new address();
        a.setLine_one("cax");
        a.setLine_two("qxwxw");
        b.setAdd(a);


        location l = new location();

        l.setLine_1("1.2344");
        l.setLine_2("2.45");
        b.setLoc(l);

        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(b);

    }

    @PostMapping("/business")
    public ResponseEntity<Business> savebusinness(@RequestBody Business b) {
        b = this.repo.save(b);
        return ResponseEntity.ok().body(b);

    }

}
