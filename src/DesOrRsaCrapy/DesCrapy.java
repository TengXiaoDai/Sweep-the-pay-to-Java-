package DesOrRsaCrapy;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.SecureRandom;
import java.util.Base64;

public  class DesCrapy {
    //Des加密
    public static String desCrypto(byte[] datasource, String password) {
        try{
            Base64.Encoder encoder=Base64.getEncoder();
            SecureRandom random = new SecureRandom();
            DESKeySpec desKey = new DESKeySpec(password.getBytes());
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey securekey = keyFactory.generateSecret(desKey);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, securekey, random);
            return encoder.encodeToString(cipher.doFinal(datasource));
        }catch(Throwable e){
            e.printStackTrace();
        }
        return null;
    }
    //Des解密
    public  static  byte[]  DesDeCrapy(String key,String Data)throws Exception
     {
         Base64.Decoder decoder=Base64.getDecoder();
         byte[] data=decoder.decode(Data);
         SecureRandom random = new SecureRandom();
         DESKeySpec desKey = new DESKeySpec(key.getBytes());
         SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
         SecretKey securekey = keyFactory.generateSecret(desKey);
         Cipher cipher = Cipher.getInstance("DES");
         cipher.init(Cipher.DECRYPT_MODE, securekey, random);
         return  cipher.doFinal(data);
     }
}
