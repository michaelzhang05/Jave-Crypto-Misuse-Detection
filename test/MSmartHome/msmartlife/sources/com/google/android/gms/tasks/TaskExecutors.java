package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class TaskExecutors {
    public static final Executor a = new a();

    /* renamed from: b, reason: collision with root package name */
    static final Executor f16338b = new f();

    /* loaded from: classes2.dex */
    private static final class a implements Executor {

        /* renamed from: f, reason: collision with root package name */
        private final Handler f16339f = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f16339f.post(runnable);
        }
    }

    private TaskExecutors() {
    }
}
