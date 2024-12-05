package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.impl.n.p;
import androidx.work.impl.utils.j;
import androidx.work.impl.utils.n;
import java.util.Collections;
import java.util.List;

/* compiled from: DelayMetCommandHandler.java */
/* loaded from: classes.dex */
public class d implements androidx.work.impl.m.c, androidx.work.impl.b, n.b {

    /* renamed from: f, reason: collision with root package name */
    private static final String f1854f = androidx.work.n.f("DelayMetCommandHandler");

    /* renamed from: g, reason: collision with root package name */
    private final Context f1855g;

    /* renamed from: h, reason: collision with root package name */
    private final int f1856h;

    /* renamed from: i, reason: collision with root package name */
    private final String f1857i;

    /* renamed from: j, reason: collision with root package name */
    private final e f1858j;

    /* renamed from: k, reason: collision with root package name */
    private final androidx.work.impl.m.d f1859k;
    private PowerManager.WakeLock n;
    private boolean o = false;
    private int m = 0;
    private final Object l = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, int i2, String str, e eVar) {
        this.f1855g = context;
        this.f1856h = i2;
        this.f1858j = eVar;
        this.f1857i = str;
        this.f1859k = new androidx.work.impl.m.d(context, eVar.f(), this);
    }

    private void c() {
        synchronized (this.l) {
            this.f1859k.e();
            this.f1858j.h().c(this.f1857i);
            PowerManager.WakeLock wakeLock = this.n;
            if (wakeLock != null && wakeLock.isHeld()) {
                androidx.work.n.c().a(f1854f, String.format("Releasing wakelock %s for WorkSpec %s", this.n, this.f1857i), new Throwable[0]);
                this.n.release();
            }
        }
    }

    private void g() {
        synchronized (this.l) {
            if (this.m < 2) {
                this.m = 2;
                androidx.work.n c2 = androidx.work.n.c();
                String str = f1854f;
                c2.a(str, String.format("Stopping work for WorkSpec %s", this.f1857i), new Throwable[0]);
                Intent g2 = b.g(this.f1855g, this.f1857i);
                e eVar = this.f1858j;
                eVar.k(new e.b(eVar, g2, this.f1856h));
                if (this.f1858j.e().g(this.f1857i)) {
                    androidx.work.n.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.f1857i), new Throwable[0]);
                    Intent f2 = b.f(this.f1855g, this.f1857i);
                    e eVar2 = this.f1858j;
                    eVar2.k(new e.b(eVar2, f2, this.f1856h));
                } else {
                    androidx.work.n.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f1857i), new Throwable[0]);
                }
            } else {
                androidx.work.n.c().a(f1854f, String.format("Already stopped work for %s", this.f1857i), new Throwable[0]);
            }
        }
    }

    @Override // androidx.work.impl.utils.n.b
    public void a(String str) {
        androidx.work.n.c().a(f1854f, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // androidx.work.impl.m.c
    public void b(List<String> list) {
        g();
    }

    @Override // androidx.work.impl.b
    public void d(String str, boolean z) {
        androidx.work.n.c().a(f1854f, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        c();
        if (z) {
            Intent f2 = b.f(this.f1855g, this.f1857i);
            e eVar = this.f1858j;
            eVar.k(new e.b(eVar, f2, this.f1856h));
        }
        if (this.o) {
            Intent a = b.a(this.f1855g);
            e eVar2 = this.f1858j;
            eVar2.k(new e.b(eVar2, a, this.f1856h));
        }
    }

    @Override // androidx.work.impl.m.c
    public void e(List<String> list) {
        if (list.contains(this.f1857i)) {
            synchronized (this.l) {
                if (this.m == 0) {
                    this.m = 1;
                    androidx.work.n.c().a(f1854f, String.format("onAllConstraintsMet for %s", this.f1857i), new Throwable[0]);
                    if (this.f1858j.e().j(this.f1857i)) {
                        this.f1858j.h().b(this.f1857i, 600000L, this);
                    } else {
                        c();
                    }
                } else {
                    androidx.work.n.c().a(f1854f, String.format("Already started work for %s", this.f1857i), new Throwable[0]);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.n = j.b(this.f1855g, String.format("%s (%s)", this.f1857i, Integer.valueOf(this.f1856h)));
        androidx.work.n c2 = androidx.work.n.c();
        String str = f1854f;
        c2.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.n, this.f1857i), new Throwable[0]);
        this.n.acquire();
        p m = this.f1858j.g().t().j().m(this.f1857i);
        if (m == null) {
            g();
            return;
        }
        boolean b2 = m.b();
        this.o = b2;
        if (!b2) {
            androidx.work.n.c().a(str, String.format("No constraints for %s", this.f1857i), new Throwable[0]);
            e(Collections.singletonList(this.f1857i));
        } else {
            this.f1859k.d(Collections.singletonList(m));
        }
    }
}
