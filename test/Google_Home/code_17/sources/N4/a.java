package N4;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0140a f7730f = new C0140a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f7731a;

    /* renamed from: c, reason: collision with root package name */
    private String f7733c;

    /* renamed from: d, reason: collision with root package name */
    private long f7734d;

    /* renamed from: b, reason: collision with root package name */
    private long f7732b = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f7735e = -1;

    /* renamed from: N4.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0140a {
        private C0140a() {
        }

        public /* synthetic */ C0140a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public final String a() {
        return this.f7733c;
    }

    public final String b() {
        return this.f7731a;
    }

    public final long c() {
        return this.f7735e;
    }

    public final long d() {
        return this.f7734d;
    }

    public final long e() {
        return this.f7732b;
    }

    public final void f(String packageName, long j8, String appName, long j9) {
        AbstractC3255y.i(packageName, "packageName");
        AbstractC3255y.i(appName, "appName");
        this.f7731a = packageName;
        this.f7732b = j8;
        this.f7733c = appName;
        this.f7734d = System.currentTimeMillis();
        this.f7735e = j9;
    }
}
