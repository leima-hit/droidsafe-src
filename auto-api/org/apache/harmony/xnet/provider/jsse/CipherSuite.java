package org.apache.harmony.xnet.provider.jsse;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.security.GeneralSecurityException;
import java.util.Hashtable;
import javax.crypto.Cipher;

public class CipherSuite {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.750 -0400", hash_original_field = "CC6F6F66788638B9CE162A8016D9F45F", hash_generated_field = "31167280C241F9B17D639631F29E89F8")

    boolean supported = true;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.750 -0400", hash_original_field = "FEAC6633BEDFBC4AC4773516EA8E93FD", hash_generated_field = "FAA04C329C3BBD40436514A0BFECF651")

    int keyExchange;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.750 -0400", hash_original_field = "280FA711B12D488436B7CDCBFB2543FC", hash_generated_field = "646723EE143F971BA7CBBEF15A14B911")

    String authType;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.750 -0400", hash_original_field = "817CF575E42922F70648E318DCCF300A", hash_generated_field = "D7A4AB7796DE7F7B5F28166BAC9CA14D")

    String cipherName;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.750 -0400", hash_original_field = "A5082972924409D0A29F908314B43554", hash_generated_field = "1B9CA4D35CF052E34AE02D26B8639B41")

    int keyMaterial;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.750 -0400", hash_original_field = "624D654218E7641AE6377DBEDC962CF2", hash_generated_field = "82AAF67303DF25D146F91143FBDDD6E8")

    int expandedKeyMaterial;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.750 -0400", hash_original_field = "04AE2243EED3D14897D0F0072BEC9A06", hash_generated_field = "4CBDA801C187B4605E64F46AEA891A1A")

    int effectiveKeyBytes;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.750 -0400", hash_original_field = "6D60C4F537C75876721CE7A83E7E2D52", hash_generated_field = "159387C23F190CC3FE94572A49B7E04B")

    int ivSize;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.750 -0400", hash_original_field = "480D1B61A0432D1319F7504A3D7318DD", hash_generated_field = "04C3773A3BD2D8612D975B4AF160A96A")

    private int blockSize;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.750 -0400", hash_original_field = "3FC21B7AC372D5999F431A9049C44F9D", hash_generated_field = "9C6879ACFD3ACD2B8F6A3DB61F5802F7")

    private byte[] cipherSuiteCode;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.750 -0400", hash_original_field = "B068931CC450442B63F5B3D276EA4297", hash_generated_field = "531F96E2AEBFB44CD229EC4CB1F012B0")

    private String name;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.750 -0400", hash_original_field = "32EC2D0C46903E7857469CC8DA8E01DF", hash_generated_field = "E3762000F131D4540CC4F5BE4F282C71")

    private boolean isExportable;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.750 -0400", hash_original_field = "C065C4D306BF6E5FA1384259F0502A16", hash_generated_field = "FA3FEC41411B55E226E2067875BD3B74")

    private String hashName;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.750 -0400", hash_original_field = "77885BF6472170A0C07034A5B96EAEC9", hash_generated_field = "F6E855DA27DE62B9374233E3385207F7")

    private String hmacName;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.750 -0400", hash_original_field = "17344FAD2A9882D4E6795004CF283C78", hash_generated_field = "FBF2A1556B0034F6A3D1102F2996A7CB")

