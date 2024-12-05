package Q;

import N.C1337h;
import O.a;
import android.content.Context;
import android.util.SparseIntArray;

/* loaded from: classes3.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final SparseIntArray f8920a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private C1337h f8921b;

    public G(C1337h c1337h) {
        AbstractC1400p.l(c1337h);
        this.f8921b = c1337h;
    }

    public final int a(Context context, int i8) {
        return this.f8920a.get(i8, -1);
    }

    public final int b(Context context, a.f fVar) {
        AbstractC1400p.l(context);
        AbstractC1400p.l(fVar);
        int i8 = 0;
        if (!fVar.i()) {
            return 0;
        }
        int k8 = fVar.k();
        int a8 = a(context, k8);
        if (a8 == -1) {
            int i9 = 0;
            while (true) {
                if (i9 < this.f8920a.size()) {
                    int keyAt = this.f8920a.keyAt(i9);
                    if (keyAt > k8 && this.f8920a.get(keyAt) == 0) {
                        break;
                    }
                    i9++;
                } else {
                    i8 = -1;
                    break;
                }
            }
            if (i8 == -1) {
                a8 = this.f8921b.h(context, k8);
            } else {
                a8 = i8;
            }
            this.f8920a.put(k8, a8);
        }
        return a8;
    }

    public final void c() {
        this.f8920a.clear();
    }
}
