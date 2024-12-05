package androidx.work.impl.utils.taskexecutor;

import i6.AbstractC2840p0;
import i6.I;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static void a(TaskExecutor taskExecutor, Runnable runnable) {
        taskExecutor.getSerialTaskExecutor().execute(runnable);
    }

    public static I b(TaskExecutor taskExecutor) {
        return AbstractC2840p0.a(taskExecutor.getSerialTaskExecutor());
    }
}
