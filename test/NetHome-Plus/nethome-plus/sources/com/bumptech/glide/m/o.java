package com.bumptech.glide.m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.HashSet;
import java.util.Set;

/* compiled from: SupportRequestManagerFragment.java */
/* loaded from: classes.dex */
public class o extends Fragment {

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.m.a f8876f;

    /* renamed from: g, reason: collision with root package name */
    private final m f8877g;

    /* renamed from: h, reason: collision with root package name */
    private final Set<o> f8878h;

    /* renamed from: i, reason: collision with root package name */
    private o f8879i;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.i f8880j;

    /* renamed from: k, reason: collision with root package name */
    private Fragment f8881k;

    /* compiled from: SupportRequestManagerFragment.java */
    /* loaded from: classes.dex */
    private class a implements m {
        a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + o.this + "}";
        }
    }

    public o() {
        this(new com.bumptech.glide.m.a());
    }

    private void d(o oVar) {
        this.f8878h.add(oVar);
    }

    private Fragment f() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f8881k;
    }

    private void i(androidx.fragment.app.c cVar) {
        m();
        o j2 = com.bumptech.glide.c.c(cVar).k().j(cVar);
        this.f8879i = j2;
        if (equals(j2)) {
            return;
        }
        this.f8879i.d(this);
    }

    private void j(o oVar) {
        this.f8878h.remove(oVar);
    }

    private void m() {
        o oVar = this.f8879i;
        if (oVar != null) {
            oVar.j(this);
            this.f8879i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.bumptech.glide.m.a e() {
        return this.f8876f;
    }

    public com.bumptech.glide.i g() {
        return this.f8880j;
    }

    public m h() {
        return this.f8877g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(Fragment fragment) {
        this.f8881k = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        i(fragment.getActivity());
    }

    public void l(com.bumptech.glide.i iVar) {
        this.f8880j = iVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            i(getActivity());
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f8876f.c();
        m();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f8881k = null;
        m();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f8876f.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f8876f.e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + f() + "}";
    }

    @SuppressLint({"ValidFragment"})
    public o(com.bumptech.glide.m.a aVar) {
        this.f8877g = new a();
        this.f8878h = new HashSet();
        this.f8876f = aVar;
    }
}
