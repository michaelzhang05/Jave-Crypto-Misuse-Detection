package u;

import s.EnumC3702d;
import y.AbstractC3966a;

/* loaded from: classes3.dex */
public abstract class l {
    public static void a(s.f fVar, EnumC3702d enumC3702d) {
        if (fVar instanceof s) {
            u.c().e().u(((s) fVar).d().f(enumC3702d), 1);
        } else {
            AbstractC3966a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", fVar);
        }
    }
}
