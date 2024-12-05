package androidx.compose.ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3247p;

/* loaded from: classes.dex */
public final class KeyboardType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Text = m4905constructorimpl(1);
    private static final int Ascii = m4905constructorimpl(2);
    private static final int Number = m4905constructorimpl(3);
    private static final int Phone = m4905constructorimpl(4);
    private static final int Uri = m4905constructorimpl(5);
    private static final int Email = m4905constructorimpl(6);
    private static final int Password = m4905constructorimpl(7);
    private static final int NumberPassword = m4905constructorimpl(8);
    private static final int Decimal = m4905constructorimpl(9);

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        /* renamed from: getAscii-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4911getAsciiPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getDecimal-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4912getDecimalPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getEmail-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4913getEmailPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getNumber-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4914getNumberPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getNumberPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4915getNumberPasswordPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4916getPasswordPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getPhone-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4917getPhonePjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getText-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4918getTextPjHm6EE$annotations() {
        }

        @Stable
        /* renamed from: getUri-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m4919getUriPjHm6EE$annotations() {
        }

        /* renamed from: getAscii-PjHm6EE, reason: not valid java name */
        public final int m4920getAsciiPjHm6EE() {
            return KeyboardType.Ascii;
        }

        /* renamed from: getDecimal-PjHm6EE, reason: not valid java name */
        public final int m4921getDecimalPjHm6EE() {
            return KeyboardType.Decimal;
        }

        /* renamed from: getEmail-PjHm6EE, reason: not valid java name */
        public final int m4922getEmailPjHm6EE() {
            return KeyboardType.Email;
        }

        /* renamed from: getNumber-PjHm6EE, reason: not valid java name */
        public final int m4923getNumberPjHm6EE() {
            return KeyboardType.Number;
        }

        /* renamed from: getNumberPassword-PjHm6EE, reason: not valid java name */
        public final int m4924getNumberPasswordPjHm6EE() {
            return KeyboardType.NumberPassword;
        }

        /* renamed from: getPassword-PjHm6EE, reason: not valid java name */
        public final int m4925getPasswordPjHm6EE() {
            return KeyboardType.Password;
        }

        /* renamed from: getPhone-PjHm6EE, reason: not valid java name */
        public final int m4926getPhonePjHm6EE() {
            return KeyboardType.Phone;
        }

        /* renamed from: getText-PjHm6EE, reason: not valid java name */
        public final int m4927getTextPjHm6EE() {
            return KeyboardType.Text;
        }

        /* renamed from: getUri-PjHm6EE, reason: not valid java name */
        public final int m4928getUriPjHm6EE() {
            return KeyboardType.Uri;
        }

        public /* synthetic */ Companion(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    private /* synthetic */ KeyboardType(int i8) {
        this.value = i8;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardType m4904boximpl(int i8) {
        return new KeyboardType(i8);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4905constructorimpl(int i8) {
        return i8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4906equalsimpl(int i8, Object obj) {
        return (obj instanceof KeyboardType) && i8 == ((KeyboardType) obj).m4910unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4907equalsimpl0(int i8, int i9) {
        return i8 == i9;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4908hashCodeimpl(int i8) {
        return i8;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4909toStringimpl(int i8) {
        if (m4907equalsimpl0(i8, Text)) {
            return "Text";
        }
        if (m4907equalsimpl0(i8, Ascii)) {
            return "Ascii";
        }
        if (m4907equalsimpl0(i8, Number)) {
            return "Number";
        }
        if (m4907equalsimpl0(i8, Phone)) {
            return "Phone";
        }
        if (m4907equalsimpl0(i8, Uri)) {
            return "Uri";
        }
        if (m4907equalsimpl0(i8, Email)) {
            return "Email";
        }
        if (m4907equalsimpl0(i8, Password)) {
            return "Password";
        }
        if (m4907equalsimpl0(i8, NumberPassword)) {
            return "NumberPassword";
        }
        if (m4907equalsimpl0(i8, Decimal)) {
            return "Decimal";
        }
        return "Invalid";
    }

    public boolean equals(Object obj) {
        return m4906equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4908hashCodeimpl(this.value);
    }

    public String toString() {
        return m4909toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4910unboximpl() {
        return this.value;
    }
}
