package org.bouncycastle.openssl;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.io.IOException;

public class PasswordException extends IOException {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:47.138 -0400", hash_original_method = "C6899838B1393DC816DA483F96511D69", hash_generated_method = "C013E4B6A962A13D202F4C30483D4CC7")
    public  PasswordException(String msg) {
        super(msg);
        addTaint(msg.getTaint());
        
    }

    
}

