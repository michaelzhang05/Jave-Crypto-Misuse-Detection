package r0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r0.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3892E extends R.a {
    public static final Parcelable.Creator<C3892E> CREATOR = new F();

    /* renamed from: a, reason: collision with root package name */
    final String f38440a;

    /* renamed from: b, reason: collision with root package name */
    final String f38441b;

    /* renamed from: c, reason: collision with root package name */
    final int f38442c;

    /* renamed from: d, reason: collision with root package name */
    final int f38443d;

    public C3892E(String str, String str2, int i8, int i9) {
        this.f38440a = str;
        this.f38441b = str2;
        this.f38442c = i8;
        this.f38443d = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f38440a;
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 2, str, false);
        R.c.q(parcel, 3, this.f38441b, false);
        R.c.k(parcel, 4, this.f38442c);
        R.c.k(parcel, 5, this.f38443d);
        R.c.b(parcel, a8);
    }
}
