package z2;

import P5.AbstractC1378t;
import P5.N;
import g6.i;
import g6.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import y2.f;

/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4225a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0936a f41117a = C0936a.f41118a;

    /* renamed from: z2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0936a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0936a f41118a = new C0936a();

        private C0936a() {
        }

        public final List a(JSONArray jSONArray) {
            if (jSONArray != null) {
                i s8 = m.s(0, jSONArray.length());
                ArrayList arrayList = new ArrayList(AbstractC1378t.x(s8, 10));
                Iterator it = s8.iterator();
                while (it.hasNext()) {
                    arrayList.add(jSONArray.getString(((N) it).nextInt()));
                }
                return arrayList;
            }
            return AbstractC1378t.m();
        }
    }

    f a(JSONObject jSONObject);
}
