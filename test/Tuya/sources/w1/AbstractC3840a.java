package w1;

import java.util.Map;
import s1.AbstractC3733a;
import u1.C3800a;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3840a implements InterfaceC3842c {

    /* renamed from: a, reason: collision with root package name */
    protected Map f38944a;

    /* renamed from: b, reason: collision with root package name */
    protected String[] f38945b;

    @Override // w1.InterfaceC3842c
    public void a(String str, Object obj) {
        if (this.f38944a.containsKey(str)) {
            ((AbstractC3733a) this.f38944a.get(str)).d(obj);
            return;
        }
        throw new u1.c(str + " not found");
    }

    @Override // w1.InterfaceC3842c
    public Object c(String str) {
        if (this.f38944a.containsKey(str)) {
            return ((AbstractC3733a) this.f38944a.get(str)).c();
        }
        return null;
    }

    public void d(String str) {
        int i8 = 0;
        int i9 = 0;
        while (true) {
            String[] strArr = this.f38945b;
            if (i8 < strArr.length) {
                String str2 = strArr[i8];
                if (this.f38944a.containsKey(str2)) {
                    AbstractC3733a abstractC3733a = (AbstractC3733a) this.f38944a.get(str2);
                    String e8 = abstractC3733a.e(str, i9);
                    abstractC3733a.a(e8);
                    i9 += e8.length();
                    i8++;
                } else {
                    throw new C3800a("Field not found: '" + str2 + "'");
                }
            } else {
                return;
            }
        }
    }

    public String e() {
        String str = "";
        int i8 = 0;
        while (true) {
            String[] strArr = this.f38945b;
            if (i8 < strArr.length) {
                String str2 = strArr[i8];
                if (this.f38944a.containsKey(str2)) {
                    str = str + ((AbstractC3733a) this.f38944a.get(str2)).b();
                    i8++;
                } else {
                    throw new u1.b("Field not found: '" + str2 + "'");
                }
            } else {
                return str;
            }
        }
    }
}
