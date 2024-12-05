package v6;

import java.util.concurrent.Executor;

/* renamed from: v6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class ExecutorC4115a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorC4115a f40305a = new ExecutorC4115a();

    private ExecutorC4115a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
