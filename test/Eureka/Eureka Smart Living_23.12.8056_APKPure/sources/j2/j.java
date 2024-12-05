package j2;

import android.os.Parcel;
import android.os.Parcelable;
import v1.g0;

/* loaded from: classes.dex */
public final class j extends w1.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    final int f7084a;

    /* renamed from: b, reason: collision with root package name */
    final g0 f7085b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(int i6, g0 g0Var) {
        this.f7084a = i6;
        this.f7085b = g0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int a6 = w1.c.a(parcel);
        w1.c.f(parcel, 1, this.f7084a);
        w1.c.i(parcel, 2, this.f7085b, i6, false);
        w1.c.b(parcel, a6);
    }
}
