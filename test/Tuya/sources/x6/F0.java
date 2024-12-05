package x6;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class F0 implements t6.b {

    /* renamed from: b, reason: collision with root package name */
    public static final F0 f39515b = new F0();

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C3936a0 f39516a = new C3936a0("kotlin.Unit", L5.I.f6487a);

    private F0() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return this.f39516a.a();
    }

    @Override // t6.InterfaceC3796a
    public /* bridge */ /* synthetic */ Object c(w6.e eVar) {
        f(eVar);
        return L5.I.f6487a;
    }

    public void f(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        this.f39516a.c(decoder);
    }

    @Override // t6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(w6.f encoder, L5.I value) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(value, "value");
        this.f39516a.e(encoder, value);
    }
}
