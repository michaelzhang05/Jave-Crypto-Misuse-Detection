package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
/* loaded from: classes.dex */
public final class BaselineShift {
    private final float multiplier;
    public static final Companion Companion = new Companion(null);
    private static final float Superscript = m4972constructorimpl(0.5f);
    private static final float Subscript = m4972constructorimpl(-0.5f);
    private static final float None = m4972constructorimpl(0.0f);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getNone-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m4978getNoney9eOQZs$annotations() {
        }

        @Stable
        /* renamed from: getSubscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m4979getSubscripty9eOQZs$annotations() {
        }

        @Stable
        /* renamed from: getSuperscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m4980getSuperscripty9eOQZs$annotations() {
        }

        /* renamed from: getNone-y9eOQZs, reason: not valid java name */
        public final float m4981getNoney9eOQZs() {
            return BaselineShift.None;
        }

        /* renamed from: getSubscript-y9eOQZs, reason: not valid java name */
        public final float m4982getSubscripty9eOQZs() {
            return BaselineShift.Subscript;
        }

        /* renamed from: getSuperscript-y9eOQZs, reason: not valid java name */
        public final float m4983getSuperscripty9eOQZs() {
            return BaselineShift.Superscript;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ BaselineShift(float f8) {
        this.multiplier = f8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BaselineShift m4971boximpl(float f8) {
        return new BaselineShift(f8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m4972constructorimpl(float f8) {
        return f8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4973equalsimpl(float f8, Object obj) {
        return (obj instanceof BaselineShift) && Float.compare(f8, ((BaselineShift) obj).m4977unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4974equalsimpl0(float f8, float f9) {
        return Float.compare(f8, f9) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4975hashCodeimpl(float f8) {
        return Float.floatToIntBits(f8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4976toStringimpl(float f8) {
        return "BaselineShift(multiplier=" + f8 + ')';
    }

    public boolean equals(Object obj) {
        return m4973equalsimpl(this.multiplier, obj);
    }

    public final float getMultiplier() {
        return this.multiplier;
    }

    public int hashCode() {
        return m4975hashCodeimpl(this.multiplier);
    }

    public String toString() {
        return m4976toStringimpl(this.multiplier);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m4977unboximpl() {
        return this.multiplier;
    }
}
