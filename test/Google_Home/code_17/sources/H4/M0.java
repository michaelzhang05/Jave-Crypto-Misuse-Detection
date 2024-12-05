package h4;

import P5.AbstractC1378t;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o6.InterfaceC3698L;
import p4.D;

/* loaded from: classes4.dex */
public final class M0 implements p4.D {

    /* renamed from: a, reason: collision with root package name */
    private final p4.G f32370a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32371b;

    /* renamed from: c, reason: collision with root package name */
    private final p4.H f32372c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32373d;

    /* renamed from: e, reason: collision with root package name */
    private final B2.b f32374e;

    public M0(p4.G identifier, int i8, p4.H h8) {
        AbstractC3255y.i(identifier, "identifier");
        this.f32370a = identifier;
        this.f32371b = i8;
        this.f32372c = h8;
    }

    @Override // p4.D
    public p4.G a() {
        return this.f32370a;
    }

    @Override // p4.D
    public B2.b b() {
        return this.f32374e;
    }

    @Override // p4.D
    public boolean c() {
        return this.f32373d;
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
        if (!(obj instanceof M0)) {
            return false;
        }
        M0 m02 = (M0) obj;
        if (AbstractC3255y.d(this.f32370a, m02.f32370a) && this.f32371b == m02.f32371b && AbstractC3255y.d(this.f32372c, m02.f32372c)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f32371b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f32370a.hashCode() * 31) + this.f32371b) * 31;
        p4.H h8 = this.f32372c;
        if (h8 == null) {
            hashCode = 0;
        } else {
            hashCode = h8.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "StaticTextElement(identifier=" + this.f32370a + ", stringResId=" + this.f32371b + ", controller=" + this.f32372c + ")";
    }

    public /* synthetic */ M0(p4.G g8, int i8, p4.H h8, int i9, AbstractC3247p abstractC3247p) {
        this(g8, i8, (i9 & 4) != 0 ? null : h8);
    }
}
