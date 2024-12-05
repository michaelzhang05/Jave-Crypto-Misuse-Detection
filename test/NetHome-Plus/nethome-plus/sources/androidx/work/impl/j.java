package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.n;
import androidx.work.p;
import androidx.work.q;
import androidx.work.s;
import androidx.work.u;
import androidx.work.y;
import androidx.work.z;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkManagerImpl.java */
/* loaded from: classes.dex */
public class j extends y {
    private static final String a = n.f("WorkManagerImpl");

    /* renamed from: b, reason: collision with root package name */
    private static j f1932b = null;

    /* renamed from: c, reason: collision with root package name */
    private static j f1933c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final Object f1934d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private Context f1935e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.work.b f1936f;

    /* renamed from: g, reason: collision with root package name */
    private WorkDatabase f1937g;

    /* renamed from: h, reason: collision with root package name */
    private androidx.work.impl.utils.p.a f1938h;

    /* renamed from: i, reason: collision with root package name */
    private List<e> f1939i;

    /* renamed from: j, reason: collision with root package name */
    private d f1940j;

    /* renamed from: k, reason: collision with root package name */
    private androidx.work.impl.utils.e f1941k;
    private boolean l;
    private BroadcastReceiver.PendingResult m;

    public j(Context context, androidx.work.b bVar, androidx.work.impl.utils.p.a aVar) {
        this(context, bVar, aVar, context.getResources().getBoolean(u.a));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
    
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        if (androidx.work.impl.j.f1933c != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        androidx.work.impl.j.f1933c = new androidx.work.impl.j(r4, r5, new androidx.work.impl.utils.p.b(r5.l()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        androidx.work.impl.j.f1932b = androidx.work.impl.j.f1933c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(android.content.Context r4, androidx.work.b r5) {
        /*
            java.lang.Object r0 = androidx.work.impl.j.f1934d
            monitor-enter(r0)
            androidx.work.impl.j r1 = androidx.work.impl.j.f1932b     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L14
            androidx.work.impl.j r2 = androidx.work.impl.j.f1933c     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
            throw r4     // Catch: java.lang.Throwable -> L34
        L14:
            if (r1 != 0) goto L32
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.j r1 = androidx.work.impl.j.f1933c     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L2e
            androidx.work.impl.j r1 = new androidx.work.impl.j     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.utils.p.b r2 = new androidx.work.impl.utils.p.b     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.Executor r3 = r5.l()     // Catch: java.lang.Throwable -> L34
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.j.f1933c = r1     // Catch: java.lang.Throwable -> L34
        L2e:
            androidx.work.impl.j r4 = androidx.work.impl.j.f1933c     // Catch: java.lang.Throwable -> L34
            androidx.work.impl.j.f1932b = r4     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.j.i(android.content.Context, androidx.work.b):void");
    }

    @Deprecated
    public static j o() {
        synchronized (f1934d) {
            j jVar = f1932b;
            if (jVar != null) {
                return jVar;
            }
            return f1933c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static j p(Context context) {
        j o;
        synchronized (f1934d) {
            o = o();
            if (o == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof b.c) {
                    i(applicationContext, ((b.c) applicationContext).a());
                    o = p(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return o;
    }

    private void v(Context context, androidx.work.b bVar, androidx.work.impl.utils.p.a aVar, WorkDatabase workDatabase, List<e> list, d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f1935e = applicationContext;
        this.f1936f = bVar;
        this.f1938h = aVar;
        this.f1937g = workDatabase;
        this.f1939i = list;
        this.f1940j = dVar;
        this.f1941k = new androidx.work.impl.utils.e(workDatabase);
        this.l = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f1938h.b(new ForceStopRunnable(applicationContext, this));
    }

    public void A(String str, WorkerParameters.a aVar) {
        this.f1938h.b(new androidx.work.impl.utils.h(this, str, aVar));
    }

    public void B(String str) {
        this.f1938h.b(new androidx.work.impl.utils.i(this, str, true));
    }

    public void C(String str) {
        this.f1938h.b(new androidx.work.impl.utils.i(this, str, false));
    }

    @Override // androidx.work.y
    public q a(String str) {
        androidx.work.impl.utils.a d2 = androidx.work.impl.utils.a.d(str, this);
        this.f1938h.b(d2);
        return d2.e();
    }

    @Override // androidx.work.y
    public q b(String str) {
        androidx.work.impl.utils.a c2 = androidx.work.impl.utils.a.c(str, this, true);
        this.f1938h.b(c2);
        return c2.e();
    }

    @Override // androidx.work.y
    public q d(List<? extends z> list) {
        if (!list.isEmpty()) {
            return new g(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    @Override // androidx.work.y
    public q e(String str, androidx.work.f fVar, s sVar) {
        return l(str, fVar, sVar).a();
    }

    @Override // androidx.work.y
    public q g(String str, androidx.work.g gVar, List<p> list) {
        return new g(this, str, gVar, list).a();
    }

    public q j(UUID uuid) {
        androidx.work.impl.utils.a b2 = androidx.work.impl.utils.a.b(uuid, this);
        this.f1938h.b(b2);
        return b2.e();
    }

    public List<e> k(Context context, androidx.work.b bVar, androidx.work.impl.utils.p.a aVar) {
        return Arrays.asList(f.a(context, this), new androidx.work.impl.l.a.b(context, bVar, aVar, this));
    }

    public g l(String str, androidx.work.f fVar, s sVar) {
        androidx.work.g gVar;
        if (fVar == androidx.work.f.KEEP) {
            gVar = androidx.work.g.KEEP;
        } else {
            gVar = androidx.work.g.REPLACE;
        }
        return new g(this, str, gVar, Collections.singletonList(sVar));
    }

    public Context m() {
        return this.f1935e;
    }

    public androidx.work.b n() {
        return this.f1936f;
    }

    public androidx.work.impl.utils.e q() {
        return this.f1941k;
    }

    public d r() {
        return this.f1940j;
    }

    public List<e> s() {
        return this.f1939i;
    }

    public WorkDatabase t() {
        return this.f1937g;
    }

    public androidx.work.impl.utils.p.a u() {
        return this.f1938h;
    }

    public void w() {
        synchronized (f1934d) {
            this.l = true;
            BroadcastReceiver.PendingResult pendingResult = this.m;
            if (pendingResult != null) {
                pendingResult.finish();
                this.m = null;
            }
        }
    }

    public void x() {
        if (Build.VERSION.SDK_INT >= 23) {
            androidx.work.impl.background.systemjob.b.b(m());
        }
        t().j().t();
        f.b(n(), t(), s());
    }

    public void y(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f1934d) {
            this.m = pendingResult;
            if (this.l) {
                pendingResult.finish();
                this.m = null;
            }
        }
    }

    public void z(String str) {
        A(str, null);
    }

    public j(Context context, androidx.work.b bVar, androidx.work.impl.utils.p.a aVar, boolean z) {
        this(context, bVar, aVar, WorkDatabase.a(context.getApplicationContext(), aVar.c(), z));
    }

    public j(Context context, androidx.work.b bVar, androidx.work.impl.utils.p.a aVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        n.e(new n.a(bVar.j()));
        List<e> k2 = k(applicationContext, bVar, aVar);
        v(context, bVar, aVar, workDatabase, k2, new d(context, bVar, aVar, workDatabase, k2));
    }
}
