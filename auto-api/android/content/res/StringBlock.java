package android.content.res;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.text.*;
import android.text.style.*;
import android.util.Log;
import android.util.SparseArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.android.internal.util.XmlUtils;

final class StringBlock {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.242 -0400", hash_original_field = "8AF77D45DED615EEBE14D961B1D7F7CE", hash_generated_field = "9DD3DA3B4DB5A1786C464E9BB7FF265B")

    private int mNative;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.242 -0400", hash_original_field = "2A38A4CCD243A9CE690C2513B39533CA", hash_generated_field = "038BAFF209AC24C690C68705B5282717")

    private boolean mUseSparse;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.242 -0400", hash_original_field = "F802401598A8908D003E80718CBFDDBE", hash_generated_field = "6595126F0D7DB182D889144E969DE4FE")

    private boolean mOwnsNative;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.242 -0400", hash_original_field = "DCFA8FC1CFB8B5A5290D25EC1EA3C56B", hash_generated_field = "F69AC8135E9EA2A3E547A8754C61F3E8")

    private CharSequence[] mStrings;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.242 -0400", hash_original_field = "64C4D68429588D5D67FADE5F8FD3E8A3", hash_generated_field = "FDA16845E27F0B9F87DA93CF41FC8E3B")

    private SparseArray<CharSequence> mSparseStrings;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.242 -0400", hash_original_field = "B5123735AFFF78DF8F617C925BF7C0C0", hash_generated_field = "C5DFF8B48B5B047DBBB9D4B2E886F5DF")

