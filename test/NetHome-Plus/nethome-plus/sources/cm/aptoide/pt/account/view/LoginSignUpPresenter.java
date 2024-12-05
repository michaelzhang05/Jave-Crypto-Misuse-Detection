package cm.aptoide.pt.account.view;

import cm.aptoide.pt.logger.Logger;
import cm.aptoide.pt.navigator.FragmentNavigator;
import cm.aptoide.pt.presenter.LoginSignUpView;
import cm.aptoide.pt.presenter.Presenter;
import cm.aptoide.pt.presenter.View;
import cm.aptoide.pt.view.BackButton;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public class LoginSignUpPresenter extends BottomSheetBehavior.e implements Presenter, BackButton.ClickHandler {
    private static final String TAG = "cm.aptoide.pt.account.view.LoginSignUpPresenter";
    private final boolean dismissToNavigateToMainView;
    private boolean hasMagicLinkError;
    private String magicLinkErrorMessage;
    private final boolean navigateToHome;
    private final FragmentNavigator navigatorChild;
    private final LoginSignUpView view;

    public LoginSignUpPresenter(LoginSignUpView loginSignUpView, FragmentNavigator fragmentNavigator, boolean z, boolean z2, boolean z3, String str) {
        this.view = loginSignUpView;
        this.navigatorChild = fragmentNavigator;
        this.dismissToNavigateToMainView = z;
        this.navigateToHome = z2;
        this.hasMagicLinkError = z3;
        this.magicLinkErrorMessage = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void a(View.LifecycleEvent lifecycleEvent) {
        LoginSignUpCredentialsFragment loginSignUpCredentialsFragment;
        try {
            loginSignUpCredentialsFragment = (LoginSignUpCredentialsFragment) this.navigatorChild.getFragment();
        } catch (ClassCastException e2) {
            Logger.getInstance().e(TAG, (Throwable) e2);
            loginSignUpCredentialsFragment = null;
        }
        if (loginSignUpCredentialsFragment == null) {
            this.navigatorChild.navigateToWithoutBackSave(LoginSignUpCredentialsFragment.newInstance(this.dismissToNavigateToMainView, this.navigateToHome, this.hasMagicLinkError, this.magicLinkErrorMessage), true);
        }
    }

    @Override // cm.aptoide.pt.view.BackButton.ClickHandler
    public boolean handle() {
        if (!this.view.bottomSheetIsExpanded()) {
            return false;
        }
        this.view.setBottomSheetState(4);
        return true;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.e
    public void onSlide(android.view.View view, float f2) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.e
    public void onStateChanged(android.view.View view, int i2) {
        if (i2 == 3) {
            this.view.expandBottomSheet();
        } else {
            if (i2 != 4) {
                return;
            }
            this.view.collapseBottomSheet();
        }
    }

    @Override // cm.aptoide.pt.presenter.Presenter
    public void present() {
        this.view.getLifecycleEvent().D(new rx.m.e() { // from class: cm.aptoide.pt.account.view.d1
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).x(new rx.m.b() { // from class: cm.aptoide.pt.account.view.c1
            @Override // rx.m.b
            public final void call(Object obj) {
                LoginSignUpPresenter.this.a((View.LifecycleEvent) obj);
            }
        }).f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).D0();
    }
}
