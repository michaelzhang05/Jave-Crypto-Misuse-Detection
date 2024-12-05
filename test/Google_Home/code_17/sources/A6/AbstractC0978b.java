package A6;

import h6.InterfaceC2963c;
import kotlin.jvm.internal.AbstractC3255y;
import w6.InterfaceC4150a;
import z6.c;

/* renamed from: A6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0978b implements w6.b {
    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(z6.c cVar) {
        return c.a.c(cVar, a(), 1, w6.f.a(this, cVar, cVar.e(a(), 0)), null, 8, null);
    }

    @Override // w6.InterfaceC4150a
    public final Object b(z6.e decoder) {
        Object obj;
        AbstractC3255y.i(decoder, "decoder");
        y6.f a8 = a();
        z6.c d8 = decoder.d(a8);
        kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
        if (d8.w()) {
            obj = g(d8);
        } else {
            obj = null;
            while (true) {
                int g8 = d8.g(a());
                if (g8 != -1) {
                    if (g8 != 0) {
                        if (g8 != 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) t8.f34162a;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(g8);
                            throw new w6.h(sb.toString());
                        }
                        Object obj2 = t8.f34162a;
                        if (obj2 != null) {
                            t8.f34162a = obj2;
                            obj = c.a.c(d8, a(), g8, w6.f.a(this, d8, (String) obj2), null, 8, null);
                        } else {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                        }
                    } else {
                        t8.f34162a = d8.e(a(), g8);
                    }
                } else if (obj != null) {
                    AbstractC3255y.g(obj, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                } else {
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) t8.f34162a)).toString());
                }
            }
        }
        d8.b(a8);
        return obj;
    }

    @Override // w6.i
    public final void d(z6.f encoder, Object value) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(value, "value");
        w6.i b8 = w6.f.b(this, encoder, value);
        y6.f a8 = a();
        z6.d d8 = encoder.d(a8);
        d8.e(a(), 0, b8.a().a());
        y6.f a9 = a();
        AbstractC3255y.g(b8, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        d8.C(a9, 1, b8, value);
        d8.b(a8);
    }

    public InterfaceC4150a h(z6.c decoder, String str) {
        AbstractC3255y.i(decoder, "decoder");
        return decoder.a().d(j(), str);
    }

    public w6.i i(z6.f encoder, Object value) {
        AbstractC3255y.i(encoder, "encoder");
        AbstractC3255y.i(value, "value");
        return encoder.a().e(j(), value);
    }

    public abstract InterfaceC2963c j();
}
