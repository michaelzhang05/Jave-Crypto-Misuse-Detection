package X1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class a extends X1.f {

    /* renamed from: c, reason: collision with root package name */
    public static X1.f f12188c = new h(null);

    /* renamed from: d, reason: collision with root package name */
    public static X1.f f12189d = new i(null);

    /* renamed from: e, reason: collision with root package name */
    public static X1.f f12190e = new j(null);

    /* renamed from: f, reason: collision with root package name */
    public static X1.f f12191f = new k(null);

    /* renamed from: g, reason: collision with root package name */
    public static X1.f f12192g = new l(null);

    /* renamed from: h, reason: collision with root package name */
    public static X1.f f12193h = new m(null);

    /* renamed from: i, reason: collision with root package name */
    public static X1.f f12194i = new n(null);

    /* renamed from: j, reason: collision with root package name */
    public static X1.f f12195j = new o(null);

    /* renamed from: k, reason: collision with root package name */
    public static X1.f f12196k = new p(null);

    /* renamed from: l, reason: collision with root package name */
    public static X1.f f12197l = new C0235a(null);

    /* renamed from: m, reason: collision with root package name */
    public static X1.f f12198m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    public static X1.f f12199n = new c(null);

    /* renamed from: o, reason: collision with root package name */
    public static X1.f f12200o = new d(null);

    /* renamed from: p, reason: collision with root package name */
    public static X1.f f12201p = new e(null);

    /* renamed from: q, reason: collision with root package name */
    public static X1.f f12202q = new f(null);

    /* renamed from: r, reason: collision with root package name */
    public static X1.f f12203r = new g(null);

    /* renamed from: X1.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0235a extends a {
        C0235a(X1.e eVar) {
            super(eVar);
        }

        @Override // X1.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Long[] b(Object obj) {
            List list = (List) obj;
            Long[] lArr = new Long[list.size()];
            int i8 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Float) {
                        lArr[i8] = (Long) obj2;
                    } else {
                        lArr[i8] = Long.valueOf(((Number) obj2).longValue());
                    }
                    i8++;
                }
            }
            return lArr;
        }
    }

    /* loaded from: classes4.dex */
    class b extends a {
        b(X1.e eVar) {
            super(eVar);
        }

        @Override // X1.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public float[] b(Object obj) {
            List list = (List) obj;
            float[] fArr = new float[list.size()];
            Iterator it = list.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                fArr[i8] = ((Number) it.next()).floatValue();
                i8++;
            }
            return fArr;
        }
    }

    /* loaded from: classes4.dex */
    class c extends a {
        c(X1.e eVar) {
            super(eVar);
        }

        @Override // X1.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Float[] b(Object obj) {
            List list = (List) obj;
            Float[] fArr = new Float[list.size()];
            int i8 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Float) {
                        fArr[i8] = (Float) obj2;
                    } else {
                        fArr[i8] = Float.valueOf(((Number) obj2).floatValue());
                    }
                    i8++;
                }
            }
            return fArr;
        }
    }

    /* loaded from: classes4.dex */
    class d extends a {
        d(X1.e eVar) {
            super(eVar);
        }

        @Override // X1.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public double[] b(Object obj) {
            List list = (List) obj;
            double[] dArr = new double[list.size()];
            Iterator it = list.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                dArr[i8] = ((Number) it.next()).doubleValue();
                i8++;
            }
            return dArr;
        }
    }

    /* loaded from: classes4.dex */
    class e extends a {
        e(X1.e eVar) {
            super(eVar);
        }

        @Override // X1.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Double[] b(Object obj) {
            List list = (List) obj;
            Double[] dArr = new Double[list.size()];
            int i8 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Double) {
                        dArr[i8] = (Double) obj2;
                    } else {
                        dArr[i8] = Double.valueOf(((Number) obj2).doubleValue());
                    }
                    i8++;
                }
            }
            return dArr;
        }
    }

    /* loaded from: classes4.dex */
    class f extends a {
        f(X1.e eVar) {
            super(eVar);
        }

        @Override // X1.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean[] b(Object obj) {
            List list = (List) obj;
            boolean[] zArr = new boolean[list.size()];
            Iterator it = list.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                zArr[i8] = ((Boolean) it.next()).booleanValue();
                i8++;
            }
            return zArr;
        }
    }

    /* loaded from: classes4.dex */
    class g extends a {
        g(X1.e eVar) {
            super(eVar);
        }

        @Override // X1.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean[] b(Object obj) {
            boolean z8;
            List list = (List) obj;
            Boolean[] boolArr = new Boolean[list.size()];
            int i8 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Boolean) {
                        boolArr[i8] = (Boolean) obj2;
                    } else if (obj2 instanceof Number) {
                        if (((Number) obj2).intValue() != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        boolArr[i8] = Boolean.valueOf(z8);
                    } else {
                        throw new RuntimeException("can not convert " + obj2 + " toBoolean");
                    }
                    i8++;
                }
            }
            return boolArr;
        }
    }

    /* loaded from: classes4.dex */
    class h extends a {
        h(X1.e eVar) {
            super(eVar);
        }

        @Override // X1.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int[] b(Object obj) {
            List list = (List) obj;
            int[] iArr = new int[list.size()];
            Iterator it = list.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                iArr[i8] = ((Number) it.next()).intValue();
                i8++;
            }
            return iArr;
        }
    }

    /* loaded from: classes4.dex */
    class i extends a {
        i(X1.e eVar) {
            super(eVar);
        }

        @Override // X1.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer[] b(Object obj) {
            List list = (List) obj;
            Integer[] numArr = new Integer[list.size()];
            int i8 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Integer) {
                        numArr[i8] = (Integer) obj2;
                    } else {
                        numArr[i8] = Integer.valueOf(((Number) obj2).intValue());
                    }
                    i8++;
                }
            }
            return numArr;
        }
    }

    /* loaded from: classes4.dex */
    class j extends a {
        j(X1.e eVar) {
            super(eVar);
        }

        @Override // X1.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public short[] b(Object obj) {
            List list = (List) obj;
            short[] sArr = new short[list.size()];
            Iterator it = list.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                sArr[i8] = ((Number) it.next()).shortValue();
                i8++;
            }
            return sArr;
        }
    }

    /* loaded from: classes4.dex */
    class k extends a {
        k(X1.e eVar) {
            super(eVar);
        }

        @Override // X1.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Short[] b(Object obj) {
            List list = (List) obj;
            Short[] shArr = new Short[list.size()];
            int i8 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Short) {
                        shArr[i8] = (Short) obj2;
                    } else {
                        shArr[i8] = Short.valueOf(((Number) obj2).shortValue());
                    }
                    i8++;
                }
            }
            return shArr;
        }
    }

    /* loaded from: classes4.dex */
    class l extends a {
        l(X1.e eVar) {
            super(eVar);
        }

        @Override // X1.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public byte[] b(Object obj) {
            List list = (List) obj;
            byte[] bArr = new byte[list.size()];
            Iterator it = list.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                bArr[i8] = ((Number) it.next()).byteValue();
                i8++;
            }
            return bArr;
        }
    }

    /* loaded from: classes4.dex */
    class m extends a {
        m(X1.e eVar) {
            super(eVar);
        }

        @Override // X1.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Byte[] b(Object obj) {
            List list = (List) obj;
            Byte[] bArr = new Byte[list.size()];
            int i8 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Byte) {
                        bArr[i8] = (Byte) obj2;
                    } else {
                        bArr[i8] = Byte.valueOf(((Number) obj2).byteValue());
                    }
                    i8++;
                }
            }
            return bArr;
        }
    }

    /* loaded from: classes4.dex */
    class n extends a {
        n(X1.e eVar) {
            super(eVar);
        }

        @Override // X1.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public char[] b(Object obj) {
            List list = (List) obj;
            char[] cArr = new char[list.size()];
            Iterator it = list.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                cArr[i8] = it.next().toString().charAt(0);
                i8++;
            }
            return cArr;
        }
    }

    /* loaded from: classes4.dex */
    class o extends a {
        o(X1.e eVar) {
            super(eVar);
        }

        @Override // X1.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Character[] b(Object obj) {
            List list = (List) obj;
            Character[] chArr = new Character[list.size()];
            int i8 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    chArr[i8] = Character.valueOf(obj2.toString().charAt(0));
                    i8++;
                }
            }
            return chArr;
        }
    }

    /* loaded from: classes4.dex */
    class p extends a {
        p(X1.e eVar) {
            super(eVar);
        }

        @Override // X1.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public long[] b(Object obj) {
            List list = (List) obj;
            long[] jArr = new long[list.size()];
            Iterator it = list.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                jArr[i8] = ((Number) it.next()).intValue();
                i8++;
            }
            return jArr;
        }
    }

    public a(X1.e eVar) {
        super(eVar);
    }

    @Override // X1.f
    public void a(Object obj, Object obj2) {
        ((List) obj).add(obj2);
    }

    @Override // X1.f
    public Object c() {
        return new ArrayList();
    }
}
