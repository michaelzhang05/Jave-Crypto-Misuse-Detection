package cm.aptoide.pt.account.view;

import android.net.Uri;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.pt.R;
import cm.aptoide.pt.account.AccountAnalytics;
import cm.aptoide.pt.account.FacebookLoginResult;
import cm.aptoide.pt.account.view.store.ManageStoreFragment;
import cm.aptoide.pt.account.view.store.ManageStoreViewModel;
import cm.aptoide.pt.account.view.user.ManageUserFragment;
import cm.aptoide.pt.account.view.user.ProfileStepTwoFragment;
import cm.aptoide.pt.bottomNavigation.BottomNavigationNavigator;
import cm.aptoide.pt.link.CustomTabsHelper;
import cm.aptoide.pt.navigator.ActivityNavigator;
import cm.aptoide.pt.navigator.FragmentNavigator;
import cm.aptoide.pt.navigator.Result;
import cm.aptoide.pt.themes.ThemeManager;
import cm.aptoide.pt.view.settings.MyAccountFragment;
import com.facebook.FacebookException;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Collection;
import java.util.concurrent.Callable;
import rx.Single;
import rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class AccountNavigator {
    private final AccountAnalytics accountAnalytics;
    private final AptoideAccountManager accountManager;
    private final ActivityNavigator activityNavigator;
    private final BottomNavigationNavigator bottomNavigationNavigator;
    private final com.facebook.d callbackManager;
    private final GoogleApiClient client;
    private final com.facebook.login.g facebookLoginManager;
    private final e.g.b.c<FacebookLoginResult> facebookLoginSubject;
    private final FragmentNavigator fragmentNavigator;
    private final String recoverPasswordUrl;
    private final ThemeManager themeManager;

    public AccountNavigator(BottomNavigationNavigator bottomNavigationNavigator, FragmentNavigator fragmentNavigator, AptoideAccountManager aptoideAccountManager, ActivityNavigator activityNavigator, com.facebook.login.g gVar, com.facebook.d dVar, GoogleApiClient googleApiClient, e.g.b.c<FacebookLoginResult> cVar, String str, AccountAnalytics accountAnalytics, ThemeManager themeManager) {
        this.bottomNavigationNavigator = bottomNavigationNavigator;
        this.fragmentNavigator = fragmentNavigator;
        this.accountManager = aptoideAccountManager;
        this.activityNavigator = activityNavigator;
        this.facebookLoginManager = gVar;
        this.callbackManager = dVar;
        this.client = googleApiClient;
        this.facebookLoginSubject = cVar;
        this.recoverPasswordUrl = str;
        this.accountAnalytics = accountAnalytics;
        this.themeManager = themeManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$facebookSignUpResults$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean a(Result result) {
        return Boolean.valueOf(this.callbackManager.onActivityResult(result.getRequestCode(), result.getResultCode(), result.getData()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ FacebookLoginResult lambda$facebookSignUpResults$4(Result result, FacebookLoginResult facebookLoginResult) {
        return facebookLoginResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$googleSignUpResults$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void b(GoogleSignInResult googleSignInResult) {
        this.client.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$navigateToGoogleSignUpForResult$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ ConnectionResult c(int i2) throws Exception {
        ConnectionResult d2 = this.client.d();
        if (d2.L()) {
            this.activityNavigator.navigateForResult(Auth.f10330j.a(this.client), i2);
        }
        return d2;
    }

    public void clearBackStackUntilLogin() {
        for (int i2 = 0; i2 < this.fragmentNavigator.getBackStackEntryCount(); i2++) {
            String tagByBackStackEntry = this.fragmentNavigator.getTagByBackStackEntry(i2);
            if (this.fragmentNavigator.getFragment(tagByBackStackEntry) instanceof LoginSignUpFragment) {
                this.fragmentNavigator.popBackStackUntil(tagByBackStackEntry);
                return;
            }
        }
    }

    public rx.e<FacebookLoginResult> facebookSignUpResults() {
        return rx.e.e(this.activityNavigator.results().D(new rx.m.e() { // from class: cm.aptoide.pt.account.view.e
            @Override // rx.m.e
            public final Object call(Object obj) {
                return AccountNavigator.this.a((Result) obj);
            }
        }), this.facebookLoginSubject, new rx.m.f() { // from class: cm.aptoide.pt.account.view.a
            @Override // rx.m.f
            public final Object a(Object obj, Object obj2) {
                FacebookLoginResult facebookLoginResult = (FacebookLoginResult) obj2;
                AccountNavigator.lambda$facebookSignUpResults$4((Result) obj, facebookLoginResult);
                return facebookLoginResult;
            }
        });
    }

    public rx.e<GoogleSignInResult> googleSignUpResults(int i2) {
        return this.activityNavigator.results(i2).X(new rx.m.e() { // from class: cm.aptoide.pt.account.view.c
            @Override // rx.m.e
            public final Object call(Object obj) {
                GoogleSignInResult b2;
                b2 = Auth.f10330j.b(((Result) obj).getData());
                return b2;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.account.view.b
            @Override // rx.m.b
            public final void call(Object obj) {
                AccountNavigator.this.b((GoogleSignInResult) obj);
            }
        });
    }

    public void navigateToAccountView(AccountAnalytics.AccountOrigins accountOrigins) {
        if (this.accountManager.isLoggedIn()) {
            this.fragmentNavigator.navigateTo(MyAccountFragment.newInstance(), true);
        } else {
            this.accountAnalytics.enterAccountScreen(accountOrigins);
            this.fragmentNavigator.navigateTo(LoginSignUpFragment.newInstance(false, false, false, false), true);
        }
    }

    public void navigateToCreateProfileView() {
        this.fragmentNavigator.navigateTo(ManageUserFragment.newInstanceToCreate(), true);
    }

    public void navigateToCreateStoreView() {
        this.fragmentNavigator.navigateTo(ManageStoreFragment.newInstance(new ManageStoreViewModel(), true), true);
    }

    public void navigateToFacebookSignUpForResult(Collection<String> collection) {
        this.facebookLoginManager.o(this.callbackManager, new com.facebook.e<com.facebook.login.h>() { // from class: cm.aptoide.pt.account.view.AccountNavigator.1
            @Override // com.facebook.e
            public void onCancel() {
                AccountNavigator.this.facebookLoginSubject.call(new FacebookLoginResult(null, 1, null));
            }

            @Override // com.facebook.e
            public void onError(FacebookException facebookException) {
                AccountNavigator.this.facebookLoginSubject.call(new FacebookLoginResult(null, 99, facebookException));
            }

            @Override // com.facebook.e
            public void onSuccess(com.facebook.login.h hVar) {
                AccountNavigator.this.facebookLoginSubject.call(new FacebookLoginResult(hVar, 0, null));
            }
        });
        this.facebookLoginManager.j(this.activityNavigator.getActivity(), collection);
    }

    public Single<ConnectionResult> navigateToGoogleSignUpForResult(final int i2) {
        return Single.l(new Callable() { // from class: cm.aptoide.pt.account.view.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AccountNavigator.this.c(i2);
            }
        }).v(Schedulers.io());
    }

    public void navigateToHomeView() {
        this.bottomNavigationNavigator.navigateToHome();
    }

    public void navigateToLoginError() {
        this.fragmentNavigator.navigateTo(LoginSignUpFragment.newInstance(false, false, false, false, true, this.activityNavigator.getActivity().getString(R.string.login_error_magic_link_expired)), true);
    }

    public void navigateToPrivacyPolicy() {
        CustomTabsHelper.getInstance().openInChromeCustomTab(this.activityNavigator.getActivity().getString(R.string.all_url_privacy_policy), this.activityNavigator.getActivity(), this.themeManager.getAttributeForTheme(R.attr.colorPrimary).resourceId);
    }

    public void navigateToProfileStepTwoView() {
        this.fragmentNavigator.navigateTo(ProfileStepTwoFragment.newInstance(), true);
    }

    public void navigateToRecoverPasswordView() {
        this.activityNavigator.navigateTo(Uri.parse(this.recoverPasswordUrl));
    }

    public void navigateToTermsAndConditions() {
        CustomTabsHelper.getInstance().openInChromeCustomTab(this.activityNavigator.getActivity().getString(R.string.all_url_terms_conditions), this.activityNavigator.getActivity(), this.themeManager.getAttributeForTheme(R.attr.colorPrimary).resourceId);
    }

    public void popView() {
        this.fragmentNavigator.popBackStack();
    }

    public void popViewWithResult(int i2, boolean z) {
        this.fragmentNavigator.popWithResult(new Result(i2, z ? -1 : 0, null));
    }
}
