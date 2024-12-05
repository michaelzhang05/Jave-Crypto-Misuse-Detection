package com.google.android.gms.identity.intents.model;

import S.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public final class UserAddress extends S.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<UserAddress> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    String f15232a;

    /* renamed from: b, reason: collision with root package name */
    String f15233b;

    /* renamed from: c, reason: collision with root package name */
    String f15234c;

    /* renamed from: d, reason: collision with root package name */
    String f15235d;

    /* renamed from: e, reason: collision with root package name */
    String f15236e;

    /* renamed from: f, reason: collision with root package name */
    String f15237f;

    /* renamed from: g, reason: collision with root package name */
    String f15238g;

    /* renamed from: h, reason: collision with root package name */
    String f15239h;

    /* renamed from: i, reason: collision with root package name */
    String f15240i;

    /* renamed from: j, reason: collision with root package name */
    String f15241j;

    /* renamed from: k, reason: collision with root package name */
    String f15242k;

    /* renamed from: l, reason: collision with root package name */
    String f15243l;

    /* renamed from: m, reason: collision with root package name */
    boolean f15244m;

    /* renamed from: n, reason: collision with root package name */
    String f15245n;

    /* renamed from: o, reason: collision with root package name */
    String f15246o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z8, String str13, String str14) {
        this.f15232a = str;
        this.f15233b = str2;
        this.f15234c = str3;
        this.f15235d = str4;
        this.f15236e = str5;
        this.f15237f = str6;
        this.f15238g = str7;
        this.f15239h = str8;
        this.f15240i = str9;
        this.f15241j = str10;
        this.f15242k = str11;
        this.f15243l = str12;
        this.f15244m = z8;
        this.f15245n = str13;
        this.f15246o = str14;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = c.a(parcel);
        c.q(parcel, 2, this.f15232a, false);
        c.q(parcel, 3, this.f15233b, false);
        c.q(parcel, 4, this.f15234c, false);
        c.q(parcel, 5, this.f15235d, false);
        c.q(parcel, 6, this.f15236e, false);
        c.q(parcel, 7, this.f15237f, false);
        c.q(parcel, 8, this.f15238g, false);
        c.q(parcel, 9, this.f15239h, false);
        c.q(parcel, 10, this.f15240i, false);
        c.q(parcel, 11, this.f15241j, false);
        c.q(parcel, 12, this.f15242k, false);
        c.q(parcel, 13, this.f15243l, false);
        c.c(parcel, 14, this.f15244m);
        c.q(parcel, 15, this.f15245n, false);
        c.q(parcel, 16, this.f15246o, false);
        c.b(parcel, a8);
    }
}
