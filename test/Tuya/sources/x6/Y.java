package x6;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class Y implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final Y f39540a = new Y();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f39541b = X.f39537a;

    private Y() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f39541b;
    }

    @Override // t6.InterfaceC3796a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Void c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        throw new t6.h("'kotlin.Nothing' does not have instances");
    }

    @Override // t6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(w6.f encoder, Void value) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(value, "value");
        throw new t6.h("'kotlin.Nothing' cannot be serialized");
    }
}
