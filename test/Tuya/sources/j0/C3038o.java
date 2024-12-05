package j0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import s0.C3715e;
import s0.C3720j;

/* renamed from: j0.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3038o extends AbstractC3024a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3038o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wallet.internal.IOwService");
    }

    public final void m0(C3715e c3715e, Bundle bundle, InterfaceC3040q interfaceC3040q) {
        Parcel i8 = i();
        AbstractC3027d.c(i8, c3715e);
        AbstractC3027d.c(i8, bundle);
        AbstractC3027d.d(i8, interfaceC3040q);
        l(14, i8);
    }

    public final void n0(C3720j c3720j, Bundle bundle, InterfaceC3040q interfaceC3040q) {
        Parcel i8 = i();
        AbstractC3027d.c(i8, c3720j);
        AbstractC3027d.c(i8, bundle);
        AbstractC3027d.d(i8, interfaceC3040q);
        l(19, i8);
    }
}
