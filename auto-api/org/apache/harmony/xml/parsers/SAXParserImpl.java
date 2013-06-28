package org.apache.harmony.xml.parsers;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.SAXParser;
import org.apache.harmony.xml.ExpatReader;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderAdapter;

final class SAXParserImpl extends SAXParser {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.533 -0400", hash_original_field = "54500990E8C2CA416B97834F0A2A41E6", hash_generated_field = "5A288FC03A9EC3CBF67B84D7411659BA")

    private Map<String, Boolean> initialFeatures;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.533 -0400", hash_original_field = "1DE9B0A30075AE8C303EB420C103C320", hash_generated_field = "2331E55663EE08977E2E12264071B561")

    private XMLReader reader;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.533 -0400", hash_original_field = "3643B86326B2FFCC0A085B4DD3A4309B", hash_generated_field = "D434606E37B1227241E7860D969B4643")

    private Parser parser;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.534 -0400", hash_original_method = "9779EC9D1D1B404AB344DB3CA0720707", hash_generated_method = "94E9BC8CEC2C7941E41B2FA6EF9CDC3E")
      SAXParserImpl(Map<String, Boolean> initialFeatures) throws SAXNotRecognizedException, SAXNotSupportedException {
        this.initialFeatures = initialFeatures.isEmpty()
                ? Collections.<String, Boolean>emptyMap()
                : new HashMap<String, Boolean>(initialFeatures);
        resetInternal();
        // ---------- Original Method ----------
        //this.initialFeatures = initialFeatures.isEmpty()
                //? Collections.<String, Boolean>emptyMap()
                //: new HashMap<String, Boolean>(initialFeatures);
        //resetInternal();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.537 -0400", hash_original_method = "92E2D289AE561178AC5F307252F0C6F0", hash_generated_method = "3DA3D4D5E222094D92BFB05B090A7171")
    private void resetInternal() throws SAXNotSupportedException, SAXNotRecognizedException {
        reader = new ExpatReader();
        {
            Iterator<Map.Entry<String,Boolean>> var26A74534AF18169022C86739EABC44A0_906647137 = (initialFeatures.entrySet()).iterator();
            var26A74534AF18169022C86739EABC44A0_906647137.hasNext();
            Map.Entry<String,Boolean> entry = var26A74534AF18169022C86739EABC44A0_906647137.next();
            {
                reader.setFeature(entry.getKey(), entry.getValue());
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //reader = new ExpatReader();
        //for (Map.Entry<String,Boolean> entry : initialFeatures.entrySet()) {
            //reader.setFeature(entry.getKey(), entry.getValue());
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.538 -0400", hash_original_method = "26E1B1518091EE44E3A8C3E01B27E1B4", hash_generated_method = "089C29444F55E17676CD601B013A35EA")
    @Override
    public void reset() {
        try 
        {
            resetInternal();
        } //End block
        catch (SAXNotRecognizedException e)
        {
            if (DroidSafeAndroidRuntime.control) throw new AssertionError();
        } //End block
        catch (SAXNotSupportedException e)
        {
            if (DroidSafeAndroidRuntime.control) throw new AssertionError();
        } //End block
        // ---------- Original Method ----------
        //try {
            //resetInternal();
        //} catch (SAXNotRecognizedException e) {
            //throw new AssertionError();
        //} catch (SAXNotSupportedException e) {
            //throw new AssertionError();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.539 -0400", hash_original_method = "18862164328B5438252F399ABE567B5E", hash_generated_method = "4696AC166029C661C6B604B0ADBB74CD")
    @Override
    public Parser getParser() {
        Parser varB4EAC82CA7396A68D541C85D26508E83_1350925364 = null; //Variable for return #1
        {
            parser = new XMLReaderAdapter(reader);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_1350925364 = parser;
        varB4EAC82CA7396A68D541C85D26508E83_1350925364.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1350925364;
        // ---------- Original Method ----------
        //if (parser == null) {
            //parser = new XMLReaderAdapter(reader);
        //}
        //return parser;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.539 -0400", hash_original_method = "9F43AD8AE86873C6002272EA37B61BFA", hash_generated_method = "7F79EB13CDE193B02FAC202B4A923D88")
    @Override
    public Object getProperty(String name) throws SAXNotRecognizedException,
            SAXNotSupportedException {
        Object varB4EAC82CA7396A68D541C85D26508E83_1985515057 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1985515057 = reader.getProperty(name);
        addTaint(name.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1985515057.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1985515057;
        // ---------- Original Method ----------
        //return reader.getProperty(name);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.540 -0400", hash_original_method = "2EF684CE098290C07222DD88BA41AEFB", hash_generated_method = "D3DF418F96DD2D5371271C9BDE22F065")
    @Override
    public XMLReader getXMLReader() {
        XMLReader varB4EAC82CA7396A68D541C85D26508E83_833941870 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_833941870 = reader;
        varB4EAC82CA7396A68D541C85D26508E83_833941870.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_833941870;
        // ---------- Original Method ----------
        //return reader;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.540 -0400", hash_original_method = "4C988836598C02053146886655E4EB88", hash_generated_method = "82F9034E0F67FC1E36AB2F64CA5AAE6D")
    @Override
    public boolean isNamespaceAware() {
        try 
        {
            boolean var006A000B8CB9BCB58EE5C1BC37348477_1092626533 = (reader.getFeature("http://xml.org/sax/features/namespaces"));
        } //End block
        catch (SAXException ex)
        { }
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_168028101 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_168028101;
        // ---------- Original Method ----------
        //try {
            //return reader.getFeature("http://xml.org/sax/features/namespaces");
        //} catch (SAXException ex) {
            //return false;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.541 -0400", hash_original_method = "BC62268279A4D4DB4B44A495D4290EBF", hash_generated_method = "71C52B5462E860BF830DB60FADBE0F78")
    @Override
    public boolean isValidating() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_174501556 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_174501556;
        // ---------- Original Method ----------
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:36.541 -0400", hash_original_method = "3CB351E70AA30B9105B52B17172319A2", hash_generated_method = "CBBC9D546A7FF3ABC09C959FD6312F09")
    @Override
    public void setProperty(String name, Object value) throws SAXNotRecognizedException, SAXNotSupportedException {
        reader.setProperty(name, value);
        addTaint(name.getTaint());
        addTaint(value.getTaint());
        // ---------- Original Method ----------
        //reader.setProperty(name, value);
    }

    
}

