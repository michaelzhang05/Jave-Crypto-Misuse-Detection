package u0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class h extends R.a {

    @NonNull
    public static final Parcelable.Creator<h> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    String f39933a;

    /* renamed from: b, reason: collision with root package name */
    String f39934b;

    /* renamed from: c, reason: collision with root package name */
    C4051f f39935c;

    /* renamed from: d, reason: collision with root package name */
    C4052g f39936d;

    /* renamed from: e, reason: collision with root package name */
    C4052g f39937e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(String str, String str2, C4051f c4051f, C4052g c4052g, C4052g c4052g2) {
        this.f39933a = str;
        this.f39934b = str2;
        this.f39935c = c4051f;
        this.f39936d = c4052g;
        this.f39937e = c4052g2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f39933a, false);
        R.c.q(parcel, 3, this.f39934b, false);
        R.c.p(parcel, 4, this.f39935c, i8, false);
        R.c.p(parcel, 5, this.f39936d, i8, false);
        R.c.p(parcel, 6, this.f39937e, i8, false);
        R.c.b(parcel, a8);
    }
}
