package r0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class O implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        boolean z8 = false;
        ArrayList arrayList = null;
        int i8 = 0;
        boolean z9 = true;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            int l8 = R.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    if (l8 != 3) {
                        if (l8 != 4) {
                            R.b.x(parcel, r8);
                        } else {
                            i8 = R.b.t(parcel, r8);
                        }
                    } else {
                        z8 = R.b.m(parcel, r8);
                    }
                } else {
                    z9 = R.b.m(parcel, r8);
                }
            } else {
                arrayList = R.b.d(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new C3895c(arrayList, z9, z8, i8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3895c[i8];
    }
}
