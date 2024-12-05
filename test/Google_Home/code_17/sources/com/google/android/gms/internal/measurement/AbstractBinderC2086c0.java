package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC2086c0 extends AbstractBinderC2076b0 implements InterfaceC2096d0 {
    public static InterfaceC2096d0 i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof InterfaceC2096d0) {
            return (InterfaceC2096d0) queryLocalInterface;
        }
        return new C2116f0(iBinder);
    }
}
