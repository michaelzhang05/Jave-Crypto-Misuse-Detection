package l0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3266a extends R.a {
    public static final Parcelable.Creator<C3266a> CREATOR = new C3267b();

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f34199a;

    public C3266a(Bundle bundle) {
        this.f34199a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.e(parcel, 1, this.f34199a, false);
        R.c.b(parcel, a8);
    }
}
