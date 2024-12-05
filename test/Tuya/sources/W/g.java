package W;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public class g implements d {

    /* renamed from: a, reason: collision with root package name */
    private static final g f11951a = new g();

    private g() {
    }

    public static d b() {
        return f11951a;
    }

    @Override // W.d
    public final long a() {
        return System.nanoTime();
    }

    @Override // W.d
    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // W.d
    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
