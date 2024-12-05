package j2;

import android.os.Parcel;
import android.os.Parcelable;
import v1.i0;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q6 = w1.b.q(parcel);
        int i6 = 0;
        s1.a aVar = null;
        i0 i0Var = null;
        while (parcel.dataPosition() < q6) {
            int k6 = w1.b.k(parcel);
            int i7 = w1.b.i(k6);
            if (i7 == 1) {
                i6 = w1.b.m(parcel, k6);
            } else if (i7 == 2) {
                aVar = (s1.a) w1.b.c(parcel, k6, s1.a.CREATOR);
            } else if (i7 != 3) {
                w1.b.p(parcel, k6);
            } else {
                i0Var = (i0) w1.b.c(parcel, k6, i0.CREATOR);
            }
        }
        w1.b.h(parcel, q6);
        return new l(i6, aVar, i0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new l[i6];
    }
}