    private int hashSize;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.752 -0400", hash_original_method = "54B6F4B5E133F8A61DA406B9859D0D86", hash_generated_method = "0ECA8B6D74CE5ABF359B822BC2B561CD")
    private  CipherSuite(String name, boolean isExportable, int keyExchange,
            String authType, String cipherName, String hash, byte[] code) {
        this.name = name;
        this.keyExchange = keyExchange;
        this.authType = authType;
        this.isExportable = isExportable;
        {
            this.cipherName = null;
            keyMaterial = 0;
            expandedKeyMaterial = 0;
            effectiveKeyBytes = 0;
            ivSize = 0;
            blockSize = 0;
        } //End block
        {
            boolean var83FE4A621033DBF86A035303348C9069_1400472324 = ("RC4_40".equals(cipherName));
            {
                this.cipherName = "RC4";
                keyMaterial = 5;
                expandedKeyMaterial = 16;
                effectiveKeyBytes = 5;
                ivSize = 0;
                blockSize = 0;
            } //End block
            {
                boolean varBFA52D54AB4E451C86478190B088F490_317864420 = ("RC4_128".equals(cipherName));
                {
                    this.cipherName = "RC4";
                    keyMaterial = 16;
                    expandedKeyMaterial = 16;
                    effectiveKeyBytes = 16;
                    ivSize = 0;
                    blockSize = 0;
                } //End block
                {
                    boolean var169A581047F02ED212E0D86EC911CFF3_1417415679 = ("DES40_CBC".equals(cipherName));
                    {
                        this.cipherName = "DES/CBC/NoPadding";
                        keyMaterial = 5;
                        expandedKeyMaterial = 8;
                        effectiveKeyBytes = 5;
                        ivSize = 8;
                        blockSize = 8;
                    } //End block
                    {
                        boolean varBA299225572A2EEF4B69DFBC7FAB0C2C_667374514 = ("DES_CBC".equals(cipherName));
                        {
                            this.cipherName = "DES/CBC/NoPadding";
                            keyMaterial = 8;
                            expandedKeyMaterial = 8;
                            effectiveKeyBytes = 7;
                            ivSize = 8;
                            blockSize = 8;
                        } //End block
                        {
                            boolean var2AFD38E7932DB50B2E8247936CF045C0_1336555769 = ("3DES_EDE_CBC".equals(cipherName));
                            {
                                this.cipherName = "DESede/CBC/NoPadding";
                                keyMaterial = 24;
                                expandedKeyMaterial = 24;
                                effectiveKeyBytes = 24;
                                ivSize = 8;
                                blockSize = 8;
                            } //End block
                            {
                                boolean var40782AB2EBC9AF3EEA4D4BE96870414B_421934193 = ("AES_128_CBC".equals(cipherName));
                                {
                                    this.cipherName = "AES/CBC/NoPadding";
                                    keyMaterial = 16;
                                    expandedKeyMaterial = 16;
                                    effectiveKeyBytes = 16;
                                    ivSize = 16;
                                    blockSize = 16;
                                } //End block
                                {
                                    boolean var031F9B85D3909EA1CA5883928E3FDDA1_501824189 = ("AES_256_CBC".equals(cipherName));
                                    {
                                        this.cipherName = "AES/CBC/NoPadding";
                                        keyMaterial = 32;
                                        expandedKeyMaterial = 32;
                                        effectiveKeyBytes = 32;
                                        ivSize = 16;
                                        blockSize = 16;
                                    } //End block
                                    {
                                        this.cipherName = cipherName;
                                        keyMaterial = 0;
                                        expandedKeyMaterial = 0;
                                        effectiveKeyBytes = 0;
                                        ivSize = 0;
                                        blockSize = 0;
                                    } //End block
                                } //End collapsed parenthetic
                            } //End collapsed parenthetic
                        } //End collapsed parenthetic
                    } //End collapsed parenthetic
                } //End collapsed parenthetic
            } //End collapsed parenthetic
        } //End collapsed parenthetic
        {
            boolean varFE5CFE390B831904898301B5035F64A1_1547068187 = ("MD5".equals(hash));
            {
                this.hmacName = "HmacMD5";
                this.hashName = "MD5";
                hashSize = 16;
            } //End block
            {
                boolean var1247556C4F383A0C34B50551B10A24FE_2015805642 = ("SHA".equals(hash));
                {
                    this.hmacName = "HmacSHA1";
                    this.hashName = "SHA-1";
                    hashSize = 20;
                } //End block
                {
                    this.hmacName = null;
                    this.hashName = null;
                    hashSize = 0;
                } //End block
            } //End collapsed parenthetic
        } //End collapsed parenthetic
        cipherSuiteCode = code;
        {
            try 
            {
                Cipher.getInstance(this.cipherName);
            } //End block
            catch (GeneralSecurityException e)
            {
                supported = false;
            } //End block
        } //End block
        {
            boolean var8F5354B22BBD8A425CE718DC6EB34B8F_1754948105 = (this.name.startsWith("TLS_EC"));
            {
                supported = false;
            } //End block
        } //End collapsed parenthetic
        addTaint(hash.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    private static int registerCipherSuitesByCode(CipherSuite[] cipherSuites) {
        int count = 0;
        for (int i = 0; i < cipherSuites.length; i++) {
            if (cipherSuites[i] == SSL_NULL_WITH_NULL_NULL) {
                continue;
            }
            if (cipherSuites[i] == null) {
                continue;
            }
            SUITES_BY_NAME.put(cipherSuites[i].getName(), cipherSuites[i]);
            if (cipherSuites[i].supported) {
                count++;
            }
        }
        return count;
    }

    
    private static void registerSupportedCipherSuites(int offset, CipherSuite[] cipherSuites) {
        int count = offset;
        for (int i = 0; i < cipherSuites.length; i++) {
            if (cipherSuites[i] == SSL_NULL_WITH_NULL_NULL) {
                continue;
            }
            if (cipherSuites[i] == null) {
                continue;
            }
            if (cipherSuites[i].supported) {
                SUPPORTED_CIPHER_SUITES[count] = cipherSuites[i];
                SUPPORTED_CIPHER_SUITE_NAMES[count] = SUPPORTED_CIPHER_SUITES[count].getName();
                count++;
            }
        }
    }

    
    public static CipherSuite getByName(String name) {
        return SUITES_BY_NAME.get(name);
    }

    
    public static CipherSuite getByCode(byte b1, byte b2) {
        int i1 = b1 & 0xff;
        int i2 = b2 & 0xff;
        CipherSuite cs = getCipherSuiteByCode(0, i1, i2);
        if (cs != null) {
            return cs;
        }
        return new CipherSuite("UNKNOWN_" + i1 + "_" + i2, false, 0, null,
                               null, null, new byte[] { b1, b2 });
    }

    
    public static CipherSuite getByCode(byte b1, byte b2, byte b3) {
        int i1 = b1 & 0xff;
        int i2 = b2 & 0xff;
        int i3 = b3 & 0xff;
        CipherSuite cs = getCipherSuiteByCode(i1, i2, i3);
        if (cs != null) {
            return cs;
        }
        return new CipherSuite("UNKNOWN_" + i1 + "_" + i2 + "_" + i3, false, 0,
                               null, null, null, new byte[] { b1, b2, b3 });
    }

    
    private static CipherSuite getCipherSuiteByCode(int i1, int i2, int i3) {
        CipherSuite[] cipherSuites;
        if (i1 == 0x00 && i2 == 0x00) {
            cipherSuites = SUITES_BY_CODE_0x00;
        } else if (i1 == 0x00 && i2 == 0xc0) {
            cipherSuites = SUITES_BY_CODE_0xc0;
        } else {
            return null;
        }
        if (i3 >= cipherSuites.length) {
            return null;
        }
        return cipherSuites[i3];
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.754 -0400", hash_original_method = "92638E1F733B540A4060D31FD00C2E43", hash_generated_method = "EB9FA41535A2F8A0376924D0FC0779D5")
    public boolean isAnonymous() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1470914953 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1470914953;
        // ---------- Original Method ----------
        //if (keyExchange == KEY_EXCHANGE_DH_anon
                //|| keyExchange == KEY_EXCHANGE_DH_anon_EXPORT
                //|| keyExchange == KEY_EXCHANGE_ECDH_anon) {
            //return true;
        //}
        //return false;
    }

    
    public static CipherSuite[] getSupported() {
        return SUPPORTED_CIPHER_SUITES;
    }

    
    public static String[] getSupportedCipherSuiteNames() {
        return SUPPORTED_CIPHER_SUITE_NAMES.clone();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.755 -0400", hash_original_method = "7070E6AABEDCBA653834DDC8CF79A47C", hash_generated_method = "42D2B7A65F9670D0062FB5C42367CA02")
    public String getName() {
        String varB4EAC82CA7396A68D541C85D26508E83_1197030239 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1197030239 = name;
        varB4EAC82CA7396A68D541C85D26508E83_1197030239.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1197030239;
        // ---------- Original Method ----------
        //return name;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.755 -0400", hash_original_method = "914B5E2C4522C674B906D3A88195AF81", hash_generated_method = "DA1741508EDAAF0C1FFD2CAC793ECE0B")
    public byte[] toBytes() {
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_202849441 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_202849441;
        // ---------- Original Method ----------
        //return cipherSuiteCode;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.756 -0400", hash_original_method = "D4E6F2D9338FE775902AE34CF280ED17", hash_generated_method = "A05F9CF64E82A6C255543AE1C17E121B")
    @Override
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1276719578 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1276719578 = name + ": " + cipherSuiteCode[0] + " " + cipherSuiteCode[1];
        varB4EAC82CA7396A68D541C85D26508E83_1276719578.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1276719578;
        // ---------- Original Method ----------
        //return name + ": " + cipherSuiteCode[0] + " " + cipherSuiteCode[1];
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.756 -0400", hash_original_method = "7D208669D7EDDA60D0FD344147D9AAD6", hash_generated_method = "B52BAB92A1A1AA8E6890599D267F8294")
    public String getBulkEncryptionAlgorithm() {
        String varB4EAC82CA7396A68D541C85D26508E83_991485250 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_991485250 = cipherName;
        varB4EAC82CA7396A68D541C85D26508E83_991485250.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_991485250;
        // ---------- Original Method ----------
        //return cipherName;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.756 -0400", hash_original_method = "E03DB665D968D86F8F6FEC0B3CE97B35", hash_generated_method = "B43BEF57CD3B7E4A2CC6B75D06BB3530")
    public int getBlockSize() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1760284684 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1760284684;
        // ---------- Original Method ----------
        //return blockSize;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.757 -0400", hash_original_method = "58CBEDAB9C64FBF2F046D83798145AD9", hash_generated_method = "C3B2EBB9F656E27D2650C36257123436")
    public String getHmacName() {
        String varB4EAC82CA7396A68D541C85D26508E83_303817713 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_303817713 = hmacName;
        varB4EAC82CA7396A68D541C85D26508E83_303817713.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_303817713;
        // ---------- Original Method ----------
        //return hmacName;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.757 -0400", hash_original_method = "D391A3C678BDD6A89326831F4F051E38", hash_generated_method = "4413062CF177536E9B28E81758C16007")
    public String getHashName() {
        String varB4EAC82CA7396A68D541C85D26508E83_2020559691 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2020559691 = hashName;
        varB4EAC82CA7396A68D541C85D26508E83_2020559691.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2020559691;
        // ---------- Original Method ----------
        //return hashName;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.757 -0400", hash_original_method = "5CA4B8D3CBACCFD69EE0CC1B72A2F92B", hash_generated_method = "A486C0C4EE8C23C5A1D27FFC0A592931")
    public int getMACLength() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_697612875 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_697612875;
        // ---------- Original Method ----------
        //return hashSize;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.758 -0400", hash_original_method = "3DD67552ED8C1FF65B79535A2E5F00F8", hash_generated_method = "0D13E3B3C72C054BBF7F629A41E3C3FA")
    public boolean isExportable() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1639167809 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1639167809;
        // ---------- Original Method ----------
        //return isExportable;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.758 -0400", hash_original_method = "936867E36B0EB6E36D3CC4941D208DF5", hash_generated_method = "5F74B0C28F3AD00F72F86B87FB4BD0FC")
    public String getServerKeyType() {
        String varB4EAC82CA7396A68D541C85D26508E83_1523489261 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_1687333340 = null; //Variable for return #2
        String varB4EAC82CA7396A68D541C85D26508E83_449013259 = null; //Variable for return #3
        String varB4EAC82CA7396A68D541C85D26508E83_547057987 = null; //Variable for return #4
        String varB4EAC82CA7396A68D541C85D26508E83_743648457 = null; //Variable for return #5
        //Begin case KEY_EXCHANGE_DHE_RSA KEY_EXCHANGE_DHE_RSA_EXPORT KEY_EXCHANGE_ECDHE_RSA KEY_EXCHANGE_RSA KEY_EXCHANGE_RSA_EXPORT 
        varB4EAC82CA7396A68D541C85D26508E83_1523489261 = KEY_TYPE_RSA;
        //End case KEY_EXCHANGE_DHE_RSA KEY_EXCHANGE_DHE_RSA_EXPORT KEY_EXCHANGE_ECDHE_RSA KEY_EXCHANGE_RSA KEY_EXCHANGE_RSA_EXPORT 
        //Begin case KEY_EXCHANGE_DHE_DSS KEY_EXCHANGE_DHE_DSS_EXPORT 
        varB4EAC82CA7396A68D541C85D26508E83_1687333340 = KEY_TYPE_DSA;
        //End case KEY_EXCHANGE_DHE_DSS KEY_EXCHANGE_DHE_DSS_EXPORT 
        //Begin case KEY_EXCHANGE_ECDH_ECDSA KEY_EXCHANGE_ECDHE_ECDSA 
        varB4EAC82CA7396A68D541C85D26508E83_449013259 = KEY_TYPE_EC_EC;
        //End case KEY_EXCHANGE_ECDH_ECDSA KEY_EXCHANGE_ECDHE_ECDSA 
        //Begin case KEY_EXCHANGE_ECDH_RSA 
        varB4EAC82CA7396A68D541C85D26508E83_547057987 = KEY_TYPE_EC_RSA;
        //End case KEY_EXCHANGE_ECDH_RSA 
        //Begin case KEY_EXCHANGE_DH_anon KEY_EXCHANGE_DH_anon_EXPORT KEY_EXCHANGE_ECDH_anon 
        varB4EAC82CA7396A68D541C85D26508E83_743648457 = null;
        //End case KEY_EXCHANGE_DH_anon KEY_EXCHANGE_DH_anon_EXPORT KEY_EXCHANGE_ECDH_anon 
        //Begin case default 
        if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Unknown key type for key exchange " + keyExchange);
        //End case default 
        String varA7E53CE21691AB073D9660D615818899_327206718; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_327206718 = varB4EAC82CA7396A68D541C85D26508E83_1523489261;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_327206718 = varB4EAC82CA7396A68D541C85D26508E83_1687333340;
                break;
            case 3: //Assign result for return ordinal #3
                varA7E53CE21691AB073D9660D615818899_327206718 = varB4EAC82CA7396A68D541C85D26508E83_449013259;
                break;
            case 4: //Assign result for return ordinal #4
                varA7E53CE21691AB073D9660D615818899_327206718 = varB4EAC82CA7396A68D541C85D26508E83_547057987;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_327206718 = varB4EAC82CA7396A68D541C85D26508E83_743648457;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_327206718.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_327206718;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    public static String getClientKeyType(byte keyType) {
        switch (keyType) {
            case TLS_CT_RSA_SIGN:
                return KEY_TYPE_RSA; 
            case TLS_CT_DSS_SIGN:
                return KEY_TYPE_DSA; 
            case TLS_CT_RSA_FIXED_DH:
                return KEY_TYPE_DH_RSA; 
            case TLS_CT_DSS_FIXED_DH:
                return KEY_TYPE_DH_DSA; 
            case TLS_CT_ECDSA_SIGN:
                return KEY_TYPE_EC; 
            case TLS_CT_RSA_FIXED_ECDH:
                return KEY_TYPE_EC_RSA; 
            case TLS_CT_ECDSA_FIXED_ECDH:
                return KEY_TYPE_EC_EC; 
            default:
                return null;
        }
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.759 -0400", hash_original_method = "0C964AFB9ED36BE0A1810A2A5E5F4637", hash_generated_method = "4A2179F053146BAF9CDAB0AE1F94E4EC")
    public String getAuthType(boolean emphemeral) {
        String varB4EAC82CA7396A68D541C85D26508E83_836410025 = null; //Variable for return #1
        String varB4EAC82CA7396A68D541C85D26508E83_1895484221 = null; //Variable for return #2
        String varB4EAC82CA7396A68D541C85D26508E83_52378062 = null; //Variable for return #3
        String varB4EAC82CA7396A68D541C85D26508E83_2105992719 = null; //Variable for return #4
        String varB4EAC82CA7396A68D541C85D26508E83_2130438437 = null; //Variable for return #5
        String varB4EAC82CA7396A68D541C85D26508E83_1504104008 = null; //Variable for return #6
        String varB4EAC82CA7396A68D541C85D26508E83_1125486053 = null; //Variable for return #7
        String varB4EAC82CA7396A68D541C85D26508E83_1158092242 = null; //Variable for return #8
        String varB4EAC82CA7396A68D541C85D26508E83_293804369 = null; //Variable for return #9
        //Begin case KEY_EXCHANGE_RSA 
        varB4EAC82CA7396A68D541C85D26508E83_836410025 = AUTH_TYPE_RSA;
        //End case KEY_EXCHANGE_RSA 
        //Begin case KEY_EXCHANGE_RSA_EXPORT 
        varB4EAC82CA7396A68D541C85D26508E83_1895484221 = emphemeral ? AUTH_TYPE_RSA_EXPORT : AUTH_TYPE_RSA;
        //End case KEY_EXCHANGE_RSA_EXPORT 
        //Begin case KEY_EXCHANGE_DHE_DSS KEY_EXCHANGE_DHE_DSS_EXPORT 
        varB4EAC82CA7396A68D541C85D26508E83_52378062 = AUTH_TYPE_DHE_DSS;
        //End case KEY_EXCHANGE_DHE_DSS KEY_EXCHANGE_DHE_DSS_EXPORT 
        //Begin case KEY_EXCHANGE_DHE_RSA KEY_EXCHANGE_DHE_RSA_EXPORT 
        varB4EAC82CA7396A68D541C85D26508E83_2105992719 = AUTH_TYPE_DHE_RSA;
        //End case KEY_EXCHANGE_DHE_RSA KEY_EXCHANGE_DHE_RSA_EXPORT 
        //Begin case KEY_EXCHANGE_ECDH_ECDSA 
        varB4EAC82CA7396A68D541C85D26508E83_2130438437 = AUTH_TYPE_ECDH_ECDSA;
        //End case KEY_EXCHANGE_ECDH_ECDSA 
        //Begin case KEY_EXCHANGE_ECDHE_ECDSA 
        varB4EAC82CA7396A68D541C85D26508E83_1504104008 = AUTH_TYPE_ECDHE_ECDSA;
        //End case KEY_EXCHANGE_ECDHE_ECDSA 
        //Begin case KEY_EXCHANGE_ECDH_RSA 
        varB4EAC82CA7396A68D541C85D26508E83_1125486053 = AUTH_TYPE_ECDH_RSA;
        //End case KEY_EXCHANGE_ECDH_RSA 
        //Begin case KEY_EXCHANGE_ECDHE_RSA 
        varB4EAC82CA7396A68D541C85D26508E83_1158092242 = AUTH_TYPE_ECDHE_RSA;
        //End case KEY_EXCHANGE_ECDHE_RSA 
        //Begin case KEY_EXCHANGE_DH_anon KEY_EXCHANGE_DH_anon_EXPORT KEY_EXCHANGE_ECDH_anon 
        varB4EAC82CA7396A68D541C85D26508E83_293804369 = null;
        //End case KEY_EXCHANGE_DH_anon KEY_EXCHANGE_DH_anon_EXPORT KEY_EXCHANGE_ECDH_anon 
        //Begin case default 
        if (DroidSafeAndroidRuntime.control) throw new IllegalStateException("Unknown auth type for key exchange " + keyExchange);
        //End case default 
        addTaint(emphemeral);
        String varA7E53CE21691AB073D9660D615818899_230609192; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_230609192 = varB4EAC82CA7396A68D541C85D26508E83_836410025;
                break;
            case 2: //Assign result for return ordinal #2
                varA7E53CE21691AB073D9660D615818899_230609192 = varB4EAC82CA7396A68D541C85D26508E83_1895484221;
                break;
            case 3: //Assign result for return ordinal #3
                varA7E53CE21691AB073D9660D615818899_230609192 = varB4EAC82CA7396A68D541C85D26508E83_52378062;
                break;
            case 4: //Assign result for return ordinal #4
                varA7E53CE21691AB073D9660D615818899_230609192 = varB4EAC82CA7396A68D541C85D26508E83_2105992719;
                break;
            case 5: //Assign result for return ordinal #5
                varA7E53CE21691AB073D9660D615818899_230609192 = varB4EAC82CA7396A68D541C85D26508E83_2130438437;
                break;
            case 6: //Assign result for return ordinal #6
                varA7E53CE21691AB073D9660D615818899_230609192 = varB4EAC82CA7396A68D541C85D26508E83_1504104008;
                break;
            case 7: //Assign result for return ordinal #7
                varA7E53CE21691AB073D9660D615818899_230609192 = varB4EAC82CA7396A68D541C85D26508E83_1125486053;
                break;
            case 8: //Assign result for return ordinal #8
                varA7E53CE21691AB073D9660D615818899_230609192 = varB4EAC82CA7396A68D541C85D26508E83_1158092242;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_230609192 = varB4EAC82CA7396A68D541C85D26508E83_293804369;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_230609192.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_230609192;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.759 -0400", hash_original_field = "1EADA2FD3179B8D0FEB9D904D12CACE3", hash_generated_field = "B56B086D65833926B963E4AF5198F74B")

    static final int KEY_EXCHANGE_RSA = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.759 -0400", hash_original_field = "490CC8C530D1452DF9711343F18D14F1", hash_generated_field = "B66542296B758B9957EFEE140FD5AF2D")

    static final int KEY_EXCHANGE_RSA_EXPORT = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.759 -0400", hash_original_field = "87F46877B39B062A4410F83AB5515A0E", hash_generated_field = "1A61B4E3339FDC1CC8A25C32A0BAC082")

    static final int KEY_EXCHANGE_DHE_DSS = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.759 -0400", hash_original_field = "40F6CEA7F55B90D129B951E9C15BE5E6", hash_generated_field = "059AD6EFEA99DFA24C0F5B1726DC7E2D")

    static final int KEY_EXCHANGE_DHE_DSS_EXPORT = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.759 -0400", hash_original_field = "2D7852A57D9686837625361299364DAF", hash_generated_field = "DC1215809568225DD9D5EF7AE9619110")

    static final int KEY_EXCHANGE_DHE_RSA = 5;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.759 -0400", hash_original_field = "B800A617E5403D015415722FD2DE298A", hash_generated_field = "48966917CF5B65C75B194D1E6ACBF65B")

    static final int KEY_EXCHANGE_DHE_RSA_EXPORT = 6;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.759 -0400", hash_original_field = "17F8D1E5352C598E192C692CA944A85B", hash_generated_field = "05EB6F7D0B081CA6FBDC12EB6FEDC8A3")

    static final int KEY_EXCHANGE_DH_anon = 9;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.759 -0400", hash_original_field = "BE0DA7E24112ACDF68784534FB49D212", hash_generated_field = "5FC61A81184103CD6DFEB040E7A04816")

    static final int KEY_EXCHANGE_DH_anon_EXPORT = 10;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "AA7672EC87838BCBBFC612F81A7DBFE3", hash_generated_field = "2578D55A785DEB8A08C533D28C1FDBBF")

    static final int KEY_EXCHANGE_ECDH_ECDSA = 13;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "DFCB3485FA00A3EBB16BD0F4FFE54310", hash_generated_field = "0AD5910A2A0361105C7A2BD3D17D3964")

    static final int KEY_EXCHANGE_ECDHE_ECDSA = 14;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "DC4C6A663915BFF1DA6F6E1E6CC829A0", hash_generated_field = "8C121FC40EE8784B01445F817BD220E7")

    static final int KEY_EXCHANGE_ECDH_RSA = 15;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "F28CAA3F5CCB928E6EF67CAD057AC0C4", hash_generated_field = "AB29779250E9AF2222BCA0BCBCEE6076")

    static final int KEY_EXCHANGE_ECDHE_RSA = 16;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "B9BE25E12B49387FC37E511161C8499C", hash_generated_field = "F9CDE2A1A91C64104E21D12C62431B21")

    static final int KEY_EXCHANGE_ECDH_anon = 17;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "A3B60EBC835C0EE0EEAA042474E74109", hash_generated_field = "691A74F5F2E3A2498B80995CBE553220")

    static final byte[] CODE_SSL_NULL_WITH_NULL_NULL = { 0x00, 0x00 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "832058CD3C97FEEB2AFE4A8BBA131A8B", hash_generated_field = "498B1E3AEFAF89FC4250B1E83665AF52")

    static final byte[] CODE_SSL_RSA_WITH_NULL_MD5 = { 0x00, 0x01 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "F3AF4CD7058A0CC26CE84A7B2568FB7D", hash_generated_field = "DCB8463CB8272650290200FA14FFEB17")

    static final byte[] CODE_SSL_RSA_WITH_NULL_SHA = { 0x00, 0x02 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "ADAEC62BC94C615532BA6A56F37FA085", hash_generated_field = "E92FF662CD9967AA82FAD8BDD7AE725B")

    static final byte[] CODE_SSL_RSA_EXPORT_WITH_RC4_40_MD5 = { 0x00, 0x03 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "48BD34F40882CCB17E67E15E3FD6ACE8", hash_generated_field = "F01D3100C0E9471B5C5CA537535676E0")

    static final byte[] CODE_SSL_RSA_WITH_RC4_128_MD5 = { 0x00, 0x04 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "DDECEDC38650EF98CD1ABBF03712B0F3", hash_generated_field = "409CC22954017A4D525562B15E56E2A4")

    static final byte[] CODE_SSL_RSA_WITH_RC4_128_SHA = { 0x00, 0x05 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "87B4A61F1B6F5E388672FA42830E3F82", hash_generated_field = "2EA77D4F72485CDB2EC1B3A8CA8CF41C")

    static final byte[] CODE_SSL_RSA_EXPORT_WITH_RC2_CBC_40_MD5 = { 0x00, 0x06 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "64086580268B509776CCACA32029BB33", hash_generated_field = "173243B66E4FB7E96A59ECA33A8A0717")

    static final byte[] CODE_SSL_RSA_EXPORT_WITH_DES40_CBC_SHA = { 0x00, 0x08 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "3FFDCD0CEE501007FE5BF9E6279E78ED", hash_generated_field = "BE507D2D710669EBF24E4361C8BCF164")

    static final byte[] CODE_SSL_RSA_WITH_DES_CBC_SHA = { 0x00, 0x09 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "F7BD891A1D3853B9EC5741D0DC9233BC", hash_generated_field = "C79A008AC20D74C0E8E14A45F529D5ED")

    static final byte[] CODE_SSL_RSA_WITH_3DES_EDE_CBC_SHA = { 0x00, 0x0A };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "38B139BCB0875D9E630A617AD18D4C79", hash_generated_field = "B191FF4BBD3C33697CF85F0A98FE4160")

    static final byte[] CODE_SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = { 0x00, 0x11 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "388487396F477A9D3729CD71F70DDD07", hash_generated_field = "420AC1DC34391965668836FB6AB6665A")

    static final byte[] CODE_SSL_DHE_DSS_WITH_DES_CBC_SHA = { 0x00, 0x12 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "123F7F942D27F5396EEE0A5DB5055439", hash_generated_field = "48990AA7D466229F36BFB8F85C83425B")

    static final byte[] CODE_SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA = { 0x00, 0x13 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "09CB4CD30F484326CBBF4312B52A0209", hash_generated_field = "A36779D51A4F225EDD9323C887E26656")

    static final byte[] CODE_SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = { 0x00, 0x14 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "34C85B6AF17156D4A17EEDC5926CE450", hash_generated_field = "E34A499C78E2646E57D3F05C4FBB5594")

    static final byte[] CODE_SSL_DHE_RSA_WITH_DES_CBC_SHA = { 0x00, 0x15 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "DFB585F8963B330D9FBC95252471710C", hash_generated_field = "CFF536299D7214DCFA136EDE2BDBF250")

    static final byte[] CODE_SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA = { 0x00, 0x16 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "815ABF482944674D3695908038E88D9F", hash_generated_field = "DE8CE08DFD9968C5CA3085537C963036")

    static final byte[] CODE_SSL_DH_anon_EXPORT_WITH_RC4_40_MD5 = { 0x00, 0x17 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "5E7C9472B5CC3788CF5129B08A612F50", hash_generated_field = "F371353851B0F22CB36B1B68DBCCCA3A")

    static final byte[] CODE_SSL_DH_anon_WITH_RC4_128_MD5 = { 0x00, 0x18 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "F415E8E0501EF84C8595852D501DA381", hash_generated_field = "F765C240FA984CBDA5C1C4006D66E442")

    static final byte[] CODE_SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA = { 0x00, 0x19 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "C446E438CC48B486A53623DE6BF9EC47", hash_generated_field = "70245C03EE4DD2E11B62D532AFCA7B80")

    static final byte[] CODE_SSL_DH_anon_WITH_DES_CBC_SHA = { 0x00, 0x1A };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "1D1E827885DA47D472F83ADF122E1FA8", hash_generated_field = "E64B24F125E5C3EC93A01847318CE4BC")

    static final byte[] CODE_SSL_DH_anon_WITH_3DES_EDE_CBC_SHA = { 0x00, 0x1B };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "9E47734DC10691062D8070B4E5AB39AA", hash_generated_field = "AE11B6E320C70AAB3548539580FC9BE4")

    static final byte[] CODE_TLS_RSA_WITH_AES_128_CBC_SHA = { 0x00, 0x2F };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "B6D0F1D6EE4C420573F0BA0B9EF44F7A", hash_generated_field = "3A39084C919067A17CD77A95913260EB")

    static final byte[] CODE_TLS_DHE_DSS_WITH_AES_128_CBC_SHA = { 0x00, 0x32 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "8AC1DE6E4718884010B01D5B44467071", hash_generated_field = "FDBD59C32846AE644F34F1B1B56C5767")

    static final byte[] CODE_TLS_DHE_RSA_WITH_AES_128_CBC_SHA = { 0x00, 0x33 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "97CD85EA97E55E42672A21F13B06EB2F", hash_generated_field = "AA3F905B1F17C9F7ABBAE7BF7AE56512")

    static final byte[] CODE_TLS_DH_anon_WITH_AES_128_CBC_SHA = { 0x00, 0x34 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "63758E2B41CDC1385A27D6A590780BA6", hash_generated_field = "45791EBD5EB689F0EE6CA139598A6AB7")

    static final byte[] CODE_TLS_RSA_WITH_AES_256_CBC_SHA = { 0x00, 0x35 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "047FC708BA3897DDE53B56121945F594", hash_generated_field = "331363E6FF5D2666E94B2FC85809F10C")

    static final byte[] CODE_TLS_DHE_DSS_WITH_AES_256_CBC_SHA = { 0x00, 0x38 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "05DECCE337235F1FED3912A09C408A63", hash_generated_field = "EAA98B78CD032436CF016EF871DDBA34")

    static final byte[] CODE_TLS_DHE_RSA_WITH_AES_256_CBC_SHA = { 0x00, 0x39 };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "D625DC0D01728BD1D9D44005F95D6841", hash_generated_field = "8967C134F191B5699B73056DC11B2EB3")

