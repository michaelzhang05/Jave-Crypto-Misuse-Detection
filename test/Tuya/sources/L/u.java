package L;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import d0.AbstractC2529a;
import d0.AbstractC2532d;

/* loaded from: classes3.dex */
public final class u extends AbstractC2529a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void l(t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel i8 = i();
        AbstractC2532d.d(i8, tVar);
        AbstractC2532d.c(i8, googleSignInOptions);
        j(103, i8);
    }

    public final void m0(t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel i8 = i();
        AbstractC2532d.d(i8, tVar);
        AbstractC2532d.c(i8, googleSignInOptions);
        j(102, i8);
    }
}
