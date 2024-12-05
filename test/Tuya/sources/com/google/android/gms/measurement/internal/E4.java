package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class E4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str8 = null;
        String str9 = null;
        String str10 = "";
        String str11 = str10;
        long j14 = -2147483648L;
        boolean z8 = true;
        boolean z9 = false;
        int i8 = 0;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = false;
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
                    str3 = S.b.f(parcel, r8);
                    break;
                case 5:
                    str4 = S.b.f(parcel, r8);
                    break;
                case 6:
                    j8 = S.b.u(parcel, r8);
                    break;
                case 7:
                    j9 = S.b.u(parcel, r8);
                    break;
                case 8:
                    str5 = S.b.f(parcel, r8);
                    break;
                case 9:
                    z8 = S.b.m(parcel, r8);
                    break;
                case 10:
                    z9 = S.b.m(parcel, r8);
                    break;
                case 11:
                    j14 = S.b.u(parcel, r8);
                    break;
                case 12:
                    str6 = S.b.f(parcel, r8);
                    break;
                case 13:
                    j10 = S.b.u(parcel, r8);
                    break;
                case 14:
                    j11 = S.b.u(parcel, r8);
                    break;
                case 15:
                    i8 = S.b.t(parcel, r8);
                    break;
                case 16:
                    z10 = S.b.m(parcel, r8);
                    break;
                case 17:
                case 20:
                default:
                    S.b.x(parcel, r8);
                    break;
                case 18:
                    z11 = S.b.m(parcel, r8);
                    break;
                case 19:
                    str7 = S.b.f(parcel, r8);
                    break;
                case 21:
                    bool = S.b.n(parcel, r8);
                    break;
                case 22:
                    j12 = S.b.u(parcel, r8);
                    break;
                case 23:
                    arrayList = S.b.h(parcel, r8);
                    break;
                case 24:
                    str8 = S.b.f(parcel, r8);
                    break;
                case 25:
                    str10 = S.b.f(parcel, r8);
                    break;
                case 26:
                    str11 = S.b.f(parcel, r8);
                    break;
                case 27:
                    str9 = S.b.f(parcel, r8);
                    break;
                case 28:
                    z12 = S.b.m(parcel, r8);
                    break;
                case 29:
                    j13 = S.b.u(parcel, r8);
                    break;
            }
        }
        S.b.k(parcel, y8);
        return new D4(str, str2, str3, str4, j8, j9, str5, z8, z9, j14, str6, j10, j11, i8, z10, z11, str7, bool, j12, arrayList, str8, str10, str11, str9, z12, j13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new D4[i8];
    }
}
