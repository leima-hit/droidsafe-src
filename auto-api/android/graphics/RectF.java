package android.graphics;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import java.io.PrintWriter;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.FloatMath;
import com.android.internal.util.FastMath;

public class RectF implements Parcelable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.350 -0400", hash_original_field = "811882FECD5C7618D7099EBBD39EA254", hash_generated_field = "F463FF95349F5FFDEBFA1888AA372D7F")

    public float left;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.351 -0400", hash_original_field = "B28354B543375BFA94DABAEDA722927F", hash_generated_field = "F9D622C84E97B0C2CBDBCB618909D322")

    public float top;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.351 -0400", hash_original_field = "7C4F29407893C334A6CB7A87BF045C0D", hash_generated_field = "4A45372E50F3A0CA9B8E80524FE9837C")

    public float right;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.351 -0400", hash_original_field = "71F262D796BED1AB30E8A2D5A8DDEE6F", hash_generated_field = "3601A2C074D2F75BE50976E0F9B684C6")

    public float bottom;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.351 -0400", hash_original_method = "D61F570F41294C50B794115B72F287CF", hash_generated_method = "FB1DA24AD52B1F8131024D12E52691C3")
    public  RectF() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.352 -0400", hash_original_method = "5B128CE85C88A209036C5C9DCC51E26B", hash_generated_method = "3EDBF02BD4BEB5E789B57FE1928F6929")
    public  RectF(float left, float top, float right, float bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        // ---------- Original Method ----------
        //this.left = left;
        //this.top = top;
        //this.right = right;
        //this.bottom = bottom;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.352 -0400", hash_original_method = "B04E1848489B49A13109B1343E9C5563", hash_generated_method = "468C2DB7F428A4C6C73464452505394B")
    public  RectF(RectF r) {
        left = r.left;
        top = r.top;
        right = r.right;
        bottom = r.bottom;
        // ---------- Original Method ----------
        //left = r.left;
        //top = r.top;
        //right = r.right;
        //bottom = r.bottom;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.353 -0400", hash_original_method = "7FD4415AACB98A397DC21B4FD086AC26", hash_generated_method = "50BF0A54EC76D10DA74704D8CEEF9B49")
    public  RectF(Rect r) {
        left = r.left;
        top = r.top;
        right = r.right;
        bottom = r.bottom;
        // ---------- Original Method ----------
        //left = r.left;
        //top = r.top;
        //right = r.right;
        //bottom = r.bottom;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.353 -0400", hash_original_method = "FA213D713D9B00A169FC8BD98F160501", hash_generated_method = "C78BA3A0027510E9E61600CC8DB09A85")
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1882974513 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1882974513 = "RectF(" + left + ", " + top + ", "
                      + right + ", " + bottom + ")";
        varB4EAC82CA7396A68D541C85D26508E83_1882974513.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1882974513;
        // ---------- Original Method ----------
        //return "RectF(" + left + ", " + top + ", "
                      //+ right + ", " + bottom + ")";
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.355 -0400", hash_original_method = "1840D8CED4FEDA16C265C984A5256101", hash_generated_method = "3DE19E4F9DB437572E1ED39C350815B4")
    public String toShortString() {
        String varB4EAC82CA7396A68D541C85D26508E83_1084552310 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1084552310 = toShortString(new StringBuilder(32));
        varB4EAC82CA7396A68D541C85D26508E83_1084552310.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1084552310;
        // ---------- Original Method ----------
        //return toShortString(new StringBuilder(32));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.356 -0400", hash_original_method = "2BF61B85E091A9DA2C18EB7FC26222B9", hash_generated_method = "458F9F47B744F557FEBCCF96576B5123")
    public String toShortString(StringBuilder sb) {
        String varB4EAC82CA7396A68D541C85D26508E83_1681888014 = null; //Variable for return #1
        sb.setLength(0);
        sb.append('[');
        sb.append(left);
        sb.append(',');
        sb.append(top);
        sb.append("][");
        sb.append(right);
        sb.append(',');
        sb.append(bottom);
        sb.append(']');
        varB4EAC82CA7396A68D541C85D26508E83_1681888014 = sb.toString();
        addTaint(sb.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1681888014.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1681888014;
        // ---------- Original Method ----------
        //sb.setLength(0);
        //sb.append('[');
        //sb.append(left);
        //sb.append(',');
        //sb.append(top);
        //sb.append("][");
        //sb.append(right);
        //sb.append(',');
        //sb.append(bottom);
        //sb.append(']');
        //return sb.toString();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.356 -0400", hash_original_method = "78960F3D6EA700D282D0F0C0E94AA84C", hash_generated_method = "7CC9973023E2CD924438EDC646D73B58")
    public void printShortString(PrintWriter pw) {
        pw.print('[');
        pw.print(left);
        pw.print(',');
        pw.print(top);
        pw.print("][");
        pw.print(right);
        pw.print(',');
        pw.print(bottom);
        pw.print(']');
        addTaint(pw.getTaint());
        // ---------- Original Method ----------
        //pw.print('[');
        //pw.print(left);
        //pw.print(',');
        //pw.print(top);
        //pw.print("][");
        //pw.print(right);
        //pw.print(',');
        //pw.print(bottom);
        //pw.print(']');
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.357 -0400", hash_original_method = "D667CC92208C0C47552A2E0207FE57FF", hash_generated_method = "E257CB0C15D1DDC75841CC129C0D61C9")
    public final boolean isEmpty() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1834185688 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1834185688;
        // ---------- Original Method ----------
        //return left >= right || top >= bottom;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.357 -0400", hash_original_method = "83288196EAFBF73D3FE580ACE3981D30", hash_generated_method = "4E052637E9E5BF92D661ACE4BED3299E")
    public final float width() {
        float var546ADE640B6EDFBC8A086EF31347E768_540462065 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_540462065;
        // ---------- Original Method ----------
        //return right - left;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.357 -0400", hash_original_method = "1451CC0FB907B74D5032AD3E1AFBE720", hash_generated_method = "7F04A90A847682ABD43813F45CF81FF8")
    public final float height() {
        float var546ADE640B6EDFBC8A086EF31347E768_2018979629 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_2018979629;
        // ---------- Original Method ----------
        //return bottom - top;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.358 -0400", hash_original_method = "7ED8FBEF71AFB3C2D5FC3097D0B688F2", hash_generated_method = "99925EF247C6B1EC8F579107BE03F7CD")
    public final float centerX() {
        float var546ADE640B6EDFBC8A086EF31347E768_1711445976 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_1711445976;
        // ---------- Original Method ----------
        //return (left + right) * 0.5f;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.358 -0400", hash_original_method = "5D537442DB3A76F3BCD6B0013959D546", hash_generated_method = "C2A61152611863FAF1B50FCEEC8A4CF3")
    public final float centerY() {
        float var546ADE640B6EDFBC8A086EF31347E768_826716382 = getTaintFloat();
        return var546ADE640B6EDFBC8A086EF31347E768_826716382;
        // ---------- Original Method ----------
        //return (top + bottom) * 0.5f;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.359 -0400", hash_original_method = "86DA251BA391C7524C2010551ABD907E", hash_generated_method = "A534843FC0914524CAF333DFA3D47813")
    public void setEmpty() {
        left = right = top = bottom = 0;
        // ---------- Original Method ----------
        //left = right = top = bottom = 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.359 -0400", hash_original_method = "C9CE428718CAD939ED870CC4D06675F8", hash_generated_method = "2A85EE30C4B8864948265082CE411DF6")
    public void set(float left, float top, float right, float bottom) {
        this.left   = left;
        this.top    = top;
        this.right  = right;
        this.bottom = bottom;
        // ---------- Original Method ----------
        //this.left   = left;
        //this.top    = top;
        //this.right  = right;
        //this.bottom = bottom;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.359 -0400", hash_original_method = "A444578B9144FD8B7BC0F962002ECA0D", hash_generated_method = "A2BCF7BFC8C00B0302B6DBD183490028")
    public void set(RectF src) {
        this.left   = src.left;
        this.top    = src.top;
        this.right  = src.right;
        this.bottom = src.bottom;
        // ---------- Original Method ----------
        //this.left   = src.left;
        //this.top    = src.top;
        //this.right  = src.right;
        //this.bottom = src.bottom;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.360 -0400", hash_original_method = "91C11C9F320DC60DE37EBB0C50768E5F", hash_generated_method = "45CCA2CE8624F5E69CCAB95C4EAC18C1")
    public void set(Rect src) {
        this.left   = src.left;
        this.top    = src.top;
        this.right  = src.right;
        this.bottom = src.bottom;
        // ---------- Original Method ----------
        //this.left   = src.left;
        //this.top    = src.top;
        //this.right  = src.right;
        //this.bottom = src.bottom;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.360 -0400", hash_original_method = "987CF6DAC95BF2616996F2B7580ECF09", hash_generated_method = "69E19F3AA943EB5750A9E7830A61E539")
    public void offset(float dx, float dy) {
        left    += dx;
        top     += dy;
        right   += dx;
        bottom  += dy;
        // ---------- Original Method ----------
        //left    += dx;
        //top     += dy;
        //right   += dx;
        //bottom  += dy;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.360 -0400", hash_original_method = "17E8F6A0DA6BEF949708E45EF28FBDEC", hash_generated_method = "84DEB00742BF1B269391B92566372004")
    public void offsetTo(float newLeft, float newTop) {
        right += newLeft - left;
        bottom += newTop - top;
        left = newLeft;
        top = newTop;
        // ---------- Original Method ----------
        //right += newLeft - left;
        //bottom += newTop - top;
        //left = newLeft;
        //top = newTop;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.361 -0400", hash_original_method = "4ED8FEC7EC4817417CFF539CEB8CD3D5", hash_generated_method = "04F62736CE8F4E9564C2C46286D37109")
    public void inset(float dx, float dy) {
        left    += dx;
        top     += dy;
        right   -= dx;
        bottom  -= dy;
        // ---------- Original Method ----------
        //left    += dx;
        //top     += dy;
        //right   -= dx;
        //bottom  -= dy;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.361 -0400", hash_original_method = "7C65F21BA78E9C886CB99F3A821D7FC2", hash_generated_method = "F01D2A5D83E74BBAB750591062F2E38A")
    public boolean contains(float x, float y) {
        addTaint(x);
        addTaint(y);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1316185637 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1316185637;
        // ---------- Original Method ----------
        //return left < right && top < bottom  
                //&& x >= left && x < right && y >= top && y < bottom;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.362 -0400", hash_original_method = "5736B1A89F8587C3C51B72E5484012E7", hash_generated_method = "240E29993F84434A029A9BBA27A422F4")
    public boolean contains(float left, float top, float right, float bottom) {
        addTaint(left);
        addTaint(top);
        addTaint(right);
        addTaint(bottom);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_185020360 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_185020360;
        // ---------- Original Method ----------
        //return this.left < this.right && this.top < this.bottom
                //&& this.left <= left && this.top <= top
                //&& this.right >= right && this.bottom >= bottom;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.362 -0400", hash_original_method = "89862D8BCB63DE9E9B3F12DF7005EDAF", hash_generated_method = "057A29CD47DA14DA37E3F850A6F96603")
    public boolean contains(RectF r) {
        addTaint(r.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1242894379 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1242894379;
        // ---------- Original Method ----------
        //return this.left < this.right && this.top < this.bottom
                //&& left <= r.left && top <= r.top
                //&& right >= r.right && bottom >= r.bottom;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.362 -0400", hash_original_method = "B665C4D2FA87DEF248CEB5906A538992", hash_generated_method = "753EF42259456D3DFDC73D1BF3E1E10F")
    public boolean intersect(float left, float top, float right, float bottom) {
        {
            {
                this.left = left;
            } //End block
            {
                this.top = top;
            } //End block
            {
                this.right = right;
            } //End block
            {
                this.bottom = bottom;
            } //End block
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_585145265 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_585145265;
        // ---------- Original Method ----------
        //if (this.left < right && left < this.right
                //&& this.top < bottom && top < this.bottom) {
            //if (this.left < left) {
                //this.left = left;
            //}
            //if (this.top < top) {
                //this.top = top;
            //}
            //if (this.right > right) {
                //this.right = right;
            //}
            //if (this.bottom > bottom) {
                //this.bottom = bottom;
            //}
            //return true;
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.363 -0400", hash_original_method = "F1511D7F30AFB03A76430BC5FB3647DC", hash_generated_method = "DA4B06C1E49E2170C728010107D54618")
    public boolean intersect(RectF r) {
        boolean var774B7820222CF99C9D397FA2889989AA_1734117939 = (intersect(r.left, r.top, r.right, r.bottom));
        addTaint(r.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_244776544 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_244776544;
        // ---------- Original Method ----------
        //return intersect(r.left, r.top, r.right, r.bottom);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.364 -0400", hash_original_method = "798EF6BEBDE27EE5C0F4552CB6C0BADF", hash_generated_method = "FC2F97402DFDFED7E112B36D3590660E")
    public boolean setIntersect(RectF a, RectF b) {
        {
            left = Math.max(a.left, b.left);
            top = Math.max(a.top, b.top);
            right = Math.min(a.right, b.right);
            bottom = Math.min(a.bottom, b.bottom);
        } //End block
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_88052381 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_88052381;
        // ---------- Original Method ----------
        //if (a.left < b.right && b.left < a.right
                //&& a.top < b.bottom && b.top < a.bottom) {
            //left = Math.max(a.left, b.left);
            //top = Math.max(a.top, b.top);
            //right = Math.min(a.right, b.right);
            //bottom = Math.min(a.bottom, b.bottom);
            //return true;
        //}
        //return false;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.364 -0400", hash_original_method = "7636A1ABF3E5D698C7B1F582C19267F0", hash_generated_method = "6F04DDED065CEA6B0B08853163B16C49")
    public boolean intersects(float left, float top, float right,
                              float bottom) {
        addTaint(left);
        addTaint(top);
        addTaint(right);
        addTaint(bottom);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_970587370 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_970587370;
        // ---------- Original Method ----------
        //return this.left < right && left < this.right
                //&& this.top < bottom && top < this.bottom;
    }

    
    public static boolean intersects(RectF a, RectF b) {
        return a.left < b.right && b.left < a.right
                && a.top < b.bottom && b.top < a.bottom;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.365 -0400", hash_original_method = "1D9E886326ACAAED42A7320F81B83BDE", hash_generated_method = "FE539F7150ED814B7D80DC25E8406E21")
    public void round(Rect dst) {
        dst.set(FastMath.round(left), FastMath.round(top),
                FastMath.round(right), FastMath.round(bottom));
        addTaint(dst.getTaint());
        // ---------- Original Method ----------
        //dst.set(FastMath.round(left), FastMath.round(top),
                //FastMath.round(right), FastMath.round(bottom));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.367 -0400", hash_original_method = "5165AD4866DE272C811B07E7C1D571CC", hash_generated_method = "0941D6AE737A7FAC595D38B19FD01A05")
    public void roundOut(Rect dst) {
        dst.set((int) FloatMath.floor(left), (int) FloatMath.floor(top),
                (int) FloatMath.ceil(right), (int) FloatMath.ceil(bottom));
        addTaint(dst.getTaint());
        // ---------- Original Method ----------
        //dst.set((int) FloatMath.floor(left), (int) FloatMath.floor(top),
                //(int) FloatMath.ceil(right), (int) FloatMath.ceil(bottom));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.368 -0400", hash_original_method = "4ED17A6A0BD221C6F562FF187EDE0EC1", hash_generated_method = "990600F70910F6255BC05839F2A57981")
    public void union(float left, float top, float right, float bottom) {
        {
            {
                this.left = left;
                this.top = top;
                this.right = right;
                this.bottom = bottom;
            } //End block
            {
                this.left = left;
                this.top = top;
                this.right = right;
                this.bottom = bottom;
            } //End block
        } //End block
        // ---------- Original Method ----------
        //if ((left < right) && (top < bottom)) {
            //if ((this.left < this.right) && (this.top < this.bottom)) {
                //if (this.left > left)
                    //this.left = left;
                //if (this.top > top)
                    //this.top = top;
                //if (this.right < right)
                    //this.right = right;
                //if (this.bottom < bottom)
                    //this.bottom = bottom;
            //} else {
                //this.left = left;
                //this.top = top;
                //this.right = right;
                //this.bottom = bottom;
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.368 -0400", hash_original_method = "7333A4F184A018E8DCD665D788936108", hash_generated_method = "B92E57F7FC5743A0AFEF17E24058E30F")
    public void union(RectF r) {
        union(r.left, r.top, r.right, r.bottom);
        addTaint(r.getTaint());
        // ---------- Original Method ----------
        //union(r.left, r.top, r.right, r.bottom);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.369 -0400", hash_original_method = "5491E96A191FF9AA58559CF28A27B675", hash_generated_method = "04C5075A3B8F4698E7E5AF47B929E95E")
    public void union(float x, float y) {
        {
            left = x;
        } //End block
        {
            right = x;
        } //End block
        {
            top = y;
        } //End block
        {
            bottom = y;
        } //End block
        // ---------- Original Method ----------
        //if (x < left) {
            //left = x;
        //} else if (x > right) {
            //right = x;
        //}
        //if (y < top) {
            //top = y;
        //} else if (y > bottom) {
            //bottom = y;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.369 -0400", hash_original_method = "5E187609DBD260B5F8E2F7AA44836C46", hash_generated_method = "E9356B7B767D9ED3588B221AA713E0E5")
    public void sort() {
        {
            float temp = left;
            left = right;
            right = temp;
        } //End block
        {
            float temp = top;
            top = bottom;
            bottom = temp;
        } //End block
        // ---------- Original Method ----------
        //if (left > right) {
            //float temp = left;
            //left = right;
            //right = temp;
        //}
        //if (top > bottom) {
            //float temp = top;
            //top = bottom;
            //bottom = temp;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.370 -0400", hash_original_method = "00F8174F9E89D0C972FA6D3F19742382", hash_generated_method = "D4A483A764B40B220E733D5904EDA4CF")
    public int describeContents() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1524913587 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1524913587;
        // ---------- Original Method ----------
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.370 -0400", hash_original_method = "5C789B83F9658DFF3AD82091DAFFDD49", hash_generated_method = "394C38F3B668560EE9872DC1F5EF552B")
    public void writeToParcel(Parcel out, int flags) {
        out.writeFloat(left);
        out.writeFloat(top);
        out.writeFloat(right);
        out.writeFloat(bottom);
        addTaint(out.getTaint());
        addTaint(flags);
        // ---------- Original Method ----------
        //out.writeFloat(left);
        //out.writeFloat(top);
        //out.writeFloat(right);
        //out.writeFloat(bottom);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.370 -0400", hash_original_method = "BACCEAD3B6EC38250A4D00D9AA0D9F78", hash_generated_method = "5840D49EC2222CD5F0BDEB5ED8E3F923")
    public void readFromParcel(Parcel in) {
        left = in.readFloat();
        top = in.readFloat();
        right = in.readFloat();
        bottom = in.readFloat();
        // ---------- Original Method ----------
        //left = in.readFloat();
        //top = in.readFloat();
        //right = in.readFloat();
        //bottom = in.readFloat();
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:32.371 -0400", hash_original_field = "5E7201C60E05C026DD3550B3101B80A5", hash_generated_field = "C46FA4AE8D434E2146AE8F7264B82507")

    public static final Parcelable.Creator<RectF> CREATOR = new Parcelable.Creator<RectF>() {
        
        public RectF createFromParcel(Parcel in) {
            RectF r = new RectF();
            r.readFromParcel(in);
            return r;
        }
        
        
        public RectF[] newArray(int size) {
            return new RectF[size];
        }
    };
    // orphaned legacy method
    public RectF createFromParcel(Parcel in) {
            RectF r = new RectF();
            r.readFromParcel(in);
            return r;
        }
    
    // orphaned legacy method
    public RectF[] newArray(int size) {
            return new RectF[size];
        }
    
}

