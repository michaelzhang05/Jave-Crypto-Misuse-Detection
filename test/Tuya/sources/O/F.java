package O;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class F implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            switch (S.b.l(r8)) {
                case 1:
                    str = S.b.f(parcel, r8);
                    break;
                case 2:
                    z8 = S.b.m(parcel, r8);
                    break;
                case 3:
                    z9 = S.b.m(parcel, r8);
                    break;
                case 4:
                    iBinder = S.b.s(parcel, r8);
                    break;
                case 5:
                    z10 = S.b.m(parcel, r8);
                    break;
                case 6:
                    z11 = S.b.m(parcel, r8);
                    break;
                default:
                    S.b.x(parcel, r8);
                    break;
            }
        }
        S.b.k(parcel, y8);
        return new E(str, z8, z9, iBinder, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new E[i8];
    }
}