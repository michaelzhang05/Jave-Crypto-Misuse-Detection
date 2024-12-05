package B6;

import C6.B;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.U;
import y6.e;

/* loaded from: classes5.dex */
public final class y implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final y f1074a = new y();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f1075b = y6.i.c("kotlinx.serialization.json.JsonPrimitive", e.i.f41033a, new y6.f[0], null, 8, null);

    private y() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f1075b;
    }

    @Override // w6.InterfaceC4150a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public x b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        i n8 = l.d(decoder).n();
        if (n8 instanceof x) {
            return (x) n8;
        }
        throw B.e(-1, "Unexpected JSON element, expected JsonPrimitive, had " + U.b(n8.getClass()), n8.toString());
    }

    @Override // w6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(z6.f encoder, x value) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(value, "value");
        l.c(encoder);
        if (value instanceof t) {
            encoder.g(u.f1065a, t.INSTANCE);
        } else {
            encoder.g(q.f1060a, (p) value);
        }
    }
}
