package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2244p2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f16731a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f16732b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f16733c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f16734d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ BinderC2249q2 f16735e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2244p2(BinderC2249q2 binderC2249q2, String str, String str2, String str3, long j8) {
        this.f16735e = binderC2249q2;
        this.f16731a = str;
        this.f16732b = str2;
        this.f16733c = str3;
        this.f16734d = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r4 r4Var;
        r4 r4Var2;
        String str = this.f16731a;
        if (str == null) {
            r4Var2 = this.f16735e.f16751a;
            r4Var2.w(this.f16732b, null);
        } else {
            C2177d3 c2177d3 = new C2177d3(this.f16733c, str, this.f16734d);
            r4Var = this.f16735e.f16751a;
            r4Var.w(this.f16732b, c2177d3);
        }
    }
}
