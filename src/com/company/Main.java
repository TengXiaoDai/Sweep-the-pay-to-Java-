package com.company;
import ConvertFactory.Convert;
import DesOrRsaCrapy.DesCrapy;
import DesOrRsaCrapy.RsaCrapy;
import HTTPRequest.HttpHelper;
import InterfaceMessage.*;
import RequestResponseMessage.Request;
import RequestResponseMessage.RequestPicker;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try{
            PublicKey key=RsaCrapy.getPublicKey("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApPZueg1vyDeb9QNGe+RD\n" +
                    "kMWWOINrp7n+6lL8J/FGPsocErVt9BNUoPiRXucyXRsI0aHykZjJltWgzxXMMeVs\n" +
                    "He4R4eb/NiDZf+9Oj9zZL4WbCmbB1iybWut5KEkUC3T81X0ZUJl68CYSCKniuyiq\n" +
                    "7mt5BBh9KCGATVfwgTKQVq+5/MsqPjx3wi0ODAQDf5kZSpBprAK4nRK/CDHwCHwG\n" +
                    "pHty9K56yCQMq6pl5oSrSsiSbSAlXIULnomEVPtU55yAdyCKozd5Gw//JBuANiZs\n" +
                    "p5eIIItaDZuSolsFcIMWJCV1k2GGo4q7yF0wREQo2ohvlhrkNX/aW78qguzQwuQ5\n" +
                    "iQIDAQAB");
            boolean bool= RsaCrapy.CheckSign(key,"MakeOrder1100000015000200a180131183451b132915c58_15173948915R3PSB03".getBytes("GBK"),"Ajm5VKrVlOOMf7 lVEJZACi90pPxuJRhp 3n28bYUYp7SV38ATJT12rwHOB2lWVfzQd1NWLKBG1s0U9eJH54/X2IjPwqP98DXegfDJhzVNp4uX2OQiITbFBuxEh7ZLaUk3A4EFrhZW874Bnh1WTDwoy3gA3s7SWj1MWPrqAaz52qkE/PmCW05d1kcEzpjbbcG05po9BKP4SneA/hp6MDjW9JJano iNSagtHZRI6yNDsgRQy2X 67y0h1cdyukKZym3jnf4i8Lfqc/hQjQ80BtmcpMN6/cwmyc59iMTzRrnC9HYLyriw5h8judZu 7UKZveZKAS0mfnBfI1eoAtFiw==".getBytes("GBK"));
            System.out.println(bool);
        }catch (Exception ex){
           System.out.println(ex.toString());
        }
    }
    public static String GetTimeStamp(){
        Date date=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String str = sdf.format(date);
        return  str;
    }

}
