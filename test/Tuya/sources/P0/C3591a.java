package p0;

import O.AbstractC1268l;
import O.C1258b;
import P.f;
import R.AbstractC1306c;
import R.AbstractC1310g;
import R.AbstractC1319p;
import R.C1307d;
import R.M;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import o0.InterfaceC3523e;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3591a extends AbstractC1310g implements InterfaceC3523e {

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f36969M = 0;

    /* renamed from: I, reason: collision with root package name */
    private final boolean f36970I;

    /* renamed from: J, reason: collision with root package name */
    private final C1307d f36971J;

    /* renamed from: K, reason: collision with root package name */
    private final Bundle f36972K;

    /* renamed from: L, reason: collision with root package name */
    private final Integer f36973L;

    public C3591a(Context context, Looper looper, boolean z8, C1307d c1307d, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 44, c1307d, aVar, bVar);
        this.f36970I = true;
        this.f36971J = c1307d;
        this.f36972K = bundle;
        this.f36973L = c1307d.i();
    }

    public static Bundle m0(C1307d c1307d) {
        c1307d.h();
        Integer i8 = c1307d.i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c1307d.a());
        if (i8 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i8.intValue());
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

    @Override // R.AbstractC1306c
    protected final Bundle A() {
        if (!y().getPackageName().equals(this.f36971J.f())) {
            this.f36972K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f36971J.f());
        }
        return this.f36972K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R.AbstractC1306c
    public final String E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // R.AbstractC1306c
    protected final String F() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // o0.InterfaceC3523e
    public final void a(f fVar) {
        GoogleSignInAccount googleSignInAccount;
        AbstractC1319p.m(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account c8 = this.f36971J.c();
            if ("<<default account>>".equals(c8.name)) {
                googleSignInAccount = L.c.b(y()).c();
            } else {
                googleSignInAccount = null;
            }
            ((g) D()).m0(new j(1, new M(c8, ((Integer) AbstractC1319p.l(this.f36973L)).intValue(), googleSignInAccount)), fVar);
        } catch (RemoteException e8) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.Z(new l(1, new C1258b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e8);
            }
        }
    }

    @Override // R.AbstractC1306c, P.a.f
    public final int k() {
        return AbstractC1268l.f7671a;
    }

    @Override // R.AbstractC1306c, P.a.f
    public final boolean n() {
        return this.f36970I;
    }

    @Override // o0.InterfaceC3523e
    public final void o() {
        h(new AbstractC1306c.d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R.AbstractC1306c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof g) {
            return (g) queryLocalInterface;
        }
        return new g(iBinder);
    }
}
