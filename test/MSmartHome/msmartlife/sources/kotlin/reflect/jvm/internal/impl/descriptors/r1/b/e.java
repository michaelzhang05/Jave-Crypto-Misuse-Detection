package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.r1.b.f;
import kotlin.reflect.x.internal.l0.d.a.n0.a;

/* compiled from: ReflectJavaAnnotation.kt */
/* loaded from: classes2.dex */
public final class e extends p implements kotlin.reflect.x.internal.l0.d.a.n0.a {
    private final Annotation a;

    public e(Annotation annotation) {
        kotlin.jvm.internal.l.f(annotation, "annotation");
        this.a = annotation;
    }

    public final Annotation R() {
        return this.a;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.a
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public l z() {
        return new l(kotlin.jvm.a.b(kotlin.jvm.a.a(this.a)));
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.a
    public kotlin.reflect.x.internal.l0.f.b c() {
        return d.a(kotlin.jvm.a.b(kotlin.jvm.a.a(this.a)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && this.a == ((e) obj).a;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.a
    public boolean f() {
        return a.C0295a.b(this);
    }

    public int hashCode() {
        return System.identityHashCode(this.a);
    }

    public String toString() {
        return e.class.getName() + ": " + this.a;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.a
    public boolean u() {
        return a.C0295a.a(this);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.a
    public Collection<kotlin.reflect.x.internal.l0.d.a.n0.b> w() {
        Method[] declaredMethods = kotlin.jvm.a.b(kotlin.jvm.a.a(this.a)).getDeclaredMethods();
        kotlin.jvm.internal.l.e(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            f.a aVar = f.a;
            Object invoke = method.invoke(this.a, new Object[0]);
            kotlin.jvm.internal.l.e(invoke, "method.invoke(annotation)");
            arrayList.add(aVar.a(invoke, kotlin.reflect.x.internal.l0.f.f.r(method.getName())));
        }
        return arrayList;
    }
}
