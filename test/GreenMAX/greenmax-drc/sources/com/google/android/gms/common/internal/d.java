package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes2.dex */
final class d implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ GoogleApiClient.ConnectionCallbacks a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.a = connectionCallbacks;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void C(Bundle bundle) {
        this.a.C(bundle);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void u(int i2) {
        this.a.u(i2);
    }
}
