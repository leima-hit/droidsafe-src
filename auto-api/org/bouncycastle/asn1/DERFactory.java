package org.bouncycastle.asn1;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

class DERFactory {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:43.408 -0400", hash_original_method = "2DA71B0AE496B3C2B80EF0106AA885B2", hash_generated_method = "2DA71B0AE496B3C2B80EF0106AA885B2")
    public DERFactory ()
    {
        
    }


    static DERSequence createSequence(ASN1EncodableVector v) {
        return v.size() < 1 ? EMPTY_SEQUENCE : new DERSequence(v);
    }

    
    static DERSet createSet(ASN1EncodableVector v) {
        return v.size() < 1 ? EMPTY_SET : new DERSet(v);
    }

    
    static DERSet createSet(ASN1EncodableVector v, boolean needsSorting) {
        return v.size() < 1 ? EMPTY_SET : new DERSet(v, needsSorting);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:43.409 -0400", hash_original_field = "5FE057ABAE8DA18326FA833B2A9362EB", hash_generated_field = "8DB0FE673D2D50C4769908D74217CDFF")

    static final DERSequence EMPTY_SEQUENCE = new DERSequence();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:43.409 -0400", hash_original_field = "BFE8F76F7E1EACC720D86BB88FDEACE4", hash_generated_field = "FEBB06D705F432CF8A0E56C80DA23C00")

    static final DERSet EMPTY_SET = new DERSet();
}

