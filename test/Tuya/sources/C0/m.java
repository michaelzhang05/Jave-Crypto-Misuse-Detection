package C0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public enum m implements Executor {
    INSTANCE;


    /* renamed from: b, reason: collision with root package name */
    private static final Handler f1172b = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f1172b.post(runnable);
    }
}
