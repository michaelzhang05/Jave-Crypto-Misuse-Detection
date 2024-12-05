package androidx.biometric;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
abstract class o0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Context context, int i6) {
        int i7;
        if (context == null) {
            return "";
        }
        if (i6 != 1) {
            if (i6 != 7) {
                switch (i6) {
                    case 9:
                        break;
                    case 10:
                        i7 = z0.f1412h;
                        break;
                    case 11:
                        i7 = z0.f1411g;
                        break;
                    case 12:
                        i7 = z0.f1409e;
                        break;
                    default:
                        Log.e("BiometricUtils", "Unknown error code: " + i6);
                        i7 = z0.f1406b;
                        break;
                }
            }
            i7 = z0.f1410f;
        } else {
            i7 = z0.f1408d;
        }
        return context.getString(i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(int i6) {
        switch (i6) {
            case 1:
            case 2:
            case 3:
            case 4:
            case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 6:
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(int i6) {
        return i6 == 7 || i6 == 9;
    }
}
