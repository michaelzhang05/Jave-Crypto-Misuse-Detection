package e4;

import M5.AbstractC1246t;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;
import m4.D;
import y2.InterfaceC3983b;

/* renamed from: e4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2601c implements m4.D {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30654a;

    /* renamed from: b, reason: collision with root package name */
    private final m4.r f30655b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30656c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3983b f30657d;

    public C2601c(m4.G identifier, m4.r rVar) {
        AbstractC3159y.i(identifier, "identifier");
        this.f30654a = identifier;
        this.f30655b = rVar;
    }

    @Override // m4.D
    public m4.G a() {
        return this.f30654a;
    }

    @Override // m4.D
    public InterfaceC3983b b() {
        return this.f30657d;
    }

    @Override // m4.D
    public boolean c() {
        return this.f30656c;
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
        if (!(obj instanceof C2601c)) {
            return false;
        }
        C2601c c2601c = (C2601c) obj;
        if (AbstractC3159y.d(this.f30654a, c2601c.f30654a) && AbstractC3159y.d(this.f30655b, c2601c.f30655b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f30654a.hashCode() * 31;
        m4.r rVar = this.f30655b;
        if (rVar == null) {
            hashCode = 0;
        } else {
            hashCode = rVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "AffirmHeaderElement(identifier=" + this.f30654a + ", controller=" + this.f30655b + ")";
    }

    public /* synthetic */ C2601c(m4.G g8, m4.r rVar, int i8, AbstractC3151p abstractC3151p) {
        this(g8, (i8 & 2) != 0 ? null : rVar);
    }
}
