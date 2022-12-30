
package com.PortArg.demo.controller;


import com.PortArg.demo.Dto.LoginDto;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
   @Autowired
    private AuthenticationManager authenticationManager;
    
   // @CrossOrigin(origins = "http://localhost:4200/iniciar-sesion ")
    @PostMapping("/signin")
    public ResponseEntity<Map<String, String>> authenticateUser(@RequestBody LoginDto loginDto){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDto.getEmail(), loginDto.getPassword()));
        
        SecurityContextHolder.getContext().setAuthentication(authentication);
        
         try {
        Map<String, String> body = new HashMap<>();
        body.put("message", "A iniciado sesión correctamente");
        return new ResponseEntity<>(body, HttpStatus.OK);
    } catch (Exception e) {
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    
    }
    }
    
}
