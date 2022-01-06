package com.company;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

public class EnumUnit {

    private static HashMap<Class<?>,HashMap<String,String>> _hsDescription=new HashMap<>();

    public  static  String GetEnumDescription(Enum val)
    {
        Class<?> type=val.getClass();
        String key= val.name();

        HashMap<String,String> map=_hsDescription.get(type);
        if(map==null)
        {
            map=InitEnumInfo(type);
        }

        return map.get(key);
    }

    public  static HashMap<String,String> InitEnumInfo(Class<?> type)
    {

        HashMap<String,String> hs=new HashMap<String,String>();
        Field[] fields= type.getFields();

        String description=null;
        String key=null;

        for (Field thisField:fields) {

            DescriptionInfo methodAnnotation = thisField.getAnnotation(DescriptionInfo.class);
            if(methodAnnotation==null)
            {
                continue;
            }
            description=methodAnnotation.Remark();
            key=thisField.getName();
            hs.put(key,description);
        }
        _hsDescription.putIfAbsent(type,hs);
        return hs;
    }
}
