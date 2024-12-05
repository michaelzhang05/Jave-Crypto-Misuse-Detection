package androidx.compose.ui.semantics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3247p;

@Immutable
/* loaded from: classes.dex */
public final class Role {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Button = m4522constructorimpl(0);
    private static final int Checkbox = m4522constructorimpl(1);
    private static final int Switch = m4522constructorimpl(2);
    private static final int RadioButton = m4522constructorimpl(3);
    private static final int Tab = m4522constructorimpl(4);
    private static final int Image = m4522constructorimpl(5);
    private static final int DropdownList = m4522constructorimpl(6);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getButton-o7Vup1c, reason: not valid java name */
        public final int m4528getButtono7Vup1c() {
            return Role.Button;
        }

        /* renamed from: getCheckbox-o7Vup1c, reason: not valid java name */
        public final int m4529getCheckboxo7Vup1c() {
            return Role.Checkbox;
        }

        /* renamed from: getDropdownList-o7Vup1c, reason: not valid java name */
        public final int m4530getDropdownListo7Vup1c() {
            return Role.DropdownList;
        }

        /* renamed from: getImage-o7Vup1c, reason: not valid java name */
        public final int m4531getImageo7Vup1c() {
            return Role.Image;
        }

        /* renamed from: getRadioButton-o7Vup1c, reason: not valid java name */
        public final int m4532getRadioButtono7Vup1c() {
            return Role.RadioButton;
        }

        /* renamed from: getSwitch-o7Vup1c, reason: not valid java name */
        public final int m4533getSwitcho7Vup1c() {
            return Role.Switch;
        }

        /* renamed from: getTab-o7Vup1c, reason: not valid java name */
        public final int m4534getTabo7Vup1c() {
            return Role.Tab;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ Role(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Role m4521boximpl(int i8) {
        return new Role(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4522constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4523equalsimpl(int i8, Object obj) {
        return (obj instanceof Role) && i8 == ((Role) obj).m4527unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4524equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4525hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4526toStringimpl(int i8) {
        if (m4524equalsimpl0(i8, Button)) {
            return "Button";
        }
        if (m4524equalsimpl0(i8, Checkbox)) {
            return "Checkbox";
        }
        if (m4524equalsimpl0(i8, Switch)) {
            return "Switch";
        }
        if (m4524equalsimpl0(i8, RadioButton)) {
            return "RadioButton";
        }
        if (m4524equalsimpl0(i8, Tab)) {
            return "Tab";
        }
        if (m4524equalsimpl0(i8, Image)) {
            return "Image";
        }
        if (m4524equalsimpl0(i8, DropdownList)) {
            return "DropdownList";
        }
        return "Unknown";
    }

    public boolean equals(Object obj) {
        return m4523equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4525hashCodeimpl(this.value);
    }

    public String toString() {
        return m4526toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4527unboximpl() {
        return this.value;
    }
}
