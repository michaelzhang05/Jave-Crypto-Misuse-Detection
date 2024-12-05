package com.google.android.gms.wallet;

import S.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import s0.C3714d;
import s0.C3716f;
import s0.C3717g;
import s0.C3732w;

/* loaded from: classes3.dex */
public final class MaskedWallet extends S.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    String f16970a;

    /* renamed from: b, reason: collision with root package name */
    String f16971b;

    /* renamed from: c, reason: collision with root package name */
    String[] f16972c;

    /* renamed from: d, reason: collision with root package name */
    String f16973d;

    /* renamed from: e, reason: collision with root package name */
    C3732w f16974e;

    /* renamed from: f, reason: collision with root package name */
    C3732w f16975f;

    /* renamed from: g, reason: collision with root package name */
    C3716f[] f16976g;

    /* renamed from: h, reason: collision with root package name */
    C3717g[] f16977h;

    /* renamed from: i, reason: collision with root package name */
    UserAddress f16978i;

    /* renamed from: j, reason: collision with root package name */
    UserAddress f16979j;

    /* renamed from: k, reason: collision with root package name */
    C3714d[] f16980k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MaskedWallet(String str, String str2, String[] strArr, String str3, C3732w c3732w, C3732w c3732w2, C3716f[] c3716fArr, C3717g[] c3717gArr, UserAddress userAddress, UserAddress userAddress2, C3714d[] c3714dArr) {
        this.f16970a = str;
        this.f16971b = str2;
        this.f16972c = strArr;
        this.f16973d = str3;
        this.f16974e = c3732w;
        this.f16975f = c3732w2;
        this.f16976g = c3716fArr;
        this.f16977h = c3717gArr;
        this.f16978i = userAddress;
        this.f16979j = userAddress2;
        this.f16980k = c3714dArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = c.a(parcel);
        c.q(parcel, 2, this.f16970a, false);
        c.q(parcel, 3, this.f16971b, false);
        c.r(parcel, 4, this.f16972c, false);
        c.q(parcel, 5, this.f16973d, false);
        c.p(parcel, 6, this.f16974e, i8, false);
        c.p(parcel, 7, this.f16975f, i8, false);
        c.t(parcel, 8, this.f16976g, i8, false);
        c.t(parcel, 9, this.f16977h, i8, false);
        c.p(parcel, 10, this.f16978i, i8, false);
        c.p(parcel, 11, this.f16979j, i8, false);
        c.t(parcel, 12, this.f16980k, i8, false);
        c.b(parcel, a8);
    }
}
