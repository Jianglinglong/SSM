package com.jiang.ssm.utils;

import java.util.Collection;

public class CollectionUtils {
    public static boolean isEmpty(Collection collection){
        if (collection!=null && collection.size()>0){
            return false;
        }
        return true;
    }
}
