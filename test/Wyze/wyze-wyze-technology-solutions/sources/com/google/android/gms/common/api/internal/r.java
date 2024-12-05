package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class r implements GoogleApiClient.ConnectionCallbacks {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f10649f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ StatusPendingResult f10650g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zaaw f10651h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(zaaw zaawVar, AtomicReference atomicReference, StatusPendingResult statusPendingResult) {
        this.f10651h = zaawVar;
        this.f10649f = atomicReference;
        this.f10650g = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void C(Bundle bundle) {
        this.f10651h.z((GoogleApiClient) this.f10649f.get(), this.f10650g, true);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void u(int i2) {
    }
}
