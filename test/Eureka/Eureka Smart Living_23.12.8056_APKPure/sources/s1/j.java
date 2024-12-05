package s1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;

/* loaded from: classes.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    private static j f9227b;

    /* renamed from: a, reason: collision with root package name */
    private final Context f9228a;

    public j(Context context) {
        this.f9228a = context.getApplicationContext();
    }

    public static j a(Context context) {
        v1.n.h(context);
        synchronized (j.class) {
            if (f9227b == null) {
                x.a(context);
                f9227b = new j(context);
            }
        }
        return f9227b;
    }

    static final t b(PackageInfo packageInfo, t... tVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        u uVar = new u(packageInfo.signatures[0].toByteArray());
        for (int i6 = 0; i6 < tVarArr.length; i6++) {
            if (tVarArr[i6].equals(uVar)) {
                return tVarArr[i6];
            }
        }
        return null;
    }

    public static final boolean c(PackageInfo packageInfo, boolean z5) {
        if (z5 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z5 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z5 ? b(packageInfo, w.f9239a) : b(packageInfo, w.f9239a[0])) != null) {
                return true;
            }
        }
        return false;
    }
}
