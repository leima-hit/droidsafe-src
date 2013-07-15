package org.bouncycastle.asn1;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.io.IOException;

public class BERSetParser implements ASN1SetParser {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:43.170 -0400", hash_original_field = "5431B8D4D4E17964894E609DD0DF69C0", hash_generated_field = "76949B28A5103E4F545C65F9E6322200")

    private ASN1StreamParser _parser;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:43.171 -0400", hash_original_method = "EF8530238239035799CD0A162B856113", hash_generated_method = "3CBB13114A6B7C956C1CC85AC277075B")
      BERSetParser(ASN1StreamParser parser) {
        this._parser = parser;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:43.171 -0400", hash_original_method = "C77FFAC7A6753577CB275ABB55D17A64", hash_generated_method = "71BBAD930E1D306036D7314DD265F09A")
    public DEREncodable readObject() throws IOException {
        DEREncodable varB4EAC82CA7396A68D541C85D26508E83_782977963 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_782977963 = _parser.readObject();
        varB4EAC82CA7396A68D541C85D26508E83_782977963.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_782977963;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:43.172 -0400", hash_original_method = "1B045C000E117296EF92C9846060EDEF", hash_generated_method = "3605A29DCE77A875FF06A8EB97B7C497")
    public DERObject getLoadedObject() throws IOException {
        DERObject varB4EAC82CA7396A68D541C85D26508E83_969850999 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_969850999 = new BERSet(_parser.readVector(), false);
        varB4EAC82CA7396A68D541C85D26508E83_969850999.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_969850999;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:43.172 -0400", hash_original_method = "C25B7E6814F316F8AC8F55D830DF862A", hash_generated_method = "414C46611C158F799120C4E00FBA171B")
    public DERObject getDERObject() {
        DERObject varB4EAC82CA7396A68D541C85D26508E83_190294371 = null; 
        try 
        {
            varB4EAC82CA7396A68D541C85D26508E83_190294371 = getLoadedObject();
        } 
        catch (IOException e)
        {
            if (DroidSafeAndroidRuntime.control) throw new ASN1ParsingException(e.getMessage(), e);
        } 
        varB4EAC82CA7396A68D541C85D26508E83_190294371.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_190294371;
        
        
        
            
        
        
        
            
        
    }

    
}

