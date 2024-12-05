package z6;

import kotlin.jvm.internal.AbstractC3159y;
import t6.InterfaceC3796a;
import y6.AbstractC3999a;
import y6.AbstractC4007i;
import y6.C4000b;

/* loaded from: classes5.dex */
public abstract class T {
    public static final Object a(AbstractC3999a json, AbstractC4007i element, InterfaceC3796a deserializer) {
        boolean d8;
        w6.e c4034e;
        AbstractC3159y.i(json, "json");
        AbstractC3159y.i(element, "element");
        AbstractC3159y.i(deserializer, "deserializer");
        if (element instanceof y6.v) {
            c4034e = new C4037H(json, (y6.v) element, null, null, 12, null);
        } else if (element instanceof C4000b) {
            c4034e = new C4038I(json, (C4000b) element);
        } else {
            if (element instanceof y6.p) {
                d8 = true;
            } else {
                d8 = AbstractC3159y.d(element, y6.t.INSTANCE);
            }
            if (d8) {
                c4034e = new C4034E(json, (y6.x) element);
            } else {
                throw new L5.p();
            }
        }
        return c4034e.e(deserializer);
    }

    public static final Object b(AbstractC3999a abstractC3999a, String discriminator, y6.v element, InterfaceC3796a deserializer) {
        AbstractC3159y.i(abstractC3999a, "<this>");
        AbstractC3159y.i(discriminator, "discriminator");
        AbstractC3159y.i(element, "element");
        AbstractC3159y.i(deserializer, "deserializer");
        return new C4037H(abstractC3999a, element, discriminator, deserializer.a()).e(deserializer);
    }
}
