package l2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class g0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f7361a = new h2.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f7361a.post(runnable);
    }
}
