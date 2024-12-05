package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t0 implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzbbr a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(zzaii zzaiiVar, zzbbr zzbbrVar) {
        this.a = zzbbrVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void i0(ConnectionResult connectionResult) {
        this.a.c(new RuntimeException("Connection failed."));
    }
}
