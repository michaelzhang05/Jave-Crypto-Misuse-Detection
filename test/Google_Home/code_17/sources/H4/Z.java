package h4;

import P5.AbstractC1378t;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o6.InterfaceC3698L;
import p4.D;

/* loaded from: classes4.dex */
public final class Z implements p4.D {

    /* renamed from: a, reason: collision with root package name */
    private final p4.G f32549a;

    /* renamed from: b, reason: collision with root package name */
    private final p4.r f32550b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f32551c;

    /* renamed from: d, reason: collision with root package name */
    private final B2.b f32552d;

    public Z(p4.G identifier, p4.r rVar) {
        AbstractC3255y.i(identifier, "identifier");
        this.f32549a = identifier;
        this.f32550b = rVar;
    }

    @Override // p4.D
    public p4.G a() {
        return this.f32549a;
    }

    @Override // p4.D
    public B2.b b() {
        return this.f32552d;
    }

    @Override // p4.D
    public boolean c() {
        return this.f32551c;
    }

    @Override // p4.D
    public InterfaceC3698L d() {
        return y4.g.n(AbstractC1378t.m());
    }

    @Override // p4.D
    public InterfaceC3698L e() {
        return D.a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z8 = (Z) obj;
        if (AbstractC3255y.d(this.f32549a, z8.f32549a) && AbstractC3255y.d(this.f32550b, z8.f32550b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f32549a.hashCode() * 31;
        p4.r rVar = this.f32550b;
        if (rVar == null) {
            hashCode = 0;
        } else {
            hashCode = rVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "EmptyFormElement(identifier=" + this.f32549a + ", controller=" + this.f32550b + ")";
    }

    public /* synthetic */ Z(p4.G g8, p4.r rVar, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? p4.G.Companion.a("empty_form") : g8, (i8 & 2) != 0 ? null : rVar);
    }
}
