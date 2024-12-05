package com.google.android.gms.wallet.wobs;

import S.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import v0.C3816f;

@KeepName
/* loaded from: classes3.dex */
public class CommonWalletObject extends S.a {

    @NonNull
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    String f16993a;

    /* renamed from: b, reason: collision with root package name */
    String f16994b;

    /* renamed from: c, reason: collision with root package name */
    String f16995c;

    /* renamed from: d, reason: collision with root package name */
    String f16996d;

    /* renamed from: e, reason: collision with root package name */
    String f16997e;

    /* renamed from: f, reason: collision with root package name */
    String f16998f;

    /* renamed from: g, reason: collision with root package name */
    String f16999g;

    /* renamed from: h, reason: collision with root package name */
    String f17000h;

    /* renamed from: i, reason: collision with root package name */
    int f17001i;

    /* renamed from: j, reason: collision with root package name */
    final ArrayList f17002j;

    /* renamed from: k, reason: collision with root package name */
    C3816f f17003k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList f17004l;

    /* renamed from: m, reason: collision with root package name */
    String f17005m;

    /* renamed from: n, reason: collision with root package name */
    String f17006n;

    /* renamed from: o, reason: collision with root package name */
    final ArrayList f17007o;

    /* renamed from: p, reason: collision with root package name */
    boolean f17008p;

    /* renamed from: q, reason: collision with root package name */
    final ArrayList f17009q;

    /* renamed from: r, reason: collision with root package name */
    final ArrayList f17010r;

    /* renamed from: s, reason: collision with root package name */
    final ArrayList f17011s;

    CommonWalletObject() {
        this.f17002j = W.b.c();
        this.f17004l = W.b.c();
        this.f17007o = W.b.c();
        this.f17009q = W.b.c();
        this.f17010r = W.b.c();
        this.f17011s = W.b.c();
    }

    public static a s() {
        return new a(new CommonWalletObject(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = c.a(parcel);
        c.q(parcel, 2, this.f16993a, false);
        c.q(parcel, 3, this.f16994b, false);
        c.q(parcel, 4, this.f16995c, false);
        c.q(parcel, 5, this.f16996d, false);
        c.q(parcel, 6, this.f16997e, false);
        c.q(parcel, 7, this.f16998f, false);
        c.q(parcel, 8, this.f16999g, false);
        c.q(parcel, 9, this.f17000h, false);
        c.k(parcel, 10, this.f17001i);
        c.u(parcel, 11, this.f17002j, false);
        c.p(parcel, 12, this.f17003k, i8, false);
        c.u(parcel, 13, this.f17004l, false);
        c.q(parcel, 14, this.f17005m, false);
        c.q(parcel, 15, this.f17006n, false);
        c.u(parcel, 16, this.f17007o, false);
        c.c(parcel, 17, this.f17008p);
        c.u(parcel, 18, this.f17009q, false);
        c.u(parcel, 19, this.f17010r, false);
        c.u(parcel, 20, this.f17011s, false);
        c.b(parcel, a8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i8, ArrayList arrayList, C3816f c3816f, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z8, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.f16993a = str;
        this.f16994b = str2;
        this.f16995c = str3;
        this.f16996d = str4;
        this.f16997e = str5;
        this.f16998f = str6;
        this.f16999g = str7;
        this.f17000h = str8;
        this.f17001i = i8;
        this.f17002j = arrayList;
        this.f17003k = c3816f;
        this.f17004l = arrayList2;
        this.f17005m = str9;
        this.f17006n = str10;
        this.f17007o = arrayList3;
        this.f17008p = z8;
        this.f17009q = arrayList4;
        this.f17010r = arrayList5;
        this.f17011s = arrayList6;
    }
}
