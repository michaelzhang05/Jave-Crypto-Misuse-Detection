package R;

import Z.a;
import android.os.IBinder;
import android.os.Parcel;
import g0.AbstractC2698a;

/* loaded from: classes3.dex */
public final class u0 extends AbstractC2698a implements S {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // R.S
    public final int c() {
        Parcel i8 = i(2, j());
        int readInt = i8.readInt();
        i8.recycle();
        return readInt;
    }

    @Override // R.S
    public final Z.a d() {
        Parcel i8 = i(1, j());
        Z.a j8 = a.AbstractBinderC0256a.j(i8.readStrongBinder());
        i8.recycle();
        return j8;
    }
}
