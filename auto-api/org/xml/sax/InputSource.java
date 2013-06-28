package org.xml.sax;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.InputStream;
import java.io.Reader;

public class InputSource {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.770 -0400", hash_original_field = "24AB20BFB578F0A89FF4A9C081F21384", hash_generated_field = "60BF385FD0C88E4BC32EFD3E71F5528C")

    private String publicId;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.770 -0400", hash_original_field = "089D1A278481B86E821237F8E98E6DE7", hash_generated_field = "D8573F28EF4599A1790219EF1708D9C9")

    private String systemId;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.770 -0400", hash_original_field = "04C58E7EA9C250FD95881822011BDF22", hash_generated_field = "F48D8933D1E0CC3DCA366E513A5A0250")

    private InputStream byteStream;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.770 -0400", hash_original_field = "84BEA1F0FD2CE16F7E562A9F06EF03D3", hash_generated_field = "AA03A19AA54A465901EEA798BB232EAE")

    private String encoding;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.770 -0400", hash_original_field = "537EB9017301361716D8F0B0A9C21991", hash_generated_field = "063FD46ACCBF055B33EB5A7725463DCE")

    private Reader characterStream;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.770 -0400", hash_original_method = "ECF04DED512C86950B6E52F582DBB4DE", hash_generated_method = "179D2E0E4F762DB57C25831D6BADEBE2")
    public  InputSource() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.770 -0400", hash_original_method = "7919F547FCB87899F58CF069384E6AAD", hash_generated_method = "0185B3ABEFEC44E6E155B6E7255E6165")
    public  InputSource(String systemId) {
        setSystemId(systemId);
        addTaint(systemId.getTaint());
        // ---------- Original Method ----------
        //setSystemId(systemId);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.770 -0400", hash_original_method = "7C3B72CDCF95023F438211CC038E601E", hash_generated_method = "D7E1606A260C1A2A065B48E963D360DA")
    public  InputSource(InputStream byteStream) {
        setByteStream(byteStream);
        addTaint(byteStream.getTaint());
        // ---------- Original Method ----------
        //setByteStream(byteStream);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.771 -0400", hash_original_method = "F589E4069755916CEDC29D447D78E1F5", hash_generated_method = "822B773D1810667B85BD1358037150E4")
    public  InputSource(Reader characterStream) {
        setCharacterStream(characterStream);
        addTaint(characterStream.getTaint());
        // ---------- Original Method ----------
        //setCharacterStream(characterStream);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.771 -0400", hash_original_method = "0C418225BFB03C04E3636F3891B47A3E", hash_generated_method = "784431903087FA4FFEF9763F16480709")
    public void setPublicId(String publicId) {
        this.publicId = publicId;
        // ---------- Original Method ----------
        //this.publicId = publicId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.771 -0400", hash_original_method = "C19BBE926A67132A1C6BC386100A3E69", hash_generated_method = "29F0E04CEB6B910C50B849E3DD3BCC2A")
    public String getPublicId() {
        String varB4EAC82CA7396A68D541C85D26508E83_397651046 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_397651046 = publicId;
        varB4EAC82CA7396A68D541C85D26508E83_397651046.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_397651046;
        // ---------- Original Method ----------
        //return publicId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.772 -0400", hash_original_method = "77F5337B905F22D1C71F7C949FEF5117", hash_generated_method = "DE20300D341EFA9D9888E5637810608B")
    public void setSystemId(String systemId) {
        this.systemId = systemId;
        // ---------- Original Method ----------
        //this.systemId = systemId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.772 -0400", hash_original_method = "8088708D8DEEE6054468B7FD77400E50", hash_generated_method = "27061110E0A5E2BDA704EEDD81F321F6")
    public String getSystemId() {
        String varB4EAC82CA7396A68D541C85D26508E83_592599112 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_592599112 = systemId;
        varB4EAC82CA7396A68D541C85D26508E83_592599112.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_592599112;
        // ---------- Original Method ----------
        //return systemId;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.772 -0400", hash_original_method = "E15E53FA80250CBE7F24584A185B9018", hash_generated_method = "B841545B8F2C566C639881C15FF48B83")
    public void setByteStream(InputStream byteStream) {
        this.byteStream = byteStream;
        // ---------- Original Method ----------
        //this.byteStream = byteStream;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.773 -0400", hash_original_method = "831A861201E96F794D74C2B24BAB3555", hash_generated_method = "21CD4C46873ED1D46C69F614DC5FBC09")
    public InputStream getByteStream() {
        InputStream varB4EAC82CA7396A68D541C85D26508E83_282436229 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_282436229 = byteStream;
        varB4EAC82CA7396A68D541C85D26508E83_282436229.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_282436229;
        // ---------- Original Method ----------
        //return byteStream;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.773 -0400", hash_original_method = "109F4EE072FF4A68A1B686347AFE92DB", hash_generated_method = "7E8E9F5581B45D04B721857DE5AE6090")
    public void setEncoding(String encoding) {
        this.encoding = encoding;
        // ---------- Original Method ----------
        //this.encoding = encoding;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.775 -0400", hash_original_method = "ECC6E581C26F132636CDCE9C9A5E5807", hash_generated_method = "8EFCABC0C2E9CCEF574EA0235B82AA42")
    public String getEncoding() {
        String varB4EAC82CA7396A68D541C85D26508E83_1058472769 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1058472769 = encoding;
        varB4EAC82CA7396A68D541C85D26508E83_1058472769.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1058472769;
        // ---------- Original Method ----------
        //return encoding;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.776 -0400", hash_original_method = "079C1AFEC48E7E3C6462740060167438", hash_generated_method = "81D26BAB949E3D4C89EA05FA577F07A9")
    public void setCharacterStream(Reader characterStream) {
        this.characterStream = characterStream;
        // ---------- Original Method ----------
        //this.characterStream = characterStream;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:48.777 -0400", hash_original_method = "420D22C3C623A59BA758E1AC6387B142", hash_generated_method = "D68858ED829A0BFC9A260F7B5A56F551")
    public Reader getCharacterStream() {
        Reader varB4EAC82CA7396A68D541C85D26508E83_1888365784 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1888365784 = characterStream;
        varB4EAC82CA7396A68D541C85D26508E83_1888365784.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1888365784;
        // ---------- Original Method ----------
        //return characterStream;
    }

    
}

