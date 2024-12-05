package m4;

import M5.AbstractC1239l;
import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import r2.AbstractC3685e;
import v2.C3825a;
import v2.C3826b;

/* renamed from: m4.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3429t implements InterfaceC3433x {

    /* renamed from: k, reason: collision with root package name */
    public static final c f35714k = new c(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f35715l = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Set f35716a;

    /* renamed from: b, reason: collision with root package name */
    private final Locale f35717b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35718c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f35719d;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f35720e;

    /* renamed from: f, reason: collision with root package name */
    private final String f35721f;

    /* renamed from: g, reason: collision with root package name */
    private final int f35722g;

    /* renamed from: h, reason: collision with root package name */
    private final List f35723h;

    /* renamed from: i, reason: collision with root package name */
    private final List f35724i;

    /* renamed from: j, reason: collision with root package name */
    private final List f35725j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.t$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35726a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C3825a country) {
            AbstractC3159y.i(country, "country");
            return country.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.t$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f35727a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C3825a country) {
            AbstractC3159y.i(country, "country");
            return C3429t.f35714k.a(country.c().c()) + " " + country.e();
        }
    }

    /* renamed from: m4.t$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public final String a(String countryCode) {
            AbstractC3159y.i(countryCode, "countryCode");
            if (countryCode.length() != 2) {
                return "🌐";
            }
            int codePointAt = Character.codePointAt(countryCode, 0) - (-127397);
            int codePointAt2 = Character.codePointAt(countryCode, 1) - (-127397);
            char[] chars = Character.toChars(codePointAt);
            AbstractC3159y.h(chars, "toChars(...)");
            char[] chars2 = Character.toChars(codePointAt2);
            AbstractC3159y.h(chars2, "toChars(...)");
            return new String(AbstractC1239l.y(chars, chars2));
        }

        public /* synthetic */ c(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C3429t(Set onlyShowCountryCodes, Locale locale, boolean z8, boolean z9, Function1 collapsedLabelMapper, Function1 expandedLabelMapper) {
        AbstractC3159y.i(onlyShowCountryCodes, "onlyShowCountryCodes");
        AbstractC3159y.i(locale, "locale");
        AbstractC3159y.i(collapsedLabelMapper, "collapsedLabelMapper");
        AbstractC3159y.i(expandedLabelMapper, "expandedLabelMapper");
        this.f35716a = onlyShowCountryCodes;
        this.f35717b = locale;
        this.f35718c = z8;
        this.f35719d = z9;
        this.f35720e = collapsedLabelMapper;
        this.f35721f = "country";
        this.f35722g = AbstractC3685e.f37576c;
        List f8 = v2.d.f38784a.f(locale);
        ArrayList arrayList = new ArrayList();
        for (Object obj : f8) {
            C3825a c3825a = (C3825a) obj;
            if (this.f35716a.isEmpty() || this.f35716a.contains(c3825a.c().c())) {
                arrayList.add(obj);
            }
        }
        this.f35723h = arrayList;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(AbstractC1246t.x(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C3825a) it.next()).c().c());
        }
        this.f35724i = arrayList3;
        List list = this.f35723h;
        ArrayList arrayList4 = new ArrayList(AbstractC1246t.x(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(expandedLabelMapper.invoke(it2.next()));
        }
        this.f35725j = arrayList4;
    }

    public final List a() {
        return this.f35723h;
    }

    @Override // m4.InterfaceC3433x
    public int b() {
        return this.f35722g;
    }

    @Override // m4.InterfaceC3433x
    public String f(String rawValue) {
        AbstractC3159y.i(rawValue, "rawValue");
        v2.d dVar = v2.d.f38784a;
        C3826b a8 = C3826b.Companion.a(rawValue);
        Locale locale = Locale.getDefault();
        AbstractC3159y.h(locale, "getDefault(...)");
        C3825a d8 = dVar.d(a8, locale);
        if (d8 != null) {
            Integer valueOf = Integer.valueOf(this.f35723h.indexOf(d8));
            String str = null;
            if (valueOf.intValue() == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                str = (String) i().get(valueOf.intValue());
            }
            if (str != null) {
                return str;
            }
        }
        String str2 = (String) AbstractC1246t.o0(i());
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @Override // m4.InterfaceC3433x
    public String g(int i8) {
        String str;
        C3825a c3825a = (C3825a) AbstractC1246t.p0(this.f35723h, i8);
        if (c3825a == null || (str = (String) this.f35720e.invoke(c3825a)) == null) {
            return "";
        }
        return str;
    }

    @Override // m4.InterfaceC3433x
    public boolean h() {
        return this.f35719d;
    }

    @Override // m4.InterfaceC3433x
    public List i() {
        return this.f35725j;
    }

    @Override // m4.InterfaceC3433x
    public List j() {
        return this.f35724i;
    }

    @Override // m4.InterfaceC3433x
    public boolean k() {
        return this.f35718c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C3429t(java.util.Set r5, java.util.Locale r6, boolean r7, boolean r8, kotlin.jvm.functions.Function1 r9, kotlin.jvm.functions.Function1 r10, int r11, kotlin.jvm.internal.AbstractC3151p r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L8
            java.util.Set r5 = M5.a0.f()
        L8:
            r12 = r11 & 2
            if (r12 == 0) goto L15
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r12 = "getDefault(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r6, r12)
        L15:
            r12 = r6
            r6 = r11 & 4
            r0 = 0
            if (r6 == 0) goto L1d
            r1 = 0
            goto L1e
        L1d:
            r1 = r7
        L1e:
            r6 = r11 & 8
            if (r6 == 0) goto L23
            goto L24
        L23:
            r0 = r8
        L24:
            r6 = r11 & 16
            if (r6 == 0) goto L2a
            m4.t$a r9 = m4.C3429t.a.f35726a
        L2a:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L31
            m4.t$b r10 = m4.C3429t.b.f35727a
        L31:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r0
            r11 = r2
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.C3429t.<init>(java.util.Set, java.util.Locale, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, kotlin.jvm.internal.p):void");
    }
}
