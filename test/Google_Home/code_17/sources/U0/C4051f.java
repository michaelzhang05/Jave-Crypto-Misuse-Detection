package u0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: u0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4051f extends R.a {

    @NonNull
    public static final Parcelable.Creator<C4051f> CREATOR = new p();

    /* renamed from: a, reason: collision with root package name */
    long f39929a;

    /* renamed from: b, reason: collision with root package name */
    long f39930b;

    public C4051f(long j8, long j9) {
        this.f39929a = j8;
        this.f39930b = j9;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.n(parcel, 2, this.f39929a);
        R.c.n(parcel, 3, this.f39930b);
        R.c.b(parcel, a8);
    }
}
