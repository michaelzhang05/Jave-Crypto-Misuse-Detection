package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class T extends P implements V {
    /* JADX INFO: Access modifiers changed from: package-private */
    public T(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.google.android.gms.internal.measurement.V
    public final Bundle H(Bundle bundle) {
        Parcel i8 = i();
        S.d(i8, bundle);
        Parcel j8 = j(1, i8);
        Bundle bundle2 = (Bundle) S.a(j8, Bundle.CREATOR);
        j8.recycle();
        return bundle2;
    }
}
