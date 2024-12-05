package R;

import O.C1264h;
import P.a;
import android.content.Context;
import android.util.SparseIntArray;

/* loaded from: classes3.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final SparseIntArray f8458a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private C1264h f8459b;

    public G(C1264h c1264h) {
        AbstractC1319p.l(c1264h);
        this.f8459b = c1264h;
    }

    public final int a(Context context, int i8) {
        return this.f8458a.get(i8, -1);
    }

    public final int b(Context context, a.f fVar) {
        AbstractC1319p.l(context);
        AbstractC1319p.l(fVar);
        int i8 = 0;
        if (!fVar.i()) {
            return 0;
        }
        int k8 = fVar.k();
        int a8 = a(context, k8);
        if (a8 == -1) {
            int i9 = 0;
            while (true) {
                if (i9 < this.f8458a.size()) {
                    int keyAt = this.f8458a.keyAt(i9);
                    if (keyAt > k8 && this.f8458a.get(keyAt) == 0) {
                        break;
                    }
                    i9++;
                } else {
                    i8 = -1;
                    break;
                }
            }
            if (i8 == -1) {
                a8 = this.f8459b.h(context, k8);
            } else {
                a8 = i8;
            }
            this.f8458a.put(k8, a8);
        }
        return a8;
    }

    public final void c() {
        this.f8458a.clear();
    }
}
