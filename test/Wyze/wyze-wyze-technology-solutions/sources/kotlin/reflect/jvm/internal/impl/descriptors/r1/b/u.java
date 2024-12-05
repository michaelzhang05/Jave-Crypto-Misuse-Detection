package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.r1.b.z;
import kotlin.reflect.x.internal.l0.d.a.n0.r;

/* compiled from: ReflectJavaMethod.kt */
/* loaded from: classes2.dex */
public final class u extends t implements kotlin.reflect.x.internal.l0.d.a.n0.r {
    private final Method a;

    public u(Method method) {
        kotlin.jvm.internal.l.f(method, "member");
        this.a = method;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.r
    public boolean L() {
        return r.a.a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.r1.b.t
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public Method U() {
        return this.a;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.r
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public z getReturnType() {
        z.a aVar = z.a;
        Type genericReturnType = U().getGenericReturnType();
        kotlin.jvm.internal.l.e(genericReturnType, "member.genericReturnType");
        return aVar.a(genericReturnType);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.z
    public List<a0> getTypeParameters() {
        TypeVariable<Method>[] typeParameters = U().getTypeParameters();
        kotlin.jvm.internal.l.e(typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new a0(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.r
    public List<kotlin.reflect.x.internal.l0.d.a.n0.b0> h() {
        Type[] genericParameterTypes = U().getGenericParameterTypes();
        kotlin.jvm.internal.l.e(genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = U().getParameterAnnotations();
        kotlin.jvm.internal.l.e(parameterAnnotations, "member.parameterAnnotations");
        return V(genericParameterTypes, parameterAnnotations, U().isVarArgs());
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.r
    public kotlin.reflect.x.internal.l0.d.a.n0.b r() {
        Object defaultValue = U().getDefaultValue();
        if (defaultValue != null) {
            return f.a.a(defaultValue, null);
        }
        return null;
    }
}
