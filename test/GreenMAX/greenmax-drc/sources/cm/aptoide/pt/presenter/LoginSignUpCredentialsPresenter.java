package cm.aptoide.pt.presenter;

import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.pt.account.AccountAnalytics;
import cm.aptoide.pt.account.FacebookLoginResult;
import cm.aptoide.pt.account.FacebookSignUpAdapter;
import cm.aptoide.pt.account.FacebookSignUpException;
import cm.aptoide.pt.account.GoogleSignUpAdapter;
import cm.aptoide.pt.account.view.AccountNavigator;
import cm.aptoide.pt.account.view.LoginSignUpCredentialsConfiguration;
import cm.aptoide.pt.crashreports.CrashReport;
import cm.aptoide.pt.presenter.View;
import cm.aptoide.pt.view.BackButton;
import cm.aptoide.pt.view.ThrowableToStringMapper;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collection;
import rx.Single;

/* loaded from: classes.dex */
public abstract class LoginSignUpCredentialsPresenter implements Presenter, BackButton.ClickHandler {
    private static final int RESOLVE_GOOGLE_CREDENTIALS_REQUEST_CODE = 2;
    private final AccountAnalytics accountAnalytics;
    private final AptoideAccountManager accountManager;
    private final AccountNavigator accountNavigator;
    private final LoginSignUpCredentialsConfiguration configuration;
    private final CrashReport crashReport;
    private final ThrowableToStringMapper errorMapper;
    private final Collection<String> permissions;
    private final LoginSignUpCredentialsView view;

    public LoginSignUpCredentialsPresenter(LoginSignUpCredentialsView loginSignUpCredentialsView, AptoideAccountManager aptoideAccountManager, CrashReport crashReport, LoginSignUpCredentialsConfiguration loginSignUpCredentialsConfiguration, AccountNavigator accountNavigator, Collection<String> collection, ThrowableToStringMapper throwableToStringMapper, AccountAnalytics accountAnalytics) {
        this.view = loginSignUpCredentialsView;
        this.accountManager = aptoideAccountManager;
        this.crashReport = crashReport;
        this.configuration = loginSignUpCredentialsConfiguration;
        this.accountNavigator = accountNavigator;
        this.permissions = collection;
        this.errorMapper = throwableToStringMapper;
        this.accountAnalytics = accountAnalytics;
    }

