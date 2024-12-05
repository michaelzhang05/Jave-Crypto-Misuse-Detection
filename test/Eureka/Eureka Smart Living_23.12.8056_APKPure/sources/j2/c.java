package j2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q6 = w1.b.q(parcel);
        int i6 = 0;
        Intent intent = null;
        int i7 = 0;
        while (parcel.dataPosition() < q6) {
            int k6 = w1.b.k(parcel);
            int i8 = w1.b.i(k6);
            if (i8 == 1) {
                i6 = w1.b.m(parcel, k6);
            } else if (i8 == 2) {
                i7 = w1.b.m(parcel, k6);
            } else if (i8 != 3) {
                w1.b.p(parcel, k6);
            } else {
                intent = (Intent) w1.b.c(parcel, k6, Intent.CREATOR);
            }
        }
        w1.b.h(parcel, q6);
        return new b(i6, i7, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new b[i6];
    }
}
