package v1;

import android.content.Context;
import android.util.SparseIntArray;
import t1.a;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseIntArray f9564a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private s1.g f9565b;

    public e0(s1.g gVar) {
        n.h(gVar);
        this.f9565b = gVar;
    }

    public final int a(Context context, int i6) {
        return this.f9564a.get(i6, -1);
    }

    public final int b(Context context, a.f fVar) {
        n.h(context);
        n.h(fVar);
        int i6 = 0;
        if (!fVar.m()) {
            return 0;
        }
        int p6 = fVar.p();
        int a6 = a(context, p6);
        if (a6 == -1) {
            int i7 = 0;
            while (true) {
                if (i7 >= this.f9564a.size()) {
                    i6 = -1;
                    break;
                }
                int keyAt = this.f9564a.keyAt(i7);
                if (keyAt > p6 && this.f9564a.get(keyAt) == 0) {
                    break;
                }
                i7++;
            }
            a6 = i6 == -1 ? this.f9565b.f(context, p6) : i6;
            this.f9564a.put(p6, a6);
        }
        return a6;
    }

    public final void c() {
        this.f9564a.clear();
    }
}
