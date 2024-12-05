package M2;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import u2.InterfaceC4057d;

/* loaded from: classes4.dex */
public final class g implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final f f6467a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f6468b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f6469c;

    public g(f fVar, L5.a aVar, L5.a aVar2) {
        this.f6467a = fVar;
        this.f6468b = aVar;
        this.f6469c = aVar2;
    }

    public static g a(f fVar, L5.a aVar, L5.a aVar2) {
        return new g(fVar, aVar, aVar2);
    }

    public static Function1 c(f fVar, Context context, InterfaceC4057d interfaceC4057d) {
        return (Function1) x5.h.d(fVar.a(context, interfaceC4057d));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Function1 get() {
        return c(this.f6467a, (Context) this.f6468b.get(), (InterfaceC4057d) this.f6469c.get());
    }
}
