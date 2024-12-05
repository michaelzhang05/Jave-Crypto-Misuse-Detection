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
import v1.C4093h;
import v1.C4094i;
import v1.C4095j;
import w1.AbstractC4126c;
import y1.AbstractC4199c;

/* loaded from: classes4.dex */
public class h extends AbstractC4221b {

    /* renamed from: d, reason: collision with root package name */
    public static int f41083d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static int f41084e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static String f41085f = "tcfeuv2";

    /* renamed from: c, reason: collision with root package name */
    private AbstractC4126c f41086c = new w1.o();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements IntSupplier {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4091f f41087a;

        a(C4091f c4091f) {
            this.f41087a = c4091f;
        }

        @Override // java.util.function.IntSupplier
        public int getAsInt() {
            return ((Integer) this.f41087a.c()).intValue();
        }
    }

    public h() {
        g();
    }

    private void g() {
        this.f41069a = new HashMap();
        ZonedDateTime now = ZonedDateTime.now();
        this.f41069a.put(AbstractC4199c.f40790a, new C4091f(6, Integer.valueOf(f41084e)));
        this.f41069a.put(AbstractC4199c.f40791b, new C4088c(now));
        this.f41069a.put(AbstractC4199c.f40792c, new C4088c(now));
        this.f41069a.put(AbstractC4199c.f40793d, new C4091f(12, 0));
        this.f41069a.put(AbstractC4199c.f40794e, new C4091f(12, 0));
        this.f41069a.put(AbstractC4199c.f40795f, new C4091f(6, 0));
        this.f41069a.put(AbstractC4199c.f40796g, new C4094i(2, "EN"));
        this.f41069a.put(AbstractC4199c.f40797h, new C4091f(12, 0));
        this.f41069a.put(AbstractC4199c.f40798i, new C4091f(6, 2));
        Map map = this.f41069a;
        String str = AbstractC4199c.f40799j;
        Boolean bool = Boolean.FALSE;
        map.put(str, new C4087b(bool));
        this.f41069a.put(AbstractC4199c.f40800k, new C4087b(bool));
        this.f41069a.put(AbstractC4199c.f40801l, new C4090e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f41069a.put(AbstractC4199c.f40802m, new C4090e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f41069a.put(AbstractC4199c.f40803n, new C4090e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f41069a.put(AbstractC4199c.f40804o, new C4087b(bool));
        this.f41069a.put(AbstractC4199c.f40805p, new C4094i(2, "AA"));
        this.f41069a.put(AbstractC4199c.f40806q, new v1.k(new ArrayList()));
        this.f41069a.put(AbstractC4199c.f40807r, new v1.k(new ArrayList()));
        this.f41069a.put(AbstractC4199c.f40808s, new C4093h(new ArrayList()));
        this.f41069a.put(AbstractC4199c.f40809t, new C4091f(3, 3));
        this.f41069a.put(AbstractC4199c.f40810u, new C4090e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        this.f41069a.put(AbstractC4199c.f40811v, new C4090e(Arrays.asList(bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool, bool)));
        C4091f c4091f = new C4091f(6, 0);
        this.f41069a.put(AbstractC4199c.f40812w, c4091f);
        a aVar = new a(c4091f);
        this.f41069a.put(AbstractC4199c.f40813x, new C4095j(aVar, new ArrayList()));
        this.f41069a.put(AbstractC4199c.f40814y, new C4095j(aVar, new ArrayList()));
        this.f41069a.put(AbstractC4199c.f40815z, new C4091f(3, 2));
        this.f41069a.put(AbstractC4199c.f40787A, new v1.k(new ArrayList()));
        this.f41069a.put(AbstractC4199c.f40788B, new C4091f(3, 1));
        this.f41069a.put(AbstractC4199c.f40789C, new v1.k(new ArrayList()));
        this.f41070b = new String[][]{new String[]{AbstractC4199c.f40790a, AbstractC4199c.f40791b, AbstractC4199c.f40792c, AbstractC4199c.f40793d, AbstractC4199c.f40794e, AbstractC4199c.f40795f, AbstractC4199c.f40796g, AbstractC4199c.f40797h, AbstractC4199c.f40798i, AbstractC4199c.f40799j, AbstractC4199c.f40800k, AbstractC4199c.f40801l, AbstractC4199c.f40802m, AbstractC4199c.f40803n, AbstractC4199c.f40804o, AbstractC4199c.f40805p, AbstractC4199c.f40806q, AbstractC4199c.f40807r, AbstractC4199c.f40808s}, new String[]{AbstractC4199c.f40809t, AbstractC4199c.f40810u, AbstractC4199c.f40811v, AbstractC4199c.f40812w, AbstractC4199c.f40813x, AbstractC4199c.f40814y}, new String[]{AbstractC4199c.f40815z, AbstractC4199c.f40787A}, new String[]{AbstractC4199c.f40788B, AbstractC4199c.f40789C}};
    }

    @Override // z1.AbstractC4221b, z1.InterfaceC4222c
    public void a(String str, Object obj) {
        super.a(str, obj);
        if (!str.equals(AbstractC4199c.f40791b) && !str.equals(AbstractC4199c.f40792c)) {
            ZonedDateTime now = ZonedDateTime.now(ZoneId.of("UTC"));
            super.a(AbstractC4199c.f40791b, now);
            super.a(AbstractC4199c.f40792c, now);
        }
    }

    @Override // z1.InterfaceC4222c
    public String b() {
        List e8 = e();
        ArrayList arrayList = new ArrayList();
        if (e8.size() >= 1) {
            arrayList.add(this.f41086c.d((String) e8.get(0)));
            if (((Boolean) c(AbstractC4199c.f40799j)).booleanValue()) {
                if (e8.size() >= 2) {
                    arrayList.add(this.f41086c.d((String) e8.get(1)));
                }
            } else if (e8.size() >= 2) {
                arrayList.add(this.f41086c.d((String) e8.get(2)));
                if (e8.size() >= 3) {
                    arrayList.add(this.f41086c.d((String) e8.get(3)));
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
            w1.c r6 = r10.f41086c
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
            x1.a r0 = new x1.a
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
        throw new UnsupportedOperationException("Method not decompiled: z1.h.f(java.lang.String):void");
    }

    @Override // z1.InterfaceC4222c
    public int getId() {
        return f41083d;
    }

    public h(String str) {
        g();
        if (str == null || str.length() <= 0) {
            return;
        }
        f(str);
    }
}
