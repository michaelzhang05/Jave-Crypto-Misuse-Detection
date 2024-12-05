package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class y40 implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzvn a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y40(zzvn zzvnVar) {
        this.a = zzvnVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void i0(ConnectionResult connectionResult) {
        Object obj;
        zzvu zzvuVar;
        Object obj2;
        obj = this.a.f15681b;
        synchronized (obj) {
            this.a.f15684e = null;
            zzvuVar = this.a.f15682c;
            if (zzvuVar != null) {
                zzvn.f(this.a, null);
            }
            obj2 = this.a.f15681b;
            obj2.notifyAll();
        }
    }
}
