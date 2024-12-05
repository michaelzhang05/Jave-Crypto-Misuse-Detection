package r0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: r0.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3904l extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3904l> CREATOR = new C3889B();

    /* renamed from: a, reason: collision with root package name */
    int f38526a;

    /* renamed from: b, reason: collision with root package name */
    final Bundle f38527b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3904l(int i8, Bundle bundle) {
        new Bundle();
        this.f38526a = i8;
        this.f38527b = bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.k(parcel, 2, this.f38526a);
        R.c.e(parcel, 3, this.f38527b, false);
        R.c.b(parcel, a8);
    }
}
