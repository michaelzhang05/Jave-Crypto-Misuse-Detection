package p4;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: p4.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3773u extends o0 {

    /* renamed from: b, reason: collision with root package name */
    private final G f37754b;

    /* renamed from: c, reason: collision with root package name */
    private final C3777y f37755c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f37756d;

    /* renamed from: e, reason: collision with root package name */
    private final B2.b f37757e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3773u(G identifier, C3777y controller) {
        super(identifier);
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(controller, "controller");
        this.f37754b = identifier;
        this.f37755c = controller;
        this.f37756d = true;
    }

    @Override // p4.o0, p4.k0
    public G a() {
        return this.f37754b;
    }

    @Override // p4.k0
    public B2.b b() {
        return this.f37757e;
    }

    @Override // p4.k0
    public boolean c() {
        return this.f37756d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3773u)) {
            return false;
        }
        C3773u c3773u = (C3773u) obj;
        if (AbstractC3255y.d(this.f37754b, c3773u.f37754b) && AbstractC3255y.d(this.f37755c, c3773u.f37755c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f37754b.hashCode() * 31) + this.f37755c.hashCode();
    }

    @Override // p4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3777y i() {
        return this.f37755c;
    }

    public String toString() {
        return "CountryElement(identifier=" + this.f37754b + ", controller=" + this.f37755c + ")";
    }
}
