package s0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: s0.G, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3710G implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            if (S.b.l(r8) != 1) {
                S.b.x(parcel, r8);
            } else {
                arrayList = S.b.h(parcel, r8);
            }
        }
        S.b.k(parcel, y8);
        return new C3729t(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3729t[i8];
    }
}
