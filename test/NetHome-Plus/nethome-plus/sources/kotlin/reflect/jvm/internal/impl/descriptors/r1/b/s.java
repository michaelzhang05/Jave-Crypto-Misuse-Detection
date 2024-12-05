package kotlin.reflect.jvm.internal.impl.descriptors.r1.b;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes2.dex */
public final class s extends f implements kotlin.reflect.x.internal.l0.d.a.n0.o {

    /* renamed from: c, reason: collision with root package name */
    private final Object f21856c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(kotlin.reflect.x.internal.l0.f.f fVar, Object obj) {
        super(fVar, null);
        kotlin.jvm.internal.l.f(obj, "value");
        this.f21856c = obj;
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.n0.o
    public Object getValue() {
        return this.f21856c;
    }
}
