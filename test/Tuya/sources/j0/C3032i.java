package j0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3032i extends S.a {
    public static final Parcelable.Creator<C3032i> CREATOR = new C3033j();

    /* renamed from: a, reason: collision with root package name */
    final byte[] f32706a;

    public C3032i(byte[] bArr) {
        this.f32706a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        byte[] bArr = this.f32706a;
        int a8 = S.c.a(parcel);
        S.c.f(parcel, 1, bArr, false);
        S.c.b(parcel, a8);
    }
}
