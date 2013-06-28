package org.apache.http.impl.client;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.HttpResponseException;
import org.apache.http.util.EntityUtils;

public class BasicResponseHandler implements ResponseHandler<String> {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.009 -0400", hash_original_method = "2E943129A9E8C0C10C42D984806E844A", hash_generated_method = "2E943129A9E8C0C10C42D984806E844A")
    public BasicResponseHandler ()
    {
        //Synthesized constructor
    }


    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.009 -0400", hash_original_method = "2A5E0F0DC068B1165A25576DA590B50A", hash_generated_method = "62F76D2A65F0B482755DE3E3FF6F701F")
    public String handleResponse(final HttpResponse response) throws HttpResponseException, IOException {
        String varB4EAC82CA7396A68D541C85D26508E83_1539487901 = null; //Variable for return #1
        StatusLine statusLine = response.getStatusLine();
        {
            boolean var671AB37434617BE9B4905D18AB773F2F_1911629536 = (statusLine.getStatusCode() >= 300);
            {
                if (DroidSafeAndroidRuntime.control) throw new HttpResponseException(statusLine.getStatusCode(),
                    statusLine.getReasonPhrase());
            } //End block
        } //End collapsed parenthetic
        HttpEntity entity = response.getEntity();
        varB4EAC82CA7396A68D541C85D26508E83_1539487901 = entity == null ? null : EntityUtils.toString(entity);
        addTaint(response.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1539487901.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1539487901;
        // ---------- Original Method ----------
        //StatusLine statusLine = response.getStatusLine();
        //if (statusLine.getStatusCode() >= 300) {
            //throw new HttpResponseException(statusLine.getStatusCode(),
                    //statusLine.getReasonPhrase());
        //}
        //HttpEntity entity = response.getEntity();
        //return entity == null ? null : EntityUtils.toString(entity);
    }

    
}

