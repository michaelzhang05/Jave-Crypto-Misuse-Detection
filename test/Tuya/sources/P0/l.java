package p0;

import O.C1258b;
import R.O;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class l extends S.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    final int f36981a;

    /* renamed from: b, reason: collision with root package name */
    private final C1258b f36982b;

    /* renamed from: c, reason: collision with root package name */
    private final O f36983c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i8, C1258b c1258b, O o8) {
        this.f36981a = i8;
        this.f36982b = c1258b;
        this.f36983c = o8;
    }

    public final C1258b s() {
        return this.f36982b;
    }

    public final O u() {
        return this.f36983c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, this.f36981a);
        S.c.p(parcel, 2, this.f36982b, i8, false);
        S.c.p(parcel, 3, this.f36983c, i8, false);
        S.c.b(parcel, a8);
    }
}
