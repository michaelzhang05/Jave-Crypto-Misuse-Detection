package K;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes3.dex */
public final class v extends q {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4981a;

    public v(Context context) {
        this.f4981a = context;
    }

    private final void i() {
        if (V.o.a(this.f4981a, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // K.r
    public final void E() {
        i();
        c b8 = c.b(this.f4981a);
        GoogleSignInAccount c8 = b8.c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f15842l;
        if (c8 != null) {
            googleSignInOptions = b8.d();
        }
        com.google.android.gms.auth.api.signin.b a8 = com.google.android.gms.auth.api.signin.a.a(this.f4981a, googleSignInOptions);
        if (c8 != null) {
            a8.t();
        } else {
            a8.u();
        }
    }

    @Override // K.r
    public final void s() {
        i();
        p.a(this.f4981a).b();
    }
}
