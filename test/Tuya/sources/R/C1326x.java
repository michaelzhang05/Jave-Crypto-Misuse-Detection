package R;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: R.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1326x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        ArrayList arrayList = null;
        int i8 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            int l8 = S.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    S.b.x(parcel, r8);
                } else {
                    arrayList = S.b.j(parcel, r8, C1316m.CREATOR);
                }
            } else {
                i8 = S.b.t(parcel, r8);
            }
        }
        S.b.k(parcel, y8);
        return new C1322t(i8, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1322t[i8];
    }
}
