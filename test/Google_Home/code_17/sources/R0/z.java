package r0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int y8 = R.b.y(parcel);
        C3895c c3895c = null;
        C3911t c3911t = null;
        ArrayList arrayList = null;
        C3904l c3904l = null;
        C3912u c3912u = null;
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = true;
        while (parcel.dataPosition() < y8) {
            int r8 = R.b.r(parcel);
            switch (R.b.l(r8)) {
                case 1:
                    z8 = R.b.m(parcel, r8);
                    break;
                case 2:
                    z9 = R.b.m(parcel, r8);
                    break;
                case 3:
                    c3895c = (C3895c) R.b.e(parcel, r8, C3895c.CREATOR);
                    break;
                case 4:
                    z10 = R.b.m(parcel, r8);
                    break;
                case 5:
                    c3911t = (C3911t) R.b.e(parcel, r8, C3911t.CREATOR);
                    break;
                case 6:
                    arrayList = R.b.d(parcel, r8);
                    break;
                case 7:
                    c3904l = (C3904l) R.b.e(parcel, r8, C3904l.CREATOR);
                    break;
                case 8:
                    c3912u = (C3912u) R.b.e(parcel, r8, C3912u.CREATOR);
                    break;
                case 9:
                    z11 = R.b.m(parcel, r8);
                    break;
                case 10:
                    str = R.b.f(parcel, r8);
                    break;
                case 11:
                    bundle = R.b.a(parcel, r8);
                    break;
                case 12:
                    bArr = R.b.b(parcel, r8);
                    break;
                default:
                    R.b.x(parcel, r8);
                    break;
            }
        }
        R.b.k(parcel, y8);
        return new C3902j(z8, z9, c3895c, z10, c3911t, arrayList, c3904l, c3912u, z11, str, bArr, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C3902j[i8];
    }
}
