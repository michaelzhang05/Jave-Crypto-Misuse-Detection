package o3;

import android.content.Context;
import java.util.Map;

/* renamed from: o3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3521c implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f35893a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f35894b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f35895c;

    /* renamed from: d, reason: collision with root package name */
    private final L5.a f35896d;

    /* renamed from: e, reason: collision with root package name */
    private final L5.a f35897e;

    public C3521c(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5) {
        this.f35893a = aVar;
        this.f35894b = aVar2;
        this.f35895c = aVar3;
        this.f35896d = aVar4;
        this.f35897e = aVar5;
    }

    public static C3521c a(L5.a aVar, L5.a aVar2, L5.a aVar3, L5.a aVar4, L5.a aVar5) {
        return new C3521c(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static C3519a c(C3522d c3522d, C3530l c3530l, Map map, boolean z8, Context context) {
        return new C3519a(c3522d, c3530l, map, z8, context);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3519a get() {
        return c((C3522d) this.f35893a.get(), (C3530l) this.f35894b.get(), (Map) this.f35895c.get(), ((Boolean) this.f35896d.get()).booleanValue(), (Context) this.f35897e.get());
    }
}
