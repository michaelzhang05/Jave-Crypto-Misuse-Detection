package P5;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class d0 extends c0 {
    public static Set l(Set set, Object obj) {
        AbstractC3255y.i(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(Q.d(set.size()));
        boolean z8 = false;
        for (Object obj2 : set) {
            boolean z9 = true;
            if (!z8 && AbstractC3255y.d(obj2, obj)) {
                z8 = true;
                z9 = false;
            }
            if (z9) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set m(Set set, Iterable elements) {
        int size;
        AbstractC3255y.i(set, "<this>");
        AbstractC3255y.i(elements, "elements");
        Integer y8 = AbstractC1381w.y(elements);
        if (y8 != null) {
            size = set.size() + y8.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(Q.d(size));
        linkedHashSet.addAll(set);
        AbstractC1378t.D(linkedHashSet, elements);
        return linkedHashSet;
    }

    public static Set n(Set set, Object obj) {
        AbstractC3255y.i(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(Q.d(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
