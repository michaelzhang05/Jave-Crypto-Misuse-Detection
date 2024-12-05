package com.mbridge.msdk.e.a;

/* loaded from: classes4.dex */
public abstract class z extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final m f18858a;

    /* renamed from: b, reason: collision with root package name */
    private long f18859b;

    /* renamed from: c, reason: collision with root package name */
    private int f18860c;

    /* renamed from: d, reason: collision with root package name */
    private String f18861d;

    public z() {
        this.f18860c = 0;
        this.f18861d = "";
        this.f18858a = null;
    }

    public abstract int a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j8) {
        this.f18859b = j8;
    }

    public final int b() {
        return this.f18860c;
    }

    public final String c() {
        return this.f18861d;
    }

    public final void a(int i8) {
        this.f18860c = i8;
    }

    public final void a(String str) {
        this.f18861d = str;
    }

    public z(m mVar) {
        this.f18860c = 0;
        this.f18861d = "";
        this.f18858a = mVar;
    }

    public z(String str) {
        super(str);
        this.f18860c = 0;
        this.f18861d = "";
        this.f18858a = null;
    }

    public z(Throwable th) {
        super(th);
        this.f18860c = 0;
        this.f18861d = "";
        this.f18858a = null;
    }
}
