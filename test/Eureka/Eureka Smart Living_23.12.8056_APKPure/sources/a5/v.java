package a5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class v extends u {
    public static boolean i(Iterable iterable, Object obj) {
        f5.h.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : j(iterable, obj) >= 0;
    }

    public static final int j(Iterable iterable, Object obj) {
        f5.h.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i6 = 0;
        for (Object obj2 : iterable) {
            if (i6 < 0) {
                n.g();
            }
            if (f5.h.a(obj, obj2)) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public static List k(Iterable iterable, Iterable iterable2) {
        int h6;
        int h7;
        f5.h.e(iterable, "<this>");
        f5.h.e(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        h6 = o.h(iterable, 10);
        h7 = o.h(iterable2, 10);
        ArrayList arrayList = new ArrayList(Math.min(h6, h7));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(z4.i.a(it.next(), it2.next()));
        }
        return arrayList;
    }
}
