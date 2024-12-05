package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.f0;
import androidx.lifecycle.h;
import androidx.savedstate.a;
import f0.a;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final a.b f3134a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final a.b f3135b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final a.b f3136c = new a();

    /* loaded from: classes.dex */
    public static final class a implements a.b {
        a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements a.b {
        b() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements a.b {
        c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends f5.i implements e5.l {

        /* renamed from: b, reason: collision with root package name */
        public static final d f3137b = new d();

        d() {
            super(1);
        }

        @Override // e5.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final b0 b(f0.a aVar) {
            f5.h.e(aVar, "$this$initializer");
            return new b0();
        }
    }

    public static final y a(f0.a aVar) {
        f5.h.e(aVar, "<this>");
        i0.d dVar = (i0.d) aVar.a(f3134a);
        if (dVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        j0 j0Var = (j0) aVar.a(f3135b);
        if (j0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f3136c);
        String str = (String) aVar.a(f0.c.f3082c);
        if (str != null) {
            return b(dVar, j0Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final y b(i0.d dVar, j0 j0Var, String str, Bundle bundle) {
        a0 d6 = d(dVar);
        b0 e6 = e(j0Var);
        y yVar = (y) e6.f().get(str);
        if (yVar != null) {
            return yVar;
        }
        y a6 = y.f3127f.a(d6.b(str), bundle);
        e6.f().put(str, a6);
        return a6;
    }

    public static final void c(i0.d dVar) {
        f5.h.e(dVar, "<this>");
        h.b b6 = dVar.r().b();
        if (!(b6 == h.b.INITIALIZED || b6 == h.b.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (dVar.d().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            a0 a0Var = new a0(dVar.d(), (j0) dVar);
            dVar.d().h("androidx.lifecycle.internal.SavedStateHandlesProvider", a0Var);
            dVar.r().a(new SavedStateHandleAttacher(a0Var));
        }
    }

    public static final a0 d(i0.d dVar) {
        f5.h.e(dVar, "<this>");
        a.c c6 = dVar.d().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        a0 a0Var = c6 instanceof a0 ? (a0) c6 : null;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final b0 e(j0 j0Var) {
        f5.h.e(j0Var, "<this>");
        f0.c cVar = new f0.c();
        cVar.a(f5.j.a(b0.class), d.f3137b);
        return (b0) new f0(j0Var, cVar.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", b0.class);
    }
}
