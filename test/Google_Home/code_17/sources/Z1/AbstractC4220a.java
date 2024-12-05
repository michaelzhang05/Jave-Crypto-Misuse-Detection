package z1;

import java.util.Map;
import v1.AbstractC4086a;
import x1.C4185a;

/* renamed from: z1.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4220a implements InterfaceC4222c {

    /* renamed from: a, reason: collision with root package name */
    protected Map f41067a;

    /* renamed from: b, reason: collision with root package name */
    protected String[] f41068b;

    @Override // z1.InterfaceC4222c
    public void a(String str, Object obj) {
        if (this.f41067a.containsKey(str)) {
            ((AbstractC4086a) this.f41067a.get(str)).d(obj);
            return;
        }
        throw new x1.c(str + " not found");
    }

    @Override // z1.InterfaceC4222c
    public Object c(String str) {
        if (this.f41067a.containsKey(str)) {
            return ((AbstractC4086a) this.f41067a.get(str)).c();
        }
        return null;
    }

    public void d(String str) {
        int i8 = 0;
        int i9 = 0;
        while (true) {
            String[] strArr = this.f41068b;
            if (i8 < strArr.length) {
                String str2 = strArr[i8];
                if (this.f41067a.containsKey(str2)) {
                    AbstractC4086a abstractC4086a = (AbstractC4086a) this.f41067a.get(str2);
                    String e8 = abstractC4086a.e(str, i9);
                    abstractC4086a.a(e8);
                    i9 += e8.length();
                    i8++;
                } else {
                    throw new C4185a("Field not found: '" + str2 + "'");
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
            String[] strArr = this.f41068b;
            if (i8 < strArr.length) {
                String str2 = strArr[i8];
                if (this.f41067a.containsKey(str2)) {
                    str = str + ((AbstractC4086a) this.f41067a.get(str2)).b();
                    i8++;
                } else {
                    throw new x1.b("Field not found: '" + str2 + "'");
                }
            } else {
                return str;
            }
        }
    }
}
