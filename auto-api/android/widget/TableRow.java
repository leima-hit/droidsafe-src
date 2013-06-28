package android.widget;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;

// needed for enhanced for control translations
import java.util.Iterator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;

public class TableRow extends LinearLayout {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.435 -0400", hash_original_field = "94828D8F312B8AB3147B78D966A52731", hash_generated_field = "D9A8A35CE61AAB048FD0AED37F8CBEEB")

    private int mNumColumns = 0;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.435 -0400", hash_original_field = "9316A0817013F43BA563EE0E12FD9D08", hash_generated_field = "15FCA76D9E6B49D35CF288E17BA4DB1D")

    private int[] mColumnWidths;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.435 -0400", hash_original_field = "DF3FD1A34FB8980B312F9E011F58EFB5", hash_generated_field = "3C7C52F68E94A8B9B94FB48FC8D2BFE4")

    private int[] mConstrainedColumnWidths;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.435 -0400", hash_original_field = "0930D04987F4641671E3845A4431884D", hash_generated_field = "7C85DDE3B4F4B337F894C4208AF1B531")

    private SparseIntArray mColumnToChildIndex;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.435 -0400", hash_original_field = "65AE90ABA3B21B887FD16B92A7395024", hash_generated_field = "3A88AE8C6C11D29E8EFD9BC29F67E7FE")

