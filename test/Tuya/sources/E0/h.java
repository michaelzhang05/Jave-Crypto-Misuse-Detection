package e0;

import android.os.Build;

/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f30222a;

    static {
        int i8;
        if (Build.VERSION.SDK_INT >= 31) {
            i8 = 33554432;
        } else {
            i8 = 0;
        }
        f30222a = i8;
    }
}
