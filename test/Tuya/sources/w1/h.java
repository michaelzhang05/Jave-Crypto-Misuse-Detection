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
import s1.C3740h;
import s1.C3741i;
import s1.C3742j;
import t1.AbstractC3772c;
import v1.AbstractC3822c;

/* loaded from: classes3.dex */
public class h extends AbstractC3841b {

    /* renamed from: d, reason: collision with root package name */
    public static int f38960d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static int f38961e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static String f38962f = "tcfeuv2";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC3772c f38963c = new t1.o();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements IntSupplier {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3738f f38964a;

        a(C3738f c3738f) {
            this.f38964a = c3738f;
        }

        @Override // java.util.function.IntSupplier
        public int getAsInt() {
            return ((Integer) this.f38964a.c()).intValue();
        }
    }

    public h() {
        g();
    }

    private void g() {
        this.f38946a = new HashMap();
        ZonedDateTime now = ZonedDateTime.now();
        this.f38946a.put(AbstractC3822c.f38659a, new C3738f(6, Integer.valueOf(f38961e)));
        this.f38946a.put(AbstractC3822c.f38660b, new C3735c(now));
        this.f38946a.put(AbstractC3822c.f38661c, new C3735c(now));
        this.f38946a.put(AbstractC3822c.f38662d, new C3738f(12, 0));
        this.f38946a.put(AbstractC3822c.f38663e, new C3738f(12, 0));
        this.f38946a.put(AbstractC3822c.f38664f, new C3738f(6, 0));
        this.f38946a.put(AbstractC3822c.f38665g, new C3741i(2, "EN"));
        this.f38946a.put(AbstractC3822c.f38666h, new C3738f(12, 0));
        this.f38946a.put(AbstractC3822c.f38667i, new C3738f(6, 2));
        Map map = this.f38946a;
        String str = AbstractC3822c.f38668j;
        Boolean bool = Boolean.FALSE;
        map.put(str, new C3734b(bool));
        this.f38946a.put(AbstractC3822c.f38669k, new C3734b(bool));
        this.f38946a.put(AbstractC3822c.f38670l, new C3737e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f38946a.put(AbstractC3822c.f38671m, new C3737e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f38946a.put(AbstractC3822c.f38672n, new C3737e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f38946a.put(AbstractC3822c.f38673o, new C3734b(bool));
        this.f38946a.put(AbstractC3822c.f38674p, new C3741i(2, "AA"));
        this.f38946a.put(AbstractC3822c.f38675q, new s1.k(new ArrayList()));
        this.f38946a.put(AbstractC3822c.f38676r, new s1.k(new ArrayList()));
        this.f38946a.put(AbstractC3822c.f38677s, new C3740h(new ArrayList()));
        this.f38946a.put(AbstractC3822c.f38678t, new C3738f(3, 3));
        this.f38946a.put(AbstractC3822c.f38679u, new C3737e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f38946a.put(AbstractC3822c.f38680v, new C3737e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        C3738f c3738f = new C3738f(6, 0);
        this.f38946a.put(AbstractC3822c.f38681w, c3738f);
        a aVar = new a(c3738f);
        this.f38946a.put(AbstractC3822c.f38682x, new C3742j(aVar, new ArrayList()));
        this.f38946a.put(AbstractC3822c.f38683y, new C3742j(aVar, new ArrayList()));
        this.f38946a.put(AbstractC3822c.f38684z, new C3738f(3, 2));
        this.f38946a.put(AbstractC3822c.f38656A, new s1.k(new ArrayList()));
        this.f38946a.put(AbstractC3822c.f38657B, new C3738f(3, 1));
        this.f38946a.put(AbstractC3822c.f38658C, new s1.k(new ArrayList()));
        this.f38947b = new String[][]{new String[]{AbstractC3822c.f38659a, AbstractC3822c.f38660b, AbstractC3822c.f38661c, AbstractC3822c.f38662d, AbstractC3822c.f38663e, AbstractC3822c.f38664f, AbstractC3822c.f38665g, AbstractC3822c.f38666h, AbstractC3822c.f38667i, AbstractC3822c.f38668j, AbstractC3822c.f38669k, AbstractC3822c.f38670l, AbstractC3822c.f38671m, AbstractC3822c.f38672n, AbstractC3822c.f38673o, AbstractC3822c.f38674p, AbstractC3822c.f38675q, AbstractC3822c.f38676r, AbstractC3822c.f38677s}, new String[]{AbstractC3822c.f38678t, AbstractC3822c.f38679u, AbstractC3822c.f38680v, AbstractC3822c.f38681w, AbstractC3822c.f38682x, AbstractC3822c.f38683y}, new String[]{AbstractC3822c.f38684z, AbstractC3822c.f38656A}, new String[]{AbstractC3822c.f38657B, AbstractC3822c.f38658C}};
    }

    @Override // w1.AbstractC3841b, w1.InterfaceC3842c
    public void a(String str, Object obj) {
        super.a(str, obj);
        if (!str.equals(AbstractC3822c.f38660b) && !str.equals(AbstractC3822c.f38661c)) {
            ZonedDateTime now = ZonedDateTime.now(ZoneId.of("UTC"));
            super.a(AbstractC3822c.f38660b, now);
            super.a(AbstractC3822c.f38661c, now);
        }
    }

    @Override // w1.InterfaceC3842c
    public String b() {
        List e8 = e();
        ArrayList arrayList = new ArrayList();
        if (e8.size() >= 1) {
            arrayList.add(this.f38963c.d((String) e8.get(0)));
            if (((Boolean) c(AbstractC3822c.f38668j)).booleanValue()) {
                if (e8.size() >= 2) {
                    arrayList.add(this.f38963c.d((String) e8.get(1)));
                }
            } else if (e8.size() >= 2) {
                arrayList.add(this.f38963c.d((String) e8.get(2)));
                if (e8.size() >= 3) {
                    arrayList.add(this.f38963c.d((String) e8.get(3)));
                }
            }
        }
        return (String) Collection.EL.stream(arrayList).collect(Collectors.joining("."));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 2
            r1 = 3
            r2 = 1
            java.lang.String r3 = "\\."
            java.lang.String[] r11 = r11.split(r3)
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = 0
            r5 = 0
        Le:
            int r6 = r11.length
            if (r5 >= r6) goto L82
            t1.c r6 = r10.f38963c
            r7 = r11[r5]
            java.lang.String r6 = r6.c(r7)
            java.lang.String r7 = r6.substring(r4, r1)
            r7.hashCode()
            r8 = -1
            int r9 = r7.hashCode()
            switch(r9) {
                case 47664: goto L4a;
                case 47665: goto L3f;
                case 47695: goto L34;
                case 47696: goto L29;
                default: goto L28;
            }
        L28:
            goto L54
        L29:
            java.lang.String r9 = "011"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L32
            goto L54
        L32:
            r8 = 3
            goto L54
        L34:
            java.lang.String r9 = "010"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L3d
            goto L54
        L3d:
            r8 = 2
            goto L54
        L3f:
            java.lang.String r9 = "001"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L48
            goto L54
        L48:
            r8 = 1
            goto L54
        L4a:
            java.lang.String r9 = "000"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L53
            goto L54
        L53:
            r8 = 0
        L54:
            switch(r8) {
                case 0: goto L7e;
                case 1: goto L7b;
                case 2: goto L78;
                case 3: goto L75;
                default: goto L57;
            }
        L57:
            u1.a r0 = new u1.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to decode segment '"
            r1.append(r2)
            r11 = r11[r5]
            r1.append(r11)
            java.lang.String r11 = "'"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L75:
            r3[r2] = r6
            goto L80
        L78:
            r3[r0] = r6
            goto L80
        L7b:
            r3[r1] = r6
            goto L80
        L7e:
            r3[r4] = r6
        L80:
            int r5 = r5 + r2
            goto Le
        L82:
            java.util.List r11 = java.util.Arrays.asList(r3)
            r10.d(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.h.f(java.lang.String):void");
    }

    @Override // w1.InterfaceC3842c
    public int getId() {
        return f38960d;
    }

    public h(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
