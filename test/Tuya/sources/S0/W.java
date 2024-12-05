package s0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class W implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            if (S.b.l(r8) != 1) {
                S.b.x(parcel, r8);
            } else {
                pendingIntent = (PendingIntent) S.b.e(parcel, r8, PendingIntent.CREATOR);
            }
        }
        S.b.k(parcel, y8);
        return new C3718h(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3718h[i8];
    }
}
