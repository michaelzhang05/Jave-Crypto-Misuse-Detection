package h4;

import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class S extends p4.o0 {

    /* renamed from: f, reason: collision with root package name */
    public static final int f32457f = 8;

    /* renamed from: b, reason: collision with root package name */
    private final p4.G f32458b;

    /* renamed from: c, reason: collision with root package name */
    private final Q f32459c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32460d;

    /* renamed from: e, reason: collision with root package name */
    private final B2.b f32461e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(p4.G _identifier, Q controller) {
        super(_identifier);
        AbstractC3255y.i(_identifier, "_identifier");
        AbstractC3255y.i(controller, "controller");
        this.f32458b = _identifier;
        this.f32459c = controller;
        this.f32460d = true;
    }

    @Override // p4.k0
    public B2.b b() {
        return this.f32461e;
    }

    @Override // p4.k0
    public boolean c() {
        return this.f32460d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s8 = (S) obj;
        if (AbstractC3255y.d(this.f32458b, s8.f32458b) && AbstractC3255y.d(this.f32459c, s8.f32459c)) {
            return true;
        }
        return false;
    }

    @Override // p4.o0, p4.k0
    public void h(Map rawValuesMap) {
        AbstractC3255y.i(rawValuesMap, "rawValuesMap");
    }

    public int hashCode() {
        return (this.f32458b.hashCode() * 31) + this.f32459c.hashCode();
    }

    @Override // p4.o0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Q i() {
        return this.f32459c;
    }

    public String toString() {
        return "CvcElement(_identifier=" + this.f32458b + ", controller=" + this.f32459c + ")";
    }
}
