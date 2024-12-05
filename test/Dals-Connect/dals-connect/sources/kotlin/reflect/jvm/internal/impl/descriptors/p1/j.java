package kotlin.reflect.jvm.internal.impl.descriptors.p1;

/* compiled from: DeclarationDescriptorImpl.java */
/* loaded from: classes2.dex */
public abstract class j extends kotlin.reflect.jvm.internal.impl.descriptors.n1.b implements kotlin.reflect.jvm.internal.impl.descriptors.m {

    /* renamed from: g, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.f.f f21739g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar, kotlin.reflect.x.internal.l0.f.f fVar) {
        super(gVar);
        if (gVar == null) {
            v(0);
        }
        if (fVar == null) {
            v(1);
        }
        this.f21739g = fVar;
    }

    public static String H(kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
        if (mVar == null) {
            v(4);
        }
        try {
            String str = kotlin.reflect.x.internal.l0.h.c.f20764j.q(mVar) + "[" + mVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(mVar)) + "]";
            if (str == null) {
                v(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = mVar.getClass().getSimpleName() + " " + mVar.getName();
            if (str2 == null) {
                v(6);
            }
            return str2;
        }
    }

    private static /* synthetic */ void v(int i2) {
        String str = (i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6) ? 2 : 3];
        switch (i2) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i2 == 2) {
            objArr[1] = "getName";
        } else if (i2 == 3) {
            objArr[1] = "getOriginal";
        } else if (i2 == 5 || i2 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i2 != 2 && i2 != 3) {
            if (i2 == 4) {
                objArr[2] = "toString";
            } else if (i2 != 5 && i2 != 6) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        if (i2 != 2 && i2 != 3 && i2 != 5 && i2 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.m a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.i0
    public kotlin.reflect.x.internal.l0.f.f getName() {
        kotlin.reflect.x.internal.l0.f.f fVar = this.f21739g;
        if (fVar == null) {
            v(2);
        }
        return fVar;
    }

    public String toString() {
        return H(this);
    }
}
