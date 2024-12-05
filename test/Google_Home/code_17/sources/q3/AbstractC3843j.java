package q3;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import p3.C3740b;
import q3.E;
import q3.F;
import u2.InterfaceC4057d;
import x2.C4186a;

/* renamed from: q3.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3843j {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q3.j$a */
    /* loaded from: classes4.dex */
    public static final class a implements E.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f38205a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f38206b;

        /* renamed from: c, reason: collision with root package name */
        private Function0 f38207c;

        /* renamed from: d, reason: collision with root package name */
        private Set f38208d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f38209e;

        private a() {
        }

        @Override // q3.E.a
        public E build() {
            x5.h.a(this.f38205a, Context.class);
            x5.h.a(this.f38206b, Boolean.class);
            x5.h.a(this.f38207c, Function0.class);
            x5.h.a(this.f38208d, Set.class);
            x5.h.a(this.f38209e, Boolean.class);
            return new b(new x2.d(), new C4186a(), this.f38205a, this.f38206b, this.f38207c, this.f38208d, this.f38209e);
        }

        @Override // q3.E.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f38205a = (Context) x5.h.b(context);
            return this;
        }

        @Override // q3.E.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a d(boolean z8) {
            this.f38206b = (Boolean) x5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // q3.E.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a e(boolean z8) {
            this.f38209e = (Boolean) x5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // q3.E.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f38208d = (Set) x5.h.b(set);
            return this;
        }

        @Override // q3.E.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a c(Function0 function0) {
            this.f38207c = (Function0) x5.h.b(function0);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q3.j$b */
    /* loaded from: classes4.dex */
    public static final class b implements E {

        /* renamed from: a, reason: collision with root package name */
        private final Context f38210a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f38211b;

        /* renamed from: c, reason: collision with root package name */
        private final Set f38212c;

        /* renamed from: d, reason: collision with root package name */
        private final Boolean f38213d;

        /* renamed from: e, reason: collision with root package name */
        private final b f38214e;

        /* renamed from: f, reason: collision with root package name */
        private x5.i f38215f;

        /* renamed from: g, reason: collision with root package name */
        private x5.i f38216g;

        /* renamed from: h, reason: collision with root package name */
        private x5.i f38217h;

        /* renamed from: i, reason: collision with root package name */
        private x5.i f38218i;

        /* renamed from: j, reason: collision with root package name */
        private x5.i f38219j;

        /* renamed from: k, reason: collision with root package name */
        private x5.i f38220k;

        /* renamed from: l, reason: collision with root package name */
        private x5.i f38221l;

        /* renamed from: m, reason: collision with root package name */
        private x5.i f38222m;

        /* renamed from: n, reason: collision with root package name */
        private x5.i f38223n;

        /* renamed from: o, reason: collision with root package name */
        private x5.i f38224o;

        /* renamed from: p, reason: collision with root package name */
        private x5.i f38225p;

        /* renamed from: q, reason: collision with root package name */
        private x5.i f38226q;

        /* renamed from: r, reason: collision with root package name */
        private x5.i f38227r;

        /* JADX INFO: Access modifiers changed from: private */
        public A2.m j() {
            return new A2.m((InterfaceC4057d) this.f38217h.get(), (S5.g) this.f38215f.get());
        }

        private void k(x2.d dVar, C4186a c4186a, Context context, Boolean bool, Function0 function0, Set set, Boolean bool2) {
            this.f38215f = x5.d.c(x2.f.a(dVar));
            x5.e a8 = x5.f.a(bool);
            this.f38216g = a8;
            this.f38217h = x5.d.c(x2.c.a(c4186a, a8));
            x5.e a9 = x5.f.a(context);
            this.f38218i = a9;
            this.f38219j = x5.d.c(D.a(a9, this.f38216g, this.f38215f));
            this.f38220k = x5.d.c(C3833C.a());
            this.f38221l = x5.f.a(function0);
            x5.e a10 = x5.f.a(set);
            this.f38222m = a10;
            this.f38223n = h3.j.a(this.f38218i, this.f38221l, a10);
            A2.n a11 = A2.n.a(this.f38217h, this.f38215f);
            this.f38224o = a11;
            this.f38225p = h3.k.a(this.f38218i, this.f38221l, this.f38215f, this.f38222m, this.f38223n, a11, this.f38217h);
            x5.i c8 = x5.d.c(A2.s.a());
            this.f38226q = c8;
            this.f38227r = x5.d.c(C3740b.a(this.f38225p, this.f38224o, this.f38223n, c8, this.f38217h, this.f38215f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PaymentAnalyticsRequestFactory l() {
            return new PaymentAnalyticsRequestFactory(this.f38210a, this.f38211b, this.f38212c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.stripe.android.networking.a m() {
            return new com.stripe.android.networking.a(this.f38210a, this.f38211b, (S5.g) this.f38215f.get(), this.f38212c, l(), j(), (InterfaceC4057d) this.f38217h.get());
        }

        @Override // q3.E
        public F.a a() {
            return new c(this.f38214e);
        }

        private b(x2.d dVar, C4186a c4186a, Context context, Boolean bool, Function0 function0, Set set, Boolean bool2) {
            this.f38214e = this;
            this.f38210a = context;
            this.f38211b = function0;
            this.f38212c = set;
            this.f38213d = bool2;
            k(dVar, c4186a, context, bool, function0, set, bool2);
        }
    }

    /* renamed from: q3.j$c */
    /* loaded from: classes4.dex */
    private static final class c implements F.a {

        /* renamed from: a, reason: collision with root package name */
        private final b f38228a;

        /* renamed from: b, reason: collision with root package name */
        private Stripe3ds2TransactionContract.a f38229b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f38230c;

        /* renamed from: d, reason: collision with root package name */
        private Application f38231d;

        @Override // q3.F.a
        public F build() {
            x5.h.a(this.f38229b, Stripe3ds2TransactionContract.a.class);
            x5.h.a(this.f38230c, SavedStateHandle.class);
            x5.h.a(this.f38231d, Application.class);
            return new d(this.f38228a, new G(), this.f38229b, this.f38230c, this.f38231d);
        }

        @Override // q3.F.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c b(Application application) {
            this.f38231d = (Application) x5.h.b(application);
            return this;
        }

        @Override // q3.F.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public c c(Stripe3ds2TransactionContract.a aVar) {
            this.f38229b = (Stripe3ds2TransactionContract.a) x5.h.b(aVar);
            return this;
        }

        @Override // q3.F.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public c a(SavedStateHandle savedStateHandle) {
            this.f38230c = (SavedStateHandle) x5.h.b(savedStateHandle);
            return this;
        }

        private c(b bVar) {
            this.f38228a = bVar;
        }
    }

    /* renamed from: q3.j$d */
    /* loaded from: classes4.dex */
    private static final class d implements F {

        /* renamed from: a, reason: collision with root package name */
        private final Stripe3ds2TransactionContract.a f38232a;

        /* renamed from: b, reason: collision with root package name */
        private final G f38233b;

        /* renamed from: c, reason: collision with root package name */
        private final Application f38234c;

        /* renamed from: d, reason: collision with root package name */
        private final SavedStateHandle f38235d;

        /* renamed from: e, reason: collision with root package name */
        private final b f38236e;

        /* renamed from: f, reason: collision with root package name */
        private final d f38237f;

        private a4.n b() {
            return H.a(this.f38233b, this.f38234c, this.f38232a, (S5.g) this.f38236e.f38215f.get());
        }

        @Override // q3.F
        public com.stripe.android.payments.core.authentication.threeds2.d a() {
            return new com.stripe.android.payments.core.authentication.threeds2.d(this.f38232a, this.f38236e.m(), this.f38236e.j(), this.f38236e.l(), (Z3.a) this.f38236e.f38219j.get(), (a4.p) this.f38236e.f38220k.get(), (p3.d) this.f38236e.f38227r.get(), b(), (S5.g) this.f38236e.f38215f.get(), this.f38235d, this.f38236e.f38213d.booleanValue());
        }

        private d(b bVar, G g8, Stripe3ds2TransactionContract.a aVar, SavedStateHandle savedStateHandle, Application application) {
            this.f38237f = this;
            this.f38236e = bVar;
            this.f38232a = aVar;
            this.f38233b = g8;
            this.f38234c = application;
            this.f38235d = savedStateHandle;
        }
    }

    public static E.a a() {
        return new a();
    }
}
