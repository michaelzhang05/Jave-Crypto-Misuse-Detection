package N2;

import com.stripe.android.link.LinkActivityContract;
import h3.m;

/* loaded from: classes4.dex */
public final class a implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f7660a;

    public a(L5.a aVar) {
        this.f7660a = aVar;
    }

    public static a a(L5.a aVar) {
        return new a(aVar);
    }

    public static LinkActivityContract c(m mVar) {
        return new LinkActivityContract(mVar);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinkActivityContract get() {
        return c((m) this.f7660a.get());
    }
}
