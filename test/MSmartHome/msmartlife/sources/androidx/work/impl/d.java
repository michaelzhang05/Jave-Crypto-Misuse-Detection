package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.k;
import androidx.work.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: Processor.java */
/* loaded from: classes.dex */
public class d implements b, androidx.work.impl.foreground.a {

    /* renamed from: f, reason: collision with root package name */
    private static final String f1884f = n.f("Processor");

    /* renamed from: h, reason: collision with root package name */
    private Context f1886h;

    /* renamed from: i, reason: collision with root package name */
    private androidx.work.b f1887i;

    /* renamed from: j, reason: collision with root package name */
    private androidx.work.impl.utils.p.a f1888j;

    /* renamed from: k, reason: collision with root package name */
    private WorkDatabase f1889k;
    private List<e> n;
    private Map<String, k> m = new HashMap();
    private Map<String, k> l = new HashMap();
    private Set<String> o = new HashSet();
    private final List<b> p = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private PowerManager.WakeLock f1885g = null;
    private final Object q = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Processor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        private b f1890f;

        /* renamed from: g, reason: collision with root package name */
        private String f1891g;

        /* renamed from: h, reason: collision with root package name */
        private e.e.c.a.a.a<Boolean> f1892h;

        a(b bVar, String str, e.e.c.a.a.a<Boolean> aVar) {
            this.f1890f = bVar;
            this.f1891g = str;
            this.f1892h = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                z = this.f1892h.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f1890f.d(this.f1891g, z);
        }
    }

    public d(Context context, androidx.work.b bVar, androidx.work.impl.utils.p.a aVar, WorkDatabase workDatabase, List<e> list) {
        this.f1886h = context;
        this.f1887i = bVar;
        this.f1888j = aVar;
        this.f1889k = workDatabase;
        this.n = list;
    }

    private static boolean e(String str, k kVar) {
        if (kVar != null) {
            kVar.d();
            n.c().a(f1884f, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
            return true;
        }
        n.c().a(f1884f, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
        return false;
    }

    private void m() {
        synchronized (this.q) {
            if (!(!this.l.isEmpty())) {
                try {
                    this.f1886h.startService(androidx.work.impl.foreground.b.f(this.f1886h));
                } catch (Throwable th) {
                    n.c().b(f1884f, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f1885g;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f1885g = null;
                }
            }
        }
    }

    @Override // androidx.work.impl.foreground.a
    public void a(String str, androidx.work.h hVar) {
        synchronized (this.q) {
            n.c().d(f1884f, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            k remove = this.m.remove(str);
            if (remove != null) {
                if (this.f1885g == null) {
                    PowerManager.WakeLock b2 = androidx.work.impl.utils.j.b(this.f1886h, "ProcessorForegroundLck");
                    this.f1885g = b2;
                    b2.acquire();
                }
                this.l.put(str, remove);
                androidx.core.content.a.j(this.f1886h, androidx.work.impl.foreground.b.c(this.f1886h, str, hVar));
            }
        }
    }

    @Override // androidx.work.impl.foreground.a
    public void b(String str) {
        synchronized (this.q) {
            this.l.remove(str);
            m();
        }
    }

    public void c(b bVar) {
        synchronized (this.q) {
            this.p.add(bVar);
        }
    }

    @Override // androidx.work.impl.b
    public void d(String str, boolean z) {
        synchronized (this.q) {
            this.m.remove(str);
            n.c().a(f1884f, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
            Iterator<b> it = this.p.iterator();
            while (it.hasNext()) {
                it.next().d(str, z);
            }
        }
    }

    public boolean f(String str) {
        boolean contains;
        synchronized (this.q) {
            contains = this.o.contains(str);
        }
        return contains;
    }

    public boolean g(String str) {
        boolean z;
        synchronized (this.q) {
            z = this.m.containsKey(str) || this.l.containsKey(str);
        }
        return z;
    }

    public boolean h(String str) {
        boolean containsKey;
        synchronized (this.q) {
            containsKey = this.l.containsKey(str);
        }
        return containsKey;
    }

    public void i(b bVar) {
        synchronized (this.q) {
            this.p.remove(bVar);
        }
    }

    public boolean j(String str) {
        return k(str, null);
    }

    public boolean k(String str, WorkerParameters.a aVar) {
        synchronized (this.q) {
            if (g(str)) {
                n.c().a(f1884f, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            k a2 = new k.c(this.f1886h, this.f1887i, this.f1888j, this, this.f1889k, str).c(this.n).b(aVar).a();
            e.e.c.a.a.a<Boolean> b2 = a2.b();
            b2.d(new a(this, str, b2), this.f1888j.a());
            this.m.put(str, a2);
            this.f1888j.c().execute(a2);
            n.c().a(f1884f, String.format("%s: processing %s", d.class.getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public boolean l(String str) {
        boolean e2;
        synchronized (this.q) {
            boolean z = true;
            n.c().a(f1884f, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.o.add(str);
            k remove = this.l.remove(str);
            if (remove == null) {
                z = false;
            }
            if (remove == null) {
                remove = this.m.remove(str);
            }
            e2 = e(str, remove);
            if (z) {
                m();
            }
        }
        return e2;
    }

    public boolean n(String str) {
        boolean e2;
        synchronized (this.q) {
            n.c().a(f1884f, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            e2 = e(str, this.l.remove(str));
        }
        return e2;
    }

    public boolean o(String str) {
        boolean e2;
        synchronized (this.q) {
            n.c().a(f1884f, String.format("Processor stopping background work %s", str), new Throwable[0]);
            e2 = e(str, this.m.remove(str));
        }
        return e2;
    }
}
