package v0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: v0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3816f extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3816f> CREATOR = new p();

    /* renamed from: a, reason: collision with root package name */
    long f38623a;

    /* renamed from: b, reason: collision with root package name */
    long f38624b;

    public C3816f(long j8, long j9) {
        this.f38623a = j8;
        this.f38624b = j9;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.n(parcel, 2, this.f38623a);
        S.c.n(parcel, 3, this.f38624b);
        S.c.b(parcel, a8);
    }
}
