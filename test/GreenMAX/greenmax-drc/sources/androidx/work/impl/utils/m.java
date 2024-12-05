package androidx.work.impl.utils;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.n.p;
import androidx.work.t;
import androidx.work.x;
import java.util.UUID;

/* compiled from: WorkProgressUpdater.java */
/* loaded from: classes.dex */
public class m implements t {
    static final String a = androidx.work.n.f("WorkProgressUpdater");

    /* renamed from: b, reason: collision with root package name */
    final WorkDatabase f2090b;

    /* renamed from: c, reason: collision with root package name */
    final androidx.work.impl.utils.p.a f2091c;

    /* compiled from: WorkProgressUpdater.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ UUID f2092f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.work.e f2093g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.o.c f2094h;

        a(UUID uuid, androidx.work.e eVar, androidx.work.impl.utils.o.c cVar) {
            this.f2092f = uuid;
            this.f2093g = eVar;
            this.f2094h = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p m;
            String uuid = this.f2092f.toString();
            androidx.work.n c2 = androidx.work.n.c();
            String str = m.a;
            c2.a(str, String.format("Updating progress for %s (%s)", this.f2092f, this.f2093g), new Throwable[0]);
            m.this.f2090b.beginTransaction();
            try {
                m = m.this.f2090b.j().m(uuid);
            } finally {
                try {
                    return;
                } finally {
                }
            }
            if (m != null) {
                if (m.f2019d == x.RUNNING) {
                    m.this.f2090b.i().b(new androidx.work.impl.n.m(uuid, this.f2093g));
                } else {
                    androidx.work.n.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid), new Throwable[0]);
                }
                this.f2094h.q(null);
                m.this.f2090b.setTransactionSuccessful();
                return;
            }
            throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
    }

    public m(WorkDatabase workDatabase, androidx.work.impl.utils.p.a aVar) {
        this.f2090b = workDatabase;
        this.f2091c = aVar;
    }

    @Override // androidx.work.t
    public e.e.c.a.a.a<Void> a(Context context, UUID uuid, androidx.work.e eVar) {
        androidx.work.impl.utils.o.c u = androidx.work.impl.utils.o.c.u();
        this.f2091c.b(new a(uuid, eVar, u));
        return u;
    }
}
