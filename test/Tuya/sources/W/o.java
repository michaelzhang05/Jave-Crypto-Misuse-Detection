package W;

import O.C1269m;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes3.dex */
public abstract class o {
    public static boolean a(Context context, int i8) {
        if (b(context, i8, "com.google.android.gms")) {
            try {
                return C1269m.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                    return false;
                }
                return false;
            }
        }
        return false;
    }

    public static boolean b(Context context, int i8, String str) {
        return Y.e.a(context).g(i8, str);
    }
}
