package com.google.android.gms.dynamite;

import Z.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g0.AbstractC2698a;
import g0.AbstractC2700c;

/* loaded from: classes3.dex */
public final class n extends AbstractC2698a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final Z.a l(Z.a aVar, String str, int i8, Z.a aVar2) {
        Parcel j8 = j();
        AbstractC2700c.d(j8, aVar);
        j8.writeString(str);
        j8.writeInt(i8);
        AbstractC2700c.d(j8, aVar2);
        Parcel i9 = i(2, j8);
        Z.a j9 = a.AbstractBinderC0256a.j(i9.readStrongBinder());
        i9.recycle();
        return j9;
    }

    public final Z.a m0(Z.a aVar, String str, int i8, Z.a aVar2) {
        Parcel j8 = j();
        AbstractC2700c.d(j8, aVar);
        j8.writeString(str);
        j8.writeInt(i8);
        AbstractC2700c.d(j8, aVar2);
        Parcel i9 = i(3, j8);
        Z.a j9 = a.AbstractBinderC0256a.j(i9.readStrongBinder());
        i9.recycle();
        return j9;
    }
}
