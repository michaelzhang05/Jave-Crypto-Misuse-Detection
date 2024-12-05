package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s0 implements BaseGmsClient.BaseConnectionCallbacks {
    private final /* synthetic */ zzbbr a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzaii f12131b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(zzaii zzaiiVar, zzbbr zzbbrVar) {
        this.f12131b = zzaiiVar;
        this.a = zzbbrVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void C(Bundle bundle) {
        zzahz zzahzVar;
        try {
            zzbbr zzbbrVar = this.a;
            zzahzVar = this.f12131b.a;
            zzbbrVar.b(zzahzVar.f());
        } catch (DeadObjectException e2) {
            this.a.c(e2);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void u(int i2) {
        zzbbr zzbbrVar = this.a;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i2);
        zzbbrVar.c(new RuntimeException(sb.toString()));
    }
}
