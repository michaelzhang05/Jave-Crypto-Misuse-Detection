package com.google.android.gms.wallet;

import R.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import r0.C3896d;
import r0.C3898f;
import r0.C3899g;
import r0.C3914w;

/* loaded from: classes3.dex */
public final class MaskedWallet extends R.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    String f18003a;

    /* renamed from: b, reason: collision with root package name */
    String f18004b;

    /* renamed from: c, reason: collision with root package name */
    String[] f18005c;

    /* renamed from: d, reason: collision with root package name */
    String f18006d;

    /* renamed from: e, reason: collision with root package name */
    C3914w f18007e;

    /* renamed from: f, reason: collision with root package name */
    C3914w f18008f;

    /* renamed from: g, reason: collision with root package name */
    C3898f[] f18009g;

    /* renamed from: h, reason: collision with root package name */
    C3899g[] f18010h;

    /* renamed from: i, reason: collision with root package name */
    UserAddress f18011i;

    /* renamed from: j, reason: collision with root package name */
    UserAddress f18012j;

    /* renamed from: k, reason: collision with root package name */
    C3896d[] f18013k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MaskedWallet(String str, String str2, String[] strArr, String str3, C3914w c3914w, C3914w c3914w2, C3898f[] c3898fArr, C3899g[] c3899gArr, UserAddress userAddress, UserAddress userAddress2, C3896d[] c3896dArr) {
        this.f18003a = str;
        this.f18004b = str2;
        this.f18005c = strArr;
        this.f18006d = str3;
        this.f18007e = c3914w;
        this.f18008f = c3914w2;
        this.f18009g = c3898fArr;
        this.f18010h = c3899gArr;
        this.f18011i = userAddress;
        this.f18012j = userAddress2;
        this.f18013k = c3896dArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = c.a(parcel);
        c.q(parcel, 2, this.f18003a, false);
        c.q(parcel, 3, this.f18004b, false);
        c.r(parcel, 4, this.f18005c, false);
        c.q(parcel, 5, this.f18006d, false);
        c.p(parcel, 6, this.f18007e, i8, false);
        c.p(parcel, 7, this.f18008f, i8, false);
        c.t(parcel, 8, this.f18009g, i8, false);
        c.t(parcel, 9, this.f18010h, i8, false);
        c.p(parcel, 10, this.f18011i, i8, false);
        c.p(parcel, 11, this.f18012j, i8, false);
        c.t(parcel, 12, this.f18013k, i8, false);
        c.b(parcel, a8);
    }
}
