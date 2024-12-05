package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e50 implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzbbr a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzwb f11337b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e50(zzwb zzwbVar, zzbbr zzbbrVar) {
        this.f11337b = zzwbVar;
        this.a = zzbbrVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void i0(ConnectionResult connectionResult) {
        Object obj;
        obj = this.f11337b.f15694d;
        synchronized (obj) {
            this.a.c(new RuntimeException("Connection failed."));
        }
    }
}
