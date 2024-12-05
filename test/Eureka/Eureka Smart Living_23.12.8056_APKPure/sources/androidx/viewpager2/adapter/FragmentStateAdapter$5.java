package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.h;
import androidx.lifecycle.k;
import androidx.lifecycle.m;

/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Handler f3792a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f3793b;

    @Override // androidx.lifecycle.k
    public void d(m mVar, h.a aVar) {
        if (aVar == h.a.ON_DESTROY) {
            this.f3792a.removeCallbacks(this.f3793b);
            mVar.r().c(this);
        }
    }
}
