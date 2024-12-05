package v;

import android.content.Context;
import w.InterfaceC4117b;

/* renamed from: v.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4083l implements InterfaceC4117b {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f40101a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f40102b;

    public C4083l(L5.a aVar, L5.a aVar2) {
        this.f40101a = aVar;
        this.f40102b = aVar2;
    }

    public static C4083l a(L5.a aVar, L5.a aVar2) {
        return new C4083l(aVar, aVar2);
    }

    public static C4082k c(Context context, Object obj) {
        return new C4082k(context, (C4080i) obj);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4082k get() {
        return c((Context) this.f40101a.get(), this.f40102b.get());
    }
}
