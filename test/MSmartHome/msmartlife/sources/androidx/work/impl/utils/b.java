package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.work.e;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.n.p;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.q;
import java.util.Iterator;
import java.util.List;

/* compiled from: EnqueueRunnable.java */
/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private static final String f2055f = androidx.work.n.f("EnqueueRunnable");

    /* renamed from: g, reason: collision with root package name */
    private final androidx.work.impl.g f2056g;

    /* renamed from: h, reason: collision with root package name */
    private final androidx.work.impl.c f2057h = new androidx.work.impl.c();

    public b(androidx.work.impl.g gVar) {
        this.f2056g = gVar;
    }

    private static boolean b(androidx.work.impl.g gVar) {
        boolean c2 = c(gVar.g(), gVar.f(), (String[]) androidx.work.impl.g.l(gVar).toArray(new String[0]), gVar.d(), gVar.b());
        gVar.k();
        return c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e1 A[LOOP:5: B:86:0x01db->B:88:0x01e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean c(androidx.work.impl.j r19, java.util.List<? extends androidx.work.z> r20, java.lang.String[] r21, java.lang.String r22, androidx.work.g r23) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.b.c(androidx.work.impl.j, java.util.List, java.lang.String[], java.lang.String, androidx.work.g):boolean");
    }

    private static boolean e(androidx.work.impl.g gVar) {
        List<androidx.work.impl.g> e2 = gVar.e();
        boolean z = false;
        if (e2 != null) {
            boolean z2 = false;
            for (androidx.work.impl.g gVar2 : e2) {
                if (!gVar2.j()) {
                    z2 |= e(gVar2);
                } else {
                    androidx.work.n.c().h(f2055f, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar2.c())), new Throwable[0]);
                }
            }
            z = z2;
        }
        return b(gVar) | z;
    }

    private static void g(p pVar) {
        androidx.work.c cVar = pVar.l;
        String str = pVar.f2020e;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (cVar.f() || cVar.i()) {
            e.a aVar = new e.a();
            aVar.c(pVar.f2022g).f("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f2020e = ConstraintTrackingWorker.class.getName();
            pVar.f2022g = aVar.a();
        }
    }

    private static boolean h(androidx.work.impl.j jVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            Iterator<androidx.work.impl.e> it = jVar.s().iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(it.next().getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public boolean a() {
        WorkDatabase t = this.f2056g.g().t();
        t.beginTransaction();
        try {
            boolean e2 = e(this.f2056g);
            t.setTransactionSuccessful();
            return e2;
        } finally {
            t.endTransaction();
        }
    }

    public q d() {
        return this.f2057h;
    }

    public void f() {
        androidx.work.impl.j g2 = this.f2056g.g();
        androidx.work.impl.f.b(g2.n(), g2.t(), g2.s());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!this.f2056g.h()) {
                if (a()) {
                    d.a(this.f2056g.g().m(), RescheduleReceiver.class, true);
                    f();
                }
                this.f2057h.a(q.a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f2056g));
        } catch (Throwable th) {
            this.f2057h.a(new q.b.a(th));
        }
    }
}
