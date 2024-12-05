package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class p0 implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(o0 o0Var, Parcel parcel, int i6) {
        int a6 = w1.c.a(parcel);
        w1.c.d(parcel, 2, o0Var.f5943a, false);
        w1.c.b(parcel, a6);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o0 createFromParcel(Parcel parcel) {
        int q6 = w1.b.q(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < q6) {
            int k6 = w1.b.k(parcel);
            if (w1.b.i(k6) != 2) {
                w1.b.p(parcel, k6);
            } else {
                bundle = w1.b.a(parcel, k6);
            }
        }
        w1.b.h(parcel, q6);
        return new o0(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public o0[] newArray(int i6) {
        return new o0[i6];
    }
}
