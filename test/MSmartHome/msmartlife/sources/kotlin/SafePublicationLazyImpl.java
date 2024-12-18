package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import okhttp3.HttpUrl;

/* compiled from: LazyJVM.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u0000 \u0013*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004:\u0001\u0013B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0088\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", HttpUrl.FRAGMENT_ENCODE_SET, "final", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "writeReplace", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: kotlin.p, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
final class SafePublicationLazyImpl<T> implements Lazy<T>, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final a f21605f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f21606g = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "i");

    /* renamed from: h, reason: collision with root package name */
    private volatile Function0<? extends T> f21607h;

    /* renamed from: i, reason: collision with root package name */
    private volatile Object f21608i;

    /* renamed from: j, reason: collision with root package name */
    private final Object f21609j;

    /* compiled from: LazyJVM.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R^\u0010\u0003\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001 \u0006*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/SafePublicationLazyImpl$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "valueUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/SafePublicationLazyImpl;", "kotlin.jvm.PlatformType", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: kotlin.p$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public SafePublicationLazyImpl(Function0<? extends T> function0) {
        kotlin.jvm.internal.l.f(function0, "initializer");
        this.f21607h = function0;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.a;
        this.f21608i = uninitialized_value;
        this.f21609j = uninitialized_value;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    public boolean a() {
        return this.f21608i != UNINITIALIZED_VALUE.a;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        T t = (T) this.f21608i;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.a;
        if (t != uninitialized_value) {
            return t;
        }
        Function0<? extends T> function0 = this.f21607h;
        if (function0 != null) {
            T invoke = function0.invoke();
            if (f21606g.compareAndSet(this, uninitialized_value, invoke)) {
                this.f21607h = null;
                return invoke;
            }
        }
        return (T) this.f21608i;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
