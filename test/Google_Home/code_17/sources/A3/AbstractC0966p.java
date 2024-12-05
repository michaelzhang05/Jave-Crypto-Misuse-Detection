package A3;

import A3.H;
import A3.K;
import M3.InterfaceC1324t;
import Q2.a;
import Q2.b;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import java.util.Set;
import u2.InterfaceC4057d;
import x2.C4186a;

/* renamed from: A3.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0966p {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A3.p$a */
    /* loaded from: classes4.dex */
    public static final class a implements H.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f357a;

        /* renamed from: b, reason: collision with root package name */
        private Set f358b;

        private a() {
        }

        @Override // A3.H.a
        public H build() {
            x5.h.a(this.f357a, Context.class);
            x5.h.a(this.f358b, Set.class);
            return new f(new I(), new x2.d(), new C4186a(), this.f357a, this.f358b);
        }

        @Override // A3.H.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f357a = (Context) x5.h.b(context);
            return this;
        }

        @Override // A3.H.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f358b = (Set) x5.h.b(set);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A3.p$b */
    /* loaded from: classes4.dex */
    public static final class b implements a.InterfaceC0180a {

        /* renamed from: a, reason: collision with root package name */
        private final f f359a;

        @Override // Q2.a.InterfaceC0180a
        public Q2.a build() {
            return new c(this.f359a);
        }

        private b(f fVar) {
            this.f359a = fVar;
        }
    }

    /* renamed from: A3.p$c */
    /* loaded from: classes4.dex */
    private static final class c implements Q2.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f360a;

        /* renamed from: b, reason: collision with root package name */
        private final c f361b;

        /* renamed from: c, reason: collision with root package name */
        private x5.i f362c;

        /* renamed from: d, reason: collision with root package name */
        private x5.i f363d;

        private void b() {
            P2.b a8 = P2.b.a(this.f360a.f384g, this.f360a.f389l, this.f360a.f394q, this.f360a.f383f, this.f360a.f382e, this.f360a.f390m);
            this.f362c = a8;
            this.f363d = x5.d.c(a8);
        }

        @Override // Q2.a
        public P2.c a() {
            return new P2.c((P2.e) this.f363d.get());
        }

        private c(f fVar) {
            this.f361b = this;
            this.f360a = fVar;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A3.p$d */
    /* loaded from: classes4.dex */
    public static final class d implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f364a;

        /* renamed from: b, reason: collision with root package name */
        private N2.d f365b;

        @Override // Q2.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(N2.d dVar) {
            this.f365b = (N2.d) x5.h.b(dVar);
            return this;
        }

        @Override // Q2.b.a
        public Q2.b build() {
            x5.h.a(this.f365b, N2.d.class);
            return new e(this.f364a, this.f365b);
        }

        private d(f fVar) {
            this.f364a = fVar;
        }
    }

    /* renamed from: A3.p$e */
    /* loaded from: classes4.dex */
    private static final class e extends Q2.b {

        /* renamed from: a, reason: collision with root package name */
        private final N2.d f366a;

        /* renamed from: b, reason: collision with root package name */
        private final f f367b;

        /* renamed from: c, reason: collision with root package name */
        private final e f368c;

        /* renamed from: d, reason: collision with root package name */
        private x5.i f369d;

        /* renamed from: e, reason: collision with root package name */
        private x5.i f370e;

        /* renamed from: f, reason: collision with root package name */
        private x5.i f371f;

        /* renamed from: g, reason: collision with root package name */
        private x5.i f372g;

        /* renamed from: h, reason: collision with root package name */
        private x5.i f373h;

        /* renamed from: i, reason: collision with root package name */
        private x5.i f374i;

        /* renamed from: j, reason: collision with root package name */
        private W2.d f375j;

        /* renamed from: k, reason: collision with root package name */
        private x5.i f376k;

        private void d(N2.d dVar) {
            this.f369d = x5.f.a(dVar);
            this.f370e = x5.d.c(Q2.f.a(this.f367b.f382e, this.f367b.f383f));
            this.f371f = x5.d.c(S2.b.a(this.f367b.f387j, this.f367b.f403z, this.f367b.f392o, this.f370e, this.f367b.f383f, this.f367b.f377A, this.f367b.f394q));
            P2.b a8 = P2.b.a(this.f367b.f384g, this.f367b.f389l, this.f367b.f394q, this.f367b.f383f, this.f367b.f382e, this.f367b.f390m);
            this.f372g = a8;
            x5.i c8 = x5.d.c(a8);
            this.f373h = c8;
            x5.i c9 = x5.d.c(O2.c.a(this.f369d, this.f371f, c8, this.f367b.f394q));
            this.f374i = c9;
            W2.d a9 = W2.d.a(this.f369d, c9, this.f373h, this.f367b.f382e);
            this.f375j = a9;
            this.f376k = Q2.d.b(a9);
        }

        @Override // Q2.b
        public N2.d a() {
            return this.f366a;
        }

        @Override // Q2.b
        public Q2.c b() {
            return (Q2.c) this.f376k.get();
        }

        @Override // Q2.b
        public O2.b c() {
            return (O2.b) this.f374i.get();
        }

        private e(f fVar, N2.d dVar) {
            this.f368c = this;
            this.f367b = fVar;
            this.f366a = dVar;
            d(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A3.p$f */
    /* loaded from: classes4.dex */
    public static final class f implements H {

        /* renamed from: A, reason: collision with root package name */
        private x5.i f377A;

        /* renamed from: a, reason: collision with root package name */
        private final Context f378a;

        /* renamed from: b, reason: collision with root package name */
        private final f f379b;

        /* renamed from: c, reason: collision with root package name */
        private x5.i f380c;

        /* renamed from: d, reason: collision with root package name */
        private x5.i f381d;

        /* renamed from: e, reason: collision with root package name */
        private x5.i f382e;

        /* renamed from: f, reason: collision with root package name */
        private x5.i f383f;

        /* renamed from: g, reason: collision with root package name */
        private x5.i f384g;

        /* renamed from: h, reason: collision with root package name */
        private x5.i f385h;

        /* renamed from: i, reason: collision with root package name */
        private x5.i f386i;

        /* renamed from: j, reason: collision with root package name */
        private x5.i f387j;

        /* renamed from: k, reason: collision with root package name */
        private x5.i f388k;

        /* renamed from: l, reason: collision with root package name */
        private x5.i f389l;

        /* renamed from: m, reason: collision with root package name */
        private x5.i f390m;

        /* renamed from: n, reason: collision with root package name */
        private x5.i f391n;

        /* renamed from: o, reason: collision with root package name */
        private x5.i f392o;

        /* renamed from: p, reason: collision with root package name */
        private x5.i f393p;

        /* renamed from: q, reason: collision with root package name */
        private x5.i f394q;

        /* renamed from: r, reason: collision with root package name */
        private x5.i f395r;

        /* renamed from: s, reason: collision with root package name */
        private x5.i f396s;

        /* renamed from: t, reason: collision with root package name */
        private x5.i f397t;

        /* renamed from: u, reason: collision with root package name */
        private x5.i f398u;

        /* renamed from: v, reason: collision with root package name */
        private x5.i f399v;

        /* renamed from: w, reason: collision with root package name */
        private x5.i f400w;

        /* renamed from: x, reason: collision with root package name */
        private x5.i f401x;

        /* renamed from: y, reason: collision with root package name */
        private x5.i f402y;

        /* renamed from: z, reason: collision with root package name */
        private x5.i f403z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: A3.p$f$a */
        /* loaded from: classes4.dex */
        public class a implements x5.i {
            a() {
            }

            @Override // L5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a.InterfaceC0180a get() {
                return new b(f.this.f379b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: A3.p$f$b */
        /* loaded from: classes4.dex */
        public class b implements x5.i {
            b() {
            }

            @Override // L5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b.a get() {
                return new d(f.this.f379b);
            }
        }

        private A2.m t() {
            return new A2.m((InterfaceC4057d) this.f382e.get(), (S5.g) this.f383f.get());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public o2.j u() {
            return new o2.j(this.f378a, t());
        }

        private void v(I i8, x2.d dVar, C4186a c4186a, Context context, Set set) {
            this.f380c = x5.d.c(J.a(i8));
            x5.i c8 = x5.d.c(S.a());
            this.f381d = c8;
            this.f382e = x5.d.c(x2.c.a(c4186a, c8));
            x5.i c9 = x5.d.c(x2.f.a(dVar));
            this.f383f = c9;
            this.f384g = A2.n.a(this.f382e, c9);
            x5.e a8 = x5.f.a(context);
            this.f385h = a8;
            T a9 = T.a(a8);
            this.f386i = a9;
            this.f387j = V.a(a9);
            x5.e a10 = x5.f.a(set);
            this.f388k = a10;
            this.f389l = h3.j.a(this.f385h, this.f387j, a10);
            x5.i c10 = x5.d.c(Q.a());
            this.f390m = c10;
            this.f391n = x5.d.c(com.stripe.android.paymentsheet.analytics.b.a(this.f380c, this.f384g, this.f389l, c10, this.f383f));
            this.f392o = h3.k.a(this.f385h, this.f387j, this.f383f, this.f388k, this.f389l, this.f384g, this.f382e);
            N a11 = N.a(this.f385h, this.f386i);
            this.f393p = a11;
            n3.k a12 = n3.k.a(this.f384g, a11);
            this.f394q = a12;
            this.f395r = x5.d.c(K3.b.a(this.f392o, this.f386i, this.f382e, a12, this.f383f, this.f388k));
            this.f396s = new a();
            this.f397t = N2.a.a(this.f392o);
            x5.i c11 = x5.d.c(O2.e.a(this.f385h));
            this.f398u = c11;
            this.f399v = x5.d.c(N2.h.a(this.f396s, this.f397t, c11));
            b bVar = new b();
            this.f400w = bVar;
            this.f401x = x5.d.c(N2.l.a(bVar));
            this.f402y = x5.d.c(X.a());
            this.f403z = W.a(this.f386i);
            this.f377A = x5.d.c(x2.b.a(c4186a));
        }

        @Override // A3.H
        public K.a a() {
            return new g(this.f379b);
        }

        private f(I i8, x2.d dVar, C4186a c4186a, Context context, Set set) {
            this.f379b = this;
            this.f378a = context;
            v(i8, dVar, c4186a, context, set);
        }
    }

    /* renamed from: A3.p$g */
    /* loaded from: classes4.dex */
    private static final class g implements K.a {

        /* renamed from: a, reason: collision with root package name */
        private final f f406a;

        /* renamed from: b, reason: collision with root package name */
        private Application f407b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f408c;

        /* renamed from: d, reason: collision with root package name */
        private PaymentOptionContract.a f409d;

        @Override // A3.K.a
        public K build() {
            x5.h.a(this.f407b, Application.class);
            x5.h.a(this.f408c, SavedStateHandle.class);
            x5.h.a(this.f409d, PaymentOptionContract.a.class);
            return new h(this.f406a, this.f407b, this.f408c, this.f409d);
        }

        @Override // A3.K.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public g b(Application application) {
            this.f407b = (Application) x5.h.b(application);
            return this;
        }

        @Override // A3.K.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public g c(PaymentOptionContract.a aVar) {
            this.f409d = (PaymentOptionContract.a) x5.h.b(aVar);
            return this;
        }

        @Override // A3.K.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public g a(SavedStateHandle savedStateHandle) {
            this.f408c = (SavedStateHandle) x5.h.b(savedStateHandle);
            return this;
        }

        private g(f fVar) {
            this.f406a = fVar;
        }
    }

    /* renamed from: A3.p$h */
    /* loaded from: classes4.dex */
    private static final class h implements K {

        /* renamed from: a, reason: collision with root package name */
        private final PaymentOptionContract.a f410a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f411b;

        /* renamed from: c, reason: collision with root package name */
        private final f f412c;

        /* renamed from: d, reason: collision with root package name */
        private final h f413d;

        private com.stripe.android.paymentsheet.h b() {
            return new com.stripe.android.paymentsheet.h((com.stripe.android.link.a) this.f412c.f399v.get(), (N2.e) this.f412c.f401x.get(), this.f411b, (O2.d) this.f412c.f398u.get(), new b(this.f412c));
        }

        @Override // A3.K
        public com.stripe.android.paymentsheet.t a() {
            return new com.stripe.android.paymentsheet.t(this.f410a, (EventReporter) this.f412c.f391n.get(), (K3.c) this.f412c.f395r.get(), (S5.g) this.f412c.f383f.get(), this.f411b, b(), this.f412c.u(), (InterfaceC1324t.a) this.f412c.f402y.get());
        }

        private h(f fVar, Application application, SavedStateHandle savedStateHandle, PaymentOptionContract.a aVar) {
            this.f413d = this;
            this.f412c = fVar;
            this.f410a = aVar;
            this.f411b = savedStateHandle;
        }
    }

    public static H.a a() {
        return new a();
    }
}
