package r0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import u0.C4048c;
import u0.C4051f;

/* renamed from: r0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3898f extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3898f> CREATOR = new U();

    /* renamed from: a, reason: collision with root package name */
    String f38476a;

    /* renamed from: b, reason: collision with root package name */
    String f38477b;

    /* renamed from: c, reason: collision with root package name */
    String f38478c;

    /* renamed from: d, reason: collision with root package name */
    String f38479d;

    /* renamed from: e, reason: collision with root package name */
    String f38480e;

    /* renamed from: f, reason: collision with root package name */
    String f38481f;

    /* renamed from: g, reason: collision with root package name */
    String f38482g;

    /* renamed from: h, reason: collision with root package name */
    String f38483h;

    /* renamed from: i, reason: collision with root package name */
    String f38484i;

    /* renamed from: j, reason: collision with root package name */
    String f38485j;

    /* renamed from: k, reason: collision with root package name */
    int f38486k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList f38487l;

    /* renamed from: m, reason: collision with root package name */
    C4051f f38488m;

    /* renamed from: n, reason: collision with root package name */
    final ArrayList f38489n;

    /* renamed from: o, reason: collision with root package name */
    String f38490o;

    /* renamed from: p, reason: collision with root package name */
    String f38491p;

    /* renamed from: q, reason: collision with root package name */
    final ArrayList f38492q;

    /* renamed from: r, reason: collision with root package name */
    boolean f38493r;

    /* renamed from: s, reason: collision with root package name */
    final ArrayList f38494s;

    /* renamed from: t, reason: collision with root package name */
    final ArrayList f38495t;

    /* renamed from: u, reason: collision with root package name */
    final ArrayList f38496u;

    /* renamed from: v, reason: collision with root package name */
    C4048c f38497v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3898f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i8, ArrayList arrayList, C4051f c4051f, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z8, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, C4048c c4048c) {
        this.f38476a = str;
        this.f38477b = str2;
        this.f38478c = str3;
        this.f38479d = str4;
        this.f38480e = str5;
        this.f38481f = str6;
        this.f38482g = str7;
        this.f38483h = str8;
        this.f38484i = str9;
        this.f38485j = str10;
        this.f38486k = i8;
        this.f38487l = arrayList;
        this.f38488m = c4051f;
        this.f38489n = arrayList2;
        this.f38490o = str11;
        this.f38491p = str12;
        this.f38492q = arrayList3;
        this.f38493r = z8;
        this.f38494s = arrayList4;
        this.f38495t = arrayList5;
        this.f38496u = arrayList6;
        this.f38497v = c4048c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f38476a, false);
        R.c.q(parcel, 3, this.f38477b, false);
        R.c.q(parcel, 4, this.f38478c, false);
        R.c.q(parcel, 5, this.f38479d, false);
        R.c.q(parcel, 6, this.f38480e, false);
        R.c.q(parcel, 7, this.f38481f, false);
        R.c.q(parcel, 8, this.f38482g, false);
        R.c.q(parcel, 9, this.f38483h, false);
        R.c.q(parcel, 10, this.f38484i, false);
        R.c.q(parcel, 11, this.f38485j, false);
        R.c.k(parcel, 12, this.f38486k);
        R.c.u(parcel, 13, this.f38487l, false);
        R.c.p(parcel, 14, this.f38488m, i8, false);
        R.c.u(parcel, 15, this.f38489n, false);
        R.c.q(parcel, 16, this.f38490o, false);
        R.c.q(parcel, 17, this.f38491p, false);
        R.c.u(parcel, 18, this.f38492q, false);
        R.c.c(parcel, 19, this.f38493r);
        R.c.u(parcel, 20, this.f38494s, false);
        R.c.u(parcel, 21, this.f38495t, false);
        R.c.u(parcel, 22, this.f38496u, false);
        R.c.p(parcel, 23, this.f38497v, i8, false);
        R.c.b(parcel, a8);
    }
}
