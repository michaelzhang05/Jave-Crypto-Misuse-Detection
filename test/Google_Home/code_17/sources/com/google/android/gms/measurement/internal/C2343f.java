package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2343f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        String str = null;
        String str2 = null;
        V5 v52 = null;
        String str3 = null;
        G g8 = null;
        G g9 = null;
        G g10 = null;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        boolean z8 = false;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            switch (R.b.l(r8)) {
                case 2:
                    str = R.b.f(parcel, r8);
                    break;
                case 3:
                    str2 = R.b.f(parcel, r8);
                    break;
                case 4:
                    v52 = (V5) R.b.e(parcel, r8, V5.CREATOR);
                    break;
                case 5:
                    j8 = R.b.u(parcel, r8);
                    break;
                case 6:
                    z8 = R.b.m(parcel, r8);
                    break;
                case 7:
                    str3 = R.b.f(parcel, r8);
                    break;
                case 8:
                    g8 = (G) R.b.e(parcel, r8, G.CREATOR);
                    break;
                case 9:
                    j9 = R.b.u(parcel, r8);
                    break;
                case 10:
                    g9 = (G) R.b.e(parcel, r8, G.CREATOR);
                    break;
                case 11:
                    j10 = R.b.u(parcel, r8);
                    break;
                case 12:
                    g10 = (G) R.b.e(parcel, r8, G.CREATOR);
                    break;
                default:
                    R.b.x(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new C2350g(str, str2, v52, j8, z8, str3, g8, j9, g9, j10, g10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C2350g[i8];
    }
}
