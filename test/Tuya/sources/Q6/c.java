package Q6;

import M5.C1238k;
import P6.AbstractC1285k;
import P6.Q;
import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class c {
    public static final void a(AbstractC1285k abstractC1285k, Q dir, boolean z8) {
        AbstractC3159y.i(abstractC1285k, "<this>");
        AbstractC3159y.i(dir, "dir");
        C1238k c1238k = new C1238k();
        for (Q q8 = dir; q8 != null && !abstractC1285k.g(q8); q8 = q8.i()) {
            c1238k.a(q8);
        }
        if (z8 && c1238k.isEmpty()) {
            throw new IOException(dir + " already exist.");
        }
        Iterator<E> it = c1238k.iterator();
        while (it.hasNext()) {
            abstractC1285k.c((Q) it.next());
        }
    }

    public static final boolean b(AbstractC1285k abstractC1285k, Q path) {
        AbstractC3159y.i(abstractC1285k, "<this>");
        AbstractC3159y.i(path, "path");
        if (abstractC1285k.h(path) != null) {
            return true;
        }
        return false;
    }
}
