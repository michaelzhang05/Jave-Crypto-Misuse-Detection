package D2;

import D2.d;
import J3.C1202j;
import J3.InterfaceC1211t;
import M5.AbstractC1246t;
import M5.a0;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.customersheet.e;
import com.stripe.android.paymentsheet.e;
import i6.C2812b0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import o3.C3527a;
import r2.InterfaceC3684d;
import x2.C3875e;
import x2.InterfaceC3873c;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public interface d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1394a = a.f1395a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f1395a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final AbstractC3991f f1396b = null;

        /* renamed from: D2.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0028a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ I5.a f1397a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0028a(I5.a aVar) {
                super(0);
                this.f1397a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(g6.n.C(((j2.r) this.f1397a.get()).e(), "pk_live", false, 2, null));
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ I5.a f1398a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(I5.a aVar) {
                super(0);
                this.f1398a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return ((j2.r) this.f1398a.get()).e();
            }
        }

        /* loaded from: classes4.dex */
        static final class c extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ I5.a f1399a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(I5.a aVar) {
                super(0);
                this.f1399a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return ((j2.r) this.f1399a.get()).f();
            }
        }

        /* renamed from: D2.d$a$d, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0029d extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Integer f1400a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0029d(Integer num) {
                super(0);
                this.f1400a = num;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return this.f1400a;
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String g(I5.a paymentConfiguration) {
            AbstractC3159y.i(paymentConfiguration, "$paymentConfiguration");
            return ((j2.r) paymentConfiguration.get()).e();
        }

        public final List b(Function0 isLiveModeProvider) {
            AbstractC3159y.i(isLiveModeProvider, "isLiveModeProvider");
            return AbstractC1246t.e(new e.c(((Boolean) isLiveModeProvider.invoke()).booleanValue()));
        }

        public final Context c(Application application) {
            AbstractC3159y.i(application, "application");
            return application;
        }

        public final P5.g d() {
            return C2812b0.b();
        }

        public final Function0 e(I5.a paymentConfiguration) {
            AbstractC3159y.i(paymentConfiguration, "paymentConfiguration");
            return new C0028a(paymentConfiguration);
        }

        public final j2.r f(Application application) {
            AbstractC3159y.i(application, "application");
            return j2.r.f33061c.a(application);
        }

        public final C3875e h(Application application, final I5.a paymentConfiguration) {
            AbstractC3159y.i(application, "application");
            AbstractC3159y.i(paymentConfiguration, "paymentConfiguration");
            PackageManager packageManager = application.getPackageManager();
            String packageName = application.getPackageName();
            if (packageName == null) {
                packageName = "";
            }
            return new C3875e(packageManager, A2.a.f74a.a(application), packageName, new I5.a() { // from class: D2.b
                @Override // I5.a
                public final Object get() {
                    String g8;
                    g8 = d.a.g(I5.a.this);
                    return g8;
                }
            }, new D2.c(new x2.u(application)), null, 32, null);
        }

        public final P5.g i() {
            return C2812b0.b();
        }

        public final boolean j() {
            return false;
        }

        public final InterfaceC3684d k(boolean z8) {
            return InterfaceC3684d.f37570a.a(z8);
        }

        public final Set l() {
            return a0.d("CustomerSheet");
        }

        public final Function0 m(I5.a paymentConfiguration) {
            AbstractC3159y.i(paymentConfiguration, "paymentConfiguration");
            return new b(paymentConfiguration);
        }

        public final Function0 n(I5.a paymentConfiguration) {
            AbstractC3159y.i(paymentConfiguration, "paymentConfiguration");
            return new c(paymentConfiguration);
        }

        public final com.stripe.android.paymentsheet.paymentdatacollection.bacs.b o() {
            return com.stripe.android.paymentsheet.paymentdatacollection.bacs.g.f26185a;
        }

        public final InterfaceC1211t.a p() {
            return C1202j.a.f5234a;
        }

        public final boolean q() {
            return false;
        }

        public final k3.i r(C3875e analyticsRequestFactory, InterfaceC3873c analyticsRequestExecutor) {
            AbstractC3159y.i(analyticsRequestFactory, "analyticsRequestFactory");
            AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
            return new k3.j(analyticsRequestExecutor, analyticsRequestFactory);
        }

        public final e.d s(SavedStateHandle savedStateHandle, I5.a paymentConfigurationProvider, com.stripe.android.paymentsheet.paymentdatacollection.bacs.b bacsMandateConfirmationLauncherFactory, com.stripe.android.payments.paymentlauncher.d stripePaymentLauncherAssistedFactory, Integer num, com.stripe.android.paymentsheet.f intentConfirmationInterceptor, k3.i errorReporter) {
            AbstractC3159y.i(savedStateHandle, "savedStateHandle");
            AbstractC3159y.i(paymentConfigurationProvider, "paymentConfigurationProvider");
            AbstractC3159y.i(bacsMandateConfirmationLauncherFactory, "bacsMandateConfirmationLauncherFactory");
            AbstractC3159y.i(stripePaymentLauncherAssistedFactory, "stripePaymentLauncherAssistedFactory");
            AbstractC3159y.i(intentConfirmationInterceptor, "intentConfirmationInterceptor");
            AbstractC3159y.i(errorReporter, "errorReporter");
            return new e.d(intentConfirmationInterceptor, paymentConfigurationProvider, bacsMandateConfirmationLauncherFactory, stripePaymentLauncherAssistedFactory, null, savedStateHandle, new C0029d(num), errorReporter, null);
        }

        public final o3.d t() {
            return C3527a.f36376a;
        }

        public final Resources u(Application application) {
            AbstractC3159y.i(application, "application");
            Resources resources = application.getResources();
            AbstractC3159y.h(resources, "getResources(...)");
            return resources;
        }

        public final AbstractC3991f v() {
            return f1396b;
        }
    }
}
