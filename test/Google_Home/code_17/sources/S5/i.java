package S5;

import O5.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class i implements d, kotlin.coroutines.jvm.internal.e {

    /* renamed from: b, reason: collision with root package name */
    private static final a f9826b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f9827c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    private final d f9828a;
    private volatile Object result;

    /* loaded from: classes5.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public i(d delegate, Object obj) {
        AbstractC3255y.i(delegate, "delegate");
        this.f9828a = delegate;
        this.result = obj;
    }

    public final Object a() {
        Object obj = this.result;
        T5.a aVar = T5.a.f10122b;
        if (obj == aVar) {
            if (androidx.concurrent.futures.a.a(f9827c, this, aVar, T5.b.e())) {
                return T5.b.e();
            }
            obj = this.result;
        }
        if (obj == T5.a.f10123c) {
            return T5.b.e();
        }
        if (!(obj instanceof s.b)) {
            return obj;
        }
        throw ((s.b) obj).f8304a;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        d dVar = this.f9828a;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // S5.d
    public g getContext() {
        return this.f9828a.getContext();
    }

    @Override // S5.d
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            T5.a aVar = T5.a.f10122b;
            if (obj2 == aVar) {
                if (androidx.concurrent.futures.a.a(f9827c, this, aVar, obj)) {
                    return;
                }
            } else if (obj2 == T5.b.e()) {
                if (androidx.concurrent.futures.a.a(f9827c, this, T5.b.e(), T5.a.f10123c)) {
                    this.f9828a.resumeWith(obj);
                    return;
                }
            } else {
                throw new IllegalStateException("Already resumed");
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f9828a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(d delegate) {
        this(delegate, T5.a.f10122b);
        AbstractC3255y.i(delegate, "delegate");
    }
}
