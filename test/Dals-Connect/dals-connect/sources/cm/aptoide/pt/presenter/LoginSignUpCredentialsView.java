package cm.aptoide.pt.presenter;

import android.content.Context;
import cm.aptoide.pt.account.view.GooglePlayServicesView;

/* loaded from: classes.dex */
public interface LoginSignUpCredentialsView extends GooglePlayServicesView {
    void dismiss();

    rx.e<Boolean> facebookSignUpEvent();

    rx.e<Void> facebookSignUpWithRequiredPermissionsInEvent();

    Context getApplicationContext();

    rx.e<Boolean> googleSignUpEvent();

    void hideFacebookLogin();

    void hideGoogleLogin();

    void hideKeyboard();

    void hideLoading();

    void lockScreenRotation();

    rx.e<Void> privacyPolicyClickEvent();

    void setCobrandText();

    void showAptoideLoginArea();

    rx.e<Boolean> showAptoideLoginAreaClick();

    void showError(String str);

    void showFacebookLogin();

    void showFacebookPermissionsRequiredError(Throwable th);

    void showGoogleLogin();

    void showLoading();

    void showMagicLinkError(String str);

    void showTCandPP();

    void showTermsConditionError();

    rx.e<Void> termsAndConditionsClickEvent();

    boolean tryCloseLoginBottomSheet(boolean z);

    void unlockScreenRotation();
}
