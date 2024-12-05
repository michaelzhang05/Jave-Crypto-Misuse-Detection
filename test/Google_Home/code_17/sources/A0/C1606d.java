package a0;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1606d extends AbstractC1603a implements InterfaceC1608f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1606d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // a0.InterfaceC1608f
    public final boolean A(boolean z8) {
        Parcel h8 = h();
        AbstractC1605c.a(h8, true);
        Parcel i8 = i(2, h8);
        boolean b8 = AbstractC1605c.b(i8);
        i8.recycle();
        return b8;
    }

    @Override // a0.InterfaceC1608f
    public final String b() {
        Parcel i8 = i(1, h());
        String readString = i8.readString();
        i8.recycle();
        return readString;
    }
}
