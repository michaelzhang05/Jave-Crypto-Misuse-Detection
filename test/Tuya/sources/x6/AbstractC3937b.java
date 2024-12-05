package x6;

import e6.InterfaceC2643c;
import kotlin.jvm.internal.AbstractC3159y;
import t6.InterfaceC3796a;
import w6.c;

/* renamed from: x6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3937b implements t6.b {
    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(w6.c cVar) {
        return c.a.c(cVar, a(), 1, t6.f.a(this, cVar, cVar.q(a(), 0)), null, 8, null);
    }

    @Override // t6.InterfaceC3796a
    public final Object c(w6.e decoder) {
        Object obj;
        AbstractC3159y.i(decoder, "decoder");
        v6.f a8 = a();
        w6.c d8 = decoder.d(a8);
        kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
        if (d8.z()) {
            obj = g(d8);
        } else {
            obj = null;
            while (true) {
                int p8 = d8.p(a());
                if (p8 != -1) {
                    if (p8 != 0) {
                        if (p8 != 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) t8.f33761a;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(p8);
                            throw new t6.h(sb.toString());
                        }
                        Object obj2 = t8.f33761a;
                        if (obj2 != null) {
                            t8.f33761a = obj2;
                            obj = c.a.c(d8, a(), p8, t6.f.a(this, d8, (String) obj2), null, 8, null);
                        } else {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                        }
                    } else {
                        t8.f33761a = d8.q(a(), p8);
                    }
                } else if (obj != null) {
                    AbstractC3159y.g(obj, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                } else {
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) t8.f33761a)).toString());
                }
            }
        }
        d8.a(a8);
        return obj;
    }

    @Override // t6.i
    public final void e(w6.f encoder, Object value) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(value, "value");
        t6.i b8 = t6.f.b(this, encoder, value);
        v6.f a8 = a();
        w6.d d8 = encoder.d(a8);
        d8.y(a(), 0, b8.a().a());
        v6.f a9 = a();
        AbstractC3159y.g(b8, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        d8.A(a9, 1, b8, value);
        d8.a(a8);
    }

    public InterfaceC3796a h(w6.c decoder, String str) {
        AbstractC3159y.i(decoder, "decoder");
        return decoder.b().d(j(), str);
    }

    public t6.i i(w6.f encoder, Object value) {
        AbstractC3159y.i(encoder, "encoder");
        AbstractC3159y.i(value, "value");
        return encoder.b().e(j(), value);
    }

    public abstract InterfaceC2643c j();
}
