package android.app;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.ServiceManager;
import android.view.IWindowManager;
import android.view.IOnKeyguardExitResult;

public class KeyguardManager {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:19.055 -0400", hash_original_field = "4FEDCF33DA439800CB483956AE637716", hash_generated_field = "900206E0E1CB232AC9B36B78FD174716")

    private IWindowManager mWM;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:19.055 -0400", hash_original_method = "5B69E23112A7A32F8407EC1FFE36B34D", hash_generated_method = "3C92E03D678C4B924547CF2813CCA769")
      KeyguardManager() {
        mWM = IWindowManager.Stub.asInterface(ServiceManager.getService(Context.WINDOW_SERVICE));
        // ---------- Original Method ----------
        //mWM = IWindowManager.Stub.asInterface(ServiceManager.getService(Context.WINDOW_SERVICE));
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:19.056 -0400", hash_original_method = "5C652CD18FFB9FB973F397E439BEDA7E", hash_generated_method = "6FA16155776950201A2A276D76014A60")
    @Deprecated
    public KeyguardLock newKeyguardLock(String tag) {
        KeyguardLock varB4EAC82CA7396A68D541C85D26508E83_375075936 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_375075936 = new KeyguardLock(tag);
        addTaint(tag.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_375075936.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_375075936;
        // ---------- Original Method ----------
        //return new KeyguardLock(tag);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:19.057 -0400", hash_original_method = "A2184A2736F97B1687D11E2CDBE84F5B", hash_generated_method = "C822C9ADD457397E162312E719D03DE1")
    public boolean isKeyguardLocked() {
        try 
        {
            boolean var48B9435D4B101DE12A3DCD069D2F7A58_1097544758 = (mWM.isKeyguardLocked());
        } //End block
        catch (RemoteException ex)
        { }
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_546546730 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_546546730;
        // ---------- Original Method ----------
        //try {
            //return mWM.isKeyguardLocked();
        //} catch (RemoteException ex) {
            //return false;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:19.058 -0400", hash_original_method = "D9B1D6FBA38958F439C4BED06843FB22", hash_generated_method = "FBDBA9FCFAB1DAE6F2D6F21506A1A173")
    public boolean isKeyguardSecure() {
        try 
        {
            boolean var72AFE6D50FD40100A4042D4D858724FD_631645136 = (mWM.isKeyguardSecure());
        } //End block
        catch (RemoteException ex)
        { }
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1384048314 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1384048314;
        // ---------- Original Method ----------
        //try {
            //return mWM.isKeyguardSecure();
        //} catch (RemoteException ex) {
            //return false;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:19.059 -0400", hash_original_method = "4D76893BACDA286FED51AB2B592BACEE", hash_generated_method = "01A05C9DBD723600C91DE2F90BE8772A")
    public boolean inKeyguardRestrictedInputMode() {
        try 
        {
            boolean var4688DD4A673F3F9603D7BAE9FE98157D_565714761 = (mWM.inKeyguardRestrictedInputMode());
        } //End block
        catch (RemoteException ex)
        { }
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_1547840713 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_1547840713;
        // ---------- Original Method ----------
        //try {
            //return mWM.inKeyguardRestrictedInputMode();
        //} catch (RemoteException ex) {
            //return false;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:19.062 -0400", hash_original_method = "FE8F5B525A90789B7FAA52BD35F0F030", hash_generated_method = "502F28D8239346C2A38D2023FCF25BBF")
    @Deprecated
    public void exitKeyguardSecurely(final OnKeyguardExitResult callback) {
        try 
        {
            mWM.exitKeyguardSecurely(new IOnKeyguardExitResult.Stub() {                
                @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:19.061 -0400", hash_original_method = "3EC2E5FCC08061EF9551EB1CD521B8A8", hash_generated_method = "293D6E5DA72FF6628E8321001BDE171C")
                public void onKeyguardExitResult(boolean success) throws RemoteException {
                    //DSFIXME:  CODE0009: Possible callback target function detected
                    callback.onKeyguardExitResult(success);
                    addTaint(success);
                    // ---------- Original Method ----------
                    //callback.onKeyguardExitResult(success);
                }
});
        } //End block
        catch (RemoteException e)
        { }
        addTaint(callback.getTaint());
        // ---------- Original Method ----------
        //try {
            //mWM.exitKeyguardSecurely(new IOnKeyguardExitResult.Stub() {
                //public void onKeyguardExitResult(boolean success) throws RemoteException {
                    //callback.onKeyguardExitResult(success);
                //}
            //});
        //} catch (RemoteException e) {
        //}
    }

    
    public class KeyguardLock {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:19.062 -0400", hash_original_field = "0483E306D297FF9F10FBB2053BA4F86A", hash_generated_field = "0A3D50E0763C2392A4FD5877627E0D78")

        private IBinder mToken = new Binder();
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:19.062 -0400", hash_original_field = "07496860B5C53FDD66588727158D5F73", hash_generated_field = "0950070738D23525D6B35F116326FC98")

        private String mTag;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:19.063 -0400", hash_original_method = "4D032B51654914D2B6BB0DA8DB46B141", hash_generated_method = "C4956F8D2CA9FF0EA9184C6E2220865C")
          KeyguardLock(String tag) {
            mTag = tag;
            // ---------- Original Method ----------
            //mTag = tag;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:19.063 -0400", hash_original_method = "D57DA4E953B853BFA2A0F53D32EDF463", hash_generated_method = "2FF67CACB261606C9E6B981D2D5839CC")
        public void disableKeyguard() {
            try 
            {
                mWM.disableKeyguard(mToken, mTag);
            } //End block
            catch (RemoteException ex)
            { }
            // ---------- Original Method ----------
            //try {
                //mWM.disableKeyguard(mToken, mTag);
            //} catch (RemoteException ex) {
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:19.064 -0400", hash_original_method = "A230379C02A7A7A26A0484D5752F5D3C", hash_generated_method = "3BEF0EE8C309CB5122A032C7D34DBE94")
        public void reenableKeyguard() {
            try 
            {
                mWM.reenableKeyguard(mToken);
            } //End block
            catch (RemoteException ex)
            { }
            // ---------- Original Method ----------
            //try {
                //mWM.reenableKeyguard(mToken);
            //} catch (RemoteException ex) {
            //}
        }

        
    }


    
    public interface OnKeyguardExitResult {

        
        void onKeyguardExitResult(boolean success);
    }
    
}

