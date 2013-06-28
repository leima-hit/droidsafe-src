package android.content;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.content.Context;
import android.os.Message;
import android.os.RemoteException;
import android.os.Handler;
import android.os.IBinder;
import android.os.ServiceManager;
import android.util.Log;
import java.util.ArrayList;

public class ClipboardManager extends android.text.ClipboardManager {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.139 -0400", hash_original_field = "51EF5995AD6B82C50AE546C1599EFFFA", hash_generated_field = "C458E619396054F78BC926FB81B4386D")

    private Context mContext;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.140 -0400", hash_original_field = "C4FB4E35010BD7489930A3D26DDC0ADA", hash_generated_field = "E56DE56B7E953844281AFE87E0843DAB")

    private final ArrayList<OnPrimaryClipChangedListener> mPrimaryClipChangedListeners = new ArrayList<OnPrimaryClipChangedListener>();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.140 -0400", hash_original_field = "6A00B923E2A779854F5FF695F32BEBAA", hash_generated_field = "C158487F60C521ACB68D79E0E9BC0FB8")

    private final IOnPrimaryClipChangedListener.Stub mPrimaryClipChangedServiceListener = new IOnPrimaryClipChangedListener.Stub() {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.140 -0400", hash_original_method = "70003E26F597B4FA21D37DAC4C2F415E", hash_generated_method = "F52487E39EC4F57260159A7A23B22DB7")
        public void dispatchPrimaryClipChanged() {
            mHandler.sendEmptyMessage(MSG_REPORT_PRIMARY_CLIP_CHANGED);
            // ---------- Original Method ----------
            //mHandler.sendEmptyMessage(MSG_REPORT_PRIMARY_CLIP_CHANGED);
        }

        
};
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.141 -0400", hash_original_field = "A7B290A804ED4D1BFB9EEF0AABB57AC2", hash_generated_field = "F325ACE86B0A208FFE07C888493706E5")

