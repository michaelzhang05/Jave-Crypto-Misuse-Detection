package V2;

import V2.b;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3407E;
import w2.C4134a;

/* loaded from: classes4.dex */
public abstract class c {
    public static final b a(Throwable th) {
        AbstractC3255y.i(th, "<this>");
        if (th instanceof C4134a) {
            return new b.a(AbstractC3407E.f34869m0);
        }
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage != null) {
            return new b.C0210b(localizedMessage);
        }
        return new b.a(AbstractC3407E.f34881s0);
    }
}
