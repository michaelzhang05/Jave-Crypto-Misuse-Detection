package v0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: v0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3817g extends S.a {

    @NonNull
    public static final Parcelable.Creator<C3817g> CREATOR = new q();

    /* renamed from: a, reason: collision with root package name */
    String f38625a;

    /* renamed from: b, reason: collision with root package name */
    String f38626b;

    public C3817g(String str, String str2) {
        this.f38625a = str;
        this.f38626b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 2, this.f38625a, false);
        S.c.q(parcel, 3, this.f38626b, false);
        S.c.b(parcel, a8);
    }
}
