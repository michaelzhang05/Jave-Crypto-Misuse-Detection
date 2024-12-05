package N;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: N.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1253a extends S.a {

    @NonNull
    public static final Parcelable.Creator<C1253a> CREATOR = new C1256d();

    /* renamed from: a, reason: collision with root package name */
    Intent f7093a;

    public C1253a(Intent intent) {
        this.f7093a = intent;
    }

    public Intent s() {
        return this.f7093a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.p(parcel, 1, this.f7093a, i8, false);
        S.c.b(parcel, a8);
    }
}