    static final byte[] CODE_TLS_DH_anon_WITH_AES_256_CBC_SHA = { 0x00, 0x3A };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "545122CFACFE8AB04C4EEC549DF590F2", hash_generated_field = "AA24F64E0406CE87B78B3C1D4EF6F819")

    static final byte[] CODE_TLS_ECDH_ECDSA_WITH_NULL_SHA = { (byte) 0xc0, 0x01};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "2B41C6A9CA3D29D3232AC9825A690F69", hash_generated_field = "41F9ECB15AE7AF8BFA80616C87D18890")

    static final byte[] CODE_TLS_ECDH_ECDSA_WITH_RC4_128_SHA = { (byte) 0xc0, 0x02};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "F4220CA3660BAEBA0DD271CFCBA08C47", hash_generated_field = "E24EE271E81AF477A40B950AA965A88C")

    static final byte[] CODE_TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = { (byte) 0xc0, 0x03};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "E2ACE0EE70A8845417753667AA9C78D6", hash_generated_field = "5F1C7B8AAA3A95ACA011C685AEF1B89E")

    static final byte[] CODE_TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = { (byte) 0xc0, 0x04};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "E8E385203BC450F89D1A1E07F88D9DBB", hash_generated_field = "366A79B525DD4E16859BC8F1FD5472A1")

    static final byte[] CODE_TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = { (byte) 0xc0, 0x05};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "B19EDBFB6F25DF72D57CDD01D9A72FCC", hash_generated_field = "2598FFBD2440EDFCBBF25AD8F2CA282A")

    static final byte[] CODE_TLS_ECDHE_ECDSA_WITH_NULL_SHA = { (byte) 0xc0, 0x06};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "D01B407A64A18F00D506788C4866F7BD", hash_generated_field = "5F439F1E65E070144791DE839EAD21BE")

    static final byte[] CODE_TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = { (byte) 0xc0, 0x07};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.760 -0400", hash_original_field = "3B4762D1AE694F0CF9CEABE659D038EE", hash_generated_field = "1EDD05DC1FD915A171C3215B2A8C28D5")

    static final byte[] CODE_TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = { (byte) 0xc0, 0x08};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "9ABDC20BA9BD1AB2199999A23F6CE5DE", hash_generated_field = "DBF394E607BAB98178F04F1B1897ED6F")

    static final byte[] CODE_TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = { (byte) 0xc0, 0x09};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "3E3A9E303F2171130A1CC7C4AB35C125", hash_generated_field = "6D155269B07669C82EE373613C434B85")

    static final byte[] CODE_TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = { (byte) 0xc0, 0x0A};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "51C1AE0CE9E7A2991E28165CB9731FB0", hash_generated_field = "DE8F7262A72EDF87FFBA05AEC440638D")

    static final byte[] CODE_TLS_ECDH_RSA_WITH_NULL_SHA = { (byte) 0xc0, 0x0B};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "0729B620DD76B480CC11A4FD44018B07", hash_generated_field = "ED87E6BE8A591AE239EE8ECB871C932B")

    static final byte[] CODE_TLS_ECDH_RSA_WITH_RC4_128_SHA = { (byte) 0xc0, 0x0C};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "AAEEF73282E9F821CFFAF81354267701", hash_generated_field = "7821C69594E6E6928295ABFE95C182ED")

    static final byte[] CODE_TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = { (byte) 0xc0, 0x0D};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "DBDE2C8C8AC9EBEF323EED6F576E9F1A", hash_generated_field = "0F918AC9CB049766DD69AF3D2B39533B")

    static final byte[] CODE_TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = { (byte) 0xc0, 0x0E};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "DDC9329716D48E3B41AC398E1009097C", hash_generated_field = "CCEBDAE2E1217BB8BC16B24E7008AD79")

    static final byte[] CODE_TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = { (byte) 0xc0, 0x0F};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "53884C57D5949FF31DC6B565F8DA1D05", hash_generated_field = "4DC7F5601C6A8AD68292CFA1BC1C76F3")

    static final byte[] CODE_TLS_ECDHE_RSA_WITH_NULL_SHA = { (byte) 0xc0, 0x10};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "A03C6750E3DC000C4DC70BE6724F8501", hash_generated_field = "C6408578BDEA4E69D3F5D225D9800A3D")

    static final byte[] CODE_TLS_ECDHE_RSA_WITH_RC4_128_SHA = { (byte) 0xc0, 0x11};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "A27E2E694EA4C6C4455E0DF022E77BD8", hash_generated_field = "DE8F7219901624D504B06D40801700A1")

    static final byte[] CODE_TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = { (byte) 0xc0, 0x12};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "58684AA63852A7DD4C7E73C0BB91C2AC", hash_generated_field = "829A6BBC52450E74E9E8373797A9DB7C")

    static final byte[] CODE_TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = { (byte) 0xc0, 0x13};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "4A68CD49DE83648C8037E2BD51D64E9B", hash_generated_field = "24AFF62C926A460F1977514BA3EDCF67")

    static final byte[] CODE_TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = { (byte) 0xc0, 0x14};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "461BBD1E8686E07BAF9451DD71403375", hash_generated_field = "8978DA832F3434B00921FD0DDDCA7318")

    static final byte[] CODE_TLS_ECDH_anon_WITH_NULL_SHA = { (byte) 0xc0, 0x15};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "126736459CDB2123CAC1ECB9F920339A", hash_generated_field = "FDA21DCB4721F2D1082DB7831BB3458B")

    static final byte[] CODE_TLS_ECDH_anon_WITH_RC4_128_SHA = { (byte) 0xc0, 0x16};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "2C1E2201FFA53643758DE6FF2D2873C5", hash_generated_field = "FC46CF198DE7F02B42FCAE42D28C1303")

    static final byte[] CODE_TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = { (byte) 0xc0, 0x17};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "7394FC616E41F1DB89C9DCA12860126D", hash_generated_field = "4702931BE6A98AAA07830978076CCF70")

    static final byte[] CODE_TLS_ECDH_anon_WITH_AES_128_CBC_SHA = { (byte) 0xc0, 0x18};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "AD75CFE31C731F6ECD0500A8C803E509", hash_generated_field = "3C66B1C99DF6E262D8538F87B599A4AA")

    static final byte[] CODE_TLS_ECDH_anon_WITH_AES_256_CBC_SHA = { (byte) 0xc0, 0x19};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "0E026A2BB8DBF6E5A90171A125ECF050", hash_generated_field = "4EC2DAA3C01937C6CDA5F9177EF51C83")

    static final CipherSuite SSL_NULL_WITH_NULL_NULL = new CipherSuite(
            "SSL_NULL_WITH_NULL_NULL", true, 0, null, null, null,
            CODE_SSL_NULL_WITH_NULL_NULL);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "D720000B4AEEF166B48AAC897E65372B", hash_generated_field = "D7C3DA33765CBCB9FD34C9AB9549F186")

    static final CipherSuite SSL_RSA_WITH_NULL_MD5 = new CipherSuite(
            "SSL_RSA_WITH_NULL_MD5", true, KEY_EXCHANGE_RSA, "RSA", null, "MD5",
            CODE_SSL_RSA_WITH_NULL_MD5);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "20880BF8C26E4FD06DF166BC8EFB450F", hash_generated_field = "AFFBA3F15943DDC119CF36F05988EA26")

    static final CipherSuite SSL_RSA_WITH_NULL_SHA = new CipherSuite(
            "SSL_RSA_WITH_NULL_SHA", true, KEY_EXCHANGE_RSA, "RSA", null, "SHA",
            CODE_SSL_RSA_WITH_NULL_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "6753F2BA1B87D93B4A2C43D8CEC29627", hash_generated_field = "19AA66EC2BD1A1DA3E429C4B80F879DE")

    static final CipherSuite SSL_RSA_EXPORT_WITH_RC4_40_MD5 = new CipherSuite(
            "SSL_RSA_EXPORT_WITH_RC4_40_MD5", true, KEY_EXCHANGE_RSA_EXPORT,
            "RSA", "RC4_40", "MD5", CODE_SSL_RSA_EXPORT_WITH_RC4_40_MD5);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "C8E50F28D2CF79FDF5E05A031B0EAA21", hash_generated_field = "8177CEF281F978E2D98457E1A4DCFB50")

    static final CipherSuite SSL_RSA_WITH_RC4_128_MD5 = new CipherSuite(
            "SSL_RSA_WITH_RC4_128_MD5", false, KEY_EXCHANGE_RSA, "RSA", "RC4_128",
            "MD5", CODE_SSL_RSA_WITH_RC4_128_MD5);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "4938B12276F524E6690A71ADB3F85591", hash_generated_field = "2AAA5288D81DCBC2B0F8F241DC6DD0D8")

    static final CipherSuite SSL_RSA_WITH_RC4_128_SHA = new CipherSuite(
            "SSL_RSA_WITH_RC4_128_SHA", false, KEY_EXCHANGE_RSA, "RSA", "RC4_128",
            "SHA", CODE_SSL_RSA_WITH_RC4_128_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "96CE0358DDE9EA717BC9A1F00576B112", hash_generated_field = "E8A8CA45BF6254408A32D77635496D75")

    static final CipherSuite SSL_RSA_EXPORT_WITH_RC2_CBC_40_MD5 = new CipherSuite(
            "SSL_RSA_EXPORT_WITH_RC2_CBC_40_MD5", true, KEY_EXCHANGE_RSA_EXPORT,
            "RSA", "RC2_CBC_40", "MD5", CODE_SSL_RSA_EXPORT_WITH_RC2_CBC_40_MD5);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "9304DD34416FFF64055A03DF3A8A73DA", hash_generated_field = "D8928F337D2D64621E1B3ED66680E3DF")

    static final CipherSuite SSL_RSA_EXPORT_WITH_DES40_CBC_SHA = new CipherSuite(
            "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", true, KEY_EXCHANGE_RSA_EXPORT,
            "RSA", "DES40_CBC", "SHA", CODE_SSL_RSA_EXPORT_WITH_DES40_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "6064563D7CBA50EE004045E9F7278D5F", hash_generated_field = "9CE80D4E1B086789B2805DE088E34D37")

    static final CipherSuite SSL_RSA_WITH_DES_CBC_SHA = new CipherSuite(
            "SSL_RSA_WITH_DES_CBC_SHA", false, KEY_EXCHANGE_RSA, "RSA", "DES_CBC",
            "SHA", CODE_SSL_RSA_WITH_DES_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "F61022838378E5CAF11D1E47E24F466F", hash_generated_field = "48F8F23E83304B9714D84D5554A4AD64")

    static final CipherSuite SSL_RSA_WITH_3DES_EDE_CBC_SHA = new CipherSuite(
            "SSL_RSA_WITH_3DES_EDE_CBC_SHA", false, KEY_EXCHANGE_RSA,
            "RSA", "3DES_EDE_CBC", "SHA", CODE_SSL_RSA_WITH_3DES_EDE_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "9D85F612C2D1BB1B8F5E4A5CDA9CED18", hash_generated_field = "08DAE74E6D8B9AEDD5C3CC9F5766C8CC")

    static final CipherSuite SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = new CipherSuite(
            "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", true,
            KEY_EXCHANGE_DHE_DSS_EXPORT, "DSA", "DES40_CBC", "SHA",
            CODE_SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "B908AEBD55FCCA1CE62E3643564C0CFC", hash_generated_field = "A006CDB683B4FF81C5EF2657F07711FF")

    static final CipherSuite SSL_DHE_DSS_WITH_DES_CBC_SHA = new CipherSuite(
            "SSL_DHE_DSS_WITH_DES_CBC_SHA", false, KEY_EXCHANGE_DHE_DSS,
            "DSA", "DES_CBC", "SHA", CODE_SSL_DHE_DSS_WITH_DES_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "C85161F72971511CF61E69A040A1F13E", hash_generated_field = "AC0A68BB30CD8FFEE1D4D12D5F65E998")

    static final CipherSuite SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA = new CipherSuite(
            "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", false, KEY_EXCHANGE_DHE_DSS,
            "DSA", "3DES_EDE_CBC", "SHA", CODE_SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "138342A71D6455B7AC7A617F4A61E8AA", hash_generated_field = "1A773B5A4356A9F11C2CFD4FCF6A525B")

    static final CipherSuite SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = new CipherSuite(
            "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", true,
            KEY_EXCHANGE_DHE_RSA_EXPORT, "RSA", "DES40_CBC", "SHA",
            CODE_SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "047FAAE97F183186ADB0278F529B801E", hash_generated_field = "F8D69EE1E19B7EC1754EC6F246A2FF26")

    static final CipherSuite SSL_DHE_RSA_WITH_DES_CBC_SHA = new CipherSuite(
            "SSL_DHE_RSA_WITH_DES_CBC_SHA", false, KEY_EXCHANGE_DHE_RSA,
            "RSA", "DES_CBC", "SHA", CODE_SSL_DHE_RSA_WITH_DES_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "8C30899685913E7E974E18030EA22231", hash_generated_field = "1515AF1779BD2D635C0DF4A11FE13EF3")

    static final CipherSuite SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA = new CipherSuite(
            "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", false, KEY_EXCHANGE_DHE_RSA,
            "RSA", "3DES_EDE_CBC", "SHA", CODE_SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "B549BA0C272BFC6103285AD96530FC4A", hash_generated_field = "40BA565115737BE8643741DB1A5C43E5")

    static final CipherSuite SSL_DH_anon_EXPORT_WITH_RC4_40_MD5 = new CipherSuite(
            "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", true,
            KEY_EXCHANGE_DH_anon_EXPORT, "DH", "RC4_40", "MD5",
            CODE_SSL_DH_anon_EXPORT_WITH_RC4_40_MD5);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.761 -0400", hash_original_field = "DAB9E7A6C4C27152C1A619AFF313D22F", hash_generated_field = "2A8F3A4351538FDD152D4881A0234A65")

    static final CipherSuite SSL_DH_anon_WITH_RC4_128_MD5 = new CipherSuite(
            "SSL_DH_anon_WITH_RC4_128_MD5", false, KEY_EXCHANGE_DH_anon,
            "DH", "RC4_128", "MD5", CODE_SSL_DH_anon_WITH_RC4_128_MD5);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "0A035189AA32BD98F728EE11A293031F", hash_generated_field = "AC640F2EDA8C3EDB1185C3C26B42D220")

    static final CipherSuite SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA = new CipherSuite(
            "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", true,
            KEY_EXCHANGE_DH_anon_EXPORT, "DH", "DES40_CBC", "SHA",
            CODE_SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "2EB71540B71A447128F3FFBC63694828", hash_generated_field = "D9345C52E7FCB7B8BCCC41A4FD2CFEEA")

    static final CipherSuite SSL_DH_anon_WITH_DES_CBC_SHA = new CipherSuite(
            "SSL_DH_anon_WITH_DES_CBC_SHA", false, KEY_EXCHANGE_DH_anon,
            "DH", "DES_CBC", "SHA", CODE_SSL_DH_anon_WITH_DES_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "C0E7252A803913AA741D34A443C3C686", hash_generated_field = "6EAE1711619CAE9262488BECCBD8DA00")

    static final CipherSuite SSL_DH_anon_WITH_3DES_EDE_CBC_SHA = new CipherSuite(
            "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", false, KEY_EXCHANGE_DH_anon,
            "DH", "3DES_EDE_CBC", "SHA", CODE_SSL_DH_anon_WITH_3DES_EDE_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "928B9E92478CFA583BD56D7154F4893A", hash_generated_field = "C8755D57EFCD4FF34CC1A40F4E92A2E0")

    static final CipherSuite TLS_RSA_WITH_AES_128_CBC_SHA = new CipherSuite("TLS_RSA_WITH_AES_128_CBC_SHA",
                              false,
                              KEY_EXCHANGE_RSA,
                              "RSA",
                              "AES_128_CBC",
                              "SHA",
                              CODE_TLS_RSA_WITH_AES_128_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "96196CD53F84910864B228CFFC89370F", hash_generated_field = "1DF4BBDEAB7557D5263ADF51874009E2")

    static final CipherSuite TLS_DHE_DSS_WITH_AES_128_CBC_SHA = new CipherSuite("TLS_DHE_DSS_WITH_AES_128_CBC_SHA",
                              false,
                              KEY_EXCHANGE_DHE_DSS,
                              "DSA",
                              "AES_128_CBC",
                              "SHA",
                              CODE_TLS_DHE_DSS_WITH_AES_128_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "13582988BADD9996229805F118C99244", hash_generated_field = "88C7BB42A36BA01EA7FD13D7796EF956")

    static final CipherSuite TLS_DHE_RSA_WITH_AES_128_CBC_SHA = new CipherSuite("TLS_DHE_RSA_WITH_AES_128_CBC_SHA",
                              false,
                              KEY_EXCHANGE_DHE_RSA,
                              "RSA",
                              "AES_128_CBC",
                              "SHA",
                              CODE_TLS_DHE_RSA_WITH_AES_128_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "8CE987DF067EB03A3D00EA00B3B7BD9D", hash_generated_field = "0E3EE7799EBB2391F62A25FF8EEA2FA8")

    static final CipherSuite TLS_DH_anon_WITH_AES_128_CBC_SHA = new CipherSuite("TLS_DH_anon_WITH_AES_128_CBC_SHA",
                              false,
                              KEY_EXCHANGE_DH_anon,
                              "DH",
                              "AES_128_CBC",
                              "SHA",
                              CODE_TLS_DH_anon_WITH_AES_128_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "CDD6C72D072162DA03C5A6CADB02BEDA", hash_generated_field = "FD7B3241876CAEFD4CABC5D90E7C32AB")

    static final CipherSuite TLS_RSA_WITH_AES_256_CBC_SHA = new CipherSuite("TLS_RSA_WITH_AES_256_CBC_SHA",
                              false,
                              KEY_EXCHANGE_RSA,
                              "RSA",
                              "AES_256_CBC",
                              "SHA",
                              CODE_TLS_RSA_WITH_AES_256_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "3BA1C6C2FA496E4AD1CD21E789D5935D", hash_generated_field = "AAD783515C742E958091A4B6AFF9B893")

    static final CipherSuite TLS_DHE_DSS_WITH_AES_256_CBC_SHA = new CipherSuite("TLS_DHE_DSS_WITH_AES_256_CBC_SHA",
                              false,
                              KEY_EXCHANGE_DHE_DSS,
                              "DSA",
                              "AES_256_CBC",
                              "SHA",
                              CODE_TLS_DHE_DSS_WITH_AES_256_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "848B39E22AF0C1590EE89BACFEFF4419", hash_generated_field = "6F05E1E8A00C955C12D092EDE36F7B8E")

    static final CipherSuite TLS_DHE_RSA_WITH_AES_256_CBC_SHA = new CipherSuite("TLS_DHE_RSA_WITH_AES_256_CBC_SHA",
                              false,
                              KEY_EXCHANGE_DHE_RSA,
                              "RSA",
                              "AES_256_CBC",
                              "SHA",
                              CODE_TLS_DHE_RSA_WITH_AES_256_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "BCB0DEAEA6B363CF07E33B821A803138", hash_generated_field = "335E5630A77E2125CE8058A1267F0C68")

    static final CipherSuite TLS_DH_anon_WITH_AES_256_CBC_SHA = new CipherSuite("TLS_DH_anon_WITH_AES_256_CBC_SHA",
                              false,
                              KEY_EXCHANGE_DH_anon,
                              "DH",
                              "AES_256_CBC",
                              "SHA",
                              CODE_TLS_DH_anon_WITH_AES_256_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "529E23A8C8957496E987186F7FBE5586", hash_generated_field = "0FD043C3983298F2736EED01FE6F669F")

    static final CipherSuite TLS_ECDH_ECDSA_WITH_NULL_SHA = new CipherSuite("TLS_ECDH_ECDSA_WITH_NULL_SHA",
                              false,
                              KEY_EXCHANGE_ECDH_ECDSA,
                              "EC",
                              null,
                              "SHA",
                              CODE_TLS_ECDH_ECDSA_WITH_NULL_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "8C247A1904DF70F7BB85CC744692DED1", hash_generated_field = "2B08109835E833DF802EF5024346D1B9")

    static final CipherSuite TLS_ECDH_ECDSA_WITH_RC4_128_SHA = new CipherSuite("TLS_ECDH_ECDSA_WITH_RC4_128_SHA",
                              false,
                              KEY_EXCHANGE_ECDH_ECDSA,
                              "EC",
                              "RC4_128",
                              "SHA",
                              CODE_TLS_ECDH_ECDSA_WITH_RC4_128_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "C32E96948EF574761E4AD31652737E82", hash_generated_field = "E9A523735A20B9012788D560D665B90B")

    static final CipherSuite TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = new CipherSuite("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA",
                              false,
                              KEY_EXCHANGE_ECDH_ECDSA,
                              "EC",
                              "3DES_EDE_CBC",
                              "SHA",
                              CODE_TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "538F1D49A877A579E33A5A1CF6F5D46A", hash_generated_field = "7D90799D379D27E152FD4D02E9676242")

    static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = new CipherSuite("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA",
                              false,
                              KEY_EXCHANGE_ECDH_ECDSA,
                              "EC",
                              "AES_128_CBC",
                              "SHA",
                              CODE_TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "4F27E990EB3FF0E5F96FDC408ADABF8C", hash_generated_field = "6560CE38BA8E16356643505AB097D48B")

    static final CipherSuite TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = new CipherSuite("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA",
                              false,
                              KEY_EXCHANGE_ECDH_ECDSA,
                              "EC",
                              "AES_256_CBC",
                              "SHA",
                              CODE_TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "DF1E45DBCD7CECBC8982E444DBC83F9A", hash_generated_field = "F8B2CEAF062232368504A5E89426F9E9")

    static final CipherSuite TLS_ECDHE_ECDSA_WITH_NULL_SHA = new CipherSuite("TLS_ECDHE_ECDSA_WITH_NULL_SHA",
                              false,
                              KEY_EXCHANGE_ECDHE_ECDSA,
                              "EC",
                              null,
                              "SHA",
                              CODE_TLS_ECDHE_ECDSA_WITH_NULL_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "5B853E9F8D759E40ECDEEE995D8D1081", hash_generated_field = "BFC1CEF8CA8000E78AF9810400D9A32D")

    static final CipherSuite TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = new CipherSuite("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA",
                              false,
                              KEY_EXCHANGE_ECDHE_ECDSA,
                              "EC",
                              "RC4_128",
                              "SHA",
                              CODE_TLS_ECDHE_ECDSA_WITH_RC4_128_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "3C3509437063DE28422DEB98A45F2E27", hash_generated_field = "72ED4270D98336B0C3BB8A39DF005A46")

    static final CipherSuite TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = new CipherSuite("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA",
                              false,
                              KEY_EXCHANGE_ECDHE_ECDSA,
                              "EC",
                              "3DES_EDE_CBC",
                              "SHA",
                              CODE_TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "948AA1702BC1D5CE43FC7E2198FDFB13", hash_generated_field = "B5A295C844B8E785472FA0CEF2D4AAAE")

    static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = new CipherSuite("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA",
                              false,
                              KEY_EXCHANGE_ECDHE_ECDSA,
                              "EC",
                              "AES_128_CBC",
                              "SHA",
                              CODE_TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "11407F519667698994B20F3B515087E8", hash_generated_field = "7D47987C7DA10ECF4AE8F44310FD9A89")

    static final CipherSuite TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = new CipherSuite("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA",
                              false,
                              KEY_EXCHANGE_ECDHE_ECDSA,
                              "EC",
                              "AES_256_CBC",
                              "SHA",
                              CODE_TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "E3932CF707471E38A8BB4C64F12C5087", hash_generated_field = "E54A2F03372969B47BABC39404D3463A")

    static final CipherSuite TLS_ECDH_RSA_WITH_NULL_SHA = new CipherSuite("TLS_ECDH_RSA_WITH_NULL_SHA",
                              false,
                              KEY_EXCHANGE_ECDH_RSA,
                              "EC",
                              null,
                              "SHA",
                              CODE_TLS_ECDH_RSA_WITH_NULL_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "45E0CA8E84C759D4D6E4E7DF19CA9FCA", hash_generated_field = "A263CEE4445EE34E9D8B3C97BF46E30B")

    static final CipherSuite TLS_ECDH_RSA_WITH_RC4_128_SHA = new CipherSuite("TLS_ECDH_RSA_WITH_RC4_128_SHA",
                              false,
                              KEY_EXCHANGE_ECDH_RSA,
                              "EC",
                              "RC4_128",
                              "SHA",
                              CODE_TLS_ECDH_RSA_WITH_RC4_128_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "7D28328835EE4CE68B0FA23E83A05649", hash_generated_field = "E2EE05A590C49392CB1444A96016A2C9")

    static final CipherSuite TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = new CipherSuite("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA",
                              false,
                              KEY_EXCHANGE_ECDH_RSA,
                              "EC",
                              "3DES_EDE_CBC",
                              "SHA",
                              CODE_TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "07B504B7525AB604FA7A3E4F1EF038D1", hash_generated_field = "60FCAFFD6525833D5AB2A283EFFBAC82")

    static final CipherSuite TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = new CipherSuite("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA",
                              false,
                              KEY_EXCHANGE_ECDH_RSA,
                              "EC",
                              "AES_128_CBC",
                              "SHA",
                              CODE_TLS_ECDH_RSA_WITH_AES_128_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "F030A2C0E47E01398200CA9812DE61C2", hash_generated_field = "42F62210DBBD5A4E388D9071AF9DDC43")

    static final CipherSuite TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = new CipherSuite("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA",
                              false,
                              KEY_EXCHANGE_ECDH_RSA,
                              "EC",
                              "AES_256_CBC",
                              "SHA",
                              CODE_TLS_ECDH_RSA_WITH_AES_256_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "B838B3224F90A11F97E15DB822B8A691", hash_generated_field = "22B0D56DEDF9EADB572320BDB9890A1F")

    static final CipherSuite TLS_ECDHE_RSA_WITH_NULL_SHA = new CipherSuite("TLS_ECDHE_RSA_WITH_NULL_SHA",
                              false,
                              KEY_EXCHANGE_ECDHE_RSA,
                              "EC",
                              null,
                              "SHA",
                              CODE_TLS_ECDHE_RSA_WITH_NULL_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "25169813ED49ACB302A64AC6444ECB14", hash_generated_field = "CA2B4B5949504180CE23F87CA6C336DA")

    static final CipherSuite TLS_ECDHE_RSA_WITH_RC4_128_SHA = new CipherSuite("TLS_ECDHE_RSA_WITH_RC4_128_SHA",
                              false,
                              KEY_EXCHANGE_ECDHE_RSA,
                              "EC",
                              "RC4_128",
                              "SHA",
                              CODE_TLS_ECDHE_RSA_WITH_RC4_128_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "519C192BBC53C787AED7E8D7EACC5252", hash_generated_field = "8B1BF85626C932024360B746BB010CA9")

    static final CipherSuite TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = new CipherSuite("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA",
                              false,
                              KEY_EXCHANGE_ECDHE_RSA,
                              "EC",
                              "3DES_EDE_CBC",
                              "SHA",
                              CODE_TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "8617F33380D9651ED97B81901341155A", hash_generated_field = "27B8886CB275773240027AD9D691281B")

    static final CipherSuite TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = new CipherSuite("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA",
                              false,
                              KEY_EXCHANGE_ECDHE_RSA,
                              "EC",
                              "AES_128_CBC",
                              "SHA",
                              CODE_TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.762 -0400", hash_original_field = "3118B8406952E3404448A5FDA813A334", hash_generated_field = "6F2C755A81370853D491D0E2F68D5044")

    static final CipherSuite TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = new CipherSuite("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA",
                              false,
                              KEY_EXCHANGE_ECDHE_RSA,
                              "EC",
                              "AES_256_CBC",
                              "SHA",
                              CODE_TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "D2519B29CBC50B79AE029CEFA8D7F489", hash_generated_field = "62718CFA67EE49461AC5A2A4673670F6")

    static final CipherSuite TLS_ECDH_anon_WITH_NULL_SHA = new CipherSuite("TLS_ECDH_anon_WITH_NULL_SHA",
                              false,
                              KEY_EXCHANGE_ECDH_anon,
                              "EC",
                              null,
                              "SHA",
                              CODE_TLS_ECDH_anon_WITH_NULL_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "04883B5F6FD4D7C9F96A1702E420CD9E", hash_generated_field = "28FA75D7208157E5847A9A9E547923E2")

    static final CipherSuite TLS_ECDH_anon_WITH_RC4_128_SHA = new CipherSuite("TLS_ECDH_anon_WITH_RC4_128_SHA",
                              false,
                              KEY_EXCHANGE_ECDH_anon,
                              "EC",
                              "RC4_128",
                              "SHA",
                              CODE_TLS_ECDH_anon_WITH_RC4_128_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "F3D608F24BF6548AC6A5115C1FA380E7", hash_generated_field = "76D05EDC89E8B9F072A10299EA67E763")

    static final CipherSuite TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = new CipherSuite("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA",
                              false,
                              KEY_EXCHANGE_ECDH_anon,
                              "EC",
                              "3DES_EDE_CBC",
                              "SHA",
                              CODE_TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "99A5FDA80E518ABF45219FAC5391EE05", hash_generated_field = "127ABEC3217FAB607DCFD22E091810AA")

    static final CipherSuite TLS_ECDH_anon_WITH_AES_128_CBC_SHA = new CipherSuite("TLS_ECDH_anon_WITH_AES_128_CBC_SHA",
                              false,
                              KEY_EXCHANGE_ECDH_anon,
                              "EC",
                              "AES_128_CBC",
                              "SHA",
                              CODE_TLS_ECDH_anon_WITH_AES_128_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "16C0E8C6790E6192353F3BC8BFFCB17E", hash_generated_field = "F4073C60D92B0CA28419FB7EC41DF4D2")

    static final CipherSuite TLS_ECDH_anon_WITH_AES_256_CBC_SHA = new CipherSuite("TLS_ECDH_anon_WITH_AES_256_CBC_SHA",
                              false,
                              KEY_EXCHANGE_ECDH_anon,
                              "EC",
                              "AES_256_CBC",
                              "SHA",
                              CODE_TLS_ECDH_anon_WITH_AES_256_CBC_SHA);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "56C885DE7F21EFB338865EC44087086B", hash_generated_field = "A57E33320EFDB58BC95B05FA002C4089")

    private static final CipherSuite[] SUITES_BY_CODE_0x00 = {
        
        SSL_NULL_WITH_NULL_NULL,                          
        SSL_RSA_WITH_NULL_MD5,                            
        SSL_RSA_WITH_NULL_SHA,                            
        SSL_RSA_EXPORT_WITH_RC4_40_MD5,                   
        SSL_RSA_WITH_RC4_128_MD5,                         
        SSL_RSA_WITH_RC4_128_SHA,                         
        
        null, 
        null, 
        
        SSL_RSA_EXPORT_WITH_DES40_CBC_SHA,                
        SSL_RSA_WITH_DES_CBC_SHA,                         
        SSL_RSA_WITH_3DES_EDE_CBC_SHA,                    
        
        null, 
        null, 
        null, 
        null, 
        null, 
        null, 
        
        SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA,            
        SSL_DHE_DSS_WITH_DES_CBC_SHA,                     
        SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA,                
        SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA,            
        SSL_DHE_RSA_WITH_DES_CBC_SHA,                     
        SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA,                
        SSL_DH_anon_EXPORT_WITH_RC4_40_MD5,               
        SSL_DH_anon_WITH_RC4_128_MD5,                     
        SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA,            
        SSL_DH_anon_WITH_DES_CBC_SHA,                     
        SSL_DH_anon_WITH_3DES_EDE_CBC_SHA,                
        
        null, 
        null, 
        null, 
        null, 
        null, 
        null, 
        null, 
        null, 
        null, 
        null, 
        null, 
        null, 
        null, 
        null, 
        null, 
        null, 
        null, 
        null, 
        null, 
        TLS_RSA_WITH_AES_128_CBC_SHA,                     
        null, 
        null, 
        TLS_DHE_DSS_WITH_AES_128_CBC_SHA,                 
        TLS_DHE_RSA_WITH_AES_128_CBC_SHA,                 
        TLS_DH_anon_WITH_AES_128_CBC_SHA,                 
        TLS_RSA_WITH_AES_256_CBC_SHA,                     
        null, 
        null, 
        TLS_DHE_DSS_WITH_AES_256_CBC_SHA,                 
        TLS_DHE_RSA_WITH_AES_256_CBC_SHA,                 
        TLS_DH_anon_WITH_AES_256_CBC_SHA,                 
        
    };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "300732E628E4581C5A80D09D2331A561", hash_generated_field = "DE1C42203B38860361BEF2D8B4B6918A")

    private static final CipherSuite[] SUITES_BY_CODE_0xc0 = {
        null,                                             
        TLS_ECDH_ECDSA_WITH_NULL_SHA,                     
        TLS_ECDH_ECDSA_WITH_RC4_128_SHA,                  
        TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA,             
        TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA,              
        TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA,              
        TLS_ECDHE_ECDSA_WITH_NULL_SHA,                    
        TLS_ECDHE_ECDSA_WITH_RC4_128_SHA,                 
        TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA,            
        TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA,             
        TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA,             
        TLS_ECDH_RSA_WITH_NULL_SHA,                       
        TLS_ECDH_RSA_WITH_RC4_128_SHA,                    
        TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA,               
        TLS_ECDH_RSA_WITH_AES_128_CBC_SHA,                
        TLS_ECDH_RSA_WITH_AES_256_CBC_SHA,                
        TLS_ECDHE_RSA_WITH_NULL_SHA,                      
        TLS_ECDHE_RSA_WITH_RC4_128_SHA,                   
        TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA,              
        TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA,               
        TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA,               
        TLS_ECDH_anon_WITH_NULL_SHA,                      
        TLS_ECDH_anon_WITH_RC4_128_SHA,                   
        TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA,              
        TLS_ECDH_anon_WITH_AES_128_CBC_SHA,               
        TLS_ECDH_anon_WITH_AES_256_CBC_SHA,               
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "139C740AB5387886D95F04E59D8EBDCD", hash_generated_field = "E6AE8C29747288A1BFEE444F8739BBF9")

    private static Hashtable<String, CipherSuite> SUITES_BY_NAME;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "24D46A327FE03D7E6A9CE5B8E4DCEF2E", hash_generated_field = "E9A16A2EC77F47C33B1348B57F2B0E8D")

    static CipherSuite[] SUPPORTED_CIPHER_SUITES;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "6B0E8F6FA11512BFE5C0B99C8989CC6F", hash_generated_field = "376EF07F673B6998B2F9A878D03DBFB3")

    static String[] SUPPORTED_CIPHER_SUITE_NAMES;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "D1C930443411A66004711F0EDB3C2B79", hash_generated_field = "4E9325578392D367E47C3B814905F855")

    static CipherSuite[] DEFAULT_CIPHER_SUITES;
    static {
        SUITES_BY_NAME = new Hashtable<String, CipherSuite>();
        int count_0x00 = registerCipherSuitesByCode(SUITES_BY_CODE_0x00);
        int count_0xc0 = registerCipherSuitesByCode(SUITES_BY_CODE_0xc0);
        int count = count_0x00 + count_0xc0;
        SUPPORTED_CIPHER_SUITES = new CipherSuite[count];
        SUPPORTED_CIPHER_SUITE_NAMES = new String[count];
        registerSupportedCipherSuites(0, SUITES_BY_CODE_0x00);
        registerSupportedCipherSuites(count_0x00, SUITES_BY_CODE_0xc0);
        CipherSuite[] defaultCipherSuites = {
                SSL_RSA_WITH_RC4_128_MD5,
                SSL_RSA_WITH_RC4_128_SHA,
                TLS_RSA_WITH_AES_128_CBC_SHA,
                TLS_DHE_RSA_WITH_AES_128_CBC_SHA,
                TLS_DHE_DSS_WITH_AES_128_CBC_SHA,
                SSL_RSA_WITH_3DES_EDE_CBC_SHA,
                SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA,
                SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA,
                SSL_RSA_WITH_DES_CBC_SHA,
                SSL_DHE_RSA_WITH_DES_CBC_SHA,
                SSL_DHE_DSS_WITH_DES_CBC_SHA,
                SSL_RSA_EXPORT_WITH_RC4_40_MD5,
                SSL_RSA_EXPORT_WITH_DES40_CBC_SHA,
                SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA,
                SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA
                };
        count = 0;
        for (int i = 0; i < defaultCipherSuites.length; i++) {
            if (defaultCipherSuites[i].supported) {
                count++;
            }
        }
        DEFAULT_CIPHER_SUITES = new CipherSuite[count];
        count = 0;
        for (int i = 0; i < defaultCipherSuites.length; i++) {
            if (defaultCipherSuites[i].supported) {
                DEFAULT_CIPHER_SUITES[count++] = defaultCipherSuites[i];
            }
        }
    }
    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "D6A7C7AEA7B6F82D08C7C56FCE6AC0D4", hash_generated_field = "77F19AD70EC1D24EA7A28598362432C7")

    static final String KEY_TYPE_RSA = "RSA";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "5EC220A2FE46BE6E43108AFBF766A2BD", hash_generated_field = "630B9C0F0D3AEF35E7DA4AFECEA78C9E")

    static final String KEY_TYPE_DSA = "DSA";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "D3C08514884E3DF537B50AB844EFB507", hash_generated_field = "BBFA8237258AF99FD71034F7C308BAB7")

    static final String KEY_TYPE_DH_RSA = "DH_RSA";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "4C0ADB901EFCED594ECEABA4A687901E", hash_generated_field = "798846ECC75FFD68618D68A4E6BBEA1A")

    static final String KEY_TYPE_DH_DSA = "DH_DSA";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "49516C6C3011CF57D44A59490E5A9815", hash_generated_field = "6A52F3EA9F4D6C1C640E606E484D7E70")

    static final String KEY_TYPE_EC = "EC";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "D9D6A8C120458B0A7F50D2DE54BC5B60", hash_generated_field = "0AFB1B56EF398E2AD8997CF42FB3B02E")

    static final String KEY_TYPE_EC_EC = "EC_EC";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "6BAE5893CB2E7F42B8902E40CE60B4BA", hash_generated_field = "344A5567B54FB40D54D3A25A3053E86D")

    static final String KEY_TYPE_EC_RSA = "EC_RSA";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "825D2570FD0204CF12985287D6FB24E6", hash_generated_field = "C4A8DFCA6F3D8F40BB452A430E404195")

    static final byte TLS_CT_RSA_SIGN = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "777B362283CC16F0ACC5C954D7559F86", hash_generated_field = "C6811E746D7BC22CF1AF4DFA56868830")

    static final byte TLS_CT_DSS_SIGN = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "75E050F0B0CBCDFC8EBDECC84879FBCE", hash_generated_field = "5EC79EFF91BAD8AC13CF075127EFF1E0")

    static final byte TLS_CT_RSA_FIXED_DH = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "1095BF115D6D0391A86DCE1CDB2B50CB", hash_generated_field = "8C7457C0B8540DA372E8FB0BA2A79F91")

    static final byte TLS_CT_DSS_FIXED_DH = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "BCE24F50487AC8339654DCDD6595F5E3", hash_generated_field = "B70A5C7DD08BB9D673DDC6524F916C5C")

    static final byte TLS_CT_ECDSA_SIGN = 64;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "10D9001EB9D905E671162BA4B10E47F5", hash_generated_field = "D6FEF529A7E04C9C8D86EB205CBFF183")

    static final byte TLS_CT_RSA_FIXED_ECDH = 65;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "806F5C4FC9FE894B740FF55FD06AACCD", hash_generated_field = "E4A4DDEF6F68FB196493EF24ED4F301E")

    static final byte TLS_CT_ECDSA_FIXED_ECDH = 66;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "7AE08B7CCDD7CF8212076711C9D505CD", hash_generated_field = "75BBB8F06193906FA068195C91CC982F")

    private static final String AUTH_TYPE_RSA = "RSA";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "4DDEB697ED4E7D8B713A1F7579F9E489", hash_generated_field = "8590A0B84340C915C8FC0330943D3EE4")

    private static final String AUTH_TYPE_RSA_EXPORT = "RSA_EXPORT";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "281EAA1C5180DE50D452ECDB5DA4FF49", hash_generated_field = "C267CFB88B3F31A3D3009A6EE4B22BFE")

    private static final String AUTH_TYPE_DHE_DSS = "DHE_DSS";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "4B04C67C4718F76B710AAEF1F2D9D567", hash_generated_field = "360C9EDA248CB77FB2D73A7ECB2ED787")

    private static final String AUTH_TYPE_DHE_RSA = "DHE_RSA";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "960B8D6FF5DC2F6165D2A647DE0B17EA", hash_generated_field = "2983AD5B9C775809F07BA3FC6211F923")

    private static final String AUTH_TYPE_DH_DSS = "DH_DSS";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "D39A041502FC98BD7C71350547E77FB9", hash_generated_field = "0B15F4F51D7DA5484907C39F1BEA9F2C")

    private static final String AUTH_TYPE_DH_RSA = "DH_RSA";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "14048D62665387F889CAA0DB21876279", hash_generated_field = "A37F258BAA1BF58A5C6D48FB47F926DA")

    private static final String AUTH_TYPE_ECDH_ECDSA = "ECDH_ECDSA";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.763 -0400", hash_original_field = "3376756728CEAAF1BF103D7C49D9D5D8", hash_generated_field = "0591670FC863EEEBF5B81DE869317CFE")

    private static final String AUTH_TYPE_ECDH_RSA = "ECDH_RSA";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.764 -0400", hash_original_field = "5178DA7E41530757238EF1EF311F495E", hash_generated_field = "6AAF5398435B5C69C03F959E8CF31F67")

    private static final String AUTH_TYPE_ECDHE_ECDSA = "ECDHE_ECDSA";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.764 -0400", hash_original_field = "2AEDCFA92F4B83C2F9ABF31B48A38FCA", hash_generated_field = "617756BEB2E239C83DF1B98C0BC9C5C1")

    private static final String AUTH_TYPE_ECDHE_RSA = "ECDHE_RSA";
}

