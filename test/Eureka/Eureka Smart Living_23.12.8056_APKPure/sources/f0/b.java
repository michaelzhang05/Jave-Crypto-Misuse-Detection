package f0;

import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import f5.h;

/* loaded from: classes.dex */
public final class b implements f0.b {

    /* renamed from: a, reason: collision with root package name */
    private final f[] f6576a;

    public b(f... fVarArr) {
        h.e(fVarArr, "initializers");
        this.f6576a = fVarArr;
    }

    @Override // androidx.lifecycle.f0.b
    public /* synthetic */ e0 a(Class cls) {
        return g0.a(this, cls);
    }

    @Override // androidx.lifecycle.f0.b
    public e0 b(Class cls, a aVar) {
        h.e(cls, "modelClass");
        h.e(aVar, "extras");
        e0 e0Var = null;
        for (f fVar : this.f6576a) {
            if (h.a(fVar.a(), cls)) {
                Object b6 = fVar.b().b(aVar);
                e0Var = b6 instanceof e0 ? (e0) b6 : null;
            }
        }
        if (e0Var != null) {
            return e0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
