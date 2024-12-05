package com.mbridge.msdk.f.a;

import android.os.CountDownTimer;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.f.a.a f20041a;

    /* renamed from: b, reason: collision with root package name */
    private long f20042b;

    /* renamed from: c, reason: collision with root package name */
    private a f20043c;

    /* renamed from: d, reason: collision with root package name */
    private long f20044d = 0;

    /* loaded from: classes4.dex */
    private static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.f.a.a f20045a;

        public a(long j8, long j9) {
            super(j8, j9);
        }

        final void a(com.mbridge.msdk.f.a.a aVar) {
            this.f20045a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            com.mbridge.msdk.f.a.a aVar = this.f20045a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j8) {
            com.mbridge.msdk.f.a.a aVar = this.f20045a;
            if (aVar != null) {
                aVar.onTick(j8);
            }
        }
    }

    public final void a() {
        a aVar = this.f20043c;
        if (aVar != null) {
            aVar.cancel();
            this.f20043c = null;
        }
    }

    public final b b(long j8) {
        this.f20044d = j8;
        return this;
    }

    public final void b() {
        a aVar = this.f20043c;
        if (aVar == null) {
            if (aVar != null) {
                aVar.cancel();
                this.f20043c = null;
            }
            if (this.f20042b <= 0) {
                this.f20042b = this.f20044d + 1000;
            }
            a aVar2 = new a(this.f20044d, this.f20042b);
            this.f20043c = aVar2;
            aVar2.a(this.f20041a);
        }
        this.f20043c.start();
    }

    public final b a(long j8) {
        if (j8 < 0) {
            j8 = 1000;
        }
        this.f20042b = j8;
        return this;
    }

    public final b a(com.mbridge.msdk.f.a.a aVar) {
        this.f20041a = aVar;
        return this;
    }
}
