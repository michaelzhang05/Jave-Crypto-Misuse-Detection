package q3;

import android.content.Context;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import o3.C3519a;
import o3.C3521c;
import o3.C3523e;
import o3.C3528j;
import o3.C3531m;
import o3.C3533o;
import o3.C3535q;
import o3.C3538t;
import p3.C3741c;
import q3.n;
import x2.C4186a;

/* renamed from: q3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3835b {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q3.b$a */
    /* loaded from: classes4.dex */
    public static final class a implements n.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f38132a;

        /* renamed from: b, reason: collision with root package name */
        private PaymentAnalyticsRequestFactory f38133b;

        /* renamed from: c, reason: collision with root package name */
        private Boolean f38134c;

        /* renamed from: d, reason: collision with root package name */
        private S5.g f38135d;

        /* renamed from: e, reason: collision with root package name */
        private S5.g f38136e;

        /* renamed from: f, reason: collision with root package name */
        private Map f38137f;

        /* renamed from: g, reason: collision with root package name */
        private Function0 f38138g;

        /* renamed from: h, reason: collision with root package name */
        private Set f38139h;

        /* renamed from: i, reason: collision with root package name */
        private Boolean f38140i;

        /* renamed from: j, reason: collision with root package name */
        private Boolean f38141j;

        private a() {
        }

        @Override // q3.n.a
        public n build() {
            x5.h.a(this.f38132a, Context.class);
            x5.h.a(this.f38133b, PaymentAnalyticsRequestFactory.class);
            x5.h.a(this.f38134c, Boolean.class);
            x5.h.a(this.f38135d, S5.g.class);
            x5.h.a(this.f38136e, S5.g.class);
            x5.h.a(this.f38137f, Map.class);
            x5.h.a(this.f38138g, Function0.class);
            x5.h.a(this.f38139h, Set.class);
            x5.h.a(this.f38140i, Boolean.class);
            x5.h.a(this.f38141j, Boolean.class);
            return new C0860b(new I(), new C4186a(), this.f38132a, this.f38133b, this.f38134c, this.f38135d, this.f38136e, this.f38137f, this.f38138g, this.f38139h, this.f38140i, this.f38141j);
        }

        @Override // q3.n.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a i(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
            this.f38133b = (PaymentAnalyticsRequestFactory) x5.h.b(paymentAnalyticsRequestFactory);
            return this;
        }

        @Override // q3.n.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f38132a = (Context) x5.h.b(context);
            return this;
        }

        @Override // q3.n.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public a d(boolean z8) {
            this.f38134c = (Boolean) x5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // q3.n.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public a j(boolean z8) {
            this.f38141j = (Boolean) x5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // q3.n.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a e(boolean z8) {
            this.f38140i = (Boolean) x5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // q3.n.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f38139h = (Set) x5.h.b(set);
            return this;
        }

        @Override // q3.n.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public a c(Function0 function0) {
            this.f38138g = (Function0) x5.h.b(function0);
            return this;
        }

        @Override // q3.n.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public a g(Map map) {
            this.f38137f = (Map) x5.h.b(map);
            return this;
        }

        @Override // q3.n.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public a f(S5.g gVar) {
            this.f38136e = (S5.g) x5.h.b(gVar);
            return this;
        }

        @Override // q3.n.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public a h(S5.g gVar) {
            this.f38135d = (S5.g) x5.h.b(gVar);
            return this;
        }
    }

    /* renamed from: q3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0860b implements n {

        /* renamed from: a, reason: collision with root package name */
        private final C0860b f38142a;

        /* renamed from: b, reason: collision with root package name */
        private x5.i f38143b;

        /* renamed from: c, reason: collision with root package name */
        private x5.i f38144c;

        /* renamed from: d, reason: collision with root package name */
        private x5.i f38145d;

        /* renamed from: e, reason: collision with root package name */
        private x5.i f38146e;

        /* renamed from: f, reason: collision with root package name */
        private x5.i f38147f;

        /* renamed from: g, reason: collision with root package name */
        private x5.i f38148g;

        /* renamed from: h, reason: collision with root package name */
        private x5.i f38149h;

        /* renamed from: i, reason: collision with root package name */
        private x5.i f38150i;

        /* renamed from: j, reason: collision with root package name */
        private x5.i f38151j;

        /* renamed from: k, reason: collision with root package name */
        private x5.i f38152k;

        /* renamed from: l, reason: collision with root package name */
        private x5.i f38153l;

        /* renamed from: m, reason: collision with root package name */
        private x5.i f38154m;

        /* renamed from: n, reason: collision with root package name */
        private x5.i f38155n;

        /* renamed from: o, reason: collision with root package name */
        private x5.i f38156o;

        /* renamed from: p, reason: collision with root package name */
        private x5.i f38157p;

        /* renamed from: q, reason: collision with root package name */
        private x5.i f38158q;

        /* renamed from: r, reason: collision with root package name */
        private x5.i f38159r;

        /* renamed from: s, reason: collision with root package name */
        private x5.i f38160s;

        /* renamed from: t, reason: collision with root package name */
        private x5.i f38161t;

        /* renamed from: u, reason: collision with root package name */
        private x5.i f38162u;

        /* renamed from: v, reason: collision with root package name */
        private x5.i f38163v;

        /* renamed from: w, reason: collision with root package name */
        private x5.i f38164w;

        /* renamed from: x, reason: collision with root package name */
        private x5.i f38165x;

        /* renamed from: y, reason: collision with root package name */
        private x5.i f38166y;

        /* renamed from: z, reason: collision with root package name */
        private x5.i f38167z;

        private void b(I i8, C4186a c4186a, Context context, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Boolean bool, S5.g gVar, S5.g gVar2, Map map, Function0 function0, Set set, Boolean bool2, Boolean bool3) {
            x5.c cVar = new x5.c();
            this.f38143b = cVar;
            x5.i c8 = x5.d.c(r.a(cVar));
            this.f38144c = c8;
            this.f38145d = x5.d.c(C3523e.a(c8));
            x5.e a8 = x5.f.a(context);
            this.f38146e = a8;
            x5.i c9 = x5.d.c(p.a(a8));
            this.f38147f = c9;
            this.f38148g = x5.d.c(q.a(this.f38143b, c9));
            x5.e a9 = x5.f.a(bool);
            this.f38149h = a9;
            this.f38150i = x5.d.c(x2.c.a(c4186a, a9));
            x5.e a10 = x5.f.a(gVar);
            this.f38151j = a10;
            this.f38152k = A2.n.a(this.f38150i, a10);
            this.f38153l = x5.f.a(paymentAnalyticsRequestFactory);
            this.f38154m = x5.f.a(gVar2);
            this.f38155n = x5.f.a(function0);
            x5.e a11 = x5.f.a(bool2);
            this.f38156o = a11;
            this.f38157p = x5.d.c(C3531m.a(this.f38148g, this.f38144c, this.f38152k, this.f38153l, this.f38149h, this.f38154m, this.f38155n, a11));
            x5.i c10 = x5.d.c(C3533o.a(this.f38144c));
            this.f38158q = c10;
            this.f38159r = J.a(i8, c10);
            x5.e a12 = x5.f.a(map);
            this.f38160s = a12;
            x5.i c11 = x5.d.c(C3538t.a(this.f38148g, this.f38152k, this.f38153l, this.f38149h, this.f38154m, a12, this.f38155n, this.f38156o, this.f38147f, C3528j.a()));
            this.f38161t = c11;
            this.f38162u = x5.d.c(C3535q.a(c11, this.f38145d, this.f38146e));
            this.f38163v = x5.d.c(C3831A.a());
            x5.e a13 = x5.f.a(set);
            this.f38164w = a13;
            this.f38165x = x5.d.c(C3741c.a(this.f38163v, this.f38149h, this.f38155n, a13));
            this.f38166y = x5.g.b(11).c(StripeIntent.a.n.class, this.f38159r).c(StripeIntent.a.j.C0485a.class, this.f38161t).c(StripeIntent.a.i.class, this.f38161t).c(StripeIntent.a.C0476a.class, this.f38161t).c(StripeIntent.a.f.class, this.f38162u).c(StripeIntent.a.g.class, this.f38162u).c(StripeIntent.a.e.class, this.f38162u).c(StripeIntent.a.d.class, this.f38162u).c(StripeIntent.a.c.class, this.f38161t).c(StripeIntent.a.k.class, this.f38161t).c(StripeIntent.a.j.b.class, this.f38165x).b();
            x5.e a14 = x5.f.a(bool3);
            this.f38167z = a14;
            x5.c.a(this.f38143b, x5.d.c(C3521c.a(this.f38145d, this.f38157p, this.f38166y, a14, this.f38146e)));
        }

        @Override // q3.n
        public C3519a a() {
            return (C3519a) this.f38143b.get();
        }

        private C0860b(I i8, C4186a c4186a, Context context, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Boolean bool, S5.g gVar, S5.g gVar2, Map map, Function0 function0, Set set, Boolean bool2, Boolean bool3) {
            this.f38142a = this;
            b(i8, c4186a, context, paymentAnalyticsRequestFactory, bool, gVar, gVar2, map, function0, set, bool2, bool3);
        }
    }

    public static n.a a() {
        return new a();
    }
}
