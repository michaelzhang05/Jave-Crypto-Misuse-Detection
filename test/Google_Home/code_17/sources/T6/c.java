package T6;

import P5.C1370k;
import S6.AbstractC1423k;
import S6.Q;
import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class c {
    public static final void a(AbstractC1423k abstractC1423k, Q dir, boolean z8) {
        AbstractC3255y.i(abstractC1423k, "<this>");
        AbstractC3255y.i(dir, "dir");
        C1370k c1370k = new C1370k();
        for (Q q8 = dir; q8 != null && !abstractC1423k.g(q8); q8 = q8.i()) {
            c1370k.c(q8);
        }
        if (z8 && c1370k.isEmpty()) {
            throw new IOException(dir + " already exist.");
        }
        Iterator<E> it = c1370k.iterator();
        while (it.hasNext()) {
            abstractC1423k.c((Q) it.next());
        }
    }

    public static final boolean b(AbstractC1423k abstractC1423k, Q path) {
        AbstractC3255y.i(abstractC1423k, "<this>");
        AbstractC3255y.i(path, "path");
        if (abstractC1423k.h(path) != null) {
            return true;
        }
        return false;
    }
}
