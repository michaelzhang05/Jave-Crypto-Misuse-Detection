package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.n1;
import io.sentry.s4;
import io.sentry.t1;
import io.sentry.w1;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: EnvelopeFileObserver.java */
/* loaded from: classes2.dex */
final class y0 extends FileObserver {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final t1 f18807b;

    /* renamed from: c, reason: collision with root package name */
    private final w1 f18808c;

    /* renamed from: d, reason: collision with root package name */
    private final long f18809d;

    /* compiled from: EnvelopeFileObserver.java */
    /* loaded from: classes2.dex */
    private static final class a implements io.sentry.hints.f, io.sentry.hints.k, io.sentry.hints.p, io.sentry.hints.i, io.sentry.hints.c, io.sentry.hints.j {
        boolean a;

        /* renamed from: b, reason: collision with root package name */
        boolean f18810b;

        /* renamed from: c, reason: collision with root package name */
        private CountDownLatch f18811c;

        /* renamed from: d, reason: collision with root package name */
        private final long f18812d;

        /* renamed from: e, reason: collision with root package name */
        private final w1 f18813e;

        public a(long j2, w1 w1Var) {
            a();
            this.f18812d = j2;
            this.f18813e = (w1) io.sentry.util.q.c(w1Var, "ILogger is required.");
        }

        @Override // io.sentry.hints.j
        public void a() {
            this.f18811c = new CountDownLatch(1);
            this.a = false;
            this.f18810b = false;
        }

        @Override // io.sentry.hints.k
        public boolean b() {
            return this.a;
        }

        @Override // io.sentry.hints.p
        public void c(boolean z) {
            this.f18810b = z;
            this.f18811c.countDown();
        }

        @Override // io.sentry.hints.k
        public void d(boolean z) {
            this.a = z;
        }

        @Override // io.sentry.hints.i
        public boolean e() {
            try {
                return this.f18811c.await(this.f18812d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                this.f18813e.b(s4.ERROR, "Exception while awaiting on lock.", e2);
                return false;
            }
        }

        @Override // io.sentry.hints.p
        public boolean f() {
            return this.f18810b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(String str, t1 t1Var, w1 w1Var, long j2) {
        super(str);
        this.a = str;
        this.f18807b = (t1) io.sentry.util.q.c(t1Var, "Envelope sender is required.");
        this.f18808c = (w1) io.sentry.util.q.c(w1Var, "Logger is required.");
        this.f18809d = j2;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i2, String str) {
        if (str == null || i2 != 8) {
            return;
        }
        this.f18808c.c(s4.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", Integer.valueOf(i2), this.a, str);
        n1 a2 = io.sentry.util.m.a(new a(this.f18809d, this.f18808c));
        this.f18807b.a(this.a + File.separator + str, a2);
    }
}
