package s0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: s0.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3722l extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3722l> CREATOR = new C3705B();

    /* renamed from: a, reason: collision with root package name */
    int f37791a;

    /* renamed from: b, reason: collision with root package name */
    final Bundle f37792b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3722l(int i8, Bundle bundle) {
        new Bundle();
        this.f37791a = i8;
        this.f37792b = bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 2, this.f37791a);
        S.c.e(parcel, 3, this.f37792b, false);
        S.c.b(parcel, a8);
    }
}
