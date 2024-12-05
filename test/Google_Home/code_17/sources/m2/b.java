package M2;

import A2.j;
import M2.l;
import M2.m;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.googlepaylauncher.h;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import m2.C3427m;
import m2.n;
import r0.C3905m;
import u2.InterfaceC4057d;
import x2.C4186a;

/* loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class a implements l.a {

        /* renamed from: a, reason: collision with root package name */
        private Context f6435a;

        /* renamed from: b, reason: collision with root package name */
        private Boolean f6436b;

        /* renamed from: c, reason: collision with root package name */
        private Function0 f6437c;

        /* renamed from: d, reason: collision with root package name */
        private Function0 f6438d;

        /* renamed from: e, reason: collision with root package name */
        private Set f6439e;

        /* renamed from: f, reason: collision with root package name */
        private h.d f6440f;

        private a() {
        }

        @Override // M2.l.a
        public l build() {
            x5.h.a(this.f6435a, Context.class);
            x5.h.a(this.f6436b, Boolean.class);
            x5.h.a(this.f6437c, Function0.class);
            x5.h.a(this.f6438d, Function0.class);
            x5.h.a(this.f6439e, Set.class);
            x5.h.a(this.f6440f, h.d.class);
            return new C0117b(new x2.d(), new C4186a(), this.f6435a, this.f6436b, this.f6437c, this.f6438d, this.f6439e, this.f6440f);
        }

        @Override // M2.l.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(Context context) {
            this.f6435a = (Context) x5.h.b(context);
            return this;
        }

        @Override // M2.l.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d(boolean z8) {
            this.f6436b = (Boolean) x5.h.b(Boolean.valueOf(z8));
            return this;
        }

        @Override // M2.l.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a f(h.d dVar) {
            this.f6440f = (h.d) x5.h.b(dVar);
            return this;
        }

        @Override // M2.l.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a b(Set set) {
            this.f6439e = (Set) x5.h.b(set);
            return this;
        }

        @Override // M2.l.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public a c(Function0 function0) {
            this.f6437c = (Function0) x5.h.b(function0);
            return this;
        }

        @Override // M2.l.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a e(Function0 function0) {
            this.f6438d = (Function0) x5.h.b(function0);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0117b implements l {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f6441a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f6442b;

        /* renamed from: c, reason: collision with root package name */
        private final Context f6443c;

        /* renamed from: d, reason: collision with root package name */
        private final Set f6444d;

        /* renamed from: e, reason: collision with root package name */
        private final C0117b f6445e;

        /* renamed from: f, reason: collision with root package name */
        private x5.i f6446f;

        /* renamed from: g, reason: collision with root package name */
        private x5.i f6447g;

        /* renamed from: h, reason: collision with root package name */
        private x5.i f6448h;

        /* renamed from: i, reason: collision with root package name */
        private x5.i f6449i;

        /* renamed from: j, reason: collision with root package name */
        private x5.i f6450j;

        /* renamed from: k, reason: collision with root package name */
        private x5.i f6451k;

        /* renamed from: l, reason: collision with root package name */
        private x5.i f6452l;

        /* renamed from: m, reason: collision with root package name */
        private x5.i f6453m;

        /* renamed from: n, reason: collision with root package name */
        private x5.i f6454n;

        /* renamed from: o, reason: collision with root package name */
        private x5.i f6455o;

        /* renamed from: p, reason: collision with root package name */
        private x5.i f6456p;

        /* renamed from: q, reason: collision with root package name */
        private x5.i f6457q;

        private A2.m h() {
            return new A2.m((InterfaceC4057d) this.f6453m.get(), (S5.g) this.f6451k.get());
        }

        private void i(x2.d dVar, C4186a c4186a, Context context, Boolean bool, Function0 function0, Function0 function02, Set set, h.d dVar2) {
            this.f6446f = x5.f.a(dVar2);
            x5.e a8 = x5.f.a(context);
            this.f6447g = a8;
            L2.b a9 = L2.b.a(a8);
            this.f6448h = a9;
            x5.i c8 = x5.d.c(a9);
            this.f6449i = c8;
            this.f6450j = x5.d.c(k.a(this.f6446f, c8));
            this.f6451k = x5.d.c(x2.f.a(dVar));
            x5.e a10 = x5.f.a(bool);
            this.f6452l = a10;
            this.f6453m = x5.d.c(x2.c.a(c4186a, a10));
            this.f6454n = x5.f.a(function0);
            x5.e a11 = x5.f.a(function02);
            this.f6455o = a11;
            this.f6456p = x5.d.c(n.a(this.f6454n, a11, this.f6446f));
            this.f6457q = x5.d.c(com.stripe.android.googlepaylauncher.c.a(this.f6447g, this.f6446f, this.f6453m));
        }

        private PaymentAnalyticsRequestFactory j() {
            return new PaymentAnalyticsRequestFactory(this.f6443c, this.f6441a, this.f6444d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.stripe.android.networking.a k() {
            return new com.stripe.android.networking.a(this.f6443c, this.f6441a, (S5.g) this.f6451k.get(), this.f6444d, j(), h(), (InterfaceC4057d) this.f6453m.get());
        }

        @Override // M2.l
        public m.a a() {
            return new c(this.f6445e);
        }

        private C0117b(x2.d dVar, C4186a c4186a, Context context, Boolean bool, Function0 function0, Function0 function02, Set set, h.d dVar2) {
            this.f6445e = this;
            this.f6441a = function0;
            this.f6442b = function02;
            this.f6443c = context;
            this.f6444d = set;
            i(dVar, c4186a, context, bool, function0, function02, set, dVar2);
        }
    }

    /* loaded from: classes4.dex */
    private static final class c implements m.a {

        /* renamed from: a, reason: collision with root package name */
        private final C0117b f6458a;

        /* renamed from: b, reason: collision with root package name */
        private GooglePayPaymentMethodLauncherContractV2.a f6459b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f6460c;

        @Override // M2.m.a
        public m build() {
            x5.h.a(this.f6459b, GooglePayPaymentMethodLauncherContractV2.a.class);
            x5.h.a(this.f6460c, SavedStateHandle.class);
            return new d(this.f6458a, this.f6459b, this.f6460c);
        }

        @Override // M2.m.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c b(GooglePayPaymentMethodLauncherContractV2.a aVar) {
            this.f6459b = (GooglePayPaymentMethodLauncherContractV2.a) x5.h.b(aVar);
            return this;
        }

        @Override // M2.m.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c a(SavedStateHandle savedStateHandle) {
            this.f6460c = (SavedStateHandle) x5.h.b(savedStateHandle);
            return this;
        }

        private c(C0117b c0117b) {
            this.f6458a = c0117b;
        }
    }

    /* loaded from: classes4.dex */
    private static final class d implements m {

        /* renamed from: a, reason: collision with root package name */
        private final GooglePayPaymentMethodLauncherContractV2.a f6461a;

        /* renamed from: b, reason: collision with root package name */
        private final SavedStateHandle f6462b;

        /* renamed from: c, reason: collision with root package name */
        private final C0117b f6463c;

        /* renamed from: d, reason: collision with root package name */
        private final d f6464d;

        private j.c b() {
            return new j.c(this.f6463c.f6441a, this.f6463c.f6442b);
        }

        @Override // M2.m
        public com.stripe.android.googlepaylauncher.j a() {
            return new com.stripe.android.googlepaylauncher.j((C3905m) this.f6463c.f6450j.get(), b(), this.f6461a, this.f6463c.k(), (C3427m) this.f6463c.f6456p.get(), (L2.g) this.f6463c.f6457q.get(), this.f6462b);
        }

        private d(C0117b c0117b, GooglePayPaymentMethodLauncherContractV2.a aVar, SavedStateHandle savedStateHandle) {
            this.f6464d = this;
            this.f6463c = c0117b;
            this.f6461a = aVar;
            this.f6462b = savedStateHandle;
        }
    }

    public static l.a a() {
        return new a();
    }
}
