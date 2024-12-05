package v1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q6 = w1.b.q(parcel);
        int i6 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i7 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < q6) {
            int k6 = w1.b.k(parcel);
            int i9 = w1.b.i(k6);
            if (i9 == 1) {
                i6 = w1.b.m(parcel, k6);
            } else if (i9 == 2) {
                z5 = w1.b.j(parcel, k6);
            } else if (i9 == 3) {
                z6 = w1.b.j(parcel, k6);
            } else if (i9 == 4) {
                i7 = w1.b.m(parcel, k6);
            } else if (i9 != 5) {
                w1.b.p(parcel, k6);
            } else {
                i8 = w1.b.m(parcel, k6);
            }
        }
        w1.b.h(parcel, q6);
        return new p(i6, z5, z6, i7, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new p[i6];
    }
}
