package s0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s0.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3732w extends S.a {
    public static final Parcelable.Creator<C3732w> CREATOR = new M();

    /* renamed from: a, reason: collision with root package name */
    String f37824a;

    /* renamed from: b, reason: collision with root package name */
    String f37825b;

    /* renamed from: c, reason: collision with root package name */
    String f37826c;

    /* renamed from: d, reason: collision with root package name */
    String f37827d;

    /* renamed from: e, reason: collision with root package name */
    String f37828e;

    /* renamed from: f, reason: collision with root package name */
    String f37829f;

    /* renamed from: g, reason: collision with root package name */
    String f37830g;

    /* renamed from: h, reason: collision with root package name */
    String f37831h;

    /* renamed from: i, reason: collision with root package name */
    String f37832i;

    /* renamed from: j, reason: collision with root package name */
    boolean f37833j;

    /* renamed from: k, reason: collision with root package name */
    String f37834k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3732w(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z8, String str10) {
        this.f37824a = str;
        this.f37825b = str2;
        this.f37826c = str3;
        this.f37827d = str4;
        this.f37828e = str5;
        this.f37829f = str6;
        this.f37830g = str7;
        this.f37831h = str8;
        this.f37832i = str9;
        this.f37833j = z8;
        this.f37834k = str10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 2, this.f37824a, false);
        S.c.q(parcel, 3, this.f37825b, false);
        S.c.q(parcel, 4, this.f37826c, false);
        S.c.q(parcel, 5, this.f37827d, false);
        S.c.q(parcel, 6, this.f37828e, false);
        S.c.q(parcel, 7, this.f37829f, false);
        S.c.q(parcel, 8, this.f37830g, false);
        S.c.q(parcel, 9, this.f37831h, false);
        S.c.q(parcel, 10, this.f37832i, false);
        S.c.c(parcel, 11, this.f37833j);
        S.c.q(parcel, 12, this.f37834k, false);
        S.c.b(parcel, a8);
    }
}
