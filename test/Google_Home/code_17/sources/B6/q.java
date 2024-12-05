package B6;

import C6.B;
import O5.C;
import j6.AbstractC3201D;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.U;
import x6.AbstractC4193a;
import y6.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class q implements w6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final q f1060a = new q();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.f f1061b = y6.i.a("kotlinx.serialization.json.JsonLiteral", e.i.f41033a);

    private q() {
    }

    @Override // w6.b, w6.i, w6.InterfaceC4150a
    public y6.f a() {
        return f1061b;
    }

    @Override // w6.InterfaceC4150a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public p b(z6.e decoder) {
        AbstractC3255y.i(decoder, "decoder");
        i n8 = l.d(decoder).n();
        if (n8 instanceof p) {
            return (p) n8;
        }
        throw B.e(-1, "Unexpected JSON element, expected JsonLiteral, had " + U.b(n8.getClass()), n8.toString());
    }

    @Override // w6.i
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(z6.f encoder, p value) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(value, "value");
        l.h(encoder);
        if (value.f()) {
            encoder.E(value.c());
            return;
        }
        if (value.e() != null) {
            encoder.l(value.e()).E(value.c());
            return;
        }
        Long k8 = j6.n.k(value.c());
        if (k8 != null) {
            encoder.D(k8.longValue());
            return;
        }
        C h8 = AbstractC3201D.h(value.c());
        if (h8 != null) {
            encoder.l(AbstractC4193a.s(C.f8267b).a()).D(h8.g());
            return;
        }
        Double g8 = j6.n.g(value.c());
        if (g8 != null) {
            encoder.h(g8.doubleValue());
            return;
        }
        Boolean L02 = j6.n.L0(value.c());
        if (L02 != null) {
            encoder.n(L02.booleanValue());
        } else {
            encoder.E(value.c());
        }
    }
}
