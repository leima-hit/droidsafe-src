package org.apache.harmony.security.x509;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.harmony.security.asn1.ASN1SequenceOf;
import org.apache.harmony.security.asn1.ASN1Type;
import org.apache.harmony.security.asn1.BerInputStream;

public final class GeneralSubtrees {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.105 -0400", hash_original_field = "E53F856F6B113AD6085151AAADA65843", hash_generated_field = "C2874F586CC3974C74476D82AF1EF2DD")

    private List<GeneralSubtree> generalSubtrees;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.105 -0400", hash_original_field = "84BEA1F0FD2CE16F7E562A9F06EF03D3", hash_generated_field = "ACB189C73E1A6432570001B3B9D3D516")

    private byte[] encoding;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.105 -0400", hash_original_method = "2635B7CAB7F4197126741D8B5E9A6725", hash_generated_method = "C3A2A15D403107D1B4897DD6AE5129D3")
    public  GeneralSubtrees(List<GeneralSubtree> generalSubtrees) {
        this.generalSubtrees = generalSubtrees;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.105 -0400", hash_original_method = "B39087273D015207EFED9684375F7A9C", hash_generated_method = "6B2C1EAC34BF7DBB28FB5A7948997856")
    public List<GeneralSubtree> getSubtrees() {
        List<GeneralSubtree> varB4EAC82CA7396A68D541C85D26508E83_32941002 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_32941002 = generalSubtrees;
        varB4EAC82CA7396A68D541C85D26508E83_32941002.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_32941002;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.106 -0400", hash_original_method = "8CF73AB8FE0E45F61A0A453F52513BE8", hash_generated_method = "D0F39EF9026FE4A35392831C42E14FC8")
    public byte[] getEncoded() {
        {
            encoding = ASN1.encode(this);
        } 
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_1355796961 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_1355796961;
        
        
            
        
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:35.106 -0400", hash_original_field = "0799060D53393B92181BE0F337148C10", hash_generated_field = "E8931CE4F0A844140DFFB6382D546C0B")

    public static final ASN1Type ASN1 = new ASN1SequenceOf(GeneralSubtree.ASN1) {
        @Override public Object getDecodedObject(BerInputStream in) {
            return new GeneralSubtrees((List<GeneralSubtree>) in.content);
        }

        @Override public Collection getValues(Object object) {
            GeneralSubtrees gss = (GeneralSubtrees) object;
            return (gss.generalSubtrees == null)
                    ? new ArrayList<GeneralSubtree>()
                    : gss.generalSubtrees;
        }
    };
    
}

