package r0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class K extends R.a {
    public static final Parcelable.Creator<K> CREATOR = new L();

    /* renamed from: a, reason: collision with root package name */
    String f38444a;

    /* renamed from: b, reason: collision with root package name */
    Bundle f38445b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public K(String str, Bundle bundle) {
        this.f38444a = str;
        this.f38445b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f38444a, false);
        R.c.e(parcel, 3, this.f38445b, false);
        R.c.b(parcel, a8);
    }
}
