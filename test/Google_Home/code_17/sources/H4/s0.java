package h4;

import A6.C0984e;
import O5.s;
import android.util.Log;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f32741a = new s0();

    /* renamed from: b, reason: collision with root package name */
    private static final B6.a f32742b = B6.o.b(null, a.f32744a, 1, null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f32743c = 8;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32744a = new a();

        a() {
            super(1);
        }

        public final void a(B6.d Json) {
            AbstractC3255y.i(Json, "$this$Json");
            Json.f(true);
            Json.c("#class");
            Json.d(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((B6.d) obj);
            return O5.I.f8278a;
        }
    }

    private s0() {
    }

    public final Object a(String str) {
        Object b8;
        AbstractC3255y.i(str, "str");
        try {
            s.a aVar = O5.s.f8302b;
            b8 = O5.s.b((List) f32742b.b(new C0984e(H0.Companion.serializer()), str));
        } catch (Throwable th) {
            s.a aVar2 = O5.s.f8302b;
            b8 = O5.s.b(O5.t.a(th));
        }
        Throwable e8 = O5.s.e(b8);
        if (e8 != null) {
            Log.w("STRIPE", "Error parsing LPMs", e8);
        }
        return b8;
    }
}
