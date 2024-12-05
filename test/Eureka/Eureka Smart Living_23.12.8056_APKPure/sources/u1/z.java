package u1;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z extends Fragment implements e {

    /* renamed from: d, reason: collision with root package name */
    private static final WeakHashMap f9409d = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Map f9410a = Collections.synchronizedMap(new l.a());

    /* renamed from: b, reason: collision with root package name */
    private int f9411b = 0;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f9412c;

    public static z d(Activity activity) {
        z zVar;
        WeakHashMap weakHashMap = f9409d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (zVar = (z) weakReference.get()) != null) {
            return zVar;
        }
        try {
            z zVar2 = (z) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zVar2 == null || zVar2.isRemoving()) {
                zVar2 = new z();
                activity.getFragmentManager().beginTransaction().add(zVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(zVar2));
            return zVar2;
        } catch (ClassCastException e6) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e6);
        }
    }

    @Override // u1.e
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        if (this.f9410a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f9410a.put(str, lifecycleCallback);
        if (this.f9411b > 0) {
            new f2.e(Looper.getMainLooper()).post(new y(this, lifecycleCallback, str));
        }
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f9410a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // u1.e
    public final LifecycleCallback e(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f9410a.get(str));
    }

    @Override // u1.e
    public final Activity f() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i6, int i7, Intent intent) {
        super.onActivityResult(i6, i7, intent);
        Iterator it = this.f9410a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i6, i7, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9411b = 1;
        this.f9412c = bundle;
        for (Map.Entry entry : this.f9410a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f9411b = 5;
        Iterator it = this.f9410a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f9411b = 3;
        Iterator it = this.f9410a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f9410a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f9411b = 2;
        Iterator it = this.f9410a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f9411b = 4;
        Iterator it = this.f9410a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }
}
