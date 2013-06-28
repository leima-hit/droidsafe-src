package org.apache.harmony.security.x509;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.apache.harmony.security.asn1.ASN1SequenceOf;
import org.apache.harmony.security.asn1.ASN1Type;
import org.apache.harmony.security.asn1.BerInputStream;

public final class Extensions {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.929 -0400", hash_original_field = "2AC737D240FC746CEF37129B7569F08E", hash_generated_field = "F93AA8349A2FA92AE6135244F491401E")

    private List<Extension> extensions;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.929 -0400", hash_original_field = "7E85BCB66FB9A809D5AB4F62A8B8BEA8", hash_generated_field = "8AE6968FB7018EBEDA25C054995E291B")

    private Set<String> critical;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.929 -0400", hash_original_field = "ACC02843792BA46B7A7EB0B1788A22C6", hash_generated_field = "6827F144A18995AA402D9FA96B7DCC8C")

    private Set<String> noncritical;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.929 -0400", hash_original_field = "416ECF4BA061CEB2F9353023282FCF57", hash_generated_field = "7B4E2AB69860A448C1B3D04CF6B0EB86")

    private boolean hasUnsupported;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.929 -0400", hash_original_field = "38BC3F68B4757D145BD31C0F88C48214", hash_generated_field = "3CBB0703D1DDEAD49B98A4F5CB8F1949")

    private HashMap<String, Extension> oidMap;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.929 -0400", hash_original_field = "84BEA1F0FD2CE16F7E562A9F06EF03D3", hash_generated_field = "ACB189C73E1A6432570001B3B9D3D516")

