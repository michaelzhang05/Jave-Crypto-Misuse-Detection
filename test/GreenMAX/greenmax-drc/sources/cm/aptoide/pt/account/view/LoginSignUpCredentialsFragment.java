package cm.aptoide.pt.account.view;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.aptoideviews.login.SendMagicLinkView;
import cm.aptoide.pt.R;
import cm.aptoide.pt.account.AccountAnalytics;
import cm.aptoide.pt.account.view.magiclink.MagicLinkView;
import cm.aptoide.pt.account.view.magiclink.SendMagicLinkPresenter;
import cm.aptoide.pt.orientation.ScreenOrientationManager;
import cm.aptoide.pt.presenter.CompositePresenter;
import cm.aptoide.pt.presenter.LoginSignUpCredentialsView;
import cm.aptoide.pt.presenter.LoginSignupCredentialsFlavorPresenter;
import cm.aptoide.pt.themes.ThemeManager;
import cm.aptoide.pt.utils.GenericDialogs;
import cm.aptoide.pt.view.NotBottomNavigationView;
import cm.aptoide.pt.view.rx.RxAlertDialog;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.snackbar.Snackbar;
import java.util.Arrays;
import javax.inject.Inject;
import javax.inject.Named;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class LoginSignUpCredentialsFragment extends GooglePlayServicesFragment implements LoginSignUpCredentialsView, MagicLinkView, NotBottomNavigationView {
    public static final String CLEAN_BACK_STACK = "clean_back_stack";
    public static final String DISMISS_TO_NAVIGATE_TO_MAIN_VIEW = "dismiss_to_navigate_to_main_view";
    public static final String HAS_MAGIC_LINK_ERROR = "has_magic_link_error";
    public static final String MAGIC_LINK_ERROR_MESSAGE = "magic_link_error_message";
    private static final String USERNAME_KEY = "username_key";

    @Inject
    AccountAnalytics accountAnalytics;
    private BottomSheetBehavior<View> bottomSheetBehavior;
    private Drawable checkboxDrawable;
    private Button connectWithEmailButton;
    private RxAlertDialog facebookEmailRequiredDialog;
    private View facebookLoginButton;
    private Button googleLoginButton;
    private View loginSignupSelectionArea;

    @Inject
    @Named
    String marketName;

    @Inject
    ScreenOrientationManager orientationManager;

    @Inject
    LoginSignupCredentialsFlavorPresenter presenter;
    private rx.s.b<Void> privacyPolicySubject;
    private ProgressDialog progressDialog;
    private View rootView;

    @Inject
    SendMagicLinkPresenter sendMagicLinkPresenter;
    private SendMagicLinkView sendMagicLinkView;
    private View socialLoginArea;
    private TextView termsAndConditions;
    private rx.s.b<Void> termsAndConditionsSubject;
    private CheckBox termsConditionsCheckBox;

    @Inject
    ThemeManager themeManager;

    /* JADX INFO: Access modifiers changed from: private */
    public void changeBottomSheetHeight(int i2) {
        BottomSheetBehavior<View> bottomSheetBehavior = this.bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.l0(5);
            this.bottomSheetBehavior.h0((int) (i2 * getResources().getDisplayMetrics().density));
            this.bottomSheetBehavior.l0(4);
        }
    }

    private AccountAnalytics.StartupClickOrigin getStartupClickOrigin() {
        return AccountAnalytics.StartupClickOrigin.MAIN;
    }

    private void hideSocialLoginArea() {
        this.socialLoginArea.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$facebookSignUpEvent$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean e(Void r1) {
        return Boolean.valueOf(this.termsConditionsCheckBox.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$facebookSignUpEvent$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void f(Boolean bool) {
        this.accountAnalytics.clickIn(AccountAnalytics.StartupClick.CONNECT_FACEBOOK, getStartupClickOrigin());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Void lambda$facebookSignUpWithRequiredPermissionsInEvent$3(DialogInterface dialogInterface) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$googleSignUpEvent$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean g(Void r1) {
        return Boolean.valueOf(this.termsConditionsCheckBox.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$googleSignUpEvent$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void h(Boolean bool) {
        this.accountAnalytics.clickIn(AccountAnalytics.StartupClick.CONNECT_GOOGLE, getStartupClickOrigin());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showAptoideLoginAreaClick$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean i(Void r1) {
        return Boolean.valueOf(this.termsConditionsCheckBox.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showTermsConditionError$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void j(CompoundButton compoundButton, boolean z) {
        this.termsConditionsCheckBox.setButtonDrawable(this.checkboxDrawable);
    }

    public static LoginSignUpCredentialsFragment newInstance(boolean z, boolean z2) {
        return newInstance(z, z2, false, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    private void setAptoideLoginAreaVisible() {
        this.sendMagicLinkView.setVisibility(0);
        this.termsAndConditions.setVisibility(8);
        this.termsConditionsCheckBox.setVisibility(8);
        this.loginSignupSelectionArea.setVisibility(8);
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public void dismiss() {
        getActivity().finish();
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public rx.e<Boolean> facebookSignUpEvent() {
        return e.g.a.c.a.a(this.facebookLoginButton).X(new rx.m.e() { // from class: cm.aptoide.pt.account.view.y0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return LoginSignUpCredentialsFragment.this.e((Void) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.account.view.w0
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsFragment.this.f((Boolean) obj);
            }
        });
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public rx.e<Void> facebookSignUpWithRequiredPermissionsInEvent() {
        return this.facebookEmailRequiredDialog.positiveClicks().X(new rx.m.e() { // from class: cm.aptoide.pt.account.view.a1
            @Override // rx.m.e
            public final Object call(Object obj) {
                LoginSignUpCredentialsFragment.lambda$facebookSignUpWithRequiredPermissionsInEvent$3((DialogInterface) obj);
                return null;
            }
        });
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public Context getApplicationContext() {
        return getActivity().getApplicationContext();
    }

    @Override // cm.aptoide.pt.account.view.magiclink.MagicLinkView
    public rx.e<String> getEmailTextChangeEvent() {
        return this.sendMagicLinkView.getEmailChangeEvent();
    }

    @Override // cm.aptoide.pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.pt.account.view.magiclink.MagicLinkView
    public rx.e<String> getMagicLinkClick() {
        return this.sendMagicLinkView.getMagicLinkSubmit();
    }

    @Override // cm.aptoide.pt.account.view.magiclink.MagicLinkView
    public rx.e<Void> getSecureLoginTextClick() {
        return this.sendMagicLinkView.getSecureLoginTextClick();
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public rx.e<Boolean> googleSignUpEvent() {
        return e.g.a.c.a.a(this.googleLoginButton).X(new rx.m.e() { // from class: cm.aptoide.pt.account.view.v0
            @Override // rx.m.e
            public final Object call(Object obj) {
                return LoginSignUpCredentialsFragment.this.g((Void) obj);
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.account.view.x0
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpCredentialsFragment.this.h((Boolean) obj);
            }
        });
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public void hideFacebookLogin() {
        this.facebookLoginButton.setVisibility(8);
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public void hideGoogleLogin() {
        this.googleLoginButton.setVisibility(8);
    }

    @Override // cm.aptoide.pt.view.fragment.FragmentView, cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public void hideKeyboard() {
        super.hideKeyboard();
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public void hideLoading() {
        this.progressDialog.dismiss();
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public void lockScreenRotation() {
        this.orientationManager.lock();
    }

    @Override // cm.aptoide.pt.view.fragment.NavigationTrackFragment, cm.aptoide.pt.view.fragment.FragmentView, com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        getActivity().getWindow().setSoftInputMode(16);
        this.privacyPolicySubject = rx.s.b.g1();
        this.termsAndConditionsSubject = rx.s.b.g1();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(R.layout.fragment_login_sign_up_credentials, viewGroup, false);
    }

    @Override // cm.aptoide.pt.view.fragment.FragmentView, cm.aptoide.pt.view.BaseFragment, com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.privacyPolicySubject = null;
        this.termsAndConditionsSubject = null;
        super.onDestroy();
    }

    @Override // cm.aptoide.pt.account.view.GooglePlayServicesFragment, com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getActivity().getWindow().setSoftInputMode(32);
        unregisterClickHandler(this.presenter);
        unlockScreenRotation();
        this.termsAndConditions = null;
        this.sendMagicLinkView = null;
        this.termsConditionsCheckBox = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // cm.aptoide.pt.account.view.GooglePlayServicesFragment, cm.aptoide.pt.view.fragment.NavigationTrackFragment, cm.aptoide.pt.view.BaseFragment, com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.rootView = getActivity().findViewById(android.R.id.content);
        this.googleLoginButton = (Button) view.findViewById(R.id.google_login_button);
        this.facebookLoginButton = view.findViewById(R.id.fb_login_button);
        this.loginSignupSelectionArea = view.findViewById(R.id.login_signup_selection_layout);
        this.sendMagicLinkView = (SendMagicLinkView) view.findViewById(R.id.send_magic_link_view);
        this.socialLoginArea = view.findViewById(R.id.social_login_area);
        this.connectWithEmailButton = (Button) view.findViewById(R.id.show_login_with_aptoide_area);
        this.facebookEmailRequiredDialog = new RxAlertDialog.Builder(getContext(), this.themeManager).setMessage(R.string.facebook_email_permission_regected_message).setPositiveButton(R.string.facebook_grant_permission_button).setNegativeButton(android.R.string.cancel).build();
        this.termsConditionsCheckBox = (CheckBox) view.findViewById(R.id.tc_checkbox);
        this.termsAndConditions = (TextView) view.findViewById(R.id.terms_and_conditions);
        this.progressDialog = GenericDialogs.createGenericPleaseWaitDialog(getContext(), this.themeManager.getAttributeForTheme(R.attr.dialogsTheme).resourceId);
        try {
            this.bottomSheetBehavior = BottomSheetBehavior.T(view.getRootView().findViewById(R.id.login_signup_layout));
        } catch (IllegalArgumentException unused) {
        }
        attachPresenter(new CompositePresenter(Arrays.asList(this.presenter, this.sendMagicLinkPresenter)));
        registerClickHandler(this.presenter);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public rx.e<Void> privacyPolicyClickEvent() {
        return this.privacyPolicySubject;
    }

    @Override // cm.aptoide.pt.account.view.magiclink.MagicLinkView
    public void removeLoadingScreen() {
        hideKeyboard();
        hideLoading();
    }

    @Override // cm.aptoide.pt.account.view.magiclink.MagicLinkView
    public void removeTextFieldError() {
        this.sendMagicLinkView.resetTextFieldError();
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public void setCobrandText() {
    }

    @Override // cm.aptoide.pt.account.view.magiclink.MagicLinkView
    public void setEmailInvalidError() {
        this.sendMagicLinkView.setState(new SendMagicLinkView.State.Error(getString(R.string.login_error_invalid_email), true));
    }

    @Override // cm.aptoide.pt.account.view.magiclink.MagicLinkView
    public void setInitialState() {
        this.sendMagicLinkView.setState(SendMagicLinkView.State.Initial.INSTANCE);
    }

    @Override // cm.aptoide.pt.account.view.magiclink.MagicLinkView
    public void setLoadingScreen() {
        showLoading();
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public void showAptoideLoginArea() {
        setAptoideLoginAreaVisible();
        hideSocialLoginArea();
        this.termsConditionsCheckBox.setVisibility(8);
        this.termsAndConditions.setVisibility(8);
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public rx.e<Boolean> showAptoideLoginAreaClick() {
        return e.g.a.c.a.a(this.connectWithEmailButton).X(new rx.m.e() { // from class: cm.aptoide.pt.account.view.b1
            @Override // rx.m.e
            public final Object call(Object obj) {
                return LoginSignUpCredentialsFragment.this.i((Void) obj);
            }
        });
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public void showError(String str) {
        Snackbar.a0(this.rootView, str, 0).P();
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public void showFacebookLogin() {
        this.facebookLoginButton.setVisibility(0);
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public void showFacebookPermissionsRequiredError(Throwable th) {
        if (this.facebookEmailRequiredDialog.isShowing()) {
            return;
        }
        this.facebookEmailRequiredDialog.show();
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public void showGoogleLogin() {
        this.googleLoginButton.setVisibility(0);
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public void showLoading() {
        this.progressDialog.show();
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public void showMagicLinkError(String str) {
        this.sendMagicLinkView.setState(new SendMagicLinkView.State.Error(str, false));
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public void showTCandPP() {
        this.checkboxDrawable = androidx.core.widget.e.a(this.termsConditionsCheckBox);
        this.termsConditionsCheckBox.setVisibility(0);
        ClickableSpan clickableSpan = new ClickableSpan() { // from class: cm.aptoide.pt.account.view.LoginSignUpCredentialsFragment.2
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                if (LoginSignUpCredentialsFragment.this.termsAndConditionsSubject != null) {
                    LoginSignUpCredentialsFragment.this.termsAndConditionsSubject.onNext(null);
                }
            }
        };
        ClickableSpan clickableSpan2 = new ClickableSpan() { // from class: cm.aptoide.pt.account.view.LoginSignUpCredentialsFragment.3
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                if (LoginSignUpCredentialsFragment.this.privacyPolicySubject != null) {
                    LoginSignUpCredentialsFragment.this.privacyPolicySubject.onNext(null);
                }
            }
        };
        String string = getString(R.string.terms_and_conditions_privacy_sign_up_message);
        String string2 = getString(R.string.settings_terms_conditions);
        String string3 = getString(R.string.settings_privacy_policy);
        String format = String.format(string, string2, string3);
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(clickableSpan, format.indexOf(string2), format.indexOf(string2) + string2.length(), 33);
        spannableString.setSpan(clickableSpan2, format.indexOf(string3), format.indexOf(string3) + string3.length(), 33);
        this.termsAndConditions.setText(spannableString);
        this.termsAndConditions.setMovementMethod(LinkMovementMethod.getInstance());
        this.termsAndConditions.setVisibility(0);
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public void showTermsConditionError() {
        Snackbar a0 = Snackbar.a0(this.rootView, getString(R.string.signup_message_no_tandc_error), -1);
        if (getResources().getConfiguration().orientation == 1) {
            a0.p(new Snackbar.b() { // from class: cm.aptoide.pt.account.view.LoginSignUpCredentialsFragment.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.android.material.snackbar.Snackbar.b, com.google.android.material.snackbar.BaseTransientBottomBar.r
                public void onDismissed(Snackbar snackbar, int i2) {
                    LoginSignUpCredentialsFragment.this.changeBottomSheetHeight(298);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.android.material.snackbar.Snackbar.b, com.google.android.material.snackbar.BaseTransientBottomBar.r
                public void onShown(Snackbar snackbar) {
                    LoginSignUpCredentialsFragment.this.changeBottomSheetHeight(330);
                }
            });
        }
        a0.P();
        Drawable.ConstantState constantState = this.checkboxDrawable.getConstantState();
        if (constantState != null) {
            Drawable mutate = constantState.newDrawable().mutate();
            mutate.setColorFilter(getResources().getColor(R.color.red), PorterDuff.Mode.SRC_ATOP);
            this.termsConditionsCheckBox.setButtonDrawable(mutate);
        }
        this.termsConditionsCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cm.aptoide.pt.account.view.z0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                LoginSignUpCredentialsFragment.this.j(compoundButton, z);
            }
        });
    }

    @Override // cm.aptoide.pt.account.view.magiclink.MagicLinkView
    public void showUnknownError() {
        showMagicLinkError(getString(R.string.all_message_general_error));
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public rx.e<Void> termsAndConditionsClickEvent() {
        return this.termsAndConditionsSubject;
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public boolean tryCloseLoginBottomSheet(boolean z) {
        if (this.sendMagicLinkView.getVisibility() != 0) {
            return false;
        }
        this.sendMagicLinkView.setVisibility(8);
        this.loginSignupSelectionArea.setVisibility(0);
        this.socialLoginArea.setVisibility(0);
        if (!z) {
            return true;
        }
        this.termsConditionsCheckBox.setVisibility(0);
        this.termsAndConditions.setVisibility(0);
        return true;
    }

    @Override // cm.aptoide.pt.presenter.LoginSignUpCredentialsView
    public void unlockScreenRotation() {
        this.orientationManager.unlock();
    }

    public static LoginSignUpCredentialsFragment newInstance(boolean z, boolean z2, boolean z3, String str) {
        LoginSignUpCredentialsFragment loginSignUpCredentialsFragment = new LoginSignUpCredentialsFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(DISMISS_TO_NAVIGATE_TO_MAIN_VIEW, z);
        bundle.putBoolean(CLEAN_BACK_STACK, z2);
        bundle.putBoolean("has_magic_link_error", z3);
        bundle.putString("magic_link_error_message", str);
        loginSignUpCredentialsFragment.setArguments(bundle);
        return loginSignUpCredentialsFragment;
    }
}
