package java.io;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;

// import Iterator to deal with enhanced for loop translation
import java.util.Iterator;

import dalvik.system.CloseGuard;
import java.nio.NioUtils;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import libcore.io.IoBridge;
import libcore.io.IoUtils;
import static libcore.io.OsConstants.*;

public class FileOutputStream extends OutputStream implements Closeable {
    private FileDescriptor fd;
    private final boolean shouldClose;
    private FileChannel channel;
    private final int mode;
    private final CloseGuard guard = CloseGuard.get();
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.458 -0400", hash_original_method = "FCD724AE92A53995D4248A6FA35A6403", hash_generated_method = "0CF35627BCC1C635933EE5998C1BA4E6")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public FileOutputStream(File file) throws FileNotFoundException {
        this(file, false);
        dsTaint.addTaint(file.dsTaint);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.458 -0400", hash_original_method = "E1E823059D628A64A7C3F0D9FD132483", hash_generated_method = "B873A83D1D3A30694E13B2C5F702D7BB")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public FileOutputStream(File file, boolean append) throws FileNotFoundException {
        dsTaint.addTaint(append);
        dsTaint.addTaint(file.dsTaint);
        {
            throw new NullPointerException("file == null");
        } //End block
        this.mode = O_WRONLY | O_CREAT | (append ? O_APPEND : O_TRUNC);
        this.fd = IoBridge.open(file.getAbsolutePath(), mode);
        this.shouldClose = true;
        this.guard.open("close");
        // ---------- Original Method ----------
        //if (file == null) {
            //throw new NullPointerException("file == null");
        //}
        //this.mode = O_WRONLY | O_CREAT | (append ? O_APPEND : O_TRUNC);
        //this.fd = IoBridge.open(file.getAbsolutePath(), mode);
        //this.shouldClose = true;
        //this.guard.open("close");
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.458 -0400", hash_original_method = "CA1AE4948CB074C25B5079F997384B75", hash_generated_method = "EFD0729D272E4208E03BF5AEFB39F40B")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public FileOutputStream(FileDescriptor fd) {
        dsTaint.addTaint(fd.dsTaint);
        {
            throw new NullPointerException("fd == null");
        } //End block
        this.shouldClose = false;
        this.mode = O_WRONLY;
        this.channel = NioUtils.newFileChannel(this, fd, mode);
        // ---------- Original Method ----------
        //if (fd == null) {
            //throw new NullPointerException("fd == null");
        //}
        //this.fd = fd;
        //this.shouldClose = false;
        //this.mode = O_WRONLY;
        //this.channel = NioUtils.newFileChannel(this, fd, mode);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.458 -0400", hash_original_method = "ACD65E09F20B5B610F80054FC06EAD01", hash_generated_method = "76389D6F3A67330632BD0E88357B4751")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public FileOutputStream(String path) throws FileNotFoundException {
        this(path, false);
        dsTaint.addTaint(path);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.458 -0400", hash_original_method = "2C15450100DC44A70908DD69335AD0CF", hash_generated_method = "F1606DE3C2F117A388BBA0B7D9B35C3B")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public FileOutputStream(String path, boolean append) throws FileNotFoundException {
        this(new File(path), append);
        dsTaint.addTaint(append);
        dsTaint.addTaint(path);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.458 -0400", hash_original_method = "F8E8B4DFEA301034B0C9D2DA47B66D8A", hash_generated_method = "1CC7D26A4F0EE263E12B684B6C157B53")
    @DSModeled(DSC.SAFE)
    @Override
    public void close() throws IOException {
        guard.close();
        {
            {
                channel.close();
            } //End block
            {
                IoUtils.close(fd);
            } //End block
            {
                fd = new FileDescriptor();
            } //End block
        } //End block
        // ---------- Original Method ----------
        //guard.close();
        //synchronized (this) {
            //if (channel != null) {
                //channel.close();
            //}
            //if (shouldClose) {
                //IoUtils.close(fd);
            //} else {
                //fd = new FileDescriptor();
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.459 -0400", hash_original_method = "5577B21C22C8702738A871739D038C15", hash_generated_method = "C0BCF3B286A2315D59F9F0828713B8A2")
    @DSModeled(DSC.SAFE)
    @Override
    protected void finalize() throws IOException {
        try 
        {
            {
                guard.warnIfOpen();
            } //End block
            close();
        } //End block
        finally 
        {
            try 
            {
                super.finalize();
            } //End block
            catch (Throwable t)
            {
                throw new AssertionError(t);
            } //End block
        } //End block
        // ---------- Original Method ----------
        //try {
            //if (guard != null) {
                //guard.warnIfOpen();
            //}
            //close();
        //} finally {
            //try {
                //super.finalize();
            //} catch (Throwable t) {
                //throw new AssertionError(t);
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.459 -0400", hash_original_method = "ED8CC62185555A958270FAF77C7A0E38", hash_generated_method = "C36E3C423C8E042FC1806374C281B7DC")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public FileChannel getChannel() {
        {
            {
                channel = NioUtils.newFileChannel(this, fd, mode);
            } //End block
        } //End block
        return (FileChannel)dsTaint.getTaint();
        // ---------- Original Method ----------
        //synchronized (this) {
            //if (channel == null) {
                //channel = NioUtils.newFileChannel(this, fd, mode);
            //}
            //return channel;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.459 -0400", hash_original_method = "7178DA6FA6DD367775EBAB657FD1BDA0", hash_generated_method = "5EEBEE949DA2AB28C9F4160248A81D9F")
    @DSModeled(DSC.SAFE)
    public final FileDescriptor getFD() throws IOException {
        return (FileDescriptor)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return fd;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.459 -0400", hash_original_method = "F915AF116DBABF662C85674FE9C75DD1", hash_generated_method = "F6F3204E59F58C4FCAE42B4E5CE3464B")
    @DSModeled(DSC.SAFE)
    @Override
    public void write(byte[] buffer, int byteOffset, int byteCount) throws IOException {
        dsTaint.addTaint(buffer);
        dsTaint.addTaint(byteOffset);
        dsTaint.addTaint(byteCount);
        IoBridge.write(fd, buffer, byteOffset, byteCount);
        // ---------- Original Method ----------
        //IoBridge.write(fd, buffer, byteOffset, byteCount);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:11.459 -0400", hash_original_method = "36E798E1E7EB95F42CDB9DAEDA0C8547", hash_generated_method = "4020766A1972DED5D83364DEE9CBBEFB")
    @DSModeled(DSC.SAFE)
    @Override
    public void write(int oneByte) throws IOException {
        dsTaint.addTaint(oneByte);
        write(new byte[] { (byte) oneByte }, 0, 1);
        // ---------- Original Method ----------
        //write(new byte[] { (byte) oneByte }, 0, 1);
    }

    
}


