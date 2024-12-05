package w3;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class m {
    public static m a(long j6, long j7, long j8) {
        return new a(j6, j7, j8);
    }

    public static m e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
