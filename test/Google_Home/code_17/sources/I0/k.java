package i0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class k extends R.a {
    public static final Parcelable.Creator<k> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    final PendingIntent f32850a;

    public k(PendingIntent pendingIntent) {
        this.f32850a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.p(parcel, 1, this.f32850a, i8, false);
        R.c.b(parcel, a8);
    }
}
