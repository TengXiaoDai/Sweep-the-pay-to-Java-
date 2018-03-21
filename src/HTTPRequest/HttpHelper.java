package HTTPRequest;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import javax.xml.crypto.Data;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class HttpHelper {
    public static String HttpPostMethod(String Url, Map<String,String>params,String Charset)throws Exception{
        CloseableHttpClient client= HttpClients.createDefault();
        CloseableHttpResponse response=null;
        HttpPost post=new HttpPost(Url);
        List<NameValuePair>nvps=new ArrayList<NameValuePair>();
        for (String name:params.keySet()){
            nvps.add(new BasicNameValuePair(name,params.get(name)));
        }
        String RetString=null;
        try {
            post.setEntity(new UrlEncodedFormEntity(nvps,Charset));
          response=client.execute(post);
          HttpEntity entity=response.getEntity();
          RetString=new String(EntityUtils.toString(entity,Charset)) ;
        }catch (Exception ex){
        }finally {
            response.close();
        }
return RetString;
}
}
