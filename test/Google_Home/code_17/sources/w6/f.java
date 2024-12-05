package w6;

import A6.AbstractC0978b;
import A6.AbstractC0980c;
import O5.C1352h;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.U;

/* loaded from: classes5.dex */
public abstract class f {
    public static final InterfaceC4150a a(AbstractC0978b abstractC0978b, z6.c decoder, String str) {
        AbstractC3255y.i(abstractC0978b, "<this>");
        AbstractC3255y.i(decoder, "decoder");
        InterfaceC4150a h8 = abstractC0978b.h(decoder, str);
        if (h8 != null) {
            return h8;
        }
        AbstractC0980c.b(str, abstractC0978b.j());
        throw new C1352h();
    }

    public static final i b(AbstractC0978b abstractC0978b, z6.f encoder, Object value) {
        AbstractC3255y.i(abstractC0978b, "<this>");
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(value, "value");
        i i8 = abstractC0978b.i(encoder, value);
        if (i8 != null) {
            return i8;
        }
        AbstractC0980c.a(U.b(value.getClass()), abstractC0978b.j());
        throw new C1352h();
    }
}
