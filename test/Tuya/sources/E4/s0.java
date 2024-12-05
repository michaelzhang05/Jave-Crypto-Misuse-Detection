package e4;

import L5.s;
import android.util.Log;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import x6.C3943e;
import y6.AbstractC3999a;
import y6.C4002d;

/* loaded from: classes4.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f30820a = new s0();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC3999a f30821b = y6.o.b(null, a.f30823a, 1, null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f30822c = 8;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30823a = new a();

        a() {
            super(1);
        }

        public final void a(C4002d Json) {
            AbstractC3159y.i(Json, "$this$Json");
            Json.f(true);
            Json.c("#class");
            Json.d(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4002d) obj);
            return L5.I.f6487a;
        }
    }

    private s0() {
    }

    public final Object a(String str) {
        Object b8;
        AbstractC3159y.i(str, "str");
        try {
            s.a aVar = L5.s.f6511b;
            b8 = L5.s.b((List) f30821b.b(new C3943e(H0.Companion.serializer()), str));
        } catch (Throwable th) {
            s.a aVar2 = L5.s.f6511b;
            b8 = L5.s.b(L5.t.a(th));
        }
        Throwable e8 = L5.s.e(b8);
        if (e8 != null) {
            Log.w("STRIPE", "Error parsing LPMs", e8);
        }
        return b8;
    }
}
