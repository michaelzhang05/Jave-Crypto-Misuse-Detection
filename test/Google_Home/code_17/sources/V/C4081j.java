package v;

import android.content.Context;
import w.InterfaceC4117b;

/* renamed from: v.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4081j implements InterfaceC4117b {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f40093a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f40094b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f40095c;

    public C4081j(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        this.f40093a = aVar;
        this.f40094b = aVar2;
        this.f40095c = aVar3;
    }

    public static C4081j a(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        return new C4081j(aVar, aVar2, aVar3);
    }

    public static C4080i c(Context context, E.a aVar, E.a aVar2) {
        return new C4080i(context, aVar, aVar2);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4080i get() {
        return c((Context) this.f40093a.get(), (E.a) this.f40094b.get(), (E.a) this.f40095c.get());
    }
}
