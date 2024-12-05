package q0;

import android.os.Handler;
import android.os.Looper;
import h0.HandlerC2894a;
import java.util.concurrent.Executor;

/* renamed from: q0.H, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class ExecutorC3814H implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f38065a = new HandlerC2894a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f38065a.post(runnable);
    }
}
