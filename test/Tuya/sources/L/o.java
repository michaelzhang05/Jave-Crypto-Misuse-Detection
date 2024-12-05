package L;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1939c;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static final U.a f6031a = new U.a("GoogleSignInCommon", new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        f6031a.a("getFallbackSignInIntent()", new Object[0]);
        Intent c8 = c(context, googleSignInOptions);
        c8.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return c8;
    }

    public static Intent b(Context context, GoogleSignInOptions googleSignInOptions) {
        f6031a.a("getNoImplementationSignInIntent()", new Object[0]);
        Intent c8 = c(context, googleSignInOptions);
        c8.setAction("com.google.android.gms.auth.NO_IMPL");
        return c8;
    }

    public static Intent c(Context context, GoogleSignInOptions googleSignInOptions) {
        f6031a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static K.b d(Intent intent) {
        if (intent == null) {
            return new K.b(null, Status.f15090h);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount == null) {
            if (status == null) {
                status = Status.f15090h;
            }
            return new K.b(null, status);
        }
        return new K.b(googleSignInAccount, Status.f15088f);
    }

    public static P.g e(P.f fVar, Context context, boolean z8) {
        f6031a.a("Revoking access", new Object[0]);
        String e8 = c.b(context).e();
        g(context);
        if (z8) {
            return f.a(e8);
        }
        return fVar.a(new m(fVar));
    }

    public static P.g f(P.f fVar, Context context, boolean z8) {
        f6031a.a("Signing out", new Object[0]);
        g(context);
        if (z8) {
            return P.h.b(Status.f15088f, fVar);
        }
        return fVar.a(new k(fVar));
    }

    private static void g(Context context) {
        p.a(context).b();
        Iterator it = P.f.b().iterator();
        while (it.hasNext()) {
            ((P.f) it.next()).e();
        }
        C1939c.a();
    }
}
