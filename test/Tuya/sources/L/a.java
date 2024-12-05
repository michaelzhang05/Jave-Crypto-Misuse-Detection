package L;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class a extends S.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    final int f6015a;

    /* renamed from: b, reason: collision with root package name */
    private int f6016b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f6017c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i8, int i9, Bundle bundle) {
        this.f6015a = i8;
        this.f6016b = i9;
        this.f6017c = bundle;
    }

    public int s() {
        return this.f6016b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.k(parcel, 1, this.f6015a);
        S.c.k(parcel, 2, s());
        S.c.e(parcel, 3, this.f6017c, false);
        S.c.b(parcel, a8);
    }
}
