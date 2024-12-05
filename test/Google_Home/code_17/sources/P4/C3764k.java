package p4;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: p4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3764k extends o0 {

    /* renamed from: b, reason: collision with root package name */
    private final G f37600b;

    /* renamed from: c, reason: collision with root package name */
    private final C3777y f37601c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f37602d;

    /* renamed from: e, reason: collision with root package name */
    private final B2.b f37603e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3764k(G identifier, C3777y controller) {
        super(identifier);
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(controller, "controller");
        this.f37600b = identifier;
        this.f37601c = controller;
        this.f37602d = true;
    }

    @Override // p4.o0, p4.k0
    public G a() {
        return this.f37600b;
    }

    @Override // p4.k0
    public B2.b b() {
        return this.f37603e;
    }

    @Override // p4.k0
    public boolean c() {
        return this.f37602d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3764k)) {
            return false;
        }
        C3764k c3764k = (C3764k) obj;
        if (AbstractC3255y.d(this.f37600b, c3764k.f37600b) && AbstractC3255y.d(this.f37601c, c3764k.f37601c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f37600b.hashCode() * 31) + this.f37601c.hashCode();
    }

    @Override // p4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3777y i() {
        return this.f37601c;
    }

    public String toString() {
        return "AdministrativeAreaElement(identifier=" + this.f37600b + ", controller=" + this.f37601c + ")";
    }
}
