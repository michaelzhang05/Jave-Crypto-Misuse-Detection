package z1;

import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntSupplier;
import v1.C4087b;
import v1.C4088c;
import v1.C4090e;
import v1.C4091f;
import v1.C4094i;
import v1.C4095j;
import w1.AbstractC4126c;
import w1.C4128e;
import x1.C4185a;
import y1.AbstractC4198b;

/* loaded from: classes4.dex */
public class g extends AbstractC4221b {

    /* renamed from: d, reason: collision with root package name */
    public static int f41077d = 5;

    /* renamed from: e, reason: collision with root package name */
    public static int f41078e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f41079f = "tcfcav1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC4126c f41080c = new C4128e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements IntSupplier {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4091f f41081a;

        a(C4091f c4091f) {
            this.f41081a = c4091f;
        }

        @Override // java.util.function.IntSupplier
        public int getAsInt() {
            return ((Integer) this.f41081a.c()).intValue();
        }
    }

    public g() {
        g();
    }

    private void g() {
        this.f41069a = new HashMap();
        ZonedDateTime now = ZonedDateTime.now();
        this.f41069a.put(AbstractC4198b.f40766a, new C4091f(6, Integer.valueOf(f41078e)));
        this.f41069a.put(AbstractC4198b.f40767b, new C4088c(now));
        this.f41069a.put(AbstractC4198b.f40768c, new C4088c(now));
        this.f41069a.put(AbstractC4198b.f40769d, new C4091f(12, 0));
        this.f41069a.put(AbstractC4198b.f40770e, new C4091f(12, 0));
        this.f41069a.put(AbstractC4198b.f40771f, new C4091f(6, 0));
        this.f41069a.put(AbstractC4198b.f40772g, new C4094i(2, "EN"));
        this.f41069a.put(AbstractC4198b.f40773h, new C4091f(12, 0));
        this.f41069a.put(AbstractC4198b.f40774i, new C4091f(6, 2));
        Map map = this.f41069a;
        String str = AbstractC4198b.f40775j;
        Boolean bool = Boolean.FALSE;
        map.put(str, new C4087b(bool));
        this.f41069a.put(AbstractC4198b.f40776k, new C4090e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f41069a.put(AbstractC4198b.f40777l, new C4090e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f41069a.put(AbstractC4198b.f40778m, new C4090e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f41069a.put(AbstractC4198b.f40779n, new v1.k(new ArrayList()));
        this.f41069a.put(AbstractC4198b.f40780o, new v1.k(new ArrayList()));
        this.f41069a.put(AbstractC4198b.f40781p, new C4091f(3, 3));
        this.f41069a.put(AbstractC4198b.f40782q, new C4090e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f41069a.put(AbstractC4198b.f40783r, new C4090e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        C4091f c4091f = new C4091f(6, 0);
        this.f41069a.put(AbstractC4198b.f40784s, c4091f);
        a aVar = new a(c4091f);
        this.f41069a.put(AbstractC4198b.f40785t, new C4095j(aVar, new ArrayList()));
        this.f41069a.put(AbstractC4198b.f40786u, new C4095j(aVar, new ArrayList()));
        this.f41070b = new String[][]{new String[]{AbstractC4198b.f40766a, AbstractC4198b.f40767b, AbstractC4198b.f40768c, AbstractC4198b.f40769d, AbstractC4198b.f40770e, AbstractC4198b.f40771f, AbstractC4198b.f40772g, AbstractC4198b.f40773h, AbstractC4198b.f40774i, AbstractC4198b.f40775j, AbstractC4198b.f40776k, AbstractC4198b.f40777l, AbstractC4198b.f40778m, AbstractC4198b.f40779n, AbstractC4198b.f40780o}, new String[]{AbstractC4198b.f40781p, AbstractC4198b.f40782q, AbstractC4198b.f40783r, AbstractC4198b.f40784s, AbstractC4198b.f40785t, AbstractC4198b.f40786u}};
    }

    @Override // z1.AbstractC4221b, z1.InterfaceC4222c
    public void a(String str, Object obj) {
        super.a(str, obj);
        if (!str.equals(AbstractC4198b.f40767b) && !str.equals(AbstractC4198b.f40768c)) {
            ZonedDateTime now = ZonedDateTime.now(ZoneId.of("UTC"));
            super.a(AbstractC4198b.f40767b, now);
            super.a(AbstractC4198b.f40768c, now);
        }
    }

    @Override // z1.InterfaceC4222c
    public String b() {
        List e8 = e();
        ArrayList arrayList = new ArrayList();
        if (e8.size() >= 1) {
            arrayList.add(this.f41080c.d((String) e8.get(0)));
            if (e8.size() >= 2) {
                arrayList.add(this.f41080c.d((String) e8.get(1)));
            }
        }
        return (String) Collection.EL.stream(arrayList).collect(Collectors.joining("."));
    }

    public void f(String str) {
        String[] split = str.split("\\.");
        String[] strArr = new String[4];
        for (int i8 = 0; i8 < split.length; i8++) {
            String c8 = this.f41080c.c(split[i8]);
            String substring = c8.substring(0, 3);
            substring.hashCode();
            if (!substring.equals("000")) {
                if (substring.equals("011")) {
                    strArr[1] = c8;
                } else {
                    throw new C4185a("Unable to decode segment '" + split[i8] + "'");
                }
            } else {
                strArr[0] = c8;
            }
        }
        d(Arrays.asList(strArr));
    }

    @Override // z1.InterfaceC4222c
    public int getId() {
        return f41077d;
    }

    public g(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
