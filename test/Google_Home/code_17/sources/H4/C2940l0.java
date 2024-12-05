package h4;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: h4.l0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2940l0 extends p4.o0 {

    /* renamed from: b, reason: collision with root package name */
    private final p4.G f32661b;

    /* renamed from: c, reason: collision with root package name */
    private final p4.w0 f32662c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32663d;

    /* renamed from: e, reason: collision with root package name */
    private final B2.b f32664e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2940l0(p4.G identifier, p4.w0 controller) {
        super(identifier);
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(controller, "controller");
        this.f32661b = identifier;
        this.f32662c = controller;
        this.f32663d = true;
    }

    @Override // p4.o0, p4.k0
    public p4.G a() {
        return this.f32661b;
    }

    @Override // p4.k0
    public B2.b b() {
        return this.f32664e;
    }

    @Override // p4.k0
    public boolean c() {
        return this.f32663d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2940l0)) {
            return false;
        }
        C2940l0 c2940l0 = (C2940l0) obj;
        if (AbstractC3255y.d(this.f32661b, c2940l0.f32661b) && AbstractC3255y.d(this.f32662c, c2940l0.f32662c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f32661b.hashCode() * 31) + this.f32662c.hashCode();
    }

    @Override // p4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public p4.w0 i() {
        return this.f32662c;
    }

    public String toString() {
        return "IbanElement(identifier=" + this.f32661b + ", controller=" + this.f32662c + ")";
    }
}
