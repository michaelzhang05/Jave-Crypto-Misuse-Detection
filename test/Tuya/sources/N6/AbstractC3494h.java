package n6;

import L5.AbstractC1221e;
import java.util.Iterator;

/* renamed from: n6.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3494h {
    public static final void a(P5.g gVar, Throwable th) {
        Iterator it = AbstractC3493g.a().iterator();
        while (it.hasNext()) {
            try {
                ((i6.J) it.next()).handleException(gVar, th);
            } catch (Throwable th2) {
                AbstractC3493g.b(i6.K.b(th, th2));
            }
        }
        try {
            AbstractC1221e.a(th, new C3495i(gVar));
        } catch (Throwable unused) {
        }
        AbstractC3493g.b(th);
    }
}
