package G2;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class e implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f2943a;

    public e(L5.a aVar) {
        this.f2943a = aVar;
    }

    public static List a(Function0 function0) {
        return (List) x5.h.d(d.f2936a.b(function0));
    }

    public static e b(L5.a aVar) {
        return new e(aVar);
    }

    @Override // L5.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public List get() {
        return a((Function0) this.f2943a.get());
    }
}
