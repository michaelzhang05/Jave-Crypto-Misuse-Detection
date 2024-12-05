package kotlinx.coroutines;

import kotlin.jvm.functions.Function1;

/* compiled from: CompletionState.kt */
/* loaded from: classes2.dex */
public final class x {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1<Throwable, kotlin.u> f22298b;

    /* JADX WARN: Multi-variable type inference failed */
    public x(Object obj, Function1<? super Throwable, kotlin.u> function1) {
        this.a = obj;
        this.f22298b = function1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.l.a(this.a, xVar.a) && kotlin.jvm.internal.l.a(this.f22298b, xVar.f22298b);
    }

    public int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f22298b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.a + ", onCancellation=" + this.f22298b + ')';
    }
}
