package x3;

import J3.InterfaceC1211t;
import N2.a;
import N2.b;
import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentsheet.C2432a;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.e;
import e4.C2604d0;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import r2.InterfaceC3684d;
import u2.C3801a;
import u3.InterfaceC3802a;
import x2.C3875e;
import x3.Y;
import x3.h0;

/* renamed from: x3.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3924y {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.y$a */
    /* loaded from: classes4.dex */
    public static final class a implements Y.a {

        /* renamed from: a, reason: collision with root package name */
        private Application f39419a;

        private a() {
        }

        @Override // x3.Y.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b(Application application) {
            this.f39419a = (Application) u5.h.b(application);
            return this;
        }

        @Override // x3.Y.a
        public Y build() {
            u5.h.a(this.f39419a, Application.class);
            return new f(new J2.f(), new u2.d(), new C3801a(), this.f39419a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.y$b */
    /* loaded from: classes4.dex */
    public static final class b implements a.InterfaceC0151a {

        /* renamed from: a, reason: collision with root package name */
        private final f f39420a;

        @Override // N2.a.InterfaceC0151a
        public N2.a build() {
            return new c(this.f39420a);
        }

        private b(f fVar) {
            this.f39420a = fVar;
        }
    }

    /* renamed from: x3.y$c */
    /* loaded from: classes4.dex */
    private static final class c implements N2.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f39421a;

        /* renamed from: b, reason: collision with root package name */
        private final c f39422b;

        /* renamed from: c, reason: collision with root package name */
        private u5.i f39423c;

        /* renamed from: d, reason: collision with root package name */
        private u5.i f39424d;

        private void b() {
            M2.b a8 = M2.b.a(this.f39421a.f39455g, this.f39421a.f39460l, this.f39421a.f39468t, this.f39421a.f39454f, this.f39421a.f39453e, this.f39421a.f39461m);
            this.f39423c = a8;
            this.f39424d = u5.d.c(a8);
        }

        @Override // N2.a
        public M2.c a() {
            return new M2.c((M2.e) this.f39424d.get());
        }

        private c(f fVar) {
            this.f39422b = this;
            this.f39421a = fVar;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.y$d */
    /* loaded from: classes4.dex */
    public static final class d implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f39425a;

        /* renamed from: b, reason: collision with root package name */
        private K2.d f39426b;

        @Override // N2.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(K2.d dVar) {
            this.f39426b = (K2.d) u5.h.b(dVar);
            return this;
        }

        @Override // N2.b.a
        public N2.b build() {
            u5.h.a(this.f39426b, K2.d.class);
            return new e(this.f39425a, this.f39426b);
        }

        private d(f fVar) {
            this.f39425a = fVar;
        }
    }

    /* renamed from: x3.y$e */
    /* loaded from: classes4.dex */
    private static final class e extends N2.b {

        /* renamed from: a, reason: collision with root package name */
        private final K2.d f39427a;

        /* renamed from: b, reason: collision with root package name */
        private final f f39428b;

        /* renamed from: c, reason: collision with root package name */
        private final e f39429c;

        /* renamed from: d, reason: collision with root package name */
        private u5.i f39430d;

        /* renamed from: e, reason: collision with root package name */
        private u5.i f39431e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f39432f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f39433g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f39434h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f39435i;

        /* renamed from: j, reason: collision with root package name */
        private T2.d f39436j;

        /* renamed from: k, reason: collision with root package name */
        private u5.i f39437k;

        private void d(K2.d dVar) {
            this.f39430d = u5.f.a(dVar);
            this.f39431e = u5.d.c(N2.f.a(this.f39428b.f39453e, this.f39428b.f39454f));
            this.f39432f = u5.d.c(P2.b.a(this.f39428b.f39458j, this.f39428b.f39447J, this.f39428b.f39465q, this.f39431e, this.f39428b.f39454f, this.f39428b.f39448K, this.f39428b.f39468t));
            M2.b a8 = M2.b.a(this.f39428b.f39455g, this.f39428b.f39460l, this.f39428b.f39468t, this.f39428b.f39454f, this.f39428b.f39453e, this.f39428b.f39461m);
            this.f39433g = a8;
            u5.i c8 = u5.d.c(a8);
            this.f39434h = c8;
            u5.i c9 = u5.d.c(L2.c.a(this.f39430d, this.f39432f, c8, this.f39428b.f39468t));
            this.f39435i = c9;
            T2.d a9 = T2.d.a(this.f39430d, c9, this.f39434h, this.f39428b.f39453e);
            this.f39436j = a9;
            this.f39437k = N2.d.b(a9);
        }

        @Override // N2.b
        public K2.d a() {
            return this.f39427a;
        }

        @Override // N2.b
        public N2.c b() {
            return (N2.c) this.f39437k.get();
        }

        @Override // N2.b
        public L2.b c() {
            return (L2.b) this.f39435i.get();
        }

        private e(f fVar, K2.d dVar) {
            this.f39429c = this;
            this.f39428b = fVar;
            this.f39427a = dVar;
            d(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.y$f */
    /* loaded from: classes4.dex */
    public static final class f implements Y {

        /* renamed from: A, reason: collision with root package name */
        private u5.i f39438A;

        /* renamed from: B, reason: collision with root package name */
        private u5.i f39439B;

        /* renamed from: C, reason: collision with root package name */
        private u5.i f39440C;

        /* renamed from: D, reason: collision with root package name */
        private u5.i f39441D;

        /* renamed from: E, reason: collision with root package name */
        private u5.i f39442E;

        /* renamed from: F, reason: collision with root package name */
        private u5.i f39443F;

        /* renamed from: G, reason: collision with root package name */
        private u5.i f39444G;

        /* renamed from: H, reason: collision with root package name */
        private u5.i f39445H;

        /* renamed from: I, reason: collision with root package name */
        private u5.i f39446I;

        /* renamed from: J, reason: collision with root package name */
        private u5.i f39447J;

        /* renamed from: K, reason: collision with root package name */
        private u5.i f39448K;

        /* renamed from: a, reason: collision with root package name */
        private final Application f39449a;

        /* renamed from: b, reason: collision with root package name */
        private final f f39450b;

        /* renamed from: c, reason: collision with root package name */
        private u5.i f39451c;

        /* renamed from: d, reason: collision with root package name */
        private u5.i f39452d;

        /* renamed from: e, reason: collision with root package name */
        private u5.i f39453e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f39454f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f39455g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f39456h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f39457i;

        /* renamed from: j, reason: collision with root package name */
        private u5.i f39458j;

        /* renamed from: k, reason: collision with root package name */
        private u5.i f39459k;

        /* renamed from: l, reason: collision with root package name */
        private u5.i f39460l;

        /* renamed from: m, reason: collision with root package name */
        private u5.i f39461m;

        /* renamed from: n, reason: collision with root package name */
        private u5.i f39462n;

        /* renamed from: o, reason: collision with root package name */
        private u5.i f39463o;

        /* renamed from: p, reason: collision with root package name */
        private u5.i f39464p;

        /* renamed from: q, reason: collision with root package name */
        private u5.i f39465q;

        /* renamed from: r, reason: collision with root package name */
        private u5.i f39466r;

        /* renamed from: s, reason: collision with root package name */
        private u5.i f39467s;

        /* renamed from: t, reason: collision with root package name */
        private u5.i f39468t;

        /* renamed from: u, reason: collision with root package name */
        private u5.i f39469u;

        /* renamed from: v, reason: collision with root package name */
        private u5.i f39470v;

        /* renamed from: w, reason: collision with root package name */
        private u5.i f39471w;

        /* renamed from: x, reason: collision with root package name */
        private u5.i f39472x;

        /* renamed from: y, reason: collision with root package name */
        private u5.i f39473y;

        /* renamed from: z, reason: collision with root package name */
        private u5.i f39474z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x3.y$f$a */
        /* loaded from: classes4.dex */
        public class a implements u5.i {
            a() {
            }

            @Override // I5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b.a get() {
                return new d(f.this.f39450b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x3.y$f$b */
        /* loaded from: classes4.dex */
        public class b implements u5.i {
            b() {
            }

            @Override // I5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a.InterfaceC0151a get() {
                return new b(f.this.f39450b);
            }
        }

        private C3875e F() {
            return C3892N.c(this.f39449a, this.f39457i);
        }

        private x2.m G() {
            return new x2.m((InterfaceC3684d) this.f39453e.get(), (P5.g) this.f39454f.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public l2.j H() {
            return new l2.j(this.f39449a, G());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C2432a I() {
            return new C2432a(P(), ((Boolean) this.f39444G.get()).booleanValue(), K(), L());
        }

        private void J(J2.f fVar, u2.d dVar, C3801a c3801a, Application application) {
            this.f39451c = u5.d.c(a0.a());
            u5.i c8 = u5.d.c(C3896S.a());
            this.f39452d = c8;
            this.f39453e = u5.d.c(u2.c.a(c3801a, c8));
            u5.i c9 = u5.d.c(u2.f.a(dVar));
            this.f39454f = c9;
            this.f39455g = x2.n.a(this.f39453e, c9);
            u5.e a8 = u5.f.a(application);
            this.f39456h = a8;
            C3897T a9 = C3897T.a(a8);
            this.f39457i = a9;
            this.f39458j = C3899V.a(a9);
            u5.i c10 = u5.d.c(c0.a());
            this.f39459k = c10;
            this.f39460l = e3.j.a(this.f39456h, this.f39458j, c10);
            u5.i c11 = u5.d.c(C3895Q.a());
            this.f39461m = c11;
            this.f39462n = u5.d.c(com.stripe.android.paymentsheet.analytics.b.a(this.f39451c, this.f39455g, this.f39460l, c11, this.f39454f));
            this.f39463o = u5.d.c(C3898U.a(this.f39456h, this.f39454f));
            this.f39464p = J2.g.a(fVar, this.f39456h, this.f39453e);
            e3.k a10 = e3.k.a(this.f39456h, this.f39458j, this.f39454f, this.f39459k, this.f39460l, this.f39455g, this.f39453e);
            this.f39465q = a10;
            this.f39466r = H3.h.a(a10, this.f39457i, this.f39454f);
            C3892N a11 = C3892N.a(this.f39456h, this.f39457i);
            this.f39467s = a11;
            k3.k a12 = k3.k.a(this.f39455g, a11);
            this.f39468t = a12;
            this.f39469u = u5.d.c(H3.b.a(this.f39465q, this.f39457i, this.f39453e, a12, this.f39454f, this.f39459k));
            a aVar = new a();
            this.f39470v = aVar;
            u5.i c12 = u5.d.c(K2.l.a(aVar));
            this.f39471w = c12;
            this.f39472x = I3.c.a(c12);
            this.f39473y = u5.d.c(L2.e.a(this.f39456h));
            this.f39474z = C2604d0.a(this.f39468t);
            this.f39438A = A2.g.a(this.f39456h);
            this.f39439B = u5.d.c(I3.e.a(this.f39463o, this.f39464p, this.f39466r, this.f39469u, X2.e.a(), this.f39453e, this.f39462n, this.f39468t, this.f39454f, this.f39472x, this.f39473y, this.f39474z, this.f39438A));
            this.f39440C = new b();
            K2.a a13 = K2.a.a(this.f39465q);
            this.f39441D = a13;
            this.f39442E = u5.d.c(K2.h.a(this.f39440C, a13, this.f39473y));
            this.f39443F = u5.d.c(C3893O.a());
            this.f39444G = u5.d.c(b0.a());
            this.f39445H = u5.d.c(X.a());
            this.f39446I = u5.d.c(C3894P.a());
            this.f39447J = W.a(this.f39457i);
            this.f39448K = u5.d.c(u2.b.a(c3801a));
        }

        private Function0 K() {
            return C3899V.c(this.f39457i);
        }

        private Function0 L() {
            return W.c(this.f39457i);
        }

        private PaymentAnalyticsRequestFactory M() {
            return new PaymentAnalyticsRequestFactory(this.f39449a, K(), (Set) this.f39459k.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public k3.j N() {
            return new k3.j(G(), F());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public A2.f O() {
            return new A2.f(this.f39449a);
        }

        private com.stripe.android.networking.a P() {
            return new com.stripe.android.networking.a(this.f39449a, K(), (P5.g) this.f39454f.get(), (Set) this.f39459k.get(), M(), G(), (InterfaceC3684d) this.f39453e.get());
        }

        @Override // x3.Y
        public h0.a a() {
            return new g(this.f39450b);
        }

        private f(J2.f fVar, u2.d dVar, C3801a c3801a, Application application) {
            this.f39450b = this;
            this.f39449a = application;
            J(fVar, dVar, c3801a, application);
        }
    }

    /* renamed from: x3.y$g */
    /* loaded from: classes4.dex */
    private static final class g implements h0.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f39477a;

        /* renamed from: b, reason: collision with root package name */
        private d0 f39478b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f39479c;

        @Override // x3.h0.a
        public h0 build() {
            u5.h.a(this.f39478b, d0.class);
            u5.h.a(this.f39479c, SavedStateHandle.class);
            return new h(this.f39477a, this.f39478b, this.f39479c);
        }

        @Override // x3.h0.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public g b(d0 d0Var) {
            this.f39478b = (d0) u5.h.b(d0Var);
            return this;
        }

        @Override // x3.h0.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public g a(SavedStateHandle savedStateHandle) {
            this.f39479c = (SavedStateHandle) u5.h.b(savedStateHandle);
            return this;
        }

        private g(f fVar) {
            this.f39477a = fVar;
        }
    }

    /* renamed from: x3.y$h */
    /* loaded from: classes4.dex */
    private static final class h implements h0 {

        /* renamed from: a, reason: collision with root package name */
        private final d0 f39480a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f39481b;

        /* renamed from: c, reason: collision with root package name */
        private final f f39482c;

        /* renamed from: d, reason: collision with root package name */
        private final h f39483d;

        /* renamed from: e, reason: collision with root package name */
        private com.stripe.android.googlepaylauncher.k f39484e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f39485f;

        /* renamed from: g, reason: collision with root package name */
        private com.stripe.android.payments.paymentlauncher.f f39486g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f39487h;

        private void b(d0 d0Var, SavedStateHandle savedStateHandle) {
            com.stripe.android.googlepaylauncher.k a8 = com.stripe.android.googlepaylauncher.k.a(this.f39482c.f39456h, this.f39482c.f39464p, this.f39482c.f39460l, this.f39482c.f39455g);
            this.f39484e = a8;
            this.f39485f = J2.i.b(a8);
            com.stripe.android.payments.paymentlauncher.f a9 = com.stripe.android.payments.paymentlauncher.f.a(this.f39482c.f39452d, this.f39482c.f39459k);
            this.f39486g = a9;
            this.f39487h = com.stripe.android.payments.paymentlauncher.e.b(a9);
        }

        private e.d c() {
            return g0.a(this.f39480a, this.f39481b, this.f39482c.f39457i, (com.stripe.android.paymentsheet.paymentdatacollection.bacs.b) this.f39482c.f39443F.get(), (J2.h) this.f39485f.get(), (com.stripe.android.payments.paymentlauncher.d) this.f39487h.get(), this.f39482c.I(), this.f39482c.N(), this.f39482c.O());
        }

        private com.stripe.android.paymentsheet.h d() {
            return new com.stripe.android.paymentsheet.h((com.stripe.android.link.a) this.f39482c.f39442E.get(), (K2.e) this.f39482c.f39471w.get(), this.f39481b, (L2.d) this.f39482c.f39473y.get(), new b(this.f39482c));
        }

        private q3.q e() {
            return f0.a(this.f39480a, this.f39482c.f39449a, (P5.g) this.f39482c.f39454f.get());
        }

        @Override // x3.h0
        public com.stripe.android.paymentsheet.y a() {
            return new com.stripe.android.paymentsheet.y(e0.a(this.f39480a), (EventReporter) this.f39482c.f39462n.get(), (I3.h) this.f39482c.f39439B.get(), (H3.c) this.f39482c.f39469u.get(), e(), (InterfaceC3684d) this.f39482c.f39453e.get(), (P5.g) this.f39482c.f39454f.get(), this.f39481b, d(), c(), this.f39482c.H(), (InterfaceC1211t.a) this.f39482c.f39445H.get(), this.f39482c.N(), (InterfaceC3802a) this.f39482c.f39446I.get());
        }

        private h(f fVar, d0 d0Var, SavedStateHandle savedStateHandle) {
            this.f39483d = this;
            this.f39482c = fVar;
            this.f39480a = d0Var;
            this.f39481b = savedStateHandle;
            b(d0Var, savedStateHandle);
        }
    }

    public static Y.a a() {
        return new a();
    }
}
