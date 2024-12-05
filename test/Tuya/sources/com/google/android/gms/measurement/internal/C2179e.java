package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2179e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        String str = null;
        String str2 = null;
        u4 u4Var = null;
        String str3 = null;
        C2270v c2270v = null;
        C2270v c2270v2 = null;
        C2270v c2270v3 = null;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        boolean z8 = false;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            switch (S.b.l(r8)) {
                case 2:
                    str = S.b.f(parcel, r8);
                    break;
                case 3:
                    str2 = S.b.f(parcel, r8);
                    break;
                case 4:
                    u4Var = (u4) S.b.e(parcel, r8, u4.CREATOR);
                    break;
                case 5:
                    j8 = S.b.u(parcel, r8);
                    break;
                case 6:
                    z8 = S.b.m(parcel, r8);
                    break;
                case 7:
                    str3 = S.b.f(parcel, r8);
                    break;
                case 8:
                    c2270v = (C2270v) S.b.e(parcel, r8, C2270v.CREATOR);
                    break;
                case 9:
                    j9 = S.b.u(parcel, r8);
                    break;
                case 10:
                    c2270v2 = (C2270v) S.b.e(parcel, r8, C2270v.CREATOR);
                    break;
                case 11:
                    j10 = S.b.u(parcel, r8);
                    break;
                case 12:
                    c2270v3 = (C2270v) S.b.e(parcel, r8, C2270v.CREATOR);
                    break;
                default:
                    S.b.x(parcel, r8);
                    break;
            }
        }
        S.b.k(parcel, y8);
        return new C2173d(str, str2, u4Var, j8, z8, str3, c2270v, j9, c2270v2, j10, c2270v3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C2173d[i8];
    }
}
