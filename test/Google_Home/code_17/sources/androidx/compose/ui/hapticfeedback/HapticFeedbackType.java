package androidx.compose.ui.hapticfeedback;

import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class HapticFeedbackType {
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m3575getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3577getLongPress5zf0vsI();
        }

        /* renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m3576getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3578getTextHandleMove5zf0vsI();
        }

        public final List<HapticFeedbackType> values() {
            return AbstractC1378t.p(HapticFeedbackType.m3568boximpl(m3575getLongPress5zf0vsI()), HapticFeedbackType.m3568boximpl(m3576getTextHandleMove5zf0vsI()));
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ HapticFeedbackType(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m3568boximpl(int i8) {
        return new HapticFeedbackType(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3569constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3570equalsimpl(int i8, Object obj) {
        return (obj instanceof HapticFeedbackType) && i8 == ((HapticFeedbackType) obj).m3574unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3571equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3572hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3573toStringimpl(int i8) {
        Companion companion = Companion;
        if (m3571equalsimpl0(i8, companion.m3575getLongPress5zf0vsI())) {
            return "LongPress";
        }
        if (m3571equalsimpl0(i8, companion.m3576getTextHandleMove5zf0vsI())) {
            return "TextHandleMove";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m3570equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3572hashCodeimpl(this.value);
    }

    public String toString() {
        return m3573toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3574unboximpl() {
        return this.value;
    }
}
