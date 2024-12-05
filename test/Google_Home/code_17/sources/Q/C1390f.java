package Q;

import N.C1333d;
import Q.InterfaceC1394j;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;

/* renamed from: Q.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1390f extends R.a {

    @NonNull
    public static final Parcelable.Creator<C1390f> CREATOR = new k0();

    /* renamed from: o, reason: collision with root package name */
    static final Scope[] f9004o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    static final C1333d[] f9005p = new C1333d[0];

    /* renamed from: a, reason: collision with root package name */
    final int f9006a;

    /* renamed from: b, reason: collision with root package name */
    final int f9007b;

    /* renamed from: c, reason: collision with root package name */
    final int f9008c;

    /* renamed from: d, reason: collision with root package name */
    String f9009d;

    /* renamed from: e, reason: collision with root package name */
    IBinder f9010e;

    /* renamed from: f, reason: collision with root package name */
    Scope[] f9011f;

    /* renamed from: g, reason: collision with root package name */
    Bundle f9012g;

    /* renamed from: h, reason: collision with root package name */
    Account f9013h;

    /* renamed from: i, reason: collision with root package name */
    C1333d[] f9014i;

    /* renamed from: j, reason: collision with root package name */
    C1333d[] f9015j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f9016k;

    /* renamed from: l, reason: collision with root package name */
    final int f9017l;

    /* renamed from: m, reason: collision with root package name */
    boolean f9018m;

    /* renamed from: n, reason: collision with root package name */
    private final String f9019n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1390f(int i8, int i9, int i10, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C1333d[] c1333dArr, C1333d[] c1333dArr2, boolean z8, int i11, boolean z9, String str2) {
        scopeArr = scopeArr == null ? f9004o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c1333dArr = c1333dArr == null ? f9005p : c1333dArr;
        c1333dArr2 = c1333dArr2 == null ? f9005p : c1333dArr2;
        this.f9006a = i8;
        this.f9007b = i9;
        this.f9008c = i10;
        if ("com.google.android.gms".equals(str)) {
            this.f9009d = "com.google.android.gms";
        } else {
            this.f9009d = str;
        }
        if (i8 < 2) {
            this.f9013h = iBinder != null ? AbstractBinderC1385a.k(InterfaceC1394j.a.i(iBinder)) : null;
        } else {
            this.f9010e = iBinder;
            this.f9013h = account;
        }
        this.f9011f = scopeArr;
        this.f9012g = bundle;
        this.f9014i = c1333dArr;
        this.f9015j = c1333dArr2;
        this.f9016k = z8;
        this.f9017l = i11;
        this.f9018m = z9;
        this.f9019n = str2;
    }

    public final String p() {
        return this.f9019n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        k0.a(this, parcel, i8);
    }
}
