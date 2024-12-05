package i0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class i extends R.a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    final byte[] f32849a;

    public i(byte[] bArr) {
        this.f32849a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        byte[] bArr = this.f32849a;
        int a8 = R.c.a(parcel);
        R.c.f(parcel, 1, bArr, false);
        R.c.b(parcel, a8);
    }
}
