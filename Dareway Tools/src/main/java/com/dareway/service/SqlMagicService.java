package com.dareway.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dareway.model.SqlFace;
import org.springframework.stereotype.Service;

@Service
public class SqlMagicService {

    private SqlFace sqlFace = new SqlFace();
    public void covertJavaToSql(){
        String str = sqlFace.getOrigin();
        String replace = sqlFace.getReplace();
        String sql = str.replaceAll("de.addSql\\(\"","")
                .replaceAll("this.","")
                .replaceAll("si3c.","si3c3306.")
                .replaceAll("nvl","ifnull")
                .replaceAll("\"\\);", "");
        sqlFace.setJava(str);
        sqlFace.setSql(sql);
    }

    public SqlFace doConversion(String jsonpara) {
        JSONObject jsonObject = (JSONObject) JSON.parse(jsonpara);
        String method = jsonObject.getString("method");
        String covertStr = jsonObject.getJSONObject("data").getString("str");

        if(method.equals("toSQL")){
            sqlFace.setOrigin(covertStr);
            this.covertJavaToSql();
        }

        return sqlFace;
    }
}
