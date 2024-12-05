package N0;

import H0.AbstractC1184s;
import H0.E;
import H0.W;
import android.database.SQLException;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r0.C3679j;
import s.AbstractC3701c;
import s.EnumC3702d;
import s.f;
import s.h;
import u.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final double f7156a;

    /* renamed from: b, reason: collision with root package name */
    private final double f7157b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7158c;

    /* renamed from: d, reason: collision with root package name */
    private final long f7159d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7160e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue f7161f;

    /* renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f7162g;

    /* renamed from: h, reason: collision with root package name */
    private final f f7163h;

    /* renamed from: i, reason: collision with root package name */
    private final E f7164i;

    /* renamed from: j, reason: collision with root package name */
    private int f7165j;

    /* renamed from: k, reason: collision with root package name */
    private long f7166k;

    /* loaded from: classes3.dex */
    private final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC1184s f7167a;

        /* renamed from: b, reason: collision with root package name */
        private final C3679j f7168b;

        @Override // java.lang.Runnable
        public void run() {
            e.this.p(this.f7167a, this.f7168b);
            e.this.f7164i.c();
            double g8 = e.this.g();
            E0.f.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(g8 / 1000.0d)) + " s for report: " + this.f7167a.d());
            e.q(g8);
        }

        private b(AbstractC1184s abstractC1184s, C3679j c3679j) {
            this.f7167a = abstractC1184s;
            this.f7168b = c3679j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(f fVar, O0.d dVar, E e8) {
        this(dVar.f7699f, dVar.f7700g, dVar.f7701h * 1000, fVar, e8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f7156a) * Math.pow(this.f7157b, h()));
    }

    private int h() {
        int max;
        if (this.f7166k == 0) {
            this.f7166k = o();
        }
        int o8 = (int) ((o() - this.f7166k) / this.f7158c);
        if (l()) {
            max = Math.min(100, this.f7165j + o8);
        } else {
            max = Math.max(0, this.f7165j - o8);
        }
        if (this.f7165j != max) {
            this.f7165j = max;
            this.f7166k = o();
        }
        return max;
    }

    private boolean k() {
        if (this.f7161f.size() < this.f7160e) {
            return true;
        }
        return false;
    }

    private boolean l() {
        if (this.f7161f.size() == this.f7160e) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            l.a(this.f7163h, EnumC3702d.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(C3679j c3679j, boolean z8, AbstractC1184s abstractC1184s, Exception exc) {
        if (exc != null) {
            c3679j.d(exc);
            return;
        }
        if (z8) {
            j();
        }
        c3679j.e(abstractC1184s);
    }

    private long o() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final AbstractC1184s abstractC1184s, final C3679j c3679j) {
        final boolean z8;
        E0.f.f().b("Sending report through Google DataTransport: " + abstractC1184s.d());
        if (SystemClock.elapsedRealtime() - this.f7159d < AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f7163h.a(AbstractC3701c.e(abstractC1184s.b()), new h() { // from class: N0.c
            @Override // s.h
            public final void a(Exception exc) {
                e.this.n(c3679j, z8, abstractC1184s, exc);
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
    public C3679j i(AbstractC1184s abstractC1184s, boolean z8) {
        synchronized (this.f7161f) {
            try {
                C3679j c3679j = new C3679j();
                if (z8) {
                    this.f7164i.b();
                    if (k()) {
                        E0.f.f().b("Enqueueing report: " + abstractC1184s.d());
                        E0.f.f().b("Queue size: " + this.f7161f.size());
                        this.f7162g.execute(new b(abstractC1184s, c3679j));
                        E0.f.f().b("Closing task for report: " + abstractC1184s.d());
                        c3679j.e(abstractC1184s);
                        return c3679j;
                    }
                    h();
                    E0.f.f().b("Dropping report due to queue being full: " + abstractC1184s.d());
                    this.f7164i.a();
                    c3679j.e(abstractC1184s);
                    return c3679j;
                }
                p(abstractC1184s, c3679j);
                return c3679j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: N0.d
            @Override // java.lang.Runnable
            public final void run() {
                e.this.m(countDownLatch);
            }
        }).start();
        W.g(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    e(double d8, double d9, long j8, f fVar, E e8) {
        this.f7156a = d8;
        this.f7157b = d9;
        this.f7158c = j8;
        this.f7163h = fVar;
        this.f7164i = e8;
        this.f7159d = SystemClock.elapsedRealtime();
        int i8 = (int) d8;
        this.f7160e = i8;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i8);
        this.f7161f = arrayBlockingQueue;
        this.f7162g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f7165j = 0;
        this.f7166k = 0L;
    }
}
