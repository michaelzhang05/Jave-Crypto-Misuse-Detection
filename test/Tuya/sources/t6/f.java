package t6;

import L5.C1224h;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.U;
import x6.AbstractC3937b;
import x6.AbstractC3939c;

/* loaded from: classes5.dex */
public abstract class f {
    public static final InterfaceC3796a a(AbstractC3937b abstractC3937b, w6.c decoder, String str) {
        AbstractC3159y.i(abstractC3937b, "<this>");
        AbstractC3159y.i(decoder, "decoder");
        InterfaceC3796a h8 = abstractC3937b.h(decoder, str);
        if (h8 != null) {
            return h8;
        }
        AbstractC3939c.b(str, abstractC3937b.j());
        throw new C1224h();
    }

    public static final i b(AbstractC3937b abstractC3937b, w6.f encoder, Object value) {
        AbstractC3159y.i(abstractC3937b, "<this>");
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(value, "value");
        i i8 = abstractC3937b.i(encoder, value);
        if (i8 != null) {
            return i8;
        }
        AbstractC3939c.a(U.b(value.getClass()), abstractC3937b.j());
        throw new C1224h();
    }
}
