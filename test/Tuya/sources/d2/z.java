package D2;

import D2.InterfaceC1091a;
import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import q3.C3650c;

/* loaded from: classes4.dex */
public abstract class z {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC1091a.InterfaceC0027a {

        /* renamed from: a, reason: collision with root package name */
        private Application f1429a;

        /* renamed from: b, reason: collision with root package name */
        private B2.a f1430b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f1431c;

        /* renamed from: d, reason: collision with root package name */
        private SavedStateHandle f1432d;

        private a() {
        }

        @Override // D2.InterfaceC1091a.InterfaceC0027a
        public InterfaceC1091a build() {
            u5.h.a(this.f1429a, Application.class);
            u5.h.a(this.f1430b, B2.a.class);
            u5.h.a(this.f1432d, SavedStateHandle.class);
            return new b(new J2.f(), this.f1429a, this.f1430b, this.f1431c, this.f1432d);
        }

        @Override // D2.InterfaceC1091a.InterfaceC0027a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(Application application) {
            this.f1429a = (Application) u5.h.b(application);
            return this;
        }

        @Override // D2.InterfaceC1091a.InterfaceC0027a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(B2.a aVar) {
            this.f1430b = (B2.a) u5.h.b(aVar);
            return this;
        }

        @Override // D2.InterfaceC1091a.InterfaceC0027a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(SavedStateHandle savedStateHandle) {
            this.f1432d = (SavedStateHandle) u5.h.b(savedStateHandle);
            return this;
        }

        @Override // D2.InterfaceC1091a.InterfaceC0027a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d(Integer num) {
            this.f1431c = num;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    private static final class b implements InterfaceC1091a {

        /* renamed from: A, reason: collision with root package name */
        private u5.i f1433A;

        /* renamed from: a, reason: collision with root package name */
        private final b f1434a;

        /* renamed from: b, reason: collision with root package name */
        private u5.i f1435b;

        /* renamed from: c, reason: collision with root package name */
        private u5.i f1436c;

        /* renamed from: d, reason: collision with root package name */
        private u5.i f1437d;

        /* renamed from: e, reason: collision with root package name */
        private u5.i f1438e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f1439f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f1440g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f1441h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f1442i;

        /* renamed from: j, reason: collision with root package name */
        private u5.i f1443j;

        /* renamed from: k, reason: collision with root package name */
        private u5.i f1444k;

        /* renamed from: l, reason: collision with root package name */
        private u5.i f1445l;

        /* renamed from: m, reason: collision with root package name */
        private u5.i f1446m;

        /* renamed from: n, reason: collision with root package name */
        private u5.i f1447n;

        /* renamed from: o, reason: collision with root package name */
        private u5.i f1448o;

        /* renamed from: p, reason: collision with root package name */
        private u5.i f1449p;

        /* renamed from: q, reason: collision with root package name */
        private com.stripe.android.payments.paymentlauncher.f f1450q;

        /* renamed from: r, reason: collision with root package name */
        private u5.i f1451r;

        /* renamed from: s, reason: collision with root package name */
        private u5.i f1452s;

        /* renamed from: t, reason: collision with root package name */
        private u5.i f1453t;

        /* renamed from: u, reason: collision with root package name */
        private u5.i f1454u;

        /* renamed from: v, reason: collision with root package name */
        private u5.i f1455v;

        /* renamed from: w, reason: collision with root package name */
        private u5.i f1456w;

        /* renamed from: x, reason: collision with root package name */
        private u5.i f1457x;

        /* renamed from: y, reason: collision with root package name */
        private u5.i f1458y;

        /* renamed from: z, reason: collision with root package name */
        private u5.i f1459z;

        private void b(J2.f fVar, Application application, B2.a aVar, Integer num, SavedStateHandle savedStateHandle) {
            u5.e a8 = u5.f.a(application);
            this.f1435b = a8;
            i a9 = i.a(a8);
            this.f1436c = a9;
            h a10 = h.a(a9);
            this.f1437d = a10;
            this.f1438e = e.b(a10);
            this.f1439f = w.a(this.f1435b);
            this.f1440g = u5.f.a(aVar);
            this.f1441h = m.a(s.a());
            this.f1442i = f.b(this.f1435b);
            o a11 = o.a(this.f1436c);
            this.f1443j = a11;
            this.f1444k = e3.j.a(this.f1442i, a11, n.a());
            this.f1445l = x2.n.a(this.f1441h, g.a());
            this.f1446m = e3.k.a(this.f1442i, this.f1443j, g.a(), n.a(), this.f1444k, this.f1445l, this.f1441h);
            j a12 = j.a(this.f1435b, this.f1436c);
            this.f1447n = a12;
            this.f1448o = C2.d.a(this.f1445l, a12, g.a());
            this.f1449p = u5.f.a(savedStateHandle);
            com.stripe.android.payments.paymentlauncher.f a13 = com.stripe.android.payments.paymentlauncher.f.a(s.a(), n.a());
            this.f1450q = a13;
            this.f1451r = com.stripe.android.payments.paymentlauncher.e.b(a13);
            this.f1452s = u5.f.b(num);
            this.f1453t = p.a(this.f1436c);
            this.f1454u = C3650c.a(this.f1446m, l.a(), this.f1443j, this.f1453t);
            this.f1455v = t.a(this.f1447n, this.f1445l);
            this.f1456w = u.a(this.f1449p, this.f1436c, q.a(), this.f1451r, this.f1452s, this.f1454u, this.f1455v);
            this.f1457x = J2.g.a(fVar, this.f1442i, this.f1441h);
            H3.h a14 = H3.h.a(this.f1446m, this.f1436c, g.a());
            this.f1458y = a14;
            this.f1459z = B2.g.a(this.f1437d, this.f1457x, a14, v.a(), X2.e.a(), this.f1455v, g.a());
            this.f1433A = u5.d.c(B2.e.a(this.f1435b, this.f1438e, x.a(), this.f1436c, this.f1439f, this.f1440g, this.f1441h, this.f1446m, this.f1448o, k.a(), this.f1437d, this.f1456w, this.f1459z, v.a(), r.a(), this.f1455v));
        }

        @Override // D2.InterfaceC1091a
        public com.stripe.android.customersheet.d a() {
            return (com.stripe.android.customersheet.d) this.f1433A.get();
        }

        private b(J2.f fVar, Application application, B2.a aVar, Integer num, SavedStateHandle savedStateHandle) {
            this.f1434a = this;
            b(fVar, application, aVar, num, savedStateHandle);
        }
    }

    public static InterfaceC1091a.InterfaceC0027a a() {
        return new a();
    }
}
