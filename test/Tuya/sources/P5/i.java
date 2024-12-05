package P5;

import L5.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class i implements d, kotlin.coroutines.jvm.internal.e {

    /* renamed from: b, reason: collision with root package name */
    private static final a f7995b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f7996c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    private final d f7997a;
    private volatile Object result;

    /* loaded from: classes5.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public i(d delegate, Object obj) {
        AbstractC3159y.i(delegate, "delegate");
        this.f7997a = delegate;
        this.result = obj;
    }

    public final Object a() {
        Object obj = this.result;
        Q5.a aVar = Q5.a.f8325b;
        if (obj == aVar) {
            if (androidx.concurrent.futures.a.a(f7996c, this, aVar, Q5.b.e())) {
                return Q5.b.e();
            }
            obj = this.result;
        }
        if (obj == Q5.a.f8326c) {
            return Q5.b.e();
        }
        if (!(obj instanceof s.b)) {
            return obj;
        }
        throw ((s.b) obj).f6513a;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        d dVar = this.f7997a;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // P5.d
    public g getContext() {
        return this.f7997a.getContext();
    }

    @Override // P5.d
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            Q5.a aVar = Q5.a.f8325b;
            if (obj2 == aVar) {
                if (androidx.concurrent.futures.a.a(f7996c, this, aVar, obj)) {
                    return;
                }
            } else if (obj2 == Q5.b.e()) {
                if (androidx.concurrent.futures.a.a(f7996c, this, Q5.b.e(), Q5.a.f8326c)) {
                    this.f7997a.resumeWith(obj);
                    return;
                }
            } else {
                throw new IllegalStateException("Already resumed");
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f7997a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(d delegate) {
        this(delegate, Q5.a.f8325b);
        AbstractC3159y.i(delegate, "delegate");
    }
}
