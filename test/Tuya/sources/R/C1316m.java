package R;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: R.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1316m extends S.a {

    @NonNull
    public static final Parcelable.Creator<C1316m> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    private final int f8581a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8582b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8583c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8584d;

    /* renamed from: e, reason: collision with root package name */
    private final long f8585e;

    /* renamed from: f, reason: collision with root package name */
    private final String f8586f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8587g;

    /* renamed from: h, reason: collision with root package name */
    private final int f8588h;

    /* renamed from: i, reason: collision with root package name */
    private final int f8589i;

    public C1316m(int i8, int i9, int i10, long j8, long j9, String str, String str2, int i11, int i12) {
        this.f8581a = i8;
        this.f8582b = i9;
        this.f8583c = i10;
        this.f8584d = j8;
        this.f8585e = j9;
        this.f8586f = str;
        this.f8587g = str2;
        this.f8588h = i11;
        this.f8589i = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f8581a;
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, i9);
        S.c.k(parcel, 2, this.f8582b);
        S.c.k(parcel, 3, this.f8583c);
        S.c.n(parcel, 4, this.f8584d);
        S.c.n(parcel, 5, this.f8585e);
        S.c.q(parcel, 6, this.f8586f, false);
        S.c.q(parcel, 7, this.f8587g, false);
        S.c.k(parcel, 8, this.f8588h);
        S.c.k(parcel, 9, this.f8589i);
        S.c.b(parcel, a8);
    }
}
