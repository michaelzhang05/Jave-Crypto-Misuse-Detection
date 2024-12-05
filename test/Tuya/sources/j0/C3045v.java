package j0;

import O.C1260d;
import P.f;
import R.AbstractC1310g;
import R.C1307d;
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
import r0.C3679j;
import s0.C3715e;
import s0.C3720j;
import s0.P;

/* renamed from: j0.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3045v extends AbstractC1310g {

    /* renamed from: I, reason: collision with root package name */
    private final Context f32714I;

    /* renamed from: J, reason: collision with root package name */
    private final int f32715J;

    /* renamed from: K, reason: collision with root package name */
    private final String f32716K;

    /* renamed from: L, reason: collision with root package name */
    private final int f32717L;

    /* renamed from: M, reason: collision with root package name */
    private final boolean f32718M;

    public C3045v(Context context, Looper looper, C1307d c1307d, f.a aVar, f.b bVar, int i8, int i9, boolean z8) {
        super(context, looper, 4, c1307d, aVar, bVar);
        String str;
        this.f32714I = context;
        this.f32715J = i8;
        Account a8 = c1307d.a();
        if (a8 != null) {
            str = a8.name;
        } else {
            str = null;
        }
        this.f32716K = str;
        this.f32717L = i9;
        this.f32718M = z8;
    }

    private final Bundle o0() {
        String packageName = this.f32714I.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.f32715J);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.f32718M);
        bundle.putString("androidPackageName", packageName);
        String str = this.f32716K;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.f32717L);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R.AbstractC1306c
    public final String E() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // R.AbstractC1306c
    protected final String F() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // R.AbstractC1306c
    public final boolean O() {
        return true;
    }

    @Override // R.AbstractC1306c
    public final boolean S() {
        return true;
    }

    @Override // R.AbstractC1306c, P.a.f
    public final int k() {
        return 12600000;
    }

    public final void m0(C3715e c3715e, C3679j c3679j) {
        BinderC3043t binderC3043t = new BinderC3043t(c3679j);
        try {
            ((C3038o) D()).m0(c3715e, o0(), binderC3043t);
        } catch (RemoteException e8) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e8);
            binderC3043t.w(Status.f15090h, false, Bundle.EMPTY);
        }
    }

    public final void n0(C3720j c3720j, C3679j c3679j) {
        Bundle o02 = o0();
        o02.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        BinderC3044u binderC3044u = new BinderC3044u(c3679j);
        try {
            ((C3038o) D()).n0(c3720j, o02, binderC3044u);
        } catch (RemoteException e8) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e8);
            binderC3044u.a0(Status.f15090h, null, Bundle.EMPTY);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // R.AbstractC1306c
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (queryLocalInterface instanceof C3038o) {
            return (C3038o) queryLocalInterface;
        }
        return new C3038o(iBinder);
    }

    @Override // R.AbstractC1306c
    public final C1260d[] v() {
        return P.f37719i;
    }
}
