package A6;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class F0 implements w6.b {

    /* renamed from: b, reason: collision with root package name */
    public static final F0 f510b = new F0();

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C0977a0 f511a = new C0977a0("kotlin.Unit", O5.I.f8278a);

    private F0() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return this.f511a.a();
    }

    @Override // w6.InterfaceC4150a
    public /* bridge */ /* synthetic */ Object b(z6.e eVar) {
        f(eVar);
        return O5.I.f8278a;
    }

    public void f(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        this.f511a.b(decoder);
    }

    @Override // w6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(z6.f encoder, O5.I value) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(value, "value");
        this.f511a.d(encoder, value);
    }
}
