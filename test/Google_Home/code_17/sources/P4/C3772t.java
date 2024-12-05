package p4;

import P5.AbstractC1371l;
import P5.AbstractC1378t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import u2.AbstractC4058e;
import y2.C4202a;
import y2.C4203b;

/* renamed from: p4.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3772t implements InterfaceC3776x {

    /* renamed from: k, reason: collision with root package name */
    public static final c f37740k = new c(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f37741l = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Set f37742a;

    /* renamed from: b, reason: collision with root package name */
    private final Locale f37743b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f37744c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f37745d;

    /* renamed from: e, reason: collision with root package name */
    private final Function1 f37746e;

    /* renamed from: f, reason: collision with root package name */
    private final String f37747f;

    /* renamed from: g, reason: collision with root package name */
    private final int f37748g;

    /* renamed from: h, reason: collision with root package name */
    private final List f37749h;

    /* renamed from: i, reason: collision with root package name */
    private final List f37750i;

    /* renamed from: j, reason: collision with root package name */
    private final List f37751j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.t$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37752a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4202a country) {
            AbstractC3255y.i(country, "country");
            return country.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p4.t$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f37753a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4202a country) {
            AbstractC3255y.i(country, "country");
            return C3772t.f37740k.a(country.b().b()) + " " + country.g();
        }
    }

    /* renamed from: p4.t$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public final String a(String countryCode) {
            AbstractC3255y.i(countryCode, "countryCode");
            if (countryCode.length() != 2) {
                return "🌐";
            }
            int codePointAt = Character.codePointAt(countryCode, 0) - (-127397);
            int codePointAt2 = Character.codePointAt(countryCode, 1) - (-127397);
            char[] chars = Character.toChars(codePointAt);
            AbstractC3255y.h(chars, "toChars(...)");
            char[] chars2 = Character.toChars(codePointAt2);
            AbstractC3255y.h(chars2, "toChars(...)");
            return new String(AbstractC1371l.y(chars, chars2));
        }

        public /* synthetic */ c(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C3772t(Set onlyShowCountryCodes, Locale locale, boolean z8, boolean z9, Function1 collapsedLabelMapper, Function1 expandedLabelMapper) {
        AbstractC3255y.i(onlyShowCountryCodes, "onlyShowCountryCodes");
        AbstractC3255y.i(locale, "locale");
        AbstractC3255y.i(collapsedLabelMapper, "collapsedLabelMapper");
        AbstractC3255y.i(expandedLabelMapper, "expandedLabelMapper");
        this.f37742a = onlyShowCountryCodes;
        this.f37743b = locale;
        this.f37744c = z8;
        this.f37745d = z9;
        this.f37746e = collapsedLabelMapper;
        this.f37747f = "country";
        this.f37748g = AbstractC4058e.f39956c;
        List f8 = y2.d.f40915a.f(locale);
        ArrayList arrayList = new ArrayList();
        for (Object obj : f8) {
            C4202a c4202a = (C4202a) obj;
            if (this.f37742a.isEmpty() || this.f37742a.contains(c4202a.b().b())) {
                arrayList.add(obj);
            }
        }
        this.f37749h = arrayList;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(AbstractC1378t.x(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C4202a) it.next()).b().b());
        }
        this.f37750i = arrayList3;
        List list = this.f37749h;
        ArrayList arrayList4 = new ArrayList(AbstractC1378t.x(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(expandedLabelMapper.invoke(it2.next()));
        }
        this.f37751j = arrayList4;
    }

    public final List a() {
        return this.f37749h;
    }

    @Override // p4.InterfaceC3776x
    public int b() {
        return this.f37748g;
    }

    @Override // p4.InterfaceC3776x
    public String c(String rawValue) {
        AbstractC3255y.i(rawValue, "rawValue");
        y2.d dVar = y2.d.f40915a;
        C4203b a8 = C4203b.Companion.a(rawValue);
        Locale locale = Locale.getDefault();
        AbstractC3255y.h(locale, "getDefault(...)");
        C4202a d8 = dVar.d(a8, locale);
        if (d8 != null) {
            Integer valueOf = Integer.valueOf(this.f37749h.indexOf(d8));
            String str = null;
            if (valueOf.intValue() == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                str = (String) f().get(valueOf.intValue());
            }
            if (str != null) {
                return str;
            }
        }
        String str2 = (String) AbstractC1378t.o0(f());
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @Override // p4.InterfaceC3776x
    public String d(int i8) {
        String str;
        C4202a c4202a = (C4202a) AbstractC1378t.p0(this.f37749h, i8);
        if (c4202a == null || (str = (String) this.f37746e.invoke(c4202a)) == null) {
            return "";
        }
        return str;
    }

    @Override // p4.InterfaceC3776x
    public boolean e() {
        return this.f37745d;
    }

    @Override // p4.InterfaceC3776x
    public List f() {
        return this.f37751j;
    }

    @Override // p4.InterfaceC3776x
    public List g() {
        return this.f37750i;
    }

    @Override // p4.InterfaceC3776x
    public boolean h() {
        return this.f37744c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C3772t(java.util.Set r5, java.util.Locale r6, boolean r7, boolean r8, kotlin.jvm.functions.Function1 r9, kotlin.jvm.functions.Function1 r10, int r11, kotlin.jvm.internal.AbstractC3247p r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L8
            java.util.Set r5 = P5.a0.f()
        L8:
            r12 = r11 & 2
            if (r12 == 0) goto L15
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r12 = "getDefault(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r6, r12)
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
            p4.t$a r9 = p4.C3772t.a.f37752a
        L2a:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L31
            p4.t$b r10 = p4.C3772t.b.f37753a
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
        throw new UnsupportedOperationException("Method not decompiled: p4.C3772t.<init>(java.util.Set, java.util.Locale, boolean, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, kotlin.jvm.internal.p):void");
    }
}
