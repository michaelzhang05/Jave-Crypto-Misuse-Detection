package R;

import O.C1260d;
import R.InterfaceC1313j;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;

/* renamed from: R.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1309f extends S.a {

    @NonNull
    public static final Parcelable.Creator<C1309f> CREATOR = new k0();

    /* renamed from: o, reason: collision with root package name */
    static final Scope[] f8542o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    static final C1260d[] f8543p = new C1260d[0];

    /* renamed from: a, reason: collision with root package name */
    final int f8544a;

    /* renamed from: b, reason: collision with root package name */
    final int f8545b;

    /* renamed from: c, reason: collision with root package name */
    final int f8546c;

    /* renamed from: d, reason: collision with root package name */
    String f8547d;

    /* renamed from: e, reason: collision with root package name */
    IBinder f8548e;

    /* renamed from: f, reason: collision with root package name */
    Scope[] f8549f;

    /* renamed from: g, reason: collision with root package name */
    Bundle f8550g;

    /* renamed from: h, reason: collision with root package name */
    Account f8551h;

    /* renamed from: i, reason: collision with root package name */
    C1260d[] f8552i;

    /* renamed from: j, reason: collision with root package name */
    C1260d[] f8553j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f8554k;

    /* renamed from: l, reason: collision with root package name */
    final int f8555l;

    /* renamed from: m, reason: collision with root package name */
    boolean f8556m;

    /* renamed from: n, reason: collision with root package name */
    private final String f8557n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1309f(int i8, int i9, int i10, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C1260d[] c1260dArr, C1260d[] c1260dArr2, boolean z8, int i11, boolean z9, String str2) {
        scopeArr = scopeArr == null ? f8542o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c1260dArr = c1260dArr == null ? f8543p : c1260dArr;
        c1260dArr2 = c1260dArr2 == null ? f8543p : c1260dArr2;
        this.f8544a = i8;
        this.f8545b = i9;
        this.f8546c = i10;
        if ("com.google.android.gms".equals(str)) {
            this.f8547d = "com.google.android.gms";
        } else {
            this.f8547d = str;
        }
        if (i8 < 2) {
            this.f8551h = iBinder != null ? AbstractBinderC1304a.l(InterfaceC1313j.a.j(iBinder)) : null;
        } else {
            this.f8548e = iBinder;
            this.f8551h = account;
        }
        this.f8549f = scopeArr;
        this.f8550g = bundle;
        this.f8552i = c1260dArr;
        this.f8553j = c1260dArr2;
        this.f8554k = z8;
        this.f8555l = i11;
        this.f8556m = z9;
        this.f8557n = str2;
    }

    public final String s() {
        return this.f8557n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        k0.a(this, parcel, i8);
    }
}
