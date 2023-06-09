package com.ailab.AiLabDetection;

import com.ailab.AiLabDetection.httpentities.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {

        @RequestMapping(method = RequestMethod.POST,path = "/lang/{language}/logindata")
        public ResponseEntity doLogin(@PathVariable String language,
                @RequestBody LoginRequest loginData ){

            return ResponseEntity.ok(loginData.getEmail()+loginData.getPassword());




    }

}
