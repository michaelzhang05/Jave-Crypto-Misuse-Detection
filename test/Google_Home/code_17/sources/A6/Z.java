package A6;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class Z implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    private final w6.b f537a;

    /* renamed from: b, reason: collision with root package name */
    private final y6.f f538b;

    public Z(w6.b serializer) {
        AbstractC3255y.i(serializer, "serializer");
        this.f537a = serializer;
        this.f538b = new m0(serializer.a());
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return this.f538b;
    }

    @Override // w6.InterfaceC4150a
    public Object b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        if (decoder.v()) {
            return decoder.s(this.f537a);
        }
        return decoder.r();
    }

    @Override // w6.i
    public void d(z6.f encoder, Object obj) {
        AbstractC3255y.i(encoder, "encoder");
        if (obj != null) {
            encoder.u();
            encoder.g(this.f537a, obj);
        } else {
            encoder.f();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Z.class == obj.getClass() && AbstractC3255y.d(this.f537a, ((Z) obj).f537a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f537a.hashCode();
    }
}
