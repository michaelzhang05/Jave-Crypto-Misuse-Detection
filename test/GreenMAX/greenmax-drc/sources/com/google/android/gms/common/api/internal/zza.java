package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class zza extends Fragment implements LifecycleFragment {

    /* renamed from: f, reason: collision with root package name */
    private static WeakHashMap<Activity, WeakReference<zza>> f10756f = new WeakHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private Map<String, LifecycleCallback> f10757g = new c.e.a();

    /* renamed from: h, reason: collision with root package name */
    private int f10758h = 0;

    /* renamed from: i, reason: collision with root package name */
    private Bundle f10759i;

    public static zza e(Activity activity) {
        zza zzaVar;
        WeakReference<zza> weakReference = f10756f.get(activity);
        if (weakReference != null && (zzaVar = weakReference.get()) != null) {
            return zzaVar;
        }
        try {
            zza zzaVar2 = (zza) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zzaVar2 == null || zzaVar2.isRemoving()) {
                zzaVar2 = new zza();
                activity.getFragmentManager().beginTransaction().add(zzaVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f10756f.put(activity, new WeakReference<>(zzaVar2));
            return zzaVar2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f10757g.containsKey(str)) {
            this.f10757g.put(str, lifecycleCallback);
            if (this.f10758h > 0) {
                new zze(Looper.getMainLooper()).post(new x0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final <T extends LifecycleCallback> T b(String str, Class<T> cls) {
        return cls.cast(this.f10757g.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final Activity c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.f10757g.values().iterator();
        while (it.hasNext()) {
            it.next().a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        Iterator<LifecycleCallback> it = this.f10757g.values().iterator();
        while (it.hasNext()) {
            it.next().d(i2, i3, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10758h = 1;
        this.f10759i = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f10757g.entrySet()) {
            entry.getValue().e(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f10758h = 5;
        Iterator<LifecycleCallback> it = this.f10757g.values().iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f10758h = 3;
        Iterator<LifecycleCallback> it = this.f10757g.values().iterator();
        while (it.hasNext()) {
            it.next().g();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f10757g.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().h(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f10758h = 2;
        Iterator<LifecycleCallback> it = this.f10757g.values().iterator();
        while (it.hasNext()) {
            it.next().i();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f10758h = 4;
        Iterator<LifecycleCallback> it = this.f10757g.values().iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }
}
