package com.google.android.gms.identity.intents.model;

import R.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public final class UserAddress extends R.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<UserAddress> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    String f16033a;

    /* renamed from: b, reason: collision with root package name */
    String f16034b;

    /* renamed from: c, reason: collision with root package name */
    String f16035c;

    /* renamed from: d, reason: collision with root package name */
    String f16036d;

    /* renamed from: e, reason: collision with root package name */
    String f16037e;

    /* renamed from: f, reason: collision with root package name */
    String f16038f;

    /* renamed from: g, reason: collision with root package name */
    String f16039g;

    /* renamed from: h, reason: collision with root package name */
    String f16040h;

    /* renamed from: i, reason: collision with root package name */
    String f16041i;

    /* renamed from: j, reason: collision with root package name */
    String f16042j;

    /* renamed from: k, reason: collision with root package name */
    String f16043k;

    /* renamed from: l, reason: collision with root package name */
    String f16044l;

    /* renamed from: m, reason: collision with root package name */
    boolean f16045m;

    /* renamed from: n, reason: collision with root package name */
    String f16046n;

    /* renamed from: o, reason: collision with root package name */
    String f16047o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z8, String str13, String str14) {
        this.f16033a = str;
        this.f16034b = str2;
        this.f16035c = str3;
        this.f16036d = str4;
        this.f16037e = str5;
        this.f16038f = str6;
        this.f16039g = str7;
        this.f16040h = str8;
        this.f16041i = str9;
        this.f16042j = str10;
        this.f16043k = str11;
        this.f16044l = str12;
        this.f16045m = z8;
        this.f16046n = str13;
        this.f16047o = str14;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = c.a(parcel);
        c.q(parcel, 2, this.f16033a, false);
        c.q(parcel, 3, this.f16034b, false);
        c.q(parcel, 4, this.f16035c, false);
        c.q(parcel, 5, this.f16036d, false);
        c.q(parcel, 6, this.f16037e, false);
        c.q(parcel, 7, this.f16038f, false);
        c.q(parcel, 8, this.f16039g, false);
        c.q(parcel, 9, this.f16040h, false);
        c.q(parcel, 10, this.f16041i, false);
        c.q(parcel, 11, this.f16042j, false);
        c.q(parcel, 12, this.f16043k, false);
        c.q(parcel, 13, this.f16044l, false);
        c.c(parcel, 14, this.f16045m);
        c.q(parcel, 15, this.f16046n, false);
        c.q(parcel, 16, this.f16047o, false);
        c.b(parcel, a8);
    }
}