    private final Handler mHandler = new Handler() {        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.141 -0400", hash_original_method = "5AAF932430F5A3E1179C80D13696BD76", hash_generated_method = "FA752C471052CE88E1745A4EC756AD64")
        @Override
        public void handleMessage(Message msg) {
            //Begin case MSG_REPORT_PRIMARY_CLIP_CHANGED 
            reportPrimaryClipChanged();
            //End case MSG_REPORT_PRIMARY_CLIP_CHANGED 
            addTaint(msg.getTaint());
            // ---------- Original Method ----------
            //switch (msg.what) {
                //case MSG_REPORT_PRIMARY_CLIP_CHANGED:
                    //reportPrimaryClipChanged();
            //}
        }

        
};
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.141 -0400", hash_original_method = "97558C16BA3BDE6476EDF618E25B9B81", hash_generated_method = "FAEA0E95B891197CEE51FD28FD553C61")
    public  ClipboardManager(Context context, Handler handler) {
        mContext = context;
        addTaint(handler.getTaint());
        // ---------- Original Method ----------
        //mContext = context;
    }

    
        static private IClipboard getService() {
        synchronized (sStaticLock) {
            if (sService != null) {
                return sService;
            }
            IBinder b = ServiceManager.getService("clipboard");
            sService = IClipboard.Stub.asInterface(b);
            return sService;
        }
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.142 -0400", hash_original_method = "9758ADBACC2D859F954394BF2EAF123A", hash_generated_method = "5C69CB3812A9A0703F7F1F30BC19865D")
    public void setPrimaryClip(ClipData clip) {
        try 
        {
            getService().setPrimaryClip(clip);
        } //End block
        catch (RemoteException e)
        { }
        addTaint(clip.getTaint());
        // ---------- Original Method ----------
        //try {
            //getService().setPrimaryClip(clip);
        //} catch (RemoteException e) {
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.143 -0400", hash_original_method = "50B348CB23C6EF42B3CBE9B194465F2B", hash_generated_method = "B66560F475B55618A290A824AC4C565A")
    public ClipData getPrimaryClip() {
        ClipData varB4EAC82CA7396A68D541C85D26508E83_1746267893 = null; //Variable for return #1
        ClipData varB4EAC82CA7396A68D541C85D26508E83_2018742984 = null; //Variable for return #2
        try 
        {
            varB4EAC82CA7396A68D541C85D26508E83_1746267893 = getService().getPrimaryClip(mContext.getPackageName());
        } //End block
        catch (RemoteException e)
        {
            varB4EAC82CA7396A68D541C85D26508E83_2018742984 = null;
        } //End block
        ClipData varA7E53CE21691AB073D9660D615818899_360682439; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_360682439 = varB4EAC82CA7396A68D541C85D26508E83_1746267893;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_360682439 = varB4EAC82CA7396A68D541C85D26508E83_2018742984;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_360682439.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_360682439;
        // ---------- Original Method ----------
        //try {
            //return getService().getPrimaryClip(mContext.getPackageName());
        //} catch (RemoteException e) {
            //return null;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.144 -0400", hash_original_method = "678ECBBFE5F09A43CDAAF81F6FD5AC97", hash_generated_method = "15C810D0AC7B049BDC54BB4345DB9AA8")
    public ClipDescription getPrimaryClipDescription() {
        ClipDescription varB4EAC82CA7396A68D541C85D26508E83_1780069332 = null; //Variable for return #1
        ClipDescription varB4EAC82CA7396A68D541C85D26508E83_564955985 = null; //Variable for return #2
        try 
        {
            varB4EAC82CA7396A68D541C85D26508E83_1780069332 = getService().getPrimaryClipDescription();
        } //End block
        catch (RemoteException e)
        {
            varB4EAC82CA7396A68D541C85D26508E83_564955985 = null;
        } //End block
        ClipDescription varA7E53CE21691AB073D9660D615818899_1172416995; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1172416995 = varB4EAC82CA7396A68D541C85D26508E83_1780069332;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1172416995 = varB4EAC82CA7396A68D541C85D26508E83_564955985;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1172416995.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1172416995;
        // ---------- Original Method ----------
        //try {
            //return getService().getPrimaryClipDescription();
        //} catch (RemoteException e) {
            //return null;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.145 -0400", hash_original_method = "CBBCF938F0063A19991B3E7A8193FD4F", hash_generated_method = "80875342AE78A76536E681703CC202C3")
    public boolean hasPrimaryClip() {
        try 
        {
            boolean var3C757C01DE776AE9A44F6650B0C4FBA6_819536499 = (getService().hasPrimaryClip());
        } //End block
        catch (RemoteException e)
        { }
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_581591241 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_581591241;
        // ---------- Original Method ----------
        //try {
            //return getService().hasPrimaryClip();
        //} catch (RemoteException e) {
            //return false;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.146 -0400", hash_original_method = "E5044C03AB4AD3DC9569B565F2008B98", hash_generated_method = "3931B1CE82FA5AEBA887DE35B01FEB50")
    public void addPrimaryClipChangedListener(OnPrimaryClipChangedListener what) {
        {
            {
                boolean var6174F040073C34898448239A43E2EAFC_61763501 = (mPrimaryClipChangedListeners.size() == 0);
                {
                    try 
                    {
                        getService().addPrimaryClipChangedListener(
                            mPrimaryClipChangedServiceListener);
                    } //End block
                    catch (RemoteException e)
                    { }
                } //End block
            } //End collapsed parenthetic
            mPrimaryClipChangedListeners.add(what);
        } //End block
        addTaint(what.getTaint());
        // ---------- Original Method ----------
        //synchronized (mPrimaryClipChangedListeners) {
            //if (mPrimaryClipChangedListeners.size() == 0) {
                //try {
                    //getService().addPrimaryClipChangedListener(
                            //mPrimaryClipChangedServiceListener);
                //} catch (RemoteException e) {
                //}
            //}
            //mPrimaryClipChangedListeners.add(what);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.147 -0400", hash_original_method = "7128B19124A44EC27CC4C323B8513057", hash_generated_method = "C4485C0D34241EAD48422E4E7551E189")
    public void removePrimaryClipChangedListener(OnPrimaryClipChangedListener what) {
        {
            mPrimaryClipChangedListeners.remove(what);
            {
                boolean var6174F040073C34898448239A43E2EAFC_2059703789 = (mPrimaryClipChangedListeners.size() == 0);
                {
                    try 
                    {
                        getService().removePrimaryClipChangedListener(
                            mPrimaryClipChangedServiceListener);
                    } //End block
                    catch (RemoteException e)
                    { }
                } //End block
            } //End collapsed parenthetic
        } //End block
        addTaint(what.getTaint());
        // ---------- Original Method ----------
        //synchronized (mPrimaryClipChangedListeners) {
            //mPrimaryClipChangedListeners.remove(what);
            //if (mPrimaryClipChangedListeners.size() == 0) {
                //try {
                    //getService().removePrimaryClipChangedListener(
                            //mPrimaryClipChangedServiceListener);
                //} catch (RemoteException e) {
                //}
            //}
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.148 -0400", hash_original_method = "D9D561BF0732BC43D4A46DB226A10D9C", hash_generated_method = "61F5ED360303BFDD0FE7D9D5294D5BC0")
    public CharSequence getText() {
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_58976951 = null; //Variable for return #1
        CharSequence varB4EAC82CA7396A68D541C85D26508E83_1047364241 = null; //Variable for return #2
        ClipData clip = getPrimaryClip();
        {
            boolean var199BC11988A51D31CFFDE3AC3DC661B9_637915753 = (clip != null && clip.getItemCount() > 0);
            {
                varB4EAC82CA7396A68D541C85D26508E83_58976951 = clip.getItemAt(0).coerceToText(mContext);
            } //End block
        } //End collapsed parenthetic
        varB4EAC82CA7396A68D541C85D26508E83_1047364241 = null;
        CharSequence varA7E53CE21691AB073D9660D615818899_1651336410; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_1651336410 = varB4EAC82CA7396A68D541C85D26508E83_58976951;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_1651336410 = varB4EAC82CA7396A68D541C85D26508E83_1047364241;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_1651336410.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_1651336410;
        // ---------- Original Method ----------
        //ClipData clip = getPrimaryClip();
        //if (clip != null && clip.getItemCount() > 0) {
            //return clip.getItemAt(0).coerceToText(mContext);
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.148 -0400", hash_original_method = "31E7EB6BE33A923560F7B9C2B2D8F3DA", hash_generated_method = "E87B08892C0344F4FFB230228225650C")
    public void setText(CharSequence text) {
        setPrimaryClip(ClipData.newPlainText(null, text));
        addTaint(text.getTaint());
        // ---------- Original Method ----------
        //setPrimaryClip(ClipData.newPlainText(null, text));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.149 -0400", hash_original_method = "9F22D463FB706DEB91BA1565CF5CF48D", hash_generated_method = "A72737B975EE6B9BF860B79A39B78073")
    public boolean hasText() {
        try 
        {
            boolean var5090D494BD5C885F44AA60AE07CD9967_775083184 = (getService().hasClipboardText());
        } //End block
        catch (RemoteException e)
        { }
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_121832331 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_121832331;
        // ---------- Original Method ----------
        //try {
            //return getService().hasClipboardText();
        //} catch (RemoteException e) {
            //return false;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.149 -0400", hash_original_method = "0985A14308F67055EBA5FC0B7343D794", hash_generated_method = "5941DDB012D548CE23BF5ABA0D6BA1F9")
     void reportPrimaryClipChanged() {
        Object[] listeners;
        {
            final int N = mPrimaryClipChangedListeners.size();
            listeners = mPrimaryClipChangedListeners.toArray();
        } //End block
        {
            int i = 0;
            {
                ((OnPrimaryClipChangedListener)listeners[i]).onPrimaryClipChanged();
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //Object[] listeners;
        //synchronized (mPrimaryClipChangedListeners) {
            //final int N = mPrimaryClipChangedListeners.size();
            //if (N <= 0) {
                //return;
            //}
            //listeners = mPrimaryClipChangedListeners.toArray();
        //}
        //for (int i=0; i<listeners.length; i++) {
            //((OnPrimaryClipChangedListener)listeners[i]).onPrimaryClipChanged();
        //}
    }

    
    public interface OnPrimaryClipChangedListener {
        void onPrimaryClipChanged();
    }
    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.150 -0400", hash_original_field = "6F01FC6BDB2E7BC12F6360B41E8B2316", hash_generated_field = "F842219FC69FE9ACCBA41EF52147C0D4")

    private final static Object sStaticLock = new Object();
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.150 -0400", hash_original_field = "5B4BCAAF27A7649717520CAA43216111", hash_generated_field = "7DAD8437C868C87DD2CEB4861B4C57D1")

    private static IClipboard sService;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:22.150 -0400", hash_original_field = "0EDC3B36A8AD58E17D93760B7667D1D3", hash_generated_field = "3C04989ED0EDFEE643DF5780498583F4")

    static final int MSG_REPORT_PRIMARY_CLIP_CHANGED = 1;
}

