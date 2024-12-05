package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class P implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(O o8, Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.e(parcel, 2, o8.f17342a, false);
        S.c.b(parcel, a8);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public O createFromParcel(Parcel parcel) {
        int y8 = S.b.y(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < y8) {
            int r8 = S.b.r(parcel);
            if (S.b.l(r8) != 2) {
                S.b.x(parcel, r8);
            } else {
                bundle = S.b.a(parcel, r8);
            }
        }
        S.b.k(parcel, y8);
        return new O(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public O[] newArray(int i8) {
        return new O[i8];
    }
}
