package o0;

import N.C1331b;
import Q.O;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class l extends R.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    final int f35791a;

    /* renamed from: b, reason: collision with root package name */
    private final C1331b f35792b;

    /* renamed from: c, reason: collision with root package name */
    private final O f35793c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i8, C1331b c1331b, O o8) {
        this.f35791a = i8;
        this.f35792b = c1331b;
        this.f35793c = o8;
    }

    public final C1331b p() {
        return this.f35792b;
    }

    public final O u() {
        return this.f35793c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.k(parcel, 1, this.f35791a);
        R.c.p(parcel, 2, this.f35792b, i8, false);
        R.c.p(parcel, 3, this.f35793c, i8, false);
        R.c.b(parcel, a8);
    }
}
