package K2;

import com.stripe.android.link.LinkActivityContract;
import e3.m;

/* loaded from: classes4.dex */
public final class a implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f5881a;

    public a(I5.a aVar) {
        this.f5881a = aVar;
    }

    public static a a(I5.a aVar) {
        return new a(aVar);
    }

    public static LinkActivityContract c(m mVar) {
        return new LinkActivityContract(mVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinkActivityContract get() {
        return c((m) this.f5881a.get());
    }
}
