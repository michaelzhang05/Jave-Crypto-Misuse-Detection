package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.j;
import androidx.work.impl.utils.g;
import androidx.work.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: SystemAlarmDispatcher.java */
/* loaded from: classes.dex */
public class e implements androidx.work.impl.b {

    /* renamed from: f, reason: collision with root package name */
    static final String f1860f = n.f("SystemAlarmDispatcher");

    /* renamed from: g, reason: collision with root package name */
    final Context f1861g;

    /* renamed from: h, reason: collision with root package name */
    private final androidx.work.impl.utils.p.a f1862h;

    /* renamed from: i, reason: collision with root package name */
    private final androidx.work.impl.utils.n f1863i;

    /* renamed from: j, reason: collision with root package name */
    private final androidx.work.impl.d f1864j;

    /* renamed from: k, reason: collision with root package name */
    private final j f1865k;
    final androidx.work.impl.background.systemalarm.b l;
    private final Handler m;
    final List<Intent> n;
    Intent o;
    private c p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            d dVar;
            synchronized (e.this.n) {
                e eVar2 = e.this;
                eVar2.o = eVar2.n.get(0);
            }
            Intent intent = e.this.o;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.o.getIntExtra("KEY_START_ID", 0);
                n c2 = n.c();
                String str = e.f1860f;
                c2.a(str, String.format("Processing command %s, %s", e.this.o, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock b2 = androidx.work.impl.utils.j.b(e.this.f1861g, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    n.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, b2), new Throwable[0]);
                    b2.acquire();
                    e eVar3 = e.this;
                    eVar3.l.p(eVar3.o, intExtra, eVar3);
                    n.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, b2), new Throwable[0]);
                    b2.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    try {
                        n c3 = n.c();
                        String str2 = e.f1860f;
                        c3.b(str2, "Unexpected error in onHandleIntent", th);
                        n.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, b2), new Throwable[0]);
                        b2.release();
                        eVar = e.this;
                        dVar = new d(eVar);
                    } catch (Throwable th2) {
                        n.c().a(e.f1860f, String.format("Releasing operation wake lock (%s) %s", action, b2), new Throwable[0]);
                        b2.release();
                        e eVar4 = e.this;
                        eVar4.k(new d(eVar4));
                        throw th2;
                    }
                }
                eVar.k(dVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final e f1867f;

        /* renamed from: g, reason: collision with root package name */
        private final Intent f1868g;

        /* renamed from: h, reason: collision with root package name */
        private final int f1869h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(e eVar, Intent intent, int i2) {
            this.f1867f = eVar;
            this.f1868g = intent;
            this.f1869h = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1867f.a(this.f1868g, this.f1869h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    static class d implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private final e f1870f;

        d(e eVar) {
            this.f1870f = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1870f.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context) {
        this(context, null, null);
    }

    private void b() {
        if (this.m.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    private boolean i(String str) {
        b();
        synchronized (this.n) {
            Iterator<Intent> it = this.n.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    private void l() {
        b();
        PowerManager.WakeLock b2 = androidx.work.impl.utils.j.b(this.f1861g, "ProcessCommand");
        try {
            b2.acquire();
            this.f1865k.u().b(new a());
        } finally {
            b2.release();
        }
    }

    public boolean a(Intent intent, int i2) {
        n c2 = n.c();
        String str = f1860f;
        c2.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i2)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            n.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i2);
        synchronized (this.n) {
            boolean z = this.n.isEmpty() ? false : true;
            this.n.add(intent);
            if (!z) {
                l();
            }
        }
        return true;
    }

    void c() {
        n c2 = n.c();
        String str = f1860f;
        c2.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.n) {
            if (this.o != null) {
                n.c().a(str, String.format("Removing command %s", this.o), new Throwable[0]);
                if (this.n.remove(0).equals(this.o)) {
                    this.o = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            g c3 = this.f1862h.c();
            if (!this.l.o() && this.n.isEmpty() && !c3.a()) {
                n.c().a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.p;
                if (cVar != null) {
                    cVar.a();
                }
            } else if (!this.n.isEmpty()) {
                l();
            }
        }
    }

    @Override // androidx.work.impl.b
    public void d(String str, boolean z) {
        k(new b(this, androidx.work.impl.background.systemalarm.b.c(this.f1861g, str, z), 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.work.impl.d e() {
        return this.f1864j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.work.impl.utils.p.a f() {
        return this.f1862h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j g() {
        return this.f1865k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.work.impl.utils.n h() {
        return this.f1863i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        n.c().a(f1860f, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f1864j.i(this);
        this.f1863i.a();
        this.p = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(Runnable runnable) {
        this.m.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(c cVar) {
        if (this.p != null) {
            n.c().b(f1860f, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.p = cVar;
        }
    }

    e(Context context, androidx.work.impl.d dVar, j jVar) {
        Context applicationContext = context.getApplicationContext();
        this.f1861g = applicationContext;
        this.l = new androidx.work.impl.background.systemalarm.b(applicationContext);
        this.f1863i = new androidx.work.impl.utils.n();
        jVar = jVar == null ? j.p(context) : jVar;
        this.f1865k = jVar;
        dVar = dVar == null ? jVar.r() : dVar;
        this.f1864j = dVar;
        this.f1862h = jVar.u();
        dVar.c(this);
        this.n = new ArrayList();
        this.o = null;
        this.m = new Handler(Looper.getMainLooper());
    }
}
