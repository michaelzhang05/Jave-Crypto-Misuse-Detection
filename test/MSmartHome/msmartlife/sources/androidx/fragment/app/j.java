package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentManagerViewModel.java */
/* loaded from: classes.dex */
public class j extends u {

    /* renamed from: c, reason: collision with root package name */
    private static final v.a f1155c = new a();

    /* renamed from: g, reason: collision with root package name */
    private final boolean f1159g;

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<Fragment> f1156d = new HashSet<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, j> f1157e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<String, w> f1158f = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private boolean f1160h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1161i = false;

    /* compiled from: FragmentManagerViewModel.java */
    /* loaded from: classes.dex */
    static class a implements v.a {
        a() {
        }

        @Override // androidx.lifecycle.v.a
        public <T extends u> T a(Class<T> cls) {
            return new j(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(boolean z) {
        this.f1159g = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j g(w wVar) {
        return (j) new v(wVar, f1155c).a(j.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.u
    public void c() {
        if (i.f1127h) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1160h = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Fragment fragment) {
        return this.f1156d.add(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Fragment fragment) {
        if (i.f1127h) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        j jVar = this.f1157e.get(fragment.mWho);
        if (jVar != null) {
            jVar.c();
            this.f1157e.remove(fragment.mWho);
        }
        w wVar = this.f1158f.get(fragment.mWho);
        if (wVar != null) {
            wVar.a();
            this.f1158f.remove(fragment.mWho);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f1156d.equals(jVar.f1156d) && this.f1157e.equals(jVar.f1157e) && this.f1158f.equals(jVar.f1158f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j f(Fragment fragment) {
        j jVar = this.f1157e.get(fragment.mWho);
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this.f1159g);
        this.f1157e.put(fragment.mWho, jVar2);
        return jVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<Fragment> h() {
        return this.f1156d;
    }

    public int hashCode() {
        return (((this.f1156d.hashCode() * 31) + this.f1157e.hashCode()) * 31) + this.f1158f.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w i(Fragment fragment) {
        w wVar = this.f1158f.get(fragment.mWho);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w();
        this.f1158f.put(fragment.mWho, wVar2);
        return wVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return this.f1160h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k(Fragment fragment) {
        return this.f1156d.remove(fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l(Fragment fragment) {
        if (!this.f1156d.contains(fragment)) {
            return true;
        }
        if (this.f1159g) {
            return this.f1160h;
        }
        return !this.f1161i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f1156d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1157e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1158f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
