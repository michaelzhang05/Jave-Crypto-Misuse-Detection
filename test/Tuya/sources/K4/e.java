package K4;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private String f5971a;

    /* renamed from: b, reason: collision with root package name */
    private String f5972b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5973c;

    /* renamed from: d, reason: collision with root package name */
    private long f5974d;

    public e(String path) {
        AbstractC3159y.i(path, "path");
        this.f5971a = path;
    }

    public final long a() {
        return this.f5974d;
    }

    public final String b() {
        return this.f5971a;
    }

    public final boolean c() {
        return AbstractC3159y.d("mounted", this.f5972b);
    }

    public final boolean d() {
        return this.f5973c;
    }

    public final void e(long j8) {
        this.f5974d = j8;
    }

    public final void f(boolean z8) {
        this.f5973c = z8;
    }

    public final void g(String str) {
        this.f5972b = str;
    }
}
