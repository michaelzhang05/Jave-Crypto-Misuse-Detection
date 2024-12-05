package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x40 implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzvn a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x40(zzvn zzvnVar) {
        this.a = zzvnVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void C(Bundle bundle) {
        Object obj;
        Object obj2;
        zzvu zzvuVar;
        zzvu zzvuVar2;
        obj = this.a.f15681b;
        synchronized (obj) {
            try {
                zzvuVar = this.a.f15682c;
                if (zzvuVar != null) {
                    zzvn zzvnVar = this.a;
                    zzvuVar2 = zzvnVar.f15682c;
                    zzvnVar.f15684e = zzvuVar2.f();
                }
            } catch (DeadObjectException e2) {
                zzbad.c("Unable to obtain a cache service instance.", e2);
                this.a.b();
            }
            obj2 = this.a.f15681b;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void u(int i2) {
        Object obj;
        Object obj2;
        obj = this.a.f15681b;
        synchronized (obj) {
            this.a.f15684e = null;
            obj2 = this.a.f15681b;
            obj2.notifyAll();
        }
    }
}
