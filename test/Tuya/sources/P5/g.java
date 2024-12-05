package P5;

import P5.e;
import X5.n;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes5.dex */
public interface g {

    /* loaded from: classes5.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: P5.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0170a extends AbstractC3160z implements n {

            /* renamed from: a, reason: collision with root package name */
            public static final C0170a f7993a = new C0170a();

            C0170a() {
                super(2);
            }

            @Override // X5.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g invoke(g acc, b element) {
                P5.c cVar;
                AbstractC3159y.i(acc, "acc");
                AbstractC3159y.i(element, "element");
                g minusKey = acc.minusKey(element.getKey());
                h hVar = h.f7994a;
                if (minusKey != hVar) {
                    e.b bVar = e.f7991a0;
                    e eVar = (e) minusKey.get(bVar);
                    if (eVar == null) {
                        cVar = new P5.c(minusKey, element);
                    } else {
                        g minusKey2 = minusKey.minusKey(bVar);
                        if (minusKey2 == hVar) {
                            return new P5.c(element, eVar);
                        }
                        cVar = new P5.c(new P5.c(minusKey2, element), eVar);
                    }
                    return cVar;
                }
                return element;
            }
        }

        public static g a(g gVar, g context) {
            AbstractC3159y.i(context, "context");
            if (context != h.f7994a) {
                return (g) context.fold(gVar, C0170a.f7993a);
            }
            return gVar;
        }
    }

    /* loaded from: classes5.dex */
    public interface b extends g {

        /* loaded from: classes5.dex */
        public static final class a {
            public static Object a(b bVar, Object obj, n operation) {
                AbstractC3159y.i(operation, "operation");
                return operation.invoke(obj, bVar);
            }

            public static b b(b bVar, c key) {
                AbstractC3159y.i(key, "key");
                if (AbstractC3159y.d(bVar.getKey(), key)) {
                    AbstractC3159y.g(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return bVar;
                }
                return null;
            }

            public static g c(b bVar, c key) {
                AbstractC3159y.i(key, "key");
                if (AbstractC3159y.d(bVar.getKey(), key)) {
                    return h.f7994a;
                }
                return bVar;
            }

            public static g d(b bVar, g context) {
                AbstractC3159y.i(context, "context");
                return a.a(bVar, context);
            }
        }

        @Override // P5.g
        Object fold(Object obj, n nVar);

        @Override // P5.g
        b get(c cVar);

        c getKey();

        @Override // P5.g
        g minusKey(c cVar);
    }

    /* loaded from: classes5.dex */
    public interface c {
    }

    Object fold(Object obj, n nVar);

    b get(c cVar);

    g minusKey(c cVar);

    g plus(g gVar);
}
