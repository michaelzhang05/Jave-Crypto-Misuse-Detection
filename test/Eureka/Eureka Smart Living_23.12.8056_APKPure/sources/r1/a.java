package r1;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends w1.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    Intent f9055a;

    public a(Intent intent) {
        this.f9055a = intent;
    }

    public Intent a() {
        return this.f9055a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        int a6 = w1.c.a(parcel);
        w1.c.i(parcel, 1, this.f9055a, i6, false);
        w1.c.b(parcel, a6);
    }
}
