package N;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: N.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1256d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            if (S.b.l(r8) != 1) {
                S.b.x(parcel, r8);
            } else {
                intent = (Intent) S.b.e(parcel, r8, Intent.CREATOR);
            }
        }
        S.b.k(parcel, y8);
        return new C1253a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i8) {
        return new C1253a[i8];
    }
}
