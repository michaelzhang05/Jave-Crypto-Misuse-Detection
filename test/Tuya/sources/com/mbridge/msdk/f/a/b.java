package com.mbridge.msdk.f.a;

import android.os.CountDownTimer;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.f.a.a f18986a;

    /* renamed from: b, reason: collision with root package name */
    private long f18987b;

    /* renamed from: c, reason: collision with root package name */
    private a f18988c;

    /* renamed from: d, reason: collision with root package name */
    private long f18989d = 0;

    /* loaded from: classes4.dex */
    private static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.f.a.a f18990a;

        public a(long j8, long j9) {
            super(j8, j9);
        }

        final void a(com.mbridge.msdk.f.a.a aVar) {
            this.f18990a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            com.mbridge.msdk.f.a.a aVar = this.f18990a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j8) {
            com.mbridge.msdk.f.a.a aVar = this.f18990a;
            if (aVar != null) {
                aVar.onTick(j8);
            }
        }
    }

    public final void a() {
        a aVar = this.f18988c;
        if (aVar != null) {
            aVar.cancel();
            this.f18988c = null;
        }
    }

    public final b b(long j8) {
        this.f18989d = j8;
        return this;
    }

    public final void b() {
        a aVar = this.f18988c;
        if (aVar == null) {
            if (aVar != null) {
                aVar.cancel();
                this.f18988c = null;
            }
            if (this.f18987b <= 0) {
                this.f18987b = this.f18989d + 1000;
            }
            a aVar2 = new a(this.f18989d, this.f18987b);
            this.f18988c = aVar2;
            aVar2.a(this.f18986a);
        }
        this.f18988c.start();
    }

    public final b a(long j8) {
        if (j8 < 0) {
            j8 = 1000;
        }
        this.f18987b = j8;
        return this;
    }

    public final b a(com.mbridge.msdk.f.a.a aVar) {
        this.f18986a = aVar;
        return this;
    }
}
