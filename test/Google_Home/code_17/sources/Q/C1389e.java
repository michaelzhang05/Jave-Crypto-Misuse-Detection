package Q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: Q.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1389e extends R.a {

    @NonNull
    public static final Parcelable.Creator<C1389e> CREATOR = new j0();

    /* renamed from: a, reason: collision with root package name */
    private final r f8996a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8997b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f8998c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f8999d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9000e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f9001f;

    public C1389e(r rVar, boolean z8, boolean z9, int[] iArr, int i8, int[] iArr2) {
        this.f8996a = rVar;
        this.f8997b = z8;
        this.f8998c = z9;
        this.f8999d = iArr;
        this.f9000e = i8;
        this.f9001f = iArr2;
    }

    public final r H() {
        return this.f8996a;
    }

    public int p() {
        return this.f9000e;
    }

    public int[] u() {
        return this.f8999d;
    }

    public int[] v() {
        return this.f9001f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.p(parcel, 1, this.f8996a, i8, false);
        R.c.c(parcel, 2, y());
        R.c.c(parcel, 3, z());
        R.c.l(parcel, 4, u(), false);
        R.c.k(parcel, 5, p());
        R.c.l(parcel, 6, v(), false);
        R.c.b(parcel, a8);
    }

    public boolean y() {
        return this.f8997b;
    }

    public boolean z() {
        return this.f8998c;
    }
}
