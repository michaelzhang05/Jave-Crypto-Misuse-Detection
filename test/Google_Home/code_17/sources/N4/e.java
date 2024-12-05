package N4;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private String f7750a;

    /* renamed from: b, reason: collision with root package name */
    private String f7751b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7752c;

    /* renamed from: d, reason: collision with root package name */
    private long f7753d;

    public e(String path) {
        AbstractC3255y.i(path, "path");
        this.f7750a = path;
    }

    public final long a() {
        return this.f7753d;
    }

    public final String b() {
        return this.f7750a;
    }

    public final boolean c() {
        return AbstractC3255y.d("mounted", this.f7751b);
    }

    public final boolean d() {
        return this.f7752c;
    }

    public final void e(long j8) {
        this.f7753d = j8;
    }

    public final void f(boolean z8) {
        this.f7752c = z8;
    }

    public final void g(String str) {
        this.f7751b = str;
    }
}
