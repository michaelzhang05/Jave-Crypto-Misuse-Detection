package com.google.android.gms.dynamite;

import Z.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g0.AbstractC2698a;
import g0.AbstractC2700c;

/* loaded from: classes3.dex */
public final class m extends AbstractC2698a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int l() {
        Parcel i8 = i(6, j());
        int readInt = i8.readInt();
        i8.recycle();
        return readInt;
    }

    public final int m0(Z.a aVar, String str, boolean z8) {
        Parcel j8 = j();
        AbstractC2700c.d(j8, aVar);
        j8.writeString(str);
        j8.writeInt(z8 ? 1 : 0);
        Parcel i8 = i(3, j8);
        int readInt = i8.readInt();
        i8.recycle();
        return readInt;
    }

    public final int n0(Z.a aVar, String str, boolean z8) {
        Parcel j8 = j();
        AbstractC2700c.d(j8, aVar);
        j8.writeString(str);
        j8.writeInt(z8 ? 1 : 0);
        Parcel i8 = i(5, j8);
        int readInt = i8.readInt();
        i8.recycle();
        return readInt;
    }

    public final Z.a o0(Z.a aVar, String str, int i8) {
        Parcel j8 = j();
        AbstractC2700c.d(j8, aVar);
        j8.writeString(str);
        j8.writeInt(i8);
        Parcel i9 = i(2, j8);
        Z.a j9 = a.AbstractBinderC0256a.j(i9.readStrongBinder());
        i9.recycle();
        return j9;
    }

    public final Z.a p0(Z.a aVar, String str, int i8, Z.a aVar2) {
        Parcel j8 = j();
        AbstractC2700c.d(j8, aVar);
        j8.writeString(str);
        j8.writeInt(i8);
        AbstractC2700c.d(j8, aVar2);
        Parcel i9 = i(8, j8);
        Z.a j9 = a.AbstractBinderC0256a.j(i9.readStrongBinder());
        i9.recycle();
        return j9;
    }

    public final Z.a q0(Z.a aVar, String str, int i8) {
        Parcel j8 = j();
        AbstractC2700c.d(j8, aVar);
        j8.writeString(str);
        j8.writeInt(i8);
        Parcel i9 = i(4, j8);
        Z.a j9 = a.AbstractBinderC0256a.j(i9.readStrongBinder());
        i9.recycle();
        return j9;
    }

    public final Z.a r0(Z.a aVar, String str, boolean z8, long j8) {
        Parcel j9 = j();
        AbstractC2700c.d(j9, aVar);
        j9.writeString(str);
        j9.writeInt(z8 ? 1 : 0);
        j9.writeLong(j8);
        Parcel i8 = i(7, j9);
        Z.a j10 = a.AbstractBinderC0256a.j(i8.readStrongBinder());
        i8.recycle();
        return j10;
    }
}
