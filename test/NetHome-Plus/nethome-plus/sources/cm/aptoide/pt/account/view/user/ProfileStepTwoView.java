package cm.aptoide.pt.account.view.user;

import cm.aptoide.pt.presenter.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface ProfileStepTwoView extends View {
    rx.e<Boolean> continueButtonClick();

    void dismissWaitDialog();

    rx.e<Boolean> makePrivateProfileButtonClick();

    rx.b showGenericErrorMessage();

    void showWaitDialog();
}