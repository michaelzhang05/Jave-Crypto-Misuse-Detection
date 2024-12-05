package v1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class w0 extends w1.a {
    public static final Parcelable.Creator<w0> CREATOR = new x0();

    /* renamed from: a, reason: collision with root package name */
    Bundle f9655a;

    /* renamed from: b, reason: collision with root package name */
    s1.c[] f9656b;

    /* renamed from: c, reason: collision with root package name */
    int f9657c;

    /* renamed from: d, reason: collision with root package name */
    e f9658d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(Bundle bundle, s1.c[] cVarArr, int i6, e eVar) {
        this.f9655a = bundle;
        this.f9656b = cVarArr;
        this.f9657c = i6;
        this.f9658d = eVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int a6 = w1.c.a(parcel);
        w1.c.d(parcel, 1, this.f9655a, false);
        w1.c.l(parcel, 2, this.f9656b, i6, false);
        w1.c.f(parcel, 3, this.f9657c);
        w1.c.i(parcel, 4, this.f9658d, i6, false);
        w1.c.b(parcel, a6);
    }
}
