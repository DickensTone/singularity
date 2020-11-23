package com.dareway.controller;

import com.dareway.model.SqlFace;
import com.dareway.service.SqlMagicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @Autowired
    private SqlMagicService sqlMagic;

    @GetMapping("/getSqlFromJava")
    public SqlFace getSqlFromJava(@RequestBody String str){
        SqlFace sqlFace = sqlMagic.doConversion(str);
        return sqlFace;
    }
}
