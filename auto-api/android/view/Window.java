package android.view;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.app.Application;
import android.content.Context;
import android.content.res.CompatibilityInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.PixelFormat;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemProperties;
import android.util.Slog;
import android.view.accessibility.AccessibilityEvent;

public abstract class Window {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "51EF5995AD6B82C50AE546C1599EFFFA", hash_generated_field = "C458E619396054F78BC926FB81B4386D")

    private Context mContext;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "498CE712CAAE1F07C5579CD1CD1DAD57", hash_generated_field = "FE42DB9D5DCA1AF8D89775C484584DA0")

    private TypedArray mWindowStyle;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "1804C5EC7AAE0B28B15CFDA061D25829", hash_generated_field = "B05DD02C49016AA70EF55EB624CC40D3")

    private Callback mCallback;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "306519E50E3A91B9733D09F5D8EB985C", hash_generated_field = "3C750A4AE06B71AF3A05B7797C7182A4")

    private WindowManager mWindowManager;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "789FE61F50A486E596710FCC2797F1A1", hash_generated_field = "BB83A73F1EDDB2848C32920D653DC06A")

    private IBinder mAppToken;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "334FA2026AC041CBE5D1FA36A7B88E1D", hash_generated_field = "501107DCDCDE4B64DECA2D54F1B3291E")

    private String mAppName;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "C64165C1B15EB68FDC5E7135FFE5DF5B", hash_generated_field = "4CDA12FC009B8C79FD6D240C994A9B4E")

    private Window mContainer;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "BE3C2B61EEA527B7F044539C63D75FA8", hash_generated_field = "DAACFEA6BDA9FDD8068D4E47DE036B80")

    private Window mActiveChild;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "730139AE05F592457BDB9570EC12930C", hash_generated_field = "4A15BC690E6A07E466E1CFFEE049FB44")

    private boolean mIsActive = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "5F9CE42C2C7A9A4CC27FAB771A519B7B", hash_generated_field = "AE99BD7E76B07B1A3DB18B1673132924")

    private boolean mHasChildren = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "4474256FCA60986E0CDEBD6FE991F5A6", hash_generated_field = "6682B7CD42017C622EC5F9455D0BBBB5")

    private boolean mCloseOnTouchOutside = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "9BF91B6682AA2CC112DA8EA276F3D9DC", hash_generated_field = "913E6AEF20F2BF812FF1E6B4367E9661")

    private boolean mSetCloseOnTouchOutside = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "B3BB2135DFF47F34C57F1CB6AA0A88B7", hash_generated_field = "1D791569E1CBBFE45EC5118F952AEEB8")

    private int mForcedWindowFlags = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "2F5089C3B4A1DDBB3A300C5F83D7F839", hash_generated_field = "8DD2F8572C71CE50B81F1050762E8D15")

    private int mFeatures = DEFAULT_FEATURES;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "926B360AADE14E1F7E8C8CE0149173B3", hash_generated_field = "8F439E32EE732AE863B494C6265A86B0")

    private int mLocalFeatures = DEFAULT_FEATURES;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "2091AA96E9CFC124D843E780B1AF9FE2", hash_generated_field = "68BCF9C876C3A5A4265478D3D60D9E88")

    private boolean mHaveWindowFormat = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "977B58BC5E2619A5F17A53D98D2D3D18", hash_generated_field = "08A6E705463382C516C1DE51AD82637F")

    private boolean mHaveDimAmount = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "5F8108FA3F94E8350770ECAD348104BC", hash_generated_field = "D05EC1E75FF8953CFD3364A5A03E7B08")

    private int mDefaultWindowFormat = PixelFormat.OPAQUE;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "6C9EC292E2B58AA639DB4D7E1C83FCA3", hash_generated_field = "0B8978AD19103B60226718E5263B1651")

    private boolean mHasSoftInputMode = false;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "C724374D1A8B3D38592BCBAA64034D32", hash_generated_field = "1C64CB399BFF718CD14799195853AA6E")

    private boolean mDestroyed;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.698 -0400", hash_original_field = "5A8DDBFFB48FB5038CAE7BDFEFA84A3A", hash_generated_field = "7F9A9896CA9A2F1A549BC7CFD23C8D28")

    private final WindowManager.LayoutParams mWindowAttributes = new WindowManager.LayoutParams();
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.699 -0400", hash_original_method = "50ED378DEE1AF31F505AB3EFDADA9166", hash_generated_method = "2F4374F5D0B28DE042B0A979121F000F")
    public  Window(Context context) {
        mContext = context;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.699 -0400", hash_original_method = "4F4EBC54D108D66F416C93B46580E117", hash_generated_method = "204DABD1C95581DC7C058B350208B4DE")
    public final Context getContext() {
        Context varB4EAC82CA7396A68D541C85D26508E83_743666177 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_743666177 = mContext;
        varB4EAC82CA7396A68D541C85D26508E83_743666177.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_743666177;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.700 -0400", hash_original_method = "F2F0D9C02E357CB8D6CDE50C6B929622", hash_generated_method = "0891D879665CD7A8525E198C2F3800F9")
    public final TypedArray getWindowStyle() {
        TypedArray varB4EAC82CA7396A68D541C85D26508E83_1625938014 = null; 
        {
            {
                mWindowStyle = mContext.obtainStyledAttributes(
                        com.android.internal.R.styleable.Window);
            } 
            varB4EAC82CA7396A68D541C85D26508E83_1625938014 = mWindowStyle;
        } 
        varB4EAC82CA7396A68D541C85D26508E83_1625938014.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1625938014;
        
        
            
                
                        
            
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.701 -0400", hash_original_method = "8852F0C837DC7060948A60A90C2A9042", hash_generated_method = "E250BA6D33AD65C94C4A991CE067550C")
    public void setContainer(Window container) {
        mContainer = container;
        {
            mFeatures |= 1<<FEATURE_NO_TITLE;
            mLocalFeatures |= 1<<FEATURE_NO_TITLE;
            container.mHasChildren = true;
        } 
        
        
        
            
            
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.701 -0400", hash_original_method = "DCCDF946CE22DD9064205FD95E96DECD", hash_generated_method = "62226A6E36DC8420F52E16FD52D128AD")
    public final Window getContainer() {
        Window varB4EAC82CA7396A68D541C85D26508E83_128046437 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_128046437 = mContainer;
        varB4EAC82CA7396A68D541C85D26508E83_128046437.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_128046437;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.701 -0400", hash_original_method = "E436A7964E92BE677F4D553F3B295F27", hash_generated_method = "883B59324A98E5385F9C6B758C60F9E3")
    public final boolean hasChildren() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_187656801 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_187656801;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.702 -0400", hash_original_method = "66C6B9EE658776AAE6ED0A2EE9CF8E48", hash_generated_method = "592FCE4D1921959BBFF73FDA835F18F9")
    public final void destroy() {
        mDestroyed = true;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.702 -0400", hash_original_method = "36E279B4F2F5FC702C91E645725B1821", hash_generated_method = "2DC6560A3AA35CC00FE7006AA101432A")
    public final boolean isDestroyed() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_2100617108 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_2100617108;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.703 -0400", hash_original_method = "49C37E5CFC1C233E6DF0E927E49CABF4", hash_generated_method = "09C01C93E929D6DF9BF7CD9948BA9CA7")
    public void setWindowManager(WindowManager wm, IBinder appToken, String appName) {
        setWindowManager(wm, appToken, appName, false);
        addTaint(wm.getTaint());
        addTaint(appToken.getTaint());
        addTaint(appName.getTaint());
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.703 -0400", hash_original_method = "07A6DAE3F5C8016383AB9A64DB3A39A3", hash_generated_method = "8133C31315A10BDEF206E62668626FEE")
    public void setWindowManager(WindowManager wm, IBinder appToken, String appName,
            boolean hardwareAccelerated) {
        mAppToken = appToken;
        mAppName = appName;
        {
            wm = WindowManagerImpl.getDefault();
        } 
        mWindowManager = new LocalWindowManager(wm, hardwareAccelerated);
        
        
        
        
            
        
        
    }

    
    static CompatibilityInfoHolder getCompatInfo(Context context) {
        Application app = (Application)context.getApplicationContext();
        return app != null ? app.mLoadedApk.mCompatibilityInfo : new CompatibilityInfoHolder();
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.704 -0400", hash_original_method = "1DCFADD2C71F0E408EA049F81A8ACDED", hash_generated_method = "5B46D961940B4B21EC0C0868D41B84B6")
    public WindowManager getWindowManager() {
        WindowManager varB4EAC82CA7396A68D541C85D26508E83_1664370324 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1664370324 = mWindowManager;
        varB4EAC82CA7396A68D541C85D26508E83_1664370324.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1664370324;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.704 -0400", hash_original_method = "DD1DEB01F922CA329B6B6BD86F551D46", hash_generated_method = "C7938EB55EEAA39F9972B5240A5CA9B0")
    public void setCallback(Callback callback) {
        mCallback = callback;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.705 -0400", hash_original_method = "F07002384A5D5C29596645EE02BC1965", hash_generated_method = "2DD6E96C0363A3DB7948069A2BE0C32F")
    public final Callback getCallback() {
        Callback varB4EAC82CA7396A68D541C85D26508E83_1019063465 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_1019063465 = mCallback;
        varB4EAC82CA7396A68D541C85D26508E83_1019063465.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_1019063465;
        
        
    }

    
    public abstract void takeSurface(SurfaceHolder.Callback2 callback);

    
    public abstract void takeInputQueue(InputQueue.Callback callback);

    
    public abstract boolean isFloating();

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.706 -0400", hash_original_method = "BDF4A9191EC276CB59743DF4E4B8A744", hash_generated_method = "4AD753E100B9F6EFE73E9BBD0875B0EA")
    public void setLayout(int width, int height) {
        final WindowManager.LayoutParams attrs = getAttributes();
        attrs.width = width;
        attrs.height = height;
        {
            mCallback.onWindowAttributesChanged(attrs);
        } 
        addTaint(width);
        addTaint(height);
        
        
        
        
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.706 -0400", hash_original_method = "76A69B8FD04E6A39E52E254D3C51CA75", hash_generated_method = "06BD07BFB026DCA6E89E0CA27031F48A")
    public void setGravity(int gravity) {
        final WindowManager.LayoutParams attrs = getAttributes();
        attrs.gravity = gravity;
        {
            mCallback.onWindowAttributesChanged(attrs);
        } 
        addTaint(gravity);
        
        
        
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.706 -0400", hash_original_method = "07612A9950A1C7129B1F4B699CE0FA52", hash_generated_method = "C83F8EF783F0562BE521B0203726106F")
    public void setType(int type) {
        final WindowManager.LayoutParams attrs = getAttributes();
        attrs.type = type;
        {
            mCallback.onWindowAttributesChanged(attrs);
        } 
        addTaint(type);
        
        
        
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.707 -0400", hash_original_method = "ADD82385ADE43D8CE9305C2F63E34252", hash_generated_method = "5D9150BFB0C774CE6F439D9E62794327")
    public void setFormat(int format) {
        final WindowManager.LayoutParams attrs = getAttributes();
        {
            attrs.format = format;
            mHaveWindowFormat = true;
        } 
        {
            attrs.format = mDefaultWindowFormat;
            mHaveWindowFormat = false;
        } 
        {
            mCallback.onWindowAttributesChanged(attrs);
        } 
        addTaint(format);
        
        
        
            
            
        
            
            
        
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.707 -0400", hash_original_method = "4617417E681280CCA3448C5B912BCD7D", hash_generated_method = "ECADEAC615AA02E77EE9EC8DFCFFA94A")
    public void setWindowAnimations(int resId) {
        final WindowManager.LayoutParams attrs = getAttributes();
        attrs.windowAnimations = resId;
        {
            mCallback.onWindowAttributesChanged(attrs);
        } 
        addTaint(resId);
        
        
        
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.707 -0400", hash_original_method = "C4620B459A4A0F6C7D91CF9A478EC82D", hash_generated_method = "A550592B78D2A4F2F98D085A5360EBFA")
    public void setSoftInputMode(int mode) {
        final WindowManager.LayoutParams attrs = getAttributes();
        {
            attrs.softInputMode = mode;
            mHasSoftInputMode = true;
        } 
        {
            mHasSoftInputMode = false;
        } 
        {
            mCallback.onWindowAttributesChanged(attrs);
        } 
        addTaint(mode);
        
        
        
            
            
        
            
        
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.708 -0400", hash_original_method = "0498A767AE3286E2ACD9E77A8750E86F", hash_generated_method = "6A983DD0F4AEF99AFF98910832984550")
    public void addFlags(int flags) {
        setFlags(flags, flags);
        addTaint(flags);
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.708 -0400", hash_original_method = "1B1BB2C51A9E558BB4222C67BD342AB1", hash_generated_method = "F2121035DDCDEB0DE1600716E2EBA3DC")
    public void clearFlags(int flags) {
        setFlags(0, flags);
        addTaint(flags);
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.708 -0400", hash_original_method = "40E42D383A45AE28D15E52653F68CBD5", hash_generated_method = "40A68B281C801BAF36C5B07DADDDBC7C")
    public void setFlags(int flags, int mask) {
        final WindowManager.LayoutParams attrs = getAttributes();
        attrs.flags = (attrs.flags&~mask) | (flags&mask);
        {
            attrs.privateFlags |= WindowManager.LayoutParams.PRIVATE_FLAG_SET_NEEDS_MENU_KEY;
        } 
        mForcedWindowFlags |= mask;
        {
            mCallback.onWindowAttributesChanged(attrs);
        } 
        addTaint(flags);
        
        
        
        
            
        
        
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.709 -0400", hash_original_method = "9455DB63259C6955368CE857C592C952", hash_generated_method = "DA7A513B79DB4CB1F289A4D5390F1BBD")
    public void setDimAmount(float amount) {
        final WindowManager.LayoutParams attrs = getAttributes();
        attrs.dimAmount = amount;
        mHaveDimAmount = true;
        {
            mCallback.onWindowAttributesChanged(attrs);
        } 
        addTaint(amount);
        
        
        
        
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.709 -0400", hash_original_method = "66B5C1599B3320A30790CC9FF26FC996", hash_generated_method = "2471FE292C33FE0B3C314A53E437DDAB")
    public void setAttributes(WindowManager.LayoutParams a) {
        mWindowAttributes.copyFrom(a);
        {
            mCallback.onWindowAttributesChanged(mWindowAttributes);
        } 
        addTaint(a.getTaint());
        
        
        
            
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.710 -0400", hash_original_method = "1740BD4A684D4859A9304C42BFBB0628", hash_generated_method = "DDE6BEB4B68504F258ACAB9A654BAA47")
    public final WindowManager.LayoutParams getAttributes() {
        WindowManager.LayoutParams varB4EAC82CA7396A68D541C85D26508E83_2026113444 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_2026113444 = mWindowAttributes;
        varB4EAC82CA7396A68D541C85D26508E83_2026113444.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_2026113444;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.710 -0400", hash_original_method = "78D10AE7087B6FEDF7B8FA7D71B4D366", hash_generated_method = "03C9FCD90F5460443C1ABD1F90E1689D")
    protected final int getForcedWindowFlags() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_127655105 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_127655105;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.710 -0400", hash_original_method = "3FB6B9359B05585EE87D1E296E0BA56E", hash_generated_method = "EA6BFB8D5F84FDE49603853E5AE2B0AE")
    protected final boolean hasSoftInputMode() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1409970915 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1409970915;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.711 -0400", hash_original_method = "A665A75B43AC6644089B2FAB21289091", hash_generated_method = "0CBE03D8878DA6B3055F2BC397378281")
    public void setCloseOnTouchOutside(boolean close) {
        mCloseOnTouchOutside = close;
        mSetCloseOnTouchOutside = true;
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.711 -0400", hash_original_method = "585D2A4E90DC505694C50AFA60811C60", hash_generated_method = "0EC79A2B09531FBB24F9C814E3056C5C")
    public void setCloseOnTouchOutsideIfNotSet(boolean close) {
        {
            mCloseOnTouchOutside = close;
            mSetCloseOnTouchOutside = true;
        } 
        
        
            
            
        
    }

    
    public abstract void alwaysReadCloseOnTouchAttr();

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.712 -0400", hash_original_method = "8CE0B3F5C0E964B12FFD1AA84260C5B9", hash_generated_method = "38ED6C0C8777C5E12663755CB39D0BC4")
    public boolean shouldCloseOnTouch(Context context, MotionEvent event) {
        {
            boolean var61852665015A4DA2650F638F2B403163_1265817851 = (mCloseOnTouchOutside && event.getAction() == MotionEvent.ACTION_DOWN
                && isOutOfBounds(context, event) && peekDecorView() != null);
        } 
        addTaint(context.getTaint());
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1400963796 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1400963796;
        
        
                
            
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.712 -0400", hash_original_method = "AB4AFCB92A037D63668D3D8B793C0712", hash_generated_method = "97C9B036FDAB5F6DE7FB7B92C05392CA")
    private boolean isOutOfBounds(Context context, MotionEvent event) {
        final int x = (int) event.getX();
        final int y = (int) event.getY();
        final int slop = ViewConfiguration.get(context).getScaledWindowTouchSlop();
        final View decorView = getDecorView();
        boolean varBB8FA6DF4DF465DE0F30D38A2C9954DA_1573306605 = ((x < -slop) || (y < -slop)
                || (x > (decorView.getWidth()+slop))
                || (y > (decorView.getHeight()+slop)));
        addTaint(context.getTaint());
        addTaint(event.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_111102038 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_111102038;
        
        
        
        
        
        
                
                
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.713 -0400", hash_original_method = "56D6FF40FC7BCA35CBE5379E385EA86C", hash_generated_method = "2992D0FF5DB91FABD700B7E639870FCE")
    public boolean requestFeature(int featureId) {
        final int flag = 1<<featureId;
        mFeatures |= flag;
        mLocalFeatures |= mContainer != null ? (flag&~mContainer.mFeatures) : flag;
        addTaint(featureId);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1144704106 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1144704106;
        
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.713 -0400", hash_original_method = "24AB1A47189F5640F802580999D5EF0B", hash_generated_method = "35B087575FB95788FEF1C9C9DE1615FD")
    protected void removeFeature(int featureId) {
        final int flag = 1<<featureId;
        mFeatures &= ~flag;
        mLocalFeatures &= ~(mContainer != null ? (flag&~mContainer.mFeatures) : flag);
        addTaint(featureId);
        
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.714 -0400", hash_original_method = "B5CCAAF5805277DBB8CBB8283B5C5952", hash_generated_method = "0B4F368A60FA6E7CAE9973E5AC825355")
    public final void makeActive() {
        {
            {
                mContainer.mActiveChild.mIsActive = false;
            } 
            mContainer.mActiveChild = this;
        } 
        mIsActive = true;
        onActive();
        
        
            
                
            
            
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.715 -0400", hash_original_method = "825B8CF70F64E49AF2D9884D4F1141F6", hash_generated_method = "43EAEA006A74AAD8917693B9D5188188")
    public final boolean isActive() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1523801343 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1523801343;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.715 -0400", hash_original_method = "06392AB1384FAD789566489ED7477D15", hash_generated_method = "D9AF3838C215ABFA1480A973A9DFBC47")
    public View findViewById(int id) {
        View varB4EAC82CA7396A68D541C85D26508E83_727952545 = null; 
        varB4EAC82CA7396A68D541C85D26508E83_727952545 = getDecorView().findViewById(id);
        addTaint(id);
        varB4EAC82CA7396A68D541C85D26508E83_727952545.addTaint(getTaint()); 
        return varB4EAC82CA7396A68D541C85D26508E83_727952545;
        
        
    }

    
    public abstract void setContentView(int layoutResID);

    
    public abstract void setContentView(View view);

    
    public abstract void setContentView(View view, ViewGroup.LayoutParams params);

    
    public abstract void addContentView(View view, ViewGroup.LayoutParams params);

    
    public abstract View getCurrentFocus();

    
    public abstract LayoutInflater getLayoutInflater();

    
    public abstract void setTitle(CharSequence title);

    
    public abstract void setTitleColor(int textColor);

    
    public abstract void openPanel(int featureId, KeyEvent event);

    
    public abstract void closePanel(int featureId);

    
    public abstract void togglePanel(int featureId, KeyEvent event);

    
    public abstract void invalidatePanelMenu(int featureId);

    
    public abstract boolean performPanelShortcut(int featureId,
                                                 int keyCode,
                                                 KeyEvent event,
                                                 int flags);

    
    public abstract boolean performPanelIdentifierAction(int featureId,
                                                 int id,
                                                 int flags);

    
    public abstract void closeAllPanels();

    
    public abstract boolean performContextMenuIdentifierAction(int id, int flags);

    
    public abstract void onConfigurationChanged(Configuration newConfig);

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.718 -0400", hash_original_method = "AFC383C5A753BE0283DE80727207DE11", hash_generated_method = "9CB47964D9E9C87E007F7BDCA3A0B4DB")
    public void setBackgroundDrawableResource(int resid) {
        setBackgroundDrawable(mContext.getResources().getDrawable(resid));
        addTaint(resid);
        
        
    }

    
    public abstract void setBackgroundDrawable(Drawable drawable);

    
    public abstract void setFeatureDrawableResource(int featureId, int resId);

    
    public abstract void setFeatureDrawableUri(int featureId, Uri uri);

    
    public abstract void setFeatureDrawable(int featureId, Drawable drawable);

    
    public abstract void setFeatureDrawableAlpha(int featureId, int alpha);

    
    public abstract void setFeatureInt(int featureId, int value);

    
    public abstract void takeKeyEvents(boolean get);

    
    public abstract boolean superDispatchKeyEvent(KeyEvent event);

    
    public abstract boolean superDispatchKeyShortcutEvent(KeyEvent event);

    
    public abstract boolean superDispatchTouchEvent(MotionEvent event);

    
    public abstract boolean superDispatchTrackballEvent(MotionEvent event);

    
    public abstract boolean superDispatchGenericMotionEvent(MotionEvent event);

    
    public abstract View getDecorView();

    
    public abstract View peekDecorView();

    
    public abstract Bundle saveHierarchyState();

    
    public abstract void restoreHierarchyState(Bundle savedInstanceState);

    
    protected abstract void onActive();

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.721 -0400", hash_original_method = "201C8696C96B5CE4C022F78574069483", hash_generated_method = "2B6DEA8A079AEB331EB6CDAF768E97AA")
    protected final int getFeatures() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2086538507 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2086538507;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.721 -0400", hash_original_method = "5A085FB22E39DFD08969173C82283E9B", hash_generated_method = "A4CC3CB914CCA42DB6B2616101B0B63C")
    public boolean hasFeature(int feature) {
        boolean varA717CAC4D1FC0A0FC3A35CB28E72A65C_510931419 = ((getFeatures() & (1 << feature)) != 0);
        addTaint(feature);
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1234540849 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1234540849;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.722 -0400", hash_original_method = "D46E90B97B876B97E16E92A5FEA18EB3", hash_generated_method = "0683E06B7F0551238C92CCC17A77DCE7")
    protected final int getLocalFeatures() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2012749535 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_2012749535;
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.722 -0400", hash_original_method = "439CF6A84E0EE9568E72DFCB057259B4", hash_generated_method = "FF9289E669013D8E57703A0E2D639538")
    protected void setDefaultWindowFormat(int format) {
        mDefaultWindowFormat = format;
        {
            final WindowManager.LayoutParams attrs = getAttributes();
            attrs.format = format;
            {
                mCallback.onWindowAttributesChanged(attrs);
            } 
        } 
        
        
        
            
            
            
                
            
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.722 -0400", hash_original_method = "765B449347DE858F4538165B748C680A", hash_generated_method = "916A40344D08B796BF7F6A9BA1FFA5F0")
    protected boolean haveDimAmount() {
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1555621882 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1555621882;
        
        
    }

    
    public abstract void setChildDrawable(int featureId, Drawable drawable);

    
    public abstract void setChildInt(int featureId, int value);

    
    public abstract boolean isShortcutKey(int keyCode, KeyEvent event);

    
    public abstract void setVolumeControlStream(int streamType);

    
    public abstract int getVolumeControlStream();

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.724 -0400", hash_original_method = "5C7A5DC825C127CAEB67314627C1344D", hash_generated_method = "41402CC6B89BFAB78A866C7788612094")
    public void setUiOptions(int uiOptions) {
        addTaint(uiOptions);
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.724 -0400", hash_original_method = "DD14EAF3AEC819DEC25B96FED2D2DF84", hash_generated_method = "A85B7CE3B9E7D30483728C2281655FB0")
    public void setUiOptions(int uiOptions, int mask) {
        addTaint(uiOptions);
        addTaint(mask);
        
    }

    
    private class LocalWindowManager extends WindowManagerImpl.CompatModeWrapper {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.724 -0400", hash_original_field = "6AB4A5F453379ED66BAA79CE64FDFD98", hash_generated_field = "C592280128F52BDDBAD2DA621E45F814")

        private boolean mHardwareAccelerated;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.725 -0400", hash_original_method = "BB2707026A85041C76D7C937C71FA0C1", hash_generated_method = "DC1FE534BFB1175902A965459EE9888C")
          LocalWindowManager(WindowManager wm, boolean hardwareAccelerated) {
            super(wm, getCompatInfo(mContext));
            mHardwareAccelerated = hardwareAccelerated ||
                    SystemProperties.getBoolean(PROPERTY_HARDWARE_UI, false);
            addTaint(wm.getTaint());
            
            
                    
        }

        
        @DSModeled(DSC.SAFE)
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.725 -0400", hash_original_method = "93C5B5997EB72284CF079AECD506D640", hash_generated_method = "89BF13823F9C348F18011793E47E2F85")
        public boolean isHardwareAccelerated() {
            boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_887503205 = getTaintBoolean();
            return var84E2C64F38F78BA3EA5C905AB5A2DA27_887503205;
            
            
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_method = "AADD2F7F32065CABAE6715302100F897", hash_generated_method = "E5547D24C14BCD122CD78ABA05BB8CE8")
        public final void addView(View view, ViewGroup.LayoutParams params) {
            WindowManager.LayoutParams wp = (WindowManager.LayoutParams)params;
            CharSequence curTitle = wp.getTitle();
            {
                {
                    View decor = peekDecorView();
                    {
                        wp.token = decor.getWindowToken();
                    } 
                } 
                {
                    boolean var618225A5546F933901E333CD89F06D8F_14744281 = (curTitle == null || curTitle.length() == 0);
                    {
                        String title;
                        {
                            title="Media";
                        } 
                        {
                            title="MediaOvr";
                        } 
                        {
                            title="Panel";
                        } 
                        {
                            title="SubPanel";
                        } 
                        {
                            title="AtchDlg";
                        } 
                        {
                            title=Integer.toString(wp.type);
                        } 
                        {
                            title += ":" + mAppName;
                        } 
                        wp.setTitle(title);
                    } 
                } 
            } 
            {
                {
                    wp.token = mContainer == null ? mAppToken : mContainer.mAppToken;
                } 
                {
                    boolean var04C9EAD0DFD9824FFF800C82EFF499AF_883359645 = ((curTitle == null || curTitle.length() == 0)
                        && mAppName != null);
                    {
                        wp.setTitle(mAppName);
                    } 
                } 
            } 
            {
                wp.packageName = mContext.getPackageName();
            } 
            {
                wp.flags |= WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED;
            } 
            super.addView(view, params);
            addTaint(view.getTaint());
            addTaint(params.getTaint());
            
            
        }

        
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "627F75A013AB2C65C956BA07A57C87CE", hash_generated_field = "BA2C677D1D301CB311A67BA2544B79AA")

        private static final String PROPERTY_HARDWARE_UI = "persist.sys.ui.hw";
    }


    
    public interface Callback {
        
        public boolean dispatchKeyEvent(KeyEvent event);

        
        public boolean dispatchKeyShortcutEvent(KeyEvent event);

        
        public boolean dispatchTouchEvent(MotionEvent event);
        
        
        public boolean dispatchTrackballEvent(MotionEvent event);

        
        public boolean dispatchGenericMotionEvent(MotionEvent event);

        
        public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event);

        
        public View onCreatePanelView(int featureId);

        
        public boolean onCreatePanelMenu(int featureId, Menu menu);

        
        public boolean onPreparePanel(int featureId, View view, Menu menu);

        
        public boolean onMenuOpened(int featureId, Menu menu);
        
        
        public boolean onMenuItemSelected(int featureId, MenuItem item);

        
        public void onWindowAttributesChanged(WindowManager.LayoutParams attrs);

        
        public void onContentChanged();

        
        public void onWindowFocusChanged(boolean hasFocus);

        
        public void onAttachedToWindow();
        
        
        public void onDetachedFromWindow();
        
        
        public void onPanelClosed(int featureId, Menu menu);
        
        
        public boolean onSearchRequested();

        
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback);

        
        public void onActionModeStarted(ActionMode mode);

        
        public void onActionModeFinished(ActionMode mode);
    }
    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "142CC032426664F1131AAD84F0B71E27", hash_generated_field = "472DA983306B223D5089DE41C6B304F6")

    public static final int FEATURE_OPTIONS_PANEL = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "1A42FC1E9D8C4FD687250F3D04736852", hash_generated_field = "0E27D3969BF23D79444C083F69CE913B")

    public static final int FEATURE_NO_TITLE = 1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "DFD0C7B479301B6462562BA8E617A688", hash_generated_field = "C56DCBD5961394440275C325C5322980")

    public static final int FEATURE_PROGRESS = 2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "F9BC41525AF04F818CA21EA1C65A9752", hash_generated_field = "1A609527E6D52575F7BB34AA94FA5452")

    public static final int FEATURE_LEFT_ICON = 3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "E3D0DA5C9E2C6149A42256DD0267FF03", hash_generated_field = "1950720A14827F199C723E292C8843CB")

    public static final int FEATURE_RIGHT_ICON = 4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "90A6D7170362C56F2D4D0CEBF3E1AE60", hash_generated_field = "A0820169C7BD3B2ADEF3346DA41635B2")

    public static final int FEATURE_INDETERMINATE_PROGRESS = 5;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "22FEE503AF84A4305AF39AD674C528CA", hash_generated_field = "330D7D49F8F1B757C106B92F0683EDB7")

    public static final int FEATURE_CONTEXT_MENU = 6;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "DCAE9AA00DFEF52AD022057232B407ED", hash_generated_field = "DECB0F3E1BE49983D78AAF2637ECB72D")

    public static final int FEATURE_CUSTOM_TITLE = 7;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "F5A95B890AEDDD6850F504A9DD313912", hash_generated_field = "C443D1CC878B321D84BA4ED206191978")

    public static final int FEATURE_ACTION_BAR = 8;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "C4BB95867602847B3342D6AE68130898", hash_generated_field = "136B78431D739532A1C4A86F966210BE")

    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "19F86BE28D746FBCED37D00A7EC49E48", hash_generated_field = "691774D2B2F1BBA031D2D45979BFB0DE")

    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "7E15567E6F95C49BB6FBBF62B4163850", hash_generated_field = "9D38CA915D3E74CA2094BA5902BED0B2")

    public static final int PROGRESS_VISIBILITY_ON = -1;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "58DFD3754B62F9205F89FA1C06CF7603", hash_generated_field = "5D4C8296C206C08EA35B814522DD9983")

    public static final int PROGRESS_VISIBILITY_OFF = -2;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "079C6A39AEDEF6EB46F945CC4F332A40", hash_generated_field = "1877511F5796C123D37BB3D39E902341")

    public static final int PROGRESS_INDETERMINATE_ON = -3;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "D50731EF9F2698D26A8D8D5D24135910", hash_generated_field = "68E36EAEDD10C796D1EA6ADEF387DFC2")

    public static final int PROGRESS_INDETERMINATE_OFF = -4;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "03AEB78BD497B6FA66E18440F2EB9D21", hash_generated_field = "8A8B490338B3753D82CBEEAAB64BD7CA")

    public static final int PROGRESS_START = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "270B737C2A6802DC318F3F31F96D76D8", hash_generated_field = "40A0B7325B8605AF6527271642B9A30A")

    public static final int PROGRESS_END = 10000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "6B37BABFB3B5D043229EC1DC752924D1", hash_generated_field = "5F723C725C29E1DA5AF89AB3DD752716")

    public static final int PROGRESS_SECONDARY_START = 20000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "2CB2298C5DE78F9345D4EB3F45DBA8B5", hash_generated_field = "CC459F31B753B125143BA79C6808282B")

    public static final int PROGRESS_SECONDARY_END = 30000;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "F44A8BAE7300C4DAB7403F9638FB79CF", hash_generated_field = "9C42AD869F8A2C22203ED8B37C7EB793")

    @SuppressWarnings({"PointlessBitwiseExpression"}) protected static final int DEFAULT_FEATURES = (1 << FEATURE_OPTIONS_PANEL) |
            (1 << FEATURE_CONTEXT_MENU);
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:00.726 -0400", hash_original_field = "D7F131DA2B7D215B81908F2D274AD794", hash_generated_field = "93F6ACF9E071115D7CCE648A911B5392")

    public static final int ID_ANDROID_CONTENT = com.android.internal.R.id.content;
}

