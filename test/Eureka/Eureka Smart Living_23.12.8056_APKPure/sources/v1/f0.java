package v1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q6 = w1.b.q(parcel);
        long j6 = 0;
        long j7 = 0;
        String str = null;
        String str2 = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = -1;
        while (parcel.dataPosition() < q6) {
            int k6 = w1.b.k(parcel);
            switch (w1.b.i(k6)) {
                case 1:
                    i6 = w1.b.m(parcel, k6);
                    break;
                case 2:
                    i7 = w1.b.m(parcel, k6);
                    break;
                case 3:
                    i8 = w1.b.m(parcel, k6);
                    break;
                case 4:
                    j6 = w1.b.n(parcel, k6);
                    break;
                case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    j7 = w1.b.n(parcel, k6);
                    break;
                case 6:
                    str = w1.b.d(parcel, k6);
                    break;
                case 7:
                    str2 = w1.b.d(parcel, k6);
                    break;
                case 8:
                    i9 = w1.b.m(parcel, k6);
                    break;
                case 9:
                    i10 = w1.b.m(parcel, k6);
                    break;
                default:
                    w1.b.p(parcel, k6);
                    break;
            }
        }
        w1.b.h(parcel, q6);
        return new l(i6, i7, i8, j6, j7, str, str2, i9, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new l[i6];
    }
}
