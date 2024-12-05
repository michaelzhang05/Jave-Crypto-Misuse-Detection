package kotlinx.coroutines;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
public final class f0 extends AbstractCoroutineContextElement implements a2<String> {

    /* renamed from: f, reason: collision with root package name */
    public static final a f22150f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private final long f22151g;

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes2.dex */
    public static final class a implements CoroutineContext.c<f0> {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public f0(long j2) {
        super(f22150f);
        this.f22151g = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && this.f22151g == ((f0) obj).f22151g;
    }

    public int hashCode() {
        return cm.aptoide.pt.aab.a.a(this.f22151g);
    }

    public final long s0() {
        return this.f22151g;
    }

    @Override // kotlinx.coroutines.a2
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public void c0(CoroutineContext coroutineContext, String str) {
        Thread.currentThread().setName(str);
    }

    public String toString() {
        return "CoroutineId(" + this.f22151g + ')';
    }

    @Override // kotlinx.coroutines.a2
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public String k0(CoroutineContext coroutineContext) {
        int X;
        String s0;
        g0 g0Var = (g0) coroutineContext.get(g0.f22155f);
        String str = "coroutine";
        if (g0Var != null && (s0 = g0Var.s0()) != null) {
            str = s0;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        X = kotlin.text.v.X(name, " @", 0, false, 6, null);
        if (X < 0) {
            X = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + X + 10);
        if (name != null) {
            String substring = name.substring(0, X);
            kotlin.jvm.internal.l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append(" @");
            sb.append(str);
            sb.append('#');
            sb.append(s0());
            kotlin.u uVar = kotlin.u.a;
            String sb2 = sb.toString();
            kotlin.jvm.internal.l.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
            currentThread.setName(sb2);
            return name;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
}
