package org.apache.harmony.kernel.vm;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public final class StringUtils {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.063 -0400", hash_original_method = "9E881C2879A613DB548C02DA2AC20129", hash_generated_method = "FB29FB27CF76117908D2A8FF7E9D0E73")
    private  StringUtils() {
        
    }

    
    @DSModeled(DSC.SAFE)
    public static String combineStrings(Object[] list) {
        int listLength = list.length;
        switch (listLength) {
            case 0: {
                return "";
            }
            case 1: {
                return (String) list[0];
            }
        }
        int strLength = 0;
        for (int i = 0; i < listLength; i++) {
            strLength += ((String) list[i]).length();
        }
        StringBuilder sb = new StringBuilder(strLength);
        for (int i = 0; i < listLength; i++) {
            sb.append(list[i]);
        }
        return sb.toString();
    }

    
}

