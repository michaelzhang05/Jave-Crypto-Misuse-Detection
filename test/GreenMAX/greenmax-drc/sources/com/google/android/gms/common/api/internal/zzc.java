package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.internal.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class zzc extends Fragment implements LifecycleFragment {

    /* renamed from: f, reason: collision with root package name */
    private static WeakHashMap<androidx.fragment.app.c, WeakReference<zzc>> f10760f = new WeakHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private Map<String, LifecycleCallback> f10761g = new c.e.a();

    /* renamed from: h, reason: collision with root package name */
    private int f10762h = 0;

    /* renamed from: i, reason: collision with root package name */
    private Bundle f10763i;

    public static zzc e(androidx.fragment.app.c cVar) {
        zzc zzcVar;
        WeakReference<zzc> weakReference = f10760f.get(cVar);
        if (weakReference != null && (zzcVar = weakReference.get()) != null) {
            return zzcVar;
        }
        try {
            zzc zzcVar2 = (zzc) cVar.getSupportFragmentManager().e("SupportLifecycleFragmentImpl");
            if (zzcVar2 == null || zzcVar2.isRemoving()) {
                zzcVar2 = new zzc();
                cVar.getSupportFragmentManager().a().d(zzcVar2, "SupportLifecycleFragmentImpl").i();
            }
            f10760f.put(cVar, new WeakReference<>(zzcVar2));
            return zzcVar2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f10761g.containsKey(str)) {
            this.f10761g.put(str, lifecycleCallback);
            if (this.f10762h > 0) {
                new zze(Looper.getMainLooper()).post(new y0(this, lifecycleCallback, str));
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
        return cls.cast(this.f10761g.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final /* synthetic */ Activity c() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.f10761g.values().iterator();
        while (it.hasNext()) {
            it.next().a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        Iterator<LifecycleCallback> it = this.f10761g.values().iterator();
        while (it.hasNext()) {
            it.next().d(i2, i3, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10762h = 1;
        this.f10763i = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f10761g.entrySet()) {
            entry.getValue().e(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f10762h = 5;
        Iterator<LifecycleCallback> it = this.f10761g.values().iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f10762h = 3;
        Iterator<LifecycleCallback> it = this.f10761g.values().iterator();
        while (it.hasNext()) {
            it.next().g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f10761g.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().h(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f10762h = 2;
        Iterator<LifecycleCallback> it = this.f10761g.values().iterator();
        while (it.hasNext()) {
            it.next().i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f10762h = 4;
        Iterator<LifecycleCallback> it = this.f10761g.values().iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }
}
