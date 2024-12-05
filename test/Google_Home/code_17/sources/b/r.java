package B;

import C.AbstractC1017k;
import C.InterfaceC1009c;
import C.InterfaceC1010d;
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
import s.C3982c;
import v.AbstractC4077f;
import v.AbstractC4078g;
import v.InterfaceC4076e;
import v.InterfaceC4084m;
import x.C4152a;
import x.C4154c;
import y.AbstractC4194a;

/* loaded from: classes3.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f687a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4076e f688b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1010d f689c;

    /* renamed from: d, reason: collision with root package name */
    private final x f690d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f691e;

    /* renamed from: f, reason: collision with root package name */
    private final D.b f692f;

    /* renamed from: g, reason: collision with root package name */
    private final E.a f693g;

    /* renamed from: h, reason: collision with root package name */
    private final E.a f694h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1009c f695i;

    public r(Context context, InterfaceC4076e interfaceC4076e, InterfaceC1010d interfaceC1010d, x xVar, Executor executor, D.b bVar, E.a aVar, E.a aVar2, InterfaceC1009c interfaceC1009c) {
        this.f687a = context;
        this.f688b = interfaceC4076e;
        this.f689c = interfaceC1010d;
        this.f690d = xVar;
        this.f691e = executor;
        this.f692f = bVar;
        this.f693g = aVar;
        this.f694h = aVar2;
        this.f695i = interfaceC1009c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(u.p pVar) {
        return Boolean.valueOf(this.f689c.q(pVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(u.p pVar) {
        return this.f689c.j(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, u.p pVar, long j8) {
        this.f689c.B(iterable);
        this.f689c.p(pVar, this.f693g.a() + j8);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f689c.e(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f695i.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f695i.a(((Integer) r0.getValue()).intValue(), C4154c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(u.p pVar, long j8) {
        this.f689c.p(pVar, this.f693g.a() + j8);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(u.p pVar, int i8) {
        this.f690d.b(pVar, i8 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final u.p pVar, final int i8, Runnable runnable) {
        try {
            try {
                D.b bVar = this.f692f;
                final InterfaceC1010d interfaceC1010d = this.f689c;
                Objects.requireNonNull(interfaceC1010d);
                bVar.f(new b.a() { // from class: B.i
                    @Override // D.b.a
                    public final Object execute() {
                        return Integer.valueOf(InterfaceC1010d.this.c());
                    }
                });
                if (!k()) {
                    this.f692f.f(new b.a() { // from class: B.j
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
                this.f690d.b(pVar, i8 + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public u.i j(InterfaceC4084m interfaceC4084m) {
        D.b bVar = this.f692f;
        final InterfaceC1009c interfaceC1009c = this.f695i;
        Objects.requireNonNull(interfaceC1009c);
        return interfaceC4084m.a(u.i.a().i(this.f693g.a()).o(this.f694h.a()).n("GDT_CLIENT_METRICS").h(new u.h(C3982c.b("proto"), ((C4152a) bVar.f(new b.a() { // from class: B.h
            @Override // D.b.a
            public final Object execute() {
                return InterfaceC1009c.this.g();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f687a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public AbstractC4078g u(final u.p pVar, int i8) {
        AbstractC4078g b8;
        InterfaceC4084m interfaceC4084m = this.f688b.get(pVar.b());
        long j8 = 0;
        AbstractC4078g e8 = AbstractC4078g.e(0L);
        while (true) {
            final long j9 = j8;
            while (((Boolean) this.f692f.f(new b.a() { // from class: B.k
                @Override // D.b.a
                public final Object execute() {
                    Boolean l8;
                    l8 = r.this.l(pVar);
                    return l8;
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f692f.f(new b.a() { // from class: B.l
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
                if (interfaceC4084m == null) {
                    AbstractC4194a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    b8 = AbstractC4078g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC1017k) it.next()).b());
                    }
                    if (pVar.e()) {
                        arrayList.add(j(interfaceC4084m));
                    }
                    b8 = interfaceC4084m.b(AbstractC4077f.a().b(arrayList).c(pVar.c()).a());
                }
                e8 = b8;
                if (e8.c() == AbstractC4078g.a.TRANSIENT_ERROR) {
                    this.f692f.f(new b.a() { // from class: B.m
                        @Override // D.b.a
                        public final Object execute() {
                            Object n8;
                            n8 = r.this.n(iterable, pVar, j9);
                            return n8;
                        }
                    });
                    this.f690d.a(pVar, i8 + 1, true);
                    return e8;
                }
                this.f692f.f(new b.a() { // from class: B.n
                    @Override // D.b.a
                    public final Object execute() {
                        Object o8;
                        o8 = r.this.o(iterable);
                        return o8;
                    }
                });
                if (e8.c() == AbstractC4078g.a.OK) {
                    j8 = Math.max(j9, e8.b());
                    if (pVar.e()) {
                        this.f692f.f(new b.a() { // from class: B.o
                            @Override // D.b.a
                            public final Object execute() {
                                Object p8;
                                p8 = r.this.p();
                                return p8;
                            }
                        });
                    }
                } else if (e8.c() == AbstractC4078g.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String n8 = ((AbstractC1017k) it2.next()).b().n();
                        if (!hashMap.containsKey(n8)) {
                            hashMap.put(n8, 1);
                        } else {
                            hashMap.put(n8, Integer.valueOf(((Integer) hashMap.get(n8)).intValue() + 1));
                        }
                    }
                    this.f692f.f(new b.a() { // from class: B.p
                        @Override // D.b.a
                        public final Object execute() {
                            Object q8;
                            q8 = r.this.q(hashMap);
                            return q8;
                        }
                    });
                }
            }
            this.f692f.f(new b.a() { // from class: B.q
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
        this.f691e.execute(new Runnable() { // from class: B.g
            @Override // java.lang.Runnable
            public final void run() {
                r.this.t(pVar, i8, runnable);
            }
        });
    }
}
