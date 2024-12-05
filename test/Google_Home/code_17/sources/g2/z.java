package G2;

import G2.InterfaceC1190a;
import a3.C1623e;
import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import t3.C4029c;

/* loaded from: classes4.dex */
public abstract class z {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC1190a.InterfaceC0052a {

        /* renamed from: a, reason: collision with root package name */
        private Application f2971a;

        /* renamed from: b, reason: collision with root package name */
        private E2.a f2972b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f2973c;

        /* renamed from: d, reason: collision with root package name */
        private SavedStateHandle f2974d;

        private a() {
        }

        @Override // G2.InterfaceC1190a.InterfaceC0052a
        public InterfaceC1190a build() {
            x5.h.a(this.f2971a, Application.class);
            x5.h.a(this.f2972b, E2.a.class);
            x5.h.a(this.f2974d, SavedStateHandle.class);
            return new b(new M2.f(), this.f2971a, this.f2972b, this.f2973c, this.f2974d);
        }

        @Override // G2.InterfaceC1190a.InterfaceC0052a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(Application application) {
            this.f2971a = (Application) x5.h.b(application);
            return this;
        }

        @Override // G2.InterfaceC1190a.InterfaceC0052a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(E2.a aVar) {
            this.f2972b = (E2.a) x5.h.b(aVar);
            return this;
        }

        @Override // G2.InterfaceC1190a.InterfaceC0052a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(SavedStateHandle savedStateHandle) {
            this.f2974d = (SavedStateHandle) x5.h.b(savedStateHandle);
            return this;
        }

        @Override // G2.InterfaceC1190a.InterfaceC0052a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d(Integer num) {
            this.f2973c = num;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    private static final class b implements InterfaceC1190a {

        /* renamed from: A, reason: collision with root package name */
        private x5.i f2975A;

        /* renamed from: a, reason: collision with root package name */
        private final b f2976a;

        /* renamed from: b, reason: collision with root package name */
        private x5.i f2977b;

        /* renamed from: c, reason: collision with root package name */
        private x5.i f2978c;

        /* renamed from: d, reason: collision with root package name */
        private x5.i f2979d;

        /* renamed from: e, reason: collision with root package name */
        private x5.i f2980e;

        /* renamed from: f, reason: collision with root package name */
        private x5.i f2981f;

        /* renamed from: g, reason: collision with root package name */
        private x5.i f2982g;

        /* renamed from: h, reason: collision with root package name */
        private x5.i f2983h;

        /* renamed from: i, reason: collision with root package name */
        private x5.i f2984i;

        /* renamed from: j, reason: collision with root package name */
        private x5.i f2985j;

        /* renamed from: k, reason: collision with root package name */
        private x5.i f2986k;

        /* renamed from: l, reason: collision with root package name */
        private x5.i f2987l;

        /* renamed from: m, reason: collision with root package name */
        private x5.i f2988m;

        /* renamed from: n, reason: collision with root package name */
        private x5.i f2989n;

        /* renamed from: o, reason: collision with root package name */
        private x5.i f2990o;

        /* renamed from: p, reason: collision with root package name */
        private x5.i f2991p;

        /* renamed from: q, reason: collision with root package name */
        private com.stripe.android.payments.paymentlauncher.f f2992q;

        /* renamed from: r, reason: collision with root package name */
        private x5.i f2993r;

        /* renamed from: s, reason: collision with root package name */
        private x5.i f2994s;

        /* renamed from: t, reason: collision with root package name */
        private x5.i f2995t;

        /* renamed from: u, reason: collision with root package name */
        private x5.i f2996u;

        /* renamed from: v, reason: collision with root package name */
        private x5.i f2997v;

        /* renamed from: w, reason: collision with root package name */
        private x5.i f2998w;

        /* renamed from: x, reason: collision with root package name */
        private x5.i f2999x;

        /* renamed from: y, reason: collision with root package name */
        private x5.i f3000y;

        /* renamed from: z, reason: collision with root package name */
        private x5.i f3001z;

        private void b(M2.f fVar, Application application, E2.a aVar, Integer num, SavedStateHandle savedStateHandle) {
            x5.e a8 = x5.f.a(application);
            this.f2977b = a8;
            i a9 = i.a(a8);
            this.f2978c = a9;
            h a10 = h.a(a9);
            this.f2979d = a10;
            this.f2980e = e.b(a10);
            this.f2981f = w.a(this.f2977b);
            this.f2982g = x5.f.a(aVar);
            this.f2983h = m.a(s.a());
            this.f2984i = f.b(this.f2977b);
            o a11 = o.a(this.f2978c);
            this.f2985j = a11;
            this.f2986k = h3.j.a(this.f2984i, a11, n.a());
            this.f2987l = A2.n.a(this.f2983h, g.a());
            this.f2988m = h3.k.a(this.f2984i, this.f2985j, g.a(), n.a(), this.f2986k, this.f2987l, this.f2983h);
            j a12 = j.a(this.f2977b, this.f2978c);
            this.f2989n = a12;
            this.f2990o = F2.d.a(this.f2987l, a12, g.a());
            this.f2991p = x5.f.a(savedStateHandle);
            com.stripe.android.payments.paymentlauncher.f a13 = com.stripe.android.payments.paymentlauncher.f.a(s.a(), n.a());
            this.f2992q = a13;
            this.f2993r = com.stripe.android.payments.paymentlauncher.e.b(a13);
            this.f2994s = x5.f.b(num);
            this.f2995t = p.a(this.f2978c);
            this.f2996u = C4029c.a(this.f2988m, l.a(), this.f2985j, this.f2995t);
            this.f2997v = t.a(this.f2989n, this.f2987l);
            this.f2998w = u.a(this.f2991p, this.f2978c, q.a(), this.f2993r, this.f2994s, this.f2996u, this.f2997v);
            this.f2999x = M2.g.a(fVar, this.f2984i, this.f2983h);
            K3.h a14 = K3.h.a(this.f2988m, this.f2978c, g.a());
            this.f3000y = a14;
            this.f3001z = E2.g.a(this.f2979d, this.f2999x, a14, v.a(), C1623e.a(), this.f2997v, g.a());
            this.f2975A = x5.d.c(E2.e.a(this.f2977b, this.f2980e, x.a(), this.f2978c, this.f2981f, this.f2982g, this.f2983h, this.f2988m, this.f2990o, k.a(), this.f2979d, this.f2998w, this.f3001z, v.a(), r.a(), this.f2997v));
        }

        @Override // G2.InterfaceC1190a
        public com.stripe.android.customersheet.d a() {
            return (com.stripe.android.customersheet.d) this.f2975A.get();
        }

        private b(M2.f fVar, Application application, E2.a aVar, Integer num, SavedStateHandle savedStateHandle) {
            this.f2976a = this;
            b(fVar, application, aVar, num, savedStateHandle);
        }
    }

    public static InterfaceC1190a.InterfaceC0052a a() {
        return new a();
    }
}
