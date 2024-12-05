package C6;

import A6.AbstractC0978b;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC3255y;
import w6.InterfaceC4150a;
import y6.j;

/* loaded from: classes5.dex */
public abstract class L {
    public static final void b(y6.j kind) {
        AbstractC3255y.i(kind, "kind");
        if (!(kind instanceof j.b)) {
            if (!(kind instanceof y6.e)) {
                if (!(kind instanceof y6.d)) {
                    return;
                } else {
                    throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
                }
            }
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
    }

    public static final String c(y6.f fVar, B6.a json) {
        AbstractC3255y.i(fVar, "<this>");
        AbstractC3255y.i(json, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof B6.e) {
                return ((B6.e) annotation).discriminator();
            }
        }
        return json.d().d();
    }

    public static final Object d(B6.h hVar, InterfaceC4150a deserializer) {
        String str;
        B6.x i8;
        AbstractC3255y.i(hVar, "<this>");
        AbstractC3255y.i(deserializer, "deserializer");
        if ((deserializer instanceof AbstractC0978b) && !hVar.c().d().n()) {
            String c8 = c(deserializer.a(), hVar.c());
            B6.i n8 = hVar.n();
            y6.f a8 = deserializer.a();
            if (n8 instanceof B6.v) {
                B6.v vVar = (B6.v) n8;
                B6.i iVar = (B6.i) vVar.get(c8);
                if (iVar != null && (i8 = B6.j.i(iVar)) != null) {
                    str = B6.j.d(i8);
                } else {
                    str = null;
                }
                try {
                    InterfaceC4150a a9 = w6.f.a((AbstractC0978b) deserializer, hVar, str);
                    AbstractC3255y.g(a9, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                    return T.b(hVar.c(), c8, vVar, a9);
                } catch (w6.h e8) {
                    String message = e8.getMessage();
                    AbstractC3255y.f(message);
                    throw B.e(-1, message, vVar.toString());
                }
            }
            throw B.d(-1, "Expected " + kotlin.jvm.internal.U.b(B6.v.class) + " as the serialized body of " + a8.a() + ", but had " + kotlin.jvm.internal.U.b(n8.getClass()));
        }
        return deserializer.b(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(w6.i iVar, w6.i iVar2, String str) {
    }
}
