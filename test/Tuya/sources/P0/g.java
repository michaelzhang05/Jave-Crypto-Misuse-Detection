package p0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e0.AbstractC2569a;
import e0.AbstractC2571c;

/* loaded from: classes3.dex */
public final class g extends AbstractC2569a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void m0(j jVar, f fVar) {
        Parcel i8 = i();
        AbstractC2571c.c(i8, jVar);
        AbstractC2571c.d(i8, fVar);
        j(12, i8);
    }
}
