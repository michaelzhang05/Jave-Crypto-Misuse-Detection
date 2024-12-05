package Q;

import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    private Object f8976a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8977b = false;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC1387c f8978c;

    public c0(AbstractC1387c abstractC1387c, Object obj) {
        this.f8978c = abstractC1387c;
        this.f8976a = obj;
    }

    protected abstract void a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f8976a;
                if (this.f8977b) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f8977b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f8976a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.f8978c.f8966r;
        synchronized (arrayList) {
            arrayList2 = this.f8978c.f8966r;
            arrayList2.remove(this);
        }
    }
}
