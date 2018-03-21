package RequestResponseMessage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Request {
    private RequestPicker _Picker;
    public Request(RequestPicker picker){
      this._Picker=picker;
    }
    public Map<String,String>GetRequestString()throws Exception{
        Map<String,String> map=new HashMap<String,String>();
        Field[] fields= _Picker.getClass().getDeclaredFields();
        for (int i=0;i<fields.length;i++){
            String Name=fields[i].getName();
            Name = Name.substring(0, 1).toUpperCase() + Name.substring(1);
            Method m =  _Picker.getClass().getMethod("get"+Name);
            String value = (String) m.invoke(_Picker);
            map.put(Name,value);
        }
        return map;
    }
}
