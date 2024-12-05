package o0;

import N.AbstractC1341l;
import N.C1331b;
import O.f;
import Q.AbstractC1387c;
import Q.AbstractC1391g;
import Q.AbstractC1400p;
import Q.C1388d;
import Q.M;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3504a extends AbstractC1391g implements n0.e {

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f35779M = 0;

    /* renamed from: I, reason: collision with root package name */
    private final boolean f35780I;

    /* renamed from: J, reason: collision with root package name */
    private final C1388d f35781J;

    /* renamed from: K, reason: collision with root package name */
    private final Bundle f35782K;

    /* renamed from: L, reason: collision with root package name */
    private final Integer f35783L;

    public C3504a(Context context, Looper looper, boolean z8, C1388d c1388d, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 44, c1388d, aVar, bVar);
        this.f35780I = true;
        this.f35781J = c1388d;
        this.f35782K = bundle;
        this.f35783L = c1388d.i();
    }

    public static Bundle m0(C1388d c1388d) {
        c1388d.h();
        Integer i8 = c1388d.i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c1388d.a());
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

    @Override // Q.AbstractC1387c
    protected final Bundle A() {
        if (!y().getPackageName().equals(this.f35781J.f())) {
            this.f35782K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f35781J.f());
        }
        return this.f35782K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1387c
    public final String E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // Q.AbstractC1387c
    protected final String F() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // n0.e
    public final void a(InterfaceC3509f interfaceC3509f) {
        GoogleSignInAccount googleSignInAccount;
        AbstractC1400p.m(interfaceC3509f, "Expecting a valid ISignInCallbacks");
        try {
            Account c8 = this.f35781J.c();
            if ("<<default account>>".equals(c8.name)) {
                googleSignInAccount = K.c.b(y()).c();
            } else {
                googleSignInAccount = null;
            }
            ((C3510g) D()).s0(new j(1, new M(c8, ((Integer) AbstractC1400p.l(this.f35783L)).intValue(), googleSignInAccount)), interfaceC3509f);
        } catch (RemoteException e8) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC3509f.i0(new l(1, new C1331b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e8);
            }
        }
    }

    @Override // Q.AbstractC1387c, O.a.f
    public final int k() {
        return AbstractC1341l.f7472a;
    }

    @Override // Q.AbstractC1387c, O.a.f
    public final boolean o() {
        return this.f35780I;
    }

    @Override // n0.e
    public final void p() {
        j(new AbstractC1387c.d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1387c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C3510g) {
            return (C3510g) queryLocalInterface;
        }
        return new C3510g(iBinder);
    }
}
