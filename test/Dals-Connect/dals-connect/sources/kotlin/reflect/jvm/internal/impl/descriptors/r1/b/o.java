package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ReflectJavaConstructor.kt */
/* loaded from: classes2.dex */
public final class o extends t implements kotlin.reflect.x.internal.l0.d.a.n0.k {
    private final Constructor<?> a;

    public o(Constructor<?> constructor) {
        kotlin.jvm.internal.l.f(constructor, "member");
        this.a = constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.r1.b.t
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public Constructor<?> U() {
        return this.a;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.z
    public List<a0> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = U().getTypeParameters();
        kotlin.jvm.internal.l.e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new a0(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.k
    public List<kotlin.reflect.x.internal.l0.d.a.n0.b0> h() {
        List<kotlin.reflect.x.internal.l0.d.a.n0.b0> i2;
        Type[] genericParameterTypes = U().getGenericParameterTypes();
        kotlin.jvm.internal.l.e(genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            i2 = kotlin.collections.t.i();
            return i2;
        }
        Class<?> declaringClass = U().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) kotlin.collections.j.i(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = U().getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                kotlin.jvm.internal.l.e(parameterAnnotations, "annotations");
                parameterAnnotations = (Annotation[][]) kotlin.collections.j.i(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
            }
            kotlin.jvm.internal.l.e(genericParameterTypes, "realTypes");
            kotlin.jvm.internal.l.e(parameterAnnotations, "realAnnotations");
            return V(genericParameterTypes, parameterAnnotations, U().isVarArgs());
        }
        throw new IllegalStateException("Illegal generic signature: " + U());
    }
}
