package w1;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import s1.AbstractC3733a;
import s1.C3734b;
import s1.C3738f;
import s1.C3739g;
import t1.AbstractC3772c;
import t1.C3774e;
import u1.C3800a;
import v1.AbstractC3823d;
import v1.AbstractC3824e;

/* loaded from: classes3.dex */
public class j extends AbstractC3841b {

    /* renamed from: d, reason: collision with root package name */
    public static int f38970d = 10;

    /* renamed from: e, reason: collision with root package name */
    public static int f38971e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f38972f = "uscov1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC3772c f38973c = new C3774e();

    public j() {
        g();
    }

    private void g() {
        HashMap hashMap = new HashMap();
        this.f38946a = hashMap;
        hashMap.put(AbstractC3824e.f38700a, new C3738f(6, Integer.valueOf(f38971e)));
        this.f38946a.put(AbstractC3824e.f38701b, new C3738f(2, 0));
        this.f38946a.put(AbstractC3824e.f38702c, new C3738f(2, 0));
        this.f38946a.put(AbstractC3824e.f38703d, new C3738f(2, 0));
        this.f38946a.put(AbstractC3824e.f38704e, new C3738f(2, 0));
        this.f38946a.put(AbstractC3824e.f38705f, new C3738f(2, 0));
        this.f38946a.put(AbstractC3824e.f38706g, new C3739g(2, Arrays.asList(0, 0, 0, 0, 0, 0, 0)));
        this.f38946a.put(AbstractC3824e.f38707h, new C3738f(2, 0));
        this.f38946a.put(AbstractC3824e.f38708i, new C3738f(2, 0));
        this.f38946a.put(AbstractC3824e.f38709j, new C3738f(2, 0));
        this.f38946a.put(AbstractC3824e.f38710k, new C3738f(2, 0));
        this.f38946a.put(AbstractC3824e.f38711l, new C3738f(2, 1));
        this.f38946a.put(AbstractC3824e.f38712m, new C3734b(Boolean.TRUE));
        this.f38946a.put(AbstractC3824e.f38713n, new C3734b(Boolean.FALSE));
        this.f38947b = new String[][]{new String[]{AbstractC3824e.f38700a, AbstractC3824e.f38701b, AbstractC3824e.f38702c, AbstractC3824e.f38703d, AbstractC3824e.f38704e, AbstractC3824e.f38705f, AbstractC3824e.f38706g, AbstractC3824e.f38707h, AbstractC3824e.f38708i, AbstractC3824e.f38709j, AbstractC3824e.f38710k}, new String[]{AbstractC3824e.f38711l, AbstractC3824e.f38713n}};
    }

    @Override // w1.InterfaceC3842c
    public String b() {
        List e8 = e();
        ArrayList arrayList = new ArrayList();
        if (e8.size() >= 1) {
            arrayList.add(this.f38973c.d((String) e8.get(0)));
            if (e8.size() >= 2 && ((Boolean) ((AbstractC3733a) this.f38946a.get(AbstractC3824e.f38712m)).c()).booleanValue()) {
                arrayList.add(this.f38973c.d((String) e8.get(1)));
            }
        }
        return (String) Collection.EL.stream(arrayList).collect(Collectors.joining("."));
    }

    public void f(String str) {
        String[] split = str.split("\\.");
        String[] strArr = new String[2];
        boolean z8 = false;
        for (int i8 = 0; i8 < split.length; i8++) {
            String c8 = this.f38973c.c(split[i8]);
            String substring = c8.substring(0, 2);
            substring.hashCode();
            if (!substring.equals("00")) {
                if (substring.equals("01")) {
                    strArr[1] = c8;
                    z8 = true;
                } else {
                    throw new C3800a("Unable to decode segment '" + split[i8] + "'");
                }
            } else {
                strArr[0] = c8;
            }
        }
        d(Arrays.asList(strArr));
        ((AbstractC3733a) this.f38946a.get(AbstractC3823d.f38698n)).d(Boolean.valueOf(z8));
    }

    @Override // w1.InterfaceC3842c
    public int getId() {
        return f38970d;
    }

    public j(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
