package y6;

import L5.InterfaceC1227k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

@t6.g(with = u.class)
/* loaded from: classes5.dex */
public final class t extends x {
    public static final t INSTANCE = new t();

    /* renamed from: a, reason: collision with root package name */
    private static final String f40018a = "null";

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1227k f40019b = L5.l.a(L5.o.f6505b, a.f40020a);

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40020a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t6.b invoke() {
            return u.f40021a;
        }
    }

    private t() {
        super(null);
    }

    private final /* synthetic */ t6.b g() {
        return (t6.b) f40019b.getValue();
    }

    @Override // y6.x
    public String a() {
        return f40018a;
    }

    public final t6.b serializer() {
        return g();
    }
}
