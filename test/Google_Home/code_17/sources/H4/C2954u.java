package h4;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import com.stripe.android.view.C2663s;
import g6.C2883c;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3407E;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import p4.A0;
import p4.v0;
import p4.z0;

/* renamed from: h4.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2954u implements p4.v0 {

    /* renamed from: i, reason: collision with root package name */
    private static final a f32752i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f32753j = 8;

    /* renamed from: k, reason: collision with root package name */
    private static final C2883c f32754k = new C2883c('0', '9');

    /* renamed from: a, reason: collision with root package name */
    private final List f32755a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32756b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32757c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f32758d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3698L f32759e;

    /* renamed from: f, reason: collision with root package name */
    private final int f32760f;

    /* renamed from: g, reason: collision with root package name */
    private final int f32761g;

    /* renamed from: h, reason: collision with root package name */
    private final VisualTransformation f32762h;

    /* renamed from: h4.u$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: h4.u$b */
    /* loaded from: classes4.dex */
    public static final class b implements OffsetMapping {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32763a;

        b(String str) {
            this.f32763a = str;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int originalToTransformed(int i8) {
            if (i8 > 2) {
                return i8 + this.f32763a.length();
            }
            return i8;
        }

        @Override // androidx.compose.ui.text.input.OffsetMapping
        public int transformedToOriginal(int i8) {
            if (i8 > 3) {
                return i8 - this.f32763a.length();
            }
            return i8;
        }
    }

    public C2954u(List banks) {
        AbstractC3255y.i(banks, "banks");
        this.f32755a = banks;
        this.f32756b = KeyboardCapitalization.Companion.m4901getNoneIUNYP9k();
        this.f32757c = "bsb";
        this.f32758d = AbstractC3700N.a(null);
        this.f32759e = AbstractC3700N.a(Boolean.FALSE);
        this.f32760f = AbstractC3407E.f34834Q;
        this.f32761g = KeyboardType.Companion.m4923getNumberPjHm6EE();
        this.f32762h = new VisualTransformation() { // from class: h4.t
            @Override // androidx.compose.ui.text.input.VisualTransformation
            public final TransformedText filter(AnnotatedString annotatedString) {
                TransformedText n8;
                n8 = C2954u.n(annotatedString);
                return n8;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TransformedText n(AnnotatedString text) {
        AbstractC3255y.i(text, "text");
        StringBuilder sb = new StringBuilder();
        String text2 = text.getText();
        int i8 = 0;
        int i9 = 0;
        while (i8 < text2.length()) {
            int i10 = i9 + 1;
            sb.append(text2.charAt(i8));
            if (i9 == 2) {
                sb.append(" - ");
            }
            i8++;
            i9 = i10;
        }
        String sb2 = sb.toString();
        AbstractC3255y.h(sb2, "toString(...)");
        return new TransformedText(new AnnotatedString(sb2, null, null, 6, null), new b(" - "));
    }

    @Override // p4.v0
    public InterfaceC3698L a() {
        return this.f32759e;
    }

    @Override // p4.v0
    public Integer b() {
        return Integer.valueOf(this.f32760f);
    }

    @Override // p4.v0
    public String c(String rawValue) {
        AbstractC3255y.i(rawValue, "rawValue");
        return rawValue;
    }

    @Override // p4.v0
    public InterfaceC3698L d() {
        return this.f32758d;
    }

    @Override // p4.v0
    public VisualTransformation e() {
        return this.f32762h;
    }

    @Override // p4.v0
    public String f() {
        return v0.a.a(this);
    }

    @Override // p4.v0
    public int g() {
        return this.f32756b;
    }

    @Override // p4.v0
    public String h(String displayName) {
        AbstractC3255y.i(displayName, "displayName");
        return displayName;
    }

    @Override // p4.v0
    public int i() {
        return this.f32761g;
    }

    @Override // p4.v0
    public String j(String userTyped) {
        AbstractC3255y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (f32754k.k(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3255y.h(sb2, "toString(...)");
        return j6.n.U0(sb2, 6);
    }

    @Override // p4.v0
    public String k() {
        return this.f32757c;
    }

    @Override // p4.v0
    public p4.y0 l(String input) {
        Object obj;
        AbstractC3255y.i(input, "input");
        if (j6.n.u(input)) {
            return z0.a.f37883c;
        }
        if (input.length() < 6) {
            return new z0.b(AbstractC3407E.f34835R);
        }
        Iterator it = this.f32755a.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (j6.n.C(input, ((C2663s.a) next).b(), false, 2, null)) {
                obj = next;
                break;
            }
        }
        if (((C2663s.a) obj) != null && input.length() <= 6) {
            return A0.a.f36968a;
        }
        return new z0.c(AbstractC3407E.f34836S, null, false, 6, null);
    }
}
