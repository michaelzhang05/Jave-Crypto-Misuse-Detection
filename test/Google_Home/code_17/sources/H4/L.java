package h4;

import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class L extends p4.o0 {

    /* renamed from: b, reason: collision with root package name */
    private final p4.G f32353b;

    /* renamed from: c, reason: collision with root package name */
    private final K f32354c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32355d;

    /* renamed from: e, reason: collision with root package name */
    private final B2.b f32356e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(p4.G _identifier, K controller) {
        super(_identifier);
        AbstractC3255y.i(_identifier, "_identifier");
        AbstractC3255y.i(controller, "controller");
        this.f32353b = _identifier;
        this.f32354c = controller;
        this.f32355d = true;
    }

    @Override // p4.k0
    public B2.b b() {
        return this.f32356e;
    }

    @Override // p4.k0
    public boolean c() {
        return this.f32355d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l8 = (L) obj;
        if (AbstractC3255y.d(this.f32353b, l8.f32353b) && AbstractC3255y.d(this.f32354c, l8.f32354c)) {
            return true;
        }
        return false;
    }

    @Override // p4.o0, p4.k0
    public void h(Map rawValuesMap) {
        AbstractC3255y.i(rawValuesMap, "rawValuesMap");
    }

    public int hashCode() {
        return (this.f32353b.hashCode() * 31) + this.f32354c.hashCode();
    }

    @Override // p4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public K i() {
        return this.f32354c;
    }

    public String toString() {
        return "CardNumberElement(_identifier=" + this.f32353b + ", controller=" + this.f32354c + ")";
    }
}
