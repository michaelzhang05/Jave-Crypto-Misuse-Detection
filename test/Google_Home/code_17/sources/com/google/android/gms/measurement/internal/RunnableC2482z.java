package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2482z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17931a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f17932b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C2308a f17933c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2482z(C2308a c2308a, String str, long j8) {
        this.f17931a = str;
        this.f17932b = j8;
        this.f17933c = c2308a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2308a.C(this.f17933c, this.f17931a, this.f17932b);
    }
}
