package j0;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

/* renamed from: j0.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3037n implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        String[] strArr = null;
        int[] iArr = null;
        RemoteViews remoteViews = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            int l8 = S.b.l(r8);
            if (l8 != 1) {
                if (l8 != 2) {
                    if (l8 != 3) {
                        if (l8 != 4) {
                            S.b.x(parcel, r8);
                        } else {
                            bArr = S.b.b(parcel, r8);
                        }
                    } else {
                        remoteViews = (RemoteViews) S.b.e(parcel, r8, RemoteViews.CREATOR);
                    }
                } else {
                    iArr = S.b.c(parcel, r8);
                }
            } else {
                strArr = S.b.g(parcel, r8);
            }
        }
        S.b.k(parcel, y8);
        return new C3036m(strArr, iArr, remoteViews, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3036m[i8];
    }
}
