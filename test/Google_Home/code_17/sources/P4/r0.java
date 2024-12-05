package p4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o6.AbstractC3700N;
import p4.v0;

/* loaded from: classes4.dex */
public class r0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f37703a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37704b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37705c;

    /* renamed from: d, reason: collision with root package name */
    private final o6.w f37706d;

    /* renamed from: e, reason: collision with root package name */
    private final String f37707e;

    /* renamed from: f, reason: collision with root package name */
    private final VisualTransformation f37708f;

    /* renamed from: g, reason: collision with root package name */
    private final o6.w f37709g;

    /* loaded from: classes4.dex */
    public static final class a implements y0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f37710a;

        a(String str) {
            this.f37710a = str;
        }

        @Override // p4.y0
        public boolean a() {
            return !j6.n.u(this.f37710a);
        }

        @Override // p4.y0
        public boolean b() {
            return j6.n.u(this.f37710a);
        }

        @Override // p4.y0
        public boolean c(boolean z8) {
            return false;
        }

        @Override // p4.y0
        public boolean d() {
            return false;
        }

        @Override // p4.y0
        public C getError() {
            return null;
        }
    }

    public /* synthetic */ r0(Integer num, int i8, int i9, o6.w wVar, AbstractC3247p abstractC3247p) {
        this(num, i8, i9, wVar);
    }

    @Override // p4.v0
    public Integer b() {
        return this.f37703a;
    }

    @Override // p4.v0
    public String c(String rawValue) {
        AbstractC3255y.i(rawValue, "rawValue");
        return rawValue;
    }

    @Override // p4.v0
    public VisualTransformation e() {
        return this.f37708f;
    }

    @Override // p4.v0
    public String f() {
        return v0.a.a(this);
    }

    @Override // p4.v0
    public int g() {
        return this.f37704b;
    }

    @Override // p4.v0
    public String h(String displayName) {
        AbstractC3255y.i(displayName, "displayName");
        return displayName;
    }

    @Override // p4.v0
    public int i() {
        return this.f37705c;
    }

    @Override // p4.v0
    public String j(String userTyped) {
        AbstractC3255y.i(userTyped, "userTyped");
        KeyboardType.Companion companion = KeyboardType.Companion;
        if (P5.a0.i(KeyboardType.m4904boximpl(companion.m4923getNumberPjHm6EE()), KeyboardType.m4904boximpl(companion.m4924getNumberPasswordPjHm6EE())).contains(KeyboardType.m4904boximpl(i()))) {
            StringBuilder sb = new StringBuilder();
            int length = userTyped.length();
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = userTyped.charAt(i8);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            AbstractC3255y.h(sb2, "toString(...)");
            return sb2;
        }
        return userTyped;
    }

    @Override // p4.v0
    public String k() {
        return this.f37707e;
    }

    @Override // p4.v0
    public y0 l(String input) {
        AbstractC3255y.i(input, "input");
        return new a(input);
    }

    @Override // p4.v0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public o6.w a() {
        return this.f37709g;
    }

    @Override // p4.v0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public o6.w d() {
        return this.f37706d;
    }

    private r0(Integer num, int i8, int i9, o6.w trailingIcon) {
        AbstractC3255y.i(trailingIcon, "trailingIcon");
        this.f37703a = num;
        this.f37704b = i8;
        this.f37705c = i9;
        this.f37706d = trailingIcon;
        this.f37707e = "generic_text";
        this.f37709g = AbstractC3700N.a(Boolean.FALSE);
    }

    public /* synthetic */ r0(Integer num, int i8, int i9, o6.w wVar, int i10, AbstractC3247p abstractC3247p) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? KeyboardCapitalization.Companion.m4903getWordsIUNYP9k() : i8, (i10 & 4) != 0 ? KeyboardType.Companion.m4927getTextPjHm6EE() : i9, (i10 & 8) != 0 ? AbstractC3700N.a(null) : wVar, null);
    }
}
