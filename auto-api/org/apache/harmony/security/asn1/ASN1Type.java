package org.apache.harmony.security.asn1;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;
import java.io.InputStream;

public abstract class ASN1Type implements ASN1Constants {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.675 -0400", hash_original_field = "B80BB7740288FDA1F201890375A60C8F", hash_generated_field = "FA0A3841DE31A9B4AD2F31B3665056D8")

    public int id;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.675 -0400", hash_original_field = "3F529AE098CE9C8443C9E279609AEE18", hash_generated_field = "24E4DDF4395B1AE964B45B713C719F1F")

    public int constrId;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.675 -0400", hash_original_method = "E753351671CF761070C01803DBBE0A73", hash_generated_method = "763C5C08EEE9DC836BBB64D168C02191")
    public  ASN1Type(int tagNumber) {
        this(CLASS_UNIVERSAL, tagNumber);
        addTaint(tagNumber);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.676 -0400", hash_original_method = "C924F9DEBC46E3FF1C759C2A69F62440", hash_generated_method = "E3C957A296E8B789E1477360DAB1BEED")
    public  ASN1Type(int tagClass, int tagNumber) {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("tagNumber < 0");
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("invalid tagClass");
        } //End block
        {
            this.id = tagClass + tagNumber;
        } //End block
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("tag long form not implemented");
        } //End block
        this.constrId = this.id + PC_CONSTRUCTED;
        // ---------- Original Method ----------
        //if (tagNumber < 0) {
            //throw new IllegalArgumentException("tagNumber < 0");
        //}
        //if (tagClass != CLASS_UNIVERSAL && tagClass != CLASS_APPLICATION
                //&& tagClass != CLASS_CONTEXTSPECIFIC
                //&& tagClass != CLASS_PRIVATE) {
            //throw new IllegalArgumentException("invalid tagClass");
        //}
        //if (tagNumber < 31) {
            //this.id = tagClass + tagNumber;
        //} else {
            //throw new IllegalArgumentException("tag long form not implemented");
        //}
        //this.constrId = this.id + PC_CONSTRUCTED;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.676 -0400", hash_original_method = "DD7F9B0A8E4884CD611E54C95FCD3DA3", hash_generated_method = "0AA30F7637D72DED8D9190444C1CB871")
    public final Object decode(byte[] encoded) throws IOException {
        Object varB4EAC82CA7396A68D541C85D26508E83_1892142975 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1892142975 = decode(new DerInputStream(encoded));
        addTaint(encoded[0]);
        varB4EAC82CA7396A68D541C85D26508E83_1892142975.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1892142975;
        // ---------- Original Method ----------
        //return decode(new DerInputStream(encoded));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.677 -0400", hash_original_method = "F94AEF08BB5C9E1C82DE4BF1B9366E55", hash_generated_method = "1CB0BD92834D9E14D43522F1AA4B84E8")
    public final Object decode(byte[] encoded, int offset, int encodingLen) throws IOException {
        Object varB4EAC82CA7396A68D541C85D26508E83_1579837372 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1579837372 = decode(new DerInputStream(encoded, offset, encodingLen));
        addTaint(encoded[0]);
        addTaint(offset);
        addTaint(encodingLen);
        varB4EAC82CA7396A68D541C85D26508E83_1579837372.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1579837372;
        // ---------- Original Method ----------
        //return decode(new DerInputStream(encoded, offset, encodingLen));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.677 -0400", hash_original_method = "602847E19184C464832C69984B020DF7", hash_generated_method = "42B7BD40EC63B66D78112EA01095A97F")
    public final Object decode(InputStream in) throws IOException {
        Object varB4EAC82CA7396A68D541C85D26508E83_696233129 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_696233129 = decode(new DerInputStream(in));
        addTaint(in.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_696233129.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_696233129;
        // ---------- Original Method ----------
        //return decode(new DerInputStream(in));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.677 -0400", hash_original_method = "CCC5058B0D0F74ECE196C136FC714A4E", hash_generated_method = "F6442375C45762291607B013C0FA359B")
    public final void verify(byte[] encoded) throws IOException {
        DerInputStream decoder = new DerInputStream(encoded);
        decoder.setVerify();
        decode(decoder);
        addTaint(encoded[0]);
        // ---------- Original Method ----------
        //DerInputStream decoder = new DerInputStream(encoded);
        //decoder.setVerify();
        //decode(decoder);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.678 -0400", hash_original_method = "8A3EDFD20917FC2A32E2E1C169001F91", hash_generated_method = "F8C50D2350F02C36ED0A465961D5A665")
    public final void verify(InputStream in) throws IOException {
        DerInputStream decoder = new DerInputStream(in);
        decoder.setVerify();
        decode(decoder);
        addTaint(in.getTaint());
        // ---------- Original Method ----------
        //DerInputStream decoder = new DerInputStream(in);
        //decoder.setVerify();
        //decode(decoder);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.678 -0400", hash_original_method = "53BC043E630E35D0E0B116BF28EF4348", hash_generated_method = "4D249B4575C651EFE7E6C5D066C627F3")
    public final byte[] encode(Object object) {
        DerOutputStream out = new DerOutputStream(this, object);
        addTaint(object.getTaint());
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_1120423097 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_1120423097;
        // ---------- Original Method ----------
        //DerOutputStream out = new DerOutputStream(this, object);
        //return out.encoded;
    }

    
    public abstract Object decode(BerInputStream in) throws IOException;

    
    public abstract boolean checkTag(int identifier);

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.678 -0400", hash_original_method = "C98349FCBC509D9B5E2186CE1C87C57F", hash_generated_method = "36D8D0DBFE153E9423EFA4879EE51F95")
    protected Object getDecodedObject(BerInputStream in) throws IOException {
        Object varB4EAC82CA7396A68D541C85D26508E83_2109154481 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2109154481 = in.content;
        addTaint(in.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_2109154481.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2109154481;
        // ---------- Original Method ----------
        //return in.content;
    }

    
    public abstract void encodeASN(BerOutputStream out);

    
    public abstract void encodeContent(BerOutputStream out);

    
    public abstract void setEncodingContent(BerOutputStream out);

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.679 -0400", hash_original_method = "FA7F24CC02CDE7C91DB883C7C7C15F71", hash_generated_method = "26236998063BC70AD56B408213F73C82")
    public int getEncodedLength(BerOutputStream out) {
        int len = 1;
        {
            {
                int cur = out.length >> 8;
                {
                    cur = cur >> 8;
                } //End block
            } //End collapsed parenthetic
        } //End block
        len += out.length;
        addTaint(out.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_696336727 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_696336727;
        // ---------- Original Method ----------
        //int len = 1;
        //len++;
        //if (out.length > 127) {
            //len++;
            //for (int cur = out.length >> 8; cur > 0; len++) {
                //cur = cur >> 8;
            //}
        //}
        //len += out.length;
        //return len;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:33.680 -0400", hash_original_method = "54C9519AE58EE8A367BF831B5FC731FF", hash_generated_method = "8F6320417FF737C342F1858EB47B9EBD")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_374801416 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_374801416 = getClass().getName() + "(tag: 0x" + Integer.toHexString(0xff & this.id) + ")";
        varB4EAC82CA7396A68D541C85D26508E83_374801416.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_374801416;
        // ---------- Original Method ----------
        //return getClass().getName() + "(tag: 0x" + Integer.toHexString(0xff & this.id) + ")";
    }

    
}

