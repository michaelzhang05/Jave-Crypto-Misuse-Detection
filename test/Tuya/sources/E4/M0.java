package e4;

import M5.AbstractC1246t;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;
import m4.D;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class M0 implements m4.D {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30449a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30450b;

    /* renamed from: c, reason: collision with root package name */
    private final m4.H f30451c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30452d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f30453e;

    public M0(m4.G identifier, int i8, m4.H h8) {
        AbstractC3159y.i(identifier, "identifier");
        this.f30449a = identifier;
        this.f30450b = i8;
        this.f30451c = h8;
    }

    @Override // m4.D
    public m4.G a() {
        return this.f30449a;
    }

    @Override // m4.D
    public InterfaceC3983b b() {
        return this.f30453e;
    }

    @Override // m4.D
    public boolean c() {
        return this.f30452d;
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
        if (!(obj instanceof M0)) {
            return false;
        }
        M0 m02 = (M0) obj;
        if (AbstractC3159y.d(this.f30449a, m02.f30449a) && this.f30450b == m02.f30450b && AbstractC3159y.d(this.f30451c, m02.f30451c)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f30450b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f30449a.hashCode() * 31) + this.f30450b) * 31;
        m4.H h8 = this.f30451c;
        if (h8 == null) {
            hashCode = 0;
        } else {
            hashCode = h8.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "StaticTextElement(identifier=" + this.f30449a + ", stringResId=" + this.f30450b + ", controller=" + this.f30451c + ")";
    }

    public /* synthetic */ M0(m4.G g8, int i8, m4.H h8, int i9, AbstractC3151p abstractC3151p) {
        this(g8, i8, (i9 & 4) != 0 ? null : h8);
    }
}