    private ChildrenTracker mChildrenTracker;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.436 -0400", hash_original_method = "F9A2694D9D8F1C73F4893642416A48B8", hash_generated_method = "BC0B767B2F5F42B51CE73D21AFCE6862")
    public  TableRow(Context context) {
        super(context);
        initTableRow();
        addTaint(context.getTaint());
        // ---------- Original Method ----------
        //initTableRow();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.436 -0400", hash_original_method = "BE346953D196911D47A80804A6B74A8F", hash_generated_method = "2A7F5855746EA37DFF7B33E748A27FC1")
    public  TableRow(Context context, AttributeSet attrs) {
        super(context, attrs);
        initTableRow();
        addTaint(context.getTaint());
        addTaint(attrs.getTaint());
        // ---------- Original Method ----------
        //initTableRow();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.436 -0400", hash_original_method = "B661864F11557636EAA2570C7969C441", hash_generated_method = "C164A8619AC96454B49C2E92F11F4086")
    private void initTableRow() {
        OnHierarchyChangeListener oldListener = mOnHierarchyChangeListener;
        mChildrenTracker = new ChildrenTracker();
        {
            mChildrenTracker.setOnHierarchyChangeListener(oldListener);
        } //End block
        super.setOnHierarchyChangeListener(mChildrenTracker);
        // ---------- Original Method ----------
        //OnHierarchyChangeListener oldListener = mOnHierarchyChangeListener;
        //mChildrenTracker = new ChildrenTracker();
        //if (oldListener != null) {
            //mChildrenTracker.setOnHierarchyChangeListener(oldListener);
        //}
        //super.setOnHierarchyChangeListener(mChildrenTracker);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.437 -0400", hash_original_method = "F95EB07610207091F5D59E2132ED055F", hash_generated_method = "241146C1D639C463AD50B8CB99058477")
    @Override
    public void setOnHierarchyChangeListener(OnHierarchyChangeListener listener) {
        mChildrenTracker.setOnHierarchyChangeListener(listener);
        addTaint(listener.getTaint());
        // ---------- Original Method ----------
        //mChildrenTracker.setOnHierarchyChangeListener(listener);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.437 -0400", hash_original_method = "2321E3900029B8CC8621E7719358502D", hash_generated_method = "0910E989283C0F9E69ECFF7025E3A288")
     void setColumnCollapsed(int columnIndex, boolean collapsed) {
        View child = getVirtualChildAt(columnIndex);
        {
            child.setVisibility(collapsed ? GONE : VISIBLE);
        } //End block
        addTaint(columnIndex);
        addTaint(collapsed);
        // ---------- Original Method ----------
        //View child = getVirtualChildAt(columnIndex);
        //if (child != null) {
            //child.setVisibility(collapsed ? GONE : VISIBLE);
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.437 -0400", hash_original_method = "F6BA9F18146785AE4528780F68777354", hash_generated_method = "22918DA7F5C6F9F2F139598D0714E54F")
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        measureHorizontal(widthMeasureSpec, heightMeasureSpec);
        addTaint(widthMeasureSpec);
        addTaint(heightMeasureSpec);
        // ---------- Original Method ----------
        //measureHorizontal(widthMeasureSpec, heightMeasureSpec);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.437 -0400", hash_original_method = "614377E7AFFD7D8A3CEA03D0F029C6C2", hash_generated_method = "DF8535F106BA934EDCDB9ABB1CD83F01")
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        //DSFIXME:  CODE0009: Possible callback target function detected
        layoutHorizontal();
        addTaint(changed);
        addTaint(l);
        addTaint(t);
        addTaint(r);
        addTaint(b);
        // ---------- Original Method ----------
        //layoutHorizontal();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.438 -0400", hash_original_method = "76BF09C7D97AC336E0857E346F87F26E", hash_generated_method = "C89A6A207D44F76E77C9C2F976A772EF")
    @Override
    public View getVirtualChildAt(int i) {
        View varB4EAC82CA7396A68D541C85D26508E83_1272299388 = null; //Variable for return #1
        View varB4EAC82CA7396A68D541C85D26508E83_462533775 = null; //Variable for return #2
        {
            mapIndexAndColumns();
        } //End block
        final int deflectedIndex = mColumnToChildIndex.get(i, -1);
        {
            varB4EAC82CA7396A68D541C85D26508E83_1272299388 = getChildAt(deflectedIndex);
        } //End block
        varB4EAC82CA7396A68D541C85D26508E83_462533775 = null;
        addTaint(i);
        View varA7E53CE21691AB073D9660D615818899_962503687; //Final return value
        switch (DroidSafeAndroidRuntime.switchControl) {
            case 1: //Assign result for return ordinal #1
                varA7E53CE21691AB073D9660D615818899_962503687 = varB4EAC82CA7396A68D541C85D26508E83_1272299388;
                break;
            default:
                varA7E53CE21691AB073D9660D615818899_962503687 = varB4EAC82CA7396A68D541C85D26508E83_462533775;
                break;
        }
        varA7E53CE21691AB073D9660D615818899_962503687.addTaint(getTaint()); //Add taint from parent
        return varA7E53CE21691AB073D9660D615818899_962503687;
        // ---------- Original Method ----------
        //if (mColumnToChildIndex == null) {
            //mapIndexAndColumns();
        //}
        //final int deflectedIndex = mColumnToChildIndex.get(i, -1);
        //if (deflectedIndex != -1) {
            //return getChildAt(deflectedIndex);
        //}
        //return null;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.439 -0400", hash_original_method = "C68DDC21BA155D9A2863642050B804BE", hash_generated_method = "5F31F7540CE35EC094DE10493B0F6AEA")
    @Override
    public int getVirtualChildCount() {
        {
            mapIndexAndColumns();
        } //End block
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_573462342 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_573462342;
        // ---------- Original Method ----------
        //if (mColumnToChildIndex == null) {
            //mapIndexAndColumns();
        //}
        //return mNumColumns;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.439 -0400", hash_original_method = "4E55577CF2059CB35F704B8E869B19CD", hash_generated_method = "202E4820D710A782452CE540CF028ACA")
    private void mapIndexAndColumns() {
        {
            int virtualCount = 0;
            final int count = getChildCount();
            mColumnToChildIndex = new SparseIntArray();
            final SparseIntArray columnToChild = mColumnToChildIndex;
            {
                int i = 0;
                {
                    final View child = getChildAt(i);
                    final LayoutParams layoutParams = (LayoutParams) child.getLayoutParams();
                    {
                        virtualCount = layoutParams.column;
                    } //End block
                    {
                        int j = 0;
                        {
                            columnToChild.put(virtualCount++, i);
                        } //End block
                    } //End collapsed parenthetic
                } //End block
            } //End collapsed parenthetic
            mNumColumns = virtualCount;
        } //End block
        // ---------- Original Method ----------
        //if (mColumnToChildIndex == null) {
            //int virtualCount = 0;
            //final int count = getChildCount();
            //mColumnToChildIndex = new SparseIntArray();
            //final SparseIntArray columnToChild = mColumnToChildIndex;
            //for (int i = 0; i < count; i++) {
                //final View child = getChildAt(i);
                //final LayoutParams layoutParams = (LayoutParams) child.getLayoutParams();
                //if (layoutParams.column >= virtualCount) {
                    //virtualCount = layoutParams.column;
                //}
                //for (int j = 0; j < layoutParams.span; j++) {
                    //columnToChild.put(virtualCount++, i);
                //}
            //}
            //mNumColumns = virtualCount;
        //}
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.440 -0400", hash_original_method = "6310895A2EAB860DC48C590959484D6D", hash_generated_method = "7AB90473703397ECA48C4AA381709085")
    @Override
     int measureNullChild(int childIndex) {
        addTaint(childIndex);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_799000596 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_799000596;
        // ---------- Original Method ----------
        //return mConstrainedColumnWidths[childIndex];
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.441 -0400", hash_original_method = "21A01BD04BAB3B03D9551E5E2A120920", hash_generated_method = "58FDD69E8318566BE35AC95865D8D30D")
    @Override
     void measureChildBeforeLayout(View child, int childIndex,
            int widthMeasureSpec, int totalWidth,
            int heightMeasureSpec, int totalHeight) {
        {
            final LayoutParams lp = (LayoutParams) child.getLayoutParams();
            int measureMode = MeasureSpec.EXACTLY;
            int columnWidth = 0;
            final int span = lp.span;
            final int[] constrainedColumnWidths = mConstrainedColumnWidths;
            {
                int i = 0;
                {
                    columnWidth += constrainedColumnWidths[childIndex + i];
                } //End block
            } //End collapsed parenthetic
            final int gravity = lp.gravity;
            final boolean isHorizontalGravity = Gravity.isHorizontal(gravity);
            {
                measureMode = MeasureSpec.AT_MOST;
            } //End block
            int childWidthMeasureSpec = MeasureSpec.makeMeasureSpec(
                    Math.max(0, columnWidth - lp.leftMargin - lp.rightMargin), measureMode
            );
            int childHeightMeasureSpec = getChildMeasureSpec(heightMeasureSpec,
                    mPaddingTop + mPaddingBottom + lp.topMargin +
                    lp .bottomMargin + totalHeight, lp.height);
            child.measure(childWidthMeasureSpec, childHeightMeasureSpec);
            {
                final int childWidth = child.getMeasuredWidth();
                lp.mOffset[LayoutParams.LOCATION_NEXT] = columnWidth - childWidth;
                final int layoutDirection = getResolvedLayoutDirection();
                final int absoluteGravity = Gravity.getAbsoluteGravity(gravity, layoutDirection);
                //Begin case Gravity.RIGHT 
                lp.mOffset[LayoutParams.LOCATION] = lp.mOffset[LayoutParams.LOCATION_NEXT];
                //End case Gravity.RIGHT 
                //Begin case Gravity.CENTER_HORIZONTAL 
                lp.mOffset[LayoutParams.LOCATION] = lp.mOffset[LayoutParams.LOCATION_NEXT] / 2;
                //End case Gravity.CENTER_HORIZONTAL 
            } //End block
            {
                lp.mOffset[LayoutParams.LOCATION] = lp.mOffset[LayoutParams.LOCATION_NEXT] = 0;
            } //End block
        } //End block
        {
            super.measureChildBeforeLayout(child, childIndex, widthMeasureSpec,
                    totalWidth, heightMeasureSpec, totalHeight);
        } //End block
        addTaint(child.getTaint());
        addTaint(childIndex);
        addTaint(widthMeasureSpec);
        addTaint(totalWidth);
        addTaint(heightMeasureSpec);
        addTaint(totalHeight);
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.441 -0400", hash_original_method = "B06729C46F9CA4132172A65B967C7D51", hash_generated_method = "6552238083A014D0CBFCB4A840FDCC08")
    @Override
     int getChildrenSkipCount(View child, int index) {
        LayoutParams layoutParams = (LayoutParams) child.getLayoutParams();
        addTaint(child.getTaint());
        addTaint(index);
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1047917516 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_1047917516;
        // ---------- Original Method ----------
        //LayoutParams layoutParams = (LayoutParams) child.getLayoutParams();
        //return layoutParams.span - 1;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.441 -0400", hash_original_method = "B1A714BE7A14CFDA42294606652D195E", hash_generated_method = "950B28072A841CC409AAF0E97C7B7694")
    @Override
     int getLocationOffset(View child) {
        int var4019674B86CB2AC2F6FECC0EBF4E05AC_1832426950 = (((TableRow.LayoutParams) child.getLayoutParams()).mOffset[LayoutParams.LOCATION]);
        addTaint(child.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_112185846 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_112185846;
        // ---------- Original Method ----------
        //return ((TableRow.LayoutParams) child.getLayoutParams()).mOffset[LayoutParams.LOCATION];
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.442 -0400", hash_original_method = "6629CED69C690D63986C2D59A68F69D3", hash_generated_method = "0CF66666921C9AF2BED35A9FFC936982")
    @Override
     int getNextLocationOffset(View child) {
        int var7589EAB5DFE4B1A3B4A43C1C4B413570_1624792656 = (((TableRow.LayoutParams) child.getLayoutParams()).mOffset[LayoutParams.LOCATION_NEXT]);
        addTaint(child.getTaint());
        int varFA7153F7ED1CB6C0FCF2FFB2FAC21748_428987659 = getTaintInt();
        return varFA7153F7ED1CB6C0FCF2FFB2FAC21748_428987659;
        // ---------- Original Method ----------
        //return ((TableRow.LayoutParams) child.getLayoutParams()).mOffset[LayoutParams.LOCATION_NEXT];
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.442 -0400", hash_original_method = "F97D9B3BAD7BE3BFEC03988909D08EE2", hash_generated_method = "1E33DF54B1E11333B9A0DB6D74878721")
     int[] getColumnsWidths(int widthMeasureSpec) {
        final int numColumns = getVirtualChildCount();
        {
            mColumnWidths = new int[numColumns];
        } //End block
        final int[] columnWidths = mColumnWidths;
        {
            int i = 0;
            {
                final View child = getVirtualChildAt(i);
                {
                    boolean varAD445368CB7F7DFBCAA93AD5AAA408ED_1007349652 = (child != null && child.getVisibility() != GONE);
                    {
                        final LayoutParams layoutParams = (LayoutParams) child.getLayoutParams();
                        {
                            int spec;
                            //Begin case LayoutParams.WRAP_CONTENT 
                            spec = getChildMeasureSpec(widthMeasureSpec, 0, LayoutParams.WRAP_CONTENT);
                            //End case LayoutParams.WRAP_CONTENT 
                            //Begin case LayoutParams.MATCH_PARENT 
                            spec = MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED);
                            //End case LayoutParams.MATCH_PARENT 
                            //Begin case default 
                            spec = MeasureSpec.makeMeasureSpec(layoutParams.width, MeasureSpec.EXACTLY);
                            //End case default 
                            child.measure(spec, spec);
                            final int width = child.getMeasuredWidth() + layoutParams.leftMargin +
                            layoutParams.rightMargin;
                            columnWidths[i] = width;
                        } //End block
                        {
                            columnWidths[i] = 0;
                        } //End block
                    } //End block
                    {
                        columnWidths[i] = 0;
                    } //End block
                } //End collapsed parenthetic
            } //End block
        } //End collapsed parenthetic
        addTaint(widthMeasureSpec);
        int[] varB4CCCA26F9DB9189C32F33E82D425CFB_1298223449 = {getTaintInt()};
        return varB4CCCA26F9DB9189C32F33E82D425CFB_1298223449;
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.443 -0400", hash_original_method = "00077407B55623ED0FDC934F0F688424", hash_generated_method = "4A77E0639FC586EA8495A51D38CCEFFB")
     void setColumnsWidthConstraints(int[] columnWidths) {
        {
            boolean var1D7B4D09F21CAAC2629ADAA96814CE84_1897491894 = (columnWidths == null || columnWidths.length < getVirtualChildCount());
            {
                if (DroidSafeAndroidRuntime.control) throw new IllegalArgumentException(
                    "columnWidths should be >= getVirtualChildCount()");
            } //End block
        } //End collapsed parenthetic
        mConstrainedColumnWidths = columnWidths;
        // ---------- Original Method ----------
        //if (columnWidths == null || columnWidths.length < getVirtualChildCount()) {
            //throw new IllegalArgumentException(
                    //"columnWidths should be >= getVirtualChildCount()");
        //}
        //mConstrainedColumnWidths = columnWidths;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.443 -0400", hash_original_method = "52AE7360396A37641601CBCD86366395", hash_generated_method = "4A71D93B00CB966EADDE87EB0B66BB8F")
    @Override
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        LayoutParams varB4EAC82CA7396A68D541C85D26508E83_1852666186 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_1852666186 = new TableRow.LayoutParams(getContext(), attrs);
        addTaint(attrs.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_1852666186.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_1852666186;
        // ---------- Original Method ----------
        //return new TableRow.LayoutParams(getContext(), attrs);
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.444 -0400", hash_original_method = "CBDF0BDAD2221E25AE8470C9AB157031", hash_generated_method = "7219E60309209AE0B759388647994247")
    @Override
    protected LinearLayout.LayoutParams generateDefaultLayoutParams() {
        LinearLayout.LayoutParams varB4EAC82CA7396A68D541C85D26508E83_2047647473 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_2047647473 = new LayoutParams();
        varB4EAC82CA7396A68D541C85D26508E83_2047647473.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_2047647473;
        // ---------- Original Method ----------
        //return new LayoutParams();
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.444 -0400", hash_original_method = "22EE87D9951BB7D40E63D16DD0B3F806", hash_generated_method = "EC40DA1B26CFBC0C91F2E301018B992D")
    @Override
    protected boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        addTaint(p.getTaint());
        boolean var84E2C64F38F78BA3EA5C905AB5A2DA27_870826631 = getTaintBoolean();
        return var84E2C64F38F78BA3EA5C905AB5A2DA27_870826631;
        // ---------- Original Method ----------
        //return p instanceof TableRow.LayoutParams;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.444 -0400", hash_original_method = "BBEB2ACD1EFF73877451077ABC9022BA", hash_generated_method = "FF0B104789A0EAC270AFC44E8F698637")
    @Override
    protected LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        LinearLayout.LayoutParams varB4EAC82CA7396A68D541C85D26508E83_762880795 = null; //Variable for return #1
        varB4EAC82CA7396A68D541C85D26508E83_762880795 = new LayoutParams(p);
        addTaint(p.getTaint());
        varB4EAC82CA7396A68D541C85D26508E83_762880795.addTaint(getTaint()); //Add taint from parent
        return varB4EAC82CA7396A68D541C85D26508E83_762880795;
        // ---------- Original Method ----------
        //return new LayoutParams(p);
    }

    
    public static class LayoutParams extends LinearLayout.LayoutParams {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.444 -0400", hash_original_field = "1AFD32818D1C9525F82AFF4C09EFD254", hash_generated_field = "880EADDB8CAD6645D1A649B4C5BDBB5F")

        @ViewDebug.ExportedProperty(category = "layout") public int column;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.444 -0400", hash_original_field = "EAC828E40705BFAFD82EF1A82E3F5AB8", hash_generated_field = "1D587A55F3FA8CB1DFEEF6D53CE06BC2")

        @ViewDebug.ExportedProperty(category = "layout") public int span;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.444 -0400", hash_original_field = "76EC118A138E169402F72BBF83D9D2B2", hash_generated_field = "3B010DF7096DEB2A022337BFA1B1C1A7")

        private int[] mOffset = new int[2];
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.445 -0400", hash_original_method = "E5D3961F929E7A203A8A944132C09ABE", hash_generated_method = "7ABD4F56C914B168D079CE77132E8F0E")
        public  LayoutParams(Context c, AttributeSet attrs) {
            super(c, attrs);
            TypedArray a = c.obtainStyledAttributes(attrs,
                            com.android.internal.R.styleable.TableRow_Cell);
            column = a.getInt(com.android.internal.R.styleable.TableRow_Cell_layout_column, -1);
            span = a.getInt(com.android.internal.R.styleable.TableRow_Cell_layout_span, 1);
            {
                span = 1;
            } //End block
            a.recycle();
            addTaint(c.getTaint());
            addTaint(attrs.getTaint());
            // ---------- Original Method ----------
            //TypedArray a =
                    //c.obtainStyledAttributes(attrs,
                            //com.android.internal.R.styleable.TableRow_Cell);
            //column = a.getInt(com.android.internal.R.styleable.TableRow_Cell_layout_column, -1);
            //span = a.getInt(com.android.internal.R.styleable.TableRow_Cell_layout_span, 1);
            //if (span <= 1) {
                //span = 1;
            //}
            //a.recycle();
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.445 -0400", hash_original_method = "DCEE7ED44A87D406D3E35C60D8DCDFD7", hash_generated_method = "21E1D65BA15BA6DCCEF345C3916A3907")
        public  LayoutParams(int w, int h) {
            super(w, h);
            column = -1;
            span = 1;
            addTaint(w);
            addTaint(h);
            // ---------- Original Method ----------
            //column = -1;
            //span = 1;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.445 -0400", hash_original_method = "AC2D690BD2E1EA15E67B11BD37629B19", hash_generated_method = "4C0E2B9858239F1E952000DA1C65D657")
        public  LayoutParams(int w, int h, float initWeight) {
            super(w, h, initWeight);
            column = -1;
            span = 1;
            addTaint(w);
            addTaint(h);
            addTaint(initWeight);
            // ---------- Original Method ----------
            //column = -1;
            //span = 1;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.446 -0400", hash_original_method = "5AA50E380D57ACDFC498CDB1B1E9AFBA", hash_generated_method = "D51E0843B736F81679DA6F5102944259")
        public  LayoutParams() {
            super(MATCH_PARENT, WRAP_CONTENT);
            column = -1;
            span = 1;
            // ---------- Original Method ----------
            //column = -1;
            //span = 1;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.446 -0400", hash_original_method = "151219291568C02E222942C0989F524E", hash_generated_method = "652CDC09119E13725C36A1627D245320")
        public  LayoutParams(int column) {
            this();
            this.column = column;
            // ---------- Original Method ----------
            //this.column = column;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.446 -0400", hash_original_method = "DE4ED36682A1028E303BDCC28A48E06F", hash_generated_method = "66B55E9EFECAB48B3D28D153941B8308")
        public  LayoutParams(ViewGroup.LayoutParams p) {
            super(p);
            addTaint(p.getTaint());
            // ---------- Original Method ----------
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.447 -0400", hash_original_method = "CC87BD4B8C067788FA2BA37DBA116F62", hash_generated_method = "BDFD9CE52FB4D6304CCFF1CA731BA0A9")
        public  LayoutParams(MarginLayoutParams source) {
            super(source);
            addTaint(source.getTaint());
            // ---------- Original Method ----------
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.447 -0400", hash_original_method = "FC68734AF1365F8395009E059E8FEC81", hash_generated_method = "9E684C907240BA1461E9AC05B07FF408")
        @Override
        protected void setBaseAttributes(TypedArray a, int widthAttr, int heightAttr) {
            {
                boolean varD888BD0D4A06953AD18C20BAB6D44F4C_313814470 = (a.hasValue(widthAttr));
                {
                    width = a.getLayoutDimension(widthAttr, "layout_width");
                } //End block
                {
                    width = MATCH_PARENT;
                } //End block
            } //End collapsed parenthetic
            {
                boolean var85D47280CE4096165FCC5973CDFD8001_836751717 = (a.hasValue(heightAttr));
                {
                    height = a.getLayoutDimension(heightAttr, "layout_height");
                } //End block
                {
                    height = WRAP_CONTENT;
                } //End block
            } //End collapsed parenthetic
            addTaint(a.getTaint());
            addTaint(widthAttr);
            addTaint(heightAttr);
            // ---------- Original Method ----------
            //if (a.hasValue(widthAttr)) {
                //width = a.getLayoutDimension(widthAttr, "layout_width");
            //} else {
                //width = MATCH_PARENT;
            //}
            //if (a.hasValue(heightAttr)) {
                //height = a.getLayoutDimension(heightAttr, "layout_height");
            //} else {
                //height = WRAP_CONTENT;
            //}
        }

        
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.447 -0400", hash_original_field = "012A4B30806EF170D386E0B946E74AA1", hash_generated_field = "E13ED3209622FEE16C7BB9C191FE8F66")

        private static final int LOCATION = 0;
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.447 -0400", hash_original_field = "9CFF123ACE9604E6154FEE9F6F7E0785", hash_generated_field = "934A445C55E10BBDBE903F1BA35DFAF1")

        private static final int LOCATION_NEXT = 1;
    }


    
    private class ChildrenTracker implements OnHierarchyChangeListener {
        @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.447 -0400", hash_original_field = "D0B62CF0CD270BB58374F321620931FF", hash_generated_field = "F5EA6A3A542BD0A280910BBDD59E219A")

        private OnHierarchyChangeListener listener;
        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.447 -0400", hash_original_method = "8BC9074DC1C8352428B8EEF8AE4154F0", hash_generated_method = "8BC9074DC1C8352428B8EEF8AE4154F0")
        public ChildrenTracker ()
        {
            //Synthesized constructor
        }


        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.447 -0400", hash_original_method = "366CDDD217CE23168243D85764F583BC", hash_generated_method = "DDC70C8E2E013ACEDF81D1F8C000792F")
        private void setOnHierarchyChangeListener(OnHierarchyChangeListener listener) {
            this.listener = listener;
            // ---------- Original Method ----------
            //this.listener = listener;
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.448 -0400", hash_original_method = "0A8BC7BCBC1B19A4EC6087AEE2DC9AC1", hash_generated_method = "A9057AE0BAD779E62A4D64B8250E8423")
        public void onChildViewAdded(View parent, View child) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            mColumnToChildIndex = null;
            {
                this.listener.onChildViewAdded(parent, child);
            } //End block
            addTaint(parent.getTaint());
            addTaint(child.getTaint());
            // ---------- Original Method ----------
            //mColumnToChildIndex = null;
            //if (this.listener != null) {
                //this.listener.onChildViewAdded(parent, child);
            //}
        }

        
        @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-06-28 14:14:15.449 -0400", hash_original_method = "BAF37826E19FE7806EA8737E4B16ECFB", hash_generated_method = "464CD24340089F54B5D4A8AE9134C11E")
        public void onChildViewRemoved(View parent, View child) {
            //DSFIXME:  CODE0009: Possible callback target function detected
            mColumnToChildIndex = null;
            {
                this.listener.onChildViewRemoved(parent, child);
            } //End block
            addTaint(parent.getTaint());
            addTaint(child.getTaint());
            // ---------- Original Method ----------
            //mColumnToChildIndex = null;
            //if (this.listener != null) {
                //this.listener.onChildViewRemoved(parent, child);
            //}
        }

        
    }


    
}

