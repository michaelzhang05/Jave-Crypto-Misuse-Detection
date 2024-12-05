package e4;

import L5.s;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import x6.C3943e;
import y6.AbstractC3999a;
import y6.C4002d;

/* renamed from: e4.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2606e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2606e0 f30669a = new C2606e0();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC3999a f30670b = y6.o.b(null, a.f30672a, 1, null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f30671c = 8;

    /* renamed from: e4.e0$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30672a = new a();

        a() {
            super(1);
        }

        public final void a(C4002d Json) {
            AbstractC3159y.i(Json, "$this$Json");
            Json.f(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4002d) obj);
            return L5.I.f6487a;
        }
    }

    private C2606e0() {
    }

    public final Object a(String str) {
        AbstractC3159y.i(str, "str");
        try {
            s.a aVar = L5.s.f6511b;
            return L5.s.b((List) f30670b.b(new C3943e(C2600b0.Companion.serializer()), str));
        } catch (Throwable th) {
            s.a aVar2 = L5.s.f6511b;
            return L5.s.b(L5.t.a(th));
        }
    }
}
