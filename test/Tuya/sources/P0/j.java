package p0;

import R.M;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class j extends S.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    final int f36979a;

    /* renamed from: b, reason: collision with root package name */
    final M f36980b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(int i8, M m8) {
        this.f36979a = i8;
        this.f36980b = m8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, this.f36979a);
        S.c.p(parcel, 2, this.f36980b, i8, false);
        S.c.b(parcel, a8);
    }
}
