package kotlin.reflect.jvm.internal.impl.descriptors.n1;

/* compiled from: AnnotatedImpl.java */
/* loaded from: classes2.dex */
public class b implements a {

    /* renamed from: f, reason: collision with root package name */
    private final g f21660f;

    public b(g gVar) {
        if (gVar == null) {
            v(0);
        }
        this.f21660f = gVar;
    }

    private static /* synthetic */ void v(int i2) {
        String str = i2 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 1 ? 3 : 2];
        if (i2 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i2 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i2 != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i2 == 1) {
            throw new IllegalStateException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.a
    public g getAnnotations() {
        g gVar = this.f21660f;
        if (gVar == null) {
            v(1);
        }
        return gVar;
    }
}
