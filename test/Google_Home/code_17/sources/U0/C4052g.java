package u0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: u0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4052g extends R.a {

    @NonNull
    public static final Parcelable.Creator<C4052g> CREATOR = new q();

    /* renamed from: a, reason: collision with root package name */
    String f39931a;

    /* renamed from: b, reason: collision with root package name */
    String f39932b;

    public C4052g(String str, String str2) {
        this.f39931a = str;
        this.f39932b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f39931a, false);
        R.c.q(parcel, 3, this.f39932b, false);
        R.c.b(parcel, a8);
    }
}
