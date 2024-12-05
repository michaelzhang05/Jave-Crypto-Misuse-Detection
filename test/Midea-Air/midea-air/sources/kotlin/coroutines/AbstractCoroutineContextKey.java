package kotlin.coroutines;

import cm.aptoide.pt.database.room.RoomNotification;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: CoroutineContextImpl.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u0002H\u00012\b\u0012\u0004\u0012\u0002H\u00030\u0004B8\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012#\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007¢\u0006\u0002\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0002\b\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R+\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlin/coroutines/AbstractCoroutineContextKey;", "B", "Lkotlin/coroutines/CoroutineContext$Element;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "baseKey", "safeCast", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "(Lkotlin/coroutines/CoroutineContext$Key;Lkotlin/jvm/functions/Function1;)V", "topmostKey", "isSubKey", HttpUrl.FRAGMENT_ENCODE_SET, RoomNotification.KEY, "isSubKey$kotlin_stdlib", "tryCast", "tryCast$kotlin_stdlib", "(Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext$Element;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.y.b, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public abstract class AbstractCoroutineContextKey<B extends CoroutineContext.b, E extends B> implements CoroutineContext.c<E> {

    /* renamed from: f, reason: collision with root package name */
    private final Function1<CoroutineContext.b, E> f22091f;

    /* renamed from: g, reason: collision with root package name */
    private final CoroutineContext.c<?> f22092g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.y.g$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.a0.c.l<kotlin.y.g$b, E extends B>, kotlin.a0.c.l<? super kotlin.y.g$b, ? extends E extends B>] */
    public AbstractCoroutineContextKey(CoroutineContext.c<B> cVar, Function1<? super CoroutineContext.b, ? extends E> function1) {
        l.f(cVar, "baseKey");
        l.f(function1, "safeCast");
        this.f22091f = function1;
        this.f22092g = cVar instanceof AbstractCoroutineContextKey ? (CoroutineContext.c<B>) ((AbstractCoroutineContextKey) cVar).f22092g : cVar;
    }

    public final boolean a(CoroutineContext.c<?> cVar) {
        l.f(cVar, RoomNotification.KEY);
        return cVar == this || this.f22092g == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/y/g$b;)TE; */
    public final CoroutineContext.b b(CoroutineContext.b bVar) {
        l.f(bVar, "element");
        return (CoroutineContext.b) this.f22091f.invoke(bVar);
    }
}
