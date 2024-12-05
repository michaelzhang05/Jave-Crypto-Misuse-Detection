package f3;

import O5.s;
import P5.AbstractC1378t;
import P5.N;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import e3.C2778B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* loaded from: classes4.dex */
public final class w implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f31949b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final v f31950c = new v();

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2778B a(JSONObject json) {
        Object b8;
        AbstractC3255y.i(json, "json");
        try {
            s.a aVar = O5.s.f8302b;
            JSONArray optJSONArray = json.optJSONArray(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            } else {
                AbstractC3255y.f(optJSONArray);
            }
            g6.i s8 = g6.m.s(0, optJSONArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                int nextInt = ((N) it).nextInt();
                v vVar = f31950c;
                JSONObject optJSONObject = optJSONArray.optJSONObject(nextInt);
                AbstractC3255y.h(optJSONObject, "optJSONObject(...)");
                com.stripe.android.model.o a8 = vVar.a(optJSONObject);
                if (a8 != null) {
                    arrayList.add(a8);
                }
            }
            b8 = O5.s.b(arrayList);
        } catch (Throwable th) {
            s.a aVar2 = O5.s.f8302b;
            b8 = O5.s.b(O5.t.a(th));
        }
        List m8 = AbstractC1378t.m();
        if (O5.s.g(b8)) {
            b8 = m8;
        }
        return new C2778B((List) b8);
    }
}
