package B1;

import android.view.View;
import java.util.Iterator;
import y1.C3981n;

/* loaded from: classes3.dex */
public class b extends d {

    /* renamed from: d, reason: collision with root package name */
    private static b f671d = new b();

    private b() {
    }

    public static b k() {
        return f671d;
    }

    @Override // B1.d
    public void f(boolean z8) {
        Iterator it = c.e().c().iterator();
        while (it.hasNext()) {
            ((C3981n) it.next()).w().n(z8);
        }
    }

    @Override // B1.d
    public boolean h() {
        Iterator it = c.e().a().iterator();
        while (it.hasNext()) {
            View o8 = ((C3981n) it.next()).o();
            if (o8 != null && o8.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
