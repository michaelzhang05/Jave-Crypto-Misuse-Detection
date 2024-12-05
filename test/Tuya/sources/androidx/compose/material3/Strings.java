package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public final class Strings {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int NavigationMenu = m1779constructorimpl(0);
    private static final int CloseDrawer = m1779constructorimpl(1);
    private static final int CloseSheet = m1779constructorimpl(2);
    private static final int DefaultErrorMessage = m1779constructorimpl(3);
    private static final int ExposedDropdownMenu = m1779constructorimpl(4);
    private static final int SliderRangeStart = m1779constructorimpl(5);
    private static final int SliderRangeEnd = m1779constructorimpl(6);
    private static final int Dialog = m1779constructorimpl(7);
    private static final int MenuExpanded = m1779constructorimpl(8);
    private static final int MenuCollapsed = m1779constructorimpl(9);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getCloseDrawer-adMyvUU, reason: not valid java name */
        public final int m1785getCloseDraweradMyvUU() {
            return Strings.CloseDrawer;
        }

        /* renamed from: getCloseSheet-adMyvUU, reason: not valid java name */
        public final int m1786getCloseSheetadMyvUU() {
            return Strings.CloseSheet;
        }

        /* renamed from: getDefaultErrorMessage-adMyvUU, reason: not valid java name */
        public final int m1787getDefaultErrorMessageadMyvUU() {
            return Strings.DefaultErrorMessage;
        }

        /* renamed from: getDialog-adMyvUU, reason: not valid java name */
        public final int m1788getDialogadMyvUU() {
            return Strings.Dialog;
        }

        /* renamed from: getExposedDropdownMenu-adMyvUU, reason: not valid java name */
        public final int m1789getExposedDropdownMenuadMyvUU() {
            return Strings.ExposedDropdownMenu;
        }

        /* renamed from: getMenuCollapsed-adMyvUU, reason: not valid java name */
        public final int m1790getMenuCollapsedadMyvUU() {
            return Strings.MenuCollapsed;
        }

        /* renamed from: getMenuExpanded-adMyvUU, reason: not valid java name */
        public final int m1791getMenuExpandedadMyvUU() {
            return Strings.MenuExpanded;
        }

        /* renamed from: getNavigationMenu-adMyvUU, reason: not valid java name */
        public final int m1792getNavigationMenuadMyvUU() {
            return Strings.NavigationMenu;
        }

        /* renamed from: getSliderRangeEnd-adMyvUU, reason: not valid java name */
        public final int m1793getSliderRangeEndadMyvUU() {
            return Strings.SliderRangeEnd;
        }

        /* renamed from: getSliderRangeStart-adMyvUU, reason: not valid java name */
        public final int m1794getSliderRangeStartadMyvUU() {
            return Strings.SliderRangeStart;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    private /* synthetic */ Strings(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Strings m1778boximpl(int i8) {
        return new Strings(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m1779constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1780equalsimpl(int i8, Object obj) {
        return (obj instanceof Strings) && i8 == ((Strings) obj).m1784unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1781equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1782hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1783toStringimpl(int i8) {
        return "Strings(value=" + i8 + ')';
    }

    public boolean equals(Object obj) {
        return m1780equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1782hashCodeimpl(this.value);
    }

    public String toString() {
        return m1783toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1784unboximpl() {
        return this.value;
    }
}
