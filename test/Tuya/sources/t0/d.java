package t0;

import Z.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.wallet.button.ButtonOptions;
import j0.AbstractC3024a;
import j0.AbstractC3027d;

/* loaded from: classes3.dex */
public final class d extends AbstractC3024a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.button.IPayButtonCreator");
    }

    public final Z.a m0(Z.a aVar, ButtonOptions buttonOptions) {
        Parcel i8 = i();
        AbstractC3027d.d(i8, aVar);
        AbstractC3027d.c(i8, buttonOptions);
        Parcel j8 = j(1, i8);
        Z.a j9 = a.AbstractBinderC0256a.j(j8.readStrongBinder());
        j8.recycle();
        return j9;
    }
}
