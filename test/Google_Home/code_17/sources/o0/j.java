package o0;

import Q.M;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class j extends R.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    final int f35789a;

    /* renamed from: b, reason: collision with root package name */
    final M f35790b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(int i8, M m8) {
        this.f35789a = i8;
        this.f35790b = m8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.k(parcel, 1, this.f35789a);
        R.c.p(parcel, 2, this.f35790b, i8, false);
        R.c.b(parcel, a8);
    }
}
