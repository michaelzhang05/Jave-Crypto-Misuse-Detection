package l0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3267b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            if (R.b.l(r8) != 1) {
                R.b.x(parcel, r8);
            } else {
                bundle = R.b.a(parcel, r8);
            }
        }
        R.b.k(parcel, y8);
        return new C3266a(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3266a[i8];
    }
}
