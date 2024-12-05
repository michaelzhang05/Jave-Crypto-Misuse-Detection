package r0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: r0.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3912u extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3912u> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    int f38543a;

    /* renamed from: b, reason: collision with root package name */
    String f38544b;

    /* renamed from: c, reason: collision with root package name */
    String f38545c;

    public C3912u(int i8, String str, String str2) {
        this.f38543a = i8;
        this.f38544b = str;
        this.f38545c = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.k(parcel, 1, this.f38543a);
        R.c.q(parcel, 2, this.f38544b, false);
        R.c.q(parcel, 3, this.f38545c, false);
        R.c.b(parcel, a8);
    }
}
