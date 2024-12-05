package com.mbridge.msdk.e.a;

/* loaded from: classes4.dex */
public abstract class z extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final m f19913a;

    /* renamed from: b, reason: collision with root package name */
    private long f19914b;

    /* renamed from: c, reason: collision with root package name */
    private int f19915c;

    /* renamed from: d, reason: collision with root package name */
    private String f19916d;

    public z() {
        this.f19915c = 0;
        this.f19916d = "";
        this.f19913a = null;
    }

    public abstract int a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j8) {
        this.f19914b = j8;
    }

    public final int b() {
        return this.f19915c;
    }

    public final String c() {
        return this.f19916d;
    }

    public final void a(int i8) {
        this.f19915c = i8;
    }

    public final void a(String str) {
        this.f19916d = str;
    }

    public z(m mVar) {
        this.f19915c = 0;
        this.f19916d = "";
        this.f19913a = mVar;
    }

    public z(String str) {
        super(str);
        this.f19915c = 0;
        this.f19916d = "";
        this.f19913a = null;
    }

    public z(Throwable th) {
        super(th);
        this.f19915c = 0;
        this.f19916d = "";
        this.f19913a = null;
    }
}
