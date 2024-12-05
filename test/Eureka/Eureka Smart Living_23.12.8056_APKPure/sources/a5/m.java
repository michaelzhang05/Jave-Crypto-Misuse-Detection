package a5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class m {
    public static final Object[] a(Object[] objArr, boolean z5) {
        f5.h.e(objArr, "<this>");
        if (z5 && f5.h.a(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        f5.h.d(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public static List b(Object obj) {
        List singletonList = Collections.singletonList(obj);
        f5.h.d(singletonList, "singletonList(element)");
        return singletonList;
    }
}
