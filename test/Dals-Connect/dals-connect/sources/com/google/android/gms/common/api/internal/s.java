package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class s implements GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ StatusPendingResult f10658f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(zaaw zaawVar, StatusPendingResult statusPendingResult) {
        this.f10658f = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    public final void i0(ConnectionResult connectionResult) {
        this.f10658f.k(new Status(8));
    }
}
