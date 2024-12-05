package v1;

import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    private Object f9642a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9643b = false;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f9644c;

    public r0(c cVar, Object obj) {
        this.f9644c = cVar;
        this.f9642a = obj;
    }

    protected abstract void a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            obj = this.f9642a;
            if (this.f9643b) {
                Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f9643b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f9642a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.f9644c.f9524r;
        synchronized (arrayList) {
            arrayList2 = this.f9644c.f9524r;
            arrayList2.remove(this);
        }
    }
}