    StyleIDs mStyleIDs = null;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.243 -0400", hash_original_method = "C056884F6217F27ACF2C69899BB237D2", hash_generated_method = "17AEF75A57D96F90032FD5E77DD3B316")
    public  StringBlock(byte[] data, boolean useSparse) {
        mNative = nativeCreate(data, 0, data.length);
        mUseSparse = useSparse;
        mOwnsNative = true;
        
        
        
        
        
                
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.243 -0400", hash_original_method = "325B6049E710893083487955374CD75A", hash_generated_method = "0A6B9CBC97E599CD3D9F2FBEB9EC2E61")
    public  StringBlock(byte[] data, int offset, int size, boolean useSparse) {
        mNative = nativeCreate(data, offset, size);
        mUseSparse = useSparse;
        mOwnsNative = true;
        
        
        
        
        
                
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.244 -0400", hash_original_method = "451F884D80CF979FA811D85381B93BA8", hash_generated_method = "BF2A607DC96A8F0B3394B862C35E61B6")
      StringBlock(int obj, boolean useSparse) {
        mNative = obj;
        mUseSparse = useSparse;
        mOwnsNative = false;
        
        
        
        
        
                
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.247 -0400", hash_original_method = "CA0D40E41A55E0E3360E62E713B76B88", hash_generated_method = "0E222C11ABCB4E8BB8D2F5BD60A0D881")
    public CharSequence get(int idx) {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_131917601 = null; 
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1343160944 = null; 
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_550830151 = null; 
        {
            {
                CharSequence res = mStrings[idx];
                {
                    varB4EAC82CA7396A68D541C85D26508E83_131917601 = res;
                } 
            } 
            {
                CharSequence res = mSparseStrings.get(idx);
                {
                    varB4EAC82CA7396A68D541C85D26508E83_1343160944 = res;
                } 
            } 
            {
                final int num = nativeGetSize(mNative);
                {
                    mSparseStrings = new SparseArray<CharSequence>();
                } 
                {
                    mStrings = new CharSequence[num];
                } 
            } 
            String str = nativeGetString(mNative, idx);
            CharSequence res = str;
            int[] style = nativeGetStyle(mNative, idx);
            {
                {
                    mStyleIDs = new StyleIDs();
                } 
                {
                    int styleIndex = 0;
                    styleIndex += 3;
                    {
                        int styleId = style[styleIndex];
                        String styleTag = nativeGetString(mNative, styleId);
                        {
                            boolean varC887F6D4B30EC541E65DBFBDBCDD62AA_478382820 = (styleTag.equals("b"));
                            {
                                mStyleIDs.boldId = styleId;
                            } 
                            {
                                boolean varAAA8D27A262C4AA33AA77708C8723E3C_144656937 = (styleTag.equals("i"));
                                {
                                    mStyleIDs.italicId = styleId;
                                } 
                                {
                                    boolean var0F276DEC02D5224F8D1A94CEA8B56222_1615678314 = (styleTag.equals("u"));
                                    {
                                        mStyleIDs.underlineId = styleId;
                                    } 
                                    {
                                        boolean var65A7CE7F99CEFD7C5E702A02D7375627_160888998 = (styleTag.equals("tt"));
                                        {
                                            mStyleIDs.ttId = styleId;
                                        } 
                                        {
                                            boolean var8E9D24A56B951FD8B4556AC9687B862D_326497607 = (styleTag.equals("big"));
                                            {
                                                mStyleIDs.bigId = styleId;
                                            } 
                                            {
                                                boolean var50968B7296438CFFE7941F4277358F12_895988699 = (styleTag.equals("small"));
                                                {
                                                    mStyleIDs.smallId = styleId;
                                                } 
                                                {
                                                    boolean var12A2A849B5F8D70ACBACAC923F8AFE6E_410791596 = (styleTag.equals("sup"));
                                                    {
                                                        mStyleIDs.supId = styleId;
                                                    } 
                                                    {
                                                        boolean var3F8A168B86441E49333296C71DC57C4E_967802340 = (styleTag.equals("sub"));
                                                        {
                                                            mStyleIDs.subId = styleId;
                                                        } 
                                                        {
                                                            boolean var18AE5CBDC95E4D4C7134523455ADC26F_1181283849 = (styleTag.equals("strike"));
                                                            {
                                                                mStyleIDs.strikeId = styleId;
                                                            } 
                                                            {
                                                                boolean var7EBEE9E50CFF4D1C5480F34A4BF58B42_1535532486 = (styleTag.equals("li"));
                                                                {
                                                                    mStyleIDs.listItemId = styleId;
                                                                } 
                                                                {
                                                                    boolean var46A9EEE2572CA803DC0C183361FDF85A_1901445616 = (styleTag.equals("marquee"));
                                                                    {
                                                                        mStyleIDs.marqueeId = styleId;
                                                                    } 
                                                                } 
                                                            } 
                                                        } 
                                                    } 
                                                } 
                                            } 
                                        } 
                                    } 
                                } 
                            } 
                        } 
                    } 
                } 
                res = applyStyles(str, style, mStyleIDs);
            } 
            mStrings[idx] = res;
            mSparseStrings.put(idx, res);
            varB4EAC82CA7396A68D541C85D26508E83_550830151 = res;
        } 
        CharSequence varA7E53CE21691AB073D9660D615818899_2039351503; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_2039351503 = varB4EAC82CA7396A68D541C85D26508E83_131917601;
                break;
            case 2: 
                varA7E53CE21691AB073D9660D615818899_2039351503 = varB4EAC82CA7396A68D541C85D26508E83_1343160944;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_2039351503 = varB4EAC82CA7396A68D541C85D26508E83_550830151;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_2039351503.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_2039351503;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.247 -0400", hash_original_method = "0AE42B829C6407A7351435B91C0A8F63", hash_generated_method = "065278051329C532BB29C2C6B986F5B5")
    protected void finalize() throws Throwable {
        {
            nativeDestroy(mNative);
        } 
        
        
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-27 14:37:09.926 -0400", hash_original_method = "7157B2241FD2EE4083D0D740C065977B", hash_generated_method = "47E278B8CBB46F5565934E771D2EC7D9")
    private CharSequence applyStyles(String str, int[] style, StyleIDs ids) {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1426710465 = null; 
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_106695220 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1426710465 = str;
        SpannableString buffer;
        buffer = new SpannableString(str);
        int i;
        i = 0;
        {
            int type;
            type = style[i];
            {
                buffer.setSpan(new StyleSpan(Typeface.BOLD),
                               style[i+1], style[i+2]+1,
                               Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            } 
            {
                buffer.setSpan(new StyleSpan(Typeface.ITALIC),
                               style[i+1], style[i+2]+1,
                               Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            } 
            {
                buffer.setSpan(new UnderlineSpan(),
                               style[i+1], style[i+2]+1,
                               Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            } 
            {
                buffer.setSpan(new TypefaceSpan("monospace"),
                               style[i+1], style[i+2]+1,
                               Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            } 
            {
                buffer.setSpan(new RelativeSizeSpan(1.25f),
                               style[i+1], style[i+2]+1,
                               Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            } 
            {
                buffer.setSpan(new RelativeSizeSpan(0.8f),
                               style[i+1], style[i+2]+1,
                               Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            } 
            {
                buffer.setSpan(new SubscriptSpan(),
                               style[i+1], style[i+2]+1,
                               Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            } 
            {
                buffer.setSpan(new SuperscriptSpan(),
                               style[i+1], style[i+2]+1,
                               Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            } 
            {
                buffer.setSpan(new StrikethroughSpan(),
                               style[i+1], style[i+2]+1,
                               Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            } 
            {
                addParagraphSpan(buffer, new BulletSpan(10),
                                style[i+1], style[i+2]+1);
            } 
            {
                buffer.setSpan(TextUtils.TruncateAt.MARQUEE,
                               style[i+1], style[i+2]+1,
                               Spannable.SPAN_INCLUSIVE_INCLUSIVE);
            } 
            {
                String tag;
                tag = nativeGetString(mNative, type);
                {
                    boolean var23E0416BE433D3D26629FB0DCAA41E29_1331844763 = (tag.startsWith("font;"));
                    {
                        String sub;
                        sub = subtag(tag, ";height=");
                        {
                            int size;
                            size = Integer.parseInt(sub);
                            addParagraphSpan(buffer, new Height(size),
                                       style[i+1], style[i+2]+1);
                        } 
                        sub = subtag(tag, ";size=");
                        {
                            int size;
                            size = Integer.parseInt(sub);
                            buffer.setSpan(new AbsoluteSizeSpan(size, true),
                                       style[i+1], style[i+2]+1,
                                       Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                        } 
                        sub = subtag(tag, ";fgcolor=");
                        {
                            int color;
                            color = XmlUtils.convertValueToUnsignedInt(sub, -1);
                            buffer.setSpan(new ForegroundColorSpan(color),
                                       style[i+1], style[i+2]+1,
                                       Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                        } 
                        sub = subtag(tag, ";bgcolor=");
                        {
                            int color;
                            color = XmlUtils.convertValueToUnsignedInt(sub, -1);
                            buffer.setSpan(new BackgroundColorSpan(color),
                                       style[i+1], style[i+2]+1,
                                       Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                        } 
                    } 
                    {
                        boolean var72BAF1DD6E2FA7F7405258DE30A10892_1272296155 = (tag.startsWith("a;"));
                        {
                            String sub;
                            sub = subtag(tag, ";href=");
                            {
                                buffer.setSpan(new URLSpan(sub),
                                       style[i+1], style[i+2]+1,
                                       Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                            } 
                        } 
                        {
                            boolean var0CBB4E0FE848A98207331F42BFE74A96_989381253 = (tag.startsWith("annotation;"));
                            {
                                int len;
                                len = tag.length();
                                int next = 0;
                                {
                                    int t;
                                    t = tag.indexOf(';');
                                    t = next;
                                    {
                                        int eq;
                                        eq = tag.indexOf('=', t);
                                        next = tag.indexOf(';', eq);
                                        {
                                            next = len;
                                        } 
                                        String key;
                                        key = tag.substring(t + 1, eq);
                                        String value;
                                        value = tag.substring(eq + 1, next);
                                        buffer.setSpan(new Annotation(key, value),
                                       style[i+1], style[i+2]+1,
                                       Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                                    } 
                                } 
                            } 
                        } 
                    } 
                } 
            } 
            i += 3;
        } 
        varB4EAC82CA7396A68D541C85D26508E83_106695220 = new SpannedString(buffer);
        addTaint(str.getTaint());
        addTaint(style[0]);
        addTaint(ids.getTaint());
        CharSequence varA7E53CE21691AB073D9660D615818899_402074517; 
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: 
                varA7E53CE21691AB073D9660D615818899_402074517 = varB4EAC82CA7396A68D541C85D26508E83_1426710465;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_402074517 = varB4EAC82CA7396A68D541C85D26508E83_106695220;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_402074517.addTaint(getTaint()); 
        return varA7E53CE21691AB073D9660D615818899_402074517;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    private static void addParagraphSpan(Spannable buffer, Object what,
                                         int start, int end) {
        int len = buffer.length();
        if (start != 0 && start != len && buffer.charAt(start - 1) != '\n') {
            for (start--; start > 0; start--) {
                if (buffer.charAt(start - 1) == '\n') {
                    break;
                }
            }
        }
        if (end != 0 && end != len && buffer.charAt(end - 1) != '\n') {
            for (end++; end < len; end++) {
                if (buffer.charAt(end - 1) == '\n') {
                    break;
                }
            }
        }
        buffer.setSpan(what, start, end, Spannable.SPAN_PARAGRAPH);
    }

    
    @DSModeled(DSC.SAFE)
    private static String subtag(String full, String attribute) {
        int start = full.indexOf(attribute);
        if (start < 0) {
            return null;
        }
        start += attribute.length();
        int end = full.indexOf(';', start);
        if (end < 0) {
            return full.substring(start);
        } else {
            return full.substring(start, end);
        }
    }

    
    private static final int nativeCreate(byte[] data,
                                                 int offset,
                                                 int size) {
        return DSUtils.UNKNOWN_INT;
    }

    
    private static final int nativeGetSize(int obj) {
        return DSUtils.UNKNOWN_INT;
    }

    
    private static final String nativeGetString(int obj, int idx) {
        	String ret = new String();
        	ret.addTaint(obj);
        	ret.addTaint(idx);
        	return ret;
    }

    
    private static final int[] nativeGetStyle(int obj, int idx) {
        int[] ret = {DSUtils.UNKNOWN_INT};
        return ret;
    }

    
    private static final void nativeDestroy(int obj) {
    }

    
    static final class StyleIDs {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.250 -0400", hash_original_field = "8929F60960F20370C15483AF224B1EAF", hash_generated_field = "8BDB7171C09EC9A28241743847C2F13E")

        private int boldId = -1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.250 -0400", hash_original_field = "FABD409DACB3A477CA91454B83ABCA28", hash_generated_field = "74A882A455EB3847986DA18889B12ABD")

        private int italicId = -1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.250 -0400", hash_original_field = "191B082733B8400625829E1BF82A5984", hash_generated_field = "4B178C0E94E6CB7A9EABABF4E226C358")

        private int underlineId = -1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.250 -0400", hash_original_field = "9D75F65BAA96E3876CED4CA073865EAD", hash_generated_field = "3B876BCFB315722E8FE854115777283C")

        private int ttId = -1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.250 -0400", hash_original_field = "52691BA3827A29F3E79DFB9FE11DB6E7", hash_generated_field = "1662651FF3F5BF94937725EEC1E5E163")

        private int bigId = -1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.250 -0400", hash_original_field = "3AD8F230B4D50E3AFD2E9CDF97A81BED", hash_generated_field = "395D60D5C1FC7586ACC1582BFFB1D8F4")

        private int smallId = -1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.250 -0400", hash_original_field = "A38D530972AA77B1D220067D84FC13DE", hash_generated_field = "65712315E81AEF1AEECA880461A13F95")

        private int subId = -1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.250 -0400", hash_original_field = "2890514472C2EC26FDC158F357C9094D", hash_generated_field = "A4D55EF615A83829CB76931E64607871")

        private int supId = -1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.250 -0400", hash_original_field = "2277E9A3494373D144CB63240D1A671A", hash_generated_field = "0A84E3D5C0D13817A9952A0E4C94005A")

        private int strikeId = -1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.250 -0400", hash_original_field = "0EA1254D6779D964DDFE2F1CF27671AA", hash_generated_field = "C2D326660DCA6976087926F02A618B65")

        private int listItemId = -1;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.250 -0400", hash_original_field = "5777998D282E2540236C985B4E76024F", hash_generated_field = "D299C9BAD3B93162970105F1DB7DE1FA")

        private int marqueeId = -1;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.250 -0400", hash_original_method = "4D3750C386AF43C67E7BA6A1E0512626", hash_generated_method = "4D3750C386AF43C67E7BA6A1E0512626")
        public StyleIDs ()
        {
            
        }


    }


    
    private static class Height implements LineHeightSpan.WithDensity {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.251 -0400", hash_original_field = "27DFA0EFE73BCB065533443A05E9DEE4", hash_generated_field = "1ADF00AF1A5D84662F00519BAA6EB9C0")

        private int mSize;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.251 -0400", hash_original_method = "822F731BB1BA127213FF49F8E178606F", hash_generated_method = "8B0CB46E6A2F126B20C4298DCDA8FF8F")
        public  Height(int size) {
            mSize = size;
            
            
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.251 -0400", hash_original_method = "26F622CE8D56F6DE86DA56D7C47E1EF9", hash_generated_method = "6C615B21937CFAB84E1684D2841C1567")
        public void chooseHeight(CharSequence text, int start, int end,
                                 int spanstartv, int v,
                                 Paint.FontMetricsInt fm) {
            chooseHeight(text, start, end, spanstartv, v, fm, null);
            addTaint(text.getTaint());
            addTaint(start);
            addTaint(end);
            addTaint(spanstartv);
            addTaint(v);
            addTaint(fm.getTaint());
            
            
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.252 -0400", hash_original_method = "8C5957365F8EC7EB873EDA19F7109033", hash_generated_method = "DA5181A6083EA1B07EEE3EF9870B3042")
        public void chooseHeight(CharSequence text, int start, int end,
                                 int spanstartv, int v,
                                 Paint.FontMetricsInt fm, TextPaint paint) {
            int size = mSize;
            {
                size *= paint.density;
            } 
            {
                fm.top = fm.bottom - size;
                fm.ascent = fm.ascent - size;
            } 
            {
                {
                    Paint p = new Paint();
                    p.setTextSize(100);
                    Rect r = new Rect();
                    p.getTextBounds("ABCDEFG", 0, 7, r);
                    sProportion = (r.top) / p.ascent();
                } 
                int need = (int) Math.ceil(-fm.top * sProportion);
                {
                    fm.top = fm.bottom - size;
                    fm.ascent = fm.descent - size;
                } 
                {
                    fm.top = fm.ascent = -need;
                    fm.bottom = fm.descent = fm.top + size;
                } 
                {
                    fm.top = fm.ascent = -size;
                    fm.bottom = fm.descent = 0;
                } 
            } 
            addTaint(text.getTaint());
            addTaint(start);
            addTaint(end);
            addTaint(spanstartv);
            addTaint(v);
            addTaint(fm.getTaint());
            addTaint(paint.getTaint());
            
            
        }

        
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.252 -0400", hash_original_field = "D3D4C463ED759C9C5346737D3B29514A", hash_generated_field = "2D094D2B577DA7C03844DB00B123469C")

        private static float sProportion = 0;
    }


    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.252 -0400", hash_original_field = "D32CE489FB85E2EA1BB422AEDC40B577", hash_generated_field = "FDC75AE01ED37E059BA4F54E9509C8D2")

    private static final String TAG = "AssetManager";
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:29.252 -0400", hash_original_field = "81A92DF01F23C5A9AD1A3D7A55CE01D7", hash_generated_field = "776D75E65C0F716B6889BA4A8C683647")

    private static final boolean localLOGV = false || false;
}

