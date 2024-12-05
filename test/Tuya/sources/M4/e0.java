package m4;

import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class e0 extends o0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f35448f = 8;

    /* renamed from: b, reason: collision with root package name */
    private final G f35449b;

    /* renamed from: c, reason: collision with root package name */
    private final d0 f35450c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f35451d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f35452e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(G identifier, d0 controller) {
        super(identifier);
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(controller, "controller");
        this.f35449b = identifier;
        this.f35450c = controller;
        this.f35451d = true;
    }

    @Override // m4.o0, m4.k0
    public G a() {
        return this.f35449b;
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f35452e;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f35451d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (AbstractC3159y.d(this.f35449b, e0Var.f35449b) && AbstractC3159y.d(this.f35450c, e0Var.f35450c)) {
            return true;
        }
        return false;
    }

    @Override // m4.o0, m4.k0
    public boolean g() {
        return true;
    }

    @Override // m4.o0, m4.k0
    public void h(Map rawValuesMap) {
        AbstractC3159y.i(rawValuesMap, "rawValuesMap");
        String str = (String) rawValuesMap.get(a());
        if (str != null) {
            i().r(str);
        }
    }

    public int hashCode() {
        return (this.f35449b.hashCode() * 31) + this.f35450c.hashCode();
    }

    @Override // m4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public d0 i() {
        return this.f35450c;
    }

    public String toString() {
        return "SameAsShippingElement(identifier=" + this.f35449b + ", controller=" + this.f35450c + ")";
    }
}
