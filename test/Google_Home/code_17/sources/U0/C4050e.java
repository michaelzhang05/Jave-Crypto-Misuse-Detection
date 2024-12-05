package u0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: u0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4050e extends R.a {

    @NonNull
    public static final Parcelable.Creator<C4050e> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    String f39927a;

    /* renamed from: b, reason: collision with root package name */
    String f39928b;

    public C4050e(String str, String str2) {
        this.f39927a = str;
        this.f39928b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f39927a, false);
        R.c.q(parcel, 3, this.f39928b, false);
        R.c.b(parcel, a8);
    }
}
