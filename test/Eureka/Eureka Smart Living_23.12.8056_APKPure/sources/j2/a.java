package j2;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import t1.e;
import v1.c;
import v1.g0;
import v1.n;

/* loaded from: classes.dex */
public class a extends v1.g implements i2.e {
    public static final /* synthetic */ int M = 0;
    private final boolean I;
    private final v1.d J;
    private final Bundle K;
    private final Integer L;

    public a(Context context, Looper looper, boolean z5, v1.d dVar, Bundle bundle, e.a aVar, e.b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.I = true;
        this.J = dVar;
        this.K = bundle;
        this.L = dVar.g();
    }

    public static Bundle j0(v1.d dVar) {
        dVar.f();
        Integer g6 = dVar.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.a());
        if (g6 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", g6.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v1.c
    public final String D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // v1.c
    protected final String E() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // v1.c, t1.a.f
    public final boolean j() {
        return this.I;
    }

    @Override // i2.e
    public final void k(f fVar) {
        n.i(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b6 = this.J.b();
            ((g) C()).z(new j(1, new g0(b6, ((Integer) n.h(this.L)).intValue(), "<<default account>>".equals(b6.name) ? p1.a.a(x()).b() : null)), fVar);
        } catch (RemoteException e6) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.m(new l(1, new s1.a(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e6);
            }
        }
    }

    @Override // i2.e
    public final void l() {
        e(new c.d());
    }

    @Override // v1.c, t1.a.f
    public final int p() {
        return s1.i.f9224a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v1.c
    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    @Override // v1.c
    protected final Bundle z() {
        if (!x().getPackageName().equals(this.J.d())) {
            this.K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.J.d());
        }
        return this.K;
    }
}
