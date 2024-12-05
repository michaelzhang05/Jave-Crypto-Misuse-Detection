package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class GoogleSignatureVerifier {
    private static GoogleSignatureVerifier a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f10511b;

    private GoogleSignatureVerifier(Context context) {
        this.f10511b = context.getApplicationContext();
    }

    @KeepForSdk
    public static GoogleSignatureVerifier a(Context context) {
        Preconditions.j(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (a == null) {
                a.a(context);
                a = new GoogleSignatureVerifier(context);
            }
        }
        return a;
    }

    private static b c(PackageInfo packageInfo, b... bVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        c cVar = new c(packageInfo.signatures[0].toByteArray());
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            if (bVarArr[i2].equals(cVar)) {
                return bVarArr[i2];
            }
        }
        return null;
    }

    public static boolean d(PackageInfo packageInfo, boolean z) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? c(packageInfo, e.a) : c(packageInfo, e.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (d(packageInfo, false)) {
            return true;
        }
        if (d(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.f10511b)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }
}
