package A3;

import A3.G;
import A3.InterfaceC0951a;
import A3.InterfaceC0955e;
import a3.C1626h;
import android.app.Application;
import android.content.Context;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import com.stripe.android.paymentsheet.addresselement.g;
import com.stripe.android.paymentsheet.addresselement.h;
import h4.C2950q0;
import i4.InterfaceC2987b;
import java.util.Map;
import v3.C4101d;
import v3.InterfaceC4099b;
import x2.C4186a;

/* renamed from: A3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0956f {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A3.f$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC0951a {

        /* renamed from: a, reason: collision with root package name */
        private final AddressElementActivityContract.a f311a;

        /* renamed from: b, reason: collision with root package name */
        private final Context f312b;

        /* renamed from: c, reason: collision with root package name */
        private final a f313c;

        /* renamed from: d, reason: collision with root package name */
        private x5.i f314d;

        /* renamed from: e, reason: collision with root package name */
        private x5.i f315e;

        /* renamed from: f, reason: collision with root package name */
        private x5.i f316f;

        /* renamed from: g, reason: collision with root package name */
        private x5.i f317g;

        /* renamed from: h, reason: collision with root package name */
        private x5.i f318h;

        /* renamed from: i, reason: collision with root package name */
        private x5.i f319i;

        /* renamed from: j, reason: collision with root package name */
        private x5.i f320j;

        /* renamed from: k, reason: collision with root package name */
        private x5.i f321k;

        /* renamed from: l, reason: collision with root package name */
        private x5.i f322l;

        /* renamed from: m, reason: collision with root package name */
        private x5.i f323m;

        /* renamed from: n, reason: collision with root package name */
        private x5.i f324n;

        /* renamed from: o, reason: collision with root package name */
        private x5.i f325o;

        /* renamed from: p, reason: collision with root package name */
        private x5.i f326p;

        /* renamed from: q, reason: collision with root package name */
        private x5.i f327q;

        /* renamed from: r, reason: collision with root package name */
        private x5.i f328r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: A3.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0003a implements x5.i {
            C0003a() {
            }

            @Override // L5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public G.a get() {
                return new g(a.this.f313c);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: A3.f$a$b */
        /* loaded from: classes4.dex */
        public class b implements x5.i {
            b() {
            }

            @Override // L5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public InterfaceC0955e.a get() {
                return new b(a.this.f313c);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: A3.f$a$c */
        /* loaded from: classes4.dex */
        public class c implements x5.i {
            c() {
            }

            @Override // L5.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h.a get() {
                return new e(a.this.f313c);
            }
        }

        private void i(x2.d dVar, C4186a c4186a, C0952b c0952b, Context context, AddressElementActivityContract.a aVar) {
            this.f314d = x5.d.c(u3.c.a());
            this.f315e = new C0003a();
            this.f316f = new b();
            x5.i c8 = x5.d.c(S.a());
            this.f317g = c8;
            this.f318h = x5.d.c(x2.c.a(c4186a, c8));
            x5.i c9 = x5.d.c(x2.f.a(dVar));
            this.f319i = c9;
            this.f320j = A2.n.a(this.f318h, c9);
            x5.e a8 = x5.f.a(context);
            this.f321k = a8;
            T a9 = T.a(a8);
            this.f322l = a9;
            N a10 = N.a(this.f321k, a9);
            this.f323m = a10;
            x5.i c10 = x5.d.c(C4101d.a(this.f320j, a10, this.f319i));
            this.f324n = c10;
            this.f325o = x5.d.c(C0953c.a(c0952b, c10));
            this.f326p = new c();
            x5.e a11 = x5.f.a(aVar);
            this.f327q = a11;
            this.f328r = x5.d.c(C0954d.a(c0952b, this.f321k, a11));
        }

        @Override // A3.InterfaceC0951a
        public com.stripe.android.paymentsheet.addresselement.c a() {
            return new com.stripe.android.paymentsheet.addresselement.c((com.stripe.android.paymentsheet.addresselement.a) this.f314d.get(), this.f315e, this.f316f);
        }

        private a(x2.d dVar, C4186a c4186a, C0952b c0952b, Context context, AddressElementActivityContract.a aVar) {
            this.f313c = this;
            this.f311a = aVar;
            this.f312b = context;
            i(dVar, c4186a, c0952b, context, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A3.f$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC0955e.a {

        /* renamed from: a, reason: collision with root package name */
        private final a f332a;

        /* renamed from: b, reason: collision with root package name */
        private Application f333b;

        /* renamed from: c, reason: collision with root package name */
        private g.c f334c;

        @Override // A3.InterfaceC0955e.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b b(Application application) {
            this.f333b = (Application) x5.h.b(application);
            return this;
        }

        @Override // A3.InterfaceC0955e.a
        public InterfaceC0955e build() {
            x5.h.a(this.f333b, Application.class);
            x5.h.a(this.f334c, g.c.class);
            return new c(this.f332a, this.f333b, this.f334c);
        }

        @Override // A3.InterfaceC0955e.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b c(g.c cVar) {
            this.f334c = (g.c) x5.h.b(cVar);
            return this;
        }

        private b(a aVar) {
            this.f332a = aVar;
        }
    }

    /* renamed from: A3.f$c */
    /* loaded from: classes4.dex */
    private static final class c implements InterfaceC0955e {

        /* renamed from: a, reason: collision with root package name */
        private final g.c f335a;

        /* renamed from: b, reason: collision with root package name */
        private final Application f336b;

        /* renamed from: c, reason: collision with root package name */
        private final a f337c;

        /* renamed from: d, reason: collision with root package name */
        private final c f338d;

        @Override // A3.InterfaceC0955e
        public com.stripe.android.paymentsheet.addresselement.g a() {
            return new com.stripe.android.paymentsheet.addresselement.g(this.f337c.f311a, (com.stripe.android.paymentsheet.addresselement.a) this.f337c.f314d.get(), (InterfaceC2987b) this.f337c.f328r.get(), this.f335a, (InterfaceC4099b) this.f337c.f325o.get(), this.f336b);
        }

        private c(a aVar, Application application, g.c cVar) {
            this.f338d = this;
            this.f337c = aVar;
            this.f335a = cVar;
            this.f336b = application;
        }
    }

    /* renamed from: A3.f$d */
    /* loaded from: classes4.dex */
    private static final class d implements InterfaceC0951a.InterfaceC0002a {

        /* renamed from: a, reason: collision with root package name */
        private Context f339a;

        /* renamed from: b, reason: collision with root package name */
        private AddressElementActivityContract.a f340b;

        private d() {
        }

        @Override // A3.InterfaceC0951a.InterfaceC0002a
        public InterfaceC0951a build() {
            x5.h.a(this.f339a, Context.class);
            x5.h.a(this.f340b, AddressElementActivityContract.a.class);
            return new a(new x2.d(), new C4186a(), new C0952b(), this.f339a, this.f340b);
        }

        @Override // A3.InterfaceC0951a.InterfaceC0002a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a(Context context) {
            this.f339a = (Context) x5.h.b(context);
            return this;
        }

        @Override // A3.InterfaceC0951a.InterfaceC0002a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public d b(AddressElementActivityContract.a aVar) {
            this.f340b = (AddressElementActivityContract.a) x5.h.b(aVar);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A3.f$e */
    /* loaded from: classes4.dex */
    public static final class e implements h.a {

        /* renamed from: a, reason: collision with root package name */
        private final a f341a;

        /* renamed from: b, reason: collision with root package name */
        private C2950q0 f342b;

        /* renamed from: c, reason: collision with root package name */
        private Map f343c;

        /* renamed from: d, reason: collision with root package name */
        private Map f344d;

        /* renamed from: e, reason: collision with root package name */
        private l6.M f345e;

        /* renamed from: f, reason: collision with root package name */
        private StripeIntent f346f;

        /* renamed from: g, reason: collision with root package name */
        private String f347g;

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        public com.stripe.android.paymentsheet.addresselement.h build() {
            x5.h.a(this.f342b, C2950q0.class);
            x5.h.a(this.f343c, Map.class);
            x5.h.a(this.f345e, l6.M.class);
            x5.h.a(this.f347g, String.class);
            return new C0004f(this.f341a, this.f342b, this.f343c, this.f344d, this.f345e, this.f346f, this.f347g);
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public e f(C2950q0 c2950q0) {
            this.f342b = (C2950q0) x5.h.b(c2950q0);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public e a(Map map) {
            this.f343c = (Map) x5.h.b(map);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public e b(String str) {
            this.f347g = (String) x5.h.b(str);
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public e c(Map map) {
            this.f344d = map;
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public e e(StripeIntent stripeIntent) {
            this.f346f = stripeIntent;
            return this;
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public e d(l6.M m8) {
            this.f345e = (l6.M) x5.h.b(m8);
            return this;
        }

        private e(a aVar) {
            this.f341a = aVar;
        }
    }

    /* renamed from: A3.f$f, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0004f implements com.stripe.android.paymentsheet.addresselement.h {

        /* renamed from: a, reason: collision with root package name */
        private final C2950q0 f348a;

        /* renamed from: b, reason: collision with root package name */
        private final String f349b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f350c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f351d;

        /* renamed from: e, reason: collision with root package name */
        private final a f352e;

        /* renamed from: f, reason: collision with root package name */
        private final C0004f f353f;

        private C1626h b() {
            return u3.k.a(this.f352e.f312b, this.f349b, this.f350c, this.f351d);
        }

        @Override // com.stripe.android.paymentsheet.addresselement.h
        public u3.i a() {
            return new u3.i(this.f348a, b());
        }

        private C0004f(a aVar, C2950q0 c2950q0, Map map, Map map2, l6.M m8, StripeIntent stripeIntent, String str) {
            this.f353f = this;
            this.f352e = aVar;
            this.f348a = c2950q0;
            this.f349b = str;
            this.f350c = map;
            this.f351d = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A3.f$g */
    /* loaded from: classes4.dex */
    public static final class g implements G.a {

        /* renamed from: a, reason: collision with root package name */
        private final a f354a;

        @Override // A3.G.a
        public G build() {
            return new h(this.f354a);
        }

        private g(a aVar) {
            this.f354a = aVar;
        }
    }

    /* renamed from: A3.f$h */
    /* loaded from: classes4.dex */
    private static final class h implements G {

        /* renamed from: a, reason: collision with root package name */
        private final a f355a;

        /* renamed from: b, reason: collision with root package name */
        private final h f356b;

        @Override // A3.G
        public com.stripe.android.paymentsheet.addresselement.j a() {
            return new com.stripe.android.paymentsheet.addresselement.j(this.f355a.f311a, (com.stripe.android.paymentsheet.addresselement.a) this.f355a.f314d.get(), (InterfaceC4099b) this.f355a.f325o.get(), this.f355a.f326p);
        }

        private h(a aVar) {
            this.f356b = this;
            this.f355a = aVar;
        }
    }

    public static InterfaceC0951a.InterfaceC0002a a() {
        return new d();
    }
}
