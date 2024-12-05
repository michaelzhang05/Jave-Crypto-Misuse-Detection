package K4;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0115a f5951f = new C0115a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f5952a;

    /* renamed from: c, reason: collision with root package name */
    private String f5954c;

    /* renamed from: d, reason: collision with root package name */
    private long f5955d;

    /* renamed from: b, reason: collision with root package name */
    private long f5953b = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f5956e = -1;

    /* renamed from: K4.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0115a {
        private C0115a() {
        }

        public /* synthetic */ C0115a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public final String a() {
        return this.f5954c;
    }

    public final String b() {
        return this.f5952a;
    }

    public final long c() {
        return this.f5956e;
    }

    public final long d() {
        return this.f5955d;
    }

    public final long e() {
        return this.f5953b;
    }

    public final void f(String packageName, long j8, String appName, long j9) {
        AbstractC3159y.i(packageName, "packageName");
        AbstractC3159y.i(appName, "appName");
        this.f5952a = packageName;
        this.f5953b = j8;
        this.f5954c = appName;
        this.f5955d = System.currentTimeMillis();
        this.f5956e = j9;
    }
}
