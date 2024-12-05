package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.n.p;

/* compiled from: WorkForegroundRunnable.java */
/* loaded from: classes.dex */
public class k implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    static final String f2072f = androidx.work.n.f("WorkForegroundRunnable");

    /* renamed from: g, reason: collision with root package name */
    final androidx.work.impl.utils.o.c<Void> f2073g = androidx.work.impl.utils.o.c.u();

    /* renamed from: h, reason: collision with root package name */
    final Context f2074h;

    /* renamed from: i, reason: collision with root package name */
    final p f2075i;

    /* renamed from: j, reason: collision with root package name */
    final ListenableWorker f2076j;

    /* renamed from: k, reason: collision with root package name */
    final androidx.work.i f2077k;
    final androidx.work.impl.utils.p.a l;

    /* compiled from: WorkForegroundRunnable.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.o.c f2078f;

        a(androidx.work.impl.utils.o.c cVar) {
            this.f2078f = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2078f.s(k.this.f2076j.getForegroundInfoAsync());
        }
    }

    /* compiled from: WorkForegroundRunnable.java */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.o.c f2080f;

        b(androidx.work.impl.utils.o.c cVar) {
            this.f2080f = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.work.h hVar = (androidx.work.h) this.f2080f.get();
                if (hVar != null) {
                    androidx.work.n.c().a(k.f2072f, String.format("Updating notification for %s", k.this.f2075i.f2020e), new Throwable[0]);
                    k.this.f2076j.setRunInForeground(true);
                    k kVar = k.this;
                    kVar.f2073g.s(kVar.f2077k.a(kVar.f2074h, kVar.f2076j.getId(), hVar));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", k.this.f2075i.f2020e));
            } catch (Throwable th) {
                k.this.f2073g.r(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public k(Context context, p pVar, ListenableWorker listenableWorker, androidx.work.i iVar, androidx.work.impl.utils.p.a aVar) {
        this.f2074h = context;
        this.f2075i = pVar;
        this.f2076j = listenableWorker;
        this.f2077k = iVar;
        this.l = aVar;
    }

    public e.e.c.a.a.a<Void> a() {
        return this.f2073g;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (this.f2075i.s && !androidx.core.os.a.c()) {
            androidx.work.impl.utils.o.c u = androidx.work.impl.utils.o.c.u();
            this.l.a().execute(new a(u));
            u.d(new b(u), this.l.a());
            return;
        }
        this.f2073g.q(null);
    }
}
