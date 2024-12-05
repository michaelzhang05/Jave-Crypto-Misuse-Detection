package r0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: r0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3900h extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3900h> CREATOR = new W();

    /* renamed from: a, reason: collision with root package name */
    PendingIntent f38502a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3900h(PendingIntent pendingIntent) {
        this.f38502a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.p(parcel, 1, this.f38502a, i8, false);
        R.c.b(parcel, a8);
    }
}
