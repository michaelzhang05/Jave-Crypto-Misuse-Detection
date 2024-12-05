package com.bumptech.glide.m;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RequestManagerFragment.java */
@Deprecated
/* loaded from: classes.dex */
public class k extends Fragment {

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.m.a f8862f;

    /* renamed from: g, reason: collision with root package name */
    private final m f8863g;

    /* renamed from: h, reason: collision with root package name */
    private final Set<k> f8864h;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.i f8865i;

    /* renamed from: j, reason: collision with root package name */
    private k f8866j;

    /* renamed from: k, reason: collision with root package name */
    private Fragment f8867k;

    /* compiled from: RequestManagerFragment.java */
    /* loaded from: classes.dex */
    private class a implements m {
        a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + k.this + "}";
        }
    }

    public k() {
        this(new com.bumptech.glide.m.a());
    }

    private void a(k kVar) {
        this.f8864h.add(kVar);
    }

    @TargetApi(17)
    private Fragment c() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f8867k;
    }

    private void f(Activity activity) {
        j();
        k h2 = com.bumptech.glide.c.c(activity).k().h(activity);
        this.f8866j = h2;
        if (equals(h2)) {
            return;
        }
        this.f8866j.a(this);
    }

    private void g(k kVar) {
        this.f8864h.remove(kVar);
    }

    private void j() {
        k kVar = this.f8866j;
        if (kVar != null) {
            kVar.g(this);
            this.f8866j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.bumptech.glide.m.a b() {
        return this.f8862f;
    }

    public com.bumptech.glide.i d() {
        return this.f8865i;
    }

    public m e() {
        return this.f8863g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Fragment fragment) {
        this.f8867k = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        f(fragment.getActivity());
    }

    public void i(com.bumptech.glide.i iVar) {
        this.f8865i = iVar;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            f(activity);
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f8862f.c();
        j();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        j();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f8862f.d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f8862f.e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + c() + "}";
    }

    @SuppressLint({"ValidFragment"})
    k(com.bumptech.glide.m.a aVar) {
        this.f8863g = new a();
        this.f8864h = new HashSet();
        this.f8862f = aVar;
    }
}
