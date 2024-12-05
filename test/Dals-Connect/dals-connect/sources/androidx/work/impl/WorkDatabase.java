package androidx.work.impl;

import android.content.Context;
import androidx.room.j;
import androidx.work.impl.h;
import androidx.work.impl.n.n;
import androidx.work.impl.n.q;
import androidx.work.impl.n.t;
import c.q.a.c;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends androidx.room.j {
    private static final long a = TimeUnit.DAYS.toMillis(1);

    /* loaded from: classes.dex */
    class a implements c.InterfaceC0077c {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // c.q.a.c.InterfaceC0077c
        public c.q.a.c a(c.b bVar) {
            c.b.a a = c.b.a(this.a);
            a.c(bVar.f2893b).b(bVar.f2894c).d(true);
            return new c.q.a.g.c().a(a.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends j.b {
        b() {
        }

        @Override // androidx.room.j.b
        public void c(c.q.a.b bVar) {
            super.c(bVar);
            bVar.g();
            try {
                bVar.l(WorkDatabase.e());
                bVar.G();
            } finally {
                bVar.S();
            }
        }
    }

    public static WorkDatabase a(Context context, Executor executor, boolean z) {
        j.a a2;
        if (z) {
            a2 = androidx.room.i.c(context, WorkDatabase.class).c();
        } else {
            a2 = androidx.room.i.a(context, WorkDatabase.class, i.d());
            a2.g(new a(context));
        }
        return (WorkDatabase) a2.h(executor).a(c()).b(h.a).b(new h.C0038h(context, 2, 3)).b(h.f1925b).b(h.f1926c).b(new h.C0038h(context, 5, 6)).b(h.f1927d).b(h.f1928e).b(h.f1929f).b(new h.i(context)).b(new h.C0038h(context, 10, 11)).b(h.f1930g).e().d();
    }

    static j.b c() {
        return new b();
    }

    static long d() {
        return System.currentTimeMillis() - a;
    }

    static String e() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + d() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract androidx.work.impl.n.b b();

    public abstract androidx.work.impl.n.e f();

    public abstract androidx.work.impl.n.h g();

    public abstract androidx.work.impl.n.k h();

    public abstract n i();

    public abstract q j();

    public abstract t k();
}
