package F1;

import B1.n;
import F1.a;
import H1.e;
import H1.h;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final a f2686a;

    public c(a aVar) {
        this.f2686a = aVar;
    }

    @Override // F1.a
    public JSONObject a(View view) {
        JSONObject c8 = H1.c.c(0, 0, 0, 0);
        H1.c.e(c8, e.a());
        return c8;
    }

    ArrayList b() {
        View rootView;
        ArrayList arrayList = new ArrayList();
        E1.c e8 = E1.c.e();
        if (e8 != null) {
            Collection a8 = e8.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a8.size() * 2) + 3);
            Iterator it = a8.iterator();
            while (it.hasNext()) {
                View o8 = ((n) it.next()).o();
                if (o8 != null && h.e(o8) && (rootView = o8.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float c8 = h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.c((View) arrayList.get(size - 1)) > c8) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // F1.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0041a interfaceC0041a, boolean z8, boolean z9) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            interfaceC0041a.a((View) it.next(), this.f2686a, jSONObject, z9);
        }
    }
}
