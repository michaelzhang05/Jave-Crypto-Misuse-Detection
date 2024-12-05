package L;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes3.dex */
public final class v extends q {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6036a;

    public v(Context context) {
        this.f6036a = context;
    }

    private final void j() {
        if (W.o.a(this.f6036a, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // L.r
    public final void A() {
        j();
        c b8 = c.b(this.f6036a);
        GoogleSignInAccount c8 = b8.c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f15041l;
        if (c8 != null) {
            googleSignInOptions = b8.d();
        }
        com.google.android.gms.auth.api.signin.b a8 = com.google.android.gms.auth.api.signin.a.a(this.f6036a, googleSignInOptions);
        if (c8 != null) {
            a8.t();
        } else {
            a8.u();
        }
    }

    @Override // L.r
    public final void q() {
        j();
        p.a(this.f6036a).b();
    }
}
