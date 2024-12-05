package y6;

import kotlin.jvm.internal.AbstractC3159y;
import v6.j;

/* loaded from: classes5.dex */
public final class u implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final u f40021a = new u();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f40022b = v6.i.c("kotlinx.serialization.json.JsonNull", j.b.f38925a, new v6.f[0], null, 8, null);

    private u() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f40022b;
    }

    @Override // t6.InterfaceC3796a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public t c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        l.g(decoder);
        if (!decoder.w()) {
            decoder.s();
            return t.INSTANCE;
        }
        throw new z6.x("Expected 'null' literal");
    }

    @Override // t6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(w6.f encoder, t value) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(value, "value");
        l.h(encoder);
        encoder.f();
    }
}
