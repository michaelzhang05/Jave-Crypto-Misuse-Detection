package C1;

import C1.a;
import E1.e;
import E1.h;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;
import y1.C3981n;

/* loaded from: classes3.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final a f1176a;

    public c(a aVar) {
        this.f1176a = aVar;
    }

    @Override // C1.a
    public JSONObject a(View view) {
        JSONObject c8 = E1.c.c(0, 0, 0, 0);
        E1.c.j(c8, e.a());
        return c8;
    }

    ArrayList b() {
        View rootView;
        ArrayList arrayList = new ArrayList();
        B1.c e8 = B1.c.e();
        if (e8 != null) {
            Collection a8 = e8.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a8.size() * 2) + 3);
            Iterator it = a8.iterator();
            while (it.hasNext()) {
                View o8 = ((C3981n) it.next()).o();
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

    @Override // C1.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0017a interfaceC0017a, boolean z8, boolean z9) {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            interfaceC0017a.a((View) it.next(), this.f1176a, jSONObject, z9);
        }
    }
}
