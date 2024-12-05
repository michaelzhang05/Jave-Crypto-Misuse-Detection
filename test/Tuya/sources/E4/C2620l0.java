package e4;

import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* renamed from: e4.l0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2620l0 extends m4.o0 {

    /* renamed from: b, reason: collision with root package name */
    private final m4.G f30740b;

    /* renamed from: c, reason: collision with root package name */
    private final m4.w0 f30741c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30742d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f30743e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2620l0(m4.G identifier, m4.w0 controller) {
        super(identifier);
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(controller, "controller");
        this.f30740b = identifier;
        this.f30741c = controller;
        this.f30742d = true;
    }

    @Override // m4.o0, m4.k0
    public m4.G a() {
        return this.f30740b;
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f30743e;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f30742d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2620l0)) {
            return false;
        }
        C2620l0 c2620l0 = (C2620l0) obj;
        if (AbstractC3159y.d(this.f30740b, c2620l0.f30740b) && AbstractC3159y.d(this.f30741c, c2620l0.f30741c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f30740b.hashCode() * 31) + this.f30741c.hashCode();
    }

    @Override // m4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public m4.w0 i() {
        return this.f30741c;
    }

    public String toString() {
        return "IbanElement(identifier=" + this.f30740b + ", controller=" + this.f30741c + ")";
    }
}
