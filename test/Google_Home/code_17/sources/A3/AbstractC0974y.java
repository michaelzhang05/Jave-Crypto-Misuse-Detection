package A3;

import A2.C0947e;
import A3.Y;
import A3.h0;
import M3.InterfaceC1324t;
import Q2.a;
import Q2.b;
import a3.C1623e;
import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.paymentsheet.C2626a;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.e;
import h4.C2924d0;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import u2.InterfaceC4057d;
import x2.C4186a;
import x3.InterfaceC4187a;

/* renamed from: A3.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0974y {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A3.y$a */
    /* loaded from: classes4.dex */
    public static final class a implements Y.a {

        /* renamed from: a, reason: collision with root package name */
        private Application f414a;

        private a() {
        }

        @Override // A3.Y.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b(Application application) {
            this.f414a = (Application) x5.h.b(application);
            return this;
        }

        @Override // A3.Y.a
        public Y build() {
            x5.h.a(this.f414a, Application.class);
            return new f(new M2.f(), new x2.d(), new C4186a(), this.f414a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A3.y$b */
    /* loaded from: classes4.dex */
    public static final class b implements a.InterfaceC0180a {

        /* renamed from: a, reason: collision with root package name */
        private final f f415a;

        @Override // Q2.a.InterfaceC0180a
        public Q2.a build() {
            return new c(this.f415a);
        }

        private b(f fVar) {
            this.f415a = fVar;
        }
    }

    /* renamed from: A3.y$c */
    /* loaded from: classes4.dex */
    private static final class c implements Q2.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f416a;

        /* renamed from: b, reason: collision with root package name */
        private final c f417b;

        /* renamed from: c, reason: collision with root package name */
        private x5.i f418c;

        /* renamed from: d, reason: collision with root package name */
        private x5.i f419d;

        private void b() {
            P2.b a8 = P2.b.a(this.f416a.f450g, this.f416a.f455l, this.f416a.f463t, this.f416a.f449f, this.f416a.f448e, this.f416a.f456m);
            this.f418c = a8;
            this.f419d = x5.d.c(a8);
        }

        @Override // Q2.a
        public P2.c a() {
            return new P2.c((P2.e) this.f419d.get());
        }

        private c(f fVar) {
            this.f417b = this;
            this.f416a = fVar;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A3.y$d */
    /* loaded from: classes4.dex */
    public static final class d implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f420a;

        /* renamed from: b, reason: collision with root package name */
        private N2.d f421b;

        @Override // Q2.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(N2.d dVar) {
            this.f421b = (N2.d) x5.h.b(dVar);
            return this;
        }

        @Override // Q2.b.a
        public Q2.b build() {
            x5.h.a(this.f421b, N2.d.class);
            return new e(this.f420a, this.f421b);
        }

        private d(f fVar) {
            this.f420a = fVar;
        }
    }

    /* renamed from: A3.y$e */
    /* loaded from: classes4.dex */
    private static final class e extends Q2.b {

        /* renamed from: a, reason: collision with root package name */
        private final N2.d f422a;

        /* renamed from: b, reason: collision with root package name */
        private final f f423b;

        /* renamed from: c, reason: collision with root package name */
        private final e f424c;

        /* renamed from: d, reason: collision with root package name */
        private x5.i f425d;

        /* renamed from: e, reason: collision with root package name */
        private x5.i f426e;

        /* renamed from: f, reason: collision with root package name */
        private x5.i f427f;

        /* renamed from: g, reason: collision with root package name */
        private x5.i f428g;

        /* renamed from: h, reason: collision with root package name */
        private x5.i f429h;

        /* renamed from: i, reason: collision with root package name */
        private x5.i f430i;

        /* renamed from: j, reason: collision with root package name */
        private W2.d f431j;

        /* renamed from: k, reason: collision with root package name */
        private x5.i f432k;

        private void d(N2.d dVar) {
            this.f425d = x5.f.a(dVar);
            this.f426e = x5.d.c(Q2.f.a(this.f423b.f448e, this.f423b.f449f));
            this.f427f = x5.d.c(S2.b.a(this.f423b.f453j, this.f423b.f442J, this.f423b.f460q, this.f426e, this.f423b.f449f, this.f423b.f443K, this.f423b.f463t));
            P2.b a8 = P2.b.a(this.f423b.f450g, this.f423b.f455l, this.f423b.f463t, this.f423b.f449f, this.f423b.f448e, this.f423b.f456m);
            this.f428g = a8;
            x5.i c8 = x5.d.c(a8);
            this.f429h = c8;
            x5.i c9 = x5.d.c(O2.c.a(this.f425d, this.f427f, c8, this.f423b.f463t));
            this.f430i = c9;
            W2.d a9 = W2.d.a(this.f425d, c9, this.f429h, this.f423b.f448e);
            this.f431j = a9;
            this.f432k = Q2.d.b(a9);
        }

        @Override // Q2.b
        public N2.d a() {
            return this.f422a;
        }

        @Override // Q2.b
        public Q2.c b() {
            return (Q2.c) this.f432k.get();
        }

        @Override // Q2.b
        public O2.b c() {
            return (O2.b) this.f430i.get();
        }

        private e(f fVar, N2.d dVar) {
            this.f424c = this;
            this.f423b = fVar;
            this.f422a = dVar;
            d(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A3.y$f */
    /* loaded from: classes4.dex */
    public static final class f implements Y {

        /* renamed from: A, reason: collision with root package name */
        private x5.i f433A;

        /* renamed from: B, reason: collision with root package name */
        private x5.i f434B;

        /* renamed from: C, reason: collision with root package name */
        private x5.i f435C;

        /* renamed from: D, reason: collision with root package name */
        private x5.i f436D;

        /* renamed from: E, reason: collision with root package name */
        private x5.i f437E;

        /* renamed from: F, reason: collision with root package name */
        private x5.i f438F;

        /* renamed from: G, reason: collision with root package name */
        private x5.i f439G;

        /* renamed from: H, reason: collision with root package name */
        private x5.i f440H;

        /* renamed from: I, reason: collision with root package name */
        private x5.i f441I;

        /* renamed from: J, reason: collision with root package name */
        private x5.i f442J;

        /* renamed from: K, reason: collision with root package name */
        private x5.i f443K;

        /* renamed from: a, reason: collision with root package name */
        private final Application f444a;

        /* renamed from: b, reason: collision with root package name */
        private final f f445b;

        /* renamed from: c, reason: collision with root package name */
        private x5.i f446c;

        /* renamed from: d, reason: collision with root package name */
        private x5.i f447d;

        /* renamed from: e, reason: collision with root package name */
        private x5.i f448e;

        /* renamed from: f, reason: collision with root package name */
        private x5.i f449f;

        /* renamed from: g, reason: collision with root package name */
        private x5.i f450g;

        /* renamed from: h, reason: collision with root package name */
        private x5.i f451h;

        /* renamed from: i, reason: collision with root package name */
        private x5.i f452i;

        /* renamed from: j, reason: collision with root package name */
        private x5.i f453j;

        /* renamed from: k, reason: collision with root package name */
        private x5.i f454k;

        /* renamed from: l, reason: collision with root package name */
        private x5.i f455l;

        /* renamed from: m, reason: collision with root package name */
        private x5.i f456m;

        /* renamed from: n, reason: collision with root package name */
        private x5.i f457n;

        /* renamed from: o, reason: collision with root package name */
        private x5.i f458o;

        /* renamed from: p, reason: collision with root package name */
        private x5.i f459p;

        /* renamed from: q, reason: collision with root package name */
        private x5.i f460q;

        /* renamed from: r, reason: collision with root package name */
        private x5.i f461r;

        /* renamed from: s, reason: collision with root package name */
        private x5.i f462s;

        /* renamed from: t, reason: collision with root package name */
        private x5.i f463t;

        /* renamed from: u, reason: collision with root package name */
        private x5.i f464u;

        /* renamed from: v, reason: collision with root package name */
        private x5.i f465v;

        /* renamed from: w, reason: collision with root package name */
        private x5.i f466w;

        /* renamed from: x, reason: collision with root package name */
        private x5.i f467x;

        /* renamed from: y, reason: collision with root package name */
        private x5.i f468y;

        /* renamed from: z, reason: collision with root package name */
        private x5.i f469z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: A3.y$f$a */
        /* loaded from: classes4.dex */
        public class a implements x5.i {
            a() {
            }

            @Override // L5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b.a get() {
                return new d(f.this.f445b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: A3.y$f$b */
        /* loaded from: classes4.dex */
        public class b implements x5.i {
            b() {
            }

            @Override // L5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a.InterfaceC0180a get() {
                return new b(f.this.f445b);
            }
        }

        private C0947e F() {
            return N.c(this.f444a, this.f452i);
        }

        private A2.m G() {
            return new A2.m((InterfaceC4057d) this.f448e.get(), (S5.g) this.f449f.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public o2.j H() {
            return new o2.j(this.f444a, G());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C2626a I() {
            return new C2626a(P(), ((Boolean) this.f439G.get()).booleanValue(), K(), L());
        }

        private void J(M2.f fVar, x2.d dVar, C4186a c4186a, Application application) {
            this.f446c = x5.d.c(a0.a());
            x5.i c8 = x5.d.c(S.a());
            this.f447d = c8;
            this.f448e = x5.d.c(x2.c.a(c4186a, c8));
            x5.i c9 = x5.d.c(x2.f.a(dVar));
            this.f449f = c9;
            this.f450g = A2.n.a(this.f448e, c9);
            x5.e a8 = x5.f.a(application);
            this.f451h = a8;
            T a9 = T.a(a8);
            this.f452i = a9;
            this.f453j = V.a(a9);
            x5.i c10 = x5.d.c(c0.a());
            this.f454k = c10;
            this.f455l = h3.j.a(this.f451h, this.f453j, c10);
            x5.i c11 = x5.d.c(Q.a());
            this.f456m = c11;
            this.f457n = x5.d.c(com.stripe.android.paymentsheet.analytics.b.a(this.f446c, this.f450g, this.f455l, c11, this.f449f));
            this.f458o = x5.d.c(U.a(this.f451h, this.f449f));
            this.f459p = M2.g.a(fVar, this.f451h, this.f448e);
            h3.k a10 = h3.k.a(this.f451h, this.f453j, this.f449f, this.f454k, this.f455l, this.f450g, this.f448e);
            this.f460q = a10;
            this.f461r = K3.h.a(a10, this.f452i, this.f449f);
            N a11 = N.a(this.f451h, this.f452i);
            this.f462s = a11;
            n3.k a12 = n3.k.a(this.f450g, a11);
            this.f463t = a12;
            this.f464u = x5.d.c(K3.b.a(this.f460q, this.f452i, this.f448e, a12, this.f449f, this.f454k));
            a aVar = new a();
            this.f465v = aVar;
            x5.i c12 = x5.d.c(N2.l.a(aVar));
            this.f466w = c12;
            this.f467x = L3.c.a(c12);
            this.f468y = x5.d.c(O2.e.a(this.f451h));
            this.f469z = C2924d0.a(this.f463t);
            this.f433A = D2.g.a(this.f451h);
            this.f434B = x5.d.c(L3.e.a(this.f458o, this.f459p, this.f461r, this.f464u, C1623e.a(), this.f448e, this.f457n, this.f463t, this.f449f, this.f467x, this.f468y, this.f469z, this.f433A));
            this.f435C = new b();
            N2.a a13 = N2.a.a(this.f460q);
            this.f436D = a13;
            this.f437E = x5.d.c(N2.h.a(this.f435C, a13, this.f468y));
            this.f438F = x5.d.c(O.a());
            this.f439G = x5.d.c(b0.a());
            this.f440H = x5.d.c(X.a());
            this.f441I = x5.d.c(P.a());
            this.f442J = W.a(this.f452i);
            this.f443K = x5.d.c(x2.b.a(c4186a));
        }

        private Function0 K() {
            return V.c(this.f452i);
        }

        private Function0 L() {
            return W.c(this.f452i);
        }

        private PaymentAnalyticsRequestFactory M() {
            return new PaymentAnalyticsRequestFactory(this.f444a, K(), (Set) this.f454k.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public n3.j N() {
            return new n3.j(G(), F());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public D2.f O() {
            return new D2.f(this.f444a);
        }

        private com.stripe.android.networking.a P() {
            return new com.stripe.android.networking.a(this.f444a, K(), (S5.g) this.f449f.get(), (Set) this.f454k.get(), M(), G(), (InterfaceC4057d) this.f448e.get());
        }

        @Override // A3.Y
        public h0.a a() {
            return new g(this.f445b);
        }

        private f(M2.f fVar, x2.d dVar, C4186a c4186a, Application application) {
            this.f445b = this;
            this.f444a = application;
            J(fVar, dVar, c4186a, application);
        }
    }

    /* renamed from: A3.y$g */
    /* loaded from: classes4.dex */
    private static final class g implements h0.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f472a;

        /* renamed from: b, reason: collision with root package name */
        private d0 f473b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f474c;

        @Override // A3.h0.a
        public h0 build() {
            x5.h.a(this.f473b, d0.class);
            x5.h.a(this.f474c, SavedStateHandle.class);
            return new h(this.f472a, this.f473b, this.f474c);
        }

        @Override // A3.h0.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public g b(d0 d0Var) {
            this.f473b = (d0) x5.h.b(d0Var);
            return this;
        }

        @Override // A3.h0.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public g a(SavedStateHandle savedStateHandle) {
            this.f474c = (SavedStateHandle) x5.h.b(savedStateHandle);
            return this;
        }

        private g(f fVar) {
            this.f472a = fVar;
        }
    }

    /* renamed from: A3.y$h */
    /* loaded from: classes4.dex */
    private static final class h implements h0 {

        /* renamed from: a, reason: collision with root package name */
        private final d0 f475a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f476b;

        /* renamed from: c, reason: collision with root package name */
        private final f f477c;

        /* renamed from: d, reason: collision with root package name */
        private final h f478d;

        /* renamed from: e, reason: collision with root package name */
        private com.stripe.android.googlepaylauncher.k f479e;

        /* renamed from: f, reason: collision with root package name */
        private x5.i f480f;

        /* renamed from: g, reason: collision with root package name */
        private com.stripe.android.payments.paymentlauncher.f f481g;

        /* renamed from: h, reason: collision with root package name */
        private x5.i f482h;

        private void b(d0 d0Var, SavedStateHandle savedStateHandle) {
            com.stripe.android.googlepaylauncher.k a8 = com.stripe.android.googlepaylauncher.k.a(this.f477c.f451h, this.f477c.f459p, this.f477c.f455l, this.f477c.f450g);
            this.f479e = a8;
            this.f480f = M2.i.b(a8);
            com.stripe.android.payments.paymentlauncher.f a9 = com.stripe.android.payments.paymentlauncher.f.a(this.f477c.f447d, this.f477c.f454k);
            this.f481g = a9;
            this.f482h = com.stripe.android.payments.paymentlauncher.e.b(a9);
        }

        private e.d c() {
            return g0.a(this.f475a, this.f476b, this.f477c.f452i, (com.stripe.android.paymentsheet.paymentdatacollection.bacs.b) this.f477c.f438F.get(), (M2.h) this.f480f.get(), (com.stripe.android.payments.paymentlauncher.d) this.f482h.get(), this.f477c.I(), this.f477c.N(), this.f477c.O());
        }

        private com.stripe.android.paymentsheet.h d() {
            return new com.stripe.android.paymentsheet.h((com.stripe.android.link.a) this.f477c.f437E.get(), (N2.e) this.f477c.f466w.get(), this.f476b, (O2.d) this.f477c.f468y.get(), new b(this.f477c));
        }

        private t3.q e() {
            return f0.a(this.f475a, this.f477c.f444a, (S5.g) this.f477c.f449f.get());
        }

        @Override // A3.h0
        public com.stripe.android.paymentsheet.y a() {
            return new com.stripe.android.paymentsheet.y(e0.a(this.f475a), (EventReporter) this.f477c.f457n.get(), (L3.h) this.f477c.f434B.get(), (K3.c) this.f477c.f464u.get(), e(), (InterfaceC4057d) this.f477c.f448e.get(), (S5.g) this.f477c.f449f.get(), this.f476b, d(), c(), this.f477c.H(), (InterfaceC1324t.a) this.f477c.f440H.get(), this.f477c.N(), (InterfaceC4187a) this.f477c.f441I.get());
        }

        private h(f fVar, d0 d0Var, SavedStateHandle savedStateHandle) {
            this.f478d = this;
            this.f477c = fVar;
            this.f475a = d0Var;
            this.f476b = savedStateHandle;
            b(d0Var, savedStateHandle);
        }
    }

    public static Y.a a() {
        return new a();
    }
}
