package f3;

import P5.N;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import e3.C2787a;
import e3.C2793g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;
import o2.C3514a;
import org.json.JSONArray;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* renamed from: f3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2829e implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    private final C3514a f31887b;

    /* renamed from: c, reason: collision with root package name */
    private final C2825a f31888c;

    public C2829e(C3514a bin) {
        AbstractC3255y.i(bin, "bin");
        this.f31887b = bin;
        this.f31888c = new C2825a();
    }

    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2793g a(JSONObject json) {
        AbstractC3255y.i(json, "json");
        JSONArray optJSONArray = json.optJSONArray(DataSchemeDataSource.SCHEME_DATA);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        g6.i s8 = g6.m.s(0, optJSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            int nextInt = ((N) it).nextInt();
            C2825a c2825a = this.f31888c;
            JSONObject jSONObject = optJSONArray.getJSONObject(nextInt);
            AbstractC3255y.h(jSONObject, "getJSONObject(...)");
            C2787a a8 = c2825a.a(jSONObject);
            if (a8 != null) {
                arrayList.add(a8);
            }
        }
        return new C2793g(this.f31887b, arrayList);
    }
}
