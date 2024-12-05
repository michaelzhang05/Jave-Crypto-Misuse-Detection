package a0;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: a0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC1607e extends AbstractBinderC1604b implements InterfaceC1608f {
    public static InterfaceC1608f h(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (queryLocalInterface instanceof InterfaceC1608f) {
            return (InterfaceC1608f) queryLocalInterface;
        }
        return new C1606d(iBinder);
    }
}
