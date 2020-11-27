package com.dareway.controller;

import com.dareway.model.SqlFace;
import com.dareway.service.SqlMagicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommonController {

    @Autowired
    private SqlMagicService sqlMagic;

    @CrossOrigin
    @PostMapping("/getSqlFromJava")
    public SqlFace getSqlFromJava(@RequestBody String str){
        SqlFace sqlFace = sqlMagic.doConversion(str);
        return sqlFace;
    }

    @CrossOrigin
    @GetMapping("/test")
    public String test(){

        return "sucess";
    }
}