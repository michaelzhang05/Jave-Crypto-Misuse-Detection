package a2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1613a extends AbstractC1618f {

    /* renamed from: c, reason: collision with root package name */
    public static AbstractC1618f f13809c = new h(null);

    /* renamed from: d, reason: collision with root package name */
    public static AbstractC1618f f13810d = new i(null);

    /* renamed from: e, reason: collision with root package name */
    public static AbstractC1618f f13811e = new j(null);

    /* renamed from: f, reason: collision with root package name */
    public static AbstractC1618f f13812f = new k(null);

    /* renamed from: g, reason: collision with root package name */
    public static AbstractC1618f f13813g = new l(null);

    /* renamed from: h, reason: collision with root package name */
    public static AbstractC1618f f13814h = new m(null);

    /* renamed from: i, reason: collision with root package name */
    public static AbstractC1618f f13815i = new n(null);

    /* renamed from: j, reason: collision with root package name */
    public static AbstractC1618f f13816j = new o(null);

    /* renamed from: k, reason: collision with root package name */
    public static AbstractC1618f f13817k = new p(null);

    /* renamed from: l, reason: collision with root package name */
    public static AbstractC1618f f13818l = new C0262a(null);

    /* renamed from: m, reason: collision with root package name */
    public static AbstractC1618f f13819m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    public static AbstractC1618f f13820n = new c(null);

    /* renamed from: o, reason: collision with root package name */
    public static AbstractC1618f f13821o = new d(null);

    /* renamed from: p, reason: collision with root package name */
    public static AbstractC1618f f13822p = new e(null);

    /* renamed from: q, reason: collision with root package name */
    public static AbstractC1618f f13823q = new f(null);

    /* renamed from: r, reason: collision with root package name */
    public static AbstractC1618f f13824r = new g(null);

    /* renamed from: a2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0262a extends AbstractC1613a {
        C0262a(C1617e c1617e) {
            super(c1617e);
        }

        @Override // a2.AbstractC1618f
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

    /* renamed from: a2.a$b */
    /* loaded from: classes4.dex */
    class b extends AbstractC1613a {
        b(C1617e c1617e) {
            super(c1617e);
        }

        @Override // a2.AbstractC1618f
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

    /* renamed from: a2.a$c */
    /* loaded from: classes4.dex */
    class c extends AbstractC1613a {
        c(C1617e c1617e) {
            super(c1617e);
        }

        @Override // a2.AbstractC1618f
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

    /* renamed from: a2.a$d */
    /* loaded from: classes4.dex */
    class d extends AbstractC1613a {
        d(C1617e c1617e) {
            super(c1617e);
        }

        @Override // a2.AbstractC1618f
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

    /* renamed from: a2.a$e */
    /* loaded from: classes4.dex */
    class e extends AbstractC1613a {
        e(C1617e c1617e) {
            super(c1617e);
        }

        @Override // a2.AbstractC1618f
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

    /* renamed from: a2.a$f */
    /* loaded from: classes4.dex */
    class f extends AbstractC1613a {
        f(C1617e c1617e) {
            super(c1617e);
        }

        @Override // a2.AbstractC1618f
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

    /* renamed from: a2.a$g */
    /* loaded from: classes4.dex */
    class g extends AbstractC1613a {
        g(C1617e c1617e) {
            super(c1617e);
        }

        @Override // a2.AbstractC1618f
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

    /* renamed from: a2.a$h */
    /* loaded from: classes4.dex */
    class h extends AbstractC1613a {
        h(C1617e c1617e) {
            super(c1617e);
        }

        @Override // a2.AbstractC1618f
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

    /* renamed from: a2.a$i */
    /* loaded from: classes4.dex */
    class i extends AbstractC1613a {
        i(C1617e c1617e) {
            super(c1617e);
        }

        @Override // a2.AbstractC1618f
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

    /* renamed from: a2.a$j */
    /* loaded from: classes4.dex */
    class j extends AbstractC1613a {
        j(C1617e c1617e) {
            super(c1617e);
        }

        @Override // a2.AbstractC1618f
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

    /* renamed from: a2.a$k */
    /* loaded from: classes4.dex */
    class k extends AbstractC1613a {
        k(C1617e c1617e) {
            super(c1617e);
        }

        @Override // a2.AbstractC1618f
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

    /* renamed from: a2.a$l */
    /* loaded from: classes4.dex */
    class l extends AbstractC1613a {
        l(C1617e c1617e) {
            super(c1617e);
        }

        @Override // a2.AbstractC1618f
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

    /* renamed from: a2.a$m */
    /* loaded from: classes4.dex */
    class m extends AbstractC1613a {
        m(C1617e c1617e) {
            super(c1617e);
        }

        @Override // a2.AbstractC1618f
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

    /* renamed from: a2.a$n */
    /* loaded from: classes4.dex */
    class n extends AbstractC1613a {
        n(C1617e c1617e) {
            super(c1617e);
        }

        @Override // a2.AbstractC1618f
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

    /* renamed from: a2.a$o */
    /* loaded from: classes4.dex */
    class o extends AbstractC1613a {
        o(C1617e c1617e) {
            super(c1617e);
        }

        @Override // a2.AbstractC1618f
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

    /* renamed from: a2.a$p */
    /* loaded from: classes4.dex */
    class p extends AbstractC1613a {
        p(C1617e c1617e) {
            super(c1617e);
        }

        @Override // a2.AbstractC1618f
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

    public AbstractC1613a(C1617e c1617e) {
        super(c1617e);
    }

    @Override // a2.AbstractC1618f
    public void a(Object obj, Object obj2) {
        ((List) obj).add(obj2);
    }

    @Override // a2.AbstractC1618f
    public Object c() {
        return new ArrayList();
    }
}
