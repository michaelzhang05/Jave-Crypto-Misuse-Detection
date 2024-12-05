package E1;

import B1.n;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class b extends d {

    /* renamed from: d, reason: collision with root package name */
    private static b f2266d = new b();

    private b() {
    }

    public static b k() {
        return f2266d;
    }

    @Override // E1.d
    public void f(boolean z8) {
        Iterator it = c.e().c().iterator();
        while (it.hasNext()) {
            ((n) it.next()).w().n(z8);
        }
    }

    @Override // E1.d
    public boolean h() {
        Iterator it = c.e().a().iterator();
        while (it.hasNext()) {
            View o8 = ((n) it.next()).o();
            if (o8 != null && o8.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
