package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.impl.n.p;
import androidx.work.n;

/* compiled from: SystemAlarmScheduler.java */
/* loaded from: classes.dex */
public class f implements androidx.work.impl.e {

    /* renamed from: f, reason: collision with root package name */
    private static final String f1871f = n.f("SystemAlarmScheduler");

    /* renamed from: g, reason: collision with root package name */
    private final Context f1872g;

    public f(Context context) {
        this.f1872g = context.getApplicationContext();
    }

    private void b(p pVar) {
        n.c().a(f1871f, String.format("Scheduling work with workSpecId %s", pVar.f2018c), new Throwable[0]);
        this.f1872g.startService(b.f(this.f1872g, pVar.f2018c));
    }

    @Override // androidx.work.impl.e
    public void a(p... pVarArr) {
        for (p pVar : pVarArr) {
            b(pVar);
        }
    }

    @Override // androidx.work.impl.e
    public boolean c() {
        return true;
    }

    @Override // androidx.work.impl.e
    public void cancel(String str) {
        this.f1872g.startService(b.g(this.f1872g, str));
    }
}
