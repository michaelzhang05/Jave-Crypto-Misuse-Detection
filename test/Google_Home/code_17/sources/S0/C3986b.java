package s0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3986b extends R.a {
    public static final Parcelable.Creator<C3986b> CREATOR = new C3987c();

    /* renamed from: a, reason: collision with root package name */
    String f39174a;

    /* renamed from: b, reason: collision with root package name */
    int f39175b;

    /* renamed from: c, reason: collision with root package name */
    boolean f39176c;

    /* renamed from: d, reason: collision with root package name */
    String f39177d;

    /* renamed from: e, reason: collision with root package name */
    String f39178e;

    /* renamed from: f, reason: collision with root package name */
    String f39179f;

    /* renamed from: g, reason: collision with root package name */
    String f39180g;

    /* renamed from: h, reason: collision with root package name */
    String f39181h;

    /* renamed from: i, reason: collision with root package name */
    String f39182i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3986b(String str, int i8, boolean z8, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f39174a = str;
        this.f39175b = i8;
        this.f39176c = z8;
        this.f39177d = str2;
        this.f39178e = str3;
        this.f39179f = str4;
        this.f39180g = str5;
        this.f39181h = str6;
        this.f39182i = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 1, this.f39174a, false);
        R.c.k(parcel, 2, this.f39175b);
        R.c.c(parcel, 3, this.f39176c);
        R.c.q(parcel, 4, this.f39177d, false);
        R.c.q(parcel, 5, this.f39178e, false);
        R.c.q(parcel, 6, this.f39179f, false);
        R.c.q(parcel, 7, this.f39180g, false);
        R.c.q(parcel, 8, this.f39181h, false);
        R.c.q(parcel, 9, this.f39182i, false);
        R.c.b(parcel, a8);
    }
}
