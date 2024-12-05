package L;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    private static p f6032d;

    /* renamed from: a, reason: collision with root package name */
    final c f6033a;

    /* renamed from: b, reason: collision with root package name */
    GoogleSignInAccount f6034b;

    /* renamed from: c, reason: collision with root package name */
    GoogleSignInOptions f6035c;

    private p(Context context) {
        c b8 = c.b(context);
        this.f6033a = b8;
        this.f6034b = b8.c();
        this.f6035c = b8.d();
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
            p pVar = f6032d;
            if (pVar != null) {
                return pVar;
            }
            p pVar2 = new p(context);
            f6032d = pVar2;
            return pVar2;
        }
    }

    public final synchronized void b() {
        this.f6033a.a();
        this.f6034b = null;
        this.f6035c = null;
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f6033a.f(googleSignInAccount, googleSignInOptions);
        this.f6034b = googleSignInAccount;
        this.f6035c = googleSignInOptions;
    }
}
