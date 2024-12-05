package x3;

import android.app.Application;
import android.content.Context;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.g;
import com.stripe.android.paymentsheet.addresselement.h;
import e4.C2630q0;
import f4.InterfaceC2669b;
import java.util.Map;
import s3.C3748d;
import s3.InterfaceC3746b;
import u2.C3801a;
import x3.InterfaceC3885G;
import x3.InterfaceC3900a;
import x3.InterfaceC3904e;

/* renamed from: x3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3905f {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.f$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3900a {

        /* renamed from: a, reason: collision with root package name */
        private final AddressElementActivityContract.a f39316a;

        /* renamed from: b, reason: collision with root package name */
        private final Context f39317b;

        /* renamed from: c, reason: collision with root package name */
        private final a f39318c;

        /* renamed from: d, reason: collision with root package name */
        private u5.i f39319d;

        /* renamed from: e, reason: collision with root package name */
        private u5.i f39320e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f39321f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f39322g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f39323h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f39324i;

        /* renamed from: j, reason: collision with root package name */
        private u5.i f39325j;

        /* renamed from: k, reason: collision with root package name */
        private u5.i f39326k;

        /* renamed from: l, reason: collision with root package name */
        private u5.i f39327l;

        /* renamed from: m, reason: collision with root package name */
        private u5.i f39328m;

        /* renamed from: n, reason: collision with root package name */
        private u5.i f39329n;

        /* renamed from: o, reason: collision with root package name */
        private u5.i f39330o;

        /* renamed from: p, reason: collision with root package name */
        private u5.i f39331p;

        /* renamed from: q, reason: collision with root package name */
        private u5.i f39332q;

        /* renamed from: r, reason: collision with root package name */
        private u5.i f39333r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x3.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0911a implements u5.i {
            C0911a() {
            }

            @Override // I5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC3885G.a get() {
                return new g(a.this.f39318c);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x3.f$a$b */
        /* loaded from: classes4.dex */
        public class b implements u5.i {
            b() {
            }

            @Override // I5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC3904e.a get() {
                return new b(a.this.f39318c);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: x3.f$a$c */
        /* loaded from: classes4.dex */
        public class c implements u5.i {
            c() {
            }

            @Override // I5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h.a get() {
                return new e(a.this.f39318c);
            }
        }

        private void i(u2.d dVar, C3801a c3801a, C3901b c3901b, Context context, AddressElementActivityContract.a aVar) {
            this.f39319d = u5.d.c(r3.c.a());
            this.f39320e = new C0911a();
            this.f39321f = new b();
            u5.i c8 = u5.d.c(C3896S.a());
            this.f39322g = c8;
            this.f39323h = u5.d.c(u2.c.a(c3801a, c8));
            u5.i c9 = u5.d.c(u2.f.a(dVar));
            this.f39324i = c9;
            this.f39325j = x2.n.a(this.f39323h, c9);
            u5.e a8 = u5.f.a(context);
            this.f39326k = a8;
            C3897T a9 = C3897T.a(a8);
            this.f39327l = a9;
            C3892N a10 = C3892N.a(this.f39326k, a9);
            this.f39328m = a10;
            u5.i c10 = u5.d.c(C3748d.a(this.f39325j, a10, this.f39324i));
            this.f39329n = c10;
            this.f39330o = u5.d.c(C3902c.a(c3901b, c10));
            this.f39331p = new c();
            u5.e a11 = u5.f.a(aVar);
            this.f39332q = a11;
            this.f39333r = u5.d.c(C3903d.a(c3901b, this.f39326k, a11));
        }

        @Override // x3.InterfaceC3900a
        public com.stripe.android.paymentsheet.addresselement.c a() {
            return new com.stripe.android.paymentsheet.addresselement.c((com.stripe.android.paymentsheet.addresselement.a) this.f39319d.get(), this.f39320e, this.f39321f);
        }

        private a(u2.d dVar, C3801a c3801a, C3901b c3901b, Context context, AddressElementActivityContract.a aVar) {
            this.f39318c = this;
            this.f39316a = aVar;
            this.f39317b = context;
            i(dVar, c3801a, c3901b, context, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.f$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3904e.a {

        /* renamed from: a, reason: collision with root package name */
        private final a f39337a;

        /* renamed from: b, reason: collision with root package name */
        private Application f39338b;

        /* renamed from: c, reason: collision with root package name */
        private g.c f39339c;

        @Override // x3.InterfaceC3904e.a
        public InterfaceC3904e build() {
            u5.h.a(this.f39338b, Application.class);
            u5.h.a(this.f39339c, g.c.class);
            return new c(this.f39337a, this.f39338b, this.f39339c);
        }

        @Override // x3.InterfaceC3904e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b b(Application application) {
            this.f39338b = (Application) u5.h.b(application);
            return this;
        }

        @Override // x3.InterfaceC3904e.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a(g.c cVar) {
            this.f39339c = (g.c) u5.h.b(cVar);
            return this;
        }

        private b(a aVar) {
            this.f39337a = aVar;
        }
    }

    /* renamed from: x3.f$c */
    /* loaded from: classes4.dex */
    private static final class c implements InterfaceC3904e {

        /* renamed from: a, reason: collision with root package name */
        private final g.c f39340a;

        /* renamed from: b, reason: collision with root package name */
        private final Application f39341b;

        /* renamed from: c, reason: collision with root package name */
        private final a f39342c;

        /* renamed from: d, reason: collision with root package name */
        private final c f39343d;

        @Override // x3.InterfaceC3904e
        public com.stripe.android.paymentsheet.addresselement.g a() {
            return new com.stripe.android.paymentsheet.addresselement.g(this.f39342c.f39316a, (com.stripe.android.paymentsheet.addresselement.a) this.f39342c.f39319d.get(), (InterfaceC2669b) this.f39342c.f39333r.get(), this.f39340a, (InterfaceC3746b) this.f39342c.f39330o.get(), this.f39341b);
        }

        private c(a aVar, Application application, g.c cVar) {
            this.f39343d = this;
            this.f39342c = aVar;
            this.f39340a = cVar;
            this.f39341b = application;
        }
    }

    /* renamed from: x3.f$d */
    /* loaded from: classes4.dex */
    private static final class d implements InterfaceC3900a.InterfaceC0910a {

        /* renamed from: a, reason: collision with root package name */
        private Context f39344a;

        /* renamed from: b, reason: collision with root package name */
        private AddressElementActivityContract.a f39345b;

        private d() {
        }

        @Override // x3.InterfaceC3900a.InterfaceC0910a
        public InterfaceC3900a build() {
            u5.h.a(this.f39344a, Context.class);
            u5.h.a(this.f39345b, AddressElementActivityContract.a.class);
            return new a(new u2.d(), new C3801a(), new C3901b(), this.f39344a, this.f39345b);
        }

        @Override // x3.InterfaceC3900a.InterfaceC0910a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a(Context context) {
            this.f39344a = (Context) u5.h.b(context);
            return this;
        }

        @Override // x3.InterfaceC3900a.InterfaceC0910a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public d b(AddressElementActivityContract.a aVar) {
            this.f39345b = (AddressElementActivityContract.a) u5.h.b(aVar);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.f$e */
    /* loaded from: classes4.dex */
    public static final class e implements h.a {

        /* renamed from: a, reason: collision with root package name */
        private final a f39346a;

        /* renamed from: b, reason: collision with root package name */
        private C2630q0 f39347b;

        /* renamed from: c, reason: collision with root package name */
        private Map f39348c;

        /* renamed from: d, reason: collision with root package name */
        private Map f39349d;

        /* renamed from: e, reason: collision with root package name */
        private i6.M f39350e;

        /* renamed from: f, reason: collision with root package name */
        private StripeIntent f39351f;

        /* renamed from: g, reason: collision with root package name */
        private String f39352g;

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        public com.stripe.android.paymentsheet.addresselement.h build() {
            u5.h.a(this.f39347b, C2630q0.class);
            u5.h.a(this.f39348c, Map.class);
            u5.h.a(this.f39350e, i6.M.class);
            u5.h.a(this.f39352g, String.class);
            return new C0912f(this.f39346a, this.f39347b, this.f39348c, this.f39349d, this.f39350e, this.f39351f, this.f39352g);
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public e d(C2630q0 c2630q0) {
            this.f39347b = (C2630q0) u5.h.b(c2630q0);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public e a(Map map) {
            this.f39348c = (Map) u5.h.b(map);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public e b(String str) {
            this.f39352g = (String) u5.h.b(str);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public e c(Map map) {
            this.f39349d = map;
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public e f(StripeIntent stripeIntent) {
            this.f39351f = stripeIntent;
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public e e(i6.M m8) {
            this.f39350e = (i6.M) u5.h.b(m8);
            return this;
        }

        private e(a aVar) {
            this.f39346a = aVar;
        }
    }

    /* renamed from: x3.f$f, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0912f implements com.stripe.android.paymentsheet.addresselement.h {

        /* renamed from: a, reason: collision with root package name */
        private final C2630q0 f39353a;

        /* renamed from: b, reason: collision with root package name */
        private final String f39354b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f39355c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f39356d;

        /* renamed from: e, reason: collision with root package name */
        private final a f39357e;

        /* renamed from: f, reason: collision with root package name */
        private final C0912f f39358f;

        private X2.h b() {
            return r3.k.a(this.f39357e.f39317b, this.f39354b, this.f39355c, this.f39356d);
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h
        public r3.i a() {
            return new r3.i(this.f39353a, b());
        }

        private C0912f(a aVar, C2630q0 c2630q0, Map map, Map map2, i6.M m8, StripeIntent stripeIntent, String str) {
            this.f39358f = this;
            this.f39357e = aVar;
            this.f39353a = c2630q0;
            this.f39354b = str;
            this.f39355c = map;
            this.f39356d = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x3.f$g */
    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC3885G.a {

        /* renamed from: a, reason: collision with root package name */
        private final a f39359a;

        @Override // x3.InterfaceC3885G.a
        public InterfaceC3885G build() {
            return new h(this.f39359a);
        }

        private g(a aVar) {
            this.f39359a = aVar;
        }
    }

    /* renamed from: x3.f$h */
    /* loaded from: classes4.dex */
    private static final class h implements InterfaceC3885G {

        /* renamed from: a, reason: collision with root package name */
        private final a f39360a;

        /* renamed from: b, reason: collision with root package name */
        private final h f39361b;

        @Override // x3.InterfaceC3885G
        public com.stripe.android.paymentsheet.addresselement.j a() {
            return new com.stripe.android.paymentsheet.addresselement.j(this.f39360a.f39316a, (com.stripe.android.paymentsheet.addresselement.a) this.f39360a.f39319d.get(), (InterfaceC3746b) this.f39360a.f39330o.get(), this.f39360a.f39331p);
        }

        private h(a aVar) {
            this.f39361b = this;
            this.f39360a = aVar;
        }
    }

    public static InterfaceC3900a.InterfaceC0910a a() {
        return new d();
    }
}
