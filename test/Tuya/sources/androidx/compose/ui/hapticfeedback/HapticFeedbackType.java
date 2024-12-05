package androidx.compose.ui.hapticfeedback;

import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public final class HapticFeedbackType {
    public static final Companion Companion = new Companion(null);
    private final int value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m3570getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3572getLongPress5zf0vsI();
        }

        /* renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m3571getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m3573getTextHandleMove5zf0vsI();
        }

        public final List<HapticFeedbackType> values() {
            return AbstractC1246t.p(HapticFeedbackType.m3563boximpl(m3570getLongPress5zf0vsI()), HapticFeedbackType.m3563boximpl(m3571getTextHandleMove5zf0vsI()));
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ HapticFeedbackType(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m3563boximpl(int i8) {
        return new HapticFeedbackType(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3564constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3565equalsimpl(int i8, Object obj) {
        return (obj instanceof HapticFeedbackType) && i8 == ((HapticFeedbackType) obj).m3569unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3566equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3567hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3568toStringimpl(int i8) {
        Companion companion = Companion;
        if (m3566equalsimpl0(i8, companion.m3570getLongPress5zf0vsI())) {
            return "LongPress";
        }
        if (m3566equalsimpl0(i8, companion.m3571getTextHandleMove5zf0vsI())) {
            return "TextHandleMove";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m3565equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3567hashCodeimpl(this.value);
    }

    public String toString() {
        return m3568toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3569unboximpl() {
        return this.value;
    }
}