    private byte[] encoding;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.930 -0400", hash_original_method = "4F6254C867328A153FDD5BD23453E816", hash_generated_method = "8D1DB2771425E2517B9F7DC7528BABC1")
    public  Extensions() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.930 -0400", hash_original_method = "89146A86DD080B3422EC5033031F1DF4", hash_generated_method = "EBF9C74A91F031E9B43BDAD943D3244E")
    public  Extensions(List<Extension> extensions) {
        this.extensions = extensions;
        // ---------- Original Method ----------
        //this.extensions = extensions;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.930 -0400", hash_original_method = "B4520EB3CA6AF47BBFFA43544D7C2D00", hash_generated_method = "463E6954BEE2698EC048FCDD8850DCF5")
    public int size() {
        {
            Object var25C8BD0175A5F6C233FBF28199D5859F_9075443 = (extensions.size());
        } //End flattened ternary
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1591267475 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1591267475;
        // ---------- Original Method ----------
        //return (extensions == null) ? 0 : extensions.size();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.931 -0400", hash_original_method = "6A8A6C791C17F1564EF710302C5F6E38", hash_generated_method = "A7DAE861703D2AC03BA09F445636100B")
    public Set<String> getCriticalExtensions() {
        Set<String> varB4EAC82CA7396A68D541C85D26508E83_337175746 = null; //Variable for return #1
        {
            makeOidsLists();
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_337175746 = critical;
        varB4EAC82CA7396A68D541C85D26508E83_337175746.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_337175746;
        // ---------- Original Method ----------
        //if (critical == null) {
            //makeOidsLists();
        //}
        //return critical;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.931 -0400", hash_original_method = "A9814A684588F34F98E6563F2443DAA6", hash_generated_method = "D5F28B4BBEE6390648AA3691B31A4561")
    public Set<String> getNonCriticalExtensions() {
        Set<String> varB4EAC82CA7396A68D541C85D26508E83_586822048 = null; //Variable for return #1
        {
            makeOidsLists();
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_586822048 = noncritical;
        varB4EAC82CA7396A68D541C85D26508E83_586822048.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_586822048;
        // ---------- Original Method ----------
        //if (noncritical == null) {
            //makeOidsLists();
        //}
        //return noncritical;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.931 -0400", hash_original_method = "CA1C7754653BDDEC58CFB11BB71C11DB", hash_generated_method = "2EECDD447A8E0153D24FC4DA1B24D27E")
    public boolean hasUnsupportedCritical() {
        {
            makeOidsLists();
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2046752656 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2046752656;
        // ---------- Original Method ----------
        //if (critical == null) {
            //makeOidsLists();
        //}
        //return hasUnsupported;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.936 -0400", hash_original_method = "F144B02FA833AD81E1DCC6E0D8E9952F", hash_generated_method = "7F700BBE5F0767BFFD6F99899294F5C5")
    private void makeOidsLists() {
        int size = extensions.size();
        critical = new HashSet<String>(size);
        noncritical = new HashSet<String>(size);
        {
            Iterator<Extension> var8FD9017ABC8765E97936874D90CDB6D8_1440941330 = (extensions).iterator();
            var8FD9017ABC8765E97936874D90CDB6D8_1440941330.hasNext();
            Extension extension = var8FD9017ABC8765E97936874D90CDB6D8_1440941330.next();
            {
                String oid = extension.getExtnID();
                {
                    boolean var890C8545AA65378EB03A21B27E363703_508189451 = (extension.getCritical());
                    {
                        {
                            boolean var055078D0CE1FA9550F7F9B8CC0B361FD_156609319 = (!SUPPORTED_CRITICAL.contains(oid));
                            {
                                hasUnsupported = true;
                            } //End block
                        } //End collapsed parenthetic
                        critical.add(oid);
                    } //End block
                    {
                        noncritical.add(oid);
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //if (extensions == null) {
            //return;
        //}
        //int size = extensions.size();
        //critical = new HashSet<String>(size);
        //noncritical = new HashSet<String>(size);
        //for (Extension extension : extensions) {
            //String oid = extension.getExtnID();
            //if (extension.getCritical()) {
                //if (!SUPPORTED_CRITICAL.contains(oid)) {
                    //hasUnsupported = true;
                //}
                //critical.add(oid);
            //} else {
                //noncritical.add(oid);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.940 -0400", hash_original_method = "44703E9781E0014C266798D0DB277AFC", hash_generated_method = "957177FD5B8B9A3A0C5745C853BB62E7")
    public Extension getExtensionByOID(String oid) {
        Extension varB4EAC82CA7396A68D541C85D26508E83_588286169 = null; //Variable for return #1
        Extension varB4EAC82CA7396A68D541C85D26508E83_1202534817 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_588286169 = null;
        } //End block
        {
            oidMap = new HashMap<String, Extension>();
            {
                Iterator<Extension> var8FD9017ABC8765E97936874D90CDB6D8_104542212 = (extensions).iterator();
                var8FD9017ABC8765E97936874D90CDB6D8_104542212.hasNext();
                Extension extension = var8FD9017ABC8765E97936874D90CDB6D8_104542212.next();
                {
                    oidMap.put(extension.getExtnID(), extension);
                } //End block
            } //End collapsed parenthetic
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1202534817 = oidMap.get(oid);
        addTaint(oid.getTaint());
        Extension varA7E53CE21691AB073D9660D615818899_110626155; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_110626155 = varB4EAC82CA7396A68D541C85D26508E83_588286169;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_110626155 = varB4EAC82CA7396A68D541C85D26508E83_1202534817;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_110626155.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_110626155;
        // ---------- Original Method ----------
        //if (extensions == null) {
            //return null;
        //}
        //if (oidMap == null) {
            //oidMap = new HashMap<String, Extension>();
            //for (Extension extension : extensions) {
                //oidMap.put(extension.getExtnID(), extension);
            //}
        //}
        //return oidMap.get(oid);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.941 -0400", hash_original_method = "67C71F044BBB9B405BEFA4564A602892", hash_generated_method = "CE32495C5ABE025AEC3B4EEBD5BC3DE1")
    public boolean[] valueOfKeyUsage() {
        Extension extension = getExtensionByOID("2.5.29.15");
        KeyUsage kUsage;
        {
            boolean varF3595B2B157720F192ED02C0BBBDFB37_1652842127 = ((extension == null) || ((kUsage = extension.getKeyUsageValue()) == null));
        } //End collapsed parenthetic
        boolean[] var511ABEB91310283286824915011853D8_1976065985 = (kUsage.getKeyUsage());
        boolean[] var503EB2F420079C4024483971CE5EDEA8_556631874 = {getTaintBoolean()};
        return var503EB2F420079C4024483971CE5EDEA8_556631874;
        // ---------- Original Method ----------
        //Extension extension = getExtensionByOID("2.5.29.15");
        //KeyUsage kUsage;
        //if ((extension == null) || ((kUsage = extension.getKeyUsageValue()) == null)) {
            //return null;
        //}
        //return kUsage.getKeyUsage();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.943 -0400", hash_original_method = "84A63CE35CC08D6818168132AFB51A65", hash_generated_method = "923A8BE41BA5D380C7C73E1982919E3F")
    public List<String> valueOfExtendedKeyUsage() throws IOException {
        List<String> varB4EAC82CA7396A68D541C85D26508E83_1572646899 = null; //Variable for return #1
        List<String> varB4EAC82CA7396A68D541C85D26508E83_677246783 = null; //Variable for return #2
        Extension extension = getExtensionByOID("2.5.29.37");
        {
            varB4EAC82CA7396A68D541C85D26508E83_1572646899 = null;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_677246783 = ((ExtendedKeyUsage) extension.getDecodedExtensionValue()).getExtendedKeyUsage();
        List<String> varA7E53CE21691AB073D9660D615818899_31512416; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_31512416 = varB4EAC82CA7396A68D541C85D26508E83_1572646899;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_31512416 = varB4EAC82CA7396A68D541C85D26508E83_677246783;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_31512416.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_31512416;
        // ---------- Original Method ----------
        //Extension extension = getExtensionByOID("2.5.29.37");
        //if (extension == null) {
            //return null;
        //}
        //return ((ExtendedKeyUsage) extension.getDecodedExtensionValue()).getExtendedKeyUsage();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.944 -0400", hash_original_method = "CD9DAABD8089C73414664CD384AA791C", hash_generated_method = "1E6F7C2C52C89E07132CF9A17E51402D")
    public int valueOfBasicConstrains() {
        Extension extension = getExtensionByOID("2.5.29.19");
        BasicConstraints bc;
        {
            boolean varD6D8B93AD6192498EF11D9085C76974A_1042069418 = ((extension == null) || ((bc = extension.getBasicConstraintsValue()) == null));
        } //End collapsed parenthetic
        int varD9665725528058AFF959C1C75668237D_1140738903 = (bc.getPathLenConstraint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_20564847 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_20564847;
        // ---------- Original Method ----------
        //Extension extension = getExtensionByOID("2.5.29.19");
        //BasicConstraints bc;
        //if ((extension == null) || ((bc = extension.getBasicConstraintsValue()) == null)) {
            //return Integer.MAX_VALUE;
        //}
        //return bc.getPathLenConstraint();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.947 -0400", hash_original_method = "05742F8CFC468BD801B4E723F95A84AD", hash_generated_method = "9597ED7DF4354FCAC1A12C29B02475EF")
    public Collection<List<?>> valueOfSubjectAlternativeName() throws IOException {
        Collection<List<?>> varB4EAC82CA7396A68D541C85D26508E83_533122358 = null; //Variable for return #1
        Collection<List<?>> varB4EAC82CA7396A68D541C85D26508E83_221314245 = null; //Variable for return #2
        Extension extension = getExtensionByOID("2.5.29.17");
        {
            varB4EAC82CA7396A68D541C85D26508E83_533122358 = null;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_221314245 = ((GeneralNames) GeneralNames.ASN1.decode(extension.getExtnValue())).getPairsList();
        Collection<List<?>> varA7E53CE21691AB073D9660D615818899_834208607; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_834208607 = varB4EAC82CA7396A68D541C85D26508E83_533122358;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_834208607 = varB4EAC82CA7396A68D541C85D26508E83_221314245;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_834208607.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_834208607;
        // ---------- Original Method ----------
        //Extension extension = getExtensionByOID("2.5.29.17");
        //if (extension == null) {
            //return null;
        //}
        //return ((GeneralNames) GeneralNames.ASN1.decode(extension.getExtnValue())).getPairsList();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.949 -0400", hash_original_method = "03BB26B095671170BC4A5910FD38473D", hash_generated_method = "32D36C975BB557D47BE0EF1262ED18B7")
    public Collection<List<?>> valueOfIssuerAlternativeName() throws IOException {
        Collection<List<?>> varB4EAC82CA7396A68D541C85D26508E83_1351010401 = null; //Variable for return #1
        Collection<List<?>> varB4EAC82CA7396A68D541C85D26508E83_464486868 = null; //Variable for return #2
        Extension extension = getExtensionByOID("2.5.29.18");
        {
            varB4EAC82CA7396A68D541C85D26508E83_1351010401 = null;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_464486868 = ((GeneralNames) GeneralNames.ASN1.decode(extension.getExtnValue())).getPairsList();
        Collection<List<?>> varA7E53CE21691AB073D9660D615818899_1948533600; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1948533600 = varB4EAC82CA7396A68D541C85D26508E83_1351010401;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1948533600 = varB4EAC82CA7396A68D541C85D26508E83_464486868;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1948533600.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1948533600;
        // ---------- Original Method ----------
        //Extension extension = getExtensionByOID("2.5.29.18");
        //if (extension == null) {
            //return null;
        //}
        //return ((GeneralNames) GeneralNames.ASN1.decode(extension.getExtnValue())).getPairsList();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.951 -0400", hash_original_method = "7B080EDEBF008BF89BEA15CA32B37546", hash_generated_method = "4C11B25EBCBCF39206A7E55B7E9DEBC8")
    public X500Principal valueOfCertificateIssuerExtension() throws IOException {
        X500Principal varB4EAC82CA7396A68D541C85D26508E83_84014278 = null; //Variable for return #1
        X500Principal varB4EAC82CA7396A68D541C85D26508E83_722673428 = null; //Variable for return #2
        Extension extension = getExtensionByOID("2.5.29.29");
        {
            varB4EAC82CA7396A68D541C85D26508E83_84014278 = null;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_722673428 = ((CertificateIssuer) extension.getDecodedExtensionValue()).getIssuer();
        X500Principal varA7E53CE21691AB073D9660D615818899_1197363624; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1197363624 = varB4EAC82CA7396A68D541C85D26508E83_84014278;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1197363624 = varB4EAC82CA7396A68D541C85D26508E83_722673428;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1197363624.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1197363624;
        // ---------- Original Method ----------
        //Extension extension = getExtensionByOID("2.5.29.29");
        //if (extension == null) {
            //return null;
        //}
        //return ((CertificateIssuer) extension.getDecodedExtensionValue()).getIssuer();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.951 -0400", hash_original_method = "8CF73AB8FE0E45F61A0A453F52513BE8", hash_generated_method = "EA680CBD11E5A157B03B406DC0758F53")
    public byte[] getEncoded() {
        {
            encoding = ASN1.encode(this);
        } //End block
        byte[] var2F9C81BC6E497382285CD6B7A7E33DE1_1068606435 = {getTaintByte()};
        return var2F9C81BC6E497382285CD6B7A7E33DE1_1068606435;
        // ---------- Original Method ----------
        //if (encoding == null) {
            //encoding = ASN1.encode(this);
        //}
        //return encoding;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.952 -0400", hash_original_method = "C22B11DD1D34238E2A26C4258C487EE2", hash_generated_method = "50A8AC8DF6F253B3EDD63148925F1F0B")
    @Override
    public boolean equals(Object other) {
        Extensions that = (Extensions) other;
        {
            boolean var4B189EE36D32785294CD88DE4E2158BD_693104310 = ((this.extensions == null || this.extensions.isEmpty()));
            Object varCF104E9947E7F26A470B65D4A312A36F_1970825252 = ((that.extensions == null || that.extensions.isEmpty()));
            Object var7022CED6C445A8636D66A199E61288B0_1527591785 = ((this.extensions.equals(that.extensions)));
        } //End flattened ternary
        addTaint(other.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_372549233 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_372549233;
        // ---------- Original Method ----------
        //if (!(other instanceof Extensions)) {
            //return false;
        //}
        //Extensions that = (Extensions) other;
        //return (this.extensions == null || this.extensions.isEmpty())
                    //? (that.extensions == null || that.extensions.isEmpty())
                    //: (this.extensions.equals(that.extensions));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.953 -0400", hash_original_method = "4C94C64ABE7312C3D3BBBB76E6D36C32", hash_generated_method = "5BDE2E5FAF22CFF5FCBEC8ED00CEB1AA")
    @Override
    public int hashCode() {
        int hashCode = 0;
        {
            hashCode = extensions.hashCode();
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_750803896 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_750803896;
        // ---------- Original Method ----------
        //int hashCode = 0;
        //if (extensions != null) {
            //hashCode = extensions.hashCode();
        //}
        //return hashCode;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.958 -0400", hash_original_method = "F4C0EB00BC61B6C3C716F9B41C861C66", hash_generated_method = "FC760283BA1AF56B256A0E868D073D37")
    public void dumpValue(StringBuilder sb, String prefix) {
        int num = 1;
        {
            Iterator<Extension> var64800BC157F0004EFD25CD350D992D15_1663925561 = (extensions).iterator();
            var64800BC157F0004EFD25CD350D992D15_1663925561.hasNext();
            Extension extension = var64800BC157F0004EFD25CD350D992D15_1663925561.next();
            {
                sb.append('\n').append(prefix).append('[').append(num++).append("]: ");
                extension.dumpValue(sb, prefix);
            } //End block
        } //End collapsed parenthetic
        addTaint(sb.getTaint());
        addTaint(prefix.getTaint());
        // ---------- Original Method ----------
        //if (extensions == null) {
            //return;
        //}
        //int num = 1;
        //for (Extension extension: extensions) {
            //sb.append('\n').append(prefix).append('[').append(num++).append("]: ");
            //extension.dumpValue(sb, prefix);
        //}
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.958 -0400", hash_original_field = "F5223D36B00E0FFCDDF9B2B995079CF2", hash_generated_field = "2D002C30AF2816E4CD220F420C40FBAD")

    private static List SUPPORTED_CRITICAL = Arrays.asList(
            "2.5.29.15", "2.5.29.19", "2.5.29.32", "2.5.29.17",
            "2.5.29.30", "2.5.29.36", "2.5.29.37", "2.5.29.54");
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:34.958 -0400", hash_original_field = "9F138981CD4E842F83065885738EAA09", hash_generated_field = "325D4B839B8846AF06D5B6C75FEBE62A")

    public static final ASN1Type ASN1 = new ASN1SequenceOf(Extension.ASN1) {
        @Override public Object getDecodedObject(BerInputStream in) {
            return new Extensions((List<Extension>) in.content);
        }

        @Override public Collection getValues(Object object) {
            Extensions extensions = (Extensions) object;
            return (extensions.extensions == null) ? new ArrayList() : extensions.extensions;
        }
    };
    // orphaned legacy method
    @Override public Collection getValues(Object object) {
            Extensions extensions = (Extensions) object;
            return (extensions.extensions == null) ? new ArrayList() : extensions.extensions;
        }
    
    // orphaned legacy method
    @Override public Object getDecodedObject(BerInputStream in) {
            return new Extensions((List<Extension>) in.content);
        }
    
}

