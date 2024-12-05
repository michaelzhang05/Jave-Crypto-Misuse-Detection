package h4;

import A6.C0984e;
import O5.s;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: h4.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2926e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2926e0 f32590a = new C2926e0();

    /* renamed from: b, reason: collision with root package name */
    private static final B6.a f32591b = B6.o.b(null, a.f32593a, 1, null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f32592c = 8;

    /* renamed from: h4.e0$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32593a = new a();

        a() {
            super(1);
        }

        public final void a(B6.d Json) {
            AbstractC3255y.i(Json, "$this$Json");
            Json.f(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((B6.d) obj);
            return O5.I.f8278a;
        }
    }

    private C2926e0() {
    }

    public final Object a(String str) {
        AbstractC3255y.i(str, "str");
        try {
            s.a aVar = O5.s.f8302b;
            return O5.s.b((List) f32591b.b(new C0984e(C2920b0.Companion.serializer()), str));
        } catch (Throwable th) {
            s.a aVar2 = O5.s.f8302b;
            return O5.s.b(O5.t.a(th));
        }
    }
}
