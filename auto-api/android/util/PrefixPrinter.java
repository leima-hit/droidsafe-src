package android.util;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public class PrefixPrinter implements Printer {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:52.511 -0400", hash_original_field = "0A6BD3F4038C8E8F2B4B9D349A6605FD", hash_generated_field = "68E1840BE1EE0E08368BEA594CC31769")

    private Printer mPrinter;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:52.511 -0400", hash_original_field = "6282EC034DB97CFBE606BDA5F72C1945", hash_generated_field = "6FD96CD8096FFCAC99571AB291EA06B9")

    private String mPrefix;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:52.512 -0400", hash_original_method = "F8CFF4B37C5F46A6632B10286A6992AD", hash_generated_method = "22BDD1FC37978C0870ED7EF0016E7749")
    private  PrefixPrinter(Printer printer, String prefix) {
        mPrinter = printer;
        mPrefix = prefix;
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    public static Printer create(Printer printer, String prefix) {
        if (prefix == null || prefix.equals("")) {
            return printer;
        }
        return new PrefixPrinter(printer, prefix);
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:52.512 -0400", hash_original_method = "278C97F139303CC78C423B9DD8BE836F", hash_generated_method = "0A498B33EE1928C8C383EDCE8E73B35A")
    public void println(String str) {
        mPrinter.println(mPrefix + str);
        addTaint(str.getTaint());
        
        
    }

    
}

