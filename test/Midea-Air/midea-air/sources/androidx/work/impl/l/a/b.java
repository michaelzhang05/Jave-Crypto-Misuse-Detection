package androidx.work.impl.l.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.e;
import androidx.work.impl.j;
import androidx.work.impl.m.c;
import androidx.work.impl.m.d;
import androidx.work.impl.n.p;
import androidx.work.impl.utils.f;
import androidx.work.n;
import androidx.work.x;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: GreedyScheduler.java */
/* loaded from: classes.dex */
public class b implements e, c, androidx.work.impl.b {

    /* renamed from: f, reason: collision with root package name */
    private static final String f1967f = n.f("GreedyScheduler");

    /* renamed from: g, reason: collision with root package name */
    private final Context f1968g;

    /* renamed from: h, reason: collision with root package name */
    private final j f1969h;

    /* renamed from: i, reason: collision with root package name */
    private final d f1970i;

    /* renamed from: k, reason: collision with root package name */
    private a f1972k;
    private boolean l;
    Boolean n;

    /* renamed from: j, reason: collision with root package name */
    private final Set<p> f1971j = new HashSet();
    private final Object m = new Object();

    public b(Context context, androidx.work.b bVar, androidx.work.impl.utils.p.a aVar, j jVar) {
        this.f1968g = context;
        this.f1969h = jVar;
        this.f1970i = new d(context, aVar, this);
        this.f1972k = new a(this, bVar.k());
    }

    private void f() {
        this.n = Boolean.valueOf(f.b(this.f1968g, this.f1969h.n()));
    }

    private void g() {
        if (this.l) {
            return;
        }
        this.f1969h.r().c(this);
        this.l = true;
    }

    private void h(String str) {
        synchronized (this.m) {
            Iterator<p> it = this.f1971j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f2018c.equals(str)) {
                    n.c().a(f1967f, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f1971j.remove(next);
                    this.f1970i.d(this.f1971j);
                    break;
                }
            }
        }
    }

    @Override // androidx.work.impl.e
    public void a(p... pVarArr) {
        if (this.n == null) {
            f();
        }
        if (!this.n.booleanValue()) {
            n.c().d(f1967f, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        g();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f2019d == x.ENQUEUED) {
                if (currentTimeMillis < a) {
                    a aVar = this.f1972k;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (pVar.b()) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 23 && pVar.l.h()) {
                        n.c().a(f1967f, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else if (i2 >= 24 && pVar.l.e()) {
                        n.c().a(f1967f, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                    } else {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f2018c);
                    }
                } else {
                    n.c().a(f1967f, String.format("Starting work for %s", pVar.f2018c), new Throwable[0]);
                    this.f1969h.z(pVar.f2018c);
                }
            }
        }
        synchronized (this.m) {
            if (!hashSet.isEmpty()) {
                n.c().a(f1967f, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f1971j.addAll(hashSet);
                this.f1970i.d(this.f1971j);
            }
        }
    }

    @Override // androidx.work.impl.m.c
    public void b(List<String> list) {
        for (String str : list) {
            n.c().a(f1967f, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f1969h.C(str);
        }
    }

    @Override // androidx.work.impl.e
    public boolean c() {
        return false;
    }

    @Override // androidx.work.impl.e
    public void cancel(String str) {
        if (this.n == null) {
            f();
        }
        if (!this.n.booleanValue()) {
            n.c().d(f1967f, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        g();
        n.c().a(f1967f, String.format("Cancelling work ID %s", str), new Throwable[0]);
        a aVar = this.f1972k;
        if (aVar != null) {
            aVar.b(str);
        }
        this.f1969h.C(str);
    }

    @Override // androidx.work.impl.b
    public void d(String str, boolean z) {
        h(str);
    }

    @Override // androidx.work.impl.m.c
    public void e(List<String> list) {
        for (String str : list) {
            n.c().a(f1967f, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f1969h.z(str);
        }
    }
}
