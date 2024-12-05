package s0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: s0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3718h extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3718h> CREATOR = new W();

    /* renamed from: a, reason: collision with root package name */
    PendingIntent f37767a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3718h(PendingIntent pendingIntent) {
        this.f37767a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.p(parcel, 1, this.f37767a, i8, false);
        S.c.b(parcel, a8);
    }
}
