package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import t3.b0;

/* loaded from: classes.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f1613d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    private static SparseIntArray f1614e;

    /* renamed from: a, reason: collision with root package name */
    private HashMap f1615a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private boolean f1616b = true;

    /* renamed from: c, reason: collision with root package name */
    private HashMap f1617c = new HashMap();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f1618a;

        /* renamed from: b, reason: collision with root package name */
        public final C0022d f1619b = new C0022d();

        /* renamed from: c, reason: collision with root package name */
        public final c f1620c = new c();

        /* renamed from: d, reason: collision with root package name */
        public final b f1621d = new b();

        /* renamed from: e, reason: collision with root package name */
        public final e f1622e = new e();

        /* renamed from: f, reason: collision with root package name */
        public HashMap f1623f = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i6, ConstraintLayout.b bVar) {
            this.f1618a = i6;
            b bVar2 = this.f1621d;
            bVar2.f1639h = bVar.f1530d;
            bVar2.f1641i = bVar.f1532e;
            bVar2.f1643j = bVar.f1534f;
            bVar2.f1645k = bVar.f1536g;
            bVar2.f1646l = bVar.f1538h;
            bVar2.f1647m = bVar.f1540i;
            bVar2.f1648n = bVar.f1542j;
            bVar2.f1649o = bVar.f1544k;
            bVar2.f1650p = bVar.f1546l;
            bVar2.f1651q = bVar.f1554p;
            bVar2.f1652r = bVar.f1555q;
            bVar2.f1653s = bVar.f1556r;
            bVar2.f1654t = bVar.f1557s;
            bVar2.f1655u = bVar.f1564z;
            bVar2.f1656v = bVar.A;
            bVar2.f1657w = bVar.B;
            bVar2.f1658x = bVar.f1548m;
            bVar2.f1659y = bVar.f1550n;
            bVar2.f1660z = bVar.f1552o;
            bVar2.A = bVar.Q;
            bVar2.B = bVar.R;
            bVar2.C = bVar.S;
            bVar2.f1637g = bVar.f1528c;
            bVar2.f1633e = bVar.f1524a;
            bVar2.f1635f = bVar.f1526b;
            bVar2.f1629c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f1631d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.D = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.E = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.F = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.G = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.P = bVar.F;
            bVar2.Q = bVar.E;
            bVar2.S = bVar.H;
            bVar2.R = bVar.G;
            bVar2.f1640h0 = bVar.T;
            bVar2.f1642i0 = bVar.U;
            bVar2.T = bVar.I;
            bVar2.U = bVar.J;
            bVar2.V = bVar.M;
            bVar2.W = bVar.N;
            bVar2.X = bVar.K;
            bVar2.Y = bVar.L;
            bVar2.Z = bVar.O;
            bVar2.f1626a0 = bVar.P;
            bVar2.f1638g0 = bVar.V;
            bVar2.K = bVar.f1559u;
            bVar2.M = bVar.f1561w;
            bVar2.J = bVar.f1558t;
            bVar2.L = bVar.f1560v;
            bVar2.O = bVar.f1562x;
            bVar2.N = bVar.f1563y;
            bVar2.H = bVar.getMarginEnd();
            this.f1621d.I = bVar.getMarginStart();
        }

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f1621d;
            bVar.f1530d = bVar2.f1639h;
            bVar.f1532e = bVar2.f1641i;
            bVar.f1534f = bVar2.f1643j;
            bVar.f1536g = bVar2.f1645k;
            bVar.f1538h = bVar2.f1646l;
            bVar.f1540i = bVar2.f1647m;
            bVar.f1542j = bVar2.f1648n;
            bVar.f1544k = bVar2.f1649o;
            bVar.f1546l = bVar2.f1650p;
            bVar.f1554p = bVar2.f1651q;
            bVar.f1555q = bVar2.f1652r;
            bVar.f1556r = bVar2.f1653s;
            bVar.f1557s = bVar2.f1654t;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.D;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.E;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.F;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.G;
            bVar.f1562x = bVar2.O;
            bVar.f1563y = bVar2.N;
            bVar.f1559u = bVar2.K;
            bVar.f1561w = bVar2.M;
            bVar.f1564z = bVar2.f1655u;
            bVar.A = bVar2.f1656v;
            bVar.f1548m = bVar2.f1658x;
            bVar.f1550n = bVar2.f1659y;
            bVar.f1552o = bVar2.f1660z;
            bVar.B = bVar2.f1657w;
            bVar.Q = bVar2.A;
            bVar.R = bVar2.B;
            bVar.F = bVar2.P;
            bVar.E = bVar2.Q;
            bVar.H = bVar2.S;
            bVar.G = bVar2.R;
            bVar.T = bVar2.f1640h0;
            bVar.U = bVar2.f1642i0;
            bVar.I = bVar2.T;
            bVar.J = bVar2.U;
            bVar.M = bVar2.V;
            bVar.N = bVar2.W;
            bVar.K = bVar2.X;
            bVar.L = bVar2.Y;
            bVar.O = bVar2.Z;
            bVar.P = bVar2.f1626a0;
            bVar.S = bVar2.C;
            bVar.f1528c = bVar2.f1637g;
            bVar.f1524a = bVar2.f1633e;
            bVar.f1526b = bVar2.f1635f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f1629c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f1631d;
            String str = bVar2.f1638g0;
            if (str != null) {
                bVar.V = str;
            }
            bVar.setMarginStart(bVar2.I);
            bVar.setMarginEnd(this.f1621d.H);
            bVar.a();
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f1621d.a(this.f1621d);
            aVar.f1620c.a(this.f1620c);
            aVar.f1619b.a(this.f1619b);
            aVar.f1622e.a(this.f1622e);
            aVar.f1618a = this.f1618a;
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: k0, reason: collision with root package name */
        private static SparseIntArray f1624k0;

        /* renamed from: c, reason: collision with root package name */
        public int f1629c;

        /* renamed from: d, reason: collision with root package name */
        public int f1631d;

        /* renamed from: e0, reason: collision with root package name */
        public int[] f1634e0;

        /* renamed from: f0, reason: collision with root package name */
        public String f1636f0;

        /* renamed from: g0, reason: collision with root package name */
        public String f1638g0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f1625a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1627b = false;

        /* renamed from: e, reason: collision with root package name */
        public int f1633e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f1635f = -1;

        /* renamed from: g, reason: collision with root package name */
        public float f1637g = -1.0f;

        /* renamed from: h, reason: collision with root package name */
        public int f1639h = -1;

        /* renamed from: i, reason: collision with root package name */
        public int f1641i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f1643j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f1645k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f1646l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f1647m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f1648n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f1649o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f1650p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f1651q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f1652r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f1653s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f1654t = -1;

        /* renamed from: u, reason: collision with root package name */
        public float f1655u = 0.5f;

        /* renamed from: v, reason: collision with root package name */
        public float f1656v = 0.5f;

        /* renamed from: w, reason: collision with root package name */
        public String f1657w = null;

        /* renamed from: x, reason: collision with root package name */
        public int f1658x = -1;

        /* renamed from: y, reason: collision with root package name */
        public int f1659y = 0;

        /* renamed from: z, reason: collision with root package name */
        public float f1660z = 0.0f;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public float P = -1.0f;
        public float Q = -1.0f;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public float Z = 1.0f;

        /* renamed from: a0, reason: collision with root package name */
        public float f1626a0 = 1.0f;

        /* renamed from: b0, reason: collision with root package name */
        public int f1628b0 = -1;

        /* renamed from: c0, reason: collision with root package name */
        public int f1630c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f1632d0 = -1;

        /* renamed from: h0, reason: collision with root package name */
        public boolean f1640h0 = false;

        /* renamed from: i0, reason: collision with root package name */
        public boolean f1642i0 = false;

        /* renamed from: j0, reason: collision with root package name */
        public boolean f1644j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1624k0 = sparseIntArray;
            sparseIntArray.append(h.R3, 24);
            f1624k0.append(h.S3, 25);
            f1624k0.append(h.U3, 28);
            f1624k0.append(h.V3, 29);
            f1624k0.append(h.f1693a4, 35);
            f1624k0.append(h.Z3, 34);
            f1624k0.append(h.C3, 4);
            f1624k0.append(h.B3, 3);
            f1624k0.append(h.f1859z3, 1);
            f1624k0.append(h.f1728f4, 6);
            f1624k0.append(h.f1735g4, 7);
            f1624k0.append(h.J3, 17);
            f1624k0.append(h.K3, 18);
            f1624k0.append(h.L3, 19);
            f1624k0.append(h.f1762k3, 26);
            f1624k0.append(h.W3, 31);
            f1624k0.append(h.X3, 32);
            f1624k0.append(h.I3, 10);
            f1624k0.append(h.H3, 9);
            f1624k0.append(h.f1756j4, 13);
            f1624k0.append(h.f1777m4, 16);
            f1624k0.append(h.f1763k4, 14);
            f1624k0.append(h.f1742h4, 11);
            f1624k0.append(h.f1770l4, 15);
            f1624k0.append(h.f1749i4, 12);
            f1624k0.append(h.f1714d4, 38);
            f1624k0.append(h.P3, 37);
            f1624k0.append(h.O3, 39);
            f1624k0.append(h.f1707c4, 40);
            f1624k0.append(h.N3, 20);
            f1624k0.append(h.f1700b4, 36);
            f1624k0.append(h.G3, 5);
            f1624k0.append(h.Q3, 76);
            f1624k0.append(h.Y3, 76);
            f1624k0.append(h.T3, 76);
            f1624k0.append(h.A3, 76);
            f1624k0.append(h.f1853y3, 76);
            f1624k0.append(h.f1783n3, 23);
            f1624k0.append(h.f1797p3, 27);
            f1624k0.append(h.f1811r3, 30);
            f1624k0.append(h.f1817s3, 8);
            f1624k0.append(h.f1790o3, 33);
            f1624k0.append(h.f1804q3, 2);
            f1624k0.append(h.f1769l3, 22);
            f1624k0.append(h.f1776m3, 21);
            f1624k0.append(h.D3, 61);
            f1624k0.append(h.F3, 62);
            f1624k0.append(h.E3, 63);
            f1624k0.append(h.f1721e4, 69);
            f1624k0.append(h.M3, 70);
            f1624k0.append(h.f1841w3, 71);
            f1624k0.append(h.f1829u3, 72);
            f1624k0.append(h.f1835v3, 73);
            f1624k0.append(h.f1847x3, 74);
            f1624k0.append(h.f1823t3, 75);
        }

        public void a(b bVar) {
            this.f1625a = bVar.f1625a;
            this.f1629c = bVar.f1629c;
            this.f1627b = bVar.f1627b;
            this.f1631d = bVar.f1631d;
            this.f1633e = bVar.f1633e;
            this.f1635f = bVar.f1635f;
            this.f1637g = bVar.f1637g;
            this.f1639h = bVar.f1639h;
            this.f1641i = bVar.f1641i;
            this.f1643j = bVar.f1643j;
            this.f1645k = bVar.f1645k;
            this.f1646l = bVar.f1646l;
            this.f1647m = bVar.f1647m;
            this.f1648n = bVar.f1648n;
            this.f1649o = bVar.f1649o;
            this.f1650p = bVar.f1650p;
            this.f1651q = bVar.f1651q;
            this.f1652r = bVar.f1652r;
            this.f1653s = bVar.f1653s;
            this.f1654t = bVar.f1654t;
            this.f1655u = bVar.f1655u;
            this.f1656v = bVar.f1656v;
            this.f1657w = bVar.f1657w;
            this.f1658x = bVar.f1658x;
            this.f1659y = bVar.f1659y;
            this.f1660z = bVar.f1660z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f1626a0 = bVar.f1626a0;
            this.f1628b0 = bVar.f1628b0;
            this.f1630c0 = bVar.f1630c0;
            this.f1632d0 = bVar.f1632d0;
            this.f1638g0 = bVar.f1638g0;
            int[] iArr = bVar.f1634e0;
            if (iArr != null) {
                this.f1634e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f1634e0 = null;
            }
            this.f1636f0 = bVar.f1636f0;
            this.f1640h0 = bVar.f1640h0;
            this.f1642i0 = bVar.f1642i0;
            this.f1644j0 = bVar.f1644j0;
        }

        void b(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f1755j3);
            this.f1627b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                int i7 = f1624k0.get(index);
                if (i7 == 80) {
                    this.f1640h0 = obtainStyledAttributes.getBoolean(index, this.f1640h0);
                } else if (i7 != 81) {
                    switch (i7) {
                        case 1:
                            this.f1650p = d.m(obtainStyledAttributes, index, this.f1650p);
                            break;
                        case 2:
                            this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 3:
                            this.f1649o = d.m(obtainStyledAttributes, index, this.f1649o);
                            break;
                        case 4:
                            this.f1648n = d.m(obtainStyledAttributes, index, this.f1648n);
                            break;
                        case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                            this.f1657w = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                            break;
                        case 7:
                            this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            break;
                        case 8:
                            this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 9:
                            this.f1654t = d.m(obtainStyledAttributes, index, this.f1654t);
                            break;
                        case 10:
                            this.f1653s = d.m(obtainStyledAttributes, index, this.f1653s);
                            break;
                        case 11:
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case 12:
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 13:
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        case 14:
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 15:
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 16:
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 17:
                            this.f1633e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1633e);
                            break;
                        case 18:
                            this.f1635f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1635f);
                            break;
                        case 19:
                            this.f1637g = obtainStyledAttributes.getFloat(index, this.f1637g);
                            break;
                        case 20:
                            this.f1655u = obtainStyledAttributes.getFloat(index, this.f1655u);
                            break;
                        case 21:
                            this.f1631d = obtainStyledAttributes.getLayoutDimension(index, this.f1631d);
                            break;
                        case 22:
                            this.f1629c = obtainStyledAttributes.getLayoutDimension(index, this.f1629c);
                            break;
                        case 23:
                            this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            break;
                        case 24:
                            this.f1639h = d.m(obtainStyledAttributes, index, this.f1639h);
                            break;
                        case 25:
                            this.f1641i = d.m(obtainStyledAttributes, index, this.f1641i);
                            break;
                        case 26:
                            this.C = obtainStyledAttributes.getInt(index, this.C);
                            break;
                        case 27:
                            this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            break;
                        case 28:
                            this.f1643j = d.m(obtainStyledAttributes, index, this.f1643j);
                            break;
                        case 29:
                            this.f1645k = d.m(obtainStyledAttributes, index, this.f1645k);
                            break;
                        case 30:
                            this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            break;
                        case 31:
                            this.f1651q = d.m(obtainStyledAttributes, index, this.f1651q);
                            break;
                        case 32:
                            this.f1652r = d.m(obtainStyledAttributes, index, this.f1652r);
                            break;
                        case 33:
                            this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            break;
                        case 34:
                            this.f1647m = d.m(obtainStyledAttributes, index, this.f1647m);
                            break;
                        case 35:
                            this.f1646l = d.m(obtainStyledAttributes, index, this.f1646l);
                            break;
                        case 36:
                            this.f1656v = obtainStyledAttributes.getFloat(index, this.f1656v);
                            break;
                        case 37:
                            this.Q = obtainStyledAttributes.getFloat(index, this.Q);
                            break;
                        case 38:
                            this.P = obtainStyledAttributes.getFloat(index, this.P);
                            break;
                        case 39:
                            this.R = obtainStyledAttributes.getInt(index, this.R);
                            break;
                        case 40:
                            this.S = obtainStyledAttributes.getInt(index, this.S);
                            break;
                        default:
                            switch (i7) {
                                case 54:
                                    this.T = obtainStyledAttributes.getInt(index, this.T);
                                    break;
                                case 55:
                                    this.U = obtainStyledAttributes.getInt(index, this.U);
                                    break;
                                case 56:
                                    this.V = obtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                    break;
                                case 57:
                                    this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    break;
                                case 58:
                                    this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    break;
                                case 59:
                                    this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    break;
                                default:
                                    switch (i7) {
                                        case 61:
                                            this.f1658x = d.m(obtainStyledAttributes, index, this.f1658x);
                                            break;
                                        case 62:
                                            this.f1659y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1659y);
                                            break;
                                        case 63:
                                            this.f1660z = obtainStyledAttributes.getFloat(index, this.f1660z);
                                            break;
                                        default:
                                            switch (i7) {
                                                case 69:
                                                    this.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f1626a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.f1628b0 = obtainStyledAttributes.getInt(index, this.f1628b0);
                                                    continue;
                                                case 73:
                                                    this.f1630c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1630c0);
                                                    continue;
                                                case 74:
                                                    this.f1636f0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f1644j0 = obtainStyledAttributes.getBoolean(index, this.f1644j0);
                                                    continue;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    break;
                                                case 77:
                                                    this.f1638g0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    break;
                                            }
                                            sb.append(str);
                                            sb.append(Integer.toHexString(index));
                                            sb.append("   ");
                                            sb.append(f1624k0.get(index));
                                            Log.w("ConstraintSet", sb.toString());
                                            break;
                                    }
                            }
                    }
                } else {
                    this.f1642i0 = obtainStyledAttributes.getBoolean(index, this.f1642i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: h, reason: collision with root package name */
        private static SparseIntArray f1661h;

        /* renamed from: a, reason: collision with root package name */
        public boolean f1662a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f1663b = -1;

        /* renamed from: c, reason: collision with root package name */
        public String f1664c = null;

        /* renamed from: d, reason: collision with root package name */
        public int f1665d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f1666e = 0;

        /* renamed from: f, reason: collision with root package name */
        public float f1667f = Float.NaN;

        /* renamed from: g, reason: collision with root package name */
        public float f1668g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1661h = sparseIntArray;
            sparseIntArray.append(h.f1848x4, 1);
            f1661h.append(h.f1860z4, 2);
            f1661h.append(h.A4, 3);
            f1661h.append(h.f1842w4, 4);
            f1661h.append(h.f1836v4, 5);
            f1661h.append(h.f1854y4, 6);
        }

        public void a(c cVar) {
            this.f1662a = cVar.f1662a;
            this.f1663b = cVar.f1663b;
            this.f1664c = cVar.f1664c;
            this.f1665d = cVar.f1665d;
            this.f1666e = cVar.f1666e;
            this.f1668g = cVar.f1668g;
            this.f1667f = cVar.f1667f;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f1830u4);
            this.f1662a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                switch (f1661h.get(index)) {
                    case 1:
                        this.f1668g = obtainStyledAttributes.getFloat(index, this.f1668g);
                        break;
                    case 2:
                        this.f1665d = obtainStyledAttributes.getInt(index, this.f1665d);
                        break;
                    case 3:
                        this.f1664c = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : m.a.f7414c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f1666e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                        this.f1663b = d.m(obtainStyledAttributes, index, this.f1663b);
                        break;
                    case 6:
                        this.f1667f = obtainStyledAttributes.getFloat(index, this.f1667f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0022d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1669a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f1670b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f1671c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f1672d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f1673e = Float.NaN;

        public void a(C0022d c0022d) {
            this.f1669a = c0022d.f1669a;
            this.f1670b = c0022d.f1670b;
            this.f1672d = c0022d.f1672d;
            this.f1673e = c0022d.f1673e;
            this.f1671c = c0022d.f1671c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.J4);
            this.f1669a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == h.L4) {
                    this.f1672d = obtainStyledAttributes.getFloat(index, this.f1672d);
                } else if (index == h.K4) {
                    this.f1670b = obtainStyledAttributes.getInt(index, this.f1670b);
                    this.f1670b = d.f1613d[this.f1670b];
                } else if (index == h.N4) {
                    this.f1671c = obtainStyledAttributes.getInt(index, this.f1671c);
                } else if (index == h.M4) {
                    this.f1673e = obtainStyledAttributes.getFloat(index, this.f1673e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: n, reason: collision with root package name */
        private static SparseIntArray f1674n;

        /* renamed from: a, reason: collision with root package name */
        public boolean f1675a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f1676b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f1677c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f1678d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f1679e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f1680f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f1681g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f1682h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public float f1683i = 0.0f;

        /* renamed from: j, reason: collision with root package name */
        public float f1684j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f1685k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public boolean f1686l = false;

        /* renamed from: m, reason: collision with root package name */
        public float f1687m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1674n = sparseIntArray;
            sparseIntArray.append(h.f1743h5, 1);
            f1674n.append(h.f1750i5, 2);
            f1674n.append(h.f1757j5, 3);
            f1674n.append(h.f1729f5, 4);
            f1674n.append(h.f1736g5, 5);
            f1674n.append(h.f1701b5, 6);
            f1674n.append(h.f1708c5, 7);
            f1674n.append(h.f1715d5, 8);
            f1674n.append(h.f1722e5, 9);
            f1674n.append(h.f1764k5, 10);
            f1674n.append(h.f1771l5, 11);
        }

        public void a(e eVar) {
            this.f1675a = eVar.f1675a;
            this.f1676b = eVar.f1676b;
            this.f1677c = eVar.f1677c;
            this.f1678d = eVar.f1678d;
            this.f1679e = eVar.f1679e;
            this.f1680f = eVar.f1680f;
            this.f1681g = eVar.f1681g;
            this.f1682h = eVar.f1682h;
            this.f1683i = eVar.f1683i;
            this.f1684j = eVar.f1684j;
            this.f1685k = eVar.f1685k;
            this.f1686l = eVar.f1686l;
            this.f1687m = eVar.f1687m;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f1694a5);
            this.f1675a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                switch (f1674n.get(index)) {
                    case 1:
                        this.f1676b = obtainStyledAttributes.getFloat(index, this.f1676b);
                        break;
                    case 2:
                        this.f1677c = obtainStyledAttributes.getFloat(index, this.f1677c);
                        break;
                    case 3:
                        this.f1678d = obtainStyledAttributes.getFloat(index, this.f1678d);
                        break;
                    case 4:
                        this.f1679e = obtainStyledAttributes.getFloat(index, this.f1679e);
                        break;
                    case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                        this.f1680f = obtainStyledAttributes.getFloat(index, this.f1680f);
                        break;
                    case 6:
                        this.f1681g = obtainStyledAttributes.getDimension(index, this.f1681g);
                        break;
                    case 7:
                        this.f1682h = obtainStyledAttributes.getDimension(index, this.f1682h);
                        break;
                    case 8:
                        this.f1683i = obtainStyledAttributes.getDimension(index, this.f1683i);
                        break;
                    case 9:
                        this.f1684j = obtainStyledAttributes.getDimension(index, this.f1684j);
                        break;
                    case 10:
                        this.f1685k = obtainStyledAttributes.getDimension(index, this.f1685k);
                        break;
                    case 11:
                        this.f1686l = true;
                        this.f1687m = obtainStyledAttributes.getDimension(index, this.f1687m);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1614e = sparseIntArray;
        sparseIntArray.append(h.f1826u0, 25);
        f1614e.append(h.f1832v0, 26);
        f1614e.append(h.f1844x0, 29);
        f1614e.append(h.f1850y0, 30);
        f1614e.append(h.E0, 36);
        f1614e.append(h.D0, 35);
        f1614e.append(h.f1703c0, 4);
        f1614e.append(h.f1696b0, 3);
        f1614e.append(h.Z, 1);
        f1614e.append(h.M0, 6);
        f1614e.append(h.N0, 7);
        f1614e.append(h.f1752j0, 17);
        f1614e.append(h.f1759k0, 18);
        f1614e.append(h.f1766l0, 19);
        f1614e.append(h.f1813s, 27);
        f1614e.append(h.f1856z0, 32);
        f1614e.append(h.A0, 33);
        f1614e.append(h.f1745i0, 10);
        f1614e.append(h.f1738h0, 9);
        f1614e.append(h.Q0, 13);
        f1614e.append(h.T0, 16);
        f1614e.append(h.R0, 14);
        f1614e.append(h.O0, 11);
        f1614e.append(h.S0, 15);
        f1614e.append(h.P0, 12);
        f1614e.append(h.H0, 40);
        f1614e.append(h.f1814s0, 39);
        f1614e.append(h.f1808r0, 41);
        f1614e.append(h.G0, 42);
        f1614e.append(h.f1801q0, 20);
        f1614e.append(h.F0, 37);
        f1614e.append(h.f1731g0, 5);
        f1614e.append(h.f1820t0, 82);
        f1614e.append(h.C0, 82);
        f1614e.append(h.f1838w0, 82);
        f1614e.append(h.f1689a0, 82);
        f1614e.append(h.Y, 82);
        f1614e.append(h.f1843x, 24);
        f1614e.append(h.f1855z, 28);
        f1614e.append(h.L, 31);
        f1614e.append(h.M, 8);
        f1614e.append(h.f1849y, 34);
        f1614e.append(h.A, 2);
        f1614e.append(h.f1831v, 23);
        f1614e.append(h.f1837w, 21);
        f1614e.append(h.f1825u, 22);
        f1614e.append(h.B, 43);
        f1614e.append(h.O, 44);
        f1614e.append(h.J, 45);
        f1614e.append(h.K, 46);
        f1614e.append(h.I, 60);
        f1614e.append(h.G, 47);
        f1614e.append(h.H, 48);
        f1614e.append(h.C, 49);
        f1614e.append(h.D, 50);
        f1614e.append(h.E, 51);
        f1614e.append(h.F, 52);
        f1614e.append(h.N, 53);
        f1614e.append(h.I0, 54);
        f1614e.append(h.f1773m0, 55);
        f1614e.append(h.J0, 56);
        f1614e.append(h.f1780n0, 57);
        f1614e.append(h.K0, 58);
        f1614e.append(h.f1787o0, 59);
        f1614e.append(h.f1710d0, 61);
        f1614e.append(h.f1724f0, 62);
        f1614e.append(h.f1717e0, 63);
        f1614e.append(h.P, 64);
        f1614e.append(h.X0, 65);
        f1614e.append(h.V, 66);
        f1614e.append(h.Y0, 67);
        f1614e.append(h.V0, 79);
        f1614e.append(h.f1819t, 38);
        f1614e.append(h.U0, 68);
        f1614e.append(h.L0, 69);
        f1614e.append(h.f1794p0, 70);
        f1614e.append(h.T, 71);
        f1614e.append(h.R, 72);
        f1614e.append(h.S, 73);
        f1614e.append(h.U, 74);
        f1614e.append(h.Q, 75);
        f1614e.append(h.W0, 76);
        f1614e.append(h.B0, 77);
        f1614e.append(h.Z0, 78);
        f1614e.append(h.X, 80);
        f1614e.append(h.W, 81);
    }

    private int[] h(View view, String str) {
        int i6;
        Object f6;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i7 = 0;
        int i8 = 0;
        while (i7 < split.length) {
            String trim = split[i7].trim();
            try {
                i6 = g.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i6 = 0;
            }
            if (i6 == 0) {
                i6 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i6 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (f6 = ((ConstraintLayout) view.getParent()).f(0, trim)) != null && (f6 instanceof Integer)) {
                i6 = ((Integer) f6).intValue();
            }
            iArr[i8] = i6;
            i7++;
            i8++;
        }
        return i8 != split.length ? Arrays.copyOf(iArr, i8) : iArr;
    }

    private a i(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f1807r);
        n(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a j(int i6) {
        if (!this.f1617c.containsKey(Integer.valueOf(i6))) {
            this.f1617c.put(Integer.valueOf(i6), new a());
        }
        return (a) this.f1617c.get(Integer.valueOf(i6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(TypedArray typedArray, int i6, int i7) {
        int resourceId = typedArray.getResourceId(i6, i7);
        return resourceId == -1 ? typedArray.getInt(i6, -1) : resourceId;
    }

    private void n(Context context, a aVar, TypedArray typedArray) {
        c cVar;
        String str;
        StringBuilder sb;
        String str2;
        int indexCount = typedArray.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = typedArray.getIndex(i6);
            if (index != h.f1819t && h.L != index && h.M != index) {
                aVar.f1620c.f1662a = true;
                aVar.f1621d.f1627b = true;
                aVar.f1619b.f1669a = true;
                aVar.f1622e.f1675a = true;
            }
            switch (f1614e.get(index)) {
                case 1:
                    b bVar = aVar.f1621d;
                    bVar.f1650p = m(typedArray, index, bVar.f1650p);
                    continue;
                case 2:
                    b bVar2 = aVar.f1621d;
                    bVar2.G = typedArray.getDimensionPixelSize(index, bVar2.G);
                    continue;
                case 3:
                    b bVar3 = aVar.f1621d;
                    bVar3.f1649o = m(typedArray, index, bVar3.f1649o);
                    continue;
                case 4:
                    b bVar4 = aVar.f1621d;
                    bVar4.f1648n = m(typedArray, index, bVar4.f1648n);
                    continue;
                case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    aVar.f1621d.f1657w = typedArray.getString(index);
                    continue;
                case 6:
                    b bVar5 = aVar.f1621d;
                    bVar5.A = typedArray.getDimensionPixelOffset(index, bVar5.A);
                    continue;
                case 7:
                    b bVar6 = aVar.f1621d;
                    bVar6.B = typedArray.getDimensionPixelOffset(index, bVar6.B);
                    continue;
                case 8:
                    b bVar7 = aVar.f1621d;
                    bVar7.H = typedArray.getDimensionPixelSize(index, bVar7.H);
                    continue;
                case 9:
                    b bVar8 = aVar.f1621d;
                    bVar8.f1654t = m(typedArray, index, bVar8.f1654t);
                    continue;
                case 10:
                    b bVar9 = aVar.f1621d;
                    bVar9.f1653s = m(typedArray, index, bVar9.f1653s);
                    continue;
                case 11:
                    b bVar10 = aVar.f1621d;
                    bVar10.M = typedArray.getDimensionPixelSize(index, bVar10.M);
                    continue;
                case 12:
                    b bVar11 = aVar.f1621d;
                    bVar11.N = typedArray.getDimensionPixelSize(index, bVar11.N);
                    continue;
                case 13:
                    b bVar12 = aVar.f1621d;
                    bVar12.J = typedArray.getDimensionPixelSize(index, bVar12.J);
                    continue;
                case 14:
                    b bVar13 = aVar.f1621d;
                    bVar13.L = typedArray.getDimensionPixelSize(index, bVar13.L);
                    continue;
                case 15:
                    b bVar14 = aVar.f1621d;
                    bVar14.O = typedArray.getDimensionPixelSize(index, bVar14.O);
                    continue;
                case 16:
                    b bVar15 = aVar.f1621d;
                    bVar15.K = typedArray.getDimensionPixelSize(index, bVar15.K);
                    continue;
                case 17:
                    b bVar16 = aVar.f1621d;
                    bVar16.f1633e = typedArray.getDimensionPixelOffset(index, bVar16.f1633e);
                    continue;
                case 18:
                    b bVar17 = aVar.f1621d;
                    bVar17.f1635f = typedArray.getDimensionPixelOffset(index, bVar17.f1635f);
                    continue;
                case 19:
                    b bVar18 = aVar.f1621d;
                    bVar18.f1637g = typedArray.getFloat(index, bVar18.f1637g);
                    continue;
                case 20:
                    b bVar19 = aVar.f1621d;
                    bVar19.f1655u = typedArray.getFloat(index, bVar19.f1655u);
                    continue;
                case 21:
                    b bVar20 = aVar.f1621d;
                    bVar20.f1631d = typedArray.getLayoutDimension(index, bVar20.f1631d);
                    continue;
                case 22:
                    C0022d c0022d = aVar.f1619b;
                    c0022d.f1670b = typedArray.getInt(index, c0022d.f1670b);
                    C0022d c0022d2 = aVar.f1619b;
                    c0022d2.f1670b = f1613d[c0022d2.f1670b];
                    continue;
                case 23:
                    b bVar21 = aVar.f1621d;
                    bVar21.f1629c = typedArray.getLayoutDimension(index, bVar21.f1629c);
                    continue;
                case 24:
                    b bVar22 = aVar.f1621d;
                    bVar22.D = typedArray.getDimensionPixelSize(index, bVar22.D);
                    continue;
                case 25:
                    b bVar23 = aVar.f1621d;
                    bVar23.f1639h = m(typedArray, index, bVar23.f1639h);
                    continue;
                case 26:
                    b bVar24 = aVar.f1621d;
                    bVar24.f1641i = m(typedArray, index, bVar24.f1641i);
                    continue;
                case 27:
                    b bVar25 = aVar.f1621d;
                    bVar25.C = typedArray.getInt(index, bVar25.C);
                    continue;
                case 28:
                    b bVar26 = aVar.f1621d;
                    bVar26.E = typedArray.getDimensionPixelSize(index, bVar26.E);
                    continue;
                case 29:
                    b bVar27 = aVar.f1621d;
                    bVar27.f1643j = m(typedArray, index, bVar27.f1643j);
                    continue;
                case 30:
                    b bVar28 = aVar.f1621d;
                    bVar28.f1645k = m(typedArray, index, bVar28.f1645k);
                    continue;
                case 31:
                    b bVar29 = aVar.f1621d;
                    bVar29.I = typedArray.getDimensionPixelSize(index, bVar29.I);
                    continue;
                case 32:
                    b bVar30 = aVar.f1621d;
                    bVar30.f1651q = m(typedArray, index, bVar30.f1651q);
                    continue;
                case 33:
                    b bVar31 = aVar.f1621d;
                    bVar31.f1652r = m(typedArray, index, bVar31.f1652r);
                    continue;
                case 34:
                    b bVar32 = aVar.f1621d;
                    bVar32.F = typedArray.getDimensionPixelSize(index, bVar32.F);
                    continue;
                case 35:
                    b bVar33 = aVar.f1621d;
                    bVar33.f1647m = m(typedArray, index, bVar33.f1647m);
                    continue;
                case 36:
                    b bVar34 = aVar.f1621d;
                    bVar34.f1646l = m(typedArray, index, bVar34.f1646l);
                    continue;
                case 37:
                    b bVar35 = aVar.f1621d;
                    bVar35.f1656v = typedArray.getFloat(index, bVar35.f1656v);
                    continue;
                case 38:
                    aVar.f1618a = typedArray.getResourceId(index, aVar.f1618a);
                    continue;
                case 39:
                    b bVar36 = aVar.f1621d;
                    bVar36.Q = typedArray.getFloat(index, bVar36.Q);
                    continue;
                case 40:
                    b bVar37 = aVar.f1621d;
                    bVar37.P = typedArray.getFloat(index, bVar37.P);
                    continue;
                case 41:
                    b bVar38 = aVar.f1621d;
                    bVar38.R = typedArray.getInt(index, bVar38.R);
                    continue;
                case 42:
                    b bVar39 = aVar.f1621d;
                    bVar39.S = typedArray.getInt(index, bVar39.S);
                    continue;
                case 43:
                    C0022d c0022d3 = aVar.f1619b;
                    c0022d3.f1672d = typedArray.getFloat(index, c0022d3.f1672d);
                    continue;
                case 44:
                    e eVar = aVar.f1622e;
                    eVar.f1686l = true;
                    eVar.f1687m = typedArray.getDimension(index, eVar.f1687m);
                    continue;
                case 45:
                    e eVar2 = aVar.f1622e;
                    eVar2.f1677c = typedArray.getFloat(index, eVar2.f1677c);
                    continue;
                case 46:
                    e eVar3 = aVar.f1622e;
                    eVar3.f1678d = typedArray.getFloat(index, eVar3.f1678d);
                    continue;
                case 47:
                    e eVar4 = aVar.f1622e;
                    eVar4.f1679e = typedArray.getFloat(index, eVar4.f1679e);
                    continue;
                case 48:
                    e eVar5 = aVar.f1622e;
                    eVar5.f1680f = typedArray.getFloat(index, eVar5.f1680f);
                    continue;
                case 49:
                    e eVar6 = aVar.f1622e;
                    eVar6.f1681g = typedArray.getDimension(index, eVar6.f1681g);
                    continue;
                case 50:
                    e eVar7 = aVar.f1622e;
                    eVar7.f1682h = typedArray.getDimension(index, eVar7.f1682h);
                    continue;
                case 51:
                    e eVar8 = aVar.f1622e;
                    eVar8.f1683i = typedArray.getDimension(index, eVar8.f1683i);
                    continue;
                case 52:
                    e eVar9 = aVar.f1622e;
                    eVar9.f1684j = typedArray.getDimension(index, eVar9.f1684j);
                    continue;
                case 53:
                    e eVar10 = aVar.f1622e;
                    eVar10.f1685k = typedArray.getDimension(index, eVar10.f1685k);
                    continue;
                case 54:
                    b bVar40 = aVar.f1621d;
                    bVar40.T = typedArray.getInt(index, bVar40.T);
                    continue;
                case 55:
                    b bVar41 = aVar.f1621d;
                    bVar41.U = typedArray.getInt(index, bVar41.U);
                    continue;
                case 56:
                    b bVar42 = aVar.f1621d;
                    bVar42.V = typedArray.getDimensionPixelSize(index, bVar42.V);
                    continue;
                case 57:
                    b bVar43 = aVar.f1621d;
                    bVar43.W = typedArray.getDimensionPixelSize(index, bVar43.W);
                    continue;
                case 58:
                    b bVar44 = aVar.f1621d;
                    bVar44.X = typedArray.getDimensionPixelSize(index, bVar44.X);
                    continue;
                case 59:
                    b bVar45 = aVar.f1621d;
                    bVar45.Y = typedArray.getDimensionPixelSize(index, bVar45.Y);
                    continue;
                case 60:
                    e eVar11 = aVar.f1622e;
                    eVar11.f1676b = typedArray.getFloat(index, eVar11.f1676b);
                    continue;
                case 61:
                    b bVar46 = aVar.f1621d;
                    bVar46.f1658x = m(typedArray, index, bVar46.f1658x);
                    continue;
                case 62:
                    b bVar47 = aVar.f1621d;
                    bVar47.f1659y = typedArray.getDimensionPixelSize(index, bVar47.f1659y);
                    continue;
                case 63:
                    b bVar48 = aVar.f1621d;
                    bVar48.f1660z = typedArray.getFloat(index, bVar48.f1660z);
                    continue;
                case 64:
                    c cVar2 = aVar.f1620c;
                    cVar2.f1663b = m(typedArray, index, cVar2.f1663b);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f1620c;
                        str = typedArray.getString(index);
                    } else {
                        cVar = aVar.f1620c;
                        str = m.a.f7414c[typedArray.getInteger(index, 0)];
                    }
                    cVar.f1664c = str;
                    continue;
                case 66:
                    aVar.f1620c.f1666e = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    c cVar3 = aVar.f1620c;
                    cVar3.f1668g = typedArray.getFloat(index, cVar3.f1668g);
                    continue;
                case 68:
                    C0022d c0022d4 = aVar.f1619b;
                    c0022d4.f1673e = typedArray.getFloat(index, c0022d4.f1673e);
                    continue;
                case 69:
                    aVar.f1621d.Z = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f1621d.f1626a0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    b bVar49 = aVar.f1621d;
                    bVar49.f1628b0 = typedArray.getInt(index, bVar49.f1628b0);
                    continue;
                case 73:
                    b bVar50 = aVar.f1621d;
                    bVar50.f1630c0 = typedArray.getDimensionPixelSize(index, bVar50.f1630c0);
                    continue;
                case 74:
                    aVar.f1621d.f1636f0 = typedArray.getString(index);
                    continue;
                case 75:
                    b bVar51 = aVar.f1621d;
                    bVar51.f1644j0 = typedArray.getBoolean(index, bVar51.f1644j0);
                    continue;
                case 76:
                    c cVar4 = aVar.f1620c;
                    cVar4.f1665d = typedArray.getInt(index, cVar4.f1665d);
                    continue;
                case 77:
                    aVar.f1621d.f1638g0 = typedArray.getString(index);
                    continue;
                case 78:
                    C0022d c0022d5 = aVar.f1619b;
                    c0022d5.f1671c = typedArray.getInt(index, c0022d5.f1671c);
                    continue;
                case 79:
                    c cVar5 = aVar.f1620c;
                    cVar5.f1667f = typedArray.getFloat(index, cVar5.f1667f);
                    continue;
                case 80:
                    b bVar52 = aVar.f1621d;
                    bVar52.f1640h0 = typedArray.getBoolean(index, bVar52.f1640h0);
                    continue;
                case 81:
                    b bVar53 = aVar.f1621d;
                    bVar53.f1642i0 = typedArray.getBoolean(index, bVar53.f1642i0);
                    continue;
                case 82:
                    sb = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
            }
            sb.append(str2);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f1614e.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(ConstraintLayout constraintLayout, boolean z5) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1617c.keySet());
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = constraintLayout.getChildAt(i6);
            int id = childAt.getId();
            if (!this.f1617c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + n.a.a(childAt));
            } else {
                if (this.f1616b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f1617c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = (a) this.f1617c.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            aVar.f1621d.f1632d0 = 1;
                        }
                        int i7 = aVar.f1621d.f1632d0;
                        if (i7 != -1 && i7 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f1621d.f1628b0);
                            barrier.setMargin(aVar.f1621d.f1630c0);
                            barrier.setAllowsGoneWidget(aVar.f1621d.f1644j0);
                            b bVar = aVar.f1621d;
                            int[] iArr = bVar.f1634e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f1636f0;
                                if (str != null) {
                                    bVar.f1634e0 = h(barrier, str);
                                    barrier.setReferencedIds(aVar.f1621d.f1634e0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.b(bVar2);
                        if (z5) {
                            androidx.constraintlayout.widget.a.c(childAt, aVar.f1623f);
                        }
                        childAt.setLayoutParams(bVar2);
                        C0022d c0022d = aVar.f1619b;
                        if (c0022d.f1671c == 0) {
                            childAt.setVisibility(c0022d.f1670b);
                        }
                        childAt.setAlpha(aVar.f1619b.f1672d);
                        childAt.setRotation(aVar.f1622e.f1676b);
                        childAt.setRotationX(aVar.f1622e.f1677c);
                        childAt.setRotationY(aVar.f1622e.f1678d);
                        childAt.setScaleX(aVar.f1622e.f1679e);
                        childAt.setScaleY(aVar.f1622e.f1680f);
                        if (!Float.isNaN(aVar.f1622e.f1681g)) {
                            childAt.setPivotX(aVar.f1622e.f1681g);
                        }
                        if (!Float.isNaN(aVar.f1622e.f1682h)) {
                            childAt.setPivotY(aVar.f1622e.f1682h);
                        }
                        childAt.setTranslationX(aVar.f1622e.f1683i);
                        childAt.setTranslationY(aVar.f1622e.f1684j);
                        childAt.setTranslationZ(aVar.f1622e.f1685k);
                        e eVar = aVar.f1622e;
                        if (eVar.f1686l) {
                            childAt.setElevation(eVar.f1687m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = (a) this.f1617c.get(num);
            int i8 = aVar2.f1621d.f1632d0;
            if (i8 != -1 && i8 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar3 = aVar2.f1621d;
                int[] iArr2 = bVar3.f1634e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f1636f0;
                    if (str2 != null) {
                        bVar3.f1634e0 = h(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f1621d.f1634e0);
                    }
                }
                barrier2.setType(aVar2.f1621d.f1628b0);
                barrier2.setMargin(aVar2.f1621d.f1630c0);
                ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.m();
                aVar2.b(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (aVar2.f1621d.f1625a) {
                View fVar = new f(constraintLayout.getContext());
                fVar.setId(num.intValue());
                ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.b(generateDefaultLayoutParams2);
                constraintLayout.addView(fVar, generateDefaultLayoutParams2);
            }
        }
    }

    public void e(Context context, int i6) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i6, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1617c.clear();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = constraintLayout.getChildAt(i6);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f1616b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1617c.containsKey(Integer.valueOf(id))) {
                this.f1617c.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f1617c.get(Integer.valueOf(id));
            aVar.f1623f = androidx.constraintlayout.widget.a.a(this.f1615a, childAt);
            aVar.d(id, bVar);
            aVar.f1619b.f1670b = childAt.getVisibility();
            aVar.f1619b.f1672d = childAt.getAlpha();
            aVar.f1622e.f1676b = childAt.getRotation();
            aVar.f1622e.f1677c = childAt.getRotationX();
            aVar.f1622e.f1678d = childAt.getRotationY();
            aVar.f1622e.f1679e = childAt.getScaleX();
            aVar.f1622e.f1680f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                e eVar = aVar.f1622e;
                eVar.f1681g = pivotX;
                eVar.f1682h = pivotY;
            }
            aVar.f1622e.f1683i = childAt.getTranslationX();
            aVar.f1622e.f1684j = childAt.getTranslationY();
            aVar.f1622e.f1685k = childAt.getTranslationZ();
            e eVar2 = aVar.f1622e;
            if (eVar2.f1686l) {
                eVar2.f1687m = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.f1621d.f1644j0 = barrier.n();
                aVar.f1621d.f1634e0 = barrier.getReferencedIds();
                aVar.f1621d.f1628b0 = barrier.getType();
                aVar.f1621d.f1630c0 = barrier.getMargin();
            }
        }
    }

    public void g(int i6, int i7, int i8, float f6) {
        b bVar = j(i6).f1621d;
        bVar.f1658x = i7;
        bVar.f1659y = i8;
        bVar.f1660z = f6;
    }

    public void k(Context context, int i6) {
        XmlResourceParser xml = context.getResources().getXml(i6);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a i7 = i(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        i7.f1621d.f1625a = true;
                    }
                    this.f1617c.put(Integer.valueOf(i7.f1618a), i7);
                }
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        } catch (XmlPullParserException e7) {
            e7.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0178, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0092. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.l(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
