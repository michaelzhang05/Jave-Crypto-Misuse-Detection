package B6;

import C6.M;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
final class n extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(f configuration, D6.b module) {
        super(configuration, module, null);
        AbstractC3255y.i(configuration, "configuration");
        AbstractC3255y.i(module, "module");
        g();
    }

    private final void g() {
        if (AbstractC3255y.d(e(), D6.c.a())) {
            return;
        }
        e().a(new M(d().n(), d().d()));
    }
}
