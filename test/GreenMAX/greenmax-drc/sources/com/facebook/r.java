package com.facebook;

import android.os.Handler;
import com.facebook.GraphRequest;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RequestProgress.java */
/* loaded from: classes.dex */
public class r {
    private final GraphRequest a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f9383b;

    /* renamed from: c, reason: collision with root package name */
    private final long f9384c = f.s();

    /* renamed from: d, reason: collision with root package name */
    private long f9385d;

    /* renamed from: e, reason: collision with root package name */
    private long f9386e;

    /* renamed from: f, reason: collision with root package name */
    private long f9387f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RequestProgress.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ GraphRequest.i f9388f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f9389g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f9390h;

        a(GraphRequest.i iVar, long j2, long j3) {
            this.f9388f = iVar;
            this.f9389g = j2;
            this.f9390h = j3;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                this.f9388f.a(this.f9389g, this.f9390h);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Handler handler, GraphRequest graphRequest) {
        this.a = graphRequest;
        this.f9383b = handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j2) {
        long j3 = this.f9385d + j2;
        this.f9385d = j3;
        if (j3 >= this.f9386e + this.f9384c || j3 >= this.f9387f) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(long j2) {
        this.f9387f += j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (this.f9385d > this.f9386e) {
            GraphRequest.f s = this.a.s();
            long j2 = this.f9387f;
            if (j2 <= 0 || !(s instanceof GraphRequest.i)) {
                return;
            }
            long j3 = this.f9385d;
            GraphRequest.i iVar = (GraphRequest.i) s;
            Handler handler = this.f9383b;
            if (handler == null) {
                iVar.a(j3, j2);
            } else {
                handler.post(new a(iVar, j3, j2));
            }
            this.f9386e = this.f9385d;
        }
    }
}
