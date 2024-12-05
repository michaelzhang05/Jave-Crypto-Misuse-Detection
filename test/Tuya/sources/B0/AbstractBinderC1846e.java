package b0;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: b0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC1846e extends AbstractBinderC1843b implements InterfaceC1847f {
    public static InterfaceC1847f i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (queryLocalInterface instanceof InterfaceC1847f) {
            return (InterfaceC1847f) queryLocalInterface;
        }
        return new C1845d(iBinder);
    }
}
