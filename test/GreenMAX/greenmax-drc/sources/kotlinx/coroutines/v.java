package kotlinx.coroutines;

import kotlin.jvm.functions.Function1;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes2.dex */
final class v {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final j f22291b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1<Throwable, kotlin.u> f22292c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22293d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f22294e;

    /* JADX WARN: Multi-variable type inference failed */
    public v(Object obj, j jVar, Function1<? super Throwable, kotlin.u> function1, Object obj2, Throwable th) {
        this.a = obj;
        this.f22291b = jVar;
        this.f22292c = function1;
        this.f22293d = obj2;
        this.f22294e = th;
    }

    public static /* synthetic */ v b(v vVar, Object obj, j jVar, Function1 function1, Object obj2, Throwable th, int i2, Object obj3) {
        if ((i2 & 1) != 0) {
            obj = vVar.a;
        }
        if ((i2 & 2) != 0) {
            jVar = vVar.f22291b;
        }
        j jVar2 = jVar;
        if ((i2 & 4) != 0) {
            function1 = vVar.f22292c;
        }
        Function1 function12 = function1;
        if ((i2 & 8) != 0) {
            obj2 = vVar.f22293d;
        }
        Object obj4 = obj2;
        if ((i2 & 16) != 0) {
            th = vVar.f22294e;
        }
        return vVar.a(obj, jVar2, function12, obj4, th);
    }

    public final v a(Object obj, j jVar, Function1<? super Throwable, kotlin.u> function1, Object obj2, Throwable th) {
        return new v(obj, jVar, function1, obj2, th);
    }

    public final boolean c() {
        return this.f22294e != null;
    }

    public final void d(m<?> mVar, Throwable th) {
        j jVar = this.f22291b;
        if (jVar != null) {
            mVar.l(jVar, th);
        }
        Function1<Throwable, kotlin.u> function1 = this.f22292c;
        if (function1 == null) {
            return;
        }
        mVar.m(function1, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.l.a(this.a, vVar.a) && kotlin.jvm.internal.l.a(this.f22291b, vVar.f22291b) && kotlin.jvm.internal.l.a(this.f22292c, vVar.f22292c) && kotlin.jvm.internal.l.a(this.f22293d, vVar.f22293d) && kotlin.jvm.internal.l.a(this.f22294e, vVar.f22294e);
    }

    public int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        j jVar = this.f22291b;
        int hashCode2 = (hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Function1<Throwable, kotlin.u> function1 = this.f22292c;
        int hashCode3 = (hashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Object obj2 = this.f22293d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f22294e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.f22291b + ", onCancellation=" + this.f22292c + ", idempotentResume=" + this.f22293d + ", cancelCause=" + this.f22294e + ')';
    }

    public /* synthetic */ v(Object obj, j jVar, Function1 function1, Object obj2, Throwable th, int i2, kotlin.jvm.internal.g gVar) {
        this(obj, (i2 & 2) != 0 ? null : jVar, (i2 & 4) != 0 ? null : function1, (i2 & 8) != 0 ? null : obj2, (i2 & 16) != 0 ? null : th);
    }
}
