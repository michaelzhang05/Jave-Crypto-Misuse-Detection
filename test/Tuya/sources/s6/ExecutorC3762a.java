package s6;

import java.util.concurrent.Executor;

/* renamed from: s6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class ExecutorC3762a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorC3762a f38032a = new ExecutorC3762a();

    private ExecutorC3762a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
