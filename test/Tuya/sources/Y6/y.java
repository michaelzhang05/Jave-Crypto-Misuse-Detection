package y6;

import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.U;
import v6.e;
import z6.AbstractC4031B;

/* loaded from: classes5.dex */
public final class y implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final y f40030a = new y();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f40031b = v6.i.c("kotlinx.serialization.json.JsonPrimitive", e.i.f38902a, new v6.f[0], null, 8, null);

    private y() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f40031b;
    }

    @Override // t6.InterfaceC3796a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public x c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        AbstractC4007i n8 = l.d(decoder).n();
        if (n8 instanceof x) {
            return (x) n8;
        }
        throw AbstractC4031B.e(-1, "Unexpected JSON element, expected JsonPrimitive, had " + U.b(n8.getClass()), n8.toString());
    }

    @Override // t6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(w6.f encoder, x value) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(value, "value");
        l.c(encoder);
        if (value instanceof t) {
            encoder.j(u.f40021a, t.INSTANCE);
        } else {
            encoder.j(q.f40016a, (p) value);
        }
    }
}
