package m0;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f34880c = new p(null, null, 100);

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f34881a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34882b;

    public p(Boolean bool, Boolean bool2, int i8) {
        EnumMap enumMap = new EnumMap(o.class);
        this.f34881a = enumMap;
        enumMap.put((EnumMap) o.AD_STORAGE, (o) bool);
        enumMap.put((EnumMap) o.ANALYTICS_STORAGE, (o) bool2);
        this.f34882b = i8;
    }

    public static p b(Bundle bundle, int i8) {
        if (bundle == null) {
            return new p(null, null, i8);
        }
        EnumMap enumMap = new EnumMap(o.class);
        for (o oVar : o.values()) {
            enumMap.put((EnumMap) oVar, (o) p(bundle.getString(oVar.f34879a)));
        }
        return new p(enumMap, i8);
    }

    public static p c(String str, int i8) {
        EnumMap enumMap = new EnumMap(o.class);
        if (str != null) {
            int i9 = 0;
            while (true) {
                o[] oVarArr = o.f34877d;
                int length = oVarArr.length;
                if (i9 >= 2) {
                    break;
                }
                o oVar = oVarArr[i9];
                int i10 = i9 + 2;
                if (i10 < str.length()) {
                    char charAt = str.charAt(i10);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt != '0') {
                            if (charAt == '1') {
                                bool = Boolean.TRUE;
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                    }
                    enumMap.put((EnumMap) oVar, (o) bool);
                }
                i9++;
            }
        }
        return new p(enumMap, i8);
    }

    public static String h(Bundle bundle) {
        String string;
        for (o oVar : o.values()) {
            if (bundle.containsKey(oVar.f34879a) && (string = bundle.getString(oVar.f34879a)) != null && p(string) == null) {
                return string;
            }
        }
        return null;
    }

    public static boolean k(int i8, int i9) {
        if (i8 <= i9) {
            return true;
        }
        return false;
    }

    static final int o(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        if (bool.booleanValue()) {
            return 1;
        }
        return 2;
    }

    private static Boolean p(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (!str.equals("denied")) {
            return null;
        }
        return Boolean.FALSE;
    }

    public final int a() {
        return this.f34882b;
    }

    public final p d(p pVar) {
        boolean z8;
        EnumMap enumMap = new EnumMap(o.class);
        for (o oVar : o.values()) {
            Boolean bool = (Boolean) this.f34881a.get(oVar);
            Boolean bool2 = (Boolean) pVar.f34881a.get(oVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                if (bool.booleanValue() && bool2.booleanValue()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                bool = Boolean.valueOf(z8);
            }
            enumMap.put((EnumMap) oVar, (o) bool);
        }
        return new p(enumMap, 100);
    }

    public final p e(p pVar) {
        EnumMap enumMap = new EnumMap(o.class);
        for (o oVar : o.values()) {
            Boolean bool = (Boolean) this.f34881a.get(oVar);
            if (bool == null) {
                bool = (Boolean) pVar.f34881a.get(oVar);
            }
            enumMap.put((EnumMap) oVar, (o) bool);
        }
        return new p(enumMap, this.f34882b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        for (o oVar : o.values()) {
            if (o((Boolean) this.f34881a.get(oVar)) != o((Boolean) pVar.f34881a.get(oVar))) {
                return false;
            }
        }
        if (this.f34882b != pVar.f34882b) {
            return false;
        }
        return true;
    }

    public final Boolean f() {
        return (Boolean) this.f34881a.get(o.AD_STORAGE);
    }

    public final Boolean g() {
        return (Boolean) this.f34881a.get(o.ANALYTICS_STORAGE);
    }

    public final int hashCode() {
        int i8 = this.f34882b * 17;
        Iterator it = this.f34881a.values().iterator();
        while (it.hasNext()) {
            i8 = (i8 * 31) + o((Boolean) it.next());
        }
        return i8;
    }

    public final String i() {
        char c8;
        StringBuilder sb = new StringBuilder("G1");
        o[] oVarArr = o.f34877d;
        int length = oVarArr.length;
        for (int i8 = 0; i8 < 2; i8++) {
            Boolean bool = (Boolean) this.f34881a.get(oVarArr[i8]);
            if (bool == null) {
                c8 = '-';
            } else if (bool.booleanValue()) {
                c8 = '1';
            } else {
                c8 = '0';
            }
            sb.append(c8);
        }
        return sb.toString();
    }

    public final boolean j(o oVar) {
        Boolean bool = (Boolean) this.f34881a.get(oVar);
        if (bool != null && !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean l() {
        Iterator it = this.f34881a.values().iterator();
        while (it.hasNext()) {
            if (((Boolean) it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean m(p pVar) {
        return n(pVar, (o[]) this.f34881a.keySet().toArray(new o[0]));
    }

    public final boolean n(p pVar, o... oVarArr) {
        for (o oVar : oVarArr) {
            Boolean bool = (Boolean) this.f34881a.get(oVar);
            Boolean bool2 = (Boolean) pVar.f34881a.get(oVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("settings: source=");
        sb.append(this.f34882b);
        for (o oVar : o.values()) {
            sb.append(", ");
            sb.append(oVar.name());
            sb.append("=");
            Boolean bool = (Boolean) this.f34881a.get(oVar);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                if (true != bool.booleanValue()) {
                    str = "denied";
                } else {
                    str = "granted";
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public p(EnumMap enumMap, int i8) {
        EnumMap enumMap2 = new EnumMap(o.class);
        this.f34881a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f34882b = i8;
    }
}
