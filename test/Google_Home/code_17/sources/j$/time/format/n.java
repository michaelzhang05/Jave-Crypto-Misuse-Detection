package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    private static final a f33153f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private n f33154a;

    /* renamed from: b, reason: collision with root package name */
    private final n f33155b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f33156c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33157d;

    /* renamed from: e, reason: collision with root package name */
    private int f33158e;

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.a, java.lang.Object] */
    static {
        HashMap hashMap = new HashMap();
        hashMap.put('G', j$.time.temporal.a.ERA);
        hashMap.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        hashMap.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.r rVar = j$.time.temporal.j.f33216a;
        hashMap.put('Q', rVar);
        hashMap.put('q', rVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        hashMap.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        hashMap.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        hashMap.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        hashMap.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        hashMap.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        hashMap.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', j$.time.temporal.a.NANO_OF_DAY);
        hashMap.put('g', j$.time.temporal.l.f33223a);
    }

    public n() {
        this.f33154a = this;
        this.f33156c = new ArrayList();
        this.f33158e = -1;
        this.f33155b = null;
        this.f33157d = false;
    }

    private n(n nVar) {
        this.f33154a = this;
        this.f33156c = new ArrayList();
        this.f33158e = -1;
        this.f33155b = nVar;
        this.f33157d = true;
    }

    private int d(f fVar) {
        Objects.requireNonNull(fVar, "pp");
        n nVar = this.f33154a;
        nVar.getClass();
        nVar.f33156c.add(fVar);
        this.f33154a.f33158e = -1;
        return r2.f33156c.size() - 1;
    }

    private void j(i iVar) {
        i b8;
        u uVar;
        n nVar = this.f33154a;
        int i8 = nVar.f33158e;
        if (i8 < 0) {
            nVar.f33158e = d(iVar);
            return;
        }
        i iVar2 = (i) nVar.f33156c.get(i8);
        int i9 = iVar.f33137b;
        int i10 = iVar.f33138c;
        if (i9 == i10) {
            uVar = iVar.f33139d;
            if (uVar == u.NOT_NEGATIVE) {
                b8 = iVar2.c(i10);
                d(iVar.b());
                this.f33154a.f33158e = i8;
                this.f33154a.f33156c.set(i8, b8);
            }
        }
        b8 = iVar2.b();
        this.f33154a.f33158e = d(iVar);
        this.f33154a.f33156c.set(i8, b8);
    }

    private DateTimeFormatter u(Locale locale, t tVar, j$.time.chrono.m mVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.f33154a.f33155b != null) {
            n();
        }
        e eVar = new e((List) this.f33156c, false);
        s sVar = s.f33167a;
        return new DateTimeFormatter(eVar, locale, tVar, mVar);
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.f());
    }

    public final void b(j$.time.temporal.r rVar) {
        g gVar = new g(rVar, 0, 9, true, 0);
        Objects.requireNonNull(rVar, "field");
        if (!rVar.j().g()) {
            throw new IllegalArgumentException(j$.time.d.a("Field must have a fixed set of values: ", rVar));
        }
        d(gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.f, java.lang.Object] */
    public final void c() {
        d(new Object());
    }

    public final void e(char c8) {
        d(new d(c8));
    }

    public final void f(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        d(str.length() == 1 ? new d(str.charAt(0)) : new l(0, str));
    }

    public final void g(String str, String str2) {
        d(new j(str, str2));
    }

    public final void h() {
        d(j.f33142e);
    }

    public final void i(j$.time.temporal.r rVar, HashMap hashMap) {
        Objects.requireNonNull(rVar, "field");
        Objects.requireNonNull(hashMap, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(hashMap);
        v vVar = v.FULL;
        d(new m(rVar, vVar, new b(new r(Collections.singletonMap(vVar, linkedHashMap)))));
    }

    public final void k(j$.time.temporal.r rVar, int i8) {
        Objects.requireNonNull(rVar, "field");
        if (i8 >= 1 && i8 <= 19) {
            j(new i(rVar, i8, i8, u.NOT_NEGATIVE));
        } else {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i8);
        }
    }

    public final void l(j$.time.temporal.r rVar, int i8, int i9, u uVar) {
        if (i8 == i9 && uVar == u.NOT_NEGATIVE) {
            k(rVar, i9);
            return;
        }
        Objects.requireNonNull(rVar, "field");
        Objects.requireNonNull(uVar, "signStyle");
        if (i8 < 1 || i8 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i8);
        }
        if (i9 < 1 || i9 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i9);
        }
        if (i9 >= i8) {
            j(new i(rVar, i8, i9, uVar));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i9 + " < " + i8);
    }

    public final void m() {
        d(new l(1, f33153f));
    }

    public final void n() {
        n nVar = this.f33154a;
        if (nVar.f33155b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (nVar.f33156c.size() <= 0) {
            this.f33154a = this.f33154a.f33155b;
            return;
        }
        n nVar2 = this.f33154a;
        e eVar = new e(nVar2.f33156c, nVar2.f33157d);
        this.f33154a = this.f33154a.f33155b;
        d(eVar);
    }

    public final void o() {
        n nVar = this.f33154a;
        nVar.f33158e = -1;
        this.f33154a = new n(nVar);
    }

    public final void p() {
        d(k.INSENSITIVE);
    }

    public final void q() {
        d(k.SENSITIVE);
    }

    public final void r() {
        d(k.LENIENT);
    }

    public final void s() {
        d(k.STRICT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final DateTimeFormatter t(t tVar, j$.time.chrono.m mVar) {
        return u(Locale.getDefault(), tVar, mVar);
    }

    public final void v() {
        u(Locale.getDefault(), t.SMART, null);
    }
}
