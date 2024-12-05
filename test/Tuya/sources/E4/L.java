package e4;

import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class L extends m4.o0 {

    /* renamed from: b, reason: collision with root package name */
    private final m4.G f30432b;

    /* renamed from: c, reason: collision with root package name */
    private final K f30433c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f30434d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3983b f30435e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(m4.G _identifier, K controller) {
        super(_identifier);
        AbstractC3159y.i(_identifier, "_identifier");
        AbstractC3159y.i(controller, "controller");
        this.f30432b = _identifier;
        this.f30433c = controller;
        this.f30434d = true;
    }

    @Override // m4.k0
    public InterfaceC3983b b() {
        return this.f30435e;
    }

    @Override // m4.k0
    public boolean c() {
        return this.f30434d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l8 = (L) obj;
        if (AbstractC3159y.d(this.f30432b, l8.f30432b) && AbstractC3159y.d(this.f30433c, l8.f30433c)) {
            return true;
        }
        return false;
    }

    @Override // m4.o0, m4.k0
    public void h(Map rawValuesMap) {
        AbstractC3159y.i(rawValuesMap, "rawValuesMap");
    }

    public int hashCode() {
        return (this.f30432b.hashCode() * 31) + this.f30433c.hashCode();
    }

    @Override // m4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public K i() {
        return this.f30433c;
    }

    public String toString() {
        return "CardNumberElement(_identifier=" + this.f30432b + ", controller=" + this.f30433c + ")";
    }
}
