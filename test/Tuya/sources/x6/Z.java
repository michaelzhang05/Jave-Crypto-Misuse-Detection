package x6;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class Z implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    private final t6.b f39542a;

    /* renamed from: b, reason: collision with root package name */
    private final v6.f f39543b;

    public Z(t6.b serializer) {
        AbstractC3159y.i(serializer, "serializer");
        this.f39542a = serializer;
        this.f39543b = new m0(serializer.a());
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return this.f39543b;
    }

    @Override // t6.InterfaceC3796a
    public Object c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        if (decoder.w()) {
            return decoder.e(this.f39542a);
        }
        return decoder.s();
    }

    @Override // t6.i
    public void e(w6.f encoder, Object obj) {
        AbstractC3159y.i(encoder, "encoder");
        if (obj != null) {
            encoder.r();
            encoder.j(this.f39542a, obj);
        } else {
            encoder.f();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Z.class == obj.getClass() && AbstractC3159y.d(this.f39542a, ((Z) obj).f39542a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f39542a.hashCode();
    }
}
