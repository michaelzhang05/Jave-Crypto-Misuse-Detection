package z1;

import java.util.HashMap;
import java.util.Map;
import x1.C4185a;

/* loaded from: classes4.dex */
public class o implements InterfaceC4222c {

    /* renamed from: b, reason: collision with root package name */
    public static int f41113b = 6;

    /* renamed from: c, reason: collision with root package name */
    public static int f41114c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static String f41115d = "uspv1";

    /* renamed from: a, reason: collision with root package name */
    protected Map f41116a;

    public o() {
        e();
    }

    private void e() {
        HashMap hashMap = new HashMap();
        this.f41116a = hashMap;
        hashMap.put(y1.j.f40901a, Integer.valueOf(f41114c));
        this.f41116a.put(y1.j.f40902b, "-");
        this.f41116a.put(y1.j.f40903c, "-");
        this.f41116a.put(y1.j.f40904d, "-");
    }

    @Override // z1.InterfaceC4222c
    public void a(String str, Object obj) {
        if (this.f41116a.containsKey(str)) {
            this.f41116a.put(str, obj);
            return;
        }
        throw new x1.c(str + " not found");
    }

    @Override // z1.InterfaceC4222c
    public String b() {
        return ((("" + c(y1.j.f40901a)) + c(y1.j.f40902b)) + c(y1.j.f40903c)) + c(y1.j.f40904d);
    }

    @Override // z1.InterfaceC4222c
    public Object c(String str) {
        if (this.f41116a.containsKey(str)) {
            return this.f41116a.get(str);
        }
        return null;
    }

    public void d(String str) {
        try {
            a(y1.j.f40901a, Integer.valueOf(Integer.parseInt(String.valueOf(str.charAt(0)))));
            a(y1.j.f40902b, String.valueOf(str.charAt(1)));
            a(y1.j.f40903c, String.valueOf(str.charAt(2)));
            a(y1.j.f40904d, String.valueOf(str.charAt(3)));
        } catch (x1.c e8) {
            throw new C4185a(e8);
        }
    }

    @Override // z1.InterfaceC4222c
    public int getId() {
        return f41113b;
    }

    public o(String str) {
        e();
        if (str == null || str.length() <= 0) {
            return;
        }
        d(str);
    }
}
