package z6;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC3159y;
import t6.InterfaceC3796a;
import v6.j;
import x6.AbstractC3937b;
import y6.AbstractC3999a;
import y6.AbstractC4007i;
import y6.InterfaceC4003e;
import y6.InterfaceC4006h;

/* loaded from: classes5.dex */
public abstract class L {
    public static final void b(v6.j kind) {
        AbstractC3159y.i(kind, "kind");
        if (!(kind instanceof j.b)) {
            if (!(kind instanceof v6.e)) {
                if (!(kind instanceof v6.d)) {
                    return;
                } else {
                    throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
                }
            }
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
    }

    public static final String c(v6.f fVar, AbstractC3999a json) {
        AbstractC3159y.i(fVar, "<this>");
        AbstractC3159y.i(json, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof InterfaceC4003e) {
                return ((InterfaceC4003e) annotation).discriminator();
            }
        }
        return json.d().d();
    }

    public static final Object d(InterfaceC4006h interfaceC4006h, InterfaceC3796a deserializer) {
        String str;
        y6.x i8;
        AbstractC3159y.i(interfaceC4006h, "<this>");
        AbstractC3159y.i(deserializer, "deserializer");
        if ((deserializer instanceof AbstractC3937b) && !interfaceC4006h.c().d().n()) {
            String c8 = c(deserializer.a(), interfaceC4006h.c());
            AbstractC4007i n8 = interfaceC4006h.n();
            v6.f a8 = deserializer.a();
            if (n8 instanceof y6.v) {
                y6.v vVar = (y6.v) n8;
                AbstractC4007i abstractC4007i = (AbstractC4007i) vVar.get(c8);
                if (abstractC4007i != null && (i8 = y6.j.i(abstractC4007i)) != null) {
                    str = y6.j.d(i8);
                } else {
                    str = null;
                }
                try {
                    InterfaceC3796a a9 = t6.f.a((AbstractC3937b) deserializer, interfaceC4006h, str);
                    AbstractC3159y.g(a9, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                    return T.b(interfaceC4006h.c(), c8, vVar, a9);
                } catch (t6.h e8) {
                    String message = e8.getMessage();
                    AbstractC3159y.f(message);
                    throw AbstractC4031B.e(-1, message, vVar.toString());
                }
            }
            throw AbstractC4031B.d(-1, "Expected " + kotlin.jvm.internal.U.b(y6.v.class) + " as the serialized body of " + a8.a() + ", but had " + kotlin.jvm.internal.U.b(n8.getClass()));
        }
        return deserializer.c(interfaceC4006h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(t6.i iVar, t6.i iVar2, String str) {
    }
}
