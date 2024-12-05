package s1;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q6 = w1.b.q(parcel);
        int i6 = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i7 = 0;
        while (parcel.dataPosition() < q6) {
            int k6 = w1.b.k(parcel);
            int i8 = w1.b.i(k6);
            if (i8 == 1) {
                i6 = w1.b.m(parcel, k6);
            } else if (i8 == 2) {
                i7 = w1.b.m(parcel, k6);
            } else if (i8 == 3) {
                pendingIntent = (PendingIntent) w1.b.c(parcel, k6, PendingIntent.CREATOR);
            } else if (i8 != 4) {
                w1.b.p(parcel, k6);
            } else {
                str = w1.b.d(parcel, k6);
            }
        }
        w1.b.h(parcel, q6);
        return new a(i6, i7, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new a[i6];
    }
}
