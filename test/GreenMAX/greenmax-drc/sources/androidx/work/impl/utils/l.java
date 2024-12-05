package androidx.work.impl.utils;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.n.q;
import androidx.work.x;
import java.util.UUID;

/* compiled from: WorkForegroundUpdater.java */
/* loaded from: classes.dex */
public class l implements androidx.work.i {
    private static final String a = androidx.work.n.f("WMFgUpdater");

    /* renamed from: b, reason: collision with root package name */
    private final androidx.work.impl.utils.p.a f2082b;

    /* renamed from: c, reason: collision with root package name */
    final androidx.work.impl.foreground.a f2083c;

    /* renamed from: d, reason: collision with root package name */
    final q f2084d;

    /* compiled from: WorkForegroundUpdater.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.o.c f2085f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ UUID f2086g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.work.h f2087h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Context f2088i;

        a(androidx.work.impl.utils.o.c cVar, UUID uuid, androidx.work.h hVar, Context context) {
            this.f2085f = cVar;
            this.f2086g = uuid;
            this.f2087h = hVar;
            this.f2088i = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f2085f.isCancelled()) {
                    String uuid = this.f2086g.toString();
                    x l = l.this.f2084d.l(uuid);
                    if (l != null && !l.d()) {
                        l.this.f2083c.a(uuid, this.f2087h);
                        this.f2088i.startService(androidx.work.impl.foreground.b.a(this.f2088i, uuid, this.f2087h));
                    } else {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                }
                this.f2085f.q(null);
            } catch (Throwable th) {
                this.f2085f.r(th);
            }
        }
    }

    public l(WorkDatabase workDatabase, androidx.work.impl.foreground.a aVar, androidx.work.impl.utils.p.a aVar2) {
        this.f2083c = aVar;
        this.f2082b = aVar2;
        this.f2084d = workDatabase.j();
    }

    @Override // androidx.work.i
    public e.e.c.a.a.a<Void> a(Context context, UUID uuid, androidx.work.h hVar) {
        androidx.work.impl.utils.o.c u = androidx.work.impl.utils.o.c.u();
        this.f2082b.b(new a(u, uuid, hVar, context));
        return u;
    }
}
