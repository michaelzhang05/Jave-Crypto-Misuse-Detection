package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import l2.C3311d;
import l2.InterfaceC3308a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    final HandlerThread f24474a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC3308a f24475b;

    /* renamed from: c, reason: collision with root package name */
    final Handler f24476c;

    /* renamed from: d, reason: collision with root package name */
    long f24477d;

    /* renamed from: e, reason: collision with root package name */
    long f24478e;

    /* renamed from: f, reason: collision with root package name */
    long f24479f;

    /* renamed from: g, reason: collision with root package name */
    long f24480g;

    /* renamed from: h, reason: collision with root package name */
    long f24481h;

    /* renamed from: i, reason: collision with root package name */
    long f24482i;

    /* renamed from: j, reason: collision with root package name */
    long f24483j;

    /* renamed from: k, reason: collision with root package name */
    long f24484k;

    /* renamed from: l, reason: collision with root package name */
    int f24485l;

    /* renamed from: m, reason: collision with root package name */
    int f24486m;

    /* renamed from: n, reason: collision with root package name */
    int f24487n;

    /* loaded from: classes4.dex */
    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final z f24488a;

        /* renamed from: com.squareup.picasso.z$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class RunnableC0439a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Message f24489a;

            RunnableC0439a(Message message) {
                this.f24489a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f24489a.what);
            }
        }

        a(Looper looper, z zVar) {
            super(looper);
            this.f24488a = zVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i8 = message.what;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                s.f24370o.post(new RunnableC0439a(message));
                                return;
                            } else {
                                this.f24488a.l((Long) message.obj);
                                return;
                            }
                        }
                        this.f24488a.i(message.arg1);
                        return;
                    }
                    this.f24488a.h(message.arg1);
                    return;
                }
                this.f24488a.k();
                return;
            }
            this.f24488a.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(InterfaceC3308a interfaceC3308a) {
        this.f24475b = interfaceC3308a;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f24474a = handlerThread;
        handlerThread.start();
        C.i(handlerThread.getLooper());
        this.f24476c = new a(handlerThread.getLooper(), this);
    }

    private static long g(int i8, long j8) {
        return j8 / i8;
    }

    private void m(Bitmap bitmap, int i8) {
        int j8 = C.j(bitmap);
        Handler handler = this.f24476c;
        handler.sendMessage(handler.obtainMessage(i8, j8, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3311d a() {
        return new C3311d(this.f24475b.b(), this.f24475b.size(), this.f24477d, this.f24478e, this.f24479f, this.f24480g, this.f24481h, this.f24482i, this.f24483j, this.f24484k, this.f24485l, this.f24486m, this.f24487n, System.currentTimeMillis());
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
        this.f24476c.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.f24476c.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(long j8) {
        Handler handler = this.f24476c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j8)));
    }

    void h(long j8) {
        int i8 = this.f24486m + 1;
        this.f24486m = i8;
        long j9 = this.f24480g + j8;
        this.f24480g = j9;
        this.f24483j = g(i8, j9);
    }

    void i(long j8) {
        this.f24487n++;
        long j9 = this.f24481h + j8;
        this.f24481h = j9;
        this.f24484k = g(this.f24486m, j9);
    }

    void j() {
        this.f24477d++;
    }

    void k() {
        this.f24478e++;
    }

    void l(Long l8) {
        this.f24485l++;
        long longValue = this.f24479f + l8.longValue();
        this.f24479f = longValue;
        this.f24482i = g(this.f24485l, longValue);
    }
}
