package L3;

import L3.j;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class k {
    public static final j a(Throwable th) {
        j jVar;
        AbstractC3255y.i(th, "<this>");
        if (th instanceof j) {
            jVar = (j) th;
        } else {
            jVar = null;
        }
        if (jVar == null) {
            return new j.f(th);
        }
        return jVar;
    }
}
