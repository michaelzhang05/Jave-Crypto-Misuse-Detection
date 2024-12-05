package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.n.q;
import androidx.work.x;

/* compiled from: StopWorkRunnable.java */
/* loaded from: classes.dex */
public class i implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private static final String f2067f = androidx.work.n.f("StopWorkRunnable");

    /* renamed from: g, reason: collision with root package name */
    private final androidx.work.impl.j f2068g;

    /* renamed from: h, reason: collision with root package name */
    private final String f2069h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f2070i;

    public i(androidx.work.impl.j jVar, String str, boolean z) {
        this.f2068g = jVar;
        this.f2069h = str;
        this.f2070i = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean o;
        WorkDatabase t = this.f2068g.t();
        androidx.work.impl.d r = this.f2068g.r();
        q j2 = t.j();
        t.beginTransaction();
        try {
            boolean h2 = r.h(this.f2069h);
            if (this.f2070i) {
                o = this.f2068g.r().n(this.f2069h);
            } else {
                if (!h2 && j2.l(this.f2069h) == x.RUNNING) {
                    j2.a(x.ENQUEUED, this.f2069h);
                }
                o = this.f2068g.r().o(this.f2069h);
            }
            androidx.work.n.c().a(f2067f, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f2069h, Boolean.valueOf(o)), new Throwable[0]);
            t.setTransactionSuccessful();
        } finally {
            t.endTransaction();
        }
    }
}
