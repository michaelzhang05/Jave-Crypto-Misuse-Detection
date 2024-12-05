package kotlinx.coroutines;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;

/* compiled from: CoroutineName.kt */
/* loaded from: classes2.dex */
public final class g0 extends AbstractCoroutineContextElement {

    /* renamed from: f, reason: collision with root package name */
    public static final a f22155f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private final String f22156g;

    /* compiled from: CoroutineName.kt */
    /* loaded from: classes2.dex */
    public static final class a implements CoroutineContext.c<g0> {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && kotlin.jvm.internal.l.a(this.f22156g, ((g0) obj).f22156g);
    }

    public int hashCode() {
        return this.f22156g.hashCode();
    }

    public final String s0() {
        return this.f22156g;
    }

    public String toString() {
        return "CoroutineName(" + this.f22156g + ')';
    }
}
