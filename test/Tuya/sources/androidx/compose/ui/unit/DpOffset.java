package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.r;

@Immutable
/* loaded from: classes.dex */
public final class DpOffset {
    public static final Companion Companion = new Companion(null);
    private static final long Unspecified;
    private static final long Zero;
    private final long packedValue;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m5248getUnspecifiedRKDOV3M() {
            return DpOffset.Unspecified;
        }

        /* renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m5249getZeroRKDOV3M() {
            return DpOffset.Zero;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        float f8 = 0;
        Zero = DpKt.m5199DpOffsetYgX7TsA(Dp.m5178constructorimpl(f8), Dp.m5178constructorimpl(f8));
        Dp.Companion companion = Dp.Companion;
        Unspecified = DpKt.m5199DpOffsetYgX7TsA(companion.m5198getUnspecifiedD9Ej5fM(), companion.m5198getUnspecifiedD9Ej5fM());
    }

    private /* synthetic */ DpOffset(long j8) {
        this.packedValue = j8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpOffset m5233boximpl(long j8) {
        return new DpOffset(j8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5234constructorimpl(long j8) {
        return j8;
    }

    /* renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m5235copytPigGR8(long j8, float f8, float f9) {
        return DpKt.m5199DpOffsetYgX7TsA(f8, f9);
    }

    /* renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m5236copytPigGR8$default(long j8, float f8, float f9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = m5239getXD9Ej5fM(j8);
        }
        if ((i8 & 2) != 0) {
            f9 = m5241getYD9Ej5fM(j8);
        }
        return m5235copytPigGR8(j8, f8, f9);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5237equalsimpl(long j8, Object obj) {
        return (obj instanceof DpOffset) && j8 == ((DpOffset) obj).m5247unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5238equalsimpl0(long j8, long j9) {
        return j8 == j9;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m5239getXD9Ej5fM(long j8) {
        if (j8 != Unspecified) {
            r rVar = r.f33790a;
            return Dp.m5178constructorimpl(Float.intBitsToFloat((int) (j8 >> 32)));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    @Stable
    /* renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5240getXD9Ej5fM$annotations() {
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m5241getYD9Ej5fM(long j8) {
        if (j8 != Unspecified) {
            r rVar = r.f33790a;
            return Dp.m5178constructorimpl(Float.intBitsToFloat((int) (j8 & 4294967295L)));
        }
        throw new IllegalStateException("DpOffset is unspecified".toString());
    }

    @Stable
    /* renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5242getYD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5243hashCodeimpl(long j8) {
        return androidx.collection.a.a(j8);
    }

    @Stable
    /* renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m5244minusCBMgk4(long j8, long j9) {
        return DpKt.m5199DpOffsetYgX7TsA(Dp.m5178constructorimpl(m5239getXD9Ej5fM(j8) - m5239getXD9Ej5fM(j9)), Dp.m5178constructorimpl(m5241getYD9Ej5fM(j8) - m5241getYD9Ej5fM(j9)));
    }

    @Stable
    /* renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m5245plusCBMgk4(long j8, long j9) {
        return DpKt.m5199DpOffsetYgX7TsA(Dp.m5178constructorimpl(m5239getXD9Ej5fM(j8) + m5239getXD9Ej5fM(j9)), Dp.m5178constructorimpl(m5241getYD9Ej5fM(j8) + m5241getYD9Ej5fM(j9)));
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5246toStringimpl(long j8) {
        if (j8 != Companion.m5248getUnspecifiedRKDOV3M()) {
            return '(' + ((Object) Dp.m5189toStringimpl(m5239getXD9Ej5fM(j8))) + ", " + ((Object) Dp.m5189toStringimpl(m5241getYD9Ej5fM(j8))) + ')';
        }
        return "DpOffset.Unspecified";
    }

    public boolean equals(Object obj) {
        return m5237equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m5243hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m5246toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5247unboximpl() {
        return this.packedValue;
    }
}
