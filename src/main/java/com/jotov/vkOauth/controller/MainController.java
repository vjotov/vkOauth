package com.jotov.vkOauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping("/main")
public class MainController {
//    public List<Map<String, String>> messages = new ArrayList<Map<String, String>>() {{
//        add(new HashMap<String, String>() {{ put("id", "1"); put("text", "First element"); }});
//        add(new HashMap<String, String>() {{ put("id", "2"); put("text", "Second element"); }});
//        add(new HashMap<String, String>() {{ put("id", "3"); put("text", "Third element"); }});
//    }};

//    @GetMapping
//    public List<Map<String, String>> list() {
//        return messages;
//    }
    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }
}
