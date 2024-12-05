package Q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class r extends R.a {

    @NonNull
    public static final Parcelable.Creator<r> CREATOR = new a0();

    /* renamed from: a, reason: collision with root package name */
    private final int f9074a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9075b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9076c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9077d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9078e;

    public r(int i8, boolean z8, boolean z9, int i9, int i10) {
        this.f9074a = i8;
        this.f9075b = z8;
        this.f9076c = z9;
        this.f9077d = i9;
        this.f9078e = i10;
    }

    public int p() {
        return this.f9077d;
    }

    public int u() {
        return this.f9078e;
    }

    public boolean v() {
        return this.f9075b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.k(parcel, 1, z());
        R.c.c(parcel, 2, v());
        R.c.c(parcel, 3, y());
        R.c.k(parcel, 4, p());
        R.c.k(parcel, 5, u());
        R.c.b(parcel, a8);
    }

    public boolean y() {
        return this.f9076c;
    }

    public int z() {
        return this.f9074a;
    }
}
