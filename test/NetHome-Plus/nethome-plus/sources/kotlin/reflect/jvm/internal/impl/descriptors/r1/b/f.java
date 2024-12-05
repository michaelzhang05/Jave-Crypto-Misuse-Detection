package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

import java.lang.annotation.Annotation;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes2.dex */
public abstract class f implements kotlin.reflect.x.internal.l0.d.a.n0.b {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.f.f f21837b;

    /* compiled from: ReflectJavaAnnotationArguments.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final f a(Object obj, kotlin.reflect.x.internal.l0.f.f fVar) {
            kotlin.jvm.internal.l.f(obj, "value");
            return d.g(obj.getClass()) ? new q(fVar, (Enum) obj) : obj instanceof Annotation ? new g(fVar, (Annotation) obj) : obj instanceof Object[] ? new j(fVar, (Object[]) obj) : obj instanceof Class ? new m(fVar, (Class) obj) : new s(fVar, obj);
        }
    }

    private f(kotlin.reflect.x.internal.l0.f.f fVar) {
        this.f21837b = fVar;
    }

    public /* synthetic */ f(kotlin.reflect.x.internal.l0.f.f fVar, kotlin.jvm.internal.g gVar) {
        this(fVar);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.b
    public kotlin.reflect.x.internal.l0.f.f getName() {
        return this.f21837b;
    }
}
