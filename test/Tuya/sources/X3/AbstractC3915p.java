package x3;

import J3.InterfaceC1211t;
import N2.a;
import N2.b;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import java.util.Set;
import r2.InterfaceC3684d;
import u2.C3801a;
import x3.InterfaceC3886H;
import x3.InterfaceC3889K;

/* renamed from: x3.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3915p {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.p$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3886H.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f39362a;

        /* renamed from: b, reason: collision with root package name */
        private Set f39363b;

        private a() {
        }

        @Override // x3.InterfaceC3886H.a
        public InterfaceC3886H build() {
            u5.h.a(this.f39362a, Context.class);
            u5.h.a(this.f39363b, Set.class);
            return new f(new C3887I(), new u2.d(), new C3801a(), this.f39362a, this.f39363b);
        }

        @Override // x3.InterfaceC3886H.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f39362a = (Context) u5.h.b(context);
            return this;
        }

        @Override // x3.InterfaceC3886H.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f39363b = (Set) u5.h.b(set);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.p$b */
    /* loaded from: classes4.dex */
    public static final class b implements a.InterfaceC0151a {

        /* renamed from: a, reason: collision with root package name */
        private final f f39364a;

        @Override // N2.a.InterfaceC0151a
        public N2.a build() {
            return new c(this.f39364a);
        }

        private b(f fVar) {
            this.f39364a = fVar;
        }
    }

    /* renamed from: x3.p$c */
    /* loaded from: classes4.dex */
    private static final class c implements N2.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f39365a;

        /* renamed from: b, reason: collision with root package name */
        private final c f39366b;

        /* renamed from: c, reason: collision with root package name */
        private u5.i f39367c;

        /* renamed from: d, reason: collision with root package name */
        private u5.i f39368d;

        private void b() {
            M2.b a8 = M2.b.a(this.f39365a.f39389g, this.f39365a.f39394l, this.f39365a.f39399q, this.f39365a.f39388f, this.f39365a.f39387e, this.f39365a.f39395m);
            this.f39367c = a8;
            this.f39368d = u5.d.c(a8);
        }

        @Override // N2.a
        public M2.c a() {
            return new M2.c((M2.e) this.f39368d.get());
        }

        private c(f fVar) {
            this.f39366b = this;
            this.f39365a = fVar;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.p$d */
    /* loaded from: classes4.dex */
    public static final class d implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f39369a;

        /* renamed from: b, reason: collision with root package name */
        private K2.d f39370b;

        @Override // N2.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(K2.d dVar) {
            this.f39370b = (K2.d) u5.h.b(dVar);
            return this;
        }

        @Override // N2.b.a
        public N2.b build() {
            u5.h.a(this.f39370b, K2.d.class);
            return new e(this.f39369a, this.f39370b);
        }

        private d(f fVar) {
            this.f39369a = fVar;
        }
    }

    /* renamed from: x3.p$e */
    /* loaded from: classes4.dex */
    private static final class e extends N2.b {

        /* renamed from: a, reason: collision with root package name */
        private final K2.d f39371a;

        /* renamed from: b, reason: collision with root package name */
        private final f f39372b;

        /* renamed from: c, reason: collision with root package name */
        private final e f39373c;

        /* renamed from: d, reason: collision with root package name */
        private u5.i f39374d;

        /* renamed from: e, reason: collision with root package name */
        private u5.i f39375e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f39376f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f39377g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f39378h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f39379i;

        /* renamed from: j, reason: collision with root package name */
        private T2.d f39380j;

        /* renamed from: k, reason: collision with root package name */
        private u5.i f39381k;

        private void d(K2.d dVar) {
            this.f39374d = u5.f.a(dVar);
            this.f39375e = u5.d.c(N2.f.a(this.f39372b.f39387e, this.f39372b.f39388f));
            this.f39376f = u5.d.c(P2.b.a(this.f39372b.f39392j, this.f39372b.f39408z, this.f39372b.f39397o, this.f39375e, this.f39372b.f39388f, this.f39372b.f39382A, this.f39372b.f39399q));
            M2.b a8 = M2.b.a(this.f39372b.f39389g, this.f39372b.f39394l, this.f39372b.f39399q, this.f39372b.f39388f, this.f39372b.f39387e, this.f39372b.f39395m);
            this.f39377g = a8;
            u5.i c8 = u5.d.c(a8);
            this.f39378h = c8;
            u5.i c9 = u5.d.c(L2.c.a(this.f39374d, this.f39376f, c8, this.f39372b.f39399q));
            this.f39379i = c9;
            T2.d a9 = T2.d.a(this.f39374d, c9, this.f39378h, this.f39372b.f39387e);
            this.f39380j = a9;
            this.f39381k = N2.d.b(a9);
        }

        @Override // N2.b
        public K2.d a() {
            return this.f39371a;
        }

        @Override // N2.b
        public N2.c b() {
            return (N2.c) this.f39381k.get();
        }

        @Override // N2.b
        public L2.b c() {
            return (L2.b) this.f39379i.get();
        }

        private e(f fVar, K2.d dVar) {
            this.f39373c = this;
            this.f39372b = fVar;
            this.f39371a = dVar;
            d(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.p$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC3886H {

        /* renamed from: A, reason: collision with root package name */
        private u5.i f39382A;

        /* renamed from: a, reason: collision with root package name */
        private final Context f39383a;

        /* renamed from: b, reason: collision with root package name */
        private final f f39384b;

        /* renamed from: c, reason: collision with root package name */
        private u5.i f39385c;

        /* renamed from: d, reason: collision with root package name */
        private u5.i f39386d;

        /* renamed from: e, reason: collision with root package name */
        private u5.i f39387e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f39388f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f39389g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f39390h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f39391i;

        /* renamed from: j, reason: collision with root package name */
        private u5.i f39392j;

        /* renamed from: k, reason: collision with root package name */
        private u5.i f39393k;

        /* renamed from: l, reason: collision with root package name */
        private u5.i f39394l;

        /* renamed from: m, reason: collision with root package name */
        private u5.i f39395m;

        /* renamed from: n, reason: collision with root package name */
        private u5.i f39396n;

        /* renamed from: o, reason: collision with root package name */
        private u5.i f39397o;

        /* renamed from: p, reason: collision with root package name */
        private u5.i f39398p;

        /* renamed from: q, reason: collision with root package name */
        private u5.i f39399q;

        /* renamed from: r, reason: collision with root package name */
        private u5.i f39400r;

        /* renamed from: s, reason: collision with root package name */
        private u5.i f39401s;

        /* renamed from: t, reason: collision with root package name */
        private u5.i f39402t;

        /* renamed from: u, reason: collision with root package name */
        private u5.i f39403u;

        /* renamed from: v, reason: collision with root package name */
        private u5.i f39404v;

        /* renamed from: w, reason: collision with root package name */
        private u5.i f39405w;

        /* renamed from: x, reason: collision with root package name */
        private u5.i f39406x;

        /* renamed from: y, reason: collision with root package name */
        private u5.i f39407y;

        /* renamed from: z, reason: collision with root package name */
        private u5.i f39408z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x3.p$f$a */
        /* loaded from: classes4.dex */
        public class a implements u5.i {
            a() {
            }

            @Override // I5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a.InterfaceC0151a get() {
                return new b(f.this.f39384b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x3.p$f$b */
        /* loaded from: classes4.dex */
        public class b implements u5.i {
            b() {
            }

            @Override // I5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b.a get() {
                return new d(f.this.f39384b);
            }
        }

        private x2.m t() {
            return new x2.m((InterfaceC3684d) this.f39387e.get(), (P5.g) this.f39388f.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public l2.j u() {
            return new l2.j(this.f39383a, t());
        }

        private void v(C3887I c3887i, u2.d dVar, C3801a c3801a, Context context, Set set) {
            this.f39385c = u5.d.c(C3888J.a(c3887i));
            u5.i c8 = u5.d.c(C3896S.a());
            this.f39386d = c8;
            this.f39387e = u5.d.c(u2.c.a(c3801a, c8));
            u5.i c9 = u5.d.c(u2.f.a(dVar));
            this.f39388f = c9;
            this.f39389g = x2.n.a(this.f39387e, c9);
            u5.e a8 = u5.f.a(context);
            this.f39390h = a8;
            C3897T a9 = C3897T.a(a8);
            this.f39391i = a9;
            this.f39392j = C3899V.a(a9);
            u5.e a10 = u5.f.a(set);
            this.f39393k = a10;
            this.f39394l = e3.j.a(this.f39390h, this.f39392j, a10);
            u5.i c10 = u5.d.c(C3895Q.a());
            this.f39395m = c10;
            this.f39396n = u5.d.c(com.stripe.android.paymentsheet.analytics.b.a(this.f39385c, this.f39389g, this.f39394l, c10, this.f39388f));
            this.f39397o = e3.k.a(this.f39390h, this.f39392j, this.f39388f, this.f39393k, this.f39394l, this.f39389g, this.f39387e);
            C3892N a11 = C3892N.a(this.f39390h, this.f39391i);
            this.f39398p = a11;
            k3.k a12 = k3.k.a(this.f39389g, a11);
            this.f39399q = a12;
            this.f39400r = u5.d.c(H3.b.a(this.f39397o, this.f39391i, this.f39387e, a12, this.f39388f, this.f39393k));
            this.f39401s = new a();
            this.f39402t = K2.a.a(this.f39397o);
            u5.i c11 = u5.d.c(L2.e.a(this.f39390h));
            this.f39403u = c11;
            this.f39404v = u5.d.c(K2.h.a(this.f39401s, this.f39402t, c11));
            b bVar = new b();
            this.f39405w = bVar;
            this.f39406x = u5.d.c(K2.l.a(bVar));
            this.f39407y = u5.d.c(X.a());
            this.f39408z = W.a(this.f39391i);
            this.f39382A = u5.d.c(u2.b.a(c3801a));
        }

        @Override // x3.InterfaceC3886H
        public InterfaceC3889K.a a() {
            return new g(this.f39384b);
        }

        private f(C3887I c3887i, u2.d dVar, C3801a c3801a, Context context, Set set) {
            this.f39384b = this;
            this.f39383a = context;
            v(c3887i, dVar, c3801a, context, set);
        }
    }

    /* renamed from: x3.p$g */
    /* loaded from: classes4.dex */
    private static final class g implements InterfaceC3889K.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f39411a;

        /* renamed from: b, reason: collision with root package name */
        private Application f39412b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f39413c;

        /* renamed from: d, reason: collision with root package name */
        private PaymentOptionContract.a f39414d;

        @Override // x3.InterfaceC3889K.a
        public InterfaceC3889K build() {
            u5.h.a(this.f39412b, Application.class);
            u5.h.a(this.f39413c, SavedStateHandle.class);
            u5.h.a(this.f39414d, PaymentOptionContract.a.class);
            return new h(this.f39411a, this.f39412b, this.f39413c, this.f39414d);
        }

        @Override // x3.InterfaceC3889K.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public g b(Application application) {
            this.f39412b = (Application) u5.h.b(application);
            return this;
        }

        @Override // x3.InterfaceC3889K.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public g c(PaymentOptionContract.a aVar) {
            this.f39414d = (PaymentOptionContract.a) u5.h.b(aVar);
            return this;
        }

        @Override // x3.InterfaceC3889K.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public g a(SavedStateHandle savedStateHandle) {
            this.f39413c = (SavedStateHandle) u5.h.b(savedStateHandle);
            return this;
        }

        private g(f fVar) {
            this.f39411a = fVar;
        }
    }

    /* renamed from: x3.p$h */
    /* loaded from: classes4.dex */
    private static final class h implements InterfaceC3889K {

        /* renamed from: a, reason: collision with root package name */
        private final PaymentOptionContract.a f39415a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f39416b;

        /* renamed from: c, reason: collision with root package name */
        private final f f39417c;

        /* renamed from: d, reason: collision with root package name */
        private final h f39418d;

        private com.stripe.android.paymentsheet.h b() {
            return new com.stripe.android.paymentsheet.h((com.stripe.android.link.a) this.f39417c.f39404v.get(), (K2.e) this.f39417c.f39406x.get(), this.f39416b, (L2.d) this.f39417c.f39403u.get(), new b(this.f39417c));
        }

        @Override // x3.InterfaceC3889K
        public com.stripe.android.paymentsheet.t a() {
            return new com.stripe.android.paymentsheet.t(this.f39415a, (EventReporter) this.f39417c.f39396n.get(), (H3.c) this.f39417c.f39400r.get(), (P5.g) this.f39417c.f39388f.get(), this.f39416b, b(), this.f39417c.u(), (InterfaceC1211t.a) this.f39417c.f39407y.get());
        }

        private h(f fVar, Application application, SavedStateHandle savedStateHandle, PaymentOptionContract.a aVar) {
            this.f39418d = this;
            this.f39417c = fVar;
            this.f39415a = aVar;
            this.f39416b = savedStateHandle;
        }
    }

    public static InterfaceC3886H.a a() {
        return new a();
    }
}
