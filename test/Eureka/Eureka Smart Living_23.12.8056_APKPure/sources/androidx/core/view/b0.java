package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f2313a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f2314b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Map f2315c = new HashMap();

    public b0(Runnable runnable) {
        this.f2313a = runnable;
    }

    public void a(q0 q0Var) {
        this.f2314b.add(q0Var);
        this.f2313a.run();
    }

    public void b(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f2314b.iterator();
        while (it.hasNext()) {
            ((q0) it.next()).a(menu, menuInflater);
        }
    }

    public void c(Menu menu) {
        Iterator it = this.f2314b.iterator();
        while (it.hasNext()) {
            ((q0) it.next()).d(menu);
        }
    }

    public boolean d(MenuItem menuItem) {
        Iterator it = this.f2314b.iterator();
        while (it.hasNext()) {
            if (((q0) it.next()).c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e(Menu menu) {
        Iterator it = this.f2314b.iterator();
        while (it.hasNext()) {
            ((q0) it.next()).b(menu);
        }
    }

    public void f(q0 q0Var) {
        this.f2314b.remove(q0Var);
        androidx.appcompat.app.f0.a(this.f2315c.remove(q0Var));
        this.f2313a.run();
    }
}
