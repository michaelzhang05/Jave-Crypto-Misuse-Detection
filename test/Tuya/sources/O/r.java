package O;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            int l8 = S.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    if (l8 != 3) {
                        if (l8 != 4) {
                            S.b.x(parcel, r8);
                        } else {
                            str = S.b.f(parcel, r8);
                        }
                    } else {
                        pendingIntent = (PendingIntent) S.b.e(parcel, r8, PendingIntent.CREATOR);
                    }
                } else {
                    i9 = S.b.t(parcel, r8);
                }
            } else {
                i8 = S.b.t(parcel, r8);
            }
        }
        S.b.k(parcel, y8);
        return new C1258b(i8, i9, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C1258b[i8];
    }
}