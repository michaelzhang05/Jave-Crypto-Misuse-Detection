package r1;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q6 = w1.b.q(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < q6) {
            int k6 = w1.b.k(parcel);
            if (w1.b.i(k6) != 1) {
                w1.b.p(parcel, k6);
            } else {
                intent = (Intent) w1.b.c(parcel, k6, Intent.CREATOR);
            }
        }
        w1.b.h(parcel, q6);
        return new a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i6) {
        return new a[i6];
    }
}
