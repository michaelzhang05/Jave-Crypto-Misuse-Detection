package b0;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: b0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1845d extends AbstractC1842a implements InterfaceC1847f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C1845d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // b0.InterfaceC1847f
    public final String c() {
        Parcel j8 = j(1, i());
        String readString = j8.readString();
        j8.recycle();
        return readString;
    }

    @Override // b0.InterfaceC1847f
    public final boolean x(boolean z8) {
        Parcel i8 = i();
        AbstractC1844c.a(i8, true);
        Parcel j8 = j(2, i8);
        boolean b8 = AbstractC1844c.b(j8);
        j8.recycle();
        return b8;
    }
}
