package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class zaab {
    private final Map<BasePendingResult<?>, Boolean> a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Map<TaskCompletionSource<?>, Boolean> f10670b = Collections.synchronizedMap(new WeakHashMap());

    private final void d(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.a) {
            hashMap = new HashMap(this.a);
        }
        synchronized (this.f10670b) {
            hashMap2 = new HashMap(this.f10670b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).p(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).d(new ApiException(status));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(BasePendingResult<? extends Result> basePendingResult, boolean z) {
        this.a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.b(new b(this, basePendingResult));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <TResult> void c(TaskCompletionSource<TResult> taskCompletionSource, boolean z) {
        this.f10670b.put(taskCompletionSource, Boolean.valueOf(z));
        taskCompletionSource.a().a(new c(this, taskCompletionSource));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return (this.a.isEmpty() && this.f10670b.isEmpty()) ? false : true;
    }

    public final void f() {
        d(false, GoogleApiManager.f10580f);
    }

    public final void g() {
        d(true, zacp.a);
    }
}
