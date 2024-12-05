package r0;

import android.os.Handler;
import android.os.Looper;
import i0.HandlerC2766a;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class H implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f37513a = new HandlerC2766a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f37513a.post(runnable);
    }
}
