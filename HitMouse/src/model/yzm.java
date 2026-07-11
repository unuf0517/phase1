package model;

import java.util.Random;

public class yzm {
    public static String yzm(){
        String s="123456789qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
        Random r=new Random();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<4;i++){
            sb.append(s.charAt(r.nextInt(s.length())));
        }
        return sb.toString();
    }
}
