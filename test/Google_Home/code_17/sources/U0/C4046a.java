package u0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4046a extends R.a {

    @NonNull
    public static final Parcelable.Creator<C4046a> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    String f39913a;

    /* renamed from: b, reason: collision with root package name */
    String f39914b;

    public C4046a(String str, String str2) {
        this.f39913a = str;
        this.f39914b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f39913a, false);
        R.c.q(parcel, 3, this.f39914b, false);
        R.c.b(parcel, a8);
    }
}
