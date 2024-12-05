package com.mbridge.msdk.video.dynview.i.c;

import android.os.CountDownTimer;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private long f23150a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f23151b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.i.c.a f23152c;

    /* renamed from: d, reason: collision with root package name */
    private a f23153d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.dynview.i.c.a f23154a;

        public a(long j8, long j9) {
            super(j8, j9);
        }

        final void a(com.mbridge.msdk.video.dynview.i.c.a aVar) {
            this.f23154a = aVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            com.mbridge.msdk.video.dynview.i.c.a aVar = this.f23154a;
            if (aVar != null) {
                aVar.a();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j8) {
            com.mbridge.msdk.video.dynview.i.c.a aVar = this.f23154a;
            if (aVar != null) {
                aVar.a(j8);
            }
        }
    }

    private void c() {
        a aVar = this.f23153d;
        if (aVar != null) {
            aVar.cancel();
            this.f23153d = null;
        }
        if (this.f23151b <= 0) {
            this.f23151b = this.f23150a + 1000;
        }
        a aVar2 = new a(this.f23150a, this.f23151b);
        this.f23153d = aVar2;
        aVar2.a(this.f23152c);
    }

    public final b a(long j8) {
        if (j8 < 0) {
            j8 = 1000;
        }
        this.f23151b = j8;
        return this;
    }

    public final b b(long j8) {
        this.f23150a = j8;
        return this;
    }

    public final b a(com.mbridge.msdk.video.dynview.i.c.a aVar) {
        this.f23152c = aVar;
        return this;
    }

    public final void b() {
        a aVar = this.f23153d;
        if (aVar != null) {
            aVar.cancel();
            this.f23153d = null;
        }
    }

    public final void a() {
        if (this.f23153d == null) {
            c();
        }
        this.f23153d.start();
    }

    public final void a(long j8, com.mbridge.msdk.video.dynview.i.c.a aVar) {
        this.f23150a = j8;
        this.f23152c = aVar;
        c();
        a aVar2 = this.f23153d;
        if (aVar2 != null) {
            aVar2.start();
        }
    }
}
