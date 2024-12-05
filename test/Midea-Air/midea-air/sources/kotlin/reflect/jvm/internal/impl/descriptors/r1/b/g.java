package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

import java.lang.annotation.Annotation;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes2.dex */
public final class g extends f implements kotlin.reflect.x.internal.l0.d.a.n0.c {

    /* renamed from: c, reason: collision with root package name */
    private final Annotation f21838c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kotlin.reflect.x.internal.l0.f.f fVar, Annotation annotation) {
        super(fVar, null);
        kotlin.jvm.internal.l.f(annotation, "annotation");
        this.f21838c = annotation;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.c
    public kotlin.reflect.x.internal.l0.d.a.n0.a a() {
        return new e(this.f21838c);
    }
}
