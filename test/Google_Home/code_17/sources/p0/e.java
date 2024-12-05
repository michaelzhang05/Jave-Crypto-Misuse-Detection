package P0;

import G0.h;
import J0.AbstractC1286v;
import J0.I;
import J0.a0;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q0.C3826j;
import s.AbstractC3983d;
import s.f;
import s.i;
import s.k;
import u.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final double f8675a;

    /* renamed from: b, reason: collision with root package name */
    private final double f8676b;

    /* renamed from: c, reason: collision with root package name */
    private final long f8677c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8678d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8679e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f8680f;

    /* renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f8681g;

    /* renamed from: h, reason: collision with root package name */
    private final i f8682h;

    /* renamed from: i, reason: collision with root package name */
    private final I f8683i;

    /* renamed from: j, reason: collision with root package name */
    private int f8684j;

    /* renamed from: k, reason: collision with root package name */
    private long f8685k;

    /* loaded from: classes3.dex */
    private final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1286v f8686a;

        /* renamed from: b, reason: collision with root package name */
        private final C3826j f8687b;

        @Override // java.lang.Runnable
        public void run() {
            e.this.p(this.f8686a, this.f8687b);
            e.this.f8683i.c();
            double g8 = e.this.g();
            h.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(g8 / 1000.0d)) + " s for report: " + this.f8686a.d());
            e.q(g8);
        }

        private b(AbstractC1286v abstractC1286v, C3826j c3826j) {
            this.f8686a = abstractC1286v;
            this.f8687b = c3826j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(i iVar, Q0.d dVar, I i8) {
        this(dVar.f9098f, dVar.f9099g, dVar.f9100h * 1000, iVar, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f8675a) * Math.pow(this.f8676b, h()));
    }

    private int h() {
        int max;
        if (this.f8685k == 0) {
            this.f8685k = o();
        }
        int o8 = (int) ((o() - this.f8685k) / this.f8677c);
        if (l()) {
            max = Math.min(100, this.f8684j + o8);
        } else {
            max = Math.max(0, this.f8684j - o8);
        }
        if (this.f8684j != max) {
            this.f8684j = max;
            this.f8685k = o();
        }
        return max;
    }

    private boolean k() {
        if (this.f8680f.size() < this.f8679e) {
            return true;
        }
        return false;
    }

    private boolean l() {
        if (this.f8680f.size() == this.f8679e) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            l.a(this.f8682h, f.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(C3826j c3826j, boolean z8, AbstractC1286v abstractC1286v, Exception exc) {
        if (exc != null) {
            c3826j.d(exc);
            return;
        }
        if (z8) {
            j();
        }
        c3826j.e(abstractC1286v);
    }

    private long o() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final AbstractC1286v abstractC1286v, final C3826j c3826j) {
        final boolean z8;
        h.f().b("Sending report through Google DataTransport: " + abstractC1286v.d());
        if (SystemClock.elapsedRealtime() - this.f8678d < AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f8682h.a(AbstractC3983d.h(abstractC1286v.b()), new k() { // from class: P0.c
            @Override // s.k
            public final void a(Exception exc) {
                e.this.n(c3826j, z8, abstractC1286v, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(double d8) {
        try {
            Thread.sleep((long) d8);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3826j i(AbstractC1286v abstractC1286v, boolean z8) {
        synchronized (this.f8680f) {
            try {
                C3826j c3826j = new C3826j();
                if (z8) {
                    this.f8683i.b();
                    if (k()) {
                        h.f().b("Enqueueing report: " + abstractC1286v.d());
                        h.f().b("Queue size: " + this.f8680f.size());
                        this.f8681g.execute(new b(abstractC1286v, c3826j));
                        h.f().b("Closing task for report: " + abstractC1286v.d());
                        c3826j.e(abstractC1286v);
                        return c3826j;
                    }
                    h();
                    h.f().b("Dropping report due to queue being full: " + abstractC1286v.d());
                    this.f8683i.a();
                    c3826j.e(abstractC1286v);
                    return c3826j;
                }
                p(abstractC1286v, c3826j);
                return c3826j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: P0.d
            @Override // java.lang.Runnable
            public final void run() {
                e.this.m(countDownLatch);
            }
        }).start();
        a0.g(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    e(double d8, double d9, long j8, i iVar, I i8) {
        this.f8675a = d8;
        this.f8676b = d9;
        this.f8677c = j8;
        this.f8682h = iVar;
        this.f8683i = i8;
        this.f8678d = SystemClock.elapsedRealtime();
        int i9 = (int) d8;
        this.f8679e = i9;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i9);
        this.f8680f = arrayBlockingQueue;
        this.f8681g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f8684j = 0;
        this.f8685k = 0L;
    }
}
