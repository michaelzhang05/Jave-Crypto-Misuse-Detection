package e4;

import kotlin.jvm.internal.AbstractC3159y;
import m4.C3434y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class K0 extends m4.o0 {

    /* renamed from: b, reason: collision with root package name */
    private final m4.G f30428b;

    /* renamed from: c, reason: collision with root package name */
    private final C3434y f30429c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30430d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f30431e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(m4.G identifier, C3434y controller) {
        super(identifier);
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(controller, "controller");
        this.f30428b = identifier;
        this.f30429c = controller;
        this.f30430d = true;
    }

    @Override // m4.o0, m4.k0
    public m4.G a() {
        return this.f30428b;
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f30431e;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f30430d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        K0 k02 = (K0) obj;
        if (AbstractC3159y.d(this.f30428b, k02.f30428b) && AbstractC3159y.d(this.f30429c, k02.f30429c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f30428b.hashCode() * 31) + this.f30429c.hashCode();
    }

    @Override // m4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3434y i() {
        return this.f30429c;
    }

    public String toString() {
        return "SimpleDropdownElement(identifier=" + this.f30428b + ", controller=" + this.f30429c + ")";
    }
}
