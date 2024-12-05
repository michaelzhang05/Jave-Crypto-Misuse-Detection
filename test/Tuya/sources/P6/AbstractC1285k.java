package P6;

import P6.Q;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: P6.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1285k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8089a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1285k f8090b;

    /* renamed from: c, reason: collision with root package name */
    public static final Q f8091c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1285k f8092d;

    /* renamed from: P6.k$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        AbstractC1285k c1292s;
        try {
            Class.forName("java.nio.file.Files");
            c1292s = new K();
        } catch (ClassNotFoundException unused) {
            c1292s = new C1292s();
        }
        f8090b = c1292s;
        Q.a aVar = Q.f8001b;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC3159y.h(property, "getProperty(\"java.io.tmpdir\")");
        f8091c = Q.a.e(aVar, property, false, 1, null);
        ClassLoader classLoader = Q6.h.class.getClassLoader();
        AbstractC3159y.h(classLoader, "ResourceFileSystem::class.java.classLoader");
        f8092d = new Q6.h(classLoader, false);
    }

    public abstract void a(Q q8, Q q9);

    public final void b(Q dir, boolean z8) {
        AbstractC3159y.i(dir, "dir");
        Q6.c.a(this, dir, z8);
    }

    public final void c(Q dir) {
        AbstractC3159y.i(dir, "dir");
        d(dir, false);
    }

    public abstract void d(Q q8, boolean z8);

    public final void e(Q path) {
        AbstractC3159y.i(path, "path");
        f(path, false);
    }

    public abstract void f(Q q8, boolean z8);

    public final boolean g(Q path) {
        AbstractC3159y.i(path, "path");
        return Q6.c.b(this, path);
    }

    public abstract C1284j h(Q q8);

    public abstract AbstractC1283i i(Q q8);

    public final AbstractC1283i j(Q file) {
        AbstractC3159y.i(file, "file");
        return k(file, false, false);
    }

    public abstract AbstractC1283i k(Q q8, boolean z8, boolean z9);

    public abstract Z l(Q q8);
}
