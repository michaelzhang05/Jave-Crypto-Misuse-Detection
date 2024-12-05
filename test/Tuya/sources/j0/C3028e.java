package j0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: j0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3028e extends S.a {
    public static final Parcelable.Creator<C3028e> CREATOR = new C3029f();

    /* renamed from: a, reason: collision with root package name */
    final byte[] f32704a;

    public C3028e(byte[] bArr) {
        this.f32704a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        byte[] bArr = this.f32704a;
        int a8 = S.c.a(parcel);
        S.c.f(parcel, 2, bArr, false);
        S.c.b(parcel, a8);
    }
}
