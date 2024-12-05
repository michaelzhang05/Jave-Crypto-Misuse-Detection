package j2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b extends w1.a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    final int f7079a;

    /* renamed from: b, reason: collision with root package name */
    private int f7080b;

    /* renamed from: c, reason: collision with root package name */
    private Intent f7081c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i6, int i7, Intent intent) {
        this.f7079a = i6;
        this.f7080b = i7;
        this.f7081c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int a6 = w1.c.a(parcel);
        w1.c.f(parcel, 1, this.f7079a);
        w1.c.f(parcel, 2, this.f7080b);
        w1.c.i(parcel, 3, this.f7081c, i6, false);
        w1.c.b(parcel, a6);
    }
}
