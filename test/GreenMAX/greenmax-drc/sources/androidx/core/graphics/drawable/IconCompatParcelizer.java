package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f927b = versionedParcel.p(iconCompat.f927b, 1);
        iconCompat.f929d = versionedParcel.j(iconCompat.f929d, 2);
        iconCompat.f930e = versionedParcel.r(iconCompat.f930e, 3);
        iconCompat.f931f = versionedParcel.p(iconCompat.f931f, 4);
        iconCompat.f932g = versionedParcel.p(iconCompat.f932g, 5);
        iconCompat.f933h = (ColorStateList) versionedParcel.r(iconCompat.f933h, 6);
        iconCompat.f935j = versionedParcel.t(iconCompat.f935j, 7);
        iconCompat.f936k = versionedParcel.t(iconCompat.f936k, 8);
        iconCompat.l();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(true, true);
        iconCompat.m(versionedParcel.f());
        int i2 = iconCompat.f927b;
        if (-1 != i2) {
            versionedParcel.F(i2, 1);
        }
        byte[] bArr = iconCompat.f929d;
        if (bArr != null) {
            versionedParcel.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f930e;
        if (parcelable != null) {
            versionedParcel.H(parcelable, 3);
        }
        int i3 = iconCompat.f931f;
        if (i3 != 0) {
            versionedParcel.F(i3, 4);
        }
        int i4 = iconCompat.f932g;
        if (i4 != 0) {
            versionedParcel.F(i4, 5);
        }
        ColorStateList colorStateList = iconCompat.f933h;
        if (colorStateList != null) {
            versionedParcel.H(colorStateList, 6);
        }
        String str = iconCompat.f935j;
        if (str != null) {
            versionedParcel.J(str, 7);
        }
        String str2 = iconCompat.f936k;
        if (str2 != null) {
            versionedParcel.J(str2, 8);
        }
    }
}
