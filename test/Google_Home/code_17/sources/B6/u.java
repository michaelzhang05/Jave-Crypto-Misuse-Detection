package B6;

import kotlin.jvm.internal.AbstractC3255y;
import y6.j;

/* loaded from: classes5.dex */
public final class u implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final u f1065a = new u();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f1066b = y6.i.c("kotlinx.serialization.json.JsonNull", j.b.f41056a, new y6.f[0], null, 8, null);

    private u() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f1066b;
    }

    @Override // w6.InterfaceC4150a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public t b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        l.g(decoder);
        if (!decoder.v()) {
            decoder.r();
            return t.INSTANCE;
        }
        throw new C6.x("Expected 'null' literal");
    }

    @Override // w6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(z6.f encoder, t value) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(value, "value");
        l.h(encoder);
        encoder.f();
    }
}
