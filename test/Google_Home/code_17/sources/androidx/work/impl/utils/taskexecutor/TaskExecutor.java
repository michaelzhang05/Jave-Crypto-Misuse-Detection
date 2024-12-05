package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import l6.I;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public interface TaskExecutor {
    void executeOnTaskThread(@NonNull Runnable runnable);

    @NonNull
    Executor getMainThreadExecutor();

    @NonNull
    SerialExecutor getSerialTaskExecutor();

    @NonNull
    I getTaskCoroutineDispatcher();
}
