package p0;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3593c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        Intent intent = null;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            int l8 = S.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    if (l8 != 3) {
                        S.b.x(parcel, r8);
                    } else {
                        intent = (Intent) S.b.e(parcel, r8, Intent.CREATOR);
                    }
                } else {
                    i9 = S.b.t(parcel, r8);
                }
            } else {
                i8 = S.b.t(parcel, r8);
            }
        }
        S.b.k(parcel, y8);
        return new C3592b(i8, i9, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3592b[i8];
    }
}
