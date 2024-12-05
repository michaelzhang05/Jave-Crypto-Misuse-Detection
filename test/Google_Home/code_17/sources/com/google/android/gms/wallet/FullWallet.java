package com.google.android.gms.wallet;

import R.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import r0.C3892E;
import r0.C3896d;
import r0.C3903k;
import r0.C3914w;

/* loaded from: classes3.dex */
public final class FullWallet extends R.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<FullWallet> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    String f17992a;

    /* renamed from: b, reason: collision with root package name */
    String f17993b;

    /* renamed from: c, reason: collision with root package name */
    C3892E f17994c;

    /* renamed from: d, reason: collision with root package name */
    String f17995d;

    /* renamed from: e, reason: collision with root package name */
    C3914w f17996e;

    /* renamed from: f, reason: collision with root package name */
    C3914w f17997f;

    /* renamed from: g, reason: collision with root package name */
    String[] f17998g;

    /* renamed from: h, reason: collision with root package name */
    UserAddress f17999h;

    /* renamed from: i, reason: collision with root package name */
    UserAddress f18000i;

    /* renamed from: j, reason: collision with root package name */
    C3896d[] f18001j;

    /* renamed from: k, reason: collision with root package name */
    C3903k f18002k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullWallet(String str, String str2, C3892E c3892e, String str3, C3914w c3914w, C3914w c3914w2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, C3896d[] c3896dArr, C3903k c3903k) {
        this.f17992a = str;
        this.f17993b = str2;
        this.f17994c = c3892e;
        this.f17995d = str3;
        this.f17996e = c3914w;
        this.f17997f = c3914w2;
        this.f17998g = strArr;
        this.f17999h = userAddress;
        this.f18000i = userAddress2;
        this.f18001j = c3896dArr;
        this.f18002k = c3903k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = c.a(parcel);
        c.q(parcel, 2, this.f17992a, false);
        c.q(parcel, 3, this.f17993b, false);
        c.p(parcel, 4, this.f17994c, i8, false);
        c.q(parcel, 5, this.f17995d, false);
        c.p(parcel, 6, this.f17996e, i8, false);
        c.p(parcel, 7, this.f17997f, i8, false);
        c.r(parcel, 8, this.f17998g, false);
        c.p(parcel, 9, this.f17999h, i8, false);
        c.p(parcel, 10, this.f18000i, i8, false);
        c.t(parcel, 11, this.f18001j, i8, false);
        c.p(parcel, 12, this.f18002k, i8, false);
        c.b(parcel, a8);
    }
}
