package r0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: r0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3896d extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3896d> CREATOR = new Q();

    /* renamed from: a, reason: collision with root package name */
    private String f38466a;

    /* renamed from: b, reason: collision with root package name */
    private String f38467b;

    /* renamed from: c, reason: collision with root package name */
    private int f38468c;

    public C3896d(String str, String str2, int i8) {
        this.f38466a = str;
        this.f38467b = str2;
        this.f38468c = i8;
    }

    public int p() {
        int i8 = this.f38468c;
        if (i8 != 1 && i8 != 2 && i8 != 3) {
            return 0;
        }
        return i8;
    }

    public String u() {
        return this.f38467b;
    }

    public String v() {
        return this.f38466a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 2, v(), false);
        R.c.q(parcel, 3, u(), false);
        R.c.k(parcel, 4, p());
        R.c.b(parcel, a8);
    }
}
