package j0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3030g extends S.a {
    public static final Parcelable.Creator<C3030g> CREATOR = new C3031h();

    /* renamed from: a, reason: collision with root package name */
    final byte[] f32705a;

    public C3030g(byte[] bArr) {
        this.f32705a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        byte[] bArr = this.f32705a;
        int a8 = S.c.a(parcel);
        S.c.f(parcel, 2, bArr, false);
        S.c.b(parcel, a8);
    }
}
