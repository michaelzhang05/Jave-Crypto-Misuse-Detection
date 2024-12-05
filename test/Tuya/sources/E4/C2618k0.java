package e4;

import M5.AbstractC1239l;
import M5.AbstractC1246t;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import d6.C2559c;
import j2.AbstractC3053E;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import m4.A0;
import m4.v0;
import m4.x0;
import m4.z0;

/* renamed from: e4.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2618k0 implements m4.v0 {

    /* renamed from: h, reason: collision with root package name */
    private static final a f30725h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f30726i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final List f30727j = AbstractC1246t.G0(AbstractC1246t.F0(new C2559c('0', '9'), new C2559c('a', 'z')), new C2559c('A', 'Z'));

    /* renamed from: a, reason: collision with root package name */
    private final int f30728a = KeyboardCapitalization.Companion.m4895getCharactersIUNYP9k();

    /* renamed from: b, reason: collision with root package name */
    private final String f30729b = "iban";

    /* renamed from: c, reason: collision with root package name */
    private final int f30730c = b4.n.f14748r;

    /* renamed from: d, reason: collision with root package name */
    private final int f30731d = KeyboardType.Companion.m4915getAsciiPjHm6EE();

    /* renamed from: e, reason: collision with root package name */
    private final l6.v f30732e = AbstractC3351M.a(new x0.c(j2.z.f33148o, null, true, null, 10, null));

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f30733f = AbstractC3351M.a(Boolean.FALSE);

    /* renamed from: g, reason: collision with root package name */
    private final VisualTransformation f30734g = new VisualTransformation() { // from class: e4.j0
        @Override // androidx.compose.ui.text.input.VisualTransformation
        public final TransformedText filter(AnnotatedString annotatedString) {
            TransformedText p8;
            p8 = C2618k0.p(annotatedString);
            return p8;
        }
    };

    /* renamed from: e4.k0$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e4.k0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f30735a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(g6.h it) {
            AbstractC3159y.i(it, "it");
            return String.valueOf(g6.n.Q0(it.getValue()) - '7');
        }
    }

    /* renamed from: e4.k0$c */
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
        String upperCase = (g6.n.V0(str, str.length() - 4) + g6.n.U0(str, 4)).toUpperCase(Locale.ROOT);
        AbstractC3159y.h(upperCase, "toUpperCase(...)");
        return new BigInteger(new g6.j("[A-Z]").g(upperCase, b.f30735a)).mod(new BigInteger("97")).equals(BigInteger.ONE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransformedText p(AnnotatedString text) {
        AbstractC3159y.i(text, "text");
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
        AbstractC3159y.h(sb2, "toString(...)");
        return new TransformedText(new AnnotatedString(sb2, null, null, 6, null), new c());
    }

    @Override // m4.v0
    public InterfaceC3349K a() {
        return this.f30733f;
    }

    @Override // m4.v0
    public Integer b() {
        return Integer.valueOf(this.f30730c);
    }

    @Override // m4.v0
    public VisualTransformation d() {
        return this.f30734g;
    }

    @Override // m4.v0
    public String e() {
        return v0.a.a(this);
    }

    @Override // m4.v0
    public String f(String rawValue) {
        AbstractC3159y.i(rawValue, "rawValue");
        return rawValue;
    }

    @Override // m4.v0
    public int g() {
        return this.f30728a;
    }

    @Override // m4.v0
    public String h(String displayName) {
        AbstractC3159y.i(displayName, "displayName");
        return displayName;
    }

    @Override // m4.v0
    public int i() {
        return this.f30731d;
    }

    @Override // m4.v0
    public String j(String userTyped) {
        AbstractC3159y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (f30727j.contains(Character.valueOf(charAt))) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "toString(...)");
        String upperCase = g6.n.U0(sb2, 34).toUpperCase(Locale.ROOT);
        AbstractC3159y.h(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @Override // m4.v0
    public String k() {
        return this.f30729b;
    }

    @Override // m4.v0
    public m4.y0 l(String input) {
        AbstractC3159y.i(input, "input");
        if (g6.n.u(input)) {
            return z0.a.f35857c;
        }
        String upperCase = g6.n.U0(input, 2).toUpperCase(Locale.ROOT);
        AbstractC3159y.h(upperCase, "toUpperCase(...)");
        for (int i8 = 0; i8 < upperCase.length(); i8++) {
            if (Character.isDigit(upperCase.charAt(i8))) {
                return new z0.c(b4.n.f14754u, null, false, 6, null);
            }
        }
        if (upperCase.length() < 2) {
            return new z0.b(b4.n.f14750s);
        }
        String[] iSOCountries = Locale.getISOCountries();
        AbstractC3159y.h(iSOCountries, "getISOCountries(...)");
        if (!AbstractC1239l.W(iSOCountries, upperCase)) {
            return new z0.c(b4.n.f14752t, new String[]{upperCase}, false, 4, null);
        }
        if (input.length() < 8) {
            return new z0.b(b4.n.f14750s);
        }
        if (o(input)) {
            if (input.length() == 34) {
                return A0.a.f34942a;
            }
            return A0.b.f34943a;
        }
        return new z0.b(AbstractC3053E.f32907t0);
    }

    @Override // m4.v0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public l6.v c() {
        return this.f30732e;
    }
}
