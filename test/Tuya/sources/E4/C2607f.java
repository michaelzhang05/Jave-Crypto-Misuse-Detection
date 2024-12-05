package e4;

import M5.AbstractC1246t;
import android.content.res.Resources;
import androidx.compose.ui.text.intl.Locale;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;
import m4.D;
import y2.InterfaceC3983b;

/* renamed from: e4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2607f implements m4.D {

    /* renamed from: e, reason: collision with root package name */
    public static final a f30673e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f30674f = 8;

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30675a;

    /* renamed from: b, reason: collision with root package name */
    private final m4.r f30676b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30677c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3983b f30678d;

    /* renamed from: e4.f$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final boolean a() {
            return M5.a0.i("GB", "ES", "FR", "IT").contains(Locale.Companion.getCurrent().getRegion());
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C2607f(m4.G identifier, m4.r rVar) {
        AbstractC3159y.i(identifier, "identifier");
        this.f30675a = identifier;
        this.f30676b = rVar;
    }

    private final String h(Locale locale) {
        String language = locale.getLanguage();
        java.util.Locale locale2 = java.util.Locale.ROOT;
        String lowerCase = language.toLowerCase(locale2);
        AbstractC3159y.h(lowerCase, "toLowerCase(...)");
        String upperCase = locale.getRegion().toUpperCase(locale2);
        AbstractC3159y.h(upperCase, "toUpperCase(...)");
        return lowerCase + "_" + upperCase;
    }

    @Override // m4.D
    public m4.G a() {
        return this.f30675a;
    }

    @Override // m4.D
    public InterfaceC3983b b() {
        return this.f30678d;
    }

    @Override // m4.D
    public boolean c() {
        return this.f30677c;
    }

    @Override // m4.D
    public InterfaceC3349K d() {
        return v4.g.n(AbstractC1246t.m());
    }

    @Override // m4.D
    public InterfaceC3349K e() {
        return D.a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2607f)) {
            return false;
        }
        C2607f c2607f = (C2607f) obj;
        if (AbstractC3159y.d(this.f30675a, c2607f.f30675a) && AbstractC3159y.d(this.f30676b, c2607f.f30676b)) {
            return true;
        }
        return false;
    }

    public final String f() {
        String format = String.format("https://static.afterpay.com/modal/%s.html", Arrays.copyOf(new Object[]{h(Locale.Companion.getCurrent())}, 1));
        AbstractC3159y.h(format, "format(...)");
        return format;
    }

    public final String g(Resources resources) {
        AbstractC3159y.i(resources, "resources");
        String string = resources.getString(b4.n.f14714a);
        AbstractC3159y.h(string, "getString(...)");
        return g6.n.A(string, "<img/>", "<img/> <b>ⓘ</b>", false, 4, null);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f30675a.hashCode() * 31;
        m4.r rVar = this.f30676b;
        if (rVar == null) {
            hashCode = 0;
        } else {
            hashCode = rVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "AfterpayClearpayHeaderElement(identifier=" + this.f30675a + ", controller=" + this.f30676b + ")";
    }

    public /* synthetic */ C2607f(m4.G g8, m4.r rVar, int i8, AbstractC3151p abstractC3151p) {
        this(g8, (i8 & 2) != 0 ? null : rVar);
    }
}
