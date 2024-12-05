package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class T3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f17351a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f17352b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public T3(A3 a32, long j8) {
        this.f17351a = j8;
        this.f17352b = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17352b.f().f17823m.b(this.f17351a);
        this.f17352b.c().F().b("Session timeout duration set", Long.valueOf(this.f17351a));
    }
}
