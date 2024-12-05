package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zze;
import java.util.concurrent.Executor;

@KeepForSdk
/* loaded from: classes2.dex */
public class HandlerExecutor implements Executor {

    /* renamed from: f, reason: collision with root package name */
    private final Handler f11005f;

    @KeepForSdk
    public HandlerExecutor(Looper looper) {
        this.f11005f = new zze(looper);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f11005f.post(runnable);
    }
}
