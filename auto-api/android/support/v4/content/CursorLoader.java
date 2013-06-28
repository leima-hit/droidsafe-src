package android.support.v4.content;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public class CursorLoader extends AsyncTaskLoader<Cursor> {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.268 -0400", hash_original_field = "C61FA2E7C36AC7AB9C40A5C4B482DC3A", hash_generated_field = "A5AC746DA3DB38EE93C6D4B7204AA2CB")

    ForceLoadContentObserver mObserver;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.268 -0400", hash_original_field = "5FBE3730DCFF234F97B15868D5CE649D", hash_generated_field = "49226456B4CE4E55A779249DE3DC63D4")

    Uri mUri;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.268 -0400", hash_original_field = "B539ADB6655DA3802F6EA50CDAB7182B", hash_generated_field = "B4F1557AF588ACBB7C63054FC5A3DB24")

    String[] mProjection;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.268 -0400", hash_original_field = "D53310829851F4FC641DE95C4A986129", hash_generated_field = "A4B52CC7E044C58A043A90E441AE3148")

    String mSelection;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.268 -0400", hash_original_field = "BAEA1B6F996F3986EF68E88ECD2F5469", hash_generated_field = "471921CCB7416C473522085BE246B845")

    String[] mSelectionArgs;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.268 -0400", hash_original_field = "755C32BCA9E2E8B7F7116F3D5757A350", hash_generated_field = "1BF7E89DEAE629187129D35BF5C673FE")

    String mSortOrder;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.268 -0400", hash_original_field = "F54BB255BEA99BFE91A331B490610EDF", hash_generated_field = "4A85E902ED72E65A9AF8F6ED265E4F89")

    Cursor mCursor;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.269 -0400", hash_original_method = "A99DE5BAB8D49A9F22F0BBB80DAABBC5", hash_generated_method = "9A0A8C67F7048DA2BD4B75FFEBFFEF0B")
    public  CursorLoader(Context context) {
        super(context);
        mObserver = new ForceLoadContentObserver();
        addTaint(context.getTaint());
        // ---------- Original Method ----------
        //mObserver = new ForceLoadContentObserver();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.273 -0400", hash_original_method = "E85CFBB14C85DBDBF43218DB60311B9E", hash_generated_method = "64C0C722173E7C72B62672B79AFBB7ED")
    public  CursorLoader(Context context, Uri uri, String[] projection, String selection,
            String[] selectionArgs, String sortOrder) {
        super(context);
        mObserver = new ForceLoadContentObserver();
        mUri = uri;
        mProjection = projection;
        mSelection = selection;
        mSelectionArgs = selectionArgs;
        mSortOrder = sortOrder;
        addTaint(context.getTaint());
        // ---------- Original Method ----------
        //mObserver = new ForceLoadContentObserver();
        //mUri = uri;
        //mProjection = projection;
        //mSelection = selection;
        //mSelectionArgs = selectionArgs;
        //mSortOrder = sortOrder;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.274 -0400", hash_original_method = "F9FA66289F481A177ACDB3A6ED9AD777", hash_generated_method = "75BAECE8EFF196AAD6B1ED0E3908B264")
    @Override
    public Cursor loadInBackground() {
        Cursor varB4EAC82CA7396A68D541C85D26508E83_256262248 = null; //Variable for return #1
        Cursor cursor = getContext().getContentResolver().query(mUri, mProjection, mSelection,
                mSelectionArgs, mSortOrder);
        {
            cursor.getCount();
            registerContentObserver(cursor, mObserver);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_256262248 = cursor;
        varB4EAC82CA7396A68D541C85D26508E83_256262248.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_256262248;
        // ---------- Original Method ----------
        //Cursor cursor = getContext().getContentResolver().query(mUri, mProjection, mSelection,
                //mSelectionArgs, mSortOrder);
        //if (cursor != null) {
            //cursor.getCount();
            //registerContentObserver(cursor, mObserver);
        //}
        //return cursor;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.275 -0400", hash_original_method = "020E778E16877AE64A0EC7CA895AF414", hash_generated_method = "9A106FC404DCDDECEB26D1057CB7CEF8")
     void registerContentObserver(Cursor cursor, ContentObserver observer) {
        //DSFIXME: CODE0010: Possible callback registration function detected
        cursor.registerContentObserver(mObserver);
        addTaint(cursor.getTaint());
        addTaint(observer.getTaint());
        // ---------- Original Method ----------
        //cursor.registerContentObserver(mObserver);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.276 -0400", hash_original_method = "37FD37E6CF73F613BFDCC98E888F8BCC", hash_generated_method = "15E3815FF994E30A58E406229736D15C")
    @Override
    public void deliverResult(Cursor cursor) {
        {
            boolean var396A4E20A18F0CB5EA1A247530F4A1CC_1121111551 = (isReset());
            {
                {
                    cursor.close();
                } //End block
            } //End block
        } //End collapsed parenthetic
        Cursor oldCursor = mCursor;
        mCursor = cursor;
        {
            boolean varD892D561F22F67441CBDAA1DF2D74101_1579409884 = (isStarted());
            {
                super.deliverResult(cursor);
            } //End block
        } //End collapsed parenthetic
        {
            boolean varFD2F6599D37EB07EC4E591DC6274604E_1434106866 = (oldCursor != null && oldCursor != cursor && !oldCursor.isClosed());
            {
                oldCursor.close();
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //if (isReset()) {
            //if (cursor != null) {
                //cursor.close();
            //}
            //return;
        //}
        //Cursor oldCursor = mCursor;
        //mCursor = cursor;
        //if (isStarted()) {
            //super.deliverResult(cursor);
        //}
        //if (oldCursor != null && oldCursor != cursor && !oldCursor.isClosed()) {
            //oldCursor.close();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.277 -0400", hash_original_method = "FEDEC1668E99CC7AC8B63903F046C2E4", hash_generated_method = "9A5B1D3498DBE3D7CFDD444603CC72CD")
    @Override
    protected void onStartLoading() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            deliverResult(mCursor);
        } //End block
        {
            boolean var97F909A67ECD7ED4B7826F327C77B4CA_65297509 = (takeContentChanged() || mCursor == null);
            {
                forceLoad();
            } //End block
        } //End collapsed parenthetic
        // ---------- Original Method ----------
        //if (mCursor != null) {
            //deliverResult(mCursor);
        //}
        //if (takeContentChanged() || mCursor == null) {
            //forceLoad();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.277 -0400", hash_original_method = "9D6573E0227A73E2122897AF91440AD0", hash_generated_method = "81B3A186E0433BEB205EBEDD3D384C02")
    @Override
    protected void onStopLoading() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        cancelLoad();
        // ---------- Original Method ----------
        //cancelLoad();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.278 -0400", hash_original_method = "880E0574E2EB66A6B5B217A64A77BCD6", hash_generated_method = "32BF20B94B8FF1D69A2997698797A4E4")
    @Override
    public void onCanceled(Cursor cursor) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        {
            boolean var6E557A405E573C015C30C74BDB9F539B_1613964733 = (cursor != null && !cursor.isClosed());
            {
                cursor.close();
            } //End block
        } //End collapsed parenthetic
        addTaint(cursor.getTaint());
        // ---------- Original Method ----------
        //if (cursor != null && !cursor.isClosed()) {
            //cursor.close();
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.278 -0400", hash_original_method = "CBB8B33455486DDE9DE82F5D7E5B319A", hash_generated_method = "F06D3859425DE804C789775B3E636CB6")
    @Override
    protected void onReset() {
        //DSFIXME:  CODE0009: Possible callback target function detected
        super.onReset();
        onStopLoading();
        {
            boolean var17C3122DB48F8D9C899DB59BBA71A4FB_1460188715 = (mCursor != null && !mCursor.isClosed());
            {
                mCursor.close();
            } //End block
        } //End collapsed parenthetic
        mCursor = null;
        // ---------- Original Method ----------
        //super.onReset();
        //onStopLoading();
        //if (mCursor != null && !mCursor.isClosed()) {
            //mCursor.close();
        //}
        //mCursor = null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.279 -0400", hash_original_method = "225259AA593B6A59F476A2C569F1B075", hash_generated_method = "370B9292BEB0A5F6C29FF2FE4F1EECC4")
    public Uri getUri() {
        Uri varB4EAC82CA7396A68D541C85D26508E83_191022837 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_191022837 = mUri;
        varB4EAC82CA7396A68D541C85D26508E83_191022837.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_191022837;
        // ---------- Original Method ----------
        //return mUri;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.279 -0400", hash_original_method = "9C60EE9BABBE4846A09E69FDD9525C9D", hash_generated_method = "1565E698950E459B40FC6B1A30301330")
    public void setUri(Uri uri) {
        mUri = uri;
        // ---------- Original Method ----------
        //mUri = uri;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.280 -0400", hash_original_method = "F735C138868E0AFA154B3EDF3AAC6C8C", hash_generated_method = "12C3BAF14D9B73B7FE0802146E5506F5")
    public String[] getProjection() {
        String[] varB4EAC82CA7396A68D541C85D26508E83_184820510 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_184820510 = mProjection;
        varB4EAC82CA7396A68D541C85D26508E83_184820510.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_184820510;
        // ---------- Original Method ----------
        //return mProjection;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.280 -0400", hash_original_method = "1FD0FB2AA6253DF2D0DE4351259B7D6A", hash_generated_method = "2307E179C952E8EDFB6BBB5646F927A1")
    public void setProjection(String[] projection) {
        mProjection = projection;
        // ---------- Original Method ----------
        //mProjection = projection;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.281 -0400", hash_original_method = "E01933AA37B8BF932A93A806A1D37FFC", hash_generated_method = "0F3B3B5E58D85AB148D10471130970BD")
    public String getSelection() {
        String varB4EAC82CA7396A68D541C85D26508E83_471828305 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_471828305 = mSelection;
        varB4EAC82CA7396A68D541C85D26508E83_471828305.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_471828305;
        // ---------- Original Method ----------
        //return mSelection;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.281 -0400", hash_original_method = "0D04EAE992D5BEBB5A3775930987740E", hash_generated_method = "8D0C01BC2FD4DA64EC5DFEE4B4BFFFB5")
    public void setSelection(String selection) {
        mSelection = selection;
        // ---------- Original Method ----------
        //mSelection = selection;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.282 -0400", hash_original_method = "9B3363CD5FA3C0407FC101CCC97AC74F", hash_generated_method = "7AAA43E3F7AB509DB713503772F65AE9")
    public String[] getSelectionArgs() {
        String[] varB4EAC82CA7396A68D541C85D26508E83_1257188655 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1257188655 = mSelectionArgs;
        varB4EAC82CA7396A68D541C85D26508E83_1257188655.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1257188655;
        // ---------- Original Method ----------
        //return mSelectionArgs;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.282 -0400", hash_original_method = "5DE6373B4434A7D0B0150E5FA1A41F4D", hash_generated_method = "2749EDEF8949EF1FF35A2BA90D360659")
    public void setSelectionArgs(String[] selectionArgs) {
        mSelectionArgs = selectionArgs;
        // ---------- Original Method ----------
        //mSelectionArgs = selectionArgs;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.284 -0400", hash_original_method = "E54D82A1039D474135177094E296D0BE", hash_generated_method = "8123D8B527F47260114246251AA7E108")
    public String getSortOrder() {
        String varB4EAC82CA7396A68D541C85D26508E83_9961698 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_9961698 = mSortOrder;
        varB4EAC82CA7396A68D541C85D26508E83_9961698.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_9961698;
        // ---------- Original Method ----------
        //return mSortOrder;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.284 -0400", hash_original_method = "5BFD82EE872F667FB5FE226A7761A7D3", hash_generated_method = "C543040F89A1BDC3496BD90EA95223A3")
    public void setSortOrder(String sortOrder) {
        mSortOrder = sortOrder;
        // ---------- Original Method ----------
        //mSortOrder = sortOrder;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:13:46.285 -0400", hash_original_method = "F4CED264AFFA6312AA112E1BE872302C", hash_generated_method = "1D69BFF75EF084995B5CA0BA32C64670")
    @Override
    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        super.dump(prefix, fd, writer, args);
        writer.print(prefix);
        writer.print("mUri=");
        writer.println(mUri);
        writer.print(prefix);
        writer.print("mProjection=");
        writer.println(Arrays.toString(mProjection));
        writer.print(prefix);
        writer.print("mSelection=");
        writer.println(mSelection);
        writer.print(prefix);
        writer.print("mSelectionArgs=");
        writer.println(Arrays.toString(mSelectionArgs));
        writer.print(prefix);
        writer.print("mSortOrder=");
        writer.println(mSortOrder);
        writer.print(prefix);
        writer.print("mCursor=");
        writer.println(mCursor);
        writer.print(prefix);
        writer.print("mContentChanged=");
        writer.println(mContentChanged);
        addTaint(prefix.getTaint());
        addTaint(fd.getTaint());
        addTaint(writer.getTaint());
        addTaint(args[0].getTaint());
        // ---------- Original Method ----------
        //super.dump(prefix, fd, writer, args);
        //writer.print(prefix);
        //writer.print("mUri=");
        //writer.println(mUri);
        //writer.print(prefix);
        //writer.print("mProjection=");
        //writer.println(Arrays.toString(mProjection));
        //writer.print(prefix);
        //writer.print("mSelection=");
        //writer.println(mSelection);
        //writer.print(prefix);
        //writer.print("mSelectionArgs=");
        //writer.println(Arrays.toString(mSelectionArgs));
        //writer.print(prefix);
        //writer.print("mSortOrder=");
        //writer.println(mSortOrder);
        //writer.print(prefix);
        //writer.print("mCursor=");
        //writer.println(mCursor);
        //writer.print(prefix);
        //writer.print("mContentChanged=");
        //writer.println(mContentChanged);
    }

    
}

