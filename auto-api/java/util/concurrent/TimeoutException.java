package java.util.concurrent;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;

// import Iterator to deal with enhanced for loop translation
import java.util.Iterator;


public class TimeoutException extends Exception {
    private static final long serialVersionUID = 1900926677490660714L;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:14.089 -0400", hash_original_method = "043D89A921444ACFFC25D3711EECF0CA", hash_generated_method = "4EA2613A0F445110E8CABA8BA75CE11D")
    @DSModeled(DSC.SAFE)
    public TimeoutException() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:14.090 -0400", hash_original_method = "D54DDC72729A014BD7698825D7BF2D5A", hash_generated_method = "9699F38F38824EE7DBD724EA00A42538")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public TimeoutException(String message) {
        super(message);
        dsTaint.addTaint(message);
        // ---------- Original Method ----------
    }

    
}


