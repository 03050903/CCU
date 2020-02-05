package com.chen.ccu.util;

import java.util.Collection;

/**
 * collection的工具类
 */
public class CollectionUtils {
    /**
     * 判断collection是否是null或者size为0
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection collection){
        if (collection==null||collection.size()==0){
            return true;
        }
        return false;
    }
}
