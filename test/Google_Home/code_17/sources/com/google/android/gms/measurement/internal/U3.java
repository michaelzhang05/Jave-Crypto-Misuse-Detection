package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class U3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17359a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17360b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Object f17361c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ long f17362d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ A3 f17363e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U3(A3 a32, String str, String str2, Object obj, long j8) {
        this.f17359a = str;
        this.f17360b = str2;
        this.f17361c = obj;
        this.f17362d = j8;
        this.f17363e = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17363e.i0(this.f17359a, this.f17360b, this.f17361c, this.f17362d);
    }
}
