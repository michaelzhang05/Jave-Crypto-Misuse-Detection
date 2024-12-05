package P5;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class c0 extends b0 {
    public static Set f() {
        return I.f8837a;
    }

    public static Set g(Object... elements) {
        AbstractC3255y.i(elements, "elements");
        return (Set) AbstractC1375p.T0(elements, new LinkedHashSet(Q.d(elements.length)));
    }

    public static final Set h(Set set) {
        AbstractC3255y.i(set, "<this>");
        int size = set.size();
        if (size != 0) {
            if (size == 1) {
                return a0.d(set.iterator().next());
            }
            return set;
        }
        return a0.f();
    }

    public static Set i(Object... elements) {
        AbstractC3255y.i(elements, "elements");
        if (elements.length > 0) {
            return AbstractC1375p.a1(elements);
        }
        return a0.f();
    }

    public static Set j(Object obj) {
        if (obj != null) {
            return a0.d(obj);
        }
        return a0.f();
    }

    public static Set k(Object... elements) {
        AbstractC3255y.i(elements, "elements");
        return (Set) AbstractC1375p.a0(elements, new LinkedHashSet());
    }
}
