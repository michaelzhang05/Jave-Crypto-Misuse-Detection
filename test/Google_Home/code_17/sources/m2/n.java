package m2;

import com.stripe.android.googlepaylauncher.h;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class n implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f35014a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f35015b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f35016c;

    public n(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        this.f35014a = aVar;
        this.f35015b = aVar2;
        this.f35016c = aVar3;
    }

    public static n a(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        return new n(aVar, aVar2, aVar3);
    }

    public static C3427m c(Function0 function0, Function0 function02, h.d dVar) {
        return new C3427m(function0, function02, dVar);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3427m get() {
        return c((Function0) this.f35014a.get(), (Function0) this.f35015b.get(), (h.d) this.f35016c.get());
    }
}
