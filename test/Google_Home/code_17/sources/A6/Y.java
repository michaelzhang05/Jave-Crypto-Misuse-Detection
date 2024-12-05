package A6;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class Y implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final Y f535a = new Y();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f536b = X.f532a;

    private Y() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f536b;
    }

    @Override // w6.InterfaceC4150a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Void b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        throw new w6.h("'kotlin.Nothing' does not have instances");
    }

    @Override // w6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(z6.f encoder, Void value) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(value, "value");
        throw new w6.h("'kotlin.Nothing' cannot be serialized");
    }
}
