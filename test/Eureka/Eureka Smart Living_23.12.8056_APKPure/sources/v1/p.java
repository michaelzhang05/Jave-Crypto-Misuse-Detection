package v1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class p extends w1.a {
    public static final Parcelable.Creator<p> CREATOR = new p0();

    /* renamed from: a, reason: collision with root package name */
    private final int f9632a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9633b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9634c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9635d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9636e;

    public p(int i6, boolean z5, boolean z6, int i7, int i8) {
        this.f9632a = i6;
        this.f9633b = z5;
        this.f9634c = z6;
        this.f9635d = i7;
        this.f9636e = i8;
    }

    public int a() {
        return this.f9635d;
    }

    public int b() {
        return this.f9636e;
    }

    public boolean c() {
        return this.f9633b;
    }

    public boolean d() {
        return this.f9634c;
    }

    public int e() {
        return this.f9632a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int a6 = w1.c.a(parcel);
        w1.c.f(parcel, 1, e());
        w1.c.c(parcel, 2, c());
        w1.c.c(parcel, 3, d());
        w1.c.f(parcel, 4, a());
        w1.c.f(parcel, 5, b());
        w1.c.b(parcel, a6);
    }
}
