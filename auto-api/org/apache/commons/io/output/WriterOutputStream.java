package org.apache.commons.io.output;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

public class WriterOutputStream extends OutputStream {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.816 -0400", hash_original_field = "A82FEEE3CC1AF8BCABDA979E8775EF0F", hash_generated_field = "DB075F4140D7FA00980C54A40F997F59")

    private Writer writer;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.816 -0400", hash_original_field = "3A6BDBA8FB33A88CF7D52A1AF07A9C00", hash_generated_field = "E190C0DE068854E0E786DAC309DED1B8")

    private CharsetDecoder decoder;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.816 -0400", hash_original_field = "7FA09A092FA86C64ECEBD742F33CFF42", hash_generated_field = "CD0A8A60A3B382C20C5A148FCE76F0A8")

    private boolean writeImmediately;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.816 -0400", hash_original_field = "837D15431197C3E9537FBE93F41CEBD2", hash_generated_field = "A9F316D4B0184188DCFEE946C32A3D7B")

    private final ByteBuffer decoderIn = ByteBuffer.allocate(128);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.816 -0400", hash_original_field = "47C0799C729F0F680260D06E3CD958CC", hash_generated_field = "455BF49B21823C664D42B2AC67A38E34")

    private CharBuffer decoderOut;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.817 -0400", hash_original_method = "4A2ECD3C7335CA4F94CBBF612E64A3A4", hash_generated_method = "EE87B62CE9062DC24DA9F2956AED8166")
    public  WriterOutputStream(Writer writer, CharsetDecoder decoder) {
        this(writer, decoder, DEFAULT_BUFFER_SIZE, false);
        addTaint(writer.getTaint());
        addTaint(decoder.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.817 -0400", hash_original_method = "3EDB33815F621AFED5D37E18A3A21495", hash_generated_method = "E42119C134E23C19A0E135DA58006EC5")
    public  WriterOutputStream(Writer writer, CharsetDecoder decoder, int bufferSize, boolean writeImmediately) {
        this.writer = writer;
        this.decoder = decoder;
        this.writeImmediately = writeImmediately;
        decoderOut = CharBuffer.allocate(bufferSize);
        
        
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.817 -0400", hash_original_method = "B867148FBA5E55CD84C23E5CFFC25359", hash_generated_method = "6B78C4D822A4B7F176341BAC49CF631D")
    public  WriterOutputStream(Writer writer, Charset charset, int bufferSize, boolean writeImmediately) {
        this(writer,
             charset.newDecoder()
                    .onMalformedInput(CodingErrorAction.REPLACE)
                    .onUnmappableCharacter(CodingErrorAction.REPLACE)
                    .replaceWith("?"),
             bufferSize,
             writeImmediately);
        addTaint(writer.getTaint());
        addTaint(charset.getTaint());
        addTaint(bufferSize);
        addTaint(writeImmediately);
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.817 -0400", hash_original_method = "F5E8CFB6E56AC508C368EDA9E41EBCA5", hash_generated_method = "E1CCF8C3D2EC261A505702D459A4F580")
    public  WriterOutputStream(Writer writer, Charset charset) {
        this(writer, charset, DEFAULT_BUFFER_SIZE, false);
        addTaint(writer.getTaint());
        addTaint(charset.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.818 -0400", hash_original_method = "EFA34CAB468BE610E644DAB0715A71E2", hash_generated_method = "27E95DA5B59B5B1BB6D5E11AA68706E9")
    public  WriterOutputStream(Writer writer, String charsetName, int bufferSize, boolean writeImmediately) {
        this(writer, Charset.forName(charsetName), bufferSize, writeImmediately);
        addTaint(writer.getTaint());
        addTaint(charsetName.getTaint());
        addTaint(bufferSize);
        addTaint(writeImmediately);
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.818 -0400", hash_original_method = "F26B5DFECB697DCFF94DB93FC05ACF8E", hash_generated_method = "4ECC827CAFF62FF6CB5EAA88080BF822")
    public  WriterOutputStream(Writer writer, String charsetName) {
        this(writer, charsetName, DEFAULT_BUFFER_SIZE, false);
        addTaint(writer.getTaint());
        addTaint(charsetName.getTaint());
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.818 -0400", hash_original_method = "C117D3B09C26E87BDD8081C71BA84253", hash_generated_method = "252B83BA4D7207E2C5F29EEBCDAA3025")
    public  WriterOutputStream(Writer writer) {
        this(writer, Charset.defaultCharset(), DEFAULT_BUFFER_SIZE, false);
        addTaint(writer.getTaint());
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.818 -0400", hash_original_method = "C0D49EB08A267ED3491A74132BB97C44", hash_generated_method = "E5792FCCD91E38B890533BEE0CE23F39")
    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        {
            int c = Math.min(len, decoderIn.remaining());
            decoderIn.put(b, off, c);
            processInput(false);
            len -= c;
            off += c;
        } 
        {
            flushOutput();
        } 
        addTaint(b[0]);
        addTaint(off);
        addTaint(len);
        
        
            
            
            
            
            
        
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.819 -0400", hash_original_method = "E1D4EA7BC5A1A039095C078064FA6BD5", hash_generated_method = "65527CB182AA774108E3787F67952FBA")
    @Override
    public void write(byte[] b) throws IOException {
        write(b, 0, b.length);
        addTaint(b[0]);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.819 -0400", hash_original_method = "72E9EA9CB4D496A22134A9DE55B8B91A", hash_generated_method = "6D7B678E08FBFEE586422C6433BDCAD5")
    @Override
    public void write(int b) throws IOException {
        write(new byte[] { (byte)b }, 0, 1);
        addTaint(b);
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.820 -0400", hash_original_method = "AC63B2DA15A83F7213D18D8342590F5B", hash_generated_method = "8B5A73988608AB8AFD2F020B6179FC74")
    @Override
    public void flush() throws IOException {
        flushOutput();
        writer.flush();
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.820 -0400", hash_original_method = "420EB211773CB08496419ABA1A7EC597", hash_generated_method = "28EF03026D790D6562F1CF27EA9F49E7")
    @Override
    public void close() throws IOException {
        processInput(true);
        flushOutput();
        writer.close();
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.821 -0400", hash_original_method = "8DBE36D3CC23C0C9E5FAAD9804EB9F8E", hash_generated_method = "112F31C0502A54E03AD5B19F3D80503F")
    private void processInput(boolean endOfInput) throws IOException {
        decoderIn.flip();
        CoderResult coderResult;
        {
            coderResult = decoder.decode(decoderIn, decoderOut, endOfInput);
            {
                boolean var1F4BF95B8230AF5CFFBC6FA75DC274CF_826578903 = (coderResult.isOverflow());
                {
                    flushOutput();
                } 
                {
                    boolean var91E1BBCAB1B1D4939387A6515FBC5859_1472308323 = (coderResult.isUnderflow());
                    {
                        if (DroidSafeAndroidRuntime.control) throw new IOException("Unexpected coder result");
                    } 
                } 
            } 
        } 
        decoderIn.compact();
        addTaint(endOfInput);
        
        
        
        
            
            
                
            
                
            
                
            
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.822 -0400", hash_original_method = "CB0233CD34D87630D222478FE14929AD", hash_generated_method = "3274841E31AA1CE94038B1AE891580F3")
    private void flushOutput() throws IOException {
        {
            boolean var5A61A804EE9D9DD861B4FBA8E1F323BE_1625364786 = (decoderOut.position() > 0);
            {
                writer.write(decoderOut.array(), 0, decoderOut.position());
                decoderOut.rewind();
            } 
        } 
        
        
            
            
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:15:32.822 -0400", hash_original_field = "E1C1EEB189E8C6F96F23FE164A5738F0", hash_generated_field = "2888F3AB0EE3CA8F80F09281C7B29EDA")

    private static final int DEFAULT_BUFFER_SIZE = 1024;
}

