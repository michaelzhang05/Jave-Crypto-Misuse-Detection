package k3;

import A2.m;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import k3.InterfaceC3213a;
import kotlin.jvm.functions.Function0;
import l3.C3313a;
import l3.C3314b;
import l3.C3315c;
import o6.v;
import u2.InterfaceC4057d;
import x2.C4186a;

/* renamed from: k3.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3220h {

    /* renamed from: k3.h$a */
    /* loaded from: classes4.dex */
    private static final class a implements InterfaceC3213a.InterfaceC0781a {

        /* renamed from: a, reason: collision with root package name */
        private Application f34108a;

        /* renamed from: b, reason: collision with root package name */
        private v f34109b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f34110c;

        /* renamed from: d, reason: collision with root package name */
        private CollectBankAccountContract.a f34111d;

        private a() {
        }

        @Override // k3.InterfaceC3213a.InterfaceC0781a
        public InterfaceC3213a build() {
            x5.h.a(this.f34108a, Application.class);
            x5.h.a(this.f34109b, v.class);
            x5.h.a(this.f34110c, SavedStateHandle.class);
            x5.h.a(this.f34111d, CollectBankAccountContract.a.class);
            return new b(new x2.d(), new C4186a(), this.f34108a, this.f34109b, this.f34110c, this.f34111d);
        }

        @Override // k3.InterfaceC3213a.InterfaceC0781a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(Application application) {
            this.f34108a = (Application) x5.h.b(application);
            return this;
        }

        @Override // k3.InterfaceC3213a.InterfaceC0781a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(CollectBankAccountContract.a aVar) {
            this.f34111d = (CollectBankAccountContract.a) x5.h.b(aVar);
            return this;
        }

        @Override // k3.InterfaceC3213a.InterfaceC0781a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(SavedStateHandle savedStateHandle) {
            this.f34110c = (SavedStateHandle) x5.h.b(savedStateHandle);
            return this;
        }

        @Override // k3.InterfaceC3213a.InterfaceC0781a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d(v vVar) {
            this.f34109b = (v) x5.h.b(vVar);
            return this;
        }
    }

    /* renamed from: k3.h$b */
    /* loaded from: classes4.dex */
    private static final class b implements InterfaceC3213a {

        /* renamed from: a, reason: collision with root package name */
        private final CollectBankAccountContract.a f34112a;

        /* renamed from: b, reason: collision with root package name */
        private final v f34113b;

        /* renamed from: c, reason: collision with root package name */
        private final Application f34114c;

        /* renamed from: d, reason: collision with root package name */
        private final SavedStateHandle f34115d;

        /* renamed from: e, reason: collision with root package name */
        private final b f34116e;

        /* renamed from: f, reason: collision with root package name */
        private x5.i f34117f;

        /* renamed from: g, reason: collision with root package name */
        private x5.i f34118g;

        private C3313a b() {
            return new C3313a(j());
        }

        private Context c() {
            return AbstractC3216d.a(this.f34114c);
        }

        private C3314b d() {
            return new C3314b(j());
        }

        private m e() {
            return new m((InterfaceC4057d) this.f34118g.get(), (S5.g) this.f34117f.get());
        }

        private void f(x2.d dVar, C4186a c4186a, Application application, v vVar, SavedStateHandle savedStateHandle, CollectBankAccountContract.a aVar) {
            this.f34117f = x5.d.c(x2.f.a(dVar));
            this.f34118g = x5.d.c(x2.c.a(c4186a, C3217e.a()));
        }

        private Function0 g() {
            return AbstractC3215c.a(this.f34112a);
        }

        private PaymentAnalyticsRequestFactory h() {
            return new PaymentAnalyticsRequestFactory(c(), g(), AbstractC3218f.a());
        }

        private C3315c i() {
            return new C3315c(j());
        }

        private com.stripe.android.networking.a j() {
            return new com.stripe.android.networking.a(c(), g(), (S5.g) this.f34117f.get(), AbstractC3218f.a(), h(), e(), (InterfaceC4057d) this.f34118g.get());
        }

        @Override // k3.InterfaceC3213a
        public com.stripe.android.payments.bankaccount.ui.b a() {
            return new com.stripe.android.payments.bankaccount.ui.b(this.f34112a, this.f34113b, d(), b(), i(), this.f34115d, (InterfaceC4057d) this.f34118g.get());
        }

        private b(x2.d dVar, C4186a c4186a, Application application, v vVar, SavedStateHandle savedStateHandle, CollectBankAccountContract.a aVar) {
            this.f34116e = this;
            this.f34112a = aVar;
            this.f34113b = vVar;
            this.f34114c = application;
            this.f34115d = savedStateHandle;
            f(dVar, c4186a, application, vVar, savedStateHandle, aVar);
        }
    }

    public static InterfaceC3213a.InterfaceC0781a a() {
        return new a();
    }
}
