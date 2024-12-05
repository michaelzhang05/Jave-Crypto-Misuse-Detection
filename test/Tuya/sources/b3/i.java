package B3;

import L5.p;
import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import q3.w;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;
import z2.C4017a;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f971a = new i();

    private i() {
    }

    private final String b(boolean z8) {
        if (z8) {
            return "https://link.com/terms/ach-authorization";
        }
        if (!z8) {
            return "https://stripe.com/ach-payments/authorization";
        }
        throw new p();
    }

    public final InterfaceC3983b a(String merchantName, boolean z8, boolean z9, boolean z10) {
        AbstractC3159y.i(merchantName, "merchantName");
        List p8 = AbstractC1246t.p(new C4017a("<terms>", "<a href=\"" + b(z9) + "\">"), new C4017a("</terms>", "</a>"));
        if (!z8 && !z10) {
            return AbstractC3984c.d(w.f37467i, new Object[0], p8);
        }
        return AbstractC3984c.d(w.f37469j, new Object[]{merchantName}, p8);
    }
}
