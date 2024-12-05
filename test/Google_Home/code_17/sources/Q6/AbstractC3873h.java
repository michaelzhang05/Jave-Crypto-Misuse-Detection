package q6;

import O5.AbstractC1349e;
import java.util.Iterator;

/* renamed from: q6.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3873h {
    public static final void a(S5.g gVar, Throwable th) {
        Iterator it = AbstractC3872g.a().iterator();
        while (it.hasNext()) {
            try {
                ((l6.J) it.next()).handleException(gVar, th);
            } catch (Throwable th2) {
                AbstractC3872g.b(l6.K.b(th, th2));
            }
        }
        try {
            AbstractC1349e.a(th, new C3874i(gVar));
        } catch (Throwable unused) {
        }
        AbstractC3872g.b(th);
    }
}
