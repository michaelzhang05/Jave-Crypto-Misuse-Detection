package S6;

import S6.Q;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: S6.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1423k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9920a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1423k f9921b;

    /* renamed from: c, reason: collision with root package name */
    public static final Q f9922c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1423k f9923d;

    /* renamed from: S6.k$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        AbstractC1423k c1430s;
        try {
            Class.forName("java.nio.file.Files");
            c1430s = new K();
        } catch (ClassNotFoundException unused) {
            c1430s = new C1430s();
        }
        f9921b = c1430s;
        Q.a aVar = Q.f9832b;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC3255y.h(property, "getProperty(\"java.io.tmpdir\")");
        f9922c = Q.a.e(aVar, property, false, 1, null);
        ClassLoader classLoader = T6.h.class.getClassLoader();
        AbstractC3255y.h(classLoader, "ResourceFileSystem::class.java.classLoader");
        f9923d = new T6.h(classLoader, false);
    }

    public abstract void a(Q q8, Q q9);

    public final void b(Q dir, boolean z8) {
        AbstractC3255y.i(dir, "dir");
        T6.c.a(this, dir, z8);
    }

    public final void c(Q dir) {
        AbstractC3255y.i(dir, "dir");
        d(dir, false);
    }

    public abstract void d(Q q8, boolean z8);

    public final void e(Q path) {
        AbstractC3255y.i(path, "path");
        f(path, false);
    }

    public abstract void f(Q q8, boolean z8);

    public final boolean g(Q path) {
        AbstractC3255y.i(path, "path");
        return T6.c.b(this, path);
    }

    public abstract C1422j h(Q q8);

    public abstract AbstractC1421i i(Q q8);

    public final AbstractC1421i j(Q file) {
        AbstractC3255y.i(file, "file");
        return k(file, false, false);
    }

    public abstract AbstractC1421i k(Q q8, boolean z8, boolean z9);

    public abstract Z l(Q q8);
}
