package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2275w implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(C2270v c2270v, Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 2, c2270v.f16884a, false);
        S.c.p(parcel, 3, c2270v.f16885b, i8, false);
        S.c.q(parcel, 4, c2270v.f16886c, false);
        S.c.n(parcel, 5, c2270v.f16887d);
        S.c.b(parcel, a8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        long j8 = 0;
        String str = null;
        C2260t c2260t = null;
        String str2 = null;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            int l8 = S.b.l(r8);
            if (l8 != 2) {
                if (l8 != 3) {
                    if (l8 != 4) {
                        if (l8 != 5) {
                            S.b.x(parcel, r8);
                        } else {
                            j8 = S.b.u(parcel, r8);
                        }
                    } else {
                        str2 = S.b.f(parcel, r8);
                    }
                } else {
                    c2260t = (C2260t) S.b.e(parcel, r8, C2260t.CREATOR);
                }
            } else {
                str = S.b.f(parcel, r8);
            }
        }
        S.b.k(parcel, y8);
        return new C2270v(str, c2260t, str2, j8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C2270v[i8];
    }
}
