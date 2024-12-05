package w1;

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
import s1.C3734b;
import s1.C3735c;
import s1.C3737e;
import s1.C3738f;
import s1.C3741i;
import s1.C3742j;
import t1.AbstractC3772c;
import t1.C3774e;
import u1.C3800a;
import v1.AbstractC3821b;

/* loaded from: classes3.dex */
public class g extends AbstractC3841b {

    /* renamed from: d, reason: collision with root package name */
    public static int f38954d = 5;

    /* renamed from: e, reason: collision with root package name */
    public static int f38955e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static String f38956f = "tcfcav1";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC3772c f38957c = new C3774e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements IntSupplier {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3738f f38958a;

        a(C3738f c3738f) {
            this.f38958a = c3738f;
        }

        @Override // java.util.function.IntSupplier
        public int getAsInt() {
            return ((Integer) this.f38958a.c()).intValue();
        }
    }

    public g() {
        g();
    }

    private void g() {
        this.f38946a = new HashMap();
        ZonedDateTime now = ZonedDateTime.now();
        this.f38946a.put(AbstractC3821b.f38635a, new C3738f(6, Integer.valueOf(f38955e)));
        this.f38946a.put(AbstractC3821b.f38636b, new C3735c(now));
        this.f38946a.put(AbstractC3821b.f38637c, new C3735c(now));
        this.f38946a.put(AbstractC3821b.f38638d, new C3738f(12, 0));
        this.f38946a.put(AbstractC3821b.f38639e, new C3738f(12, 0));
        this.f38946a.put(AbstractC3821b.f38640f, new C3738f(6, 0));
        this.f38946a.put(AbstractC3821b.f38641g, new C3741i(2, "EN"));
        this.f38946a.put(AbstractC3821b.f38642h, new C3738f(12, 0));
        this.f38946a.put(AbstractC3821b.f38643i, new C3738f(6, 2));
        Map map = this.f38946a;
        String str = AbstractC3821b.f38644j;
        Boolean bool = Boolean.FALSE;
        map.put(str, new C3734b(bool));
        this.f38946a.put(AbstractC3821b.f38645k, new C3737e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f38946a.put(AbstractC3821b.f38646l, new C3737e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f38946a.put(AbstractC3821b.f38647m, new C3737e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f38946a.put(AbstractC3821b.f38648n, new s1.k(new ArrayList()));
        this.f38946a.put(AbstractC3821b.f38649o, new s1.k(new ArrayList()));
        this.f38946a.put(AbstractC3821b.f38650p, new C3738f(3, 3));
        this.f38946a.put(AbstractC3821b.f38651q, new C3737e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f38946a.put(AbstractC3821b.f38652r, new C3737e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        C3738f c3738f = new C3738f(6, 0);
        this.f38946a.put(AbstractC3821b.f38653s, c3738f);
        a aVar = new a(c3738f);
        this.f38946a.put(AbstractC3821b.f38654t, new C3742j(aVar, new ArrayList()));
        this.f38946a.put(AbstractC3821b.f38655u, new C3742j(aVar, new ArrayList()));
        this.f38947b = new String[][]{new String[]{AbstractC3821b.f38635a, AbstractC3821b.f38636b, AbstractC3821b.f38637c, AbstractC3821b.f38638d, AbstractC3821b.f38639e, AbstractC3821b.f38640f, AbstractC3821b.f38641g, AbstractC3821b.f38642h, AbstractC3821b.f38643i, AbstractC3821b.f38644j, AbstractC3821b.f38645k, AbstractC3821b.f38646l, AbstractC3821b.f38647m, AbstractC3821b.f38648n, AbstractC3821b.f38649o}, new String[]{AbstractC3821b.f38650p, AbstractC3821b.f38651q, AbstractC3821b.f38652r, AbstractC3821b.f38653s, AbstractC3821b.f38654t, AbstractC3821b.f38655u}};
    }

    @Override // w1.AbstractC3841b, w1.InterfaceC3842c
    public void a(String str, Object obj) {
        super.a(str, obj);
        if (!str.equals(AbstractC3821b.f38636b) && !str.equals(AbstractC3821b.f38637c)) {
            ZonedDateTime now = ZonedDateTime.now(ZoneId.of("UTC"));
            super.a(AbstractC3821b.f38636b, now);
            super.a(AbstractC3821b.f38637c, now);
        }
    }

    @Override // w1.InterfaceC3842c
    public String b() {
        List e8 = e();
        ArrayList arrayList = new ArrayList();
        if (e8.size() >= 1) {
            arrayList.add(this.f38957c.d((String) e8.get(0)));
            if (e8.size() >= 2) {
                arrayList.add(this.f38957c.d((String) e8.get(1)));
            }
        }
        return (String) Collection.EL.stream(arrayList).collect(Collectors.joining("."));
    }

    public void f(String str) {
        String[] split = str.split("\\.");
        String[] strArr = new String[4];
        for (int i8 = 0; i8 < split.length; i8++) {
            String c8 = this.f38957c.c(split[i8]);
            String substring = c8.substring(0, 3);
            substring.hashCode();
            if (!substring.equals("000")) {
                if (substring.equals("011")) {
                    strArr[1] = c8;
                } else {
                    throw new C3800a("Unable to decode segment '" + split[i8] + "'");
                }
            } else {
                strArr[0] = c8;
            }
        }
        d(Arrays.asList(strArr));
    }

    @Override // w1.InterfaceC3842c
    public int getId() {
        return f38954d;
    }

    public g(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
