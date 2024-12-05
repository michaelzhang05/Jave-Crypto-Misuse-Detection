package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.j;

/* loaded from: classes.dex */
class FragmentStateAdapter$5 implements h {
    final /* synthetic */ Handler a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f1756b;

    @Override // androidx.lifecycle.h
    public void a(j jVar, f.a aVar) {
        if (aVar == f.a.ON_DESTROY) {
            this.a.removeCallbacks(this.f1756b);
            jVar.getLifecycle().c(this);
        }
    }
}
