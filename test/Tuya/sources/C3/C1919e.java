package c3;

import M5.N;
import b3.C1866a;
import b3.C1872g;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;
import l2.C3166a;
import org.json.JSONArray;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* renamed from: c3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1919e implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private final C3166a f14912b;

    /* renamed from: c, reason: collision with root package name */
    private final C1915a f14913c;

    public C1919e(C3166a bin) {
        AbstractC3159y.i(bin, "bin");
        this.f14912b = bin;
        this.f14913c = new C1915a();
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1872g a(JSONObject json) {
        AbstractC3159y.i(json, "json");
        JSONArray optJSONArray = json.optJSONArray(DataSchemeDataSource.SCHEME_DATA);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        d6.i s8 = d6.m.s(0, optJSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = s8.iterator();
        while (it.hasNext()) {
            int nextInt = ((N) it).nextInt();
            C1915a c1915a = this.f14913c;
            JSONObject jSONObject = optJSONArray.getJSONObject(nextInt);
            AbstractC3159y.h(jSONObject, "getJSONObject(...)");
            C1866a a8 = c1915a.a(jSONObject);
            if (a8 != null) {
                arrayList.add(a8);
            }
        }
        return new C1872g(this.f14912b, arrayList);
    }
}
