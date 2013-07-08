package libcore.io;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;

public final class StructTimeval {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:28.510 -0400", hash_original_field = "A65B042F30CAE0D134F96C10EC496FB7", hash_generated_field = "2551EFE5101A37E7C85A5BFE55D02013")

    public long tv_sec;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:28.510 -0400", hash_original_field = "73B168672D39761C8FCC534E4BA40D5F", hash_generated_field = "F91E150980001C89401E423DD993ED18")

    public long tv_usec;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:28.510 -0400", hash_original_method = "2F5BA123079D794DD3CCFA1F00DAAB1E", hash_generated_method = "42769DF311439066BE5B81919D5EE4CF")
    private  StructTimeval(long tv_sec, long tv_usec) {
        this.tv_sec = tv_sec;
        this.tv_usec = tv_usec;
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    public static StructTimeval fromMillis(long millis) {
        long tv_sec = millis / 1000;
        long tv_usec = (millis - (tv_sec * 1000)) * 1000;
        return new StructTimeval(tv_sec, tv_usec);
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:28.511 -0400", hash_original_method = "D7D8FCD49C11BCD20431CC831BF1CCDC", hash_generated_method = "23280047FF266B73CBD0B30BC665D470")
    public long toMillis() {
        long var0F5264038205EDFB1AC05FBB0E8C5E94_1426884787 = getTaintLong();
        return var0F5264038205EDFB1AC05FBB0E8C5E94_1426884787;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:28.511 -0400", hash_original_method = "0C66DEC6052711C5671EFCEF17FE1D94", hash_generated_method = "274BA490C186393B1238F5B1214EBB91")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_2070688844 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_2070688844 = "StructTimeval[tv_sec=" + tv_sec + ",tv_usec=" + tv_usec + "]";
        varB4EAC82CA7396A68D541C85D26508E83_2070688844.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_2070688844;
        
        
    }

    
}

