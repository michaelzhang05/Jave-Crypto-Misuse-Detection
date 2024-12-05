package v1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class x0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int q6 = w1.b.q(parcel);
        Bundle bundle = null;
        s1.c[] cVarArr = null;
        e eVar = null;
        int i6 = 0;
        while (parcel.dataPosition() < q6) {
            int k6 = w1.b.k(parcel);
            int i7 = w1.b.i(k6);
            if (i7 == 1) {
                bundle = w1.b.a(parcel, k6);
            } else if (i7 == 2) {
                cVarArr = (s1.c[]) w1.b.f(parcel, k6, s1.c.CREATOR);
            } else if (i7 == 3) {
                i6 = w1.b.m(parcel, k6);
            } else if (i7 != 4) {
                w1.b.p(parcel, k6);
            } else {
                eVar = (e) w1.b.c(parcel, k6, e.CREATOR);
            }
        }
        w1.b.h(parcel, q6);
        return new w0(bundle, cVarArr, i6, eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new w0[i6];
    }
}
