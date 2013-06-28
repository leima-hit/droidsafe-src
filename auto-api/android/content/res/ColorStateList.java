package android.content.res;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import com.android.internal.util.ArrayUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.StateSet;
import android.util.Xml;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class ColorStateList implements Parcelable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.522 -0400", hash_original_field = "90D2BFFC9D360D1A65ACEAB45ADBE457", hash_generated_field = "7D52F505B14BC667C4ED1C5AB261B59A")

    private int[][] mStateSpecs;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.522 -0400", hash_original_field = "F5B754067786840AA79148E1DA0BE95F", hash_generated_field = "53BCC056E3008A06A88375FEB8668D58")

    private int[] mColors;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.522 -0400", hash_original_field = "19E481D0B803854FFC562966D69D049D", hash_generated_field = "57E8521AC9CBFD385A5C49D98FB81CDC")

    private int mDefaultColor = 0xffff0000;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.523 -0400", hash_original_method = "A1B9AA8D55CC71F4C566F389AC3D8BBC", hash_generated_method = "B853D9FA4CC0F774905FDCA69D04F16F")
    private  ColorStateList() {
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.523 -0400", hash_original_method = "16DE5E515D4E313298C804E12AA820B9", hash_generated_method = "46A2C1A839D611D2A6458B87B0FEA9BC")
    public  ColorStateList(int[][] states, int[] colors) {
        mStateSpecs = states;
        mColors = colors;
        {
            mDefaultColor = colors[0];
            {
                int i = 0;
                {
                    {
                        mDefaultColor = colors[i];
                    } //End block
                } //End block
            } //End collapsed parenthetic
        } //End block
        // ---------- Original Method ----------
        //mStateSpecs = states;
        //mColors = colors;
        //if (states.length > 0) {
            //mDefaultColor = colors[0];
            //for (int i = 0; i < states.length; i++) {
                //if (states[i].length == 0) {
                    //mDefaultColor = colors[i];
                //}
            //}
        //}
    }

    
    public static ColorStateList valueOf(int color) {
        synchronized (sCache) {
            WeakReference<ColorStateList> ref = sCache.get(color);
            ColorStateList csl = ref != null ? ref.get() : null;
            if (csl != null) {
                return csl;
            }
            csl = new ColorStateList(EMPTY, new int[] { color });
            sCache.put(color, new WeakReference<ColorStateList>(csl));
            return csl;
        }
    }

    
    public static ColorStateList createFromXml(Resources r, XmlPullParser parser) throws XmlPullParserException, IOException {
        AttributeSet attrs = Xml.asAttributeSet(parser);
        int type;
        while ((type=parser.next()) != XmlPullParser.START_TAG
                   && type != XmlPullParser.END_DOCUMENT) {
        }
        if (type != XmlPullParser.START_TAG) {
            throw new XmlPullParserException("No start tag found");
        }
        return createFromXmlInner(r, parser, attrs);
    }

    
    private static ColorStateList createFromXmlInner(Resources r, XmlPullParser parser,
            AttributeSet attrs) throws XmlPullParserException, IOException {
        ColorStateList colorStateList;
        final String name = parser.getName();
        if (name.equals("selector")) {
            colorStateList = new ColorStateList();
        } else {
            throw new XmlPullParserException(
                parser.getPositionDescription() + ": invalid drawable tag " + name);
        }
        colorStateList.inflate(r, parser, attrs);
        return colorStateList;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.525 -0400", hash_original_method = "C02A6B069CD8C9360FEC8CA407C14B4A", hash_generated_method = "EB747186EA8B3BD870D7A5A0C5E4381D")
    public ColorStateList withAlpha(int alpha) {
        ColorStateList varB4EAC82CA7396A68D541C85D26508E83_103895614 = null; //Variable for return #1
        int[] colors = new int[mColors.length];
        int len = colors.length;
        {
            int i = 0;
            {
                colors[i] = (mColors[i] & 0xFFFFFF) | (alpha << 24);
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_103895614 = new ColorStateList(mStateSpecs, colors);
        addTaint(alpha);
        varB4EAC82CA7396A68D541C85D26508E83_103895614.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_103895614;
        // ---------- Original Method ----------
        //int[] colors = new int[mColors.length];
        //int len = colors.length;
        //for (int i = 0; i < len; i++) {
            //colors[i] = (mColors[i] & 0xFFFFFF) | (alpha << 24);
        //}
        //return new ColorStateList(mStateSpecs, colors);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:07.376 -0400", hash_original_method = "096D4D4F0EE82FD61B43B813E755281E", hash_generated_method = "4BD665673C7E701B7026116D2AFC4DBA")
    private void inflate(Resources r, XmlPullParser parser, AttributeSet attrs) throws XmlPullParserException, IOException {
        int type;
        int innerDepth;
        innerDepth = parser.getDepth()+1;
        int depth = 0;
        int listAllocated;
        listAllocated = 20;
        int listSize;
        listSize = 0;
        int[] colorList;
        colorList = new int[listAllocated];
        int[][] stateSpecList;
        stateSpecList = new int[listAllocated][];
        {
            boolean varF60F42190EBD36C414D066F0689226DF_445396532 = ((type=parser.next()) != XmlPullParser.END_DOCUMENT
               && ((depth=parser.getDepth()) >= innerDepth
                   || type != XmlPullParser.END_TAG));
            {
                {
                    boolean var03C44ADC0346A0FD12ECFE38D2A0612F_745435210 = (depth > innerDepth || !parser.getName().equals("item"));
                } //End collapsed parenthetic
                int colorRes;
                colorRes = 0;
                int color;
                color = 0xffff0000;
                boolean haveColor;
                haveColor = false;
                int i;
                int j;
                j = 0;
                int numAttrs;
                numAttrs = attrs.getAttributeCount();
                int[] stateSpec;
                stateSpec = new int[numAttrs];
                {
                    i = 0;
                    {
                        int stateResId;
                        stateResId = attrs.getAttributeNameResource(i);
                        {
                            colorRes = attrs.getAttributeResourceValue(i, 0);
                            {
                                color = attrs.getAttributeIntValue(i, color);
                                haveColor = true;
                            } //End block
                        } //End block
                        {
                            stateSpec[j++] = attrs.getAttributeBooleanValue(i, false)
                                  ? stateResId
                                  : -stateResId;
                        } //End block
                    } //End block
                } //End collapsed parenthetic
                stateSpec = StateSet.trimStateSet(stateSpec, j);
                {
                    color = r.getColor(colorRes);
                } //End block
                {
                    if (DroidSafeAndroidRuntime.control) throw new XmlPullParserException(
                        parser.getPositionDescription()
                        + ": <item> tag requires a 'android:color' attribute.");
                } //End block
                {
                    mDefaultColor = color;
                } //End block
                {
                    listAllocated = ArrayUtils.idealIntArraySize(listSize + 1);
                    int[] ncolor;
                    ncolor = new int[listAllocated];
                    System.arraycopy(colorList, 0, ncolor, 0, listSize);
                    int[][] nstate;
                    nstate = new int[listAllocated][];
                    System.arraycopy(stateSpecList, 0, nstate, 0, listSize);
                    colorList = ncolor;
                    stateSpecList = nstate;
                } //End block
                colorList[listSize] = color;
                stateSpecList[listSize] = stateSpec;
            } //End block
        } //End collapsed parenthetic
        mColors = new int[listSize];
        mStateSpecs = new int[listSize][];
        System.arraycopy(colorList, 0, mColors, 0, listSize);
        System.arraycopy(stateSpecList, 0, mStateSpecs, 0, listSize);
        addTaint(r.getTaint());
        addTaint(parser.getTaint());
        addTaint(attrs.getTaint());
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.527 -0400", hash_original_method = "1C923E0661B9E6FB6B4C6C1FDCEBD767", hash_generated_method = "33C608D6131EAED1F1AE6B698C14377C")
    public boolean isStateful() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_696671904 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_696671904;
        // ---------- Original Method ----------
        //return mStateSpecs.length > 1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.528 -0400", hash_original_method = "4327A241B2C451B5F5DDB6DF79352F03", hash_generated_method = "BE309A20F90CED83CE2CA312D63144F1")
    public int getColorForState(int[] stateSet, int defaultColor) {
        final int setLength = mStateSpecs.length;
        {
            int i = 0;
            {
                int[] stateSpec = mStateSpecs[i];
                {
                    boolean var0BC14A81E745300E188A9AE767EF71BA_1695234420 = (StateSet.stateSetMatches(stateSpec, stateSet));
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(stateSet[0]);
        addTaint(defaultColor);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1281117553 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1281117553;
        // ---------- Original Method ----------
        //final int setLength = mStateSpecs.length;
        //for (int i = 0; i < setLength; i++) {
            //int[] stateSpec = mStateSpecs[i];
            //if (StateSet.stateSetMatches(stateSpec, stateSet)) {
                //return mColors[i];
            //}
        //}
        //return defaultColor;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.529 -0400", hash_original_method = "28A9CB761E85FC98D00C67A51FDC0266", hash_generated_method = "A1261B3A44D48A736BA686A3021414F9")
    public int getDefaultColor() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2079169662 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2079169662;
        // ---------- Original Method ----------
        //return mDefaultColor;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.530 -0400", hash_original_method = "1483B624C0E3738F481F261D24FE0627", hash_generated_method = "8E0AAF6F0EAB6F3701BAF7E46A562F83")
    public String toString() {
        String varB4EAC82CA7396A68D541C85D26508E83_895378040 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_895378040 = "ColorStateList{" +
               "mStateSpecs=" + Arrays.deepToString(mStateSpecs) +
               "mColors=" + Arrays.toString(mColors) +
               "mDefaultColor=" + mDefaultColor + '}';
        varB4EAC82CA7396A68D541C85D26508E83_895378040.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_895378040;
        // ---------- Original Method ----------
        //return "ColorStateList{" +
               //"mStateSpecs=" + Arrays.deepToString(mStateSpecs) +
               //"mColors=" + Arrays.toString(mColors) +
               //"mDefaultColor=" + mDefaultColor + '}';
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.530 -0400", hash_original_method = "00F8174F9E89D0C972FA6D3F19742382", hash_generated_method = "FA2220AC860B5A28B259B2B1689BC67C")
    public int describeContents() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2039654779 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2039654779;
        // ---------- Original Method ----------
        //return 0;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.531 -0400", hash_original_method = "E1B2D8F50F6285FEE430316C6FD92D49", hash_generated_method = "12C276F1F67DD6CE000F5D90294DADB4")
    public void writeToParcel(Parcel dest, int flags) {
        final int N = mStateSpecs.length;
        dest.writeInt(N);
        {
            int i = 0;
            {
                dest.writeIntArray(mStateSpecs[i]);
            } //End block
        } //End collapsed parenthetic
        dest.writeIntArray(mColors);
        addTaint(dest.getTaint());
        addTaint(flags);
        // ---------- Original Method ----------
        //final int N = mStateSpecs.length;
        //dest.writeInt(N);
        //for (int i=0; i<N; i++) {
            //dest.writeIntArray(mStateSpecs[i]);
        //}
        //dest.writeIntArray(mColors);
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.531 -0400", hash_original_field = "080ED7BBEFB1373EE8C4DA7AC0219B51", hash_generated_field = "41F1B900ACFD3D3CE9828C8FBA43A76D")

    private static final int[][] EMPTY = new int[][] { new int[0] };
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.531 -0400", hash_original_field = "38EF06A4AFF04E20ADCD0BEE948F04D6", hash_generated_field = "63E4E9738983D663C4BF9E32C63A6A40")

    private static final SparseArray<WeakReference<ColorStateList>> sCache = new SparseArray<WeakReference<ColorStateList>>();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:28.531 -0400", hash_original_field = "1BBFF86921A48C3AD8A7B5472F436B50", hash_generated_field = "C7405A28A73CE53110DBA3CB822ABCA2")

    public static final Parcelable.Creator<ColorStateList> CREATOR =
            new Parcelable.Creator<ColorStateList>() {
        public ColorStateList[] newArray(int size) {
            return new ColorStateList[size];
        }

        public ColorStateList createFromParcel(Parcel source) {
            final int N = source.readInt();
            int[][] stateSpecs = new int[N][];
            for (int i=0; i<N; i++) {
                stateSpecs[i] = source.createIntArray();
            }
            int[] colors = source.createIntArray();
            return new ColorStateList(stateSpecs, colors);
        }
    };
    // orphaned legacy method
    public ColorStateList createFromParcel(Parcel source) {
            final int N = source.readInt();
            int[][] stateSpecs = new int[N][];
            for (int i=0; i<N; i++) {
                stateSpecs[i] = source.createIntArray();
            }
            int[] colors = source.createIntArray();
            return new ColorStateList(stateSpecs, colors);
        }
    
    // orphaned legacy method
    public ColorStateList[] newArray(int size) {
            return new ColorStateList[size];
        }
    
}

