package m4;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final int f35239a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35240b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35241c;

    /* renamed from: d, reason: collision with root package name */
    private final float f35242d;

    /* renamed from: e, reason: collision with root package name */
    private final long f35243e;

    /* renamed from: f, reason: collision with root package name */
    private final long f35244f;

    /* renamed from: g, reason: collision with root package name */
    private final long f35245g;

    /* renamed from: h, reason: collision with root package name */
    private final long f35246h;

    /* renamed from: i, reason: collision with root package name */
    private final long f35247i;

    /* renamed from: j, reason: collision with root package name */
    private final long f35248j;

    /* renamed from: k, reason: collision with root package name */
    private final Integer f35249k;

    /* renamed from: l, reason: collision with root package name */
    private final FontFamily f35250l;

    /* renamed from: m, reason: collision with root package name */
    private final FontFamily f35251m;

    /* renamed from: n, reason: collision with root package name */
    private final FontFamily f35252n;

    /* renamed from: o, reason: collision with root package name */
    private final FontFamily f35253o;

    /* renamed from: p, reason: collision with root package name */
    private final FontFamily f35254p;

    /* renamed from: q, reason: collision with root package name */
    private final FontFamily f35255q;

    /* renamed from: r, reason: collision with root package name */
    private final FontFamily f35256r;

    public /* synthetic */ n(int i8, int i9, int i10, float f8, long j8, long j9, long j10, long j11, long j12, long j13, Integer num, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6, FontFamily fontFamily7, AbstractC3247p abstractC3247p) {
        this(i8, i9, i10, f8, j8, j9, j10, j11, j12, j13, num, fontFamily, fontFamily2, fontFamily3, fontFamily4, fontFamily5, fontFamily6, fontFamily7);
    }

    public final n a(int i8, int i9, int i10, float f8, long j8, long j9, long j10, long j11, long j12, long j13, Integer num, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6, FontFamily fontFamily7) {
        return new n(i8, i9, i10, f8, j8, j9, j10, j11, j12, j13, num, fontFamily, fontFamily2, fontFamily3, fontFamily4, fontFamily5, fontFamily6, fontFamily7, null);
    }

    public final FontFamily c() {
        return this.f35250l;
    }

    public final FontFamily d() {
        return this.f35251m;
    }

    public final FontFamily e() {
        return this.f35256r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f35239a == nVar.f35239a && this.f35240b == nVar.f35240b && this.f35241c == nVar.f35241c && Float.compare(this.f35242d, nVar.f35242d) == 0 && TextUnit.m5367equalsimpl0(this.f35243e, nVar.f35243e) && TextUnit.m5367equalsimpl0(this.f35244f, nVar.f35244f) && TextUnit.m5367equalsimpl0(this.f35245g, nVar.f35245g) && TextUnit.m5367equalsimpl0(this.f35246h, nVar.f35246h) && TextUnit.m5367equalsimpl0(this.f35247i, nVar.f35247i) && TextUnit.m5367equalsimpl0(this.f35248j, nVar.f35248j) && AbstractC3255y.d(this.f35249k, nVar.f35249k) && AbstractC3255y.d(this.f35250l, nVar.f35250l) && AbstractC3255y.d(this.f35251m, nVar.f35251m) && AbstractC3255y.d(this.f35252n, nVar.f35252n) && AbstractC3255y.d(this.f35253o, nVar.f35253o) && AbstractC3255y.d(this.f35254p, nVar.f35254p) && AbstractC3255y.d(this.f35255q, nVar.f35255q) && AbstractC3255y.d(this.f35256r, nVar.f35256r)) {
            return true;
        }
        return false;
    }

    public final Integer f() {
        return this.f35249k;
    }

    public final float g() {
        return this.f35242d;
    }

    public final int h() {
        return this.f35241c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int floatToIntBits = ((((((((((((((((((this.f35239a * 31) + this.f35240b) * 31) + this.f35241c) * 31) + Float.floatToIntBits(this.f35242d)) * 31) + TextUnit.m5371hashCodeimpl(this.f35243e)) * 31) + TextUnit.m5371hashCodeimpl(this.f35244f)) * 31) + TextUnit.m5371hashCodeimpl(this.f35245g)) * 31) + TextUnit.m5371hashCodeimpl(this.f35246h)) * 31) + TextUnit.m5371hashCodeimpl(this.f35247i)) * 31) + TextUnit.m5371hashCodeimpl(this.f35248j)) * 31;
        Integer num = this.f35249k;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = (floatToIntBits + hashCode) * 31;
        FontFamily fontFamily = this.f35250l;
        if (fontFamily == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = fontFamily.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        FontFamily fontFamily2 = this.f35251m;
        if (fontFamily2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = fontFamily2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        FontFamily fontFamily3 = this.f35252n;
        if (fontFamily3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = fontFamily3.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        FontFamily fontFamily4 = this.f35253o;
        if (fontFamily4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = fontFamily4.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        FontFamily fontFamily5 = this.f35254p;
        if (fontFamily5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = fontFamily5.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        FontFamily fontFamily6 = this.f35255q;
        if (fontFamily6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = fontFamily6.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        FontFamily fontFamily7 = this.f35256r;
        if (fontFamily7 != null) {
            i8 = fontFamily7.hashCode();
        }
        return i15 + i8;
    }

    public final int i() {
        return this.f35240b;
    }

    public final int j() {
        return this.f35239a;
    }

    public final FontFamily k() {
        return this.f35252n;
    }

    public final FontFamily l() {
        return this.f35253o;
    }

    public final FontFamily m() {
        return this.f35254p;
    }

    public final long n() {
        return this.f35247i;
    }

    public final long o() {
        return this.f35246h;
    }

    public final long p() {
        return this.f35245g;
    }

    public final FontFamily q() {
        return this.f35255q;
    }

    public final long r() {
        return this.f35248j;
    }

    public final long s() {
        return this.f35244f;
    }

    public final long t() {
        return this.f35243e;
    }

    public String toString() {
        return "StripeTypography(fontWeightNormal=" + this.f35239a + ", fontWeightMedium=" + this.f35240b + ", fontWeightBold=" + this.f35241c + ", fontSizeMultiplier=" + this.f35242d + ", xxSmallFontSize=" + TextUnit.m5377toStringimpl(this.f35243e) + ", xSmallFontSize=" + TextUnit.m5377toStringimpl(this.f35244f) + ", smallFontSize=" + TextUnit.m5377toStringimpl(this.f35245g) + ", mediumFontSize=" + TextUnit.m5377toStringimpl(this.f35246h) + ", largeFontSize=" + TextUnit.m5377toStringimpl(this.f35247i) + ", xLargeFontSize=" + TextUnit.m5377toStringimpl(this.f35248j) + ", fontFamily=" + this.f35249k + ", body1FontFamily=" + this.f35250l + ", body2FontFamily=" + this.f35251m + ", h4FontFamily=" + this.f35252n + ", h5FontFamily=" + this.f35253o + ", h6FontFamily=" + this.f35254p + ", subtitle1FontFamily=" + this.f35255q + ", captionFontFamily=" + this.f35256r + ")";
    }

    private n(int i8, int i9, int i10, float f8, long j8, long j9, long j10, long j11, long j12, long j13, Integer num, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6, FontFamily fontFamily7) {
        this.f35239a = i8;
        this.f35240b = i9;
        this.f35241c = i10;
        this.f35242d = f8;
        this.f35243e = j8;
        this.f35244f = j9;
        this.f35245g = j10;
        this.f35246h = j11;
        this.f35247i = j12;
        this.f35248j = j13;
        this.f35249k = num;
        this.f35250l = fontFamily;
        this.f35251m = fontFamily2;
        this.f35252n = fontFamily3;
        this.f35253o = fontFamily4;
        this.f35254p = fontFamily5;
        this.f35255q = fontFamily6;
        this.f35256r = fontFamily7;
    }

    public /* synthetic */ n(int i8, int i9, int i10, float f8, long j8, long j9, long j10, long j11, long j12, long j13, Integer num, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6, FontFamily fontFamily7, int i11, AbstractC3247p abstractC3247p) {
        this(i8, i9, i10, f8, j8, j9, j10, j11, j12, j13, num, (i11 & 2048) != 0 ? null : fontFamily, (i11 & 4096) != 0 ? null : fontFamily2, (i11 & 8192) != 0 ? null : fontFamily3, (i11 & 16384) != 0 ? null : fontFamily4, (32768 & i11) != 0 ? null : fontFamily5, (65536 & i11) != 0 ? null : fontFamily6, (i11 & 131072) != 0 ? null : fontFamily7, null);
    }
}
