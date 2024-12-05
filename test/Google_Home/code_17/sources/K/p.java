package K;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    private static p f4977d;

    /* renamed from: a, reason: collision with root package name */
    final c f4978a;

    /* renamed from: b, reason: collision with root package name */
    GoogleSignInAccount f4979b;

    /* renamed from: c, reason: collision with root package name */
    GoogleSignInOptions f4980c;

    private p(Context context) {
        c b8 = c.b(context);
        this.f4978a = b8;
        this.f4979b = b8.c();
        this.f4980c = b8.d();
    }

    public static synchronized p a(Context context) {
        p d8;
        synchronized (p.class) {
            d8 = d(context.getApplicationContext());
        }
        return d8;
    }

    private static synchronized p d(Context context) {
        synchronized (p.class) {
            p pVar = f4977d;
            if (pVar != null) {
                return pVar;
            }
            p pVar2 = new p(context);
            f4977d = pVar2;
            return pVar2;
        }
    }

    public final synchronized void b() {
        this.f4978a.a();
        this.f4979b = null;
        this.f4980c = null;
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f4978a.f(googleSignInAccount, googleSignInOptions);
        this.f4979b = googleSignInAccount;
        this.f4980c = googleSignInOptions;
    }
}
