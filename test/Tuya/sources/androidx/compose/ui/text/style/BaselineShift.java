package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public final class BaselineShift {
    private final float multiplier;
    public static final Companion Companion = new Companion(null);
    private static final float Superscript = m4967constructorimpl(0.5f);
    private static final float Subscript = m4967constructorimpl(-0.5f);
    private static final float None = m4967constructorimpl(0.0f);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getNone-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m4973getNoney9eOQZs$annotations() {
        }

        @Stable
        /* renamed from: getSubscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m4974getSubscripty9eOQZs$annotations() {
        }

        @Stable
        /* renamed from: getSuperscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m4975getSuperscripty9eOQZs$annotations() {
        }

        /* renamed from: getNone-y9eOQZs, reason: not valid java name */
        public final float m4976getNoney9eOQZs() {
            return BaselineShift.None;
        }

        /* renamed from: getSubscript-y9eOQZs, reason: not valid java name */
        public final float m4977getSubscripty9eOQZs() {
            return BaselineShift.Subscript;
        }

        /* renamed from: getSuperscript-y9eOQZs, reason: not valid java name */
        public final float m4978getSuperscripty9eOQZs() {
            return BaselineShift.Superscript;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ BaselineShift(float f8) {
        this.multiplier = f8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BaselineShift m4966boximpl(float f8) {
        return new BaselineShift(f8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m4967constructorimpl(float f8) {
        return f8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4968equalsimpl(float f8, Object obj) {
        return (obj instanceof BaselineShift) && Float.compare(f8, ((BaselineShift) obj).m4972unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4969equalsimpl0(float f8, float f9) {
        return Float.compare(f8, f9) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4970hashCodeimpl(float f8) {
        return Float.floatToIntBits(f8);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4971toStringimpl(float f8) {
        return "BaselineShift(multiplier=" + f8 + ')';
    }

    public boolean equals(Object obj) {
        return m4968equalsimpl(this.multiplier, obj);
    }

    public final float getMultiplier() {
        return this.multiplier;
    }

    public int hashCode() {
        return m4970hashCodeimpl(this.multiplier);
    }

    public String toString() {
        return m4971toStringimpl(this.multiplier);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m4972unboximpl() {
        return this.multiplier;
    }
}
