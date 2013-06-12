package java.nio;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;

// import Iterator to deal with enhanced for loop translation
import java.util.Iterator;

import java.util.Arrays;

public abstract class IntBuffer extends Buffer implements Comparable<IntBuffer> {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:12.574 -0400", hash_original_method = "BC7C458D54C7EF00271779F9364447AB", hash_generated_method = "3207954798FC36C33148386D8499B3FE")
    //DSFIXME:  CODE0002: Requires DSC value to be set
     IntBuffer(int capacity) {
        super(2, capacity, null);
        dsTaint.addTaint(capacity);
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:12.574 -0400", hash_original_method = "C3C2422C66654D6E12C59493728B39AD", hash_generated_method = "0D16E8947227D39761B191AF74C187E8")
    public static IntBuffer allocate(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new ReadWriteIntArrayBuffer(capacity);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:12.574 -0400", hash_original_method = "69AB4E308DD923986E8AB96AF4F625AA", hash_generated_method = "6C1B3D0124340296BE544158357DB7B0")
    public static IntBuffer wrap(int[] array) {
        return wrap(array, 0, array.length);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:12.574 -0400", hash_original_method = "47E92E6AEEAACC35C5502B8D98F03798", hash_generated_method = "4ECA240E787448B61CD60196456D2818")
    public static IntBuffer wrap(int[] array, int start, int intCount) {
        Arrays.checkOffsetAndCount(array.length, start, intCount);
        IntBuffer buf = new ReadWriteIntArrayBuffer(array);
        buf.position = start;
        buf.limit = start + intCount;
        return buf;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:12.574 -0400", hash_original_method = "D78164E532496862518F1BC4BDE62DEB", hash_generated_method = "0B4A5260260C33B8AD889003968F12FD")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public final int[] array() {
        int[] varEA57FBC16B997AC0E679F048893AC79C_829997126 = (protectedArray());
        int[] retVal = new int[1];
        retVal[0] = dsTaint.getTaintInt();
        return retVal;
        // ---------- Original Method ----------
        //return protectedArray();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:12.574 -0400", hash_original_method = "0D5EF56CBEA1DA16093A6276D10D9347", hash_generated_method = "2CA61E7672699E03151B5D4281F15FFF")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public final int arrayOffset() {
        int var457EDFAA982472962568D68CBF588B38_69134369 = (protectedArrayOffset());
        return dsTaint.getTaintInt();
        // ---------- Original Method ----------
        //return protectedArrayOffset();
    }

    
    public abstract IntBuffer asReadOnlyBuffer();

    
    public abstract IntBuffer compact();

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:12.574 -0400", hash_original_method = "E9F1AE5FDD3CB99604FBE90C4DDAAAAA", hash_generated_method = "00C0AE6EEE5E3DC006392ED98ED3B21E")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public int compareTo(IntBuffer otherBuffer) {
        dsTaint.addTaint(otherBuffer.dsTaint);
        int compareRemaining;
        boolean var4BCBF0874E5D33E29652A3CCB2245276_1956181073 = ((remaining() < otherBuffer.remaining()));
        compareRemaining = remaining();
        compareRemaining = otherBuffer.remaining();
        int thisPos;
        thisPos = position;
        int otherPos;
        otherPos = otherBuffer.position;
        int thisInt, otherInt;
        {
            thisInt = get(thisPos);
            otherInt = otherBuffer.get(otherPos);
            thisPos++;
            otherPos++;
            compareRemaining--;
        } //End block
        int var51CE6C8A0A6AF44D4BCA06BE06554AF8_500553632 = (remaining() - otherBuffer.remaining());
        return dsTaint.getTaintInt();
        // ---------- Original Method ----------
        //int compareRemaining = (remaining() < otherBuffer.remaining()) ? remaining()
                //: otherBuffer.remaining();
        //int thisPos = position;
        //int otherPos = otherBuffer.position;
        //int thisInt, otherInt;
        //while (compareRemaining > 0) {
            //thisInt = get(thisPos);
            //otherInt = otherBuffer.get(otherPos);
            //if (thisInt != otherInt) {
                //return thisInt < otherInt ? -1 : 1;
            //}
            //thisPos++;
            //otherPos++;
            //compareRemaining--;
        //}
        //return remaining() - otherBuffer.remaining();
    }

    
    public abstract IntBuffer duplicate();

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:12.575 -0400", hash_original_method = "43D7EA8D2B4C608B648102E9AA040456", hash_generated_method = "08E7869DA6738E8818C14190F489B81E")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    @Override
    public boolean equals(Object other) {
        dsTaint.addTaint(other.dsTaint);
        IntBuffer otherBuffer;
        otherBuffer = (IntBuffer) other;
        {
            boolean var0A43D7921CE313B818348D8F01F0C8D5_554549980 = (remaining() != otherBuffer.remaining());
        } //End collapsed parenthetic
        int myPosition;
        myPosition = position;
        int otherPosition;
        otherPosition = otherBuffer.position;
        boolean equalSoFar;
        equalSoFar = true;
        {
            equalSoFar = get(myPosition++) == otherBuffer.get(otherPosition++);
        } //End block
        return dsTaint.getTaintBoolean();
        // ---------- Original Method ----------
        //if (!(other instanceof IntBuffer)) {
            //return false;
        //}
        //IntBuffer otherBuffer = (IntBuffer) other;
        //if (remaining() != otherBuffer.remaining()) {
            //return false;
        //}
        //int myPosition = position;
        //int otherPosition = otherBuffer.position;
        //boolean equalSoFar = true;
        //while (equalSoFar && (myPosition < limit)) {
            //equalSoFar = get(myPosition++) == otherBuffer.get(otherPosition++);
        //}
        //return equalSoFar;
    }

    
    public abstract int get();

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:12.575 -0400", hash_original_method = "257B404B7D2C714566C75E4EA0767CA2", hash_generated_method = "753FA84873EB41CA9F755FDB7F154739")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public IntBuffer get(int[] dst) {
        dsTaint.addTaint(dst);
        IntBuffer var54C52896C1D21D17FF99C7DFE6939F7B_235237486 = (get(dst, 0, dst.length));
        return (IntBuffer)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return get(dst, 0, dst.length);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:12.575 -0400", hash_original_method = "72F522BE346D267FC1DB76B8F081AACA", hash_generated_method = "69A523BCADA806BA406B1AC0D0082BF4")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public IntBuffer get(int[] dst, int dstOffset, int intCount) {
        dsTaint.addTaint(intCount);
        dsTaint.addTaint(dstOffset);
        dsTaint.addTaint(dst);
        Arrays.checkOffsetAndCount(dst.length, dstOffset, intCount);
        {
            boolean var88D58DBFE8E26BEBC18FDE3265CF76EF_354656456 = (intCount > remaining());
            {
                throw new BufferUnderflowException();
            } //End block
        } //End collapsed parenthetic
        {
            int i;
            i = dstOffset;
            {
                dst[i] = get();
            } //End block
        } //End collapsed parenthetic
        return (IntBuffer)dsTaint.getTaint();
        // ---------- Original Method ----------
        //Arrays.checkOffsetAndCount(dst.length, dstOffset, intCount);
        //if (intCount > remaining()) {
            //throw new BufferUnderflowException();
        //}
        //for (int i = dstOffset; i < dstOffset + intCount; ++i) {
            //dst[i] = get();
        //}
        //return this;
    }

    
    public abstract int get(int index);

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:12.575 -0400", hash_original_method = "89C81F0EAF8FCCBFE368437CC8972DD7", hash_generated_method = "B8C1756416D193433AF90E8E71FEA014")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public final boolean hasArray() {
        boolean varADF219B8DAB0ACF2FCC593A6A216A7F8_1422115426 = (protectedHasArray());
        return dsTaint.getTaintBoolean();
        // ---------- Original Method ----------
        //return protectedHasArray();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:12.575 -0400", hash_original_method = "371FAD0CF0C9AC8E78075F4EA52336BD", hash_generated_method = "363034E27E0AFE4833C7CE1DB3D1C651")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    @Override
    public int hashCode() {
        int myPosition;
        myPosition = position;
        int hash;
        hash = 0;
        {
            hash = hash + get(myPosition++);
        } //End block
        return dsTaint.getTaintInt();
        // ---------- Original Method ----------
        //int myPosition = position;
        //int hash = 0;
        //while (myPosition < limit) {
            //hash = hash + get(myPosition++);
        //}
        //return hash;
    }

    
    public abstract boolean isDirect();

    
    public abstract ByteOrder order();

    
    abstract int[] protectedArray();

    
    abstract int protectedArrayOffset();

    
    abstract boolean protectedHasArray();

    
    public abstract IntBuffer put(int i);

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:12.575 -0400", hash_original_method = "C57984865448BE8CC42F7EA5DB727833", hash_generated_method = "C2B27A8395962329FC21F16C2DE9AC2F")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public final IntBuffer put(int[] src) {
        dsTaint.addTaint(src);
        IntBuffer var974D367CEDA780433BF9CC5389A430C6_2109027558 = (put(src, 0, src.length));
        return (IntBuffer)dsTaint.getTaint();
        // ---------- Original Method ----------
        //return put(src, 0, src.length);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:12.575 -0400", hash_original_method = "E12C5DD5606B4F94202BB1F980DCA32C", hash_generated_method = "5924884B4AE1B5003C8ABDB335E7967D")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public IntBuffer put(int[] src, int srcOffset, int intCount) {
        dsTaint.addTaint(intCount);
        dsTaint.addTaint(src);
        dsTaint.addTaint(srcOffset);
        Arrays.checkOffsetAndCount(src.length, srcOffset, intCount);
        {
            boolean var88D58DBFE8E26BEBC18FDE3265CF76EF_1852708262 = (intCount > remaining());
            {
                throw new BufferOverflowException();
            } //End block
        } //End collapsed parenthetic
        {
            int i;
            i = srcOffset;
            {
                put(src[i]);
            } //End block
        } //End collapsed parenthetic
        return (IntBuffer)dsTaint.getTaint();
        // ---------- Original Method ----------
        //Arrays.checkOffsetAndCount(src.length, srcOffset, intCount);
        //if (intCount > remaining()) {
            //throw new BufferOverflowException();
        //}
        //for (int i = srcOffset; i < srcOffset + intCount; ++i) {
            //put(src[i]);
        //}
        //return this;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4", generated_on = "2013-06-11 11:15:12.575 -0400", hash_original_method = "874C21D5B52E872502D97AA1BF44CEA1", hash_generated_method = "B89CB4717702015D4DA5D450E54E043A")
    //DSFIXME:  CODE0002: Requires DSC value to be set
    public IntBuffer put(IntBuffer src) {
        dsTaint.addTaint(src.dsTaint);
        {
            throw new IllegalArgumentException();
        } //End block
        {
            boolean var6E2E81EBCD4D9A6ACDDC12CE61513AA8_1831209091 = (src.remaining() > remaining());
            {
                throw new BufferOverflowException();
            } //End block
        } //End collapsed parenthetic
        int[] contents;
        contents = new int[src.remaining()];
        src.get(contents);
        put(contents);
        return (IntBuffer)dsTaint.getTaint();
        // ---------- Original Method ----------
        //if (src == this) {
            //throw new IllegalArgumentException();
        //}
        //if (src.remaining() > remaining()) {
            //throw new BufferOverflowException();
        //}
        //int[] contents = new int[src.remaining()];
        //src.get(contents);
        //put(contents);
        //return this;
    }

    
    public abstract IntBuffer put(int index, int i);

    
    public abstract IntBuffer slice();

    
}


