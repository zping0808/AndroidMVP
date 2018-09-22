package com.zping.mvp.utils;

import java.lang.reflect.ParameterizedType;

/**
*
* 
* @author ZP
* @version V1.0
* @date 2018/9/5 下午8:09   Inc. All rights reserved.
*/
public class CreateUtil {
    public static <T> T getT(Object o, int i) {
        try {

            return ((Class<T>) ((ParameterizedType) (o.getClass().getGenericSuperclass())).getActualTypeArguments()[i]).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}