package R;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class r extends S.a {

    @NonNull
    public static final Parcelable.Creator<r> CREATOR = new a0();

    /* renamed from: a, reason: collision with root package name */
    private final int f8612a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8613b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f8614c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8615d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8616e;

    public r(int i8, boolean z8, boolean z9, int i9, int i10) {
        this.f8612a = i8;
        this.f8613b = z8;
        this.f8614c = z9;
        this.f8615d = i9;
        this.f8616e = i10;
    }

    public boolean G() {
        return this.f8614c;
    }

    public int I() {
        return this.f8612a;
    }

    public int s() {
        return this.f8615d;
    }

    public int u() {
        return this.f8616e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, I());
        S.c.c(parcel, 2, z());
        S.c.c(parcel, 3, G());
        S.c.k(parcel, 4, s());
        S.c.k(parcel, 5, u());
        S.c.b(parcel, a8);
    }

    public boolean z() {
        return this.f8613b;
    }
}
