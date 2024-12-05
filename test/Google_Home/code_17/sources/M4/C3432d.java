package m4;

import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: m4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3432d {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f35148a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35149b;

    public /* synthetic */ C3432d(Integer num, long j8, AbstractC3247p abstractC3247p) {
        this(num, j8);
    }

    public final Integer a() {
        return this.f35148a;
    }

    public final long b() {
        return this.f35149b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3432d)) {
            return false;
        }
        C3432d c3432d = (C3432d) obj;
        if (AbstractC3255y.d(this.f35148a, c3432d.f35148a) && TextUnit.m5367equalsimpl0(this.f35149b, c3432d.f35149b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f35148a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return (hashCode * 31) + TextUnit.m5371hashCodeimpl(this.f35149b);
    }

    public String toString() {
        return "PrimaryButtonTypography(fontFamily=" + this.f35148a + ", fontSize=" + TextUnit.m5377toStringimpl(this.f35149b) + ")";
    }

    private C3432d(Integer num, long j8) {
        this.f35148a = num;
        this.f35149b = j8;
    }
}
