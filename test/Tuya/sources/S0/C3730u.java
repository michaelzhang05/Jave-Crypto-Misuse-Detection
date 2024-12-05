package s0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: s0.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3730u extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3730u> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    int f37808a;

    /* renamed from: b, reason: collision with root package name */
    String f37809b;

    /* renamed from: c, reason: collision with root package name */
    String f37810c;

    public C3730u(int i8, String str, String str2) {
        this.f37808a = i8;
        this.f37809b = str;
        this.f37810c = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, this.f37808a);
        S.c.q(parcel, 2, this.f37809b, false);
        S.c.q(parcel, 3, this.f37810c, false);
        S.c.b(parcel, a8);
    }
}
