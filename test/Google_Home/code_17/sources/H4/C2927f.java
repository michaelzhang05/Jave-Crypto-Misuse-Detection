package h4;

import P5.AbstractC1378t;
import android.content.res.Resources;
import androidx.compose.ui.text.intl.Locale;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o6.InterfaceC3698L;
import p4.D;

/* renamed from: h4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2927f implements p4.D {

    /* renamed from: e, reason: collision with root package name */
    public static final a f32594e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f32595f = 8;

    /* renamed from: a, reason: collision with root package name */
    private final p4.G f32596a;

    /* renamed from: b, reason: collision with root package name */
    private final p4.r f32597b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f32598c;

    /* renamed from: d, reason: collision with root package name */
    private final B2.b f32599d;

    /* renamed from: h4.f$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final boolean a() {
            return P5.a0.i("GB", "ES", "FR", "IT").contains(Locale.Companion.getCurrent().getRegion());
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C2927f(p4.G identifier, p4.r rVar) {
        AbstractC3255y.i(identifier, "identifier");
        this.f32596a = identifier;
        this.f32597b = rVar;
    }

    private final String h(Locale locale) {
        String language = locale.getLanguage();
        java.util.Locale locale2 = java.util.Locale.ROOT;
        String lowerCase = language.toLowerCase(locale2);
        AbstractC3255y.h(lowerCase, "toLowerCase(...)");
        String upperCase = locale.getRegion().toUpperCase(locale2);
        AbstractC3255y.h(upperCase, "toUpperCase(...)");
        return lowerCase + "_" + upperCase;
    }

    @Override // p4.D
    public p4.G a() {
        return this.f32596a;
    }

    @Override // p4.D
    public B2.b b() {
        return this.f32599d;
    }

    @Override // p4.D
    public boolean c() {
        return this.f32598c;
    }

    @Override // p4.D
    public InterfaceC3698L d() {
        return y4.g.n(AbstractC1378t.m());
    }

    @Override // p4.D
    public InterfaceC3698L e() {
        return D.a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2927f)) {
            return false;
        }
        C2927f c2927f = (C2927f) obj;
        if (AbstractC3255y.d(this.f32596a, c2927f.f32596a) && AbstractC3255y.d(this.f32597b, c2927f.f32597b)) {
            return true;
        }
        return false;
    }

    public final String f() {
        String format = String.format("https://static.afterpay.com/modal/%s.html", Arrays.copyOf(new Object[]{h(Locale.Companion.getCurrent())}, 1));
        AbstractC3255y.h(format, "format(...)");
        return format;
    }

    public final String g(Resources resources) {
        AbstractC3255y.i(resources, "resources");
        String string = resources.getString(e4.n.f31720a);
        AbstractC3255y.h(string, "getString(...)");
        return j6.n.A(string, "<img/>", "<img/> <b>ⓘ</b>", false, 4, null);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f32596a.hashCode() * 31;
        p4.r rVar = this.f32597b;
        if (rVar == null) {
            hashCode = 0;
        } else {
            hashCode = rVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "AfterpayClearpayHeaderElement(identifier=" + this.f32596a + ", controller=" + this.f32597b + ")";
    }

    public /* synthetic */ C2927f(p4.G g8, p4.r rVar, int i8, AbstractC3247p abstractC3247p) {
        this(g8, (i8 & 2) != 0 ? null : rVar);
    }
}
