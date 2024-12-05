package l3;

import android.content.Context;
import java.util.Map;

/* renamed from: l3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3173c implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f33892a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f33893b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f33894c;

    /* renamed from: d, reason: collision with root package name */
    private final I5.a f33895d;

    /* renamed from: e, reason: collision with root package name */
    private final I5.a f33896e;

    public C3173c(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5) {
        this.f33892a = aVar;
        this.f33893b = aVar2;
        this.f33894c = aVar3;
        this.f33895d = aVar4;
        this.f33896e = aVar5;
    }

    public static C3173c a(I5.a aVar, I5.a aVar2, I5.a aVar3, I5.a aVar4, I5.a aVar5) {
        return new C3173c(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static C3171a c(C3174d c3174d, C3182l c3182l, Map map, boolean z8, Context context) {
        return new C3171a(c3174d, c3182l, map, z8, context);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3171a get() {
        return c((C3174d) this.f33892a.get(), (C3182l) this.f33893b.get(), (Map) this.f33894c.get(), ((Boolean) this.f33895d.get()).booleanValue(), (Context) this.f33896e.get());
    }
}
