package com.mbridge.msdk.newreward.function.d.b;

import com.mbridge.msdk.e.a.m;
import com.mbridge.msdk.e.a.p;
import com.mbridge.msdk.e.a.r;
import com.mbridge.msdk.e.a.u;
import com.mbridge.msdk.e.a.y;
import com.mbridge.msdk.e.a.z;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class g extends p<JSONObject> implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public static int f22153a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f22154b = 1;

    /* renamed from: c, reason: collision with root package name */
    private e f22155c;

    /* renamed from: d, reason: collision with root package name */
    private HashMap<String, String> f22156d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, String> f22157e;

    public g(String str) {
        super(0, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.e.a.p
    public final /* synthetic */ void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        e eVar = this.f22155c;
        if (eVar == null) {
            return;
        }
        try {
            if (jSONObject2 == null) {
                eVar.a(this, new d(-1));
            } else {
                eVar.a(jSONObject2, this);
            }
        } catch (Exception e8) {
            ad.a("RewardSettingRequest", "onError Exception: ", e8);
        }
    }

    @Override // com.mbridge.msdk.e.a.p
    public final Map<String, String> d() {
        Map<String, String> map = this.f22157e;
        if (map == null) {
            HashMap hashMap = new HashMap();
            this.f22157e = hashMap;
            return hashMap;
        }
        return map;
    }

    public final void a(e eVar) {
        this.f22155c = eVar;
    }

    public final void a(Map<String, String> map) {
        if (this.f22156d == null) {
            this.f22156d = new HashMap<>();
        }
        if (map == null || map.isEmpty()) {
            return;
        }
        this.f22156d.putAll(map);
    }

    @Override // com.mbridge.msdk.e.a.p
    protected final Map<String, String> a() {
        if (this.f22156d == null) {
            this.f22156d = new HashMap<>();
        }
        return this.f22156d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.e.a.p
    public final r<JSONObject> a(m mVar) {
        if (mVar != null) {
            try {
                byte[] bArr = mVar.f19869b;
                if (bArr != null && bArr.length != 0) {
                    return r.a(new JSONObject(new String(bArr, com.mbridge.msdk.e.a.a.e.a(mVar.f19870c))), com.mbridge.msdk.e.a.a.e.a(mVar));
                }
            } catch (UnsupportedEncodingException e8) {
                ad.a("RewardSettingRequest", "parseNetworkResponse UnsupportedEncodingException: ", e8);
                return r.a(new com.mbridge.msdk.e.a.g(e8));
            } catch (Exception e9) {
                ad.a("RewardSettingRequest", "parseNetworkResponse Exception: ", e9);
                return r.a(new y(e9));
            }
        }
        return r.a(new u());
    }

    public final void a(String str, String str2) {
        if (this.f22157e == null) {
            this.f22157e = new HashMap();
        }
        this.f22157e.put(str, str2);
    }

    @Override // com.mbridge.msdk.e.a.r.a
    public final void a(z zVar) {
        this.f22155c.a(this, new d(-1, zVar.getMessage()));
    }
}
