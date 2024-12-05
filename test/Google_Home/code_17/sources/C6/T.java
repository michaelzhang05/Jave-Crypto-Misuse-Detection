package C6;

import kotlin.jvm.internal.AbstractC3255y;
import w6.InterfaceC4150a;

/* loaded from: classes5.dex */
public abstract class T {
    public static final Object a(B6.a json, B6.i element, InterfaceC4150a deserializer) {
        boolean d8;
        z6.e e8;
        AbstractC3255y.i(json, "json");
        AbstractC3255y.i(element, "element");
        AbstractC3255y.i(deserializer, "deserializer");
        if (element instanceof B6.v) {
            e8 = new H(json, (B6.v) element, null, null, 12, null);
        } else if (element instanceof B6.b) {
            e8 = new I(json, (B6.b) element);
        } else {
            if (element instanceof B6.p) {
                d8 = true;
            } else {
                d8 = AbstractC3255y.d(element, B6.t.INSTANCE);
            }
            if (d8) {
                e8 = new E(json, (B6.x) element);
            } else {
                throw new O5.p();
            }
        }
        return e8.s(deserializer);
    }

    public static final Object b(B6.a aVar, String discriminator, B6.v element, InterfaceC4150a deserializer) {
        AbstractC3255y.i(aVar, "<this>");
        AbstractC3255y.i(discriminator, "discriminator");
        AbstractC3255y.i(element, "element");
        AbstractC3255y.i(deserializer, "deserializer");
        return new H(aVar, element, discriminator, deserializer.a()).s(deserializer);
    }
}
