package h4;

import kotlin.jvm.internal.AbstractC3255y;
import p4.C3777y;

/* loaded from: classes4.dex */
public final class K0 extends p4.o0 {

    /* renamed from: b, reason: collision with root package name */
    private final p4.G f32349b;

    /* renamed from: c, reason: collision with root package name */
    private final C3777y f32350c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32351d;

    /* renamed from: e, reason: collision with root package name */
    private final B2.b f32352e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(p4.G identifier, C3777y controller) {
        super(identifier);
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(controller, "controller");
        this.f32349b = identifier;
        this.f32350c = controller;
        this.f32351d = true;
    }

    @Override // p4.o0, p4.k0
    public p4.G a() {
        return this.f32349b;
    }

    @Override // p4.k0
    public B2.b b() {
        return this.f32352e;
    }

    @Override // p4.k0
    public boolean c() {
        return this.f32351d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        K0 k02 = (K0) obj;
        if (AbstractC3255y.d(this.f32349b, k02.f32349b) && AbstractC3255y.d(this.f32350c, k02.f32350c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f32349b.hashCode() * 31) + this.f32350c.hashCode();
    }

    @Override // p4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3777y i() {
        return this.f32350c;
    }

    public String toString() {
        return "SimpleDropdownElement(identifier=" + this.f32349b + ", controller=" + this.f32350c + ")";
    }
}
