package s0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: s0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3714d extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3714d> CREATOR = new Q();

    /* renamed from: a, reason: collision with root package name */
    private String f37731a;

    /* renamed from: b, reason: collision with root package name */
    private String f37732b;

    /* renamed from: c, reason: collision with root package name */
    private int f37733c;

    public C3714d(String str, String str2, int i8) {
        this.f37731a = str;
        this.f37732b = str2;
        this.f37733c = i8;
    }

    public int s() {
        int i8 = this.f37733c;
        if (i8 != 1 && i8 != 2 && i8 != 3) {
            return 0;
        }
        return i8;
    }

    public String u() {
        return this.f37732b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 2, z(), false);
        S.c.q(parcel, 3, u(), false);
        S.c.k(parcel, 4, s());
        S.c.b(parcel, a8);
    }

    public String z() {
        return this.f37731a;
    }
}
