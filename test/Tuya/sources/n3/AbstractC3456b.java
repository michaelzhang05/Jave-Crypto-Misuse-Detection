package n3;

import android.content.Context;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import l3.C3171a;
import l3.C3173c;
import l3.C3175e;
import l3.C3180j;
import l3.C3183m;
import l3.C3185o;
import l3.C3187q;
import l3.C3190t;
import m3.C3398c;
import n3.n;
import u2.C3801a;

/* renamed from: n3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3456b {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.b$a */
    /* loaded from: classes4.dex */
    public static final class a implements n.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f36004a;

        /* renamed from: b, reason: collision with root package name */
        private PaymentAnalyticsRequestFactory f36005b;

        /* renamed from: c, reason: collision with root package name */
        private Boolean f36006c;

        /* renamed from: d, reason: collision with root package name */
        private P5.g f36007d;

        /* renamed from: e, reason: collision with root package name */
        private P5.g f36008e;

        /* renamed from: f, reason: collision with root package name */
        private Map f36009f;

        /* renamed from: g, reason: collision with root package name */
        private Function0 f36010g;

        /* renamed from: h, reason: collision with root package name */
        private Set f36011h;

        /* renamed from: i, reason: collision with root package name */
        private Boolean f36012i;

        /* renamed from: j, reason: collision with root package name */
        private Boolean f36013j;

        private a() {
        }

        @Override // n3.n.a
        public n build() {
            u5.h.a(this.f36004a, Context.class);
            u5.h.a(this.f36005b, PaymentAnalyticsRequestFactory.class);
            u5.h.a(this.f36006c, Boolean.class);
            u5.h.a(this.f36007d, P5.g.class);
            u5.h.a(this.f36008e, P5.g.class);
            u5.h.a(this.f36009f, Map.class);
            u5.h.a(this.f36010g, Function0.class);
            u5.h.a(this.f36011h, Set.class);
            u5.h.a(this.f36012i, Boolean.class);
            u5.h.a(this.f36013j, Boolean.class);
            return new C0830b(new I(), new C3801a(), this.f36004a, this.f36005b, this.f36006c, this.f36007d, this.f36008e, this.f36009f, this.f36010g, this.f36011h, this.f36012i, this.f36013j);
        }

        @Override // n3.n.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a g(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
            this.f36005b = (PaymentAnalyticsRequestFactory) u5.h.b(paymentAnalyticsRequestFactory);
            return this;
        }

        @Override // n3.n.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f36004a = (Context) u5.h.b(context);
            return this;
        }

        @Override // n3.n.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public a d(boolean z8) {
            this.f36006c = (Boolean) u5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // n3.n.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public a j(boolean z8) {
            this.f36013j = (Boolean) u5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // n3.n.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a e(boolean z8) {
            this.f36012i = (Boolean) u5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // n3.n.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f36011h = (Set) u5.h.b(set);
            return this;
        }

        @Override // n3.n.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public a c(Function0 function0) {
            this.f36010g = (Function0) u5.h.b(function0);
            return this;
        }

        @Override // n3.n.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public a f(Map map) {
            this.f36009f = (Map) u5.h.b(map);
            return this;
        }

        @Override // n3.n.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public a i(P5.g gVar) {
            this.f36008e = (P5.g) u5.h.b(gVar);
            return this;
        }

        @Override // n3.n.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public a h(P5.g gVar) {
            this.f36007d = (P5.g) u5.h.b(gVar);
            return this;
        }
    }

    /* renamed from: n3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0830b implements n {

        /* renamed from: a, reason: collision with root package name */
        private final C0830b f36014a;

        /* renamed from: b, reason: collision with root package name */
        private u5.i f36015b;

        /* renamed from: c, reason: collision with root package name */
        private u5.i f36016c;

        /* renamed from: d, reason: collision with root package name */
        private u5.i f36017d;

        /* renamed from: e, reason: collision with root package name */
        private u5.i f36018e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f36019f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f36020g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f36021h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f36022i;

        /* renamed from: j, reason: collision with root package name */
        private u5.i f36023j;

        /* renamed from: k, reason: collision with root package name */
        private u5.i f36024k;

        /* renamed from: l, reason: collision with root package name */
        private u5.i f36025l;

        /* renamed from: m, reason: collision with root package name */
        private u5.i f36026m;

        /* renamed from: n, reason: collision with root package name */
        private u5.i f36027n;

        /* renamed from: o, reason: collision with root package name */
        private u5.i f36028o;

        /* renamed from: p, reason: collision with root package name */
        private u5.i f36029p;

        /* renamed from: q, reason: collision with root package name */
        private u5.i f36030q;

        /* renamed from: r, reason: collision with root package name */
        private u5.i f36031r;

        /* renamed from: s, reason: collision with root package name */
        private u5.i f36032s;

        /* renamed from: t, reason: collision with root package name */
        private u5.i f36033t;

        /* renamed from: u, reason: collision with root package name */
        private u5.i f36034u;

        /* renamed from: v, reason: collision with root package name */
        private u5.i f36035v;

        /* renamed from: w, reason: collision with root package name */
        private u5.i f36036w;

        /* renamed from: x, reason: collision with root package name */
        private u5.i f36037x;

        /* renamed from: y, reason: collision with root package name */
        private u5.i f36038y;

        /* renamed from: z, reason: collision with root package name */
        private u5.i f36039z;

        private void b(I i8, C3801a c3801a, Context context, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Boolean bool, P5.g gVar, P5.g gVar2, Map map, Function0 function0, Set set, Boolean bool2, Boolean bool3) {
            u5.c cVar = new u5.c();
            this.f36015b = cVar;
            u5.i c8 = u5.d.c(r.a(cVar));
            this.f36016c = c8;
            this.f36017d = u5.d.c(C3175e.a(c8));
            u5.e a8 = u5.f.a(context);
            this.f36018e = a8;
            u5.i c9 = u5.d.c(p.a(a8));
            this.f36019f = c9;
            this.f36020g = u5.d.c(q.a(this.f36015b, c9));
            u5.e a9 = u5.f.a(bool);
            this.f36021h = a9;
            this.f36022i = u5.d.c(u2.c.a(c3801a, a9));
            u5.e a10 = u5.f.a(gVar);
            this.f36023j = a10;
            this.f36024k = x2.n.a(this.f36022i, a10);
            this.f36025l = u5.f.a(paymentAnalyticsRequestFactory);
            this.f36026m = u5.f.a(gVar2);
            this.f36027n = u5.f.a(function0);
            u5.e a11 = u5.f.a(bool2);
            this.f36028o = a11;
            this.f36029p = u5.d.c(C3183m.a(this.f36020g, this.f36016c, this.f36024k, this.f36025l, this.f36021h, this.f36026m, this.f36027n, a11));
            u5.i c10 = u5.d.c(C3185o.a(this.f36016c));
            this.f36030q = c10;
            this.f36031r = J.a(i8, c10);
            u5.e a12 = u5.f.a(map);
            this.f36032s = a12;
            u5.i c11 = u5.d.c(C3190t.a(this.f36020g, this.f36024k, this.f36025l, this.f36021h, this.f36026m, a12, this.f36027n, this.f36028o, this.f36019f, C3180j.a()));
            this.f36033t = c11;
            this.f36034u = u5.d.c(C3187q.a(c11, this.f36017d, this.f36018e));
            this.f36035v = u5.d.c(C3452A.a());
            u5.e a13 = u5.f.a(set);
            this.f36036w = a13;
            this.f36037x = u5.d.c(C3398c.a(this.f36035v, this.f36021h, this.f36027n, a13));
            this.f36038y = u5.g.b(11).c(StripeIntent.a.n.class, this.f36031r).c(StripeIntent.a.j.C0489a.class, this.f36033t).c(StripeIntent.a.i.class, this.f36033t).c(StripeIntent.a.C0480a.class, this.f36033t).c(StripeIntent.a.f.class, this.f36034u).c(StripeIntent.a.g.class, this.f36034u).c(StripeIntent.a.e.class, this.f36034u).c(StripeIntent.a.d.class, this.f36034u).c(StripeIntent.a.c.class, this.f36033t).c(StripeIntent.a.k.class, this.f36033t).c(StripeIntent.a.j.b.class, this.f36037x).b();
            u5.e a14 = u5.f.a(bool3);
            this.f36039z = a14;
            u5.c.a(this.f36015b, u5.d.c(C3173c.a(this.f36017d, this.f36029p, this.f36038y, a14, this.f36018e)));
        }

        @Override // n3.n
        public C3171a a() {
            return (C3171a) this.f36015b.get();
        }

        private C0830b(I i8, C3801a c3801a, Context context, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Boolean bool, P5.g gVar, P5.g gVar2, Map map, Function0 function0, Set set, Boolean bool2, Boolean bool3) {
            this.f36014a = this;
            b(i8, c3801a, context, paymentAnalyticsRequestFactory, bool, gVar, gVar2, map, function0, set, bool2, bool3);
        }
    }

    public static n.a a() {
        return new a();
    }
}
