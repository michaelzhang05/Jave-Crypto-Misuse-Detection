package y6;

import L5.C;
import g6.AbstractC2724D;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.U;
import u6.AbstractC3808a;
import v6.e;
import z6.AbstractC4031B;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class q implements t6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final q f40016a = new q();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.f f40017b = v6.i.a("kotlinx.serialization.json.JsonLiteral", e.i.f38902a);

    private q() {
    }

    @Override // t6.b, t6.i, t6.InterfaceC3796a
    public v6.f a() {
        return f40017b;
    }

    @Override // t6.InterfaceC3796a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public p c(w6.e decoder) {
        AbstractC3159y.i(decoder, "decoder");
        AbstractC4007i n8 = l.d(decoder).n();
        if (n8 instanceof p) {
            return (p) n8;
        }
        throw AbstractC4031B.e(-1, "Unexpected JSON element, expected JsonLiteral, had " + U.b(n8.getClass()), n8.toString());
    }

    @Override // t6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void e(w6.f encoder, p value) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(value, "value");
        l.h(encoder);
        if (value.h()) {
            encoder.E(value.a());
            return;
        }
        if (value.g() != null) {
            encoder.F(value.g()).E(value.a());
            return;
        }
        Long k8 = g6.n.k(value.a());
        if (k8 != null) {
            encoder.C(k8.longValue());
            return;
        }
        C h8 = AbstractC2724D.h(value.a());
        if (h8 != null) {
            encoder.F(AbstractC3808a.s(C.f6476b).a()).C(h8.g());
            return;
        }
        Double g8 = g6.n.g(value.a());
        if (g8 != null) {
            encoder.g(g8.doubleValue());
            return;
        }
        Boolean L02 = g6.n.L0(value.a());
        if (L02 != null) {
            encoder.n(L02.booleanValue());
        } else {
            encoder.E(value.a());
        }
    }
}
