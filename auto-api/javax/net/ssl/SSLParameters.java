package javax.net.ssl;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;

public class SSLParameters {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.656 -0400", hash_original_field = "1C532BC39D7AA0CB5600E8C5B247F609", hash_generated_field = "411F1A5A89267DD4FA4546E0300DEE75")

    private String[] cipherSuites;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.656 -0400", hash_original_field = "66203C461B36A2AF573149F0AA6164FF", hash_generated_field = "DC671C4B6787E3B95959CD8B3344C9E7")

    private String[] protocols;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.656 -0400", hash_original_field = "AB2177731EDE446534AF45C842A8755B", hash_generated_field = "D1808204922229004297FAD1D2005F13")

    private boolean needClientAuth;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.656 -0400", hash_original_field = "86DEF88DB1B1A166C8B59083E28A44E5", hash_generated_field = "3F96E6A31CF0EB182354E75513AE65DF")

    private boolean wantClientAuth;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.657 -0400", hash_original_method = "022ED5C9FE213591085C06A06ECFC7AA", hash_generated_method = "BBDF6E2887D5278290E7EDE7DA43D833")
    public  SSLParameters() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.658 -0400", hash_original_method = "A6B6F0535750EB460CCEE975AE95DC3A", hash_generated_method = "AF50FD2670E50071725734E472189490")
    public  SSLParameters(String[] cipherSuites) {
        setCipherSuites(cipherSuites);
        addTaint(cipherSuites[0].getTaint());
        // ---------- Original Method ----------
        //setCipherSuites(cipherSuites);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.660 -0400", hash_original_method = "C1FFBB4FE86E468D8BAF1D7971E89CFD", hash_generated_method = "84EBF974C7A1F177A23ED7A23BBB18F9")
    public  SSLParameters(String[] cipherSuites,
                         String[] protocols) {
        setCipherSuites(cipherSuites);
        setProtocols(protocols);
        addTaint(cipherSuites[0].getTaint());
        addTaint(protocols[0].getTaint());
        // ---------- Original Method ----------
        //setCipherSuites(cipherSuites);
        //setProtocols(protocols);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.663 -0400", hash_original_method = "4A4F1106EE48461B88F50C671836AAA1", hash_generated_method = "A6D2C2DC0351E27F6E47C881AC500794")
    public String[] getCipherSuites() {
        String[] varB4EAC82CA7396A68D541C85D26508E83_850665861 = null; //Variable for return #1
        String[] varB4EAC82CA7396A68D541C85D26508E83_80510132 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_850665861 = null;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_80510132 = cipherSuites.clone();
        String[] varA7E53CE21691AB073D9660D615818899_164741275; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_164741275 = varB4EAC82CA7396A68D541C85D26508E83_850665861;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_164741275 = varB4EAC82CA7396A68D541C85D26508E83_80510132;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_164741275.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_164741275;
        // ---------- Original Method ----------
        //if (cipherSuites == null) {
            //return null;
        //}
        //return cipherSuites.clone();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.664 -0400", hash_original_method = "9E670D049040F6D0CEE95ADCC5A2BB8E", hash_generated_method = "4B64EAD1DECBC9F9BF26C083131225FE")
    public void setCipherSuites(String[] cipherSuites) {
        this.cipherSuites = ((cipherSuites == null)
                             ? null
                             : cipherSuites.clone());
        // ---------- Original Method ----------
        //this.cipherSuites = ((cipherSuites == null)
                             //? null
                             //: cipherSuites.clone());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.666 -0400", hash_original_method = "4DAE6AE8C86EF57BE9BF60BD0F445F08", hash_generated_method = "C324A83673D994C4BD198BE98A282ABF")
    public String[] getProtocols() {
        String[] varB4EAC82CA7396A68D541C85D26508E83_541985380 = null; //Variable for return #1
        String[] varB4EAC82CA7396A68D541C85D26508E83_668267898 = null; //Variable for return #2
        {
            varB4EAC82CA7396A68D541C85D26508E83_541985380 = null;
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_668267898 = protocols.clone();
        String[] varA7E53CE21691AB073D9660D615818899_514575349; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_514575349 = varB4EAC82CA7396A68D541C85D26508E83_541985380;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_514575349 = varB4EAC82CA7396A68D541C85D26508E83_668267898;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_514575349.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_514575349;
        // ---------- Original Method ----------
        //if (protocols == null) {
            //return null;
        //}
        //return protocols.clone();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.666 -0400", hash_original_method = "EF8F568BAE6FA22D6783DD8D622D3566", hash_generated_method = "9E02EDF06381A48F6DDCDB7FDE37BC1B")
    public void setProtocols(String[] protocols) {
        this.protocols = ((protocols == null)
                             ? null
                             : protocols.clone());
        // ---------- Original Method ----------
        //this.protocols = ((protocols == null)
                             //? null
                             //: protocols.clone());
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.666 -0400", hash_original_method = "0562A9D6063DDE1E14D46646F3CBBD06", hash_generated_method = "136E0A1D7D80505AFD8214707DC5FD33")
    public boolean getNeedClientAuth() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_632136104 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_632136104;
        // ---------- Original Method ----------
        //return needClientAuth;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.666 -0400", hash_original_method = "22A4FDEF203263AAF8FD895025373324", hash_generated_method = "7190D12EE7B69134109AE618F466102E")
    public void setNeedClientAuth(boolean needClientAuth) {
        this.needClientAuth = needClientAuth;
        this.wantClientAuth = false;
        // ---------- Original Method ----------
        //this.needClientAuth = needClientAuth;
        //this.wantClientAuth = false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.667 -0400", hash_original_method = "B012F9400DE611969BC8B2969D6766E0", hash_generated_method = "FE319F9450D2D010475D1CE49949F7A5")
    public boolean getWantClientAuth() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_242622702 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_242622702;
        // ---------- Original Method ----------
        //return wantClientAuth;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:17.667 -0400", hash_original_method = "363F6F59B4A070AED132C2E96BCCEA5B", hash_generated_method = "9B8353396C409A957C3BF33E58027F47")
    public void setWantClientAuth(boolean wantClientAuth) {
        this.wantClientAuth = wantClientAuth;
        this.needClientAuth = false;
        // ---------- Original Method ----------
        //this.wantClientAuth = wantClientAuth;
        //this.needClientAuth = false;
    }

    
}

