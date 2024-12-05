package androidx.compose.ui.text.style;

import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class TextAlign {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Left = m5081constructorimpl(1);
    private static final int Right = m5081constructorimpl(2);
    private static final int Center = m5081constructorimpl(3);
    private static final int Justify = m5081constructorimpl(4);
    private static final int Start = m5081constructorimpl(5);
    private static final int End = m5081constructorimpl(6);
    private static final int Unspecified = m5081constructorimpl(Integer.MIN_VALUE);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getCenter-e0LSkKk, reason: not valid java name */
        public final int m5087getCentere0LSkKk() {
            return TextAlign.Center;
        }

        /* renamed from: getEnd-e0LSkKk, reason: not valid java name */
        public final int m5088getEnde0LSkKk() {
            return TextAlign.End;
        }

        /* renamed from: getJustify-e0LSkKk, reason: not valid java name */
        public final int m5089getJustifye0LSkKk() {
            return TextAlign.Justify;
        }

        /* renamed from: getLeft-e0LSkKk, reason: not valid java name */
        public final int m5090getLefte0LSkKk() {
            return TextAlign.Left;
        }

        /* renamed from: getRight-e0LSkKk, reason: not valid java name */
        public final int m5091getRighte0LSkKk() {
            return TextAlign.Right;
        }

        /* renamed from: getStart-e0LSkKk, reason: not valid java name */
        public final int m5092getStarte0LSkKk() {
            return TextAlign.Start;
        }

        /* renamed from: getUnspecified-e0LSkKk, reason: not valid java name */
        public final int m5093getUnspecifiede0LSkKk() {
            return TextAlign.Unspecified;
        }

        public final List<TextAlign> values() {
            return AbstractC1378t.p(TextAlign.m5080boximpl(m5090getLefte0LSkKk()), TextAlign.m5080boximpl(m5091getRighte0LSkKk()), TextAlign.m5080boximpl(m5087getCentere0LSkKk()), TextAlign.m5080boximpl(m5089getJustifye0LSkKk()), TextAlign.m5080boximpl(m5092getStarte0LSkKk()), TextAlign.m5080boximpl(m5088getEnde0LSkKk()));
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ TextAlign(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextAlign m5080boximpl(int i8) {
        return new TextAlign(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5081constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5082equalsimpl(int i8, Object obj) {
        return (obj instanceof TextAlign) && i8 == ((TextAlign) obj).m5086unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5083equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5084hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5085toStringimpl(int i8) {
        if (m5083equalsimpl0(i8, Left)) {
            return "Left";
        }
        if (m5083equalsimpl0(i8, Right)) {
            return "Right";
        }
        if (m5083equalsimpl0(i8, Center)) {
            return "Center";
        }
        if (m5083equalsimpl0(i8, Justify)) {
            return "Justify";
        }
        if (m5083equalsimpl0(i8, Start)) {
            return "Start";
        }
        if (m5083equalsimpl0(i8, End)) {
            return "End";
        }
        if (m5083equalsimpl0(i8, Unspecified)) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m5082equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5084hashCodeimpl(this.value);
    }

    public String toString() {
        return m5085toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5086unboximpl() {
        return this.value;
    }
}
