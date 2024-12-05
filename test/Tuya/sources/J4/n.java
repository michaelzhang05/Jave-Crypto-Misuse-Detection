package j4;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final int f33263a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33264b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33265c;

    /* renamed from: d, reason: collision with root package name */
    private final float f33266d;

    /* renamed from: e, reason: collision with root package name */
    private final long f33267e;

    /* renamed from: f, reason: collision with root package name */
    private final long f33268f;

    /* renamed from: g, reason: collision with root package name */
    private final long f33269g;

    /* renamed from: h, reason: collision with root package name */
    private final long f33270h;

    /* renamed from: i, reason: collision with root package name */
    private final long f33271i;

    /* renamed from: j, reason: collision with root package name */
    private final long f33272j;

    /* renamed from: k, reason: collision with root package name */
    private final Integer f33273k;

    /* renamed from: l, reason: collision with root package name */
    private final FontFamily f33274l;

    /* renamed from: m, reason: collision with root package name */
    private final FontFamily f33275m;

    /* renamed from: n, reason: collision with root package name */
    private final FontFamily f33276n;

    /* renamed from: o, reason: collision with root package name */
    private final FontFamily f33277o;

    /* renamed from: p, reason: collision with root package name */
    private final FontFamily f33278p;

    /* renamed from: q, reason: collision with root package name */
    private final FontFamily f33279q;

    /* renamed from: r, reason: collision with root package name */
    private final FontFamily f33280r;

    public /* synthetic */ n(int i8, int i9, int i10, float f8, long j8, long j9, long j10, long j11, long j12, long j13, Integer num, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6, FontFamily fontFamily7, AbstractC3151p abstractC3151p) {
        this(i8, i9, i10, f8, j8, j9, j10, j11, j12, j13, num, fontFamily, fontFamily2, fontFamily3, fontFamily4, fontFamily5, fontFamily6, fontFamily7);
    }

    public final n a(int i8, int i9, int i10, float f8, long j8, long j9, long j10, long j11, long j12, long j13, Integer num, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6, FontFamily fontFamily7) {
        return new n(i8, i9, i10, f8, j8, j9, j10, j11, j12, j13, num, fontFamily, fontFamily2, fontFamily3, fontFamily4, fontFamily5, fontFamily6, fontFamily7, null);
    }

    public final FontFamily c() {
        return this.f33274l;
    }

    public final FontFamily d() {
        return this.f33275m;
    }

    public final FontFamily e() {
        return this.f33280r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f33263a == nVar.f33263a && this.f33264b == nVar.f33264b && this.f33265c == nVar.f33265c && Float.compare(this.f33266d, nVar.f33266d) == 0 && TextUnit.m5362equalsimpl0(this.f33267e, nVar.f33267e) && TextUnit.m5362equalsimpl0(this.f33268f, nVar.f33268f) && TextUnit.m5362equalsimpl0(this.f33269g, nVar.f33269g) && TextUnit.m5362equalsimpl0(this.f33270h, nVar.f33270h) && TextUnit.m5362equalsimpl0(this.f33271i, nVar.f33271i) && TextUnit.m5362equalsimpl0(this.f33272j, nVar.f33272j) && AbstractC3159y.d(this.f33273k, nVar.f33273k) && AbstractC3159y.d(this.f33274l, nVar.f33274l) && AbstractC3159y.d(this.f33275m, nVar.f33275m) && AbstractC3159y.d(this.f33276n, nVar.f33276n) && AbstractC3159y.d(this.f33277o, nVar.f33277o) && AbstractC3159y.d(this.f33278p, nVar.f33278p) && AbstractC3159y.d(this.f33279q, nVar.f33279q) && AbstractC3159y.d(this.f33280r, nVar.f33280r)) {
            return true;
        }
        return false;
    }

    public final Integer f() {
        return this.f33273k;
    }

    public final float g() {
        return this.f33266d;
    }

    public final int h() {
        return this.f33265c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int floatToIntBits = ((((((((((((((((((this.f33263a * 31) + this.f33264b) * 31) + this.f33265c) * 31) + Float.floatToIntBits(this.f33266d)) * 31) + TextUnit.m5366hashCodeimpl(this.f33267e)) * 31) + TextUnit.m5366hashCodeimpl(this.f33268f)) * 31) + TextUnit.m5366hashCodeimpl(this.f33269g)) * 31) + TextUnit.m5366hashCodeimpl(this.f33270h)) * 31) + TextUnit.m5366hashCodeimpl(this.f33271i)) * 31) + TextUnit.m5366hashCodeimpl(this.f33272j)) * 31;
        Integer num = this.f33273k;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = (floatToIntBits + hashCode) * 31;
        FontFamily fontFamily = this.f33274l;
        if (fontFamily == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = fontFamily.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        FontFamily fontFamily2 = this.f33275m;
        if (fontFamily2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = fontFamily2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        FontFamily fontFamily3 = this.f33276n;
        if (fontFamily3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = fontFamily3.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        FontFamily fontFamily4 = this.f33277o;
        if (fontFamily4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = fontFamily4.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        FontFamily fontFamily5 = this.f33278p;
        if (fontFamily5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = fontFamily5.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        FontFamily fontFamily6 = this.f33279q;
        if (fontFamily6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = fontFamily6.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        FontFamily fontFamily7 = this.f33280r;
        if (fontFamily7 != null) {
            i8 = fontFamily7.hashCode();
        }
        return i15 + i8;
    }

    public final int i() {
        return this.f33264b;
    }

    public final int j() {
        return this.f33263a;
    }

    public final FontFamily k() {
        return this.f33276n;
    }

    public final FontFamily l() {
        return this.f33277o;
    }

    public final FontFamily m() {
        return this.f33278p;
    }

    public final long n() {
        return this.f33271i;
    }

    public final long o() {
        return this.f33270h;
    }

    public final long p() {
        return this.f33269g;
    }

    public final FontFamily q() {
        return this.f33279q;
    }

    public final long r() {
        return this.f33272j;
    }

    public final long s() {
        return this.f33268f;
    }

    public final long t() {
        return this.f33267e;
    }

    public String toString() {
        return "StripeTypography(fontWeightNormal=" + this.f33263a + ", fontWeightMedium=" + this.f33264b + ", fontWeightBold=" + this.f33265c + ", fontSizeMultiplier=" + this.f33266d + ", xxSmallFontSize=" + TextUnit.m5372toStringimpl(this.f33267e) + ", xSmallFontSize=" + TextUnit.m5372toStringimpl(this.f33268f) + ", smallFontSize=" + TextUnit.m5372toStringimpl(this.f33269g) + ", mediumFontSize=" + TextUnit.m5372toStringimpl(this.f33270h) + ", largeFontSize=" + TextUnit.m5372toStringimpl(this.f33271i) + ", xLargeFontSize=" + TextUnit.m5372toStringimpl(this.f33272j) + ", fontFamily=" + this.f33273k + ", body1FontFamily=" + this.f33274l + ", body2FontFamily=" + this.f33275m + ", h4FontFamily=" + this.f33276n + ", h5FontFamily=" + this.f33277o + ", h6FontFamily=" + this.f33278p + ", subtitle1FontFamily=" + this.f33279q + ", captionFontFamily=" + this.f33280r + ")";
    }

    private n(int i8, int i9, int i10, float f8, long j8, long j9, long j10, long j11, long j12, long j13, Integer num, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6, FontFamily fontFamily7) {
        this.f33263a = i8;
        this.f33264b = i9;
        this.f33265c = i10;
        this.f33266d = f8;
        this.f33267e = j8;
        this.f33268f = j9;
        this.f33269g = j10;
        this.f33270h = j11;
        this.f33271i = j12;
        this.f33272j = j13;
        this.f33273k = num;
        this.f33274l = fontFamily;
        this.f33275m = fontFamily2;
        this.f33276n = fontFamily3;
        this.f33277o = fontFamily4;
        this.f33278p = fontFamily5;
        this.f33279q = fontFamily6;
        this.f33280r = fontFamily7;
    }

    public /* synthetic */ n(int i8, int i9, int i10, float f8, long j8, long j9, long j10, long j11, long j12, long j13, Integer num, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6, FontFamily fontFamily7, int i11, AbstractC3151p abstractC3151p) {
        this(i8, i9, i10, f8, j8, j9, j10, j11, j12, j13, num, (i11 & 2048) != 0 ? null : fontFamily, (i11 & 4096) != 0 ? null : fontFamily2, (i11 & 8192) != 0 ? null : fontFamily3, (i11 & 16384) != 0 ? null : fontFamily4, (32768 & i11) != 0 ? null : fontFamily5, (65536 & i11) != 0 ? null : fontFamily6, (i11 & 131072) != 0 ? null : fontFamily7, null);
    }
}
