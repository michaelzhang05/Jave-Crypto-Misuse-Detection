package v0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: v0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3814d extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3814d> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    int f38615a;

    /* renamed from: b, reason: collision with root package name */
    String f38616b;

    /* renamed from: c, reason: collision with root package name */
    double f38617c;

    /* renamed from: d, reason: collision with root package name */
    String f38618d;

    /* renamed from: e, reason: collision with root package name */
    long f38619e;

    /* renamed from: f, reason: collision with root package name */
    int f38620f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3814d(int i8, String str, double d8, String str2, long j8, int i9) {
        this.f38615a = i8;
        this.f38616b = str;
        this.f38617c = d8;
        this.f38618d = str2;
        this.f38619e = j8;
        this.f38620f = i9;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 2, this.f38615a);
        S.c.q(parcel, 3, this.f38616b, false);
        S.c.g(parcel, 4, this.f38617c);
        S.c.q(parcel, 5, this.f38618d, false);
        S.c.n(parcel, 6, this.f38619e);
        S.c.k(parcel, 7, this.f38620f);
        S.c.b(parcel, a8);
    }
}
