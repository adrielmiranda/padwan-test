package com.padwan.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AdrielService {

    public List<String> skills(){
        List<String> skills = new ArrayList<>();
        skills.add("HTML");
        skills.add("CSS");
        skills.add("JAVA");
        skills.add("SPRING BOOT");
        skills.add("ANGULAR");
        skills.add("REACT");
        skills.add("SQL");
        return skills;
    }
    
}