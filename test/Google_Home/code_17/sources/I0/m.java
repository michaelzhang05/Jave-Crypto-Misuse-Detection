package i0;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

/* loaded from: classes3.dex */
public final class m extends R.a {
    public static final Parcelable.Creator<m> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    String[] f32851a;

    /* renamed from: b, reason: collision with root package name */
    int[] f32852b;

    /* renamed from: c, reason: collision with root package name */
    RemoteViews f32853c;

    /* renamed from: d, reason: collision with root package name */
    byte[] f32854d;

    public m(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.f32851a = strArr;
        this.f32852b = iArr;
        this.f32853c = remoteViews;
        this.f32854d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.r(parcel, 1, this.f32851a, false);
        R.c.l(parcel, 2, this.f32852b, false);
        R.c.p(parcel, 3, this.f32853c, i8, false);
        R.c.f(parcel, 4, this.f32854d, false);
        R.c.b(parcel, a8);
    }
}
