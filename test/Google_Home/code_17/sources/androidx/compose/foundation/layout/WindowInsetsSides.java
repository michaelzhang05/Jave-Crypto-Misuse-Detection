package androidx.compose.foundation.layout;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes.dex */
public final class WindowInsetsSides {
    private static final int AllowLeftInLtr;
    private static final int AllowLeftInRtl;
    private static final int AllowRightInLtr;
    private static final int AllowRightInRtl;
    private static final int Bottom;
    public static final Companion Companion = new Companion(null);
    private static final int End;
    private static final int Horizontal;
    private static final int Left;
    private static final int Right;
    private static final int Start;
    private static final int Top;
    private static final int Vertical;
    private final int value;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAllowLeftInLtr-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m692getAllowLeftInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInLtr;
        }

        /* renamed from: getAllowLeftInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m693getAllowLeftInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInRtl;
        }

        /* renamed from: getAllowRightInLtr-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m694getAllowRightInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInLtr;
        }

        /* renamed from: getAllowRightInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m695getAllowRightInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInRtl;
        }

        /* renamed from: getBottom-JoeWqyM, reason: not valid java name */
        public final int m696getBottomJoeWqyM() {
            return WindowInsetsSides.Bottom;
        }

        /* renamed from: getEnd-JoeWqyM, reason: not valid java name */
        public final int m697getEndJoeWqyM() {
            return WindowInsetsSides.End;
        }

        /* renamed from: getHorizontal-JoeWqyM, reason: not valid java name */
        public final int m698getHorizontalJoeWqyM() {
            return WindowInsetsSides.Horizontal;
        }

        /* renamed from: getLeft-JoeWqyM, reason: not valid java name */
        public final int m699getLeftJoeWqyM() {
            return WindowInsetsSides.Left;
        }

        /* renamed from: getRight-JoeWqyM, reason: not valid java name */
        public final int m700getRightJoeWqyM() {
            return WindowInsetsSides.Right;
        }

        /* renamed from: getStart-JoeWqyM, reason: not valid java name */
        public final int m701getStartJoeWqyM() {
            return WindowInsetsSides.Start;
        }

        /* renamed from: getTop-JoeWqyM, reason: not valid java name */
        public final int m702getTopJoeWqyM() {
            return WindowInsetsSides.Top;
        }

        /* renamed from: getVertical-JoeWqyM, reason: not valid java name */
        public final int m703getVerticalJoeWqyM() {
            return WindowInsetsSides.Vertical;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        int m683constructorimpl = m683constructorimpl(8);
        AllowLeftInLtr = m683constructorimpl;
        int m683constructorimpl2 = m683constructorimpl(4);
        AllowRightInLtr = m683constructorimpl2;
        int m683constructorimpl3 = m683constructorimpl(2);
        AllowLeftInRtl = m683constructorimpl3;
        int m683constructorimpl4 = m683constructorimpl(1);
        AllowRightInRtl = m683constructorimpl4;
        Start = m688plusgK_yJZ4(m683constructorimpl, m683constructorimpl4);
        End = m688plusgK_yJZ4(m683constructorimpl2, m683constructorimpl3);
        int m683constructorimpl5 = m683constructorimpl(16);
        Top = m683constructorimpl5;
        int m683constructorimpl6 = m683constructorimpl(32);
        Bottom = m683constructorimpl6;
        int m688plusgK_yJZ4 = m688plusgK_yJZ4(m683constructorimpl, m683constructorimpl3);
        Left = m688plusgK_yJZ4;
        int m688plusgK_yJZ42 = m688plusgK_yJZ4(m683constructorimpl2, m683constructorimpl4);
        Right = m688plusgK_yJZ42;
        Horizontal = m688plusgK_yJZ4(m688plusgK_yJZ4, m688plusgK_yJZ42);
        Vertical = m688plusgK_yJZ4(m683constructorimpl5, m683constructorimpl6);
    }

    private /* synthetic */ WindowInsetsSides(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ WindowInsetsSides m682boximpl(int i8) {
        return new WindowInsetsSides(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m683constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m684equalsimpl(int i8, Object obj) {
        return (obj instanceof WindowInsetsSides) && i8 == ((WindowInsetsSides) obj).m691unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m685equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hasAny-bkgdKaI$foundation_layout_release, reason: not valid java name */
    public static final boolean m686hasAnybkgdKaI$foundation_layout_release(int i8, int i9) {
        return (i8 & i9) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m687hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: plus-gK_yJZ4, reason: not valid java name */
    public static final int m688plusgK_yJZ4(int i8, int i9) {
        return m683constructorimpl(i8 | i9);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m689toStringimpl(int i8) {
        return "WindowInsetsSides(" + m690valueToStringimpl(i8) + ')';
    }

    /* renamed from: valueToString-impl, reason: not valid java name */
    private static final String m690valueToStringimpl(int i8) {
        StringBuilder sb = new StringBuilder();
        int i9 = Start;
        if ((i8 & i9) == i9) {
            valueToString_impl$lambda$0$appendPlus(sb, "Start");
        }
        int i10 = Left;
        if ((i8 & i10) == i10) {
            valueToString_impl$lambda$0$appendPlus(sb, "Left");
        }
        int i11 = Top;
        if ((i8 & i11) == i11) {
            valueToString_impl$lambda$0$appendPlus(sb, "Top");
        }
        int i12 = End;
        if ((i8 & i12) == i12) {
            valueToString_impl$lambda$0$appendPlus(sb, "End");
        }
        int i13 = Right;
        if ((i8 & i13) == i13) {
            valueToString_impl$lambda$0$appendPlus(sb, "Right");
        }
        int i14 = Bottom;
        if ((i8 & i14) == i14) {
            valueToString_impl$lambda$0$appendPlus(sb, "Bottom");
        }
        String sb2 = sb.toString();
        AbstractC3255y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private static final void valueToString_impl$lambda$0$appendPlus(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public boolean equals(Object obj) {
        return m684equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m687hashCodeimpl(this.value);
    }

    public String toString() {
        return m689toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m691unboximpl() {
        return this.value;
    }
}
