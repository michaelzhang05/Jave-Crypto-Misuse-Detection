package J2;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import r2.InterfaceC3684d;

/* loaded from: classes4.dex */
public final class g implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final f f4761a;

    /* renamed from: b, reason: collision with root package name */
    private final I5.a f4762b;

    /* renamed from: c, reason: collision with root package name */
    private final I5.a f4763c;

    public g(f fVar, I5.a aVar, I5.a aVar2) {
        this.f4761a = fVar;
        this.f4762b = aVar;
        this.f4763c = aVar2;
    }

    public static g a(f fVar, I5.a aVar, I5.a aVar2) {
        return new g(fVar, aVar, aVar2);
    }

    public static Function1 c(f fVar, Context context, InterfaceC3684d interfaceC3684d) {
        return (Function1) u5.h.d(fVar.a(context, interfaceC3684d));
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function1 get() {
        return c(this.f4761a, (Context) this.f4762b.get(), (InterfaceC3684d) this.f4763c.get());
    }
}
