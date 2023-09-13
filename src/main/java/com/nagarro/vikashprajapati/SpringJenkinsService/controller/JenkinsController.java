package com.nagarro.vikashprajapati.SpringJenkinsService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class JenkinsController {

    @RequestMapping("/languages")
    public Map<String, Object> getValues() {
        Map<String, Object> data = new HashMap<>();
        data.put("message", "This Jenkins Service API is working fine......");
        data.put("languages", Arrays.asList("JAVA", "C#", "C", "JavaScript", "Python", "Dart"));
        data.put("Frameworks", Arrays.asList("Flutter", "React Native", "Angular"));
        data.put("code", Arrays.asList("😊", "😁", "👍", "✌️"));
        return data;
    }

}
