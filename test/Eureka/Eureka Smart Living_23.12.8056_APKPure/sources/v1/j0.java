package v1;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q6 = w1.b.q(parcel);
        IBinder iBinder = null;
        s1.a aVar = null;
        int i6 = 0;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < q6) {
            int k6 = w1.b.k(parcel);
            int i7 = w1.b.i(k6);
            if (i7 == 1) {
                i6 = w1.b.m(parcel, k6);
            } else if (i7 == 2) {
                iBinder = w1.b.l(parcel, k6);
            } else if (i7 == 3) {
                aVar = (s1.a) w1.b.c(parcel, k6, s1.a.CREATOR);
            } else if (i7 == 4) {
                z5 = w1.b.j(parcel, k6);
            } else if (i7 != 5) {
                w1.b.p(parcel, k6);
            } else {
                z6 = w1.b.j(parcel, k6);
            }
        }
        w1.b.h(parcel, q6);
        return new i0(i6, iBinder, aVar, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new i0[i6];
    }
}
