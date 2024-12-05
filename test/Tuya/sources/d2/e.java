package D2;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class e implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f1401a;

    public e(I5.a aVar) {
        this.f1401a = aVar;
    }

    public static List a(Function0 function0) {
        return (List) u5.h.d(d.f1394a.b(function0));
    }

    public static e b(I5.a aVar) {
        return new e(aVar);
    }

    @Override // I5.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public List get() {
        return a((Function0) this.f1401a.get());
    }
}
