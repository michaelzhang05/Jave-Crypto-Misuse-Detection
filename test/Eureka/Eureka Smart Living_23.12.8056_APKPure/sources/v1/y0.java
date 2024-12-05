package v1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class y0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q6 = w1.b.q(parcel);
        p pVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z5 = false;
        boolean z6 = false;
        int i6 = 0;
        while (parcel.dataPosition() < q6) {
            int k6 = w1.b.k(parcel);
            switch (w1.b.i(k6)) {
                case 1:
                    pVar = (p) w1.b.c(parcel, k6, p.CREATOR);
                    break;
                case 2:
                    z5 = w1.b.j(parcel, k6);
                    break;
                case 3:
                    z6 = w1.b.j(parcel, k6);
                    break;
                case 4:
                    iArr = w1.b.b(parcel, k6);
                    break;
                case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    i6 = w1.b.m(parcel, k6);
                    break;
                case 6:
                    iArr2 = w1.b.b(parcel, k6);
                    break;
                default:
                    w1.b.p(parcel, k6);
                    break;
            }
        }
        w1.b.h(parcel, q6);
        return new e(pVar, z5, z6, iArr, i6, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new e[i6];
    }
}
