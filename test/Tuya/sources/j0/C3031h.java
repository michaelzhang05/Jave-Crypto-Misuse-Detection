package j0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3031h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            if (S.b.l(r8) != 2) {
                S.b.x(parcel, r8);
            } else {
                bArr = S.b.b(parcel, r8);
            }
        }
        S.b.k(parcel, y8);
        return new C3030g(bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3030g[i8];
    }
}
