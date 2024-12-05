package l6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3365m {

    /* renamed from: a, reason: collision with root package name */
    private static final Function1 f34650a = b.f34653a;

    /* renamed from: b, reason: collision with root package name */
    private static final X5.n f34651b = a.f34652a;

    /* renamed from: l6.m$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34652a = new a();

        a() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(AbstractC3159y.d(obj, obj2));
        }
    }

    public static final InterfaceC3358f a(InterfaceC3358f interfaceC3358f) {
        if (!(interfaceC3358f instanceof InterfaceC3349K)) {
            return b(interfaceC3358f, f34650a, f34651b);
        }
        return interfaceC3358f;
    }

    private static final InterfaceC3358f b(InterfaceC3358f interfaceC3358f, Function1 function1, X5.n nVar) {
        if (interfaceC3358f instanceof C3357e) {
            C3357e c3357e = (C3357e) interfaceC3358f;
            if (c3357e.f34633b == function1 && c3357e.f34634c == nVar) {
                return interfaceC3358f;
            }
        }
        return new C3357e(interfaceC3358f, function1, nVar);
    }

    /* renamed from: l6.m$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f34653a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
