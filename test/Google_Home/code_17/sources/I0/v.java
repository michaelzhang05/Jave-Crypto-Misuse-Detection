package i0;

import N.C1333d;
import O.f;
import Q.AbstractC1391g;
import Q.C1388d;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import q0.C3826j;
import r0.C3897e;
import r0.C3902j;
import r0.P;

/* loaded from: classes3.dex */
public final class v extends AbstractC1391g {

    /* renamed from: I, reason: collision with root package name */
    private final Context f32857I;

    /* renamed from: J, reason: collision with root package name */
    private final int f32858J;

    /* renamed from: K, reason: collision with root package name */
    private final String f32859K;

    /* renamed from: L, reason: collision with root package name */
    private final int f32860L;

    /* renamed from: M, reason: collision with root package name */
    private final boolean f32861M;

    public v(Context context, Looper looper, C1388d c1388d, f.a aVar, f.b bVar, int i8, int i9, boolean z8) {
        super(context, looper, 4, c1388d, aVar, bVar);
        String str;
        this.f32857I = context;
        this.f32858J = i8;
        Account a8 = c1388d.a();
        if (a8 != null) {
            str = a8.name;
        } else {
            str = null;
        }
        this.f32859K = str;
        this.f32860L = i9;
        this.f32861M = z8;
    }

    private final Bundle o0() {
        String packageName = this.f32857I.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.f32858J);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.f32861M);
        bundle.putString("androidPackageName", packageName);
        String str = this.f32859K;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.f32860L);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1387c
    public final String E() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // Q.AbstractC1387c
    protected final String F() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // Q.AbstractC1387c
    public final boolean O() {
        return true;
    }

    @Override // Q.AbstractC1387c
    public final boolean S() {
        return true;
    }

    @Override // Q.AbstractC1387c, O.a.f
    public final int k() {
        return 12600000;
    }

    public final void m0(C3897e c3897e, C3826j c3826j) {
        t tVar = new t(c3826j);
        try {
            ((o) D()).s0(c3897e, o0(), tVar);
        } catch (RemoteException e8) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e8);
            tVar.v(Status.f15891h, false, Bundle.EMPTY);
        }
    }

    public final void n0(C3902j c3902j, C3826j c3826j) {
        Bundle o02 = o0();
        o02.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        u uVar = new u(c3826j);
        try {
            ((o) D()).t0(c3902j, o02, uVar);
        } catch (RemoteException e8) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e8);
            uVar.l(Status.f15891h, null, Bundle.EMPTY);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Q.AbstractC1387c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (queryLocalInterface instanceof o) {
            return (o) queryLocalInterface;
        }
        return new o(iBinder);
    }

    @Override // Q.AbstractC1387c
    public final C1333d[] v() {
        return P.f38454i;
    }
}
