package R;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: R.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1308e extends S.a {

    @NonNull
    public static final Parcelable.Creator<C1308e> CREATOR = new j0();

    /* renamed from: a, reason: collision with root package name */
    private final r f8534a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8535b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f8536c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f8537d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8538e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f8539f;

    public C1308e(r rVar, boolean z8, boolean z9, int[] iArr, int i8, int[] iArr2) {
        this.f8534a = rVar;
        this.f8535b = z8;
        this.f8536c = z9;
        this.f8537d = iArr;
        this.f8538e = i8;
        this.f8539f = iArr2;
    }

    public boolean G() {
        return this.f8535b;
    }

    public boolean I() {
        return this.f8536c;
    }

    public final r L() {
        return this.f8534a;
    }

    public int s() {
        return this.f8538e;
    }

    public int[] u() {
        return this.f8537d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.p(parcel, 1, this.f8534a, i8, false);
        S.c.c(parcel, 2, G());
        S.c.c(parcel, 3, I());
        S.c.l(parcel, 4, u(), false);
        S.c.k(parcel, 5, s());
        S.c.l(parcel, 6, z(), false);
        S.c.b(parcel, a8);
    }

    public int[] z() {
        return this.f8539f;
    }
}
