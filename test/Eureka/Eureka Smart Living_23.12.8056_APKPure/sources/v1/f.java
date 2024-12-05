package v1;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import v1.i;

/* loaded from: classes.dex */
public class f extends w1.a {
    public static final Parcelable.Creator<f> CREATOR = new z0();

    /* renamed from: o, reason: collision with root package name */
    static final Scope[] f9567o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    static final s1.c[] f9568p = new s1.c[0];

    /* renamed from: a, reason: collision with root package name */
    final int f9569a;

    /* renamed from: b, reason: collision with root package name */
    final int f9570b;

    /* renamed from: c, reason: collision with root package name */
    int f9571c;

    /* renamed from: d, reason: collision with root package name */
    String f9572d;

    /* renamed from: e, reason: collision with root package name */
    IBinder f9573e;

    /* renamed from: f, reason: collision with root package name */
    Scope[] f9574f;

    /* renamed from: g, reason: collision with root package name */
    Bundle f9575g;

    /* renamed from: h, reason: collision with root package name */
    Account f9576h;

    /* renamed from: i, reason: collision with root package name */
    s1.c[] f9577i;

    /* renamed from: j, reason: collision with root package name */
    s1.c[] f9578j;

    /* renamed from: k, reason: collision with root package name */
    boolean f9579k;

    /* renamed from: l, reason: collision with root package name */
    int f9580l;

    /* renamed from: m, reason: collision with root package name */
    boolean f9581m;

    /* renamed from: n, reason: collision with root package name */
    private String f9582n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(int i6, int i7, int i8, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, s1.c[] cVarArr, s1.c[] cVarArr2, boolean z5, int i9, boolean z6, String str2) {
        scopeArr = scopeArr == null ? f9567o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        cVarArr = cVarArr == null ? f9568p : cVarArr;
        cVarArr2 = cVarArr2 == null ? f9568p : cVarArr2;
        this.f9569a = i6;
        this.f9570b = i7;
        this.f9571c = i8;
        if ("com.google.android.gms".equals(str)) {
            this.f9572d = "com.google.android.gms";
        } else {
            this.f9572d = str;
        }
        if (i6 < 2) {
            this.f9576h = iBinder != null ? a.c(i.a.b(iBinder)) : null;
        } else {
            this.f9573e = iBinder;
            this.f9576h = account;
        }
        this.f9574f = scopeArr;
        this.f9575g = bundle;
        this.f9577i = cVarArr;
        this.f9578j = cVarArr2;
        this.f9579k = z5;
        this.f9580l = i9;
        this.f9581m = z6;
        this.f9582n = str2;
    }

    public final String a() {
        return this.f9582n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        z0.a(this, parcel, i6);
    }
}
