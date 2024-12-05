package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class f {

    /* loaded from: classes.dex */
    private static class a {
        static Signature[] a(SigningInfo signingInfo) {
            Signature[] apkContentsSigners;
            apkContentsSigners = signingInfo.getApkContentsSigners();
            return apkContentsSigners;
        }

        static long b(PackageInfo packageInfo) {
            long longVersionCode;
            longVersionCode = packageInfo.getLongVersionCode();
            return longVersionCode;
        }

        static Signature[] c(SigningInfo signingInfo) {
            Signature[] signingCertificateHistory;
            signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            return signingCertificateHistory;
        }

        static boolean d(SigningInfo signingInfo) {
            boolean hasMultipleSigners;
            hasMultipleSigners = signingInfo.hasMultipleSigners();
            return hasMultipleSigners;
        }

        static boolean e(PackageManager packageManager, String str, byte[] bArr, int i6) {
            boolean hasSigningCertificate;
            hasSigningCertificate = packageManager.hasSigningCertificate(str, bArr, i6);
            return hasSigningCertificate;
        }
    }

    public static long a(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? a.b(packageInfo) : packageInfo.versionCode;
    }
}
