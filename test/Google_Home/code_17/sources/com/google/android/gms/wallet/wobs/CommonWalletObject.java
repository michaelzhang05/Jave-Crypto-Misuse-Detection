package com.google.android.gms.wallet.wobs;

import R.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import u0.C4051f;

@KeepName
/* loaded from: classes3.dex */
public class CommonWalletObject extends R.a {

    @NonNull
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    String f18026a;

    /* renamed from: b, reason: collision with root package name */
    String f18027b;

    /* renamed from: c, reason: collision with root package name */
    String f18028c;

    /* renamed from: d, reason: collision with root package name */
    String f18029d;

    /* renamed from: e, reason: collision with root package name */
    String f18030e;

    /* renamed from: f, reason: collision with root package name */
    String f18031f;

    /* renamed from: g, reason: collision with root package name */
    String f18032g;

    /* renamed from: h, reason: collision with root package name */
    String f18033h;

    /* renamed from: i, reason: collision with root package name */
    int f18034i;

    /* renamed from: j, reason: collision with root package name */
    final ArrayList f18035j;

    /* renamed from: k, reason: collision with root package name */
    C4051f f18036k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList f18037l;

    /* renamed from: m, reason: collision with root package name */
    String f18038m;

    /* renamed from: n, reason: collision with root package name */
    String f18039n;

    /* renamed from: o, reason: collision with root package name */
    final ArrayList f18040o;

    /* renamed from: p, reason: collision with root package name */
    boolean f18041p;

    /* renamed from: q, reason: collision with root package name */
    final ArrayList f18042q;

    /* renamed from: r, reason: collision with root package name */
    final ArrayList f18043r;

    /* renamed from: s, reason: collision with root package name */
    final ArrayList f18044s;

    CommonWalletObject() {
        this.f18035j = V.b.c();
        this.f18037l = V.b.c();
        this.f18040o = V.b.c();
        this.f18042q = V.b.c();
        this.f18043r = V.b.c();
        this.f18044s = V.b.c();
    }

    public static a p() {
        return new a(new CommonWalletObject(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = c.a(parcel);
        c.q(parcel, 2, this.f18026a, false);
        c.q(parcel, 3, this.f18027b, false);
        c.q(parcel, 4, this.f18028c, false);
        c.q(parcel, 5, this.f18029d, false);
        c.q(parcel, 6, this.f18030e, false);
        c.q(parcel, 7, this.f18031f, false);
        c.q(parcel, 8, this.f18032g, false);
        c.q(parcel, 9, this.f18033h, false);
        c.k(parcel, 10, this.f18034i);
        c.u(parcel, 11, this.f18035j, false);
        c.p(parcel, 12, this.f18036k, i8, false);
        c.u(parcel, 13, this.f18037l, false);
        c.q(parcel, 14, this.f18038m, false);
        c.q(parcel, 15, this.f18039n, false);
        c.u(parcel, 16, this.f18040o, false);
        c.c(parcel, 17, this.f18041p);
        c.u(parcel, 18, this.f18042q, false);
        c.u(parcel, 19, this.f18043r, false);
        c.u(parcel, 20, this.f18044s, false);
        c.b(parcel, a8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i8, ArrayList arrayList, C4051f c4051f, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z8, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.f18026a = str;
        this.f18027b = str2;
        this.f18028c = str3;
        this.f18029d = str4;
        this.f18030e = str5;
        this.f18031f = str6;
        this.f18032g = str7;
        this.f18033h = str8;
        this.f18034i = i8;
        this.f18035j = arrayList;
        this.f18036k = c4051f;
        this.f18037l = arrayList2;
        this.f18038m = str9;
        this.f18039n = str10;
        this.f18040o = arrayList3;
        this.f18041p = z8;
        this.f18042q = arrayList4;
        this.f18043r = arrayList5;
        this.f18044s = arrayList6;
    }
}
