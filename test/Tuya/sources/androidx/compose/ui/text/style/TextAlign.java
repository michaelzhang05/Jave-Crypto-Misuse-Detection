package androidx.compose.ui.text.style;

import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public final class TextAlign {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Left = m5076constructorimpl(1);
    private static final int Right = m5076constructorimpl(2);
    private static final int Center = m5076constructorimpl(3);
    private static final int Justify = m5076constructorimpl(4);
    private static final int Start = m5076constructorimpl(5);
    private static final int End = m5076constructorimpl(6);
    private static final int Unspecified = m5076constructorimpl(Integer.MIN_VALUE);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getCenter-e0LSkKk, reason: not valid java name */
        public final int m5082getCentere0LSkKk() {
            return TextAlign.Center;
        }

        /* renamed from: getEnd-e0LSkKk, reason: not valid java name */
        public final int m5083getEnde0LSkKk() {
            return TextAlign.End;
        }

        /* renamed from: getJustify-e0LSkKk, reason: not valid java name */
        public final int m5084getJustifye0LSkKk() {
            return TextAlign.Justify;
        }

        /* renamed from: getLeft-e0LSkKk, reason: not valid java name */
        public final int m5085getLefte0LSkKk() {
            return TextAlign.Left;
        }

        /* renamed from: getRight-e0LSkKk, reason: not valid java name */
        public final int m5086getRighte0LSkKk() {
            return TextAlign.Right;
        }

        /* renamed from: getStart-e0LSkKk, reason: not valid java name */
        public final int m5087getStarte0LSkKk() {
            return TextAlign.Start;
        }

        /* renamed from: getUnspecified-e0LSkKk, reason: not valid java name */
        public final int m5088getUnspecifiede0LSkKk() {
            return TextAlign.Unspecified;
        }

        public final List<TextAlign> values() {
            return AbstractC1246t.p(TextAlign.m5075boximpl(m5085getLefte0LSkKk()), TextAlign.m5075boximpl(m5086getRighte0LSkKk()), TextAlign.m5075boximpl(m5082getCentere0LSkKk()), TextAlign.m5075boximpl(m5084getJustifye0LSkKk()), TextAlign.m5075boximpl(m5087getStarte0LSkKk()), TextAlign.m5075boximpl(m5083getEnde0LSkKk()));
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ TextAlign(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextAlign m5075boximpl(int i8) {
        return new TextAlign(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5076constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5077equalsimpl(int i8, Object obj) {
        return (obj instanceof TextAlign) && i8 == ((TextAlign) obj).m5081unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5078equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5079hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5080toStringimpl(int i8) {
        if (m5078equalsimpl0(i8, Left)) {
            return "Left";
        }
        if (m5078equalsimpl0(i8, Right)) {
            return "Right";
        }
        if (m5078equalsimpl0(i8, Center)) {
            return "Center";
        }
        if (m5078equalsimpl0(i8, Justify)) {
            return "Justify";
        }
        if (m5078equalsimpl0(i8, Start)) {
            return "Start";
        }
        if (m5078equalsimpl0(i8, End)) {
            return "End";
        }
        if (m5078equalsimpl0(i8, Unspecified)) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m5077equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m5079hashCodeimpl(this.value);
    }

    public String toString() {
        return m5080toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5081unboximpl() {
        return this.value;
    }
}
