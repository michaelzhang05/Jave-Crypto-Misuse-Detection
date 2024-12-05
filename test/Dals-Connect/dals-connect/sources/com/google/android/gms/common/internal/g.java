package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class g implements PendingResult.StatusListener {
    private final /* synthetic */ PendingResult a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f10896b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ PendingResultUtil.ResultConverter f10897c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ PendingResultUtil.zaa f10898d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(PendingResult pendingResult, TaskCompletionSource taskCompletionSource, PendingResultUtil.ResultConverter resultConverter, PendingResultUtil.zaa zaaVar) {
        this.a = pendingResult;
        this.f10896b = taskCompletionSource;
        this.f10897c = resultConverter;
        this.f10898d = zaaVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void a(Status status) {
        if (status.J()) {
            this.f10896b.c(this.f10897c.a(this.a.c(0L, TimeUnit.MILLISECONDS)));
        } else {
            this.f10896b.b(this.f10898d.a(status));
        }
    }
}
