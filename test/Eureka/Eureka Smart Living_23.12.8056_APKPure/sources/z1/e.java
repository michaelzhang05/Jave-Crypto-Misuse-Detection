package z1;

import android.os.SystemClock;

/* loaded from: classes.dex */
public class e implements d {

    /* renamed from: a, reason: collision with root package name */
    private static final e f9927a = new e();

    private e() {
    }

    public static d b() {
        return f9927a;
    }

    @Override // z1.d
    public final long a() {
        return SystemClock.elapsedRealtime();
    }
}
