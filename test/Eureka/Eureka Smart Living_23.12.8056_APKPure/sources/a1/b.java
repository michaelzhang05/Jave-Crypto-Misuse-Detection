package a1;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class b {
    public static PackageInfo a(PackageManager packageManager, String str) {
        return b(packageManager, str, 0L);
    }

    public static PackageInfo b(PackageManager packageManager, String str, long j6) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        if (Build.VERSION.SDK_INT < 33) {
            return c(packageManager, str, (int) j6);
        }
        of = PackageManager.PackageInfoFlags.of(j6);
        packageInfo = packageManager.getPackageInfo(str, of);
        return packageInfo;
    }

    private static PackageInfo c(PackageManager packageManager, String str, long j6) {
        return packageManager.getPackageInfo(str, (int) j6);
    }
}
