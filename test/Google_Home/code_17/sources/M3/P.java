package M3;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private final FontFamily f6581a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6582b;

    public /* synthetic */ P(FontFamily fontFamily, long j8, AbstractC3247p abstractC3247p) {
        this(fontFamily, j8);
    }

    public final FontFamily a() {
        return this.f6581a;
    }

    public final long b() {
        return this.f6582b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p8 = (P) obj;
        if (AbstractC3255y.d(this.f6581a, p8.f6581a) && TextUnit.m5367equalsimpl0(this.f6582b, p8.f6582b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        FontFamily fontFamily = this.f6581a;
        if (fontFamily == null) {
            hashCode = 0;
        } else {
            hashCode = fontFamily.hashCode();
        }
        return (hashCode * 31) + TextUnit.m5371hashCodeimpl(this.f6582b);
    }

    public String toString() {
        return "PrimaryButtonTypography(fontFamily=" + this.f6581a + ", fontSize=" + TextUnit.m5377toStringimpl(this.f6582b) + ")";
    }

    private P(FontFamily fontFamily, long j8) {
        this.f6581a = fontFamily;
        this.f6582b = j8;
    }

    public /* synthetic */ P(FontFamily fontFamily, long j8, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? null : fontFamily, (i8 & 2) != 0 ? TextUnit.Companion.m5381getUnspecifiedXSAIIZE() : j8, null);
    }
}
