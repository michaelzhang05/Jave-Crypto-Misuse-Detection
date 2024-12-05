package o0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import d0.AbstractC2722a;
import d0.AbstractC2724c;

/* renamed from: o0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3510g extends AbstractC2722a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3510g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void s0(j jVar, InterfaceC3509f interfaceC3509f) {
        Parcel h8 = h();
        AbstractC2724c.c(h8, jVar);
        AbstractC2724c.d(h8, interfaceC3509f);
        i(12, h8);
    }
}
