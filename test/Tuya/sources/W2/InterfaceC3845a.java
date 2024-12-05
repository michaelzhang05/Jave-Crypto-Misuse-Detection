package w2;

import M5.AbstractC1246t;
import M5.N;
import d6.i;
import d6.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import v2.f;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3845a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0900a f38994a = C0900a.f38995a;

    /* renamed from: w2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0900a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0900a f38995a = new C0900a();

        private C0900a() {
        }

        public final List a(JSONArray jSONArray) {
            if (jSONArray != null) {
                i s8 = m.s(0, jSONArray.length());
                ArrayList arrayList = new ArrayList(AbstractC1246t.x(s8, 10));
                Iterator it = s8.iterator();
                while (it.hasNext()) {
                    arrayList.add(jSONArray.getString(((N) it).nextInt()));
                }
                return arrayList;
            }
            return AbstractC1246t.m();
        }
    }

    f a(JSONObject jSONObject);
}
