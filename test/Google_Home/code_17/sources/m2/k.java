package M2;

import com.stripe.android.googlepaylauncher.h;
import r0.C3905m;

/* loaded from: classes4.dex */
public final class k implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f6472a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f6473b;

    public k(L5.a aVar, L5.a aVar2) {
        this.f6472a = aVar;
        this.f6473b = aVar2;
    }

    public static k a(L5.a aVar, L5.a aVar2) {
        return new k(aVar, aVar2);
    }

    public static C3905m c(h.d dVar, L2.h hVar) {
        return (C3905m) x5.h.d(j.f6471a.a(dVar, hVar));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3905m get() {
        return c((h.d) this.f6472a.get(), (L2.h) this.f6473b.get());
    }
}
