package com.mbridge.msdk.foundation.same.report.d;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f19873a = new HashMap();

    public final void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            if (obj instanceof String) {
                if (!TextUtils.isEmpty((String) obj)) {
                    this.f19873a.put(str, (String) obj);
                }
            } else {
                this.f19873a.put(str, obj + "");
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                e8.printStackTrace();
            }
        }
    }

    public final Object b(String str) {
        return this.f19873a.get(str);
    }

    public final void c(String str) {
        if (this.f19873a != null && !TextUtils.isEmpty(str)) {
            this.f19873a.remove(str);
        }
    }

    public final boolean a(String str) {
        return this.f19873a.containsKey(str);
    }

    public final Map<String, String> a() {
        return this.f19873a;
    }

    public final void a(d dVar) {
        Map<String, String> map;
        Map<String, String> map2;
        if (dVar == null || (map = dVar.f19873a) == null || (map2 = this.f19873a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public final void a(Map map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        this.f19873a.putAll(map);
    }
}
