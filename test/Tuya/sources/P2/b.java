package P2;

import P5.g;
import e3.m;
import java.util.Locale;
import k3.i;
import kotlin.jvm.functions.Function0;
import u5.e;

/* loaded from: classes4.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f7915a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f7916b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f7917c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f7918d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f7919e;

    /* renamed from: f, reason: collision with root package name */
    private final I5.a f7920f;

    /* renamed from: g, reason: collision with root package name */
    private final I5.a f7921g;

    public b(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6, I5.a aVar7) {
        this.f7915a = aVar;
        this.f7916b = aVar2;
        this.f7917c = aVar3;
        this.f7918d = aVar4;
        this.f7919e = aVar5;
        this.f7920f = aVar6;
        this.f7921g = aVar7;
    }

    public static b a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5, I5.a aVar6, I5.a aVar7) {
        return new b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static a c(Function0 function0, Function0 function02, m mVar, O3.a aVar, g gVar, Locale locale, i iVar) {
        return new a(function0, function02, mVar, aVar, gVar, locale, iVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((Function0) this.f7915a.get(), (Function0) this.f7916b.get(), (m) this.f7917c.get(), (O3.a) this.f7918d.get(), (g) this.f7919e.get(), (Locale) this.f7920f.get(), (i) this.f7921g.get());
    }
}
