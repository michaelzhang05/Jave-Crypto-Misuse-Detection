package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2116f0 extends Y implements InterfaceC2096d0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2116f0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2096d0
    public final Bundle e(Bundle bundle) {
        Parcel h8 = h();
        AbstractC2066a0.d(h8, bundle);
        Parcel i8 = i(1, h8);
        Bundle bundle2 = (Bundle) AbstractC2066a0.a(i8, Bundle.CREATOR);
        i8.recycle();
        return bundle2;
    }
}
