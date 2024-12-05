package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes2.dex */
final class e implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ GoogleApiClient.OnConnectionFailedListener a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.a = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void i0(ConnectionResult connectionResult) {
        this.a.i0(connectionResult);
    }
}
