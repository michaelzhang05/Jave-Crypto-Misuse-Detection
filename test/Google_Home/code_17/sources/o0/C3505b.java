package o0;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3505b extends R.a implements O.j {
    public static final Parcelable.Creator<C3505b> CREATOR = new C3506c();

    /* renamed from: a, reason: collision with root package name */
    final int f35784a;

    /* renamed from: b, reason: collision with root package name */
    private int f35785b;

    /* renamed from: c, reason: collision with root package name */
    private Intent f35786c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3505b(int i8, int i9, Intent intent) {
        this.f35784a = i8;
        this.f35785b = i9;
        this.f35786c = intent;
    }

    @Override // O.j
    public final Status getStatus() {
        if (this.f35785b == 0) {
            return Status.f15889f;
        }
        return Status.f15893j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f35784a;
        int a8 = R.c.a(parcel);
        R.c.k(parcel, 1, i9);
        R.c.k(parcel, 2, this.f35785b);
        R.c.p(parcel, 3, this.f35786c, i8, false);
        R.c.b(parcel, a8);
    }
}
