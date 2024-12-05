package J3;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private final FontFamily f4875a;

    /* renamed from: b, reason: collision with root package name */
    private final long f4876b;

    public /* synthetic */ P(FontFamily fontFamily, long j8, AbstractC3151p abstractC3151p) {
        this(fontFamily, j8);
    }

    public final FontFamily a() {
        return this.f4875a;
    }

    public final long b() {
        return this.f4876b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p8 = (P) obj;
        if (AbstractC3159y.d(this.f4875a, p8.f4875a) && TextUnit.m5362equalsimpl0(this.f4876b, p8.f4876b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        FontFamily fontFamily = this.f4875a;
        if (fontFamily == null) {
            hashCode = 0;
        } else {
            hashCode = fontFamily.hashCode();
        }
        return (hashCode * 31) + TextUnit.m5366hashCodeimpl(this.f4876b);
    }

    public String toString() {
        return "PrimaryButtonTypography(fontFamily=" + this.f4875a + ", fontSize=" + TextUnit.m5372toStringimpl(this.f4876b) + ")";
    }

    private P(FontFamily fontFamily, long j8) {
        this.f4875a = fontFamily;
        this.f4876b = j8;
    }

    public /* synthetic */ P(FontFamily fontFamily, long j8, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? null : fontFamily, (i8 & 2) != 0 ? TextUnit.Companion.m5376getUnspecifiedXSAIIZE() : j8, null);
    }
}
