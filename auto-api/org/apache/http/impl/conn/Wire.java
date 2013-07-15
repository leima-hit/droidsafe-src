package org.apache.http.impl.conn;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import org.apache.commons.logging.Log;

public class Wire {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.600 -0400", hash_original_field = "DC1D71BBB5C4D2A5E936DB79EF10C19F", hash_generated_field = "B44E589F36524A8564E741C819F5943D")

    private Log log;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.600 -0400", hash_original_method = "B4B1AB4B499B8A15063D0CC014BEC991", hash_generated_method = "FBE8B17783F099F7154A4AC40DE90B09")
    public  Wire(Log log) {
        this.log = log;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.601 -0400", hash_original_method = "8AB487D8D5FB9334AB649D48E9DFB74A", hash_generated_method = "C208A0D4249AB0683EC67F7254950FFD")
    private void wire(String header, InputStream instream) throws IOException {
        StringBuilder buffer = new StringBuilder();
        int ch;
        {
            boolean varBE8CDFD0D4A49EC74FD4EF76E4036C0C_1971651964 = ((ch = instream.read()) != -1);
            {
                {
                    buffer.append("[\\r]");
                } 
                {
                    buffer.append("[\\n]\"");
                    buffer.insert(0, "\"");
                    buffer.insert(0, header);
                    log.debug(buffer.toString());
                    buffer.setLength(0);
                } 
                {
                    buffer.append("[0x");
                    buffer.append(Integer.toHexString(ch));
                    buffer.append("]");
                } 
                {
                    buffer.append((char) ch);
                } 
            } 
        } 
        {
            boolean varA6481F2DD37075F8497C4FE156A6F563_2076410084 = (buffer.length() > 0);
            {
                buffer.append('\"');
                buffer.insert(0, '\"');
                buffer.insert(0, header);
                log.debug(buffer.toString());
            } 
        } 
        addTaint(header.getTaint());
        addTaint(instream.getTaint());
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.602 -0400", hash_original_method = "3293A063039621258FD717F75AAE20F6", hash_generated_method = "8F8DC4BE28038C1B5A7B1C4E069874EC")
    public boolean enabled() {
        boolean varE06D2046BEE0ABEA06C369E4439EAD48_1977899507 = (log.isDebugEnabled());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1438967075 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1438967075;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.602 -0400", hash_original_method = "41909751022A9CA66D19EAE8E0D21F96", hash_generated_method = "6520D2FC832311EEFC994FD9990F941D")
    public void output(InputStream outstream) throws IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Output may not be null");
        } 
        wire(">> ", outstream);
        addTaint(outstream.getTaint());
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.602 -0400", hash_original_method = "9B3D263B2ABEC36BE45DD8B457A2FB5F", hash_generated_method = "0E7D174910FF6E87F8D86C5931DBD33D")
    public void input(InputStream instream) throws IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Input may not be null");
        } 
        wire("<< ", instream);
        addTaint(instream.getTaint());
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.603 -0400", hash_original_method = "FC3E92A1F886275998FB021C6804D6A9", hash_generated_method = "22828D790BB7C8E7F787A334089A37D5")
    public void output(byte[] b, int off, int len) throws IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Output may not be null");
        } 
        wire(">> ", new ByteArrayInputStream(b, off, len));
        addTaint(b[0]);
        addTaint(off);
        addTaint(len);
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.603 -0400", hash_original_method = "7AB6B9BAC192F7B379ECF2E9CAEC39DE", hash_generated_method = "21FA7DA3E62ADC71EBD61D449E5F32D5")
    public void input(byte[] b, int off, int len) throws IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Input may not be null");
        } 
        wire("<< ", new ByteArrayInputStream(b, off, len));
        addTaint(b[0]);
        addTaint(off);
        addTaint(len);
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.604 -0400", hash_original_method = "C456100C17A97A0094094ACD8A59EB30", hash_generated_method = "4A1F2A1B540F0BB1C571E67E43715543")
    public void output(byte[] b) throws IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Output may not be null");
        } 
        wire(">> ", new ByteArrayInputStream(b));
        addTaint(b[0]);
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.604 -0400", hash_original_method = "CACCE18D78F1F755698157152E4CF23A", hash_generated_method = "C1F4649A9DF805AAB4E7ADEE51D31604")
    public void input(byte[] b) throws IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Input may not be null");
        } 
        wire("<< ", new ByteArrayInputStream(b));
        addTaint(b[0]);
        
        
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.604 -0400", hash_original_method = "98C5B0073473ADAA98ACDF73DE6F6267", hash_generated_method = "329E4B2D277CD33076712D7E11FDEDB2")
    public void output(int b) throws IOException {
        output(new byte[] {(byte) b});
        addTaint(b);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.605 -0400", hash_original_method = "95BA17E717E6FE2824B7813CA2829BC6", hash_generated_method = "5E66682A13C822976B5A2798A97082CE")
    public void input(int b) throws IOException {
        input(new byte[] {(byte) b});
        addTaint(b);
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.605 -0400", hash_original_method = "F3C5064419E81BE1694ED79F4A4E0F84", hash_generated_method = "5C00A7A8483FA6FD4830D4777EB0D0F7")
    public void output(final String s) throws IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Output may not be null");
        } 
        output(s.getBytes());
        addTaint(s.getTaint());
        
        
            
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:40.606 -0400", hash_original_method = "A406219181E10CB21A7EC7720CD1AF08", hash_generated_method = "E9153EFCC0B80AA991F835158A3D10E5")
    public void input(final String s) throws IOException {
        {
            if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException("Input may not be null");
        } 
        input(s.getBytes());
        addTaint(s.getTaint());
        
        
            
        
        
    }

    
}

