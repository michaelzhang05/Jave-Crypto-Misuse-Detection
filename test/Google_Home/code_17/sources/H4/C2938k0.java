package h4;

import P5.AbstractC1371l;
import P5.AbstractC1378t;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import g6.C2883c;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m2.AbstractC3407E;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import p4.A0;
import p4.v0;
import p4.x0;
import p4.z0;

/* renamed from: h4.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2938k0 implements p4.v0 {

    /* renamed from: h, reason: collision with root package name */
    private static final a f32646h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f32647i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final List f32648j = AbstractC1378t.G0(AbstractC1378t.F0(new C2883c('0', '9'), new C2883c('a', 'z')), new C2883c('A', 'Z'));

    /* renamed from: a, reason: collision with root package name */
    private final int f32649a = KeyboardCapitalization.Companion.m4900getCharactersIUNYP9k();

    /* renamed from: b, reason: collision with root package name */
    private final String f32650b = "iban";

    /* renamed from: c, reason: collision with root package name */
    private final int f32651c = e4.n.f31754r;

    /* renamed from: d, reason: collision with root package name */
    private final int f32652d = KeyboardType.Companion.m4920getAsciiPjHm6EE();

    /* renamed from: e, reason: collision with root package name */
    private final o6.w f32653e = AbstractC3700N.a(new x0.c(m2.z.f35124o, null, true, null, 10, null));

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3698L f32654f = AbstractC3700N.a(Boolean.FALSE);

    /* renamed from: g, reason: collision with root package name */
    private final VisualTransformation f32655g = new VisualTransformation() { // from class: h4.j0
        @Override // androidx.compose.ui.text.input.VisualTransformation
        public final TransformedText filter(AnnotatedString annotatedString) {
            TransformedText p8;
            p8 = C2938k0.p(annotatedString);
            return p8;
        }
    };

    /* renamed from: h4.k0$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h4.k0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f32656a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(j6.h it) {
            AbstractC3255y.i(it, "it");
            return String.valueOf(j6.n.Q0(it.getValue()) - '7');
        }
    }

    /* renamed from: h4.k0$c */
    /* loaded from: classes4.dex */
    public static final class c implements OffsetMapping {
        c() {
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int i8) {
            return i8 + (i8 / 4);
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int i8) {
            return i8 - (i8 / 5);
        }
    }

    private final boolean o(String str) {
        String upperCase = (j6.n.V0(str, str.length() - 4) + j6.n.U0(str, 4)).toUpperCase(Locale.ROOT);
        AbstractC3255y.h(upperCase, "toUpperCase(...)");
        return new BigInteger(new j6.j("[A-Z]").g(upperCase, b.f32656a)).mod(new BigInteger("97")).equals(BigInteger.ONE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransformedText p(AnnotatedString text) {
        AbstractC3255y.i(text, "text");
        StringBuilder sb = new StringBuilder();
        String text2 = text.getText();
        int i8 = 0;
        int i9 = 0;
        while (i8 < text2.length()) {
            int i10 = i9 + 1;
            sb.append(text2.charAt(i8));
            if (i9 % 4 == 3 && i9 < 33) {
                sb.append(" ");
            }
            i8++;
            i9 = i10;
        }
        String sb2 = sb.toString();
        AbstractC3255y.h(sb2, "toString(...)");
        return new TransformedText(new AnnotatedString(sb2, null, null, 6, null), new c());
    }

    @Override // p4.v0
    public InterfaceC3698L a() {
        return this.f32654f;
    }

    @Override // p4.v0
    public Integer b() {
        return Integer.valueOf(this.f32651c);
    }

    @Override // p4.v0
    public String c(String rawValue) {
        AbstractC3255y.i(rawValue, "rawValue");
        return rawValue;
    }

    @Override // p4.v0
    public VisualTransformation e() {
        return this.f32655g;
    }

    @Override // p4.v0
    public String f() {
        return v0.a.a(this);
    }

    @Override // p4.v0
    public int g() {
        return this.f32649a;
    }

    @Override // p4.v0
    public String h(String displayName) {
        AbstractC3255y.i(displayName, "displayName");
        return displayName;
    }

    @Override // p4.v0
    public int i() {
        return this.f32652d;
    }

    @Override // p4.v0
    public String j(String userTyped) {
        AbstractC3255y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (f32648j.contains(Character.valueOf(charAt))) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3255y.h(sb2, "toString(...)");
        String upperCase = j6.n.U0(sb2, 34).toUpperCase(Locale.ROOT);
        AbstractC3255y.h(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @Override // p4.v0
    public String k() {
        return this.f32650b;
    }

    @Override // p4.v0
    public p4.y0 l(String input) {
        AbstractC3255y.i(input, "input");
        if (j6.n.u(input)) {
            return z0.a.f37883c;
        }
        String upperCase = j6.n.U0(input, 2).toUpperCase(Locale.ROOT);
        AbstractC3255y.h(upperCase, "toUpperCase(...)");
        for (int i8 = 0; i8 < upperCase.length(); i8++) {
            if (Character.isDigit(upperCase.charAt(i8))) {
                return new z0.c(e4.n.f31760u, null, false, 6, null);
            }
        }
        if (upperCase.length() < 2) {
            return new z0.b(e4.n.f31756s);
        }
        String[] iSOCountries = Locale.getISOCountries();
        AbstractC3255y.h(iSOCountries, "getISOCountries(...)");
        if (!AbstractC1371l.W(iSOCountries, upperCase)) {
            return new z0.c(e4.n.f31758t, new String[]{upperCase}, false, 4, null);
        }
        if (input.length() < 8) {
            return new z0.b(e4.n.f31756s);
        }
        if (o(input)) {
            if (input.length() == 34) {
                return A0.a.f36968a;
            }
            return A0.b.f36969a;
        }
        return new z0.b(AbstractC3407E.f34883t0);
    }

    @Override // p4.v0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public o6.w d() {
        return this.f32653e;
    }
}
