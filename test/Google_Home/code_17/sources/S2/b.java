package S2;

import S5.g;
import h3.m;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import n3.i;
import x5.e;

/* loaded from: classes4.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f9746a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f9747b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f9748c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f9749d;

    /* renamed from: e, reason: collision with root package name */
    private final L5.a f9750e;

    /* renamed from: f, reason: collision with root package name */
    private final L5.a f9751f;

    /* renamed from: g, reason: collision with root package name */
    private final L5.a f9752g;

    public b(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5, L5.a aVar6, L5.a aVar7) {
        this.f9746a = aVar;
        this.f9747b = aVar2;
        this.f9748c = aVar3;
        this.f9749d = aVar4;
        this.f9750e = aVar5;
        this.f9751f = aVar6;
        this.f9752g = aVar7;
    }

    public static b a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5, L5.a aVar6, L5.a aVar7) {
        return new b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static a c(Function0 function0, Function0 function02, m mVar, R3.a aVar, g gVar, Locale locale, i iVar) {
        return new a(function0, function02, mVar, aVar, gVar, locale, iVar);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((Function0) this.f9746a.get(), (Function0) this.f9747b.get(), (m) this.f9748c.get(), (R3.a) this.f9749d.get(), (g) this.f9750e.get(), (Locale) this.f9751f.get(), (i) this.f9752g.get());
    }
}
