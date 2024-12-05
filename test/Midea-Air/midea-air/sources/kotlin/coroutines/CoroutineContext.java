package kotlin.coroutines;

import cm.aptoide.pt.database.room.RoomNotification;
import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: CoroutineContext.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J5\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00032\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u00030\u0006H&¢\u0006\u0002\u0010\bJ(\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH¦\u0002¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u00002\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH&J\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0002¨\u0006\u0013"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", HttpUrl.FRAGMENT_ENCODE_SET, "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", RoomNotification.KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "plus", "context", "Element", "Key", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.y.g, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public interface CoroutineContext {

    /* compiled from: CoroutineContext.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.y.g$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoroutineContext.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/coroutines/CoroutineContext;", "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.y.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0379a extends Lambda implements Function2<CoroutineContext, b, CoroutineContext> {

            /* renamed from: f, reason: collision with root package name */
            public static final C0379a f22102f = new C0379a();

            C0379a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CoroutineContext invoke(CoroutineContext coroutineContext, b bVar) {
                CombinedContext combinedContext;
                l.f(coroutineContext, "acc");
                l.f(bVar, "element");
                CoroutineContext minusKey = coroutineContext.minusKey(bVar.getKey());
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f22103f;
                if (minusKey == emptyCoroutineContext) {
                    return bVar;
                }
                ContinuationInterceptor.b bVar2 = ContinuationInterceptor.f22100b;
                ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) minusKey.get(bVar2);
                if (continuationInterceptor == null) {
                    combinedContext = new CombinedContext(minusKey, bVar);
                } else {
                    CoroutineContext minusKey2 = minusKey.minusKey(bVar2);
                    if (minusKey2 == emptyCoroutineContext) {
                        return new CombinedContext(bVar, continuationInterceptor);
                    }
                    combinedContext = new CombinedContext(new CombinedContext(minusKey2, bVar), continuationInterceptor);
                }
                return combinedContext;
            }
        }

        public static CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
            l.f(coroutineContext2, "context");
            return coroutineContext2 == EmptyCoroutineContext.f22103f ? coroutineContext : (CoroutineContext) coroutineContext2.fold(coroutineContext, C0379a.f22102f);
        }
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J5\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u0002H\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b\u0000\u0010\r*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\r0\u0003H\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016R\u0016\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", RoomNotification.KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.y.g$b */
    /* loaded from: classes2.dex */
    public interface b extends CoroutineContext {

        /* compiled from: CoroutineContext.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.y.g$b$a */
        /* loaded from: classes2.dex */
        public static final class a {
            public static <R> R a(b bVar, R r, Function2<? super R, ? super b, ? extends R> function2) {
                l.f(function2, "operation");
                return function2.invoke(r, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> cVar) {
                l.f(cVar, RoomNotification.KEY);
                if (!l.a(bVar.getKey(), cVar)) {
                    return null;
                }
                l.d(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static CoroutineContext c(b bVar, c<?> cVar) {
                l.f(cVar, RoomNotification.KEY);
                return l.a(bVar.getKey(), cVar) ? EmptyCoroutineContext.f22103f : bVar;
            }

            public static CoroutineContext d(b bVar, CoroutineContext coroutineContext) {
                l.f(coroutineContext, "context");
                return a.a(bVar, coroutineContext);
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Key;", "E", "Lkotlin/coroutines/CoroutineContext$Element;", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.y.g$c */
    /* loaded from: classes2.dex */
    public interface c<E extends b> {
    }

    <R> R fold(R r, Function2<? super R, ? super b, ? extends R> function2);

    <E extends b> E get(c<E> cVar);

    CoroutineContext minusKey(c<?> cVar);

    CoroutineContext plus(CoroutineContext coroutineContext);
}
