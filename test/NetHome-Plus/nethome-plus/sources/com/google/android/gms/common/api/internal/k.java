package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes2.dex */
final class k extends w {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks f10634b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, zabd zabdVar, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabdVar);
        this.f10634b = connectionProgressReportCallbacks;
    }

    @Override // com.google.android.gms.common.api.internal.w
    public final void a() {
        this.f10634b.a(new ConnectionResult(16, null));
    }
}
