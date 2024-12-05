package androidx.compose.foundation.layout;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

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
        public final int m687getAllowLeftInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInLtr;
        }

        /* renamed from: getAllowLeftInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m688getAllowLeftInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowLeftInRtl;
        }

        /* renamed from: getAllowRightInLtr-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m689getAllowRightInLtrJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInLtr;
        }

        /* renamed from: getAllowRightInRtl-JoeWqyM$foundation_layout_release, reason: not valid java name */
        public final int m690getAllowRightInRtlJoeWqyM$foundation_layout_release() {
            return WindowInsetsSides.AllowRightInRtl;
        }

        /* renamed from: getBottom-JoeWqyM, reason: not valid java name */
        public final int m691getBottomJoeWqyM() {
            return WindowInsetsSides.Bottom;
        }

        /* renamed from: getEnd-JoeWqyM, reason: not valid java name */
        public final int m692getEndJoeWqyM() {
            return WindowInsetsSides.End;
        }

        /* renamed from: getHorizontal-JoeWqyM, reason: not valid java name */
        public final int m693getHorizontalJoeWqyM() {
            return WindowInsetsSides.Horizontal;
        }

        /* renamed from: getLeft-JoeWqyM, reason: not valid java name */
        public final int m694getLeftJoeWqyM() {
            return WindowInsetsSides.Left;
        }

        /* renamed from: getRight-JoeWqyM, reason: not valid java name */
        public final int m695getRightJoeWqyM() {
            return WindowInsetsSides.Right;
        }

        /* renamed from: getStart-JoeWqyM, reason: not valid java name */
        public final int m696getStartJoeWqyM() {
            return WindowInsetsSides.Start;
        }

        /* renamed from: getTop-JoeWqyM, reason: not valid java name */
        public final int m697getTopJoeWqyM() {
            return WindowInsetsSides.Top;
        }

        /* renamed from: getVertical-JoeWqyM, reason: not valid java name */
        public final int m698getVerticalJoeWqyM() {
            return WindowInsetsSides.Vertical;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        int m678constructorimpl = m678constructorimpl(8);
        AllowLeftInLtr = m678constructorimpl;
        int m678constructorimpl2 = m678constructorimpl(4);
        AllowRightInLtr = m678constructorimpl2;
        int m678constructorimpl3 = m678constructorimpl(2);
        AllowLeftInRtl = m678constructorimpl3;
        int m678constructorimpl4 = m678constructorimpl(1);
        AllowRightInRtl = m678constructorimpl4;
        Start = m683plusgK_yJZ4(m678constructorimpl, m678constructorimpl4);
        End = m683plusgK_yJZ4(m678constructorimpl2, m678constructorimpl3);
        int m678constructorimpl5 = m678constructorimpl(16);
        Top = m678constructorimpl5;
        int m678constructorimpl6 = m678constructorimpl(32);
        Bottom = m678constructorimpl6;
        int m683plusgK_yJZ4 = m683plusgK_yJZ4(m678constructorimpl, m678constructorimpl3);
        Left = m683plusgK_yJZ4;
        int m683plusgK_yJZ42 = m683plusgK_yJZ4(m678constructorimpl2, m678constructorimpl4);
        Right = m683plusgK_yJZ42;
        Horizontal = m683plusgK_yJZ4(m683plusgK_yJZ4, m683plusgK_yJZ42);
        Vertical = m683plusgK_yJZ4(m678constructorimpl5, m678constructorimpl6);
    }

    private /* synthetic */ WindowInsetsSides(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ WindowInsetsSides m677boximpl(int i8) {
        return new WindowInsetsSides(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m678constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m679equalsimpl(int i8, Object obj) {
        return (obj instanceof WindowInsetsSides) && i8 == ((WindowInsetsSides) obj).m686unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m680equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hasAny-bkgdKaI$foundation_layout_release, reason: not valid java name */
    public static final boolean m681hasAnybkgdKaI$foundation_layout_release(int i8, int i9) {
        return (i8 & i9) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m682hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: plus-gK_yJZ4, reason: not valid java name */
    public static final int m683plusgK_yJZ4(int i8, int i9) {
        return m678constructorimpl(i8 | i9);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m684toStringimpl(int i8) {
        return "WindowInsetsSides(" + m685valueToStringimpl(i8) + ')';
    }

    /* renamed from: valueToString-impl, reason: not valid java name */
    private static final String m685valueToStringimpl(int i8) {
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
        AbstractC3159y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    private static final void valueToString_impl$lambda$0$appendPlus(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public boolean equals(Object obj) {
        return m679equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m682hashCodeimpl(this.value);
    }

    public String toString() {
        return m684toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m686unboximpl() {
        return this.value;
    }
}
