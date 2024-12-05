package Q;

import N.C1333d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class h0 extends R.a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* renamed from: a, reason: collision with root package name */
    Bundle f9031a;

    /* renamed from: b, reason: collision with root package name */
    C1333d[] f9032b;

    /* renamed from: c, reason: collision with root package name */
    int f9033c;

    /* renamed from: d, reason: collision with root package name */
    C1389e f9034d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(Bundle bundle, C1333d[] c1333dArr, int i8, C1389e c1389e) {
        this.f9031a = bundle;
        this.f9032b = c1333dArr;
        this.f9033c = i8;
        this.f9034d = c1389e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.e(parcel, 1, this.f9031a, false);
        R.c.t(parcel, 2, this.f9032b, i8, false);
        R.c.k(parcel, 3, this.f9033c);
        R.c.p(parcel, 4, this.f9034d, i8, false);
        R.c.b(parcel, a8);
    }
}
