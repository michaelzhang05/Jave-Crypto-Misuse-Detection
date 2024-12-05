package K;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class a extends R.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    final int f4960a;

    /* renamed from: b, reason: collision with root package name */
    private int f4961b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f4962c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i8, int i9, Bundle bundle) {
        this.f4960a = i8;
        this.f4961b = i9;
        this.f4962c = bundle;
    }

    public int p() {
        return this.f4961b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.k(parcel, 1, this.f4960a);
        R.c.k(parcel, 2, p());
        R.c.e(parcel, 3, this.f4962c, false);
        R.c.b(parcel, a8);
    }
}
