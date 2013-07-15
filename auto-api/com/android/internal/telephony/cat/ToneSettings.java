package com.android.internal.telephony.cat;


import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;


import java.util.Iterator;
import android.os.Parcel;
import android.os.Parcelable;

public class ToneSettings implements Parcelable {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:25.844 -0400", hash_original_field = "B85EC314BF443B797EF8A66B3B03F8A4", hash_generated_field = "F627176E1C35421D662BC9D4AD138316")

    public Duration duration;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:25.844 -0400", hash_original_field = "F303F9A15CDDBE8EE0296511A8B04B30", hash_generated_field = "EB3E719105B196E3B2D9B760B5FAACD1")

    public Tone tone;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:25.844 -0400", hash_original_field = "FEE5781595FD04E19BD18B17AAFAAE5A", hash_generated_field = "DDF27BF2683D75AD38AE982C8B9BF193")

    public boolean vibrate;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:25.844 -0400", hash_original_method = "1758CDE2435E3198DD1711D15D7C0A67", hash_generated_method = "F70DF0CEC8CCBFBB2C4D6F73B3AD40B8")
    public  ToneSettings(Duration duration, Tone tone, boolean vibrate) {
        this.duration = duration;
        this.tone = tone;
        this.vibrate = vibrate;
        
        
        
        
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:25.845 -0400", hash_original_method = "BF14929F27F95EDB5212CB812386B849", hash_generated_method = "8EFB16314C3E7CA96E51A335C785F39B")
    private  ToneSettings(Parcel in) {
        duration = in.readParcelable(null);
        tone = in.readParcelable(null);
        vibrate = in.readInt() == 1;
        
        
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:25.845 -0400", hash_original_method = "00F8174F9E89D0C972FA6D3F19742382", hash_generated_method = "7C8D8DB843E677F5137F5151F00F899E")
    public int describeContents() {
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_409378552 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_409378552;
        
        
    }

    
    @DSModeled(DSC.SAFE)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:25.845 -0400", hash_original_method = "A5E63ABB35658FAF6D2AA5EF55230C8C", hash_generated_method = "F3769C03D28FAA24CB2275B8E5CE5AE1")
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(duration, 0);
        dest.writeParcelable(tone, 0);
        dest.writeInt(vibrate ? 1 : 0);
        addTaint(dest.getTaint());
        addTaint(flags);
        
        
        
        
    }

    
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:25.845 -0400", hash_original_field = "006B52A6764FB6E11133906A413EC74A", hash_generated_field = "FABADDC48937C3190B4F868CEBE56675")

    public static final Parcelable.Creator<ToneSettings> CREATOR = new Parcelable.Creator<ToneSettings>() {
        public ToneSettings createFromParcel(Parcel in) {
            return new ToneSettings(in);
        }

        public ToneSettings[] newArray(int size) {
            return new ToneSettings[size];
        }
    };
    
    public ToneSettings createFromParcel(Parcel in) {
            return new ToneSettings(in);
        }
    
    
    public ToneSettings[] newArray(int size) {
            return new ToneSettings[size];
        }
    
}

