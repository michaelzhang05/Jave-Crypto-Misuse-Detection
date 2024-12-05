package cm.aptoide.pt.download.view;

import android.view.View;
import androidx.fragment.app.Fragment;
import cm.aptoide.pt.R;
import cm.aptoide.pt.themes.ThemeManager;
import cm.aptoide.pt.utils.GenericDialogs;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: DownloadDialogProvider.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\fJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0019"}, d2 = {"Lcm/aptoide/pt/download/view/DownloadDialogProvider;", HttpUrl.FRAGMENT_ENCODE_SET, "fragment", "Landroidx/fragment/app/Fragment;", "themeManager", "Lcm/aptoide/pt/themes/ThemeManager;", "(Landroidx/fragment/app/Fragment;Lcm/aptoide/pt/themes/ThemeManager;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getThemeManager", "()Lcm/aptoide/pt/themes/ThemeManager;", "showDialog", "Lrx/Observable;", "Lcm/aptoide/pt/utils/GenericDialogs$EResponse;", "title", HttpUrl.FRAGMENT_ENCODE_SET, "message", "showDowngradeDialog", HttpUrl.FRAGMENT_ENCODE_SET, "showDowngradingSnackBar", HttpUrl.FRAGMENT_ENCODE_SET, "showGenericError", "Lrx/Completable;", "showOutOfSpaceError", "showRootInstallWarningPopup", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DownloadDialogProvider {
    private final Fragment fragment;
    private final ThemeManager themeManager;

    public DownloadDialogProvider(Fragment fragment, ThemeManager themeManager) {
        kotlin.jvm.internal.l.f(fragment, "fragment");
        kotlin.jvm.internal.l.f(themeManager, "themeManager");
        this.fragment = fragment;
        this.themeManager = themeManager;
    }

    private final rx.e<GenericDialogs.EResponse> showDialog(String str, String str2) {
        rx.e<GenericDialogs.EResponse> I0 = GenericDialogs.createGenericOkMessage(this.fragment.getContext(), str, str2, this.themeManager.getAttributeForTheme(R.attr.dialogsTheme).resourceId).I0(rx.l.c.a.b());
        kotlin.jvm.internal.l.e(I0, "createGenericOkMessage(f…dSchedulers.mainThread())");
        return I0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showDowngradeDialog$lambda-1, reason: not valid java name */
    public static final Boolean m75showDowngradeDialog$lambda1(GenericDialogs.EResponse eResponse) {
        return Boolean.valueOf(eResponse == GenericDialogs.EResponse.YES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showRootInstallWarningPopup$lambda-0, reason: not valid java name */
    public static final Boolean m76showRootInstallWarningPopup$lambda0(GenericDialogs.EResponse eResponse) {
        return Boolean.valueOf(eResponse == GenericDialogs.EResponse.YES);
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    public final ThemeManager getThemeManager() {
        return this.themeManager;
    }

    public final rx.e<Boolean> showDowngradeDialog() {
        rx.e X = GenericDialogs.createGenericContinueCancelMessage(this.fragment.requireContext(), null, this.fragment.getResources().getString(R.string.downgrade_warning_dialog), this.themeManager.getAttributeForTheme(R.attr.dialogsTheme).resourceId).X(new rx.m.e() { // from class: cm.aptoide.pt.download.view.a
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean m75showDowngradeDialog$lambda1;
                m75showDowngradeDialog$lambda1 = DownloadDialogProvider.m75showDowngradeDialog$lambda1((GenericDialogs.EResponse) obj);
                return m75showDowngradeDialog$lambda1;
            }
        });
        kotlin.jvm.internal.l.e(X, "createGenericContinueCan…icDialogs.EResponse.YES }");
        return X;
    }

    public final void showDowngradingSnackBar() {
        View view = this.fragment.getView();
        if (view != null) {
            Snackbar.Z(view, R.string.downgrading_msg, -1).P();
        }
    }

    public final rx.b showGenericError() {
        String string = this.fragment.getString(R.string.error_occured);
        kotlin.jvm.internal.l.e(string, "fragment.getString(R.string.error_occured)");
        rx.b X0 = showDialog(HttpUrl.FRAGMENT_ENCODE_SET, string).X0();
        kotlin.jvm.internal.l.e(X0, "showDialog(\"\",\n        f…occured)).toCompletable()");
        return X0;
    }

    public final rx.b showOutOfSpaceError() {
        String string = this.fragment.getString(R.string.out_of_space_dialog_title);
        kotlin.jvm.internal.l.e(string, "fragment.getString(R.str…ut_of_space_dialog_title)");
        String string2 = this.fragment.getString(R.string.out_of_space_dialog_message);
        kotlin.jvm.internal.l.e(string2, "fragment.getString(R.str…_of_space_dialog_message)");
        rx.b X0 = showDialog(string, string2).X0();
        kotlin.jvm.internal.l.e(X0, "showDialog(fragment.getS…message)).toCompletable()");
        return X0;
    }

    public final rx.e<Boolean> showRootInstallWarningPopup() {
        rx.e X = GenericDialogs.createGenericYesNoCancelMessage(this.fragment.requireContext(), null, this.fragment.getResources().getString(R.string.root_access_dialog), this.themeManager.getAttributeForTheme(R.attr.dialogsTheme).resourceId).X(new rx.m.e() { // from class: cm.aptoide.pt.download.view.b
            @Override // rx.m.e
            public final Object call(Object obj) {
                Boolean m76showRootInstallWarningPopup$lambda0;
                m76showRootInstallWarningPopup$lambda0 = DownloadDialogProvider.m76showRootInstallWarningPopup$lambda0((GenericDialogs.EResponse) obj);
                return m76showRootInstallWarningPopup$lambda0;
            }
        });
        kotlin.jvm.internal.l.e(X, "createGenericYesNoCancel…icDialogs.EResponse.YES }");
        return X;
    }
}
