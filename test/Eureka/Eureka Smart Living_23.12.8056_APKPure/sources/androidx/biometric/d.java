package androidx.biometric;

import android.os.Build;
import androidx.biometric.BiometricPrompt;

/* loaded from: classes.dex */
abstract class d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(int i6) {
        return i6 != 15 ? i6 != 255 ? i6 != 32768 ? i6 != 32783 ? i6 != 33023 ? String.valueOf(i6) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL" : "BIOMETRIC_STRONG | DEVICE_CREDENTIAL" : "DEVICE_CREDENTIAL" : "BIOMETRIC_WEAK" : "BIOMETRIC_STRONG";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(BiometricPrompt.d dVar, BiometricPrompt.c cVar) {
        if (dVar.a() != 0) {
            return dVar.a();
        }
        int i6 = cVar != null ? 15 : 255;
        return dVar.g() ? 32768 | i6 : i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(int i6) {
        return (i6 & 32768) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(int i6) {
        return (i6 & 32767) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(int i6) {
        if (i6 == 15 || i6 == 255) {
            return true;
        }
        if (i6 == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i6 != 32783) {
            return i6 == 33023 || i6 == 0;
        }
        int i7 = Build.VERSION.SDK_INT;
        return i7 < 28 || i7 > 29;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(int i6) {
        return (i6 & 255) == 255;
    }
}
