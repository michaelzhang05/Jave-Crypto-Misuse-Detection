package i0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class g extends R.a {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    final byte[] f32848a;

    public g(byte[] bArr) {
        this.f32848a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        byte[] bArr = this.f32848a;
        int a8 = R.c.a(parcel);
        R.c.f(parcel, 2, bArr, false);
        R.c.b(parcel, a8);
    }
}
