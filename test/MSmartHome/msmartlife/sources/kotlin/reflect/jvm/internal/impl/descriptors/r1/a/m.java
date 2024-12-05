package kotlin.reflect.jvm.internal.impl.descriptors.r1.a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: ReflectKotlinClass.kt */
/* loaded from: classes2.dex */
final class m {
    public static final m a = new m();

    private m() {
    }

    public final String a(Constructor<?> constructor) {
        kotlin.jvm.internal.l.f(constructor, "constructor");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        kotlin.jvm.internal.l.e(parameterTypes, "constructor.parameterTypes");
        for (Class<?> cls : parameterTypes) {
            kotlin.jvm.internal.l.e(cls, "parameterType");
            sb.append(kotlin.reflect.jvm.internal.impl.descriptors.r1.b.d.b(cls));
        }
        sb.append(")V");
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e(sb2, "sb.toString()");
        return sb2;
    }

    public final String b(Field field) {
        kotlin.jvm.internal.l.f(field, "field");
        Class<?> type = field.getType();
        kotlin.jvm.internal.l.e(type, "field.type");
        return kotlin.reflect.jvm.internal.impl.descriptors.r1.b.d.b(type);
    }

    public final String c(Method method) {
        kotlin.jvm.internal.l.f(method, "method");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        kotlin.jvm.internal.l.e(parameterTypes, "method.parameterTypes");
        for (Class<?> cls : parameterTypes) {
            kotlin.jvm.internal.l.e(cls, "parameterType");
            sb.append(kotlin.reflect.jvm.internal.impl.descriptors.r1.b.d.b(cls));
        }
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.l.e(returnType, "method.returnType");
        sb.append(kotlin.reflect.jvm.internal.impl.descriptors.r1.b.d.b(returnType));
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e(sb2, "sb.toString()");
        return sb2;
    }
}
