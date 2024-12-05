package e0;

import android.os.Build;

/* renamed from: e0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2573e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }
}
