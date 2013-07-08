package org.bouncycastle.crypto.params;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import org.bouncycastle.crypto.CipherParameters;

public class KeyParameter implements CipherParameters {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:46.114 -0400", hash_original_field = "3C6E0B8A9C15224A8228B9A98CA1531D", hash_generated_field = "AEF19C0A7530E140588DCBA91FF66D28")

    private byte[] key;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:46.114 -0400", hash_original_method = "63385B3E5C2FC85A4948D309DD0E5CB6", hash_generated_method = "F26D7FC9289AEBA419B2C1CBF3614608")
    public  KeyParameter(
        byte[]  key) {
        this(key, 0, key.length);
        addTaint(key[0]);
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:46.115 -0400", hash_original_method = "B61F1FEDEF5D4C73DB3CB7494F513C96", hash_generated_method = "EA74635AEB42644AD2A0BE107A425DF1")
    public  KeyParameter(
        byte[]  key,
        int     keyOff,
        int     keyLen) {
        this.key = new byte[keyLen];
        System.arraycopy(key, keyOff, this.key, 0, keyLen);
        addTaint(keyOff);
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:46.115 -0400", hash_original_method = "4D0869BDED080E6228BF118F17313DFD", hash_generated_method = "32CDB00834EE5BCCC134D5D4AB138BB0")
    public byte[] getKey() {
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_1848153888 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_1848153888;
        
        
    }

    
}

