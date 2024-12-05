package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [TResult] */
/* loaded from: classes2.dex */
public final class c<TResult> implements OnCompleteListener<TResult> {
    private final /* synthetic */ TaskCompletionSource a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zaab f10615b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(zaab zaabVar, TaskCompletionSource taskCompletionSource) {
        this.f10615b = zaabVar;
        this.a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void a(Task<TResult> task) {
        Map map;
        map = this.f10615b.f10670b;
        map.remove(this.a);
    }
}
