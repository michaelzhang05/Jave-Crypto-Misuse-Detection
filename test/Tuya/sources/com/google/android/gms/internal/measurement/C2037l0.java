package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2037l0 extends P implements InterfaceC2053n0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2037l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2053n0
    public final int d() {
        Parcel j8 = j(2, i());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2053n0
    public final void m(String str, String str2, Bundle bundle, long j8) {
        Parcel i8 = i();
        i8.writeString(str);
        i8.writeString(str2);
        S.d(i8, bundle);
        i8.writeLong(j8);
        l(1, i8);
    }
}
