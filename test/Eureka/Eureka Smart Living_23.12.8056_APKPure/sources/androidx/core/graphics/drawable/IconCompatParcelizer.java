package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2083a = aVar.p(iconCompat.f2083a, 1);
        iconCompat.f2085c = aVar.j(iconCompat.f2085c, 2);
        iconCompat.f2086d = aVar.r(iconCompat.f2086d, 3);
        iconCompat.f2087e = aVar.p(iconCompat.f2087e, 4);
        iconCompat.f2088f = aVar.p(iconCompat.f2088f, 5);
        iconCompat.f2089g = (ColorStateList) aVar.r(iconCompat.f2089g, 6);
        iconCompat.f2091i = aVar.t(iconCompat.f2091i, 7);
        iconCompat.f2092j = aVar.t(iconCompat.f2092j, 8);
        iconCompat.j();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(true, true);
        iconCompat.k(aVar.f());
        int i6 = iconCompat.f2083a;
        if (-1 != i6) {
            aVar.F(i6, 1);
        }
        byte[] bArr = iconCompat.f2085c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2086d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i7 = iconCompat.f2087e;
        if (i7 != 0) {
            aVar.F(i7, 4);
        }
        int i8 = iconCompat.f2088f;
        if (i8 != 0) {
            aVar.F(i8, 5);
        }
        ColorStateList colorStateList = iconCompat.f2089g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f2091i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f2092j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
