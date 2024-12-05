package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes2.dex */
public final class zaq implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: f, reason: collision with root package name */
    public final Api<?> f10745f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f10746g;

    /* renamed from: h, reason: collision with root package name */
    private zar f10747h;

    public zaq(Api<?> api, boolean z) {
        this.f10745f = api;
        this.f10746g = z;
    }

    private final void b() {
        Preconditions.k(this.f10747h, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void C(Bundle bundle) {
        b();
        this.f10747h.C(bundle);
    }

    public final void a(zar zarVar) {
        this.f10747h = zarVar;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
    public final void i0(ConnectionResult connectionResult) {
        b();
        this.f10747h.R(connectionResult, this.f10745f, this.f10746g);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
    public final void u(int i2) {
        b();
        this.f10747h.u(i2);
    }
}
