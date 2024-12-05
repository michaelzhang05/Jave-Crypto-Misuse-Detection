package o6;

import a6.InterfaceC1668n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o6.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3713m {

    /* renamed from: a, reason: collision with root package name */
    private static final Function1 f36651a = b.f36654a;

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC1668n f36652b = a.f36653a;

    /* renamed from: o6.m$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36653a = new a();

        a() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(AbstractC3255y.d(obj, obj2));
        }
    }

    public static final InterfaceC3706f a(InterfaceC3706f interfaceC3706f) {
        if (!(interfaceC3706f instanceof InterfaceC3698L)) {
            return b(interfaceC3706f, f36651a, f36652b);
        }
        return interfaceC3706f;
    }

    private static final InterfaceC3706f b(InterfaceC3706f interfaceC3706f, Function1 function1, InterfaceC1668n interfaceC1668n) {
        if (interfaceC3706f instanceof C3705e) {
            C3705e c3705e = (C3705e) interfaceC3706f;
            if (c3705e.f36634b == function1 && c3705e.f36635c == interfaceC1668n) {
                return interfaceC3706f;
            }
        }
        return new C3705e(interfaceC3706f, function1, interfaceC1668n);
    }

    /* renamed from: o6.m$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f36654a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
