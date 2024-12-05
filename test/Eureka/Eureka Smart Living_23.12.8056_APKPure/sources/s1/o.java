package s1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q6 = w1.b.q(parcel);
        String str = null;
        int i6 = 0;
        long j6 = -1;
        while (parcel.dataPosition() < q6) {
            int k6 = w1.b.k(parcel);
            int i7 = w1.b.i(k6);
            if (i7 == 1) {
                str = w1.b.d(parcel, k6);
            } else if (i7 == 2) {
                i6 = w1.b.m(parcel, k6);
            } else if (i7 != 3) {
                w1.b.p(parcel, k6);
            } else {
                j6 = w1.b.n(parcel, k6);
            }
        }
        w1.b.h(parcel, q6);
        return new c(str, i6, j6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new c[i6];
    }
}
