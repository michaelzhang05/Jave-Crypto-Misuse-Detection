package n3;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import m3.C3397b;
import n3.E;
import n3.F;
import r2.InterfaceC3684d;
import u2.C3801a;

/* renamed from: n3.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3464j {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.j$a */
    /* loaded from: classes4.dex */
    public static final class a implements E.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f36077a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f36078b;

        /* renamed from: c, reason: collision with root package name */
        private Function0 f36079c;

        /* renamed from: d, reason: collision with root package name */
        private Set f36080d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f36081e;

        private a() {
        }

        @Override // n3.E.a
        public E build() {
            u5.h.a(this.f36077a, Context.class);
            u5.h.a(this.f36078b, Boolean.class);
            u5.h.a(this.f36079c, Function0.class);
            u5.h.a(this.f36080d, Set.class);
            u5.h.a(this.f36081e, Boolean.class);
            return new b(new u2.d(), new C3801a(), this.f36077a, this.f36078b, this.f36079c, this.f36080d, this.f36081e);
        }

        @Override // n3.E.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f36077a = (Context) u5.h.b(context);
            return this;
        }

        @Override // n3.E.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a d(boolean z8) {
            this.f36078b = (Boolean) u5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // n3.E.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a e(boolean z8) {
            this.f36081e = (Boolean) u5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // n3.E.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f36080d = (Set) u5.h.b(set);
            return this;
        }

        @Override // n3.E.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a c(Function0 function0) {
            this.f36079c = (Function0) u5.h.b(function0);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.j$b */
    /* loaded from: classes4.dex */
    public static final class b implements E {

        /* renamed from: a, reason: collision with root package name */
        private final Context f36082a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f36083b;

        /* renamed from: c, reason: collision with root package name */
        private final Set f36084c;

        /* renamed from: d, reason: collision with root package name */
        private final Boolean f36085d;

        /* renamed from: e, reason: collision with root package name */
        private final b f36086e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f36087f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f36088g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f36089h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f36090i;

        /* renamed from: j, reason: collision with root package name */
        private u5.i f36091j;

        /* renamed from: k, reason: collision with root package name */
        private u5.i f36092k;

        /* renamed from: l, reason: collision with root package name */
        private u5.i f36093l;

        /* renamed from: m, reason: collision with root package name */
        private u5.i f36094m;

        /* renamed from: n, reason: collision with root package name */
        private u5.i f36095n;

        /* renamed from: o, reason: collision with root package name */
        private u5.i f36096o;

        /* renamed from: p, reason: collision with root package name */
        private u5.i f36097p;

        /* renamed from: q, reason: collision with root package name */
        private u5.i f36098q;

        /* renamed from: r, reason: collision with root package name */
        private u5.i f36099r;

        /* JADX INFO: Access modifiers changed from: private */
        public x2.m j() {
            return new x2.m((InterfaceC3684d) this.f36089h.get(), (P5.g) this.f36087f.get());
        }

        private void k(u2.d dVar, C3801a c3801a, Context context, Boolean bool, Function0 function0, Set set, Boolean bool2) {
            this.f36087f = u5.d.c(u2.f.a(dVar));
            u5.e a8 = u5.f.a(bool);
            this.f36088g = a8;
            this.f36089h = u5.d.c(u2.c.a(c3801a, a8));
            u5.e a9 = u5.f.a(context);
            this.f36090i = a9;
            this.f36091j = u5.d.c(D.a(a9, this.f36088g, this.f36087f));
            this.f36092k = u5.d.c(C3454C.a());
            this.f36093l = u5.f.a(function0);
            u5.e a10 = u5.f.a(set);
            this.f36094m = a10;
            this.f36095n = e3.j.a(this.f36090i, this.f36093l, a10);
            x2.n a11 = x2.n.a(this.f36089h, this.f36087f);
            this.f36096o = a11;
            this.f36097p = e3.k.a(this.f36090i, this.f36093l, this.f36087f, this.f36094m, this.f36095n, a11, this.f36089h);
            u5.i c8 = u5.d.c(x2.s.a());
            this.f36098q = c8;
            this.f36099r = u5.d.c(C3397b.a(this.f36097p, this.f36096o, this.f36095n, c8, this.f36089h, this.f36087f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public PaymentAnalyticsRequestFactory l() {
            return new PaymentAnalyticsRequestFactory(this.f36082a, this.f36083b, this.f36084c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.stripe.android.networking.a m() {
            return new com.stripe.android.networking.a(this.f36082a, this.f36083b, (P5.g) this.f36087f.get(), this.f36084c, l(), j(), (InterfaceC3684d) this.f36089h.get());
        }

        @Override // n3.E
        public F.a a() {
            return new c(this.f36086e);
        }

        private b(u2.d dVar, C3801a c3801a, Context context, Boolean bool, Function0 function0, Set set, Boolean bool2) {
            this.f36086e = this;
            this.f36082a = context;
            this.f36083b = function0;
            this.f36084c = set;
            this.f36085d = bool2;
            k(dVar, c3801a, context, bool, function0, set, bool2);
        }
    }

    /* renamed from: n3.j$c */
    /* loaded from: classes4.dex */
    private static final class c implements F.a {

        /* renamed from: a, reason: collision with root package name */
        private final b f36100a;

        /* renamed from: b, reason: collision with root package name */
        private Stripe3ds2TransactionContract.a f36101b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f36102c;

        /* renamed from: d, reason: collision with root package name */
        private Application f36103d;

        @Override // n3.F.a
        public F build() {
            u5.h.a(this.f36101b, Stripe3ds2TransactionContract.a.class);
            u5.h.a(this.f36102c, SavedStateHandle.class);
            u5.h.a(this.f36103d, Application.class);
            return new d(this.f36100a, new G(), this.f36101b, this.f36102c, this.f36103d);
        }

        @Override // n3.F.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c b(Application application) {
            this.f36103d = (Application) u5.h.b(application);
            return this;
        }

        @Override // n3.F.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public c c(Stripe3ds2TransactionContract.a aVar) {
            this.f36101b = (Stripe3ds2TransactionContract.a) u5.h.b(aVar);
            return this;
        }

        @Override // n3.F.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public c a(SavedStateHandle savedStateHandle) {
            this.f36102c = (SavedStateHandle) u5.h.b(savedStateHandle);
            return this;
        }

        private c(b bVar) {
            this.f36100a = bVar;
        }
    }

    /* renamed from: n3.j$d */
    /* loaded from: classes4.dex */
    private static final class d implements F {

        /* renamed from: a, reason: collision with root package name */
        private final Stripe3ds2TransactionContract.a f36104a;

        /* renamed from: b, reason: collision with root package name */
        private final G f36105b;

        /* renamed from: c, reason: collision with root package name */
        private final Application f36106c;

        /* renamed from: d, reason: collision with root package name */
        private final SavedStateHandle f36107d;

        /* renamed from: e, reason: collision with root package name */
        private final b f36108e;

        /* renamed from: f, reason: collision with root package name */
        private final d f36109f;

        private X3.n b() {
            return H.a(this.f36105b, this.f36106c, this.f36104a, (P5.g) this.f36108e.f36087f.get());
        }

        @Override // n3.F
        public com.stripe.android.payments.core.authentication.threeds2.d a() {
            return new com.stripe.android.payments.core.authentication.threeds2.d(this.f36104a, this.f36108e.m(), this.f36108e.j(), this.f36108e.l(), (W3.a) this.f36108e.f36091j.get(), (X3.p) this.f36108e.f36092k.get(), (m3.d) this.f36108e.f36099r.get(), b(), (P5.g) this.f36108e.f36087f.get(), this.f36107d, this.f36108e.f36085d.booleanValue());
        }

        private d(b bVar, G g8, Stripe3ds2TransactionContract.a aVar, SavedStateHandle savedStateHandle, Application application) {
            this.f36109f = this;
            this.f36108e = bVar;
            this.f36104a = aVar;
            this.f36105b = g8;
            this.f36106c = application;
            this.f36107d = savedStateHandle;
        }
    }

    public static E.a a() {
        return new a();
    }
}
