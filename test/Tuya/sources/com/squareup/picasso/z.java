package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import i2.C2776d;
import i2.InterfaceC2773a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    final HandlerThread f23419a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC2773a f23420b;

    /* renamed from: c, reason: collision with root package name */
    final Handler f23421c;

    /* renamed from: d, reason: collision with root package name */
    long f23422d;

    /* renamed from: e, reason: collision with root package name */
    long f23423e;

    /* renamed from: f, reason: collision with root package name */
    long f23424f;

    /* renamed from: g, reason: collision with root package name */
    long f23425g;

    /* renamed from: h, reason: collision with root package name */
    long f23426h;

    /* renamed from: i, reason: collision with root package name */
    long f23427i;

    /* renamed from: j, reason: collision with root package name */
    long f23428j;

    /* renamed from: k, reason: collision with root package name */
    long f23429k;

    /* renamed from: l, reason: collision with root package name */
    int f23430l;

    /* renamed from: m, reason: collision with root package name */
    int f23431m;

    /* renamed from: n, reason: collision with root package name */
    int f23432n;

    /* loaded from: classes4.dex */
    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final z f23433a;

        /* renamed from: com.squareup.picasso.z$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class RunnableC0443a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Message f23434a;

            RunnableC0443a(Message message) {
                this.f23434a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f23434a.what);
            }
        }

        a(Looper looper, z zVar) {
            super(looper);
            this.f23433a = zVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                s.f23315o.post(new RunnableC0443a(message));
                                return;
                            } else {
                                this.f23433a.l((Long) message.obj);
                                return;
                            }
                        }
                        this.f23433a.i(message.arg1);
                        return;
                    }
                    this.f23433a.h(message.arg1);
                    return;
                }
                this.f23433a.k();
                return;
            }
            this.f23433a.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(InterfaceC2773a interfaceC2773a) {
        this.f23420b = interfaceC2773a;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f23419a = handlerThread;
        handlerThread.start();
        C.i(handlerThread.getLooper());
        this.f23421c = new a(handlerThread.getLooper(), this);
    }

    private static long g(int i8, long j8) {
        return j8 / i8;
    }

    private void m(Bitmap bitmap, int i8) {
        int j8 = C.j(bitmap);
        Handler handler = this.f23421c;
        handler.sendMessage(handler.obtainMessage(i8, j8, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2776d a() {
        return new C2776d(this.f23420b.b(), this.f23420b.size(), this.f23422d, this.f23423e, this.f23424f, this.f23425g, this.f23426h, this.f23427i, this.f23428j, this.f23429k, this.f23430l, this.f23431m, this.f23432n, System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Bitmap bitmap) {
        m(bitmap, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Bitmap bitmap) {
        m(bitmap, 3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        this.f23421c.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.f23421c.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(long j8) {
        Handler handler = this.f23421c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j8)));
    }

    void h(long j8) {
        int i8 = this.f23431m + 1;
        this.f23431m = i8;
        long j9 = this.f23425g + j8;
        this.f23425g = j9;
        this.f23428j = g(i8, j9);
    }

    void i(long j8) {
        this.f23432n++;
        long j9 = this.f23426h + j8;
        this.f23426h = j9;
        this.f23429k = g(this.f23431m, j9);
    }

    void j() {
        this.f23422d++;
    }

    void k() {
        this.f23423e++;
    }

    void l(Long l8) {
        this.f23430l++;
        long longValue = this.f23424f + l8.longValue();
        this.f23424f = longValue;
        this.f23427i = g(this.f23430l, longValue);
    }
}
