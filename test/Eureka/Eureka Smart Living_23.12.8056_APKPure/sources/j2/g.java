package j2;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g extends d2.a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void z(j jVar, f fVar) {
        Parcel a6 = a();
        d2.c.b(a6, jVar);
        d2.c.c(a6, fVar);
        b(12, a6);
    }
}
