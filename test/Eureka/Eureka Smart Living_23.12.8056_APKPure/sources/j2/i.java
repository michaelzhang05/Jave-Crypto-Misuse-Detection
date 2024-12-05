package j2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q6 = w1.b.q(parcel);
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < q6) {
            int k6 = w1.b.k(parcel);
            int i6 = w1.b.i(k6);
            if (i6 == 1) {
                arrayList = w1.b.e(parcel, k6);
            } else if (i6 != 2) {
                w1.b.p(parcel, k6);
            } else {
                str = w1.b.d(parcel, k6);
            }
        }
        w1.b.h(parcel, q6);
        return new h(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new h[i6];
    }
}
