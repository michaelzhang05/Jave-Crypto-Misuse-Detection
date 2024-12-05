package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class Y0 extends Y implements W0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Y0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.W0
    public final void c0(String str, String str2, Bundle bundle, long j8) {
        Parcel h8 = h();
        h8.writeString(str);
        h8.writeString(str2);
        AbstractC2066a0.d(h8, bundle);
        h8.writeLong(j8);
        k(1, h8);
    }

    @Override // com.google.android.gms.internal.measurement.W0
    public final int w() {
        Parcel i8 = i(2, h());
        int readInt = i8.readInt();
        i8.recycle();
        return readInt;
    }
}
