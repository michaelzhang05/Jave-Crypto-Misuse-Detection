package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class v4 implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(u4 u4Var, Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, u4Var.f16877a);
        S.c.q(parcel, 2, u4Var.f16878b, false);
        S.c.n(parcel, 3, u4Var.f16879c);
        S.c.o(parcel, 4, u4Var.f16880d, false);
        S.c.i(parcel, 5, null, false);
        S.c.q(parcel, 6, u4Var.f16881e, false);
        S.c.q(parcel, 7, u4Var.f16882f, false);
        S.c.h(parcel, 8, u4Var.f16883g, false);
        S.c.b(parcel, a8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        String str = null;
        Long l8 = null;
        Float f8 = null;
        String str2 = null;
        String str3 = null;
        Double d8 = null;
        long j8 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            switch (S.b.l(r8)) {
                case 1:
                    i8 = S.b.t(parcel, r8);
                    break;
                case 2:
                    str = S.b.f(parcel, r8);
                    break;
                case 3:
                    j8 = S.b.u(parcel, r8);
                    break;
                case 4:
                    l8 = S.b.v(parcel, r8);
                    break;
                case 5:
                    f8 = S.b.q(parcel, r8);
                    break;
                case 6:
                    str2 = S.b.f(parcel, r8);
                    break;
                case 7:
                    str3 = S.b.f(parcel, r8);
                    break;
                case 8:
                    d8 = S.b.p(parcel, r8);
                    break;
                default:
                    S.b.x(parcel, r8);
                    break;
            }
        }
        S.b.k(parcel, y8);
        return new u4(i8, str, j8, l8, f8, str2, str3, d8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new u4[i8];
    }
}
