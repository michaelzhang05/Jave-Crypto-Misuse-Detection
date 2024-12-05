package kotlin.coroutines;

import cm.aptoide.pt.database.room.RoomNotification;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import kotlin.u;
import okhttp3.HttpUrl;

/* compiled from: CoroutineContextImpl.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001!B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0000H\u0002J\u0013\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J5\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u0002H\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016¢\u0006\u0002\u0010\u0014J(\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0018H\u0096\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "contains", HttpUrl.FRAGMENT_ENCODE_SET, "containsAll", "context", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", RoomNotification.KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "minusKey", "size", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeReplace", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.y.c, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class CombinedContext implements CoroutineContext, Serializable {

    /* renamed from: f, reason: collision with root package name */
    private final CoroutineContext f22093f;

    /* renamed from: g, reason: collision with root package name */
    private final CoroutineContext.b f22094g;

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "elements", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/coroutines/CoroutineContext;", "([Lkotlin/coroutines/CoroutineContext;)V", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "[Lkotlin/coroutines/CoroutineContext;", "readResolve", HttpUrl.FRAGMENT_ENCODE_SET, "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.y.c$a */
    /* loaded from: classes2.dex */
    private static final class a implements Serializable {

        /* renamed from: f, reason: collision with root package name */
        public static final C0378a f22095f = new C0378a(null);

        /* renamed from: g, reason: collision with root package name */
        private final CoroutineContext[] f22096g;

        /* compiled from: CoroutineContextImpl.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "serialVersionUID", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
        /* renamed from: kotlin.y.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0378a {
            private C0378a() {
            }

            public /* synthetic */ C0378a(g gVar) {
                this();
            }
        }

        public a(CoroutineContext[] coroutineContextArr) {
            l.f(coroutineContextArr, "elements");
            this.f22096g = coroutineContextArr;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.f22096g;
            CoroutineContext coroutineContext = EmptyCoroutineContext.f22103f;
            for (CoroutineContext coroutineContext2 : coroutineContextArr) {
                coroutineContext = coroutineContext.plus(coroutineContext2);
            }
            return coroutineContext;
        }
    }

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.y.c$b */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function2<String, CoroutineContext.b, String> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f22097f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, CoroutineContext.b bVar) {
            l.f(str, "acc");
            l.f(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    /* compiled from: CoroutineContextImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous parameter 0>", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(Lkotlin/Unit;Lkotlin/coroutines/CoroutineContext$Element;)V"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.y.c$c */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function2<u, CoroutineContext.b, u> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ CoroutineContext[] f22098f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ y f22099g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CoroutineContext[] coroutineContextArr, y yVar) {
            super(2);
            this.f22098f = coroutineContextArr;
            this.f22099g = yVar;
        }

        public final void b(u uVar, CoroutineContext.b bVar) {
            l.f(uVar, "<anonymous parameter 0>");
            l.f(bVar, "element");
            CoroutineContext[] coroutineContextArr = this.f22098f;
            y yVar = this.f22099g;
            int i2 = yVar.f19475f;
            yVar.f19475f = i2 + 1;
            coroutineContextArr[i2] = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ u invoke(u uVar, CoroutineContext.b bVar) {
            b(uVar, bVar);
            return u.a;
        }
    }

    public CombinedContext(CoroutineContext coroutineContext, CoroutineContext.b bVar) {
        l.f(coroutineContext, "left");
        l.f(bVar, "element");
        this.f22093f = coroutineContext;
        this.f22094g = bVar;
    }

    private final boolean c(CoroutineContext.b bVar) {
        return l.a(get(bVar.getKey()), bVar);
    }

    private final boolean d(CombinedContext combinedContext) {
        while (c(combinedContext.f22094g)) {
            CoroutineContext coroutineContext = combinedContext.f22093f;
            if (coroutineContext instanceof CombinedContext) {
                combinedContext = (CombinedContext) coroutineContext;
            } else {
                l.d(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return c((CoroutineContext.b) coroutineContext);
            }
        }
        return false;
    }

    private final int e() {
        int i2 = 2;
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext coroutineContext = combinedContext.f22093f;
            combinedContext = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (combinedContext == null) {
                return i2;
            }
            i2++;
        }
    }

    private final Object writeReplace() {
        int e2 = e();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[e2];
        y yVar = new y();
        fold(u.a, new c(coroutineContextArr, yVar));
        if (yVar.f19475f == e2) {
            return new a(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean equals(Object other) {
        if (this != other) {
            if (other instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) other;
                if (combinedContext.e() != e() || !combinedContext.d(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.b, ? extends R> function2) {
        l.f(function2, "operation");
        return function2.invoke((Object) this.f22093f.fold(r, function2), this.f22094g);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.b> E get(CoroutineContext.c<E> cVar) {
        l.f(cVar, RoomNotification.KEY);
        CombinedContext combinedContext = this;
        while (true) {
            E e2 = (E) combinedContext.f22094g.get(cVar);
            if (e2 != null) {
                return e2;
            }
            CoroutineContext coroutineContext = combinedContext.f22093f;
            if (coroutineContext instanceof CombinedContext) {
                combinedContext = (CombinedContext) coroutineContext;
            } else {
                return (E) coroutineContext.get(cVar);
            }
        }
    }

    public int hashCode() {
        return this.f22093f.hashCode() + this.f22094g.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.c<?> cVar) {
        l.f(cVar, RoomNotification.KEY);
        if (this.f22094g.get(cVar) != null) {
            return this.f22093f;
        }
        CoroutineContext minusKey = this.f22093f.minusKey(cVar);
        return minusKey == this.f22093f ? this : minusKey == EmptyCoroutineContext.f22103f ? this.f22094g : new CombinedContext(minusKey, this.f22094g);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.a.a(this, coroutineContext);
    }

    public String toString() {
        return '[' + ((String) fold(HttpUrl.FRAGMENT_ENCODE_SET, b.f22097f)) + ']';
    }
}
