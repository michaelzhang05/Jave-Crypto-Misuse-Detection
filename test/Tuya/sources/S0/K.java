package s0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class K extends S.a {
    public static final Parcelable.Creator<K> CREATOR = new L();

    /* renamed from: a, reason: collision with root package name */
    String f37709a;

    /* renamed from: b, reason: collision with root package name */
    Bundle f37710b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K(String str, Bundle bundle) {
        this.f37709a = str;
        this.f37710b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 2, this.f37709a, false);
        S.c.e(parcel, 3, this.f37710b, false);
        S.c.b(parcel, a8);
    }
}
