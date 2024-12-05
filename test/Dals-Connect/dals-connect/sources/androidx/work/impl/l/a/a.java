package androidx.work.impl.l.a;

import androidx.work.impl.n.p;
import androidx.work.n;
import androidx.work.v;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DelayedWorkTracker.java */
/* loaded from: classes.dex */
public class a {
    static final String a = n.f("DelayedWorkTracker");

    /* renamed from: b, reason: collision with root package name */
    final b f1962b;

    /* renamed from: c, reason: collision with root package name */
    private final v f1963c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Runnable> f1964d = new HashMap();

    /* compiled from: DelayedWorkTracker.java */
    /* renamed from: androidx.work.impl.l.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0039a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ p f1965f;

        RunnableC0039a(p pVar) {
            this.f1965f = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            n.c().a(a.a, String.format("Scheduling work %s", this.f1965f.f2018c), new Throwable[0]);
            a.this.f1962b.a(this.f1965f);
        }
    }

    public a(b bVar, v vVar) {
        this.f1962b = bVar;
        this.f1963c = vVar;
    }

    public void a(p pVar) {
        Runnable remove = this.f1964d.remove(pVar.f2018c);
        if (remove != null) {
            this.f1963c.b(remove);
        }
        RunnableC0039a runnableC0039a = new RunnableC0039a(pVar);
        this.f1964d.put(pVar.f2018c, runnableC0039a);
        this.f1963c.a(pVar.a() - System.currentTimeMillis(), runnableC0039a);
    }

    public void b(String str) {
        Runnable remove = this.f1964d.remove(str);
        if (remove != null) {
            this.f1963c.b(remove);
        }
    }
}
