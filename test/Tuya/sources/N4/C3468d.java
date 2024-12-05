package n4;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: n4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3468d {

    /* renamed from: d, reason: collision with root package name */
    public static final int f36144d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Shape f36145a;

    /* renamed from: b, reason: collision with root package name */
    private final long f36146b;

    /* renamed from: c, reason: collision with root package name */
    private final long f36147c;

    public /* synthetic */ C3468d(Shape shape, long j8, long j9, AbstractC3151p abstractC3151p) {
        this(shape, j8, j9);
    }

    public final long a() {
        return this.f36147c;
    }

    public final long b() {
        return this.f36146b;
    }

    public final Shape c() {
        return this.f36145a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3468d)) {
            return false;
        }
        C3468d c3468d = (C3468d) obj;
        if (AbstractC3159y.d(this.f36145a, c3468d.f36145a) && Color.m2972equalsimpl0(this.f36146b, c3468d.f36146b) && Color.m2972equalsimpl0(this.f36147c, c3468d.f36147c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f36145a.hashCode() * 31) + Color.m2978hashCodeimpl(this.f36146b)) * 31) + Color.m2978hashCodeimpl(this.f36147c);
    }

    public String toString() {
        return "StripeBottomSheetLayoutInfo(sheetShape=" + this.f36145a + ", sheetBackgroundColor=" + Color.m2979toStringimpl(this.f36146b) + ", scrimColor=" + Color.m2979toStringimpl(this.f36147c) + ")";
    }

    private C3468d(Shape sheetShape, long j8, long j9) {
        AbstractC3159y.i(sheetShape, "sheetShape");
        this.f36145a = sheetShape;
        this.f36146b = j8;
        this.f36147c = j9;
    }
}
