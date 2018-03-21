package ConvertFactory;
import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;


public class Convert {
    public static<T> String SerializeObject(T t)throws Exception{
        Gson gson=new Gson();
        return  gson.toJson(t);
    }
    public static<T> T DeserializeObject(String data,Class<T> clazz)throws Exception{
        Gson gson=new Gson();
        return gson.fromJson(data,clazz);
    }
}
