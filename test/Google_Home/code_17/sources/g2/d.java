package G2;

import A2.C0947e;
import A2.InterfaceC0945c;
import G2.d;
import M3.C1315j;
import M3.InterfaceC1324t;
import P5.AbstractC1378t;
import P5.a0;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.customersheet.e;
import com.stripe.android.paymentsheet.e;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.C3347b0;
import r3.C3917a;
import u2.InterfaceC4057d;

/* loaded from: classes4.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2936a = a.f2937a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f2937a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final B3.f f2938b = null;

        /* renamed from: G2.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0053a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L5.a f2939a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0053a(L5.a aVar) {
                super(0);
                this.f2939a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(j6.n.C(((m2.r) this.f2939a.get()).g(), "pk_live", false, 2, null));
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L5.a f2940a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(L5.a aVar) {
                super(0);
                this.f2940a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return ((m2.r) this.f2940a.get()).g();
            }
        }

        /* loaded from: classes4.dex */
        static final class c extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ L5.a f2941a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(L5.a aVar) {
                super(0);
                this.f2941a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return ((m2.r) this.f2941a.get()).h();
            }
        }

        /* renamed from: G2.d$a$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0054d extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Integer f2942a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0054d(Integer num) {
                super(0);
                this.f2942a = num;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return this.f2942a;
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String g(L5.a paymentConfiguration) {
            AbstractC3255y.i(paymentConfiguration, "$paymentConfiguration");
            return ((m2.r) paymentConfiguration.get()).g();
        }

        public final List b(Function0 isLiveModeProvider) {
            AbstractC3255y.i(isLiveModeProvider, "isLiveModeProvider");
            return AbstractC1378t.e(new e.c(((Boolean) isLiveModeProvider.invoke()).booleanValue()));
        }

        public final Context c(Application application) {
            AbstractC3255y.i(application, "application");
            return application;
        }

        public final S5.g d() {
            return C3347b0.b();
        }

        public final Function0 e(L5.a paymentConfiguration) {
            AbstractC3255y.i(paymentConfiguration, "paymentConfiguration");
            return new C0053a(paymentConfiguration);
        }

        public final m2.r f(Application application) {
            AbstractC3255y.i(application, "application");
            return m2.r.f35037c.a(application);
        }

        public final C0947e h(Application application, final L5.a paymentConfiguration) {
            AbstractC3255y.i(application, "application");
            AbstractC3255y.i(paymentConfiguration, "paymentConfiguration");
            PackageManager packageManager = application.getPackageManager();
            String packageName = application.getPackageName();
            if (packageName == null) {
                packageName = "";
            }
            return new C0947e(packageManager, D2.a.f1776a.a(application), packageName, new L5.a() { // from class: G2.b
                @Override // L5.a
                public final Object get() {
                    String g8;
                    g8 = d.a.g(L5.a.this);
                    return g8;
                }
            }, new G2.c(new A2.u(application)), null, 32, null);
        }

        public final S5.g i() {
            return C3347b0.b();
        }

        public final boolean j() {
            return false;
        }

        public final InterfaceC4057d k(boolean z8) {
            return InterfaceC4057d.f39950a.a(z8);
        }

        public final Set l() {
            return a0.d("CustomerSheet");
        }

        public final Function0 m(L5.a paymentConfiguration) {
            AbstractC3255y.i(paymentConfiguration, "paymentConfiguration");
            return new b(paymentConfiguration);
        }

        public final Function0 n(L5.a paymentConfiguration) {
            AbstractC3255y.i(paymentConfiguration, "paymentConfiguration");
            return new c(paymentConfiguration);
        }

        public final com.stripe.android.paymentsheet.paymentdatacollection.bacs.b o() {
            return com.stripe.android.paymentsheet.paymentdatacollection.bacs.g.f27240a;
        }

        public final InterfaceC1324t.a p() {
            return C1315j.a.f6940a;
        }

        public final boolean q() {
            return false;
        }

        public final n3.i r(C0947e analyticsRequestFactory, InterfaceC0945c analyticsRequestExecutor) {
            AbstractC3255y.i(analyticsRequestFactory, "analyticsRequestFactory");
            AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
            return new n3.j(analyticsRequestExecutor, analyticsRequestFactory);
        }

        public final e.d s(SavedStateHandle savedStateHandle, L5.a paymentConfigurationProvider, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bacsMandateConfirmationLauncherFactory, com.stripe.android.payments.paymentlauncher.d stripePaymentLauncherAssistedFactory, Integer num, com.stripe.android.paymentsheet.f intentConfirmationInterceptor, n3.i errorReporter) {
            AbstractC3255y.i(savedStateHandle, "savedStateHandle");
            AbstractC3255y.i(paymentConfigurationProvider, "paymentConfigurationProvider");
            AbstractC3255y.i(bacsMandateConfirmationLauncherFactory, "bacsMandateConfirmationLauncherFactory");
            AbstractC3255y.i(stripePaymentLauncherAssistedFactory, "stripePaymentLauncherAssistedFactory");
            AbstractC3255y.i(intentConfirmationInterceptor, "intentConfirmationInterceptor");
            AbstractC3255y.i(errorReporter, "errorReporter");
            return new e.d(intentConfirmationInterceptor, paymentConfigurationProvider, bacsMandateConfirmationLauncherFactory, stripePaymentLauncherAssistedFactory, null, savedStateHandle, new C0054d(num), errorReporter, null);
        }

        public final r3.d t() {
            return C3917a.f38584a;
        }

        public final Resources u(Application application) {
            AbstractC3255y.i(application, "application");
            Resources resources = application.getResources();
            AbstractC3255y.h(resources, "getResources(...)");
            return resources;
        }

        public final B3.f v() {
            return f2938b;
        }
    }
}
