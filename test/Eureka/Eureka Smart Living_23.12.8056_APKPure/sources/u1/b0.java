package u1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b0 extends Fragment implements e {

    /* renamed from: f0, reason: collision with root package name */
    private static final WeakHashMap f9382f0 = new WeakHashMap();

    /* renamed from: c0, reason: collision with root package name */
    private final Map f9383c0 = Collections.synchronizedMap(new l.a());

    /* renamed from: d0, reason: collision with root package name */
    private int f9384d0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    private Bundle f9385e0;

    public static b0 I1(androidx.fragment.app.j jVar) {
        b0 b0Var;
        WeakHashMap weakHashMap = f9382f0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(jVar);
        if (weakReference != null && (b0Var = (b0) weakReference.get()) != null) {
            return b0Var;
        }
        try {
            b0 b0Var2 = (b0) jVar.U().i0("SupportLifecycleFragmentImpl");
            if (b0Var2 == null || b0Var2.g0()) {
                b0Var2 = new b0();
                jVar.U().o().d(b0Var2, "SupportLifecycleFragmentImpl").g();
            }
            weakHashMap.put(jVar, new WeakReference(b0Var2));
            return b0Var2;
        } catch (ClassCastException e6) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e6);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void K0() {
        super.K0();
        this.f9384d0 = 3;
        Iterator it = this.f9383c0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void L0(Bundle bundle) {
        super.L0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f9383c0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void M0() {
        super.M0();
        this.f9384d0 = 2;
        Iterator it = this.f9383c0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void N0() {
        super.N0();
        this.f9384d0 = 4;
        Iterator it = this.f9383c0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }

    @Override // u1.e
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (this.f9383c0.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f9383c0.put(str, lifecycleCallback);
        if (this.f9384d0 > 0) {
            new f2.e(Looper.getMainLooper()).post(new a0(this, lifecycleCallback, str));
        }
    }

    @Override // u1.e
    public final LifecycleCallback e(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f9383c0.get(str));
    }

    @Override // u1.e
    public final /* synthetic */ Activity f() {
        return m();
    }

    @Override // androidx.fragment.app.Fragment
    public final void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.i(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f9383c0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void k0(int i6, int i7, Intent intent) {
        super.k0(i6, i7, intent);
        Iterator it = this.f9383c0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i6, i7, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void p0(Bundle bundle) {
        super.p0(bundle);
        this.f9384d0 = 1;
        this.f9385e0 = bundle;
        for (Map.Entry entry : this.f9383c0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void u0() {
        super.u0();
        this.f9384d0 = 5;
        Iterator it = this.f9383c0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }
}
