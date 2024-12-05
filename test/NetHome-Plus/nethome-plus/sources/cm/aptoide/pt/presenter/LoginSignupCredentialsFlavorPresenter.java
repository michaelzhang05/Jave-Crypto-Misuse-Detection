package cm.aptoide.pt.presenter;

import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.pt.account.AccountAnalytics;
import cm.aptoide.pt.account.view.AccountNavigator;
import cm.aptoide.pt.account.view.LoginSignUpCredentialsConfiguration;
import cm.aptoide.pt.crashreports.CrashReport;
import cm.aptoide.pt.presenter.View;
import cm.aptoide.pt.view.ThrowableToStringMapper;
import java.util.Collection;

/* loaded from: classes.dex */
public class LoginSignupCredentialsFlavorPresenter extends LoginSignUpCredentialsPresenter {
    private final AccountNavigator accountNavigator;
    private final CrashReport crashReport;
    private final ThrowableToStringMapper errorMapper;
    private final LoginSignUpCredentialsView view;

    public LoginSignupCredentialsFlavorPresenter(LoginSignUpCredentialsView loginSignUpCredentialsView, AptoideAccountManager aptoideAccountManager, CrashReport crashReport, LoginSignUpCredentialsConfiguration loginSignUpCredentialsConfiguration, AccountNavigator accountNavigator, Collection<String> collection, ThrowableToStringMapper throwableToStringMapper, AccountAnalytics accountAnalytics) {
        super(loginSignUpCredentialsView, aptoideAccountManager, crashReport, loginSignUpCredentialsConfiguration, accountNavigator, collection, throwableToStringMapper, accountAnalytics);
        this.view = loginSignUpCredentialsView;
        this.errorMapper = throwableToStringMapper;
        this.crashReport = crashReport;
        this.accountNavigator = accountNavigator;
    }

    private void handleClickOnPrivacyPolicy() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.presenter.a1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.presenter.y0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return LoginSignupCredentialsFlavorPresenter.this.A((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.presenter.g1
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignupCredentialsFlavorPresenter.this.B((Void) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.presenter.t0
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignupCredentialsFlavorPresenter.lambda$handleClickOnPrivacyPolicy$8((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.presenter.q0
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignupCredentialsFlavorPresenter.this.C((Throwable) obj);
            }
        });
    }

    private void handleClickOnTermsAndConditions() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.presenter.x0
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.presenter.c1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return LoginSignupCredentialsFlavorPresenter.this.D((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.presenter.b1
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignupCredentialsFlavorPresenter.this.E((Void) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.presenter.r0
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignupCredentialsFlavorPresenter.lambda$handleClickOnTermsAndConditions$3((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.presenter.e1
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignupCredentialsFlavorPresenter.this.F((Throwable) obj);
            }
        });
    }

    private void handleConnectWithEmailClick() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.presenter.h1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.presenter.u0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return LoginSignupCredentialsFlavorPresenter.this.H((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.presenter.v0
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignupCredentialsFlavorPresenter.lambda$handleConnectWithEmailClick$16((Boolean) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.presenter.d1
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignupCredentialsFlavorPresenter.this.I((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnPrivacyPolicy$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e A(View.LifecycleEvent lifecycleEvent) {
        return this.view.privacyPolicyClickEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnPrivacyPolicy$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void B(Void r1) {
        this.accountNavigator.navigateToPrivacyPolicy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnPrivacyPolicy$8(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnPrivacyPolicy$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void C(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnTermsAndConditions$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e D(View.LifecycleEvent lifecycleEvent) {
        return this.view.termsAndConditionsClickEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnTermsAndConditions$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void E(Void r1) {
        this.accountNavigator.navigateToTermsAndConditions();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleClickOnTermsAndConditions$3(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnTermsAndConditions$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void F(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Boolean lambda$handleConnectWithEmailClick$13(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleConnectWithEmailClick$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void G(Boolean bool) {
        this.view.showAptoideLoginArea();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleConnectWithEmailClick$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e H(View.LifecycleEvent lifecycleEvent) {
        return this.view.showAptoideLoginAreaClick().x(new rx.m.b() { // from class: cm.aptoide.pt.presenter.c4
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignupCredentialsFlavorPresenter.this.showNotCheckedMessage(((Boolean) obj).booleanValue());
            }
        }).D(new rx.m.e() { // from class: cm.aptoide.pt.presenter.s0
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                LoginSignupCredentialsFlavorPresenter.lambda$handleConnectWithEmailClick$13(bool);
                return bool;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.presenter.w0
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignupCredentialsFlavorPresenter.this.G((Boolean) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleConnectWithEmailClick$16(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleConnectWithEmailClick$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void I(Throwable th) {
        this.view.hideLoading();
        this.view.showError(this.errorMapper.map(th));
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showTCandPP$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void J(View.LifecycleEvent lifecycleEvent) {
        this.view.showTCandPP();
    }

    private void showTCandPP() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.presenter.f1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.presenter.z0
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignupCredentialsFlavorPresenter.this.J((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).D0();
    }

    @Override // cm.aptoide.pt.view.BackButton.ClickHandler
    public boolean handle() {
        return this.view.tryCloseLoginBottomSheet(true);
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsPresenter, cm.aptoide.pt.presenter.Presenter
    public void present() {
        showTCandPP();
        super.present();
        handleConnectWithEmailClick();
        handleClickOnTermsAndConditions();
        handleClickOnPrivacyPolicy();
    }
}
