package S2;

import S2.b;
import j2.AbstractC3053E;
import kotlin.jvm.internal.AbstractC3159y;
import t2.C3780a;

/* loaded from: classes4.dex */
public abstract class c {
    public static final b a(Throwable th) {
        AbstractC3159y.i(th, "<this>");
        if (th instanceof C3780a) {
            return new b.a(AbstractC3053E.f32893m0);
        }
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage != null) {
            return new b.C0185b(localizedMessage);
        }
        return new b.a(AbstractC3053E.f32905s0);
    }
}
