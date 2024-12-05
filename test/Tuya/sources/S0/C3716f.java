package s0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import v0.C3813c;
import v0.C3816f;

/* renamed from: s0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3716f extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3716f> CREATOR = new U();

    /* renamed from: a, reason: collision with root package name */
    String f37741a;

    /* renamed from: b, reason: collision with root package name */
    String f37742b;

    /* renamed from: c, reason: collision with root package name */
    String f37743c;

    /* renamed from: d, reason: collision with root package name */
    String f37744d;

    /* renamed from: e, reason: collision with root package name */
    String f37745e;

    /* renamed from: f, reason: collision with root package name */
    String f37746f;

    /* renamed from: g, reason: collision with root package name */
    String f37747g;

    /* renamed from: h, reason: collision with root package name */
    String f37748h;

    /* renamed from: i, reason: collision with root package name */
    String f37749i;

    /* renamed from: j, reason: collision with root package name */
    String f37750j;

    /* renamed from: k, reason: collision with root package name */
    int f37751k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList f37752l;

    /* renamed from: m, reason: collision with root package name */
    C3816f f37753m;

    /* renamed from: n, reason: collision with root package name */
    final ArrayList f37754n;

    /* renamed from: o, reason: collision with root package name */
    String f37755o;

    /* renamed from: p, reason: collision with root package name */
    String f37756p;

    /* renamed from: q, reason: collision with root package name */
    final ArrayList f37757q;

    /* renamed from: r, reason: collision with root package name */
    boolean f37758r;

    /* renamed from: s, reason: collision with root package name */
    final ArrayList f37759s;

    /* renamed from: t, reason: collision with root package name */
    final ArrayList f37760t;

    /* renamed from: u, reason: collision with root package name */
    final ArrayList f37761u;

    /* renamed from: v, reason: collision with root package name */
    C3813c f37762v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3716f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i8, ArrayList arrayList, C3816f c3816f, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z8, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, C3813c c3813c) {
        this.f37741a = str;
        this.f37742b = str2;
        this.f37743c = str3;
        this.f37744d = str4;
        this.f37745e = str5;
        this.f37746f = str6;
        this.f37747g = str7;
        this.f37748h = str8;
        this.f37749i = str9;
        this.f37750j = str10;
        this.f37751k = i8;
        this.f37752l = arrayList;
        this.f37753m = c3816f;
        this.f37754n = arrayList2;
        this.f37755o = str11;
        this.f37756p = str12;
        this.f37757q = arrayList3;
        this.f37758r = z8;
        this.f37759s = arrayList4;
        this.f37760t = arrayList5;
        this.f37761u = arrayList6;
        this.f37762v = c3813c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 2, this.f37741a, false);
        S.c.q(parcel, 3, this.f37742b, false);
        S.c.q(parcel, 4, this.f37743c, false);
        S.c.q(parcel, 5, this.f37744d, false);
        S.c.q(parcel, 6, this.f37745e, false);
        S.c.q(parcel, 7, this.f37746f, false);
        S.c.q(parcel, 8, this.f37747g, false);
        S.c.q(parcel, 9, this.f37748h, false);
        S.c.q(parcel, 10, this.f37749i, false);
        S.c.q(parcel, 11, this.f37750j, false);
        S.c.k(parcel, 12, this.f37751k);
        S.c.u(parcel, 13, this.f37752l, false);
        S.c.p(parcel, 14, this.f37753m, i8, false);
        S.c.u(parcel, 15, this.f37754n, false);
        S.c.q(parcel, 16, this.f37755o, false);
        S.c.q(parcel, 17, this.f37756p, false);
        S.c.u(parcel, 18, this.f37757q, false);
        S.c.c(parcel, 19, this.f37758r);
        S.c.u(parcel, 20, this.f37759s, false);
        S.c.u(parcel, 21, this.f37760t, false);
        S.c.u(parcel, 22, this.f37761u, false);
        S.c.p(parcel, 23, this.f37762v, i8, false);
        S.c.b(parcel, a8);
    }
}
