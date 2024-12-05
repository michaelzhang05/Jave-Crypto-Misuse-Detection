package com.flurry.sdk;

import com.flurry.sdk.k1;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class j1 {
    private Timer a;

    /* renamed from: b, reason: collision with root package name */
    private a f9955b;

    /* renamed from: c, reason: collision with root package name */
    k1 f9956c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends TimerTask {
        private a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            d1.c(3, "HttpRequestTimeoutTimer", "HttpRequest timed out. Cancelling.");
            k1 k1Var = j1.this.f9956c;
            d1.c(3, "HttpStreamRequest", "Timeout (" + (System.currentTimeMillis() - k1Var.x) + "MS) for url: " + k1Var.l);
            k1Var.A = 629;
            k1Var.F = true;
            k1Var.c();
            d1.c(3, "HttpStreamRequest", "Cancelling http request: " + k1Var.l);
            synchronized (k1Var.f9977k) {
                k1Var.v = true;
            }
            if (k1Var.u) {
                return;
            }
            k1Var.u = true;
            if (k1Var.t != null) {
                new k1.a().start();
            }
        }

        /* synthetic */ a(j1 j1Var, byte b2) {
            this();
        }
    }

    public j1(k1 k1Var) {
        this.f9956c = k1Var;
    }

    public final synchronized void a() {
        Timer timer = this.a;
        if (timer != null) {
            timer.cancel();
            this.a = null;
            d1.c(3, "HttpRequestTimeoutTimer", "HttpRequestTimeoutTimer stopped.");
        }
        this.f9955b = null;
    }

    public final synchronized void b(long j2) {
        byte b2 = 0;
        if (this.a != null) {
            a();
        }
        this.a = new Timer("HttpRequestTimeoutTimer");
        a aVar = new a(this, b2);
        this.f9955b = aVar;
        this.a.schedule(aVar, j2);
        d1.c(3, "HttpRequestTimeoutTimer", "HttpRequestTimeoutTimer started: " + j2 + "MS");
    }
}
