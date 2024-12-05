package kotlin.reflect.x.internal.l0.l;

import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.n1.g;

/* compiled from: AnnotationsTypeAttribute.kt */
/* loaded from: classes2.dex */
public final class k {
    static final /* synthetic */ KProperty<Object>[] a = {b0.g(new v(b0.d(k.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};

    /* renamed from: b, reason: collision with root package name */
    private static final ReadOnlyProperty f21261b;

    static {
        ReadOnlyProperty c2 = a1.f21185g.c(b0.b(j.class));
        l.d(c2, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        f21261b = c2;
    }

    public static final g a(a1 a1Var) {
        g e2;
        l.f(a1Var, "<this>");
        j b2 = b(a1Var);
        return (b2 == null || (e2 = b2.e()) == null) ? g.f21674c.b() : e2;
    }

    public static final j b(a1 a1Var) {
        l.f(a1Var, "<this>");
        return (j) f21261b.a(a1Var, a[0]);
    }
}
