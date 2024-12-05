package kotlin.reflect.x.internal.l0.m;

import kotlin.jvm.internal.l;
import kotlin.reflect.KClass;

/* compiled from: AttributeArrayOwner.kt */
/* loaded from: classes2.dex */
public abstract class e<K, T> extends a<K, T> {

    /* renamed from: f, reason: collision with root package name */
    private c<T> f21402f;

    protected e(c<T> cVar) {
        l.f(cVar, "arrayMap");
        this.f21402f = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.x.internal.l0.m.a
    public final c<T> a() {
        return this.f21402f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public final void f(KClass<? extends K> kClass, T t) {
        l.f(kClass, "tClass");
        l.f(t, "value");
        int d2 = b().d(kClass);
        int a = this.f21402f.a();
        if (a != 0) {
            if (a == 1) {
                c<T> cVar = this.f21402f;
                l.d(cVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                o oVar = (o) cVar;
                if (oVar.f() == d2) {
                    this.f21402f = new o(t, d2);
                    return;
                } else {
                    d dVar = new d();
                    this.f21402f = dVar;
                    dVar.b(oVar.f(), oVar.w());
                }
            }
            this.f21402f.b(d2, t);
            return;
        }
        this.f21402f = new o(t, d2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e() {
        /*
            r2 = this;
            kotlin.f0.x.e.l0.m.i r0 = kotlin.reflect.x.internal.l0.m.i.f21413f
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>"
            kotlin.jvm.internal.l.d(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.m.e.<init>():void");
    }
}
