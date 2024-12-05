package p4;

import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class e0 extends o0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f37474f = 8;

    /* renamed from: b, reason: collision with root package name */
    private final G f37475b;

    /* renamed from: c, reason: collision with root package name */
    private final d0 f37476c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f37477d;

    /* renamed from: e, reason: collision with root package name */
    private final B2.b f37478e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(G identifier, d0 controller) {
        super(identifier);
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(controller, "controller");
        this.f37475b = identifier;
        this.f37476c = controller;
        this.f37477d = true;
    }

    @Override // p4.o0, p4.k0
    public G a() {
        return this.f37475b;
    }

    @Override // p4.k0
    public B2.b b() {
        return this.f37478e;
    }

    @Override // p4.k0
    public boolean c() {
        return this.f37477d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (AbstractC3255y.d(this.f37475b, e0Var.f37475b) && AbstractC3255y.d(this.f37476c, e0Var.f37476c)) {
            return true;
        }
        return false;
    }

    @Override // p4.o0, p4.k0
    public boolean g() {
        return true;
    }

    @Override // p4.o0, p4.k0
    public void h(Map rawValuesMap) {
        AbstractC3255y.i(rawValuesMap, "rawValuesMap");
        String str = (String) rawValuesMap.get(a());
        if (str != null) {
            i().r(str);
        }
    }

    public int hashCode() {
        return (this.f37475b.hashCode() * 31) + this.f37476c.hashCode();
    }

    @Override // p4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public d0 i() {
        return this.f37476c;
    }

    public String toString() {
        return "SameAsShippingElement(identifier=" + this.f37475b + ", controller=" + this.f37476c + ")";
    }
}
