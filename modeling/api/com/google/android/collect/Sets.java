package com.google.android.collect;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sets {
    
    public static <K> HashSet<K> newHashSet() {
        return new HashSet<K>();
    }
    
    public static <E> HashSet<E> newHashSet(E... elements) {
        int capacity = elements.length * 4 / 3 + 1;
        HashSet<E> set = new HashSet<E>(capacity);
        Collections.addAll(set, elements);
        return set;
    }
    
    public static <E> SortedSet<E> newSortedSet() {
        return new TreeSet<E>();
    }
    
    public static <E> SortedSet<E> newSortedSet(E... elements) {
        SortedSet<E> set = new TreeSet<E>();
        Collections.addAll(set, elements);
        return set;
    }
    
    @DSSafe(DSCat.SAFE_OTHERS)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:24:29.491 -0400", hash_original_method = "CE24FF7C45F6DB60D6991058AB32CAAF", hash_generated_method = "CE24FF7C45F6DB60D6991058AB32CAAF")
    public Sets ()
    {
        //Synthesized constructor
    }
    
}
