package e4;

import M5.AbstractC1246t;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;
import m4.D;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class Z implements m4.D {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30628a;

    /* renamed from: b, reason: collision with root package name */
    private final m4.r f30629b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30630c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3983b f30631d;

    public Z(m4.G identifier, m4.r rVar) {
        AbstractC3159y.i(identifier, "identifier");
        this.f30628a = identifier;
        this.f30629b = rVar;
    }

    @Override // m4.D
    public m4.G a() {
        return this.f30628a;
    }

    @Override // m4.D
    public InterfaceC3983b b() {
        return this.f30631d;
    }

    @Override // m4.D
    public boolean c() {
        return this.f30630c;
    }

    @Override // m4.D
    public InterfaceC3349K d() {
        return v4.g.n(AbstractC1246t.m());
    }

    @Override // m4.D
    public InterfaceC3349K e() {
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
        if (AbstractC3159y.d(this.f30628a, z8.f30628a) && AbstractC3159y.d(this.f30629b, z8.f30629b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f30628a.hashCode() * 31;
        m4.r rVar = this.f30629b;
        if (rVar == null) {
            hashCode = 0;
        } else {
            hashCode = rVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "EmptyFormElement(identifier=" + this.f30628a + ", controller=" + this.f30629b + ")";
    }

    public /* synthetic */ Z(m4.G g8, m4.r rVar, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? m4.G.Companion.a("empty_form") : g8, (i8 & 2) != 0 ? null : rVar);
    }
}
