package com.ictec.mobapp;

import com.ictec.mobapp.entities.Business;
import com.ictec.mobapp.entities.address;
import com.ictec.mobapp.entities.location;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @RequestMapping(method = RequestMethod.POST,path = "/lang/{language}/logindata")
    public ResponseEntity doLogin(@PathVariable String language,
                                  @RequestBody LoginRequest loginData ) {

        return ResponseEntity.ok(loginData.getEmail() + loginData.getPassword());
    }


        @GetMapping("/show")
        public ResponseEntity<Business> showbusiness(){
            Business b=new Business();
            b.setName("");
            b.setPhone("071454643");

            address a=new address();
            a.setLine_one("cax");
            a.setLine_two("qxwxw");
            b.setAdd(a);


            location l=new location();

            l.setLine_1("1.2344");
            l.setLine_2("2.45");
            b.setLoc(l);

            return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(b);




        }
    }

