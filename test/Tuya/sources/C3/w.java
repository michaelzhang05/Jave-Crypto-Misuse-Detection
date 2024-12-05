package c3;

import L5.s;
import M5.AbstractC1246t;
import M5.N;
import b3.C1857B;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* loaded from: classes4.dex */
public final class w implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f14974b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final v f14975c = new v();

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1857B a(JSONObject json) {
        Object b8;
        AbstractC3159y.i(json, "json");
        try {
            s.a aVar = L5.s.f6511b;
            JSONArray optJSONArray = json.optJSONArray(DataSchemeDataSource.SCHEME_DATA);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            } else {
                AbstractC3159y.f(optJSONArray);
            }
            d6.i s8 = d6.m.s(0, optJSONArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                int nextInt = ((N) it).nextInt();
                v vVar = f14975c;
                JSONObject optJSONObject = optJSONArray.optJSONObject(nextInt);
                AbstractC3159y.h(optJSONObject, "optJSONObject(...)");
                com.stripe.android.model.o a8 = vVar.a(optJSONObject);
                if (a8 != null) {
                    arrayList.add(a8);
                }
            }
            b8 = L5.s.b(arrayList);
        } catch (Throwable th) {
            s.a aVar2 = L5.s.f6511b;
            b8 = L5.s.b(L5.t.a(th));
        }
        List m8 = AbstractC1246t.m();
        if (L5.s.g(b8)) {
            b8 = m8;
        }
        return new C1857B((List) b8);
    }
}
