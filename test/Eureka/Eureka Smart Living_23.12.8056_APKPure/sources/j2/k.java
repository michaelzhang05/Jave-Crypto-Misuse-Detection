package j2;

import android.os.Parcel;
import android.os.Parcelable;
import v1.g0;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q6 = w1.b.q(parcel);
        int i6 = 0;
        g0 g0Var = null;
        while (parcel.dataPosition() < q6) {
            int k6 = w1.b.k(parcel);
            int i7 = w1.b.i(k6);
            if (i7 == 1) {
                i6 = w1.b.m(parcel, k6);
            } else if (i7 != 2) {
                w1.b.p(parcel, k6);
            } else {
                g0Var = (g0) w1.b.c(parcel, k6, g0.CREATOR);
            }
        }
        w1.b.h(parcel, q6);
        return new j(i6, g0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new j[i6];
    }
}
