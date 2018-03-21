package DesOrRsaCrapy;
import sun.misc.BASE64Decoder;
import sun.security.pkcs.PKCS7;

import java.security.*;
import javax.crypto.Cipher;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class RsaCrapy {
    private RsaCrapy(){

    }
    public static boolean CheckSign(PublicKey key,byte[] data,byte[] SignData)throws Exception
    {
       Base64.Decoder decoder=Base64.getDecoder();
       Signature signature=Signature.getInstance("SHA256WithRSA");
       signature.initVerify(key);
       signature.update(data);
       return signature.verify(decoder.decode(SignData));
    }
    public static String Sign(PrivateKey key,byte[] Context)throws Exception
    {
        Base64.Encoder encoder=Base64.getEncoder();
        Signature signature=Signature.getInstance("SHA256WithRSA");
        signature.initSign(key);
        signature.update(Context);
        byte[] result=signature.sign();
        return encoder.encodeToString(result);
    }
    public static String RsaDecrapy(byte[] context,PrivateKey key)throws Exception
    {
        Base64.Decoder decoder=Base64.getDecoder();
        KeyFactory keyFactory=KeyFactory.getInstance("RSA");
        Cipher cipher=Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.DECRYPT_MODE,key);
        String str=new String(cipher.doFinal(decoder.decode(context)),"GBK");
        return  str;
    }
    public static String RsaEnCrapy(byte[] content,PublicKey key) throws Exception {
        Base64.Encoder encoder=Base64.getEncoder();
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return encoder.encodeToString(cipher.doFinal(content));
    }
    public static PublicKey getPublicKey(String key) throws Exception {
        byte[] keyBytes;
        keyBytes = (new BASE64Decoder()).decodeBuffer(key);
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(keySpec);
        return publicKey;
    }
    public static PrivateKey getPrivateKey(String key) throws Exception {
        byte[] keyBytes;
        keyBytes = (new BASE64Decoder()).decodeBuffer(key);
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PrivateKey privateKey = keyFactory.generatePrivate(keySpec);
        return privateKey;
    }
}
