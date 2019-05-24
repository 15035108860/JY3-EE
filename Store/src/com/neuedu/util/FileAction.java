package com.neuedu.util;

import javax.servlet.http.Part;
import java.io.*;
import java.util.UUID;

/**
 * 上传图片工具类
 * */
public class FileAction {

    public static String uploadFile(Part part){
        String submittedFileName = part.getSubmittedFileName();
        InputStream inputStream = null;
        OutputStream os = null;
        UUID uuid = UUID.randomUUID();
        String name = uuid+submittedFileName;
        try {
            inputStream = part.getInputStream();
            os = new FileOutputStream("F:\\files\\"+name);
            int buffer = 0;
            byte[] bs = new byte[1024];
            while ((buffer = inputStream.read(bs))!=-1){

                os.write(bs,0,buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return name;

    }
}
