package com.neuedu.util;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;

public class ProductUtil {

    //将字符串类型的日期转位date类型
    public static Date getStringConverseDate(String str){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            java.util.Date parse = sdf.parse(str);
            date = new Date(parse.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    //得到商品id
    public static String getProid(){
        Random random = new Random();
        int i = random.nextInt(100);
        String str = String.valueOf(System.currentTimeMillis());
        if (i < 10){
            str += "0"+i;
        }else {
            str += i;
        }
        return str;
    }
}
