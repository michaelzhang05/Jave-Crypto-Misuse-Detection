package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 implements a.c {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.savedstate.a f3049a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3050b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f3051c;

    /* renamed from: d, reason: collision with root package name */
    private final z4.c f3052d;

    /* loaded from: classes.dex */
    static final class a extends f5.i implements e5.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f3053b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j0 j0Var) {
            super(0);
            this.f3053b = j0Var;
        }

        @Override // e5.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final b0 a() {
            return z.e(this.f3053b);
        }
    }

    public a0(androidx.savedstate.a aVar, j0 j0Var) {
        z4.c a6;
        f5.h.e(aVar, "savedStateRegistry");
        f5.h.e(j0Var, "viewModelStoreOwner");
        this.f3049a = aVar;
        a6 = z4.e.a(new a(j0Var));
        this.f3052d = a6;
    }

    private final b0 c() {
        return (b0) this.f3052d.getValue();
    }

    @Override // androidx.savedstate.a.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3051c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : c().f().entrySet()) {
            String str = (String) entry.getKey();
            Bundle a6 = ((y) entry.getValue()).c().a();
            if (!f5.h.a(a6, Bundle.EMPTY)) {
                bundle.putBundle(str, a6);
            }
        }
        this.f3050b = false;
        return bundle;
    }

    public final Bundle b(String str) {
        f5.h.e(str, "key");
        d();
        Bundle bundle = this.f3051c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f3051c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f3051c;
        boolean z5 = false;
        if (bundle4 != null && bundle4.isEmpty()) {
            z5 = true;
        }
        if (z5) {
            this.f3051c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.f3050b) {
            return;
        }
        this.f3051c = this.f3049a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        this.f3050b = true;
        c();
    }
}
