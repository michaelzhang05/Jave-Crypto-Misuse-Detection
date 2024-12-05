package v1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class l extends w1.a {
    public static final Parcelable.Creator<l> CREATOR = new f0();

    /* renamed from: a, reason: collision with root package name */
    private final int f9613a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9614b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9615c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9616d;

    /* renamed from: e, reason: collision with root package name */
    private final long f9617e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9618f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9619g;

    /* renamed from: h, reason: collision with root package name */
    private final int f9620h;

    /* renamed from: i, reason: collision with root package name */
    private final int f9621i;

    public l(int i6, int i7, int i8, long j6, long j7, String str, String str2, int i9, int i10) {
        this.f9613a = i6;
        this.f9614b = i7;
        this.f9615c = i8;
        this.f9616d = j6;
        this.f9617e = j7;
        this.f9618f = str;
        this.f9619g = str2;
        this.f9620h = i9;
        this.f9621i = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int a6 = w1.c.a(parcel);
        w1.c.f(parcel, 1, this.f9613a);
        w1.c.f(parcel, 2, this.f9614b);
        w1.c.f(parcel, 3, this.f9615c);
        w1.c.h(parcel, 4, this.f9616d);
        w1.c.h(parcel, 5, this.f9617e);
        w1.c.j(parcel, 6, this.f9618f, false);
        w1.c.j(parcel, 7, this.f9619g, false);
        w1.c.f(parcel, 8, this.f9620h);
        w1.c.f(parcel, 9, this.f9621i);
        w1.c.b(parcel, a6);
    }
}
