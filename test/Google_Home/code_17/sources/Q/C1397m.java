package Q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: Q.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1397m extends R.a {

    @NonNull
    public static final Parcelable.Creator<C1397m> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    private final int f9043a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9044b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9045c;

    /* renamed from: d, reason: collision with root package name */
    private final long f9046d;

    /* renamed from: e, reason: collision with root package name */
    private final long f9047e;

    /* renamed from: f, reason: collision with root package name */
    private final String f9048f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9049g;

    /* renamed from: h, reason: collision with root package name */
    private final int f9050h;

    /* renamed from: i, reason: collision with root package name */
    private final int f9051i;

    public C1397m(int i8, int i9, int i10, long j8, long j9, String str, String str2, int i11, int i12) {
        this.f9043a = i8;
        this.f9044b = i9;
        this.f9045c = i10;
        this.f9046d = j8;
        this.f9047e = j9;
        this.f9048f = str;
        this.f9049g = str2;
        this.f9050h = i11;
        this.f9051i = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f9043a;
        int a8 = R.c.a(parcel);
        R.c.k(parcel, 1, i9);
        R.c.k(parcel, 2, this.f9044b);
        R.c.k(parcel, 3, this.f9045c);
        R.c.n(parcel, 4, this.f9046d);
        R.c.n(parcel, 5, this.f9047e);
        R.c.q(parcel, 6, this.f9048f, false);
        R.c.q(parcel, 7, this.f9049g, false);
        R.c.k(parcel, 8, this.f9050h);
        R.c.k(parcel, 9, this.f9051i);
        R.c.b(parcel, a8);
    }
}
