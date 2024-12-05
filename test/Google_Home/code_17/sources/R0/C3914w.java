package r0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r0.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3914w extends R.a {
    public static final Parcelable.Creator<C3914w> CREATOR = new M();

    /* renamed from: a, reason: collision with root package name */
    String f38559a;

    /* renamed from: b, reason: collision with root package name */
    String f38560b;

    /* renamed from: c, reason: collision with root package name */
    String f38561c;

    /* renamed from: d, reason: collision with root package name */
    String f38562d;

    /* renamed from: e, reason: collision with root package name */
    String f38563e;

    /* renamed from: f, reason: collision with root package name */
    String f38564f;

    /* renamed from: g, reason: collision with root package name */
    String f38565g;

    /* renamed from: h, reason: collision with root package name */
    String f38566h;

    /* renamed from: i, reason: collision with root package name */
    String f38567i;

    /* renamed from: j, reason: collision with root package name */
    boolean f38568j;

    /* renamed from: k, reason: collision with root package name */
    String f38569k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3914w(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z8, String str10) {
        this.f38559a = str;
        this.f38560b = str2;
        this.f38561c = str3;
        this.f38562d = str4;
        this.f38563e = str5;
        this.f38564f = str6;
        this.f38565g = str7;
        this.f38566h = str8;
        this.f38567i = str9;
        this.f38568j = z8;
        this.f38569k = str10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f38559a, false);
        R.c.q(parcel, 3, this.f38560b, false);
        R.c.q(parcel, 4, this.f38561c, false);
        R.c.q(parcel, 5, this.f38562d, false);
        R.c.q(parcel, 6, this.f38563e, false);
        R.c.q(parcel, 7, this.f38564f, false);
        R.c.q(parcel, 8, this.f38565g, false);
        R.c.q(parcel, 9, this.f38566h, false);
        R.c.q(parcel, 10, this.f38567i, false);
        R.c.c(parcel, 11, this.f38568j);
        R.c.q(parcel, 12, this.f38569k, false);
        R.c.b(parcel, a8);
    }
}
