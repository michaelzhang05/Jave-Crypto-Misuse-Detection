package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ThreadContext.kt */
/* loaded from: classes2.dex */
public final class c0 {
    public final CoroutineContext a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f22207b;

    /* renamed from: c, reason: collision with root package name */
    private final a2<Object>[] f22208c;

    /* renamed from: d, reason: collision with root package name */
    private int f22209d;

    public c0(CoroutineContext coroutineContext, int i2) {
        this.a = coroutineContext;
        this.f22207b = new Object[i2];
        this.f22208c = new a2[i2];
    }

    public final void a(a2<?> a2Var, Object obj) {
        Object[] objArr = this.f22207b;
        int i2 = this.f22209d;
        objArr[i2] = obj;
        a2<Object>[] a2VarArr = this.f22208c;
        this.f22209d = i2 + 1;
        a2VarArr[i2] = a2Var;
    }

    public final void b(CoroutineContext coroutineContext) {
        int length = this.f22208c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i2 = length - 1;
            a2<Object> a2Var = this.f22208c[length];
            kotlin.jvm.internal.l.c(a2Var);
            a2Var.c0(coroutineContext, this.f22207b[length]);
            if (i2 < 0) {
                return;
            } else {
                length = i2;
            }
        }
    }
}
