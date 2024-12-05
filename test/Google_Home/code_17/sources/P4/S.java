package p4;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class S extends o0 {

    /* renamed from: b, reason: collision with root package name */
    private final G f37258b;

    /* renamed from: c, reason: collision with root package name */
    private final Q f37259c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f37260d;

    /* renamed from: e, reason: collision with root package name */
    private final B2.b f37261e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(G identifier, Q controller) {
        super(identifier);
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(controller, "controller");
        this.f37258b = identifier;
        this.f37259c = controller;
        this.f37260d = true;
    }

    @Override // p4.o0, p4.k0
    public G a() {
        return this.f37258b;
    }

    @Override // p4.k0
    public B2.b b() {
        return this.f37261e;
    }

    @Override // p4.k0
    public boolean c() {
        return this.f37260d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s8 = (S) obj;
        if (AbstractC3255y.d(this.f37258b, s8.f37258b) && AbstractC3255y.d(this.f37259c, s8.f37259c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f37258b.hashCode() * 31) + this.f37259c.hashCode();
    }

    @Override // p4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Q i() {
        return this.f37259c;
    }

    public String toString() {
        return "PhoneNumberElement(identifier=" + this.f37258b + ", controller=" + this.f37259c + ")";
    }
}
