package H3;

import e3.EnumC2791e;
import h4.P;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3407E;
import p4.x0;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f3539a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC2791e f3540b;

    /* renamed from: c, reason: collision with root package name */
    private final P f3541c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f3542d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3543e;

    /* renamed from: f, reason: collision with root package name */
    private final x0.c f3544f;

    public g(String cvc, EnumC2791e cardBrand) {
        int i8;
        AbstractC3255y.i(cvc, "cvc");
        AbstractC3255y.i(cardBrand, "cardBrand");
        this.f3539a = cvc;
        this.f3540b = cardBrand;
        P p8 = new P();
        this.f3541c = p8;
        this.f3542d = p8.c(cardBrand, cvc, cardBrand.m()).a();
        if (cardBrand == EnumC2791e.f31446q) {
            i8 = AbstractC3407E.f34847b0;
        } else {
            i8 = AbstractC3407E.f34853e0;
        }
        this.f3543e = i8;
        this.f3544f = new x0.c(cardBrand.g(), null, false, null, 10, null);
    }

    public final EnumC2791e a() {
        return this.f3540b;
    }

    public final String b() {
        return this.f3539a;
    }

    public final x0.c c() {
        return this.f3544f;
    }

    public final int d() {
        return this.f3543e;
    }

    public final boolean e() {
        return this.f3542d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3255y.d(this.f3539a, gVar.f3539a) && this.f3540b == gVar.f3540b) {
            return true;
        }
        return false;
    }

    public final g f(String cvc) {
        AbstractC3255y.i(cvc, "cvc");
        if (cvc.length() > this.f3540b.m()) {
            return this;
        }
        return new g(cvc, this.f3540b);
    }

    public int hashCode() {
        return (this.f3539a.hashCode() * 31) + this.f3540b.hashCode();
    }

    public String toString() {
        return "CvcState(cvc=" + this.f3539a + ", cardBrand=" + this.f3540b + ")";
    }
}
