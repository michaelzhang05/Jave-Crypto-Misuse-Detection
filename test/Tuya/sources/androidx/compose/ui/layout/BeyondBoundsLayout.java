package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes.dex */
public interface BeyondBoundsLayout {

    /* loaded from: classes.dex */
    public interface BeyondBoundsScope {
        boolean getHasMoreContent();
    }

    /* loaded from: classes.dex */
    public static final class LayoutDirection {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Before = m4109constructorimpl(1);
        private static final int After = m4109constructorimpl(2);
        private static final int Left = m4109constructorimpl(3);
        private static final int Right = m4109constructorimpl(4);
        private static final int Above = m4109constructorimpl(5);
        private static final int Below = m4109constructorimpl(6);

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getAbove-hoxUOeE, reason: not valid java name */
            public final int m4115getAbovehoxUOeE() {
                return LayoutDirection.Above;
            }

            /* renamed from: getAfter-hoxUOeE, reason: not valid java name */
            public final int m4116getAfterhoxUOeE() {
                return LayoutDirection.After;
            }

            /* renamed from: getBefore-hoxUOeE, reason: not valid java name */
            public final int m4117getBeforehoxUOeE() {
                return LayoutDirection.Before;
            }

            /* renamed from: getBelow-hoxUOeE, reason: not valid java name */
            public final int m4118getBelowhoxUOeE() {
                return LayoutDirection.Below;
            }

            /* renamed from: getLeft-hoxUOeE, reason: not valid java name */
            public final int m4119getLefthoxUOeE() {
                return LayoutDirection.Left;
            }

            /* renamed from: getRight-hoxUOeE, reason: not valid java name */
            public final int m4120getRighthoxUOeE() {
                return LayoutDirection.Right;
            }

            public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        private /* synthetic */ LayoutDirection(int i8) {
            this.value = i8;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ LayoutDirection m4108boximpl(int i8) {
            return new LayoutDirection(i8);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m4109constructorimpl(int i8) {
            return i8;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m4110equalsimpl(int i8, Object obj) {
            return (obj instanceof LayoutDirection) && i8 == ((LayoutDirection) obj).m4114unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4111equalsimpl0(int i8, int i9) {
            return i8 == i9;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m4112hashCodeimpl(int i8) {
            return i8;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m4113toStringimpl(int i8) {
            if (m4111equalsimpl0(i8, Before)) {
                return "Before";
            }
            if (m4111equalsimpl0(i8, After)) {
                return "After";
            }
            if (m4111equalsimpl0(i8, Left)) {
                return "Left";
            }
            if (m4111equalsimpl0(i8, Right)) {
                return "Right";
            }
            if (m4111equalsimpl0(i8, Above)) {
                return "Above";
            }
            if (m4111equalsimpl0(i8, Below)) {
                return "Below";
            }
            return "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return m4110equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m4112hashCodeimpl(this.value);
        }

        public String toString() {
            return m4113toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m4114unboximpl() {
            return this.value;
        }
    }

    /* renamed from: layout-o7g1Pn8 */
    <T> T mo752layouto7g1Pn8(int i8, Function1 function1);
}
