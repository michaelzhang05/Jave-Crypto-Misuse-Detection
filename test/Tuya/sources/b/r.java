package B;

import C.AbstractC1077k;
import C.InterfaceC1069c;
import C.InterfaceC1070d;
import D.b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import s.C3700b;
import v.g;
import x.C3855a;
import x.c;
import y.AbstractC3966a;

/* loaded from: classes3.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f562a;

    /* renamed from: b, reason: collision with root package name */
    private final v.e f563b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1070d f564c;

    /* renamed from: d, reason: collision with root package name */
    private final x f565d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f566e;

    /* renamed from: f, reason: collision with root package name */
    private final D.b f567f;

    /* renamed from: g, reason: collision with root package name */
    private final E.a f568g;

    /* renamed from: h, reason: collision with root package name */
    private final E.a f569h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1069c f570i;

    public r(Context context, v.e eVar, InterfaceC1070d interfaceC1070d, x xVar, Executor executor, D.b bVar, E.a aVar, E.a aVar2, InterfaceC1069c interfaceC1069c) {
        this.f562a = context;
        this.f563b = eVar;
        this.f564c = interfaceC1070d;
        this.f565d = xVar;
        this.f566e = executor;
        this.f567f = bVar;
        this.f568g = aVar;
        this.f569h = aVar2;
        this.f570i = interfaceC1069c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(u.p pVar) {
        return Boolean.valueOf(this.f564c.p(pVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(u.p pVar) {
        return this.f564c.j(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, u.p pVar, long j8) {
        this.f564c.D(iterable);
        this.f564c.n(pVar, this.f568g.a() + j8);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f564c.d(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f570i.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f570i.a(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(u.p pVar, long j8) {
        this.f564c.n(pVar, this.f568g.a() + j8);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(u.p pVar, int i8) {
        this.f565d.b(pVar, i8 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final u.p pVar, final int i8, Runnable runnable) {
        try {
            try {
                D.b bVar = this.f567f;
                final InterfaceC1070d interfaceC1070d = this.f564c;
                Objects.requireNonNull(interfaceC1070d);
                bVar.e(new b.a() { // from class: B.i
                    @Override // D.b.a
                    public final Object execute() {
                        return Integer.valueOf(InterfaceC1070d.this.c());
                    }
                });
                if (!k()) {
                    this.f567f.e(new b.a() { // from class: B.j
                        @Override // D.b.a
                        public final Object execute() {
                            Object s8;
                            s8 = r.this.s(pVar, i8);
                            return s8;
                        }
                    });
                } else {
                    u(pVar, i8);
                }
            } catch (D.a unused) {
                this.f565d.b(pVar, i8 + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public u.i j(v.m mVar) {
        D.b bVar = this.f567f;
        final InterfaceC1069c interfaceC1069c = this.f570i;
        Objects.requireNonNull(interfaceC1069c);
        return mVar.a(u.i.a().i(this.f568g.a()).k(this.f569h.a()).j("GDT_CLIENT_METRICS").h(new u.h(C3700b.b("proto"), ((C3855a) bVar.e(new b.a() { // from class: B.h
            @Override // D.b.a
            public final Object execute() {
                return InterfaceC1069c.this.f();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f562a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public v.g u(final u.p pVar, int i8) {
        v.g b8;
        v.m mVar = this.f563b.get(pVar.b());
        long j8 = 0;
        v.g e8 = v.g.e(0L);
        while (true) {
            final long j9 = j8;
            while (((Boolean) this.f567f.e(new b.a() { // from class: B.k
                @Override // D.b.a
                public final Object execute() {
                    Boolean l8;
                    l8 = r.this.l(pVar);
                    return l8;
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f567f.e(new b.a() { // from class: B.l
                    @Override // D.b.a
                    public final Object execute() {
                        Iterable m8;
                        m8 = r.this.m(pVar);
                        return m8;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return e8;
                }
                if (mVar == null) {
                    AbstractC3966a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    b8 = v.g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC1077k) it.next()).b());
                    }
                    if (pVar.e()) {
                        arrayList.add(j(mVar));
                    }
                    b8 = mVar.b(v.f.a().b(arrayList).c(pVar.c()).a());
                }
                e8 = b8;
                if (e8.c() == g.a.TRANSIENT_ERROR) {
                    this.f567f.e(new b.a() { // from class: B.m
                        @Override // D.b.a
                        public final Object execute() {
                            Object n8;
                            n8 = r.this.n(iterable, pVar, j9);
                            return n8;
                        }
                    });
                    this.f565d.a(pVar, i8 + 1, true);
                    return e8;
                }
                this.f567f.e(new b.a() { // from class: B.n
                    @Override // D.b.a
                    public final Object execute() {
                        Object o8;
                        o8 = r.this.o(iterable);
                        return o8;
                    }
                });
                if (e8.c() == g.a.OK) {
                    j8 = Math.max(j9, e8.b());
                    if (pVar.e()) {
                        this.f567f.e(new b.a() { // from class: B.o
                            @Override // D.b.a
                            public final Object execute() {
                                Object p8;
                                p8 = r.this.p();
                                return p8;
                            }
                        });
                    }
                } else if (e8.c() == g.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String j10 = ((AbstractC1077k) it2.next()).b().j();
                        if (!hashMap.containsKey(j10)) {
                            hashMap.put(j10, 1);
                        } else {
                            hashMap.put(j10, Integer.valueOf(((Integer) hashMap.get(j10)).intValue() + 1));
                        }
                    }
                    this.f567f.e(new b.a() { // from class: B.p
                        @Override // D.b.a
                        public final Object execute() {
                            Object q8;
                            q8 = r.this.q(hashMap);
                            return q8;
                        }
                    });
                }
            }
            this.f567f.e(new b.a() { // from class: B.q
                @Override // D.b.a
                public final Object execute() {
                    Object r8;
                    r8 = r.this.r(pVar, j9);
                    return r8;
                }
            });
            return e8;
        }
    }

    public void v(final u.p pVar, final int i8, final Runnable runnable) {
        this.f566e.execute(new Runnable() { // from class: B.g
            @Override // java.lang.Runnable
            public final void run() {
                r.this.t(pVar, i8, runnable);
            }
        });
    }
}
