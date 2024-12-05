package K0;

import J0.AbstractC1275j;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final Map f4994a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final int f4995b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4996c;

    public d(int i8, int i9) {
        this.f4995b = i8;
        this.f4996c = i9;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f4996c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i8) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > i8) {
                return trim.substring(0, i8);
            }
            return trim;
        }
        return str;
    }

    public synchronized Map a() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.f4994a));
    }

    public synchronized boolean d(String str, String str2) {
        String b8 = b(str);
        if (this.f4994a.size() >= this.f4995b && !this.f4994a.containsKey(b8)) {
            G0.h.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f4995b);
            return false;
        }
        String c8 = c(str2, this.f4996c);
        if (AbstractC1275j.y((String) this.f4994a.get(b8), c8)) {
            return false;
        }
        Map map = this.f4994a;
        if (str2 == null) {
            c8 = "";
        }
        map.put(b8, c8);
        return true;
    }

    public synchronized void e(Map map) {
        String c8;
        try {
            int i8 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String b8 = b((String) entry.getKey());
                if (this.f4994a.size() >= this.f4995b && !this.f4994a.containsKey(b8)) {
                    i8++;
                }
                String str = (String) entry.getValue();
                Map map2 = this.f4994a;
                if (str == null) {
                    c8 = "";
                } else {
                    c8 = c(str, this.f4996c);
                }
                map2.put(b8, c8);
            }
            if (i8 > 0) {
                G0.h.f().k("Ignored " + i8 + " entries when adding custom keys. Maximum allowable: " + this.f4995b);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