    private void handleAccountStatusChangeWhileShowingView() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.presenter.w
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.RESUME));
                return valueOf;
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.presenter.x
            @Override // rx.m.e
            public final Object call(Object obj) {
                return LoginSignUpCredentialsPresenter.this.a((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.presenter.j0
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.this.b((Account) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.PAUSE)).H0(new rx.m.b() { // from class: cm.aptoide.pt.presenter.y
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.lambda$handleAccountStatusChangeWhileShowingView$7((Account) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.presenter.s
            @Override // rx.m.b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
    }

    private void handleFacebookSignUpEvent() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.presenter.k0
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.presenter.c0
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.this.c((View.LifecycleEvent) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.presenter.c
            @Override // rx.m.e
            public final Object call(Object obj) {
                return LoginSignUpCredentialsPresenter.this.d((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.presenter.q
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.this.e((Boolean) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.presenter.a
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.lambda$handleFacebookSignUpEvent$29((Boolean) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.presenter.m0
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.this.f((Throwable) obj);
            }
        });
    }

    private void handleFacebookSignUpResult() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.presenter.o
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.presenter.h0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return LoginSignUpCredentialsPresenter.this.k((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).D0();
    }

    private void handleFacebookSignUpWithRequiredPermissionsEvent() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.presenter.i
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.presenter.n
            @Override // rx.m.e
            public final Object call(Object obj) {
                return LoginSignUpCredentialsPresenter.this.l((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.presenter.t
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.this.m((Void) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.presenter.r
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.lambda$handleFacebookSignUpWithRequiredPermissionsEvent$34((Void) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.presenter.u
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.this.n((Throwable) obj);
            }
        });
    }

    private void handleGoogleSignUpEvent() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.presenter.z
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.presenter.p
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.this.o((View.LifecycleEvent) obj);
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.presenter.f
            @Override // rx.m.e
            public final Object call(Object obj) {
                return LoginSignUpCredentialsPresenter.this.p((View.LifecycleEvent) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.presenter.o0
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.this.q((Boolean) obj);
            }
        }).L(new rx.m.e() { // from class: cm.aptoide.pt.presenter.j
            @Override // rx.m.e
            public final Object call(Object obj) {
                return LoginSignUpCredentialsPresenter.this.r((Boolean) obj);
            }
        }).j0(rx.l.c.a.b()).x(new rx.m.b() { // from class: cm.aptoide.pt.presenter.i0
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.this.s((ConnectionResult) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.presenter.v
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.lambda$handleGoogleSignUpEvent$16((ConnectionResult) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.presenter.e
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.this.t((Throwable) obj);
            }
        });
    }

    private void handleGoogleSignUpResult() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.presenter.e0
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).G(new rx.m.e() { // from class: cm.aptoide.pt.presenter.l
            @Override // rx.m.e
            public final Object call(Object obj) {
                return LoginSignUpCredentialsPresenter.this.y((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).D0();
    }

    private void handleOpenOptions() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.presenter.k
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.presenter.p0
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.this.z((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.presenter.m
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.lambda$handleOpenOptions$2((View.LifecycleEvent) obj);
            }
        }, new rx.m.b() { // from class: cm.aptoide.pt.presenter.b0
            @Override // rx.m.b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAccountStatusChangeWhileShowingView$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single a(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus().E().Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAccountStatusChangeWhileShowingView$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void b(Account account) {
        if (account.isLoggedIn()) {
            navigateBack();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleAccountStatusChangeWhileShowingView$7(Account account) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFacebookSignUpEvent$25, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void c(View.LifecycleEvent lifecycleEvent) {
        showOrHideFacebookSignUp();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Boolean lambda$handleFacebookSignUpEvent$26(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFacebookSignUpEvent$27, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e d(View.LifecycleEvent lifecycleEvent) {
        return this.view.facebookSignUpEvent().x(new b4(this)).D(new rx.m.e() { // from class: cm.aptoide.pt.presenter.g
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                LoginSignUpCredentialsPresenter.lambda$handleFacebookSignUpEvent$26(bool);
                return bool;
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFacebookSignUpEvent$28, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void e(Boolean bool) {
        this.view.showLoading();
        this.accountAnalytics.sendFacebookLoginButtonPressed();
        this.accountNavigator.navigateToFacebookSignUpForResult(this.permissions);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleFacebookSignUpEvent$29(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFacebookSignUpEvent$30, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void f(Throwable th) {
        this.view.hideLoading();
        this.view.showError(this.errorMapper.map(th));
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFacebookSignUpResult$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void g() {
        this.accountAnalytics.loginSuccess();
        navigateToMainView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFacebookSignUpResult$38, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void h() {
        this.view.hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFacebookSignUpResult$39, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void i(Throwable th) {
        if ((th instanceof FacebookSignUpException) && ((FacebookSignUpException) th).getCode() == 1) {
            this.view.showFacebookPermissionsRequiredError(th);
        }
        this.accountAnalytics.sendLoginErrorEvent(AccountAnalytics.LoginMethod.FACEBOOK, th);
        this.crashReport.log(th);
        this.view.showError(this.errorMapper.map(th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFacebookSignUpResult$40, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b j(FacebookLoginResult facebookLoginResult) {
        return this.accountManager.signUp(FacebookSignUpAdapter.TYPE, facebookLoginResult).z(rx.l.c.a.b()).m(new rx.m.a() { // from class: cm.aptoide.pt.presenter.b
            @Override // rx.m.a
            public final void call() {
                LoginSignUpCredentialsPresenter.this.g();
            }
        }).q(new rx.m.a() { // from class: cm.aptoide.pt.presenter.g0
            @Override // rx.m.a
            public final void call() {
                LoginSignUpCredentialsPresenter.this.h();
            }
        }).n(new rx.m.b() { // from class: cm.aptoide.pt.presenter.f0
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.this.i((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFacebookSignUpResult$41, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e k(View.LifecycleEvent lifecycleEvent) {
        return this.accountNavigator.facebookSignUpResults().H(new rx.m.e() { // from class: cm.aptoide.pt.presenter.n0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return LoginSignUpCredentialsPresenter.this.j((FacebookLoginResult) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFacebookSignUpWithRequiredPermissionsEvent$32, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e l(View.LifecycleEvent lifecycleEvent) {
        return this.view.facebookSignUpWithRequiredPermissionsInEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFacebookSignUpWithRequiredPermissionsEvent$33, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m(Void r2) {
        this.view.showLoading();
        this.accountNavigator.navigateToFacebookSignUpForResult(this.permissions);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleFacebookSignUpWithRequiredPermissionsEvent$34(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFacebookSignUpWithRequiredPermissionsEvent$35, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void n(Throwable th) {
        this.view.hideLoading();
        this.view.showError(this.errorMapper.map(th));
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpEvent$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void o(View.LifecycleEvent lifecycleEvent) {
        showOrHideGoogleSignUp();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Boolean lambda$handleGoogleSignUpEvent$11(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpEvent$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e p(View.LifecycleEvent lifecycleEvent) {
        return this.view.googleSignUpEvent().x(new b4(this)).D(new rx.m.e() { // from class: cm.aptoide.pt.presenter.h
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                LoginSignUpCredentialsPresenter.lambda$handleGoogleSignUpEvent$11(bool);
                return bool;
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpEvent$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void q(Boolean bool) {
        this.view.showLoading();
        this.accountAnalytics.sendGoogleLoginButtonPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpEvent$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single r(Boolean bool) {
        return this.accountNavigator.navigateToGoogleSignUpForResult(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpEvent$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void s(ConnectionResult connectionResult) {
        if (connectionResult.L()) {
            return;
        }
        this.view.showConnectionError(connectionResult);
        this.view.hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleGoogleSignUpEvent$16(ConnectionResult connectionResult) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpEvent$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void t(Throwable th) {
        this.view.hideLoading();
        this.view.showError(this.errorMapper.map(th));
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpResult$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void u() {
        this.accountAnalytics.loginSuccess();
        navigateToMainView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpResult$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void v() {
        this.view.hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpResult$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void w(Throwable th) {
        this.view.showError(this.errorMapper.map(th));
        this.crashReport.log(th);
        this.accountAnalytics.sendLoginErrorEvent(AccountAnalytics.LoginMethod.GOOGLE, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpResult$22, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.b x(GoogleSignInResult googleSignInResult) {
        return this.accountManager.signUp(GoogleSignUpAdapter.TYPE, googleSignInResult).z(rx.l.c.a.b()).m(new rx.m.a() { // from class: cm.aptoide.pt.presenter.d0
            @Override // rx.m.a
            public final void call() {
                LoginSignUpCredentialsPresenter.this.u();
            }
        }).q(new rx.m.a() { // from class: cm.aptoide.pt.presenter.d
            @Override // rx.m.a
            public final void call() {
                LoginSignUpCredentialsPresenter.this.v();
            }
        }).n(new rx.m.b() { // from class: cm.aptoide.pt.presenter.l0
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsPresenter.this.w((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGoogleSignUpResult$23, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ rx.e y(View.LifecycleEvent lifecycleEvent) {
        return this.accountNavigator.googleSignUpResults(2).H(new rx.m.e() { // from class: cm.aptoide.pt.presenter.a0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return LoginSignUpCredentialsPresenter.this.x((GoogleSignInResult) obj);
            }
        }).s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOpenOptions$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void z(View.LifecycleEvent lifecycleEvent) {
        if (this.configuration.getHasMagicLinkError()) {
            this.view.showAptoideLoginArea();
            this.view.showMagicLinkError(this.configuration.getMagicLinkErrorMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$handleOpenOptions$2(View.LifecycleEvent lifecycleEvent) {
    }

    private void navigateBack() {
        this.accountNavigator.popView();
    }

    private void navigateToMainView() {
        if (this.configuration.getDismissToNavigateToMainView()) {
            this.view.dismiss();
        } else if (this.configuration.getCleanBackStack()) {
            navigateToMainViewCleaningBackStack();
        } else {
            navigateBack();
        }
    }

    private void navigateToMainViewCleaningBackStack() {
        this.accountNavigator.navigateToHomeView();
    }

    private void showOrHideFacebookSignUp() {
        if (this.accountManager.isSignUpEnabled(FacebookSignUpAdapter.TYPE)) {
            this.view.showFacebookLogin();
        } else {
            this.view.hideFacebookLogin();
        }
    }

    private void showOrHideGoogleSignUp() {
        if (this.accountManager.isSignUpEnabled(GoogleSignUpAdapter.TYPE)) {
            this.view.showGoogleLogin();
        } else {
            this.view.hideGoogleLogin();
        }
    }

    void lockScreenRotation() {
        this.view.lockScreenRotation();
    }

    void navigateToCreateProfile() {
        this.accountNavigator.navigateToCreateProfileView();
    }

    @Override // cm.aptoide.pt.presenter.Presenter
    public void present() {
        handleOpenOptions();
        handleGoogleSignUpEvent();
        handleGoogleSignUpResult();
        handleFacebookSignUpResult();
        handleFacebookSignUpEvent();
        handleFacebookSignUpWithRequiredPermissionsEvent();
        handleAccountStatusChangeWhileShowingView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void showNotCheckedMessage(boolean z) {
        if (z) {
            return;
        }
        this.view.showTermsConditionError();
    }

    void unlockScreenRotation() {
        this.view.unlockScreenRotation();
    }
}
