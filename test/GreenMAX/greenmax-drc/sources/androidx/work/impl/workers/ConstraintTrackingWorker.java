package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.j;
import androidx.work.impl.m.c;
import androidx.work.impl.m.d;
import androidx.work.impl.n.p;
import androidx.work.n;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements c {

    /* renamed from: f, reason: collision with root package name */
    private static final String f2131f = n.f("ConstraintTrkngWrkr");

    /* renamed from: g, reason: collision with root package name */
    private WorkerParameters f2132g;

    /* renamed from: h, reason: collision with root package name */
    final Object f2133h;

    /* renamed from: i, reason: collision with root package name */
    volatile boolean f2134i;

    /* renamed from: j, reason: collision with root package name */
    androidx.work.impl.utils.o.c<ListenableWorker.a> f2135j;

    /* renamed from: k, reason: collision with root package name */
    private ListenableWorker f2136k;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.e.c.a.a.a f2138f;

        b(e.e.c.a.a.a aVar) {
            this.f2138f = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f2133h) {
                if (ConstraintTrackingWorker.this.f2134i) {
                    ConstraintTrackingWorker.this.d();
                } else {
                    ConstraintTrackingWorker.this.f2135j.s(this.f2138f);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f2132g = workerParameters;
        this.f2133h = new Object();
        this.f2134i = false;
        this.f2135j = androidx.work.impl.utils.o.c.u();
    }

    public WorkDatabase a() {
        return j.p(getApplicationContext()).t();
    }

    @Override // androidx.work.impl.m.c
    public void b(List<String> list) {
        n.c().a(f2131f, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f2133h) {
            this.f2134i = true;
        }
    }

    void c() {
        this.f2135j.q(ListenableWorker.a.a());
    }

    void d() {
        this.f2135j.q(ListenableWorker.a.b());
    }

    @Override // androidx.work.impl.m.c
    public void e(List<String> list) {
    }

    void f() {
        String j2 = getInputData().j("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(j2)) {
            n.c().b(f2131f, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        ListenableWorker createWorkerWithDefaultFallback = getWorkerFactory().createWorkerWithDefaultFallback(getApplicationContext(), j2, this.f2132g);
        this.f2136k = createWorkerWithDefaultFallback;
        if (createWorkerWithDefaultFallback == null) {
            n.c().a(f2131f, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        p m = a().j().m(getId().toString());
        if (m == null) {
            c();
            return;
        }
        d dVar = new d(getApplicationContext(), getTaskExecutor(), this);
        dVar.d(Collections.singletonList(m));
        if (dVar.c(getId().toString())) {
            n.c().a(f2131f, String.format("Constraints met for delegate %s", j2), new Throwable[0]);
            try {
                e.e.c.a.a.a<ListenableWorker.a> startWork = this.f2136k.startWork();
                startWork.d(new b(startWork), getBackgroundExecutor());
                return;
            } catch (Throwable th) {
                n c2 = n.c();
                String str = f2131f;
                c2.a(str, String.format("Delegated worker %s threw exception in startWork.", j2), th);
                synchronized (this.f2133h) {
                    if (this.f2134i) {
                        n.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        d();
                    } else {
                        c();
                    }
                    return;
                }
            }
        }
        n.c().a(f2131f, String.format("Constraints not met for delegate %s. Requesting retry.", j2), new Throwable[0]);
        d();
    }

    @Override // androidx.work.ListenableWorker
    public androidx.work.impl.utils.p.a getTaskExecutor() {
        return j.p(getApplicationContext()).u();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f2136k;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f2136k;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f2136k.stop();
    }

    @Override // androidx.work.ListenableWorker
    public e.e.c.a.a.a<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f2135j;
    }
}
