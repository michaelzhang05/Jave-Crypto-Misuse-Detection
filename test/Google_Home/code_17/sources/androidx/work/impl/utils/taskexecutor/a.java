package androidx.work.impl.utils.taskexecutor;

import l6.AbstractC3375p0;
import l6.I;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static void a(TaskExecutor taskExecutor, Runnable runnable) {
        taskExecutor.getSerialTaskExecutor().execute(runnable);
    }

    public static I b(TaskExecutor taskExecutor) {
        return AbstractC3375p0.a(taskExecutor.getSerialTaskExecutor());
    }
}
