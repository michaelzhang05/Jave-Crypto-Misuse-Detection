package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.measurement.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2084r0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        long j8 = 0;
        long j9 = 0;
        boolean z8 = false;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            switch (S.b.l(r8)) {
                case 1:
                    j8 = S.b.u(parcel, r8);
                    break;
                case 2:
                    j9 = S.b.u(parcel, r8);
                    break;
                case 3:
                    z8 = S.b.m(parcel, r8);
                    break;
                case 4:
                    str = S.b.f(parcel, r8);
                    break;
                case 5:
                    str2 = S.b.f(parcel, r8);
                    break;
                case 6:
                    str3 = S.b.f(parcel, r8);
                    break;
                case 7:
                    bundle = S.b.a(parcel, r8);
                    break;
                case 8:
                    str4 = S.b.f(parcel, r8);
                    break;
                default:
                    S.b.x(parcel, r8);
                    break;
            }
        }
        S.b.k(parcel, y8);
        return new C2077q0(j8, j9, z8, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C2077q0[i8];
    }
}
