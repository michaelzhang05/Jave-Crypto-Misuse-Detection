package v1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class e extends w1.a {
    public static final Parcelable.Creator<e> CREATOR = new y0();

    /* renamed from: a, reason: collision with root package name */
    private final p f9558a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9559b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9560c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f9561d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9562e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f9563f;

    public e(p pVar, boolean z5, boolean z6, int[] iArr, int i6, int[] iArr2) {
        this.f9558a = pVar;
        this.f9559b = z5;
        this.f9560c = z6;
        this.f9561d = iArr;
        this.f9562e = i6;
        this.f9563f = iArr2;
    }

    public int a() {
        return this.f9562e;
    }

    public int[] b() {
        return this.f9561d;
    }

    public int[] c() {
        return this.f9563f;
    }

    public boolean d() {
        return this.f9559b;
    }

    public boolean e() {
        return this.f9560c;
    }

    public final p f() {
        return this.f9558a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int a6 = w1.c.a(parcel);
        w1.c.i(parcel, 1, this.f9558a, i6, false);
        w1.c.c(parcel, 2, d());
        w1.c.c(parcel, 3, e());
        w1.c.g(parcel, 4, b(), false);
        w1.c.f(parcel, 5, a());
        w1.c.g(parcel, 6, c(), false);
        w1.c.b(parcel, a6);
    }
}
