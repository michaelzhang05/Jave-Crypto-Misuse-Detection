package S5;

import S5.e;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes5.dex */
public interface g {

    /* loaded from: classes5.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S5.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0196a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            public static final C0196a f9824a = new C0196a();

            C0196a() {
                super(2);
            }

            @Override // a6.InterfaceC1668n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g invoke(g acc, b element) {
                S5.c cVar;
                AbstractC3255y.i(acc, "acc");
                AbstractC3255y.i(element, "element");
                g minusKey = acc.minusKey(element.getKey());
                h hVar = h.f9825a;
                if (minusKey != hVar) {
                    e.b bVar = e.f9822a0;
                    e eVar = (e) minusKey.get(bVar);
                    if (eVar == null) {
                        cVar = new S5.c(minusKey, element);
                    } else {
                        g minusKey2 = minusKey.minusKey(bVar);
                        if (minusKey2 == hVar) {
                            return new S5.c(element, eVar);
                        }
                        cVar = new S5.c(new S5.c(minusKey2, element), eVar);
                    }
                    return cVar;
                }
                return element;
            }
        }

        public static g a(g gVar, g context) {
            AbstractC3255y.i(context, "context");
            if (context != h.f9825a) {
                return (g) context.fold(gVar, C0196a.f9824a);
            }
            return gVar;
        }
    }

    /* loaded from: classes5.dex */
    public interface b extends g {

        /* loaded from: classes5.dex */
        public static final class a {
            public static Object a(b bVar, Object obj, InterfaceC1668n operation) {
                AbstractC3255y.i(operation, "operation");
                return operation.invoke(obj, bVar);
            }

            public static b b(b bVar, c key) {
                AbstractC3255y.i(key, "key");
                if (AbstractC3255y.d(bVar.getKey(), key)) {
                    AbstractC3255y.g(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return bVar;
                }
                return null;
            }

            public static g c(b bVar, c key) {
                AbstractC3255y.i(key, "key");
                if (AbstractC3255y.d(bVar.getKey(), key)) {
                    return h.f9825a;
                }
                return bVar;
            }

            public static g d(b bVar, g context) {
                AbstractC3255y.i(context, "context");
                return a.a(bVar, context);
            }
        }

        @Override // S5.g
        Object fold(Object obj, InterfaceC1668n interfaceC1668n);

        @Override // S5.g
        b get(c cVar);

        c getKey();

        @Override // S5.g
        g minusKey(c cVar);
    }

    /* loaded from: classes5.dex */
    public interface c {
    }

    Object fold(Object obj, InterfaceC1668n interfaceC1668n);

    b get(c cVar);

    g minusKey(c cVar);

    g plus(g gVar);
}
