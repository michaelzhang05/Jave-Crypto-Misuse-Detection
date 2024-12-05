package h4;

import P5.AbstractC1378t;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o6.InterfaceC3698L;
import p4.D;

/* renamed from: h4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2921c implements p4.D {

    /* renamed from: a, reason: collision with root package name */
    private final p4.G f32575a;

    /* renamed from: b, reason: collision with root package name */
    private final p4.r f32576b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f32577c;

    /* renamed from: d, reason: collision with root package name */
    private final B2.b f32578d;

    public C2921c(p4.G identifier, p4.r rVar) {
        AbstractC3255y.i(identifier, "identifier");
        this.f32575a = identifier;
        this.f32576b = rVar;
    }

    @Override // p4.D
    public p4.G a() {
        return this.f32575a;
    }

    @Override // p4.D
    public B2.b b() {
        return this.f32578d;
    }

    @Override // p4.D
    public boolean c() {
        return this.f32577c;
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
        if (!(obj instanceof C2921c)) {
            return false;
        }
        C2921c c2921c = (C2921c) obj;
        if (AbstractC3255y.d(this.f32575a, c2921c.f32575a) && AbstractC3255y.d(this.f32576b, c2921c.f32576b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f32575a.hashCode() * 31;
        p4.r rVar = this.f32576b;
        if (rVar == null) {
            hashCode = 0;
        } else {
            hashCode = rVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "AffirmHeaderElement(identifier=" + this.f32575a + ", controller=" + this.f32576b + ")";
    }

    public /* synthetic */ C2921c(p4.G g8, p4.r rVar, int i8, AbstractC3247p abstractC3247p) {
        this(g8, (i8 & 2) != 0 ? null : rVar);
    }
}
