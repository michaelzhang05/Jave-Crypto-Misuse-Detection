package z1;

import android.os.Looper;

/* loaded from: classes.dex */
public abstract class n {
    public static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
