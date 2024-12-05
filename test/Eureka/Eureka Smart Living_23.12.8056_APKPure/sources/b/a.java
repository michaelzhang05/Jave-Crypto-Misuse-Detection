package b;

import android.content.Context;
import f5.h;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f3794a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    private volatile Context f3795b;

    public final void a(b bVar) {
        h.e(bVar, "listener");
        Context context = this.f3795b;
        if (context != null) {
            bVar.a(context);
        }
        this.f3794a.add(bVar);
    }

    public final void b() {
        this.f3795b = null;
    }

    public final void c(Context context) {
        h.e(context, "context");
        this.f3795b = context;
        Iterator it = this.f3794a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(context);
        }
    }
}
