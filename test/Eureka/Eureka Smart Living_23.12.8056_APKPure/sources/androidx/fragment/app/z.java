package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z extends androidx.lifecycle.e0 {

    /* renamed from: k, reason: collision with root package name */
    private static final f0.b f3008k = new a();

    /* renamed from: g, reason: collision with root package name */
    private final boolean f3012g;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f3009d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f3010e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap f3011f = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private boolean f3013h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3014i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f3015j = false;

    /* loaded from: classes.dex */
    class a implements f0.b {
        a() {
        }

        @Override // androidx.lifecycle.f0.b
        public androidx.lifecycle.e0 a(Class cls) {
            return new z(true);
        }

        @Override // androidx.lifecycle.f0.b
        public /* synthetic */ androidx.lifecycle.e0 b(Class cls, f0.a aVar) {
            return androidx.lifecycle.g0.b(this, cls, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(boolean z5) {
        this.f3012g = z5;
    }

    private void i(String str) {
        z zVar = (z) this.f3010e.get(str);
        if (zVar != null) {
            zVar.d();
            this.f3010e.remove(str);
        }
        androidx.lifecycle.i0 i0Var = (androidx.lifecycle.i0) this.f3011f.get(str);
        if (i0Var != null) {
            i0Var.a();
            this.f3011f.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z l(androidx.lifecycle.i0 i0Var) {
        return (z) new androidx.lifecycle.f0(i0Var, f3008k).a(z.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.e0
    public void d() {
        if (w.H0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3013h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return this.f3009d.equals(zVar.f3009d) && this.f3010e.equals(zVar.f3010e) && this.f3011f.equals(zVar.f3011f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Fragment fragment) {
        if (this.f3015j) {
            if (w.H0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f3009d.containsKey(fragment.f2658f)) {
                return;
            }
            this.f3009d.put(fragment.f2658f, fragment);
            if (w.H0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Fragment fragment) {
        if (w.H0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        i(fragment.f2658f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(String str) {
        if (w.H0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        i(str);
    }

    public int hashCode() {
        return (((this.f3009d.hashCode() * 31) + this.f3010e.hashCode()) * 31) + this.f3011f.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment j(String str) {
        return (Fragment) this.f3009d.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z k(Fragment fragment) {
        z zVar = (z) this.f3010e.get(fragment.f2658f);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this.f3012g);
        this.f3010e.put(fragment.f2658f, zVar2);
        return zVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection m() {
        return new ArrayList(this.f3009d.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.lifecycle.i0 n(Fragment fragment) {
        androidx.lifecycle.i0 i0Var = (androidx.lifecycle.i0) this.f3011f.get(fragment.f2658f);
        if (i0Var != null) {
            return i0Var;
        }
        androidx.lifecycle.i0 i0Var2 = new androidx.lifecycle.i0();
        this.f3011f.put(fragment.f2658f, i0Var2);
        return i0Var2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        return this.f3013h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(Fragment fragment) {
        if (this.f3015j) {
            if (w.H0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f3009d.remove(fragment.f2658f) != null) && w.H0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(boolean z5) {
        this.f3015j = z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(Fragment fragment) {
        if (this.f3009d.containsKey(fragment.f2658f)) {
            return this.f3012g ? this.f3013h : !this.f3014i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f3009d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f3010e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f3011f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
