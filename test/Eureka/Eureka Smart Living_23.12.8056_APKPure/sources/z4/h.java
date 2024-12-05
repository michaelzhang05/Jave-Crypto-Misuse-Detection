package z4;

import java.io.Serializable;

/* loaded from: classes.dex */
final class h implements c, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private e5.a f10055a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f10056b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f10057c;

    public h(e5.a aVar, Object obj) {
        f5.h.e(aVar, "initializer");
        this.f10055a = aVar;
        this.f10056b = j.f10058a;
        this.f10057c = obj == null ? this : obj;
    }

    public boolean a() {
        return this.f10056b != j.f10058a;
    }

    @Override // z4.c
    public Object getValue() {
        Object obj;
        Object obj2 = this.f10056b;
        j jVar = j.f10058a;
        if (obj2 != jVar) {
            return obj2;
        }
        synchronized (this.f10057c) {
            obj = this.f10056b;
            if (obj == jVar) {
                e5.a aVar = this.f10055a;
                f5.h.b(aVar);
                obj = aVar.a();
                this.f10056b = obj;
                this.f10055a = null;
            }
        }
        return obj;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ h(e5.a aVar, Object obj, int i6, f5.f fVar) {
        this(aVar, (i6 & 2) != 0 ? null : obj);
    }
}
