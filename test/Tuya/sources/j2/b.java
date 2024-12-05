package J2;

import J2.l;
import J2.m;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.h;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import j2.C3073m;
import j2.n;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import r2.InterfaceC3684d;
import s0.C3723m;
import u2.C3801a;
import x2.j;

/* loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements l.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f4729a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f4730b;

        /* renamed from: c, reason: collision with root package name */
        private Function0 f4731c;

        /* renamed from: d, reason: collision with root package name */
        private Function0 f4732d;

        /* renamed from: e, reason: collision with root package name */
        private Set f4733e;

        /* renamed from: f, reason: collision with root package name */
        private h.d f4734f;

        private a() {
        }

        @Override // J2.l.a
        public l build() {
            u5.h.a(this.f4729a, Context.class);
            u5.h.a(this.f4730b, Boolean.class);
            u5.h.a(this.f4731c, Function0.class);
            u5.h.a(this.f4732d, Function0.class);
            u5.h.a(this.f4733e, Set.class);
            u5.h.a(this.f4734f, h.d.class);
            return new C0092b(new u2.d(), new C3801a(), this.f4729a, this.f4730b, this.f4731c, this.f4732d, this.f4733e, this.f4734f);
        }

        @Override // J2.l.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f4729a = (Context) u5.h.b(context);
            return this;
        }

        @Override // J2.l.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d(boolean z8) {
            this.f4730b = (Boolean) u5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // J2.l.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a f(h.d dVar) {
            this.f4734f = (h.d) u5.h.b(dVar);
            return this;
        }

        @Override // J2.l.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f4733e = (Set) u5.h.b(set);
            return this;
        }

        @Override // J2.l.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a c(Function0 function0) {
            this.f4731c = (Function0) u5.h.b(function0);
            return this;
        }

        @Override // J2.l.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a e(Function0 function0) {
            this.f4732d = (Function0) u5.h.b(function0);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0092b implements l {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f4735a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f4736b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f4737c;

        /* renamed from: d, reason: collision with root package name */
        private final Set f4738d;

        /* renamed from: e, reason: collision with root package name */
        private final C0092b f4739e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f4740f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f4741g;

        /* renamed from: h, reason: collision with root package name */
        private u5.i f4742h;

        /* renamed from: i, reason: collision with root package name */
        private u5.i f4743i;

        /* renamed from: j, reason: collision with root package name */
        private u5.i f4744j;

        /* renamed from: k, reason: collision with root package name */
        private u5.i f4745k;

        /* renamed from: l, reason: collision with root package name */
        private u5.i f4746l;

        /* renamed from: m, reason: collision with root package name */
        private u5.i f4747m;

        /* renamed from: n, reason: collision with root package name */
        private u5.i f4748n;

        /* renamed from: o, reason: collision with root package name */
        private u5.i f4749o;

        /* renamed from: p, reason: collision with root package name */
        private u5.i f4750p;

        /* renamed from: q, reason: collision with root package name */
        private u5.i f4751q;

        private x2.m h() {
            return new x2.m((InterfaceC3684d) this.f4747m.get(), (P5.g) this.f4745k.get());
        }

        private void i(u2.d dVar, C3801a c3801a, Context context, Boolean bool, Function0 function0, Function0 function02, Set set, h.d dVar2) {
            this.f4740f = u5.f.a(dVar2);
            u5.e a8 = u5.f.a(context);
            this.f4741g = a8;
            I2.b a9 = I2.b.a(a8);
            this.f4742h = a9;
            u5.i c8 = u5.d.c(a9);
            this.f4743i = c8;
            this.f4744j = u5.d.c(k.a(this.f4740f, c8));
            this.f4745k = u5.d.c(u2.f.a(dVar));
            u5.e a10 = u5.f.a(bool);
            this.f4746l = a10;
            this.f4747m = u5.d.c(u2.c.a(c3801a, a10));
            this.f4748n = u5.f.a(function0);
            u5.e a11 = u5.f.a(function02);
            this.f4749o = a11;
            this.f4750p = u5.d.c(n.a(this.f4748n, a11, this.f4740f));
            this.f4751q = u5.d.c(com.stripe.android.googlepaylauncher.c.a(this.f4741g, this.f4740f, this.f4747m));
        }

        private PaymentAnalyticsRequestFactory j() {
            return new PaymentAnalyticsRequestFactory(this.f4737c, this.f4735a, this.f4738d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.stripe.android.networking.a k() {
            return new com.stripe.android.networking.a(this.f4737c, this.f4735a, (P5.g) this.f4745k.get(), this.f4738d, j(), h(), (InterfaceC3684d) this.f4747m.get());
        }

        @Override // J2.l
        public m.a a() {
            return new c(this.f4739e);
        }

        private C0092b(u2.d dVar, C3801a c3801a, Context context, Boolean bool, Function0 function0, Function0 function02, Set set, h.d dVar2) {
            this.f4739e = this;
            this.f4735a = function0;
            this.f4736b = function02;
            this.f4737c = context;
            this.f4738d = set;
            i(dVar, c3801a, context, bool, function0, function02, set, dVar2);
        }
    }

    /* loaded from: classes4.dex */
    private static final class c implements m.a {

        /* renamed from: a, reason: collision with root package name */
        private final C0092b f4752a;

        /* renamed from: b, reason: collision with root package name */
        private GooglePayPaymentMethodLauncherContractV2.a f4753b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f4754c;

        @Override // J2.m.a
        public m build() {
            u5.h.a(this.f4753b, GooglePayPaymentMethodLauncherContractV2.a.class);
            u5.h.a(this.f4754c, SavedStateHandle.class);
            return new d(this.f4752a, this.f4753b, this.f4754c);
        }

        @Override // J2.m.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c b(GooglePayPaymentMethodLauncherContractV2.a aVar) {
            this.f4753b = (GooglePayPaymentMethodLauncherContractV2.a) u5.h.b(aVar);
            return this;
        }

        @Override // J2.m.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c a(SavedStateHandle savedStateHandle) {
            this.f4754c = (SavedStateHandle) u5.h.b(savedStateHandle);
            return this;
        }

        private c(C0092b c0092b) {
            this.f4752a = c0092b;
        }
    }

    /* loaded from: classes4.dex */
    private static final class d implements m {

        /* renamed from: a, reason: collision with root package name */
        private final GooglePayPaymentMethodLauncherContractV2.a f4755a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f4756b;

        /* renamed from: c, reason: collision with root package name */
        private final C0092b f4757c;

        /* renamed from: d, reason: collision with root package name */
        private final d f4758d;

        private j.c b() {
            return new j.c(this.f4757c.f4735a, this.f4757c.f4736b);
        }

        @Override // J2.m
        public com.stripe.android.googlepaylauncher.j a() {
            return new com.stripe.android.googlepaylauncher.j((C3723m) this.f4757c.f4744j.get(), b(), this.f4755a, this.f4757c.k(), (C3073m) this.f4757c.f4750p.get(), (I2.g) this.f4757c.f4751q.get(), this.f4756b);
        }

        private d(C0092b c0092b, GooglePayPaymentMethodLauncherContractV2.a aVar, SavedStateHandle savedStateHandle) {
            this.f4758d = this;
            this.f4757c = c0092b;
            this.f4755a = aVar;
            this.f4756b = savedStateHandle;
        }
    }

    public static l.a a() {
        return new a();
    }
}
