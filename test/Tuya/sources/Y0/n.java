package y0;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public abstract class n {
    public static n a(long j8, long j9, long j10) {
        return new C3967a(j8, j9, j10);
    }

    public static n e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
