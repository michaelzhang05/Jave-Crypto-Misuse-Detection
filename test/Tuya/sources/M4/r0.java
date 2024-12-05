package m4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3351M;
import m4.v0;

/* loaded from: classes4.dex */
public class r0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f35677a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35678b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35679c;

    /* renamed from: d, reason: collision with root package name */
    private final l6.v f35680d;

    /* renamed from: e, reason: collision with root package name */
    private final String f35681e;

    /* renamed from: f, reason: collision with root package name */
    private final VisualTransformation f35682f;

    /* renamed from: g, reason: collision with root package name */
    private final l6.v f35683g;

    /* loaded from: classes4.dex */
    public static final class a implements y0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f35684a;

        a(String str) {
            this.f35684a = str;
        }

        @Override // m4.y0
        public boolean a() {
            return !g6.n.u(this.f35684a);
        }

        @Override // m4.y0
        public boolean b() {
            return g6.n.u(this.f35684a);
        }

        @Override // m4.y0
        public boolean c(boolean z8) {
            return false;
        }

        @Override // m4.y0
        public boolean d() {
            return false;
        }

        @Override // m4.y0
        public C getError() {
            return null;
        }
    }

    public /* synthetic */ r0(Integer num, int i8, int i9, l6.v vVar, AbstractC3151p abstractC3151p) {
        this(num, i8, i9, vVar);
    }

    @Override // m4.v0
    public Integer b() {
        return this.f35677a;
    }

    @Override // m4.v0
    public VisualTransformation d() {
        return this.f35682f;
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
        return this.f35678b;
    }

    @Override // m4.v0
    public String h(String displayName) {
        AbstractC3159y.i(displayName, "displayName");
        return displayName;
    }

    @Override // m4.v0
    public int i() {
        return this.f35679c;
    }

    @Override // m4.v0
    public String j(String userTyped) {
        AbstractC3159y.i(userTyped, "userTyped");
        KeyboardType.Companion companion = KeyboardType.Companion;
        if (M5.a0.i(KeyboardType.m4899boximpl(companion.m4918getNumberPjHm6EE()), KeyboardType.m4899boximpl(companion.m4919getNumberPasswordPjHm6EE())).contains(KeyboardType.m4899boximpl(i()))) {
            StringBuilder sb = new StringBuilder();
            int length = userTyped.length();
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = userTyped.charAt(i8);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            AbstractC3159y.h(sb2, "toString(...)");
            return sb2;
        }
        return userTyped;
    }

    @Override // m4.v0
    public String k() {
        return this.f35681e;
    }

    @Override // m4.v0
    public y0 l(String input) {
        AbstractC3159y.i(input, "input");
        return new a(input);
    }

    @Override // m4.v0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public l6.v a() {
        return this.f35683g;
    }

    @Override // m4.v0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public l6.v c() {
        return this.f35680d;
    }

    private r0(Integer num, int i8, int i9, l6.v trailingIcon) {
        AbstractC3159y.i(trailingIcon, "trailingIcon");
        this.f35677a = num;
        this.f35678b = i8;
        this.f35679c = i9;
        this.f35680d = trailingIcon;
        this.f35681e = "generic_text";
        this.f35683g = AbstractC3351M.a(Boolean.FALSE);
    }

    public /* synthetic */ r0(Integer num, int i8, int i9, l6.v vVar, int i10, AbstractC3151p abstractC3151p) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? KeyboardCapitalization.Companion.m4898getWordsIUNYP9k() : i8, (i10 & 4) != 0 ? KeyboardType.Companion.m4922getTextPjHm6EE() : i9, (i10 & 8) != 0 ? AbstractC3351M.a(null) : vVar, null);
    }
}
