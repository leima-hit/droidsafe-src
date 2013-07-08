package javax.security.auth.callback;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public class UnsupportedCallbackException extends Exception {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.783 -0400", hash_original_field = "924A8CEEAC17F54D3BE3F8CDF1C04EB2", hash_generated_field = "1B1600DBF2D274518D5E0379C95B483E")

    private Callback callback;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.784 -0400", hash_original_method = "6F64A91CCA6DECE8990E118F6F2706F6", hash_generated_method = "D0D2AF18505AA576BB4AA2E2936C7D6B")
    public  UnsupportedCallbackException(Callback callback) {
        this.callback = callback;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.784 -0400", hash_original_method = "E54A6FA33A5BFCD773DCE92A09F71FE9", hash_generated_method = "5FCD1F7CCAD84C9DACAD33A9C7D63603")
    public  UnsupportedCallbackException(Callback callback, String message) {
        super(message);
        this.callback = callback;
        addTaint(message.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.784 -0400", hash_original_method = "C52CB6D8F1111BAF8BAA5D6F66319767", hash_generated_method = "29360BAD49C42B95952E5BB80D12112D")
    public Callback getCallback() {
        Callback varB4EAC82CA7396A68D541C85D26508E83_493065021 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_493065021 = callback;
        varB4EAC82CA7396A68D541C85D26508E83_493065021.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_493065021;
        
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.785 -0400", hash_original_field = "8EAB790C17550FAD68CD57E527710DAC", hash_generated_field = "FC86D54941A45B4F0C0B942F5184732A")

    private static final long serialVersionUID = -6873556327655666839L;
}

