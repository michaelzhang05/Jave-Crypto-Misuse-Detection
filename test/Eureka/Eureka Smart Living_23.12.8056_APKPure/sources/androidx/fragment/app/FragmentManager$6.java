package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.h;
import java.util.Map;

/* loaded from: classes.dex */
class FragmentManager$6 implements androidx.lifecycle.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2720a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.h f2721b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f2722c;

    @Override // androidx.lifecycle.k
    public void d(androidx.lifecycle.m mVar, h.a aVar) {
        Map map;
        Map map2;
        if (aVar == h.a.ON_START) {
            map2 = this.f2722c.f2968k;
            if (((Bundle) map2.get(this.f2720a)) != null) {
                throw null;
            }
        }
        if (aVar == h.a.ON_DESTROY) {
            this.f2721b.c(this);
            map = this.f2722c.f2969l;
            map.remove(this.f2720a);
        }
    }
}
