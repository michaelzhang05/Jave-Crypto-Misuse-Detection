package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import p.e;
import q.b;
import t3.b0;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    SparseArray f1500a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f1501b;

    /* renamed from: c, reason: collision with root package name */
    protected p.f f1502c;

    /* renamed from: d, reason: collision with root package name */
    private int f1503d;

    /* renamed from: e, reason: collision with root package name */
    private int f1504e;

    /* renamed from: f, reason: collision with root package name */
    private int f1505f;

    /* renamed from: g, reason: collision with root package name */
    private int f1506g;

    /* renamed from: h, reason: collision with root package name */
    protected boolean f1507h;

    /* renamed from: i, reason: collision with root package name */
    private int f1508i;

    /* renamed from: j, reason: collision with root package name */
    private d f1509j;

    /* renamed from: k, reason: collision with root package name */
    protected androidx.constraintlayout.widget.c f1510k;

    /* renamed from: l, reason: collision with root package name */
    private int f1511l;

    /* renamed from: m, reason: collision with root package name */
    private HashMap f1512m;

    /* renamed from: n, reason: collision with root package name */
    private int f1513n;

    /* renamed from: o, reason: collision with root package name */
    private int f1514o;

    /* renamed from: p, reason: collision with root package name */
    int f1515p;

    /* renamed from: q, reason: collision with root package name */
    int f1516q;

    /* renamed from: r, reason: collision with root package name */
    int f1517r;

    /* renamed from: s, reason: collision with root package name */
    int f1518s;

    /* renamed from: t, reason: collision with root package name */
    private SparseArray f1519t;

    /* renamed from: u, reason: collision with root package name */
    c f1520u;

    /* renamed from: v, reason: collision with root package name */
    private int f1521v;

    /* renamed from: w, reason: collision with root package name */
    private int f1522w;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1523a;

        static {
            int[] iArr = new int[e.b.values().length];
            f1523a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1523a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1523a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1523a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        float C;
        int D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O;
        public float P;
        public int Q;
        public int R;
        public int S;
        public boolean T;
        public boolean U;
        public String V;
        boolean W;
        boolean X;
        boolean Y;
        boolean Z;

        /* renamed from: a, reason: collision with root package name */
        public int f1524a;

        /* renamed from: a0, reason: collision with root package name */
        boolean f1525a0;

        /* renamed from: b, reason: collision with root package name */
        public int f1526b;

        /* renamed from: b0, reason: collision with root package name */
        boolean f1527b0;

        /* renamed from: c, reason: collision with root package name */
        public float f1528c;

        /* renamed from: c0, reason: collision with root package name */
        boolean f1529c0;

        /* renamed from: d, reason: collision with root package name */
        public int f1530d;

        /* renamed from: d0, reason: collision with root package name */
        int f1531d0;

        /* renamed from: e, reason: collision with root package name */
        public int f1532e;

        /* renamed from: e0, reason: collision with root package name */
        int f1533e0;

        /* renamed from: f, reason: collision with root package name */
        public int f1534f;

        /* renamed from: f0, reason: collision with root package name */
        int f1535f0;

        /* renamed from: g, reason: collision with root package name */
        public int f1536g;

        /* renamed from: g0, reason: collision with root package name */
        int f1537g0;

        /* renamed from: h, reason: collision with root package name */
        public int f1538h;

        /* renamed from: h0, reason: collision with root package name */
        int f1539h0;

        /* renamed from: i, reason: collision with root package name */
        public int f1540i;

        /* renamed from: i0, reason: collision with root package name */
        int f1541i0;

        /* renamed from: j, reason: collision with root package name */
        public int f1542j;

        /* renamed from: j0, reason: collision with root package name */
        float f1543j0;

        /* renamed from: k, reason: collision with root package name */
        public int f1544k;

        /* renamed from: k0, reason: collision with root package name */
        int f1545k0;

        /* renamed from: l, reason: collision with root package name */
        public int f1546l;

        /* renamed from: l0, reason: collision with root package name */
        int f1547l0;

        /* renamed from: m, reason: collision with root package name */
        public int f1548m;

        /* renamed from: m0, reason: collision with root package name */
        float f1549m0;

        /* renamed from: n, reason: collision with root package name */
        public int f1550n;

        /* renamed from: n0, reason: collision with root package name */
        p.e f1551n0;

        /* renamed from: o, reason: collision with root package name */
        public float f1552o;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f1553o0;

        /* renamed from: p, reason: collision with root package name */
        public int f1554p;

        /* renamed from: q, reason: collision with root package name */
        public int f1555q;

        /* renamed from: r, reason: collision with root package name */
        public int f1556r;

        /* renamed from: s, reason: collision with root package name */
        public int f1557s;

        /* renamed from: t, reason: collision with root package name */
        public int f1558t;

        /* renamed from: u, reason: collision with root package name */
        public int f1559u;

        /* renamed from: v, reason: collision with root package name */
        public int f1560v;

        /* renamed from: w, reason: collision with root package name */
        public int f1561w;

        /* renamed from: x, reason: collision with root package name */
        public int f1562x;

        /* renamed from: y, reason: collision with root package name */
        public int f1563y;

        /* renamed from: z, reason: collision with root package name */
        public float f1564z;

        /* loaded from: classes.dex */
        private static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f1565a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1565a = sparseIntArray;
                sparseIntArray.append(h.f1768l2, 8);
                sparseIntArray.append(h.f1775m2, 9);
                sparseIntArray.append(h.f1789o2, 10);
                sparseIntArray.append(h.f1796p2, 11);
                sparseIntArray.append(h.f1834v2, 12);
                sparseIntArray.append(h.f1828u2, 13);
                sparseIntArray.append(h.T1, 14);
                sparseIntArray.append(h.S1, 15);
                sparseIntArray.append(h.Q1, 16);
                sparseIntArray.append(h.U1, 2);
                sparseIntArray.append(h.W1, 3);
                sparseIntArray.append(h.V1, 4);
                sparseIntArray.append(h.D2, 49);
                sparseIntArray.append(h.E2, 50);
                sparseIntArray.append(h.f1691a2, 5);
                sparseIntArray.append(h.f1698b2, 6);
                sparseIntArray.append(h.f1705c2, 7);
                sparseIntArray.append(h.f1697b1, 1);
                sparseIntArray.append(h.f1803q2, 17);
                sparseIntArray.append(h.f1810r2, 18);
                sparseIntArray.append(h.Z1, 19);
                sparseIntArray.append(h.Y1, 20);
                sparseIntArray.append(h.H2, 21);
                sparseIntArray.append(h.K2, 22);
                sparseIntArray.append(h.I2, 23);
                sparseIntArray.append(h.F2, 24);
                sparseIntArray.append(h.J2, 25);
                sparseIntArray.append(h.G2, 26);
                sparseIntArray.append(h.f1740h2, 29);
                sparseIntArray.append(h.f1840w2, 30);
                sparseIntArray.append(h.X1, 44);
                sparseIntArray.append(h.f1754j2, 45);
                sparseIntArray.append(h.f1852y2, 46);
                sparseIntArray.append(h.f1747i2, 47);
                sparseIntArray.append(h.f1846x2, 48);
                sparseIntArray.append(h.O1, 27);
                sparseIntArray.append(h.N1, 28);
                sparseIntArray.append(h.f1858z2, 31);
                sparseIntArray.append(h.f1712d2, 32);
                sparseIntArray.append(h.B2, 33);
                sparseIntArray.append(h.A2, 34);
                sparseIntArray.append(h.C2, 35);
                sparseIntArray.append(h.f1726f2, 36);
                sparseIntArray.append(h.f1719e2, 37);
                sparseIntArray.append(h.f1733g2, 38);
                sparseIntArray.append(h.f1761k2, 39);
                sparseIntArray.append(h.f1822t2, 40);
                sparseIntArray.append(h.f1782n2, 41);
                sparseIntArray.append(h.R1, 42);
                sparseIntArray.append(h.P1, 43);
                sparseIntArray.append(h.f1816s2, 51);
            }
        }

        public b(int i6, int i7) {
            super(i6, i7);
            this.f1524a = -1;
            this.f1526b = -1;
            this.f1528c = -1.0f;
            this.f1530d = -1;
            this.f1532e = -1;
            this.f1534f = -1;
            this.f1536g = -1;
            this.f1538h = -1;
            this.f1540i = -1;
            this.f1542j = -1;
            this.f1544k = -1;
            this.f1546l = -1;
            this.f1548m = -1;
            this.f1550n = 0;
            this.f1552o = 0.0f;
            this.f1554p = -1;
            this.f1555q = -1;
            this.f1556r = -1;
            this.f1557s = -1;
            this.f1558t = -1;
            this.f1559u = -1;
            this.f1560v = -1;
            this.f1561w = -1;
            this.f1562x = -1;
            this.f1563y = -1;
            this.f1564z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.f1525a0 = false;
            this.f1527b0 = false;
            this.f1529c0 = false;
            this.f1531d0 = -1;
            this.f1533e0 = -1;
            this.f1535f0 = -1;
            this.f1537g0 = -1;
            this.f1539h0 = -1;
            this.f1541i0 = -1;
            this.f1543j0 = 0.5f;
            this.f1551n0 = new p.e();
            this.f1553o0 = false;
        }

        public void a() {
            this.Z = false;
            this.W = true;
            this.X = true;
            int i6 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i6 == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            int i7 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i7 == -2 && this.U) {
                this.X = false;
                if (this.J == 0) {
                    this.J = 1;
                }
            }
            if (i6 == 0 || i6 == -1) {
                this.W = false;
                if (i6 == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.T = true;
                }
            }
            if (i7 == 0 || i7 == -1) {
                this.X = false;
                if (i7 == 0 && this.J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.U = true;
                }
            }
            if (this.f1528c == -1.0f && this.f1524a == -1 && this.f1526b == -1) {
                return;
            }
            this.Z = true;
            this.W = true;
            this.X = true;
            if (!(this.f1551n0 instanceof p.h)) {
                this.f1551n0 = new p.h();
            }
            ((p.h) this.f1551n0).R0(this.S);
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00ca, code lost:
        
            if (r1 > 0) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00cc, code lost:
        
            ((android.view.ViewGroup.MarginLayoutParams) r9).rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x00d9, code lost:
        
            if (r1 > 0) goto L73;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            int i6;
            float parseFloat;
            this.f1524a = -1;
            this.f1526b = -1;
            this.f1528c = -1.0f;
            this.f1530d = -1;
            this.f1532e = -1;
            this.f1534f = -1;
            this.f1536g = -1;
            this.f1538h = -1;
            this.f1540i = -1;
            this.f1542j = -1;
            this.f1544k = -1;
            this.f1546l = -1;
            this.f1548m = -1;
            this.f1550n = 0;
            this.f1552o = 0.0f;
            this.f1554p = -1;
            this.f1555q = -1;
            this.f1556r = -1;
            this.f1557s = -1;
            this.f1558t = -1;
            this.f1559u = -1;
            this.f1560v = -1;
            this.f1561w = -1;
            this.f1562x = -1;
            this.f1563y = -1;
            this.f1564z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.f1525a0 = false;
            this.f1527b0 = false;
            this.f1529c0 = false;
            this.f1531d0 = -1;
            this.f1533e0 = -1;
            this.f1535f0 = -1;
            this.f1537g0 = -1;
            this.f1539h0 = -1;
            this.f1541i0 = -1;
            this.f1543j0 = 0.5f;
            this.f1551n0 = new p.e();
            this.f1553o0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f1690a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                int i8 = a.f1565a.get(index);
                switch (i8) {
                    case 1:
                        this.S = obtainStyledAttributes.getInt(index, this.S);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1548m);
                        this.f1548m = resourceId;
                        if (resourceId == -1) {
                            this.f1548m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        this.f1550n = obtainStyledAttributes.getDimensionPixelSize(index, this.f1550n);
                        continue;
                    case 4:
                        float f6 = obtainStyledAttributes.getFloat(index, this.f1552o) % 360.0f;
                        this.f1552o = f6;
                        if (f6 < 0.0f) {
                            this.f1552o = (360.0f - f6) % 360.0f;
                            break;
                        } else {
                            continue;
                        }
                    case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                        this.f1524a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1524a);
                        continue;
                    case 6:
                        this.f1526b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1526b);
                        continue;
                    case 7:
                        this.f1528c = obtainStyledAttributes.getFloat(index, this.f1528c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1530d);
                        this.f1530d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1530d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1532e);
                        this.f1532e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1532e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1534f);
                        this.f1534f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1534f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1536g);
                        this.f1536g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1536g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1538h);
                        this.f1538h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1538h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1540i);
                        this.f1540i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1540i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1542j);
                        this.f1542j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1542j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1544k);
                        this.f1544k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1544k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1546l);
                        this.f1546l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1546l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1554p);
                        this.f1554p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1554p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1555q);
                        this.f1555q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1555q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1556r);
                        this.f1556r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1556r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1557s);
                        this.f1557s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1557s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 21:
                        this.f1558t = obtainStyledAttributes.getDimensionPixelSize(index, this.f1558t);
                        continue;
                    case 22:
                        this.f1559u = obtainStyledAttributes.getDimensionPixelSize(index, this.f1559u);
                        continue;
                    case 23:
                        this.f1560v = obtainStyledAttributes.getDimensionPixelSize(index, this.f1560v);
                        continue;
                    case 24:
                        this.f1561w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1561w);
                        continue;
                    case 25:
                        this.f1562x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1562x);
                        continue;
                    case 26:
                        this.f1563y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1563y);
                        continue;
                    case 27:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        continue;
                    case 28:
                        this.U = obtainStyledAttributes.getBoolean(index, this.U);
                        continue;
                    case 29:
                        this.f1564z = obtainStyledAttributes.getFloat(index, this.f1564z);
                        continue;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        continue;
                    case 31:
                        int i9 = obtainStyledAttributes.getInt(index, 0);
                        this.I = i9;
                        if (i9 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i10 = obtainStyledAttributes.getInt(index, 0);
                        this.J = i10;
                        if (i10 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        continue;
                    case 36:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.P));
                        this.J = 2;
                        continue;
                    default:
                        switch (i8) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = Float.NaN;
                                this.D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i6 = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.D = 1;
                                        }
                                        i6 = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.B.substring(i6, indexOf2);
                                        String substring3 = this.B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat2 = Float.parseFloat(substring2);
                                                float parseFloat3 = Float.parseFloat(substring3);
                                                parseFloat = (parseFloat2 > 0.0f && parseFloat3 > 0.0f) ? this.D == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3) : parseFloat;
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.B.substring(i6);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            parseFloat = Float.parseFloat(substring4);
                                        }
                                    }
                                    this.C = parseFloat;
                                    break;
                                } else {
                                    break;
                                }
                            case 45:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                break;
                            case 46:
                                this.F = obtainStyledAttributes.getFloat(index, this.F);
                                break;
                            case 47:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.H = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                break;
                            case 50:
                                this.R = obtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                                break;
                            case 51:
                                this.V = obtainStyledAttributes.getString(index);
                                continue;
                        }
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1524a = -1;
            this.f1526b = -1;
            this.f1528c = -1.0f;
            this.f1530d = -1;
            this.f1532e = -1;
            this.f1534f = -1;
            this.f1536g = -1;
            this.f1538h = -1;
            this.f1540i = -1;
            this.f1542j = -1;
            this.f1544k = -1;
            this.f1546l = -1;
            this.f1548m = -1;
            this.f1550n = 0;
            this.f1552o = 0.0f;
            this.f1554p = -1;
            this.f1555q = -1;
            this.f1556r = -1;
            this.f1557s = -1;
            this.f1558t = -1;
            this.f1559u = -1;
            this.f1560v = -1;
            this.f1561w = -1;
            this.f1562x = -1;
            this.f1563y = -1;
            this.f1564z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.f1525a0 = false;
            this.f1527b0 = false;
            this.f1529c0 = false;
            this.f1531d0 = -1;
            this.f1533e0 = -1;
            this.f1535f0 = -1;
            this.f1537g0 = -1;
            this.f1539h0 = -1;
            this.f1541i0 = -1;
            this.f1543j0 = 0.5f;
            this.f1551n0 = new p.e();
            this.f1553o0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements b.InterfaceC0132b {

        /* renamed from: a, reason: collision with root package name */
        ConstraintLayout f1566a;

        /* renamed from: b, reason: collision with root package name */
        int f1567b;

        /* renamed from: c, reason: collision with root package name */
        int f1568c;

        /* renamed from: d, reason: collision with root package name */
        int f1569d;

        /* renamed from: e, reason: collision with root package name */
        int f1570e;

        /* renamed from: f, reason: collision with root package name */
        int f1571f;

        /* renamed from: g, reason: collision with root package name */
        int f1572g;

        public c(ConstraintLayout constraintLayout) {
            this.f1566a = constraintLayout;
        }

        @Override // q.b.InterfaceC0132b
        public final void a() {
            int childCount = this.f1566a.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                this.f1566a.getChildAt(i6);
            }
            int size = this.f1566a.f1501b.size();
            if (size > 0) {
                for (int i7 = 0; i7 < size; i7++) {
                    ((androidx.constraintlayout.widget.b) this.f1566a.f1501b.get(i7)).j(this.f1566a);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x01f0 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0208 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0214  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x01fd A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:117:0x01e3  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0166 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0230  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0237  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0245  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x024a  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0247  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0232  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x019e  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01b5  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01cc  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01e8  */
        @Override // q.b.InterfaceC0132b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(p.e r20, q.b.a r21) {
            /*
                Method dump skipped, instructions count: 607
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c.b(p.e, q.b$a):void");
        }

        public void c(int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f1567b = i8;
            this.f1568c = i9;
            this.f1569d = i10;
            this.f1570e = i11;
            this.f1571f = i6;
            this.f1572g = i7;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1500a = new SparseArray();
        this.f1501b = new ArrayList(4);
        this.f1502c = new p.f();
        this.f1503d = 0;
        this.f1504e = 0;
        this.f1505f = Integer.MAX_VALUE;
        this.f1506g = Integer.MAX_VALUE;
        this.f1507h = true;
        this.f1508i = 263;
        this.f1509j = null;
        this.f1510k = null;
        this.f1511l = -1;
        this.f1512m = new HashMap();
        this.f1513n = -1;
        this.f1514o = -1;
        this.f1515p = -1;
        this.f1516q = -1;
        this.f1517r = 0;
        this.f1518s = 0;
        this.f1519t = new SparseArray();
        this.f1520u = new c(this);
        this.f1521v = 0;
        this.f1522w = 0;
        j(attributeSet, 0, 0);
    }

    private final p.e g(int i6) {
        if (i6 == 0) {
            return this.f1502c;
        }
        View view = (View) this.f1500a.get(i6);
        if (view == null && (view = findViewById(i6)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f1502c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f1551n0;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    private void j(AttributeSet attributeSet, int i6, int i7) {
        this.f1502c.c0(this);
        this.f1502c.f1(this.f1520u);
        this.f1500a.put(getId(), this);
        this.f1509j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f1690a1, i6, i7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == h.f1760k1) {
                    this.f1503d = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1503d);
                } else if (index == h.f1767l1) {
                    this.f1504e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1504e);
                } else if (index == h.f1746i1) {
                    this.f1505f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1505f);
                } else if (index == h.f1753j1) {
                    this.f1506g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1506g);
                } else if (index == h.L2) {
                    this.f1508i = obtainStyledAttributes.getInt(index, this.f1508i);
                } else if (index == h.M1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1510k = null;
                        }
                    }
                } else if (index == h.f1815s1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.f1509j = dVar;
                        dVar.k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1509j = null;
                    }
                    this.f1511l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1502c.g1(this.f1508i);
    }

    private void l() {
        this.f1507h = true;
        this.f1513n = -1;
        this.f1514o = -1;
        this.f1515p = -1;
        this.f1516q = -1;
        this.f1517r = 0;
        this.f1518s = 0;
    }

    private void p() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            p.e i7 = i(getChildAt(i6));
            if (i7 != null) {
                i7.Y();
            }
        }
        if (isInEditMode) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    g(childAt.getId()).d0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f1511l != -1) {
            for (int i9 = 0; i9 < childCount; i9++) {
                getChildAt(i9).getId();
                int i10 = this.f1511l;
            }
        }
        d dVar = this.f1509j;
        if (dVar != null) {
            dVar.d(this, true);
        }
        this.f1502c.M0();
        int size = this.f1501b.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                ((androidx.constraintlayout.widget.b) this.f1501b.get(i11)).l(this);
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12);
        }
        this.f1519t.clear();
        this.f1519t.put(0, this.f1502c);
        this.f1519t.put(getId(), this.f1502c);
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            this.f1519t.put(childAt2.getId(), i(childAt2));
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt3 = getChildAt(i14);
            p.e i15 = i(childAt3);
            if (i15 != null) {
                b bVar = (b) childAt3.getLayoutParams();
                this.f1502c.c(i15);
                c(isInEditMode, childAt3, i15, bVar, this.f1519t);
            }
        }
    }

    private boolean s() {
        int childCount = getChildCount();
        boolean z5 = false;
        int i6 = 0;
        while (true) {
            if (i6 >= childCount) {
                break;
            }
            if (getChildAt(i6).isLayoutRequested()) {
                z5 = true;
                break;
            }
            i6++;
        }
        if (z5) {
            p();
        }
        return z5;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i6, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void c(boolean r19, android.view.View r20, p.e r21, androidx.constraintlayout.widget.ConstraintLayout.b r22, android.util.SparseArray r23) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c(boolean, android.view.View, p.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1501b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((androidx.constraintlayout.widget.b) this.f1501b.get(i6)).k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i8 = (int) ((parseInt / 1080.0f) * width);
                        int i9 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f6 = i8;
                        float f7 = i9;
                        float f8 = i8 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f6, f7, f8, f7, paint);
                        float parseInt4 = i9 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f8, f7, f8, parseInt4, paint);
                        canvas.drawLine(f8, parseInt4, f6, parseInt4, paint);
                        canvas.drawLine(f6, parseInt4, f6, f7, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f6, f7, f8, parseInt4, paint);
                        canvas.drawLine(f6, parseInt4, f8, f7, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i6, Object obj) {
        if (i6 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap hashMap = this.f1512m;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f1512m.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        l();
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.f1506g;
    }

    public int getMaxWidth() {
        return this.f1505f;
    }

    public int getMinHeight() {
        return this.f1504e;
    }

    public int getMinWidth() {
        return this.f1503d;
    }

    public int getOptimizationLevel() {
        return this.f1502c.V0();
    }

    public View h(int i6) {
        return (View) this.f1500a.get(i6);
    }

    public final p.e i(View view) {
        if (view == this) {
            return this.f1502c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f1551n0;
    }

    protected boolean k() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    protected void m(int i6) {
        this.f1510k = new androidx.constraintlayout.widget.c(getContext(), this, i6);
    }

    protected void n(int i6, int i7, int i8, int i9, boolean z5, boolean z6) {
        c cVar = this.f1520u;
        int i10 = cVar.f1570e;
        int resolveSizeAndState = View.resolveSizeAndState(i8 + cVar.f1569d, i6, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i9 + i10, i7, 0) & 16777215;
        int min = Math.min(this.f1505f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1506g, resolveSizeAndState2);
        if (z5) {
            min |= 16777216;
        }
        if (z6) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f1513n = min;
        this.f1514o = min2;
    }

    protected void o(p.f fVar, int i6, int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i9 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f1520u.c(i7, i8, max, max2, paddingWidth, i9);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? k() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i10 = size - paddingWidth;
        int i11 = size2 - i9;
        r(fVar, mode, i10, mode2, i11);
        fVar.c1(i6, mode, i10, mode2, i11, this.f1513n, this.f1514o, max5, max);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            b bVar = (b) childAt.getLayoutParams();
            p.e eVar = bVar.f1551n0;
            if ((childAt.getVisibility() != 8 || bVar.Z || bVar.f1525a0 || bVar.f1529c0 || isInEditMode) && !bVar.f1527b0) {
                int Q = eVar.Q();
                int R = eVar.R();
                childAt.layout(Q, R, eVar.P() + Q, eVar.v() + R);
            }
        }
        int size = this.f1501b.size();
        if (size > 0) {
            for (int i11 = 0; i11 < size; i11++) {
                ((androidx.constraintlayout.widget.b) this.f1501b.get(i11)).i(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i6, int i7) {
        this.f1521v = i6;
        this.f1522w = i7;
        this.f1502c.h1(k());
        if (this.f1507h) {
            this.f1507h = false;
            if (s()) {
                this.f1502c.j1();
            }
        }
        o(this.f1502c, this.f1508i, i6, i7);
        n(i6, i7, this.f1502c.P(), this.f1502c.v(), this.f1502c.b1(), this.f1502c.Z0());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        p.e i6 = i(view);
        if ((view instanceof f) && !(i6 instanceof p.h)) {
            b bVar = (b) view.getLayoutParams();
            p.h hVar = new p.h();
            bVar.f1551n0 = hVar;
            bVar.Z = true;
            hVar.R0(bVar.S);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.m();
            ((b) view.getLayoutParams()).f1525a0 = true;
            if (!this.f1501b.contains(bVar2)) {
                this.f1501b.add(bVar2);
            }
        }
        this.f1500a.put(view.getId(), view);
        this.f1507h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1500a.remove(view.getId());
        this.f1502c.L0(i(view));
        this.f1501b.remove(view);
        this.f1507h = true;
    }

    public void q(int i6, Object obj, Object obj2) {
        if (i6 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1512m == null) {
                this.f1512m = new HashMap();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1512m.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r3 == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        r12 = java.lang.Math.max(0, r7.f1504e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r3 == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0025, code lost:
    
        if (r3 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002c, code lost:
    
        r10 = java.lang.Math.max(0, r7.f1503d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002a, code lost:
    
        if (r3 == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void r(p.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.f1520u
            int r1 = r0.f1570e
            int r0 = r0.f1569d
            p.e$b r2 = p.e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L28
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = 0
            goto L32
        L1a:
            int r9 = r7.f1505f
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L32
        L23:
            p.e$b r9 = p.e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            goto L2c
        L28:
            p.e$b r9 = p.e.b.WRAP_CONTENT
            if (r3 != 0) goto L32
        L2c:
            int r10 = r7.f1503d
            int r10 = java.lang.Math.max(r6, r10)
        L32:
            if (r11 == r5) goto L47
            if (r11 == 0) goto L42
            if (r11 == r4) goto L3a
        L38:
            r12 = 0
            goto L51
        L3a:
            int r11 = r7.f1506g
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L51
        L42:
            p.e$b r2 = p.e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            goto L4b
        L47:
            p.e$b r2 = p.e.b.WRAP_CONTENT
            if (r3 != 0) goto L51
        L4b:
            int r11 = r7.f1504e
            int r12 = java.lang.Math.max(r6, r11)
        L51:
            int r11 = r8.P()
            if (r10 != r11) goto L5d
            int r11 = r8.v()
            if (r12 == r11) goto L60
        L5d:
            r8.Y0()
        L60:
            r8.F0(r6)
            r8.G0(r6)
            int r11 = r7.f1505f
            int r11 = r11 - r0
            r8.s0(r11)
            int r11 = r7.f1506g
            int r11 = r11 - r1
            r8.r0(r11)
            r8.u0(r6)
            r8.t0(r6)
            r8.l0(r9)
            r8.E0(r10)
            r8.A0(r2)
            r8.h0(r12)
            int r9 = r7.f1503d
            int r9 = r9 - r0
            r8.u0(r9)
            int r9 = r7.f1504e
            int r9 = r9 - r1
            r8.t0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.r(p.f, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public void setConstraintSet(d dVar) {
        this.f1509j = dVar;
    }

    @Override // android.view.View
    public void setId(int i6) {
        this.f1500a.remove(getId());
        super.setId(i6);
        this.f1500a.put(getId(), this);
    }

    public void setMaxHeight(int i6) {
        if (i6 == this.f1506g) {
            return;
        }
        this.f1506g = i6;
        requestLayout();
    }

    public void setMaxWidth(int i6) {
        if (i6 == this.f1505f) {
            return;
        }
        this.f1505f = i6;
        requestLayout();
    }

    public void setMinHeight(int i6) {
        if (i6 == this.f1504e) {
            return;
        }
        this.f1504e = i6;
        requestLayout();
    }

    public void setMinWidth(int i6) {
        if (i6 == this.f1503d) {
            return;
        }
        this.f1503d = i6;
        requestLayout();
    }

    public void setOnConstraintsChanged(e eVar) {
        androidx.constraintlayout.widget.c cVar = this.f1510k;
        if (cVar != null) {
            cVar.c(eVar);
        }
    }

    public void setOptimizationLevel(int i6) {
        this.f1508i = i6;
        this.f1502c.g1(i6);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f1500a = new SparseArray();
        this.f1501b = new ArrayList(4);
        this.f1502c = new p.f();
        this.f1503d = 0;
        this.f1504e = 0;
        this.f1505f = Integer.MAX_VALUE;
        this.f1506g = Integer.MAX_VALUE;
        this.f1507h = true;
        this.f1508i = 263;
        this.f1509j = null;
        this.f1510k = null;
        this.f1511l = -1;
        this.f1512m = new HashMap();
        this.f1513n = -1;
        this.f1514o = -1;
        this.f1515p = -1;
        this.f1516q = -1;
        this.f1517r = 0;
        this.f1518s = 0;
        this.f1519t = new SparseArray();
        this.f1520u = new c(this);
        this.f1521v = 0;
        this.f1522w = 0;
        j(attributeSet, i6, 0);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }
}
