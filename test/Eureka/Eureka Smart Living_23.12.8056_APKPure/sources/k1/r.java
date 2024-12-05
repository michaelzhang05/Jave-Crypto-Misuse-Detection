package k1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import e1.g;
import g1.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import m1.b;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7140a;

    /* renamed from: b, reason: collision with root package name */
    private final e1.e f7141b;

    /* renamed from: c, reason: collision with root package name */
    private final l1.d f7142c;

    /* renamed from: d, reason: collision with root package name */
    private final x f7143d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f7144e;

    /* renamed from: f, reason: collision with root package name */
    private final m1.b f7145f;

    /* renamed from: g, reason: collision with root package name */
    private final n1.a f7146g;

    /* renamed from: h, reason: collision with root package name */
    private final n1.a f7147h;

    /* renamed from: i, reason: collision with root package name */
    private final l1.c f7148i;

    public r(Context context, e1.e eVar, l1.d dVar, x xVar, Executor executor, m1.b bVar, n1.a aVar, n1.a aVar2, l1.c cVar) {
        this.f7140a = context;
        this.f7141b = eVar;
        this.f7142c = dVar;
        this.f7143d = xVar;
        this.f7144e = executor;
        this.f7145f = bVar;
        this.f7146g = aVar;
        this.f7147h = aVar2;
        this.f7148i = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(d1.o oVar) {
        return Boolean.valueOf(this.f7142c.v(oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(d1.o oVar) {
        return this.f7142c.s(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, d1.o oVar, long j6) {
        this.f7142c.z(iterable);
        this.f7142c.E(oVar, this.f7146g.a() + j6);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f7142c.h(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f7148i.q();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f7148i.D(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(d1.o oVar, long j6) {
        this.f7142c.E(oVar, this.f7146g.a() + j6);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(d1.o oVar, int i6) {
        this.f7143d.a(oVar, i6 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final d1.o oVar, final int i6, Runnable runnable) {
        try {
            try {
                m1.b bVar = this.f7145f;
                final l1.d dVar = this.f7142c;
                Objects.requireNonNull(dVar);
                bVar.g(new b.a() { // from class: k1.i
                    @Override // m1.b.a
                    public final Object a() {
                        return Integer.valueOf(l1.d.this.f());
                    }
                });
                if (k()) {
                    u(oVar, i6);
                } else {
                    this.f7145f.g(new b.a() { // from class: k1.j
                        @Override // m1.b.a
                        public final Object a() {
                            Object s5;
                            s5 = r.this.s(oVar, i6);
                            return s5;
                        }
                    });
                }
            } catch (m1.a unused) {
                this.f7143d.a(oVar, i6 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public d1.i j(e1.m mVar) {
        m1.b bVar = this.f7145f;
        final l1.c cVar = this.f7148i;
        Objects.requireNonNull(cVar);
        return mVar.a(d1.i.a().i(this.f7146g.a()).k(this.f7147h.a()).j("GDT_CLIENT_METRICS").h(new d1.h(b1.b.b("proto"), ((g1.a) bVar.g(new b.a() { // from class: k1.h
            @Override // m1.b.a
            public final Object a() {
                return l1.c.this.w();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f7140a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public e1.g u(final d1.o oVar, int i6) {
        e1.g b6;
        e1.m a6 = this.f7141b.a(oVar.b());
        long j6 = 0;
        e1.g e6 = e1.g.e(0L);
        while (true) {
            final long j7 = j6;
            while (((Boolean) this.f7145f.g(new b.a() { // from class: k1.k
                @Override // m1.b.a
                public final Object a() {
                    Boolean l6;
                    l6 = r.this.l(oVar);
                    return l6;
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f7145f.g(new b.a() { // from class: k1.l
                    @Override // m1.b.a
                    public final Object a() {
                        Iterable m6;
                        m6 = r.this.m(oVar);
                        return m6;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return e6;
                }
                if (a6 == null) {
                    h1.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                    b6 = e1.g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((l1.k) it.next()).b());
                    }
                    if (oVar.e()) {
                        arrayList.add(j(a6));
                    }
                    b6 = a6.b(e1.f.a().b(arrayList).c(oVar.c()).a());
                }
                e6 = b6;
                if (e6.c() == g.a.TRANSIENT_ERROR) {
                    this.f7145f.g(new b.a() { // from class: k1.m
                        @Override // m1.b.a
                        public final Object a() {
                            Object n6;
                            n6 = r.this.n(iterable, oVar, j7);
                            return n6;
                        }
                    });
                    this.f7143d.b(oVar, i6 + 1, true);
                    return e6;
                }
                this.f7145f.g(new b.a() { // from class: k1.n
                    @Override // m1.b.a
                    public final Object a() {
                        Object o6;
                        o6 = r.this.o(iterable);
                        return o6;
                    }
                });
                if (e6.c() == g.a.OK) {
                    j6 = Math.max(j7, e6.b());
                    if (oVar.e()) {
                        this.f7145f.g(new b.a() { // from class: k1.o
                            @Override // m1.b.a
                            public final Object a() {
                                Object p6;
                                p6 = r.this.p();
                                return p6;
                            }
                        });
                    }
                } else if (e6.c() == g.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String j8 = ((l1.k) it2.next()).b().j();
                        hashMap.put(j8, !hashMap.containsKey(j8) ? 1 : Integer.valueOf(((Integer) hashMap.get(j8)).intValue() + 1));
                    }
                    this.f7145f.g(new b.a() { // from class: k1.p
                        @Override // m1.b.a
                        public final Object a() {
                            Object q6;
                            q6 = r.this.q(hashMap);
                            return q6;
                        }
                    });
                }
            }
            this.f7145f.g(new b.a() { // from class: k1.q
                @Override // m1.b.a
                public final Object a() {
                    Object r5;
                    r5 = r.this.r(oVar, j7);
                    return r5;
                }
            });
            return e6;
        }
    }

    public void v(final d1.o oVar, final int i6, final Runnable runnable) {
        this.f7144e.execute(new Runnable() { // from class: k1.g
            @Override // java.lang.Runnable
            public final void run() {
                r.this.t(oVar, i6, runnable);
            }
        });
    }
}
