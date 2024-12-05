package M5;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class c0 extends b0 {
    public static Set f() {
        return I.f7013a;
    }

    public static Set g(Object... elements) {
        AbstractC3159y.i(elements, "elements");
        return (Set) AbstractC1243p.T0(elements, new LinkedHashSet(Q.d(elements.length)));
    }

    public static final Set h(Set set) {
        AbstractC3159y.i(set, "<this>");
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
        AbstractC3159y.i(elements, "elements");
        if (elements.length > 0) {
            return AbstractC1243p.a1(elements);
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
        AbstractC3159y.i(elements, "elements");
        return (Set) AbstractC1243p.a0(elements, new LinkedHashSet());
    }
}
