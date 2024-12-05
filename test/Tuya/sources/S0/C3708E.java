package s0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s0.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3708E extends S.a {
    public static final Parcelable.Creator<C3708E> CREATOR = new C3709F();

    /* renamed from: a, reason: collision with root package name */
    final String f37705a;

    /* renamed from: b, reason: collision with root package name */
    final String f37706b;

    /* renamed from: c, reason: collision with root package name */
    final int f37707c;

    /* renamed from: d, reason: collision with root package name */
    final int f37708d;

    public C3708E(String str, String str2, int i8, int i9) {
        this.f37705a = str;
        this.f37706b = str2;
        this.f37707c = i8;
        this.f37708d = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f37705a;
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 2, str, false);
        S.c.q(parcel, 3, this.f37706b, false);
        S.c.k(parcel, 4, this.f37707c);
        S.c.k(parcel, 5, this.f37708d);
        S.c.b(parcel, a8);
    }
}
