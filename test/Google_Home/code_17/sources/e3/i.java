package E3;

import O5.p;
import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import t3.w;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f2566a = new i();

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

    public final B2.b a(String merchantName, boolean z8, boolean z9, boolean z10) {
        AbstractC3255y.i(merchantName, "merchantName");
        List p8 = AbstractC1378t.p(new C2.a("<terms>", "<a href=\"" + b(z9) + "\">"), new C2.a("</terms>", "</a>"));
        if (!z8 && !z10) {
            return B2.c.d(w.f39789i, new Object[0], p8);
        }
        return B2.c.d(w.f39791j, new Object[]{merchantName}, p8);
    }
}
