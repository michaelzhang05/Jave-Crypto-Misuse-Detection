package r0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: r0.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3903k extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3903k> CREATOR = new C3888A();

    /* renamed from: a, reason: collision with root package name */
    int f38524a;

    /* renamed from: b, reason: collision with root package name */
    String f38525b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3903k(int i8, String str) {
        this.f38524a = i8;
        this.f38525b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.k(parcel, 2, this.f38524a);
        R.c.q(parcel, 3, this.f38525b, false);
        R.c.b(parcel, a8);
    }
}
