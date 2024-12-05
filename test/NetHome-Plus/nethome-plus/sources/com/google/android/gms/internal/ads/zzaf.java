package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class zzaf extends Exception {

    /* renamed from: f, reason: collision with root package name */
    private final zzp f12686f;

    /* renamed from: g, reason: collision with root package name */
    private long f12687g;

    public zzaf() {
        this.f12686f = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j2) {
        this.f12687g = j2;
    }

    public zzaf(zzp zzpVar) {
        this.f12686f = zzpVar;
    }

    public zzaf(String str) {
        super(str);
        this.f12686f = null;
    }

    public zzaf(Throwable th) {
        super(th);
        this.f12686f = null;
    }
}
