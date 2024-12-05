package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17428a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f17429b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C2308a f17430c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z(C2308a c2308a, String str, long j8) {
        this.f17428a = str;
        this.f17429b = j8;
        this.f17430c = c2308a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2308a.v(this.f17430c, this.f17428a, this.f17429b);
    }
}
