package gov.nist.javax.sip.stack;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.util.EventObject;

public class SIPTransactionErrorEvent extends EventObject {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:46.303 -0400", hash_original_field = "90EF706EA3C5F1087D72CE0C7E7231EE", hash_generated_field = "CA6E243727AC764060BF1536B58E325A")

    private int errorID;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:46.304 -0400", hash_original_method = "09AF95BC0271C57553075E85B6A27865", hash_generated_method = "E1C438E2DDBFF70E02CCA446881D7312")
      SIPTransactionErrorEvent(
        SIPTransaction sourceTransaction,
        int transactionErrorID) {
        super(sourceTransaction);
        errorID = transactionErrorID;
        addTaint(sourceTransaction.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:46.305 -0400", hash_original_method = "0519EBFB6DA70B425C38921D23DA7A64", hash_generated_method = "49F050575769B85408E6A27B5CD63CC3")
    public int getErrorID() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_466790168 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_466790168;
        
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:46.305 -0400", hash_original_field = "25798590644EA207C5693165204FD791", hash_generated_field = "B2919CC93A0DDB9603DD498A1339A398")

    private static final long serialVersionUID = -2713188471978065031L;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:46.305 -0400", hash_original_field = "BF81D754C19758BD2CCDAE0D38378371", hash_generated_field = "2268C740E02F829208E590448FE29A7C")

    public static final int TIMEOUT_ERROR = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:46.305 -0400", hash_original_field = "D2C38C58BF5A048E1CA7F3693A5C8639", hash_generated_field = "4EC86D2082266147845EB0873FB756F7")

    public static final int TRANSPORT_ERROR = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:46.305 -0400", hash_original_field = "3B68DB6C13D55D484C13B6DC9343FCD3", hash_generated_field = "50927BA19A1A6CDE61F8F90E1139E7C4")

    public static final int TIMEOUT_RETRANSMIT = 3;
}

