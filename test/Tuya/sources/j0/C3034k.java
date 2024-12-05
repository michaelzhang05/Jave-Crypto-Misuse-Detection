package j0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j0.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3034k extends S.a {
    public static final Parcelable.Creator<C3034k> CREATOR = new C3035l();

    /* renamed from: a, reason: collision with root package name */
    final PendingIntent f32707a;

    public C3034k(PendingIntent pendingIntent) {
        this.f32707a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.p(parcel, 1, this.f32707a, i8, false);
        S.c.b(parcel, a8);
    }
}
