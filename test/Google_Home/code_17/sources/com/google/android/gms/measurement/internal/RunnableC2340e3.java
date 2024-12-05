package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.e3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2340e3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17558a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17559b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17560c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ long f17561d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ W2 f17562e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2340e3(W2 w22, String str, String str2, String str3, long j8) {
        this.f17558a = str;
        this.f17559b = str2;
        this.f17560c = str3;
        this.f17561d = j8;
        this.f17562e = w22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I5 i52;
        I5 i53;
        String str = this.f17558a;
        if (str == null) {
            i53 = this.f17562e.f17393a;
            i53.F(this.f17559b, null);
        } else {
            C2459v4 c2459v4 = new C2459v4(this.f17560c, str, this.f17561d);
            i52 = this.f17562e.f17393a;
            i52.F(this.f17559b, c2459v4);
        }
    }
}
