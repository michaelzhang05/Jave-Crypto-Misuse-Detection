package R;

import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    private Object f8514a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8515b = false;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC1306c f8516c;

    public c0(AbstractC1306c abstractC1306c, Object obj) {
        this.f8516c = abstractC1306c;
        this.f8514a = obj;
    }

    protected abstract void a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f8514a;
                if (this.f8515b) {
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
            this.f8515b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f8514a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.f8516c.f8504r;
        synchronized (arrayList) {
            arrayList2 = this.f8516c.f8504r;
            arrayList2.remove(this);
        }
    }
}
