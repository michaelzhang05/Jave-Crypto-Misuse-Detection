package a5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class j extends i {
    public static final boolean f(Object[] objArr, Object obj) {
        f5.h.e(objArr, "<this>");
        return j(objArr, obj) >= 0;
    }

    public static List g(Object[] objArr) {
        f5.h.e(objArr, "<this>");
        return (List) h(objArr, new ArrayList());
    }

    public static final Collection h(Object[] objArr, Collection collection) {
        f5.h.e(objArr, "<this>");
        f5.h.e(collection, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    public static final int i(Object[] objArr) {
        f5.h.e(objArr, "<this>");
        return objArr.length - 1;
    }

    public static final int j(Object[] objArr, Object obj) {
        f5.h.e(objArr, "<this>");
        int i6 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i6 < length) {
                if (objArr[i6] == null) {
                    return i6;
                }
                i6++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i6 < length2) {
            if (f5.h.a(obj, objArr[i6])) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public static char k(char[] cArr) {
        f5.h.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static List l(Object[] objArr) {
        List d6;
        List b6;
        f5.h.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            d6 = n.d();
            return d6;
        }
        if (length != 1) {
            return m(objArr);
        }
        b6 = m.b(objArr[0]);
        return b6;
    }

    public static final List m(Object[] objArr) {
        f5.h.e(objArr, "<this>");
        return new ArrayList(n.c(objArr));
    }
}
