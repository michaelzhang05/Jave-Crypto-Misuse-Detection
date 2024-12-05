package u0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4048c extends R.a {

    @NonNull
    public static final Parcelable.Creator<C4048c> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    String f39918a;

    /* renamed from: b, reason: collision with root package name */
    C4049d f39919b;

    /* renamed from: c, reason: collision with root package name */
    C4051f f39920c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4048c(String str, C4049d c4049d, C4051f c4051f) {
        this.f39918a = str;
        this.f39919b = c4049d;
        this.f39920c = c4051f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f39918a, false);
        R.c.p(parcel, 3, this.f39919b, i8, false);
        R.c.p(parcel, 5, this.f39920c, i8, false);
        R.c.b(parcel, a8);
    }
}
