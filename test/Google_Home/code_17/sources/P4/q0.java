package p4;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class q0 extends o0 {

    /* renamed from: b, reason: collision with root package name */
    private final G f37699b;

    /* renamed from: c, reason: collision with root package name */
    private final w0 f37700c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f37701d;

    /* renamed from: e, reason: collision with root package name */
    private final B2.b f37702e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(G identifier, w0 controller) {
        super(identifier);
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(controller, "controller");
        this.f37699b = identifier;
        this.f37700c = controller;
        this.f37701d = true;
    }

    @Override // p4.o0, p4.k0
    public G a() {
        return this.f37699b;
    }

    @Override // p4.k0
    public B2.b b() {
        return this.f37702e;
    }

    @Override // p4.k0
    public boolean c() {
        return this.f37701d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (AbstractC3255y.d(this.f37699b, q0Var.f37699b) && AbstractC3255y.d(this.f37700c, q0Var.f37700c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f37699b.hashCode() * 31) + this.f37700c.hashCode();
    }

    @Override // p4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public w0 i() {
        return this.f37700c;
    }

    public String toString() {
        return "SimpleTextElement(identifier=" + this.f37699b + ", controller=" + this.f37700c + ")";
    }
}
