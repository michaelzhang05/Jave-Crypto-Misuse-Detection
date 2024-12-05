package u0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: u0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4049d extends R.a {

    @NonNull
    public static final Parcelable.Creator<C4049d> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    int f39921a;

    /* renamed from: b, reason: collision with root package name */
    String f39922b;

    /* renamed from: c, reason: collision with root package name */
    double f39923c;

    /* renamed from: d, reason: collision with root package name */
    String f39924d;

    /* renamed from: e, reason: collision with root package name */
    long f39925e;

    /* renamed from: f, reason: collision with root package name */
    int f39926f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4049d(int i8, String str, double d8, String str2, long j8, int i9) {
        this.f39921a = i8;
        this.f39922b = str;
        this.f39923c = d8;
        this.f39924d = str2;
        this.f39925e = j8;
        this.f39926f = i9;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.k(parcel, 2, this.f39921a);
        R.c.q(parcel, 3, this.f39922b, false);
        R.c.g(parcel, 4, this.f39923c);
        R.c.q(parcel, 5, this.f39924d, false);
        R.c.n(parcel, 6, this.f39925e);
        R.c.k(parcel, 7, this.f39926f);
        R.c.b(parcel, a8);
    }
}
