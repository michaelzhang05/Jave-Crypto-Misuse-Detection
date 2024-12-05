package h3;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import h3.InterfaceC2746a;
import i3.C2778a;
import i3.C2779b;
import i3.C2780c;
import kotlin.jvm.functions.Function0;
import l6.u;
import r2.InterfaceC3684d;
import u2.C3801a;
import x2.m;

/* renamed from: h3.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2753h {

    /* renamed from: h3.h$a */
    /* loaded from: classes4.dex */
    private static final class a implements InterfaceC2746a.InterfaceC0755a {

        /* renamed from: a, reason: collision with root package name */
        private Application f31387a;

        /* renamed from: b, reason: collision with root package name */
        private u f31388b;

        /* renamed from: c, reason: collision with root package name */
        private SavedStateHandle f31389c;

        /* renamed from: d, reason: collision with root package name */
        private CollectBankAccountContract.a f31390d;

        private a() {
        }

        @Override // h3.InterfaceC2746a.InterfaceC0755a
        public InterfaceC2746a build() {
            u5.h.a(this.f31387a, Application.class);
            u5.h.a(this.f31388b, u.class);
            u5.h.a(this.f31389c, SavedStateHandle.class);
            u5.h.a(this.f31390d, CollectBankAccountContract.a.class);
            return new b(new u2.d(), new C3801a(), this.f31387a, this.f31388b, this.f31389c, this.f31390d);
        }

        @Override // h3.InterfaceC2746a.InterfaceC0755a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(Application application) {
            this.f31387a = (Application) u5.h.b(application);
            return this;
        }

        @Override // h3.InterfaceC2746a.InterfaceC0755a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(CollectBankAccountContract.a aVar) {
            this.f31390d = (CollectBankAccountContract.a) u5.h.b(aVar);
            return this;
        }

        @Override // h3.InterfaceC2746a.InterfaceC0755a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(SavedStateHandle savedStateHandle) {
            this.f31389c = (SavedStateHandle) u5.h.b(savedStateHandle);
            return this;
        }

        @Override // h3.InterfaceC2746a.InterfaceC0755a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d(u uVar) {
            this.f31388b = (u) u5.h.b(uVar);
            return this;
        }
    }

    /* renamed from: h3.h$b */
    /* loaded from: classes4.dex */
    private static final class b implements InterfaceC2746a {

        /* renamed from: a, reason: collision with root package name */
        private final CollectBankAccountContract.a f31391a;

        /* renamed from: b, reason: collision with root package name */
        private final u f31392b;

        /* renamed from: c, reason: collision with root package name */
        private final Application f31393c;

        /* renamed from: d, reason: collision with root package name */
        private final SavedStateHandle f31394d;

        /* renamed from: e, reason: collision with root package name */
        private final b f31395e;

        /* renamed from: f, reason: collision with root package name */
        private u5.i f31396f;

        /* renamed from: g, reason: collision with root package name */
        private u5.i f31397g;

        private C2778a b() {
            return new C2778a(j());
        }

        private Context c() {
            return AbstractC2749d.a(this.f31393c);
        }

        private C2779b d() {
            return new C2779b(j());
        }

        private m e() {
            return new m((InterfaceC3684d) this.f31397g.get(), (P5.g) this.f31396f.get());
        }

        private void f(u2.d dVar, C3801a c3801a, Application application, u uVar, SavedStateHandle savedStateHandle, CollectBankAccountContract.a aVar) {
            this.f31396f = u5.d.c(u2.f.a(dVar));
            this.f31397g = u5.d.c(u2.c.a(c3801a, C2750e.a()));
        }

        private Function0 g() {
            return AbstractC2748c.a(this.f31391a);
        }

        private PaymentAnalyticsRequestFactory h() {
            return new PaymentAnalyticsRequestFactory(c(), g(), AbstractC2751f.a());
        }

        private C2780c i() {
            return new C2780c(j());
        }

        private com.stripe.android.networking.a j() {
            return new com.stripe.android.networking.a(c(), g(), (P5.g) this.f31396f.get(), AbstractC2751f.a(), h(), e(), (InterfaceC3684d) this.f31397g.get());
        }

        @Override // h3.InterfaceC2746a
        public com.stripe.android.payments.bankaccount.ui.b a() {
            return new com.stripe.android.payments.bankaccount.ui.b(this.f31391a, this.f31392b, d(), b(), i(), this.f31394d, (InterfaceC3684d) this.f31397g.get());
        }

        private b(u2.d dVar, C3801a c3801a, Application application, u uVar, SavedStateHandle savedStateHandle, CollectBankAccountContract.a aVar) {
            this.f31395e = this;
            this.f31391a = aVar;
            this.f31392b = uVar;
            this.f31393c = application;
            this.f31394d = savedStateHandle;
            f(dVar, c3801a, application, uVar, savedStateHandle, aVar);
        }
    }

    public static InterfaceC2746a.InterfaceC0755a a() {
        return new a();
    }
}
