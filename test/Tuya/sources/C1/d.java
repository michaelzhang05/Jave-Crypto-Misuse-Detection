package C1;

import C1.a;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f1177a = new int[2];

    private void b(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0017a interfaceC0017a, boolean z8) {
        for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
            interfaceC0017a.a(viewGroup.getChildAt(i8), this, jSONObject, z8);
        }
    }

    private void c(ViewGroup viewGroup, JSONObject jSONObject, a.InterfaceC0017a interfaceC0017a, boolean z8) {
        HashMap hashMap = new HashMap();
        for (int i8 = 0; i8 < viewGroup.getChildCount(); i8++) {
            View childAt = viewGroup.getChildAt(i8);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                interfaceC0017a.a((View) it2.next(), this, jSONObject, z8);
            }
        }
    }

    @Override // C1.a
    public JSONObject a(View view) {
        if (view == null) {
            return E1.c.c(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f1177a);
        int[] iArr = this.f1177a;
        return E1.c.c(iArr[0], iArr[1], width, height);
    }

    @Override // C1.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0017a interfaceC0017a, boolean z8, boolean z9) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z8) {
                c(viewGroup, jSONObject, interfaceC0017a, z9);
            } else {
                b(viewGroup, jSONObject, interfaceC0017a, z9);
            }
        }
    }
}
