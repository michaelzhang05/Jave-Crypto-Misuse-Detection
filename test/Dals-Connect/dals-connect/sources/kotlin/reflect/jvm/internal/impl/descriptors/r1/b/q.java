package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes2.dex */
public final class q extends f implements kotlin.reflect.x.internal.l0.d.a.n0.m {

    /* renamed from: c, reason: collision with root package name */
    private final Enum<?> f21855c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kotlin.reflect.x.internal.l0.f.f fVar, Enum<?> r3) {
        super(fVar, null);
        kotlin.jvm.internal.l.f(r3, "value");
        this.f21855c = r3;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.m
    public kotlin.reflect.x.internal.l0.f.b b() {
        Class<?> cls = this.f21855c.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        kotlin.jvm.internal.l.e(cls, "enumClass");
        return d.a(cls);
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.m
    public kotlin.reflect.x.internal.l0.f.f d() {
        return kotlin.reflect.x.internal.l0.f.f.r(this.f21855c.name());
    }
}
