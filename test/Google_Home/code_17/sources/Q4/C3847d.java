package q4;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: q4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3847d {

    /* renamed from: d, reason: collision with root package name */
    public static final int f38272d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Shape f38273a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38274b;

    /* renamed from: c, reason: collision with root package name */
    private final long f38275c;

    public /* synthetic */ C3847d(Shape shape, long j8, long j9, AbstractC3247p abstractC3247p) {
        this(shape, j8, j9);
    }

    public final long a() {
        return this.f38275c;
    }

    public final long b() {
        return this.f38274b;
    }

    public final Shape c() {
        return this.f38273a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3847d)) {
            return false;
        }
        C3847d c3847d = (C3847d) obj;
        if (AbstractC3255y.d(this.f38273a, c3847d.f38273a) && Color.m2977equalsimpl0(this.f38274b, c3847d.f38274b) && Color.m2977equalsimpl0(this.f38275c, c3847d.f38275c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f38273a.hashCode() * 31) + Color.m2983hashCodeimpl(this.f38274b)) * 31) + Color.m2983hashCodeimpl(this.f38275c);
    }

    public String toString() {
        return "StripeBottomSheetLayoutInfo(sheetShape=" + this.f38273a + ", sheetBackgroundColor=" + Color.m2984toStringimpl(this.f38274b) + ", scrimColor=" + Color.m2984toStringimpl(this.f38275c) + ")";
    }

    private C3847d(Shape sheetShape, long j8, long j9) {
        AbstractC3255y.i(sheetShape, "sheetShape");
        this.f38273a = sheetShape;
        this.f38274b = j8;
        this.f38275c = j9;
    }
}
