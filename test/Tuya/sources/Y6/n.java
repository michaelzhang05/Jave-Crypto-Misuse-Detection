package y6;

import kotlin.jvm.internal.AbstractC3159y;
import z6.M;

/* loaded from: classes5.dex */
final class n extends AbstractC3999a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C4004f configuration, A6.b module) {
        super(configuration, module, null);
        AbstractC3159y.i(configuration, "configuration");
        AbstractC3159y.i(module, "module");
        g();
    }

    private final void g() {
        if (AbstractC3159y.d(e(), A6.c.a())) {
            return;
        }
        e().a(new M(d().n(), d().d()));
    }
}
