package cm.aptoide.pt.packageinstaller;

import android.os.Bundle;

/* loaded from: classes.dex */
public interface PackageInstallerResultCallback {
    void onInstallationResult(InstallStatus installStatus);

    void onPendingUserAction(Bundle bundle);
}
