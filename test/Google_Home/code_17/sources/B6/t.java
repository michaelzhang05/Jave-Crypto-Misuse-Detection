package B6;

import O5.InterfaceC1355k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;

@w6.g(with = u.class)
/* loaded from: classes5.dex */
public final class t extends x {
    public static final t INSTANCE = new t();

    /* renamed from: a, reason: collision with root package name */
    private static final String f1062a = "null";

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1355k f1063b = O5.l.a(O5.o.f8296b, a.f1064a);

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1064a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w6.b invoke() {
            return u.f1065a;
        }
    }

    private t() {
        super(null);
    }

    private final /* synthetic */ w6.b e() {
        return (w6.b) f1063b.getValue();
    }

    @Override // B6.x
    public String c() {
        return f1062a;
    }

    public final w6.b serializer() {
        return e();
    }
}
