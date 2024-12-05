package E3;

import b3.EnumC1870e;
import e4.P;
import j2.AbstractC3053E;
import kotlin.jvm.internal.AbstractC3159y;
import m4.x0;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final String f1989a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC1870e f1990b;

    /* renamed from: c, reason: collision with root package name */
    private final P f1991c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1992d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1993e;

    /* renamed from: f, reason: collision with root package name */
    private final x0.c f1994f;

    public g(String cvc, EnumC1870e cardBrand) {
        int i8;
        AbstractC3159y.i(cvc, "cvc");
        AbstractC3159y.i(cardBrand, "cardBrand");
        this.f1989a = cvc;
        this.f1990b = cardBrand;
        P p8 = new P();
        this.f1991c = p8;
        this.f1992d = p8.c(cardBrand, cvc, cardBrand.m()).a();
        if (cardBrand == EnumC1870e.f14440q) {
            i8 = AbstractC3053E.f32871b0;
        } else {
            i8 = AbstractC3053E.f32877e0;
        }
        this.f1993e = i8;
        this.f1994f = new x0.c(cardBrand.g(), null, false, null, 10, null);
    }

    public final EnumC1870e a() {
        return this.f1990b;
    }

    public final String b() {
        return this.f1989a;
    }

    public final x0.c c() {
        return this.f1994f;
    }

    public final int d() {
        return this.f1993e;
    }

    public final boolean e() {
        return this.f1992d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3159y.d(this.f1989a, gVar.f1989a) && this.f1990b == gVar.f1990b) {
            return true;
        }
        return false;
    }

    public final g f(String cvc) {
        AbstractC3159y.i(cvc, "cvc");
        if (cvc.length() > this.f1990b.m()) {
            return this;
        }
        return new g(cvc, this.f1990b);
    }

    public int hashCode() {
        return (this.f1989a.hashCode() * 31) + this.f1990b.hashCode();
    }

    public String toString() {
        return "CvcState(cvc=" + this.f1989a + ", cardBrand=" + this.f1990b + ")";
    }
}
