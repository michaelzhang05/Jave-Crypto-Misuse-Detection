package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public final class Strings {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int NavigationMenu = m1338constructorimpl(0);
    private static final int CloseDrawer = m1338constructorimpl(1);
    private static final int CloseSheet = m1338constructorimpl(2);
    private static final int DefaultErrorMessage = m1338constructorimpl(3);
    private static final int ExposedDropdownMenu = m1338constructorimpl(4);
    private static final int SliderRangeStart = m1338constructorimpl(5);
    private static final int SliderRangeEnd = m1338constructorimpl(6);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getCloseDrawer-UdPEhr4, reason: not valid java name */
        public final int m1344getCloseDrawerUdPEhr4() {
            return Strings.CloseDrawer;
        }

        /* renamed from: getCloseSheet-UdPEhr4, reason: not valid java name */
        public final int m1345getCloseSheetUdPEhr4() {
            return Strings.CloseSheet;
        }

        /* renamed from: getDefaultErrorMessage-UdPEhr4, reason: not valid java name */
        public final int m1346getDefaultErrorMessageUdPEhr4() {
            return Strings.DefaultErrorMessage;
        }

        /* renamed from: getExposedDropdownMenu-UdPEhr4, reason: not valid java name */
        public final int m1347getExposedDropdownMenuUdPEhr4() {
            return Strings.ExposedDropdownMenu;
        }

        /* renamed from: getNavigationMenu-UdPEhr4, reason: not valid java name */
        public final int m1348getNavigationMenuUdPEhr4() {
            return Strings.NavigationMenu;
        }

        /* renamed from: getSliderRangeEnd-UdPEhr4, reason: not valid java name */
        public final int m1349getSliderRangeEndUdPEhr4() {
            return Strings.SliderRangeEnd;
        }

        /* renamed from: getSliderRangeStart-UdPEhr4, reason: not valid java name */
        public final int m1350getSliderRangeStartUdPEhr4() {
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
    public static final /* synthetic */ Strings m1337boximpl(int i8) {
        return new Strings(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m1338constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1339equalsimpl(int i8, Object obj) {
        return (obj instanceof Strings) && i8 == ((Strings) obj).m1343unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1340equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1341hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1342toStringimpl(int i8) {
        return "Strings(value=" + i8 + ')';
    }

    public boolean equals(Object obj) {
        return m1339equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1341hashCodeimpl(this.value);
    }

    public String toString() {
        return m1342toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m1343unboximpl() {
        return this.value;
    }
}
