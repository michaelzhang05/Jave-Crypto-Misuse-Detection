package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
/* loaded from: classes2.dex */
public final class zzwo {

    @VisibleForTesting
    zzfx a;

    /* renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    boolean f15703b;

    public zzwo(Context context, String str, String str2) {
        zzacu.a(context);
        try {
            this.a = (zzfx) zzbae.a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", h50.a);
            ObjectWrapper.i0(context);
            this.a.L3(ObjectWrapper.i0(context), str, null);
            this.f15703b = true;
        } catch (RemoteException | zzbag | NullPointerException unused) {
            zzbad.e("Cannot dynamite load clearcut");
        }
    }

    public final zzws a(byte[] bArr) {
        return new zzws(this, bArr);
    }

    public zzwo(Context context) {
        zzacu.a(context);
        if (((Boolean) zzyt.e().c(zzacu.S3)).booleanValue()) {
            try {
                this.a = (zzfx) zzbae.a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", i50.a);
                ObjectWrapper.i0(context);
                this.a.u0(ObjectWrapper.i0(context), "GMA_SDK");
                this.f15703b = true;
            } catch (RemoteException | zzbag | NullPointerException unused) {
                zzbad.e("Cannot dynamite load clearcut");
            }
        }
    }

    public zzwo() {
    }
}
