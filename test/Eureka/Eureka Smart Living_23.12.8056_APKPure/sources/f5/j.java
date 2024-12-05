package f5;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final k f6620a;

    /* renamed from: b, reason: collision with root package name */
    private static final h5.a[] f6621b;

    static {
        k kVar = null;
        try {
            kVar = (k) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (kVar == null) {
            kVar = new k();
        }
        f6620a = kVar;
        f6621b = new h5.a[0];
    }

    public static h5.a a(Class cls) {
        return f6620a.a(cls);
    }

    public static String b(i iVar) {
        return f6620a.c(iVar);
    }
}
