package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public class d {
    private static final int[] a = {0, 4, 8};

    /* renamed from: b, reason: collision with root package name */
    private static SparseIntArray f724b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.widget.a> f725c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private boolean f726d = true;

    /* renamed from: e, reason: collision with root package name */
    private HashMap<Integer, a> f727e = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class a {
        int a;

        /* renamed from: b, reason: collision with root package name */
        public final C0013d f728b = new C0013d();

        /* renamed from: c, reason: collision with root package name */
        public final c f729c = new c();

        /* renamed from: d, reason: collision with root package name */
        public final b f730d = new b();

        /* renamed from: e, reason: collision with root package name */
        public final e f731e = new e();

        /* renamed from: f, reason: collision with root package name */
        public HashMap<String, androidx.constraintlayout.widget.a> f732f = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int i2, ConstraintLayout.b bVar) {
            this.a = i2;
            b bVar2 = this.f730d;
            bVar2.f740i = bVar.f679d;
            bVar2.f741j = bVar.f680e;
            bVar2.f742k = bVar.f681f;
            bVar2.l = bVar.f682g;
            bVar2.m = bVar.f683h;
            bVar2.n = bVar.f684i;
            bVar2.o = bVar.f685j;
            bVar2.p = bVar.f686k;
            bVar2.q = bVar.l;
            bVar2.r = bVar.p;
            bVar2.s = bVar.q;
            bVar2.t = bVar.r;
            bVar2.u = bVar.s;
            bVar2.v = bVar.z;
            bVar2.w = bVar.A;
            bVar2.x = bVar.B;
            bVar2.y = bVar.m;
            bVar2.z = bVar.n;
            bVar2.A = bVar.o;
            bVar2.B = bVar.Q;
            bVar2.C = bVar.R;
            bVar2.D = bVar.S;
            bVar2.f739h = bVar.f678c;
            bVar2.f737f = bVar.a;
            bVar2.f738g = bVar.f677b;
            b bVar3 = this.f730d;
            bVar3.f735d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar3.f736e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar3.E = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar3.F = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar3.G = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar3.H = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar3.Q = bVar.F;
            bVar3.R = bVar.E;
            bVar3.T = bVar.H;
            bVar3.S = bVar.G;
            bVar3.i0 = bVar.T;
            bVar3.j0 = bVar.U;
            bVar3.U = bVar.I;
            bVar3.V = bVar.J;
            bVar3.W = bVar.M;
            bVar3.X = bVar.N;
            bVar3.Y = bVar.K;
            bVar3.Z = bVar.L;
            bVar3.a0 = bVar.O;
            bVar3.b0 = bVar.P;
            bVar3.h0 = bVar.V;
            bVar3.L = bVar.u;
            bVar3.N = bVar.w;
            bVar3.K = bVar.t;
            bVar3.M = bVar.v;
            b bVar4 = this.f730d;
            bVar4.P = bVar.x;
            bVar4.O = bVar.y;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar4.I = bVar.getMarginEnd();
                this.f730d.J = bVar.getMarginStart();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i2, e.a aVar) {
            f(i2, aVar);
            this.f728b.f752d = aVar.p0;
            e eVar = this.f731e;
            eVar.f755c = aVar.s0;
            eVar.f756d = aVar.t0;
            eVar.f757e = aVar.u0;
            eVar.f758f = aVar.v0;
            eVar.f759g = aVar.w0;
            eVar.f760h = aVar.x0;
            eVar.f761i = aVar.y0;
            eVar.f762j = aVar.z0;
            eVar.f763k = aVar.A0;
            eVar.l = aVar.B0;
            eVar.n = aVar.r0;
            eVar.m = aVar.q0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(androidx.constraintlayout.widget.b bVar, int i2, e.a aVar) {
            g(i2, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.f730d;
                bVar2.e0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.c0 = barrier.getType();
                this.f730d.f0 = barrier.getReferencedIds();
                this.f730d.d0 = barrier.getMargin();
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f730d;
            bVar.f679d = bVar2.f740i;
            bVar.f680e = bVar2.f741j;
            bVar.f681f = bVar2.f742k;
            bVar.f682g = bVar2.l;
            bVar.f683h = bVar2.m;
            bVar.f684i = bVar2.n;
            bVar.f685j = bVar2.o;
            bVar.f686k = bVar2.p;
            bVar.l = bVar2.q;
            bVar.p = bVar2.r;
            bVar.q = bVar2.s;
            bVar.r = bVar2.t;
            bVar.s = bVar2.u;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.E;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.F;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.G;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.H;
            bVar.x = bVar2.P;
            bVar.y = bVar2.O;
            bVar.u = bVar2.L;
            bVar.w = bVar2.N;
            bVar.z = bVar2.v;
            bVar.A = bVar2.w;
            bVar.m = bVar2.y;
            bVar.n = bVar2.z;
            b bVar3 = this.f730d;
            bVar.o = bVar3.A;
            bVar.B = bVar3.x;
            bVar.Q = bVar3.B;
            bVar.R = bVar3.C;
            bVar.F = bVar3.Q;
            bVar.E = bVar3.R;
            bVar.H = bVar3.T;
            bVar.G = bVar3.S;
            bVar.T = bVar3.i0;
            bVar.U = bVar3.j0;
            bVar.I = bVar3.U;
            bVar.J = bVar3.V;
            bVar.M = bVar3.W;
            bVar.N = bVar3.X;
            bVar.K = bVar3.Y;
            bVar.L = bVar3.Z;
            bVar.O = bVar3.a0;
            bVar.P = bVar3.b0;
            bVar.S = bVar3.D;
            bVar.f678c = bVar3.f739h;
            bVar.a = bVar3.f737f;
            bVar.f677b = bVar3.f738g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar3.f735d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar3.f736e;
            String str = bVar3.h0;
            if (str != null) {
                bVar.V = str;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.setMarginStart(this.f730d.J);
                bVar.setMarginEnd(this.f730d.I);
            }
            bVar.a();
        }

        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f730d.a(this.f730d);
            aVar.f729c.a(this.f729c);
            aVar.f728b.a(this.f728b);
            aVar.f731e.a(this.f731e);
            aVar.a = this.a;
            return aVar;
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class b {
        private static SparseIntArray a;

        /* renamed from: d, reason: collision with root package name */
        public int f735d;

        /* renamed from: e, reason: collision with root package name */
        public int f736e;
        public int[] f0;
        public String g0;
        public String h0;

        /* renamed from: b, reason: collision with root package name */
        public boolean f733b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f734c = false;

        /* renamed from: f, reason: collision with root package name */
        public int f737f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f738g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f739h = -1.0f;

        /* renamed from: i, reason: collision with root package name */
        public int f740i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f741j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f742k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public float v = 0.5f;
        public float w = 0.5f;
        public String x = null;
        public int y = -1;
        public int z = 0;
        public float A = 0.0f;
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
        public int P = -1;
        public float Q = -1.0f;
        public float R = -1.0f;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = 0;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public int Z = -1;
        public float a0 = 1.0f;
        public float b0 = 1.0f;
        public int c0 = -1;
        public int d0 = 0;
        public int e0 = -1;
        public boolean i0 = false;
        public boolean j0 = false;
        public boolean k0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(i.F3, 24);
            a.append(i.G3, 25);
            a.append(i.I3, 28);
            a.append(i.J3, 29);
            a.append(i.O3, 35);
            a.append(i.N3, 34);
            a.append(i.q3, 4);
            a.append(i.p3, 3);
            a.append(i.n3, 1);
            a.append(i.T3, 6);
            a.append(i.U3, 7);
            a.append(i.x3, 17);
            a.append(i.y3, 18);
            a.append(i.z3, 19);
            a.append(i.Y2, 26);
            a.append(i.K3, 31);
            a.append(i.L3, 32);
            a.append(i.w3, 10);
            a.append(i.v3, 9);
            a.append(i.X3, 13);
            a.append(i.a4, 16);
            a.append(i.Y3, 14);
            a.append(i.V3, 11);
            a.append(i.Z3, 15);
            a.append(i.W3, 12);
            a.append(i.R3, 38);
            a.append(i.D3, 37);
            a.append(i.C3, 39);
            a.append(i.Q3, 40);
            a.append(i.B3, 20);
            a.append(i.P3, 36);
            a.append(i.u3, 5);
            a.append(i.E3, 76);
            a.append(i.M3, 76);
            a.append(i.H3, 76);
            a.append(i.o3, 76);
            a.append(i.m3, 76);
            a.append(i.b3, 23);
            a.append(i.d3, 27);
            a.append(i.f3, 30);
            a.append(i.g3, 8);
            a.append(i.c3, 33);
            a.append(i.e3, 2);
            a.append(i.Z2, 22);
            a.append(i.a3, 21);
            a.append(i.r3, 61);
            a.append(i.t3, 62);
            a.append(i.s3, 63);
            a.append(i.S3, 69);
            a.append(i.A3, 70);
            a.append(i.k3, 71);
            a.append(i.i3, 72);
            a.append(i.j3, 73);
            a.append(i.l3, 74);
            a.append(i.h3, 75);
        }

        public void a(b bVar) {
            this.f733b = bVar.f733b;
            this.f735d = bVar.f735d;
            this.f734c = bVar.f734c;
            this.f736e = bVar.f736e;
            this.f737f = bVar.f737f;
            this.f738g = bVar.f738g;
            this.f739h = bVar.f739h;
            this.f740i = bVar.f740i;
            this.f741j = bVar.f741j;
            this.f742k = bVar.f742k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
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
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.e0 = bVar.e0;
            this.h0 = bVar.h0;
            int[] iArr = bVar.f0;
            if (iArr != null) {
                this.f0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f0 = null;
            }
            this.g0 = bVar.g0;
            this.i0 = bVar.i0;
            this.j0 = bVar.j0;
            this.k0 = bVar.k0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.X2);
            this.f734c = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = a.get(index);
                if (i3 == 80) {
                    this.i0 = obtainStyledAttributes.getBoolean(index, this.i0);
                } else if (i3 != 81) {
                    switch (i3) {
                        case 1:
                            this.q = d.n(obtainStyledAttributes, index, this.q);
                            break;
                        case 2:
                            this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 3:
                            this.p = d.n(obtainStyledAttributes, index, this.p);
                            break;
                        case 4:
                            this.o = d.n(obtainStyledAttributes, index, this.o);
                            break;
                        case 5:
                            this.x = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            break;
                        case 7:
                            this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                            break;
                        case 8:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            this.u = d.n(obtainStyledAttributes, index, this.u);
                            break;
                        case 10:
                            this.t = d.n(obtainStyledAttributes, index, this.t);
                            break;
                        case 11:
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 12:
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 13:
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 14:
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case 15:
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        case 16:
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 17:
                            this.f737f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f737f);
                            break;
                        case 18:
                            this.f738g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f738g);
                            break;
                        case 19:
                            this.f739h = obtainStyledAttributes.getFloat(index, this.f739h);
                            break;
                        case 20:
                            this.v = obtainStyledAttributes.getFloat(index, this.v);
                            break;
                        case 21:
                            this.f736e = obtainStyledAttributes.getLayoutDimension(index, this.f736e);
                            break;
                        case 22:
                            this.f735d = obtainStyledAttributes.getLayoutDimension(index, this.f735d);
                            break;
                        case 23:
                            this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            break;
                        case 24:
                            this.f740i = d.n(obtainStyledAttributes, index, this.f740i);
                            break;
                        case 25:
                            this.f741j = d.n(obtainStyledAttributes, index, this.f741j);
                            break;
                        case 26:
                            this.D = obtainStyledAttributes.getInt(index, this.D);
                            break;
                        case 27:
                            this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            break;
                        case 28:
                            this.f742k = d.n(obtainStyledAttributes, index, this.f742k);
                            break;
                        case 29:
                            this.l = d.n(obtainStyledAttributes, index, this.l);
                            break;
                        case 30:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                                break;
                            } else {
                                break;
                            }
                        case 31:
                            this.r = d.n(obtainStyledAttributes, index, this.r);
                            break;
                        case 32:
                            this.s = d.n(obtainStyledAttributes, index, this.s);
                            break;
                        case 33:
                            this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 34:
                            this.n = d.n(obtainStyledAttributes, index, this.n);
                            break;
                        case 35:
                            this.m = d.n(obtainStyledAttributes, index, this.m);
                            break;
                        case 36:
                            this.w = obtainStyledAttributes.getFloat(index, this.w);
                            break;
                        case 37:
                            this.R = obtainStyledAttributes.getFloat(index, this.R);
                            break;
                        case 38:
                            this.Q = obtainStyledAttributes.getFloat(index, this.Q);
                            break;
                        case 39:
                            this.S = obtainStyledAttributes.getInt(index, this.S);
                            break;
                        case 40:
                            this.T = obtainStyledAttributes.getInt(index, this.T);
                            break;
                        default:
                            switch (i3) {
                                case 54:
                                    this.U = obtainStyledAttributes.getInt(index, this.U);
                                    break;
                                case 55:
                                    this.V = obtainStyledAttributes.getInt(index, this.V);
                                    break;
                                case 56:
                                    this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    break;
                                case 57:
                                    this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    break;
                                case 58:
                                    this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    break;
                                case 59:
                                    this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                    break;
                                default:
                                    switch (i3) {
                                        case 61:
                                            this.y = d.n(obtainStyledAttributes, index, this.y);
                                            break;
                                        case 62:
                                            this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                                            break;
                                        case 63:
                                            this.A = obtainStyledAttributes.getFloat(index, this.A);
                                            break;
                                        default:
                                            switch (i3) {
                                                case 69:
                                                    this.a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.b0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.c0 = obtainStyledAttributes.getInt(index, this.c0);
                                                    break;
                                                case 73:
                                                    this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                                    break;
                                                case 74:
                                                    this.g0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.k0 = obtainStyledAttributes.getBoolean(index, this.k0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + a.get(index));
                                                    break;
                                                case 77:
                                                    this.h0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + a.get(index));
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.j0 = obtainStyledAttributes.getBoolean(index, this.j0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class c {
        private static SparseIntArray a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f743b = false;

        /* renamed from: c, reason: collision with root package name */
        public int f744c = -1;

        /* renamed from: d, reason: collision with root package name */
        public String f745d = null;

        /* renamed from: e, reason: collision with root package name */
        public int f746e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f747f = 0;

        /* renamed from: g, reason: collision with root package name */
        public float f748g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f749h = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(i.l4, 1);
            a.append(i.n4, 2);
            a.append(i.o4, 3);
            a.append(i.k4, 4);
            a.append(i.j4, 5);
            a.append(i.m4, 6);
        }

        public void a(c cVar) {
            this.f743b = cVar.f743b;
            this.f744c = cVar.f744c;
            this.f745d = cVar.f745d;
            this.f746e = cVar.f746e;
            this.f747f = cVar.f747f;
            this.f749h = cVar.f749h;
            this.f748g = cVar.f748g;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.i4);
            this.f743b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (a.get(index)) {
                    case 1:
                        this.f749h = obtainStyledAttributes.getFloat(index, this.f749h);
                        break;
                    case 2:
                        this.f746e = obtainStyledAttributes.getInt(index, this.f746e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f745d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f745d = c.f.a.a.a.f2439b[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f747f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f744c = d.n(obtainStyledAttributes, index, this.f744c);
                        break;
                    case 6:
                        this.f748g = obtainStyledAttributes.getFloat(index, this.f748g);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0013d {
        public boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f750b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f751c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f752d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f753e = Float.NaN;

        public void a(C0013d c0013d) {
            this.a = c0013d.a;
            this.f750b = c0013d.f750b;
            this.f752d = c0013d.f752d;
            this.f753e = c0013d.f753e;
            this.f751c = c0013d.f751c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.x4);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == i.z4) {
                    this.f752d = obtainStyledAttributes.getFloat(index, this.f752d);
                } else if (index == i.y4) {
                    this.f750b = obtainStyledAttributes.getInt(index, this.f750b);
                    this.f750b = d.a[this.f750b];
                } else if (index == i.B4) {
                    this.f751c = obtainStyledAttributes.getInt(index, this.f751c);
                } else if (index == i.A4) {
                    this.f753e = obtainStyledAttributes.getFloat(index, this.f753e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class e {
        private static SparseIntArray a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f754b = false;

        /* renamed from: c, reason: collision with root package name */
        public float f755c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f756d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f757e = 0.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f758f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f759g = 1.0f;

        /* renamed from: h, reason: collision with root package name */
        public float f760h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public float f761i = Float.NaN;

        /* renamed from: j, reason: collision with root package name */
        public float f762j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f763k = 0.0f;
        public float l = 0.0f;
        public boolean m = false;
        public float n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(i.V4, 1);
            a.append(i.W4, 2);
            a.append(i.X4, 3);
            a.append(i.T4, 4);
            a.append(i.U4, 5);
            a.append(i.P4, 6);
            a.append(i.Q4, 7);
            a.append(i.R4, 8);
            a.append(i.S4, 9);
            a.append(i.Y4, 10);
            a.append(i.Z4, 11);
        }

        public void a(e eVar) {
            this.f754b = eVar.f754b;
            this.f755c = eVar.f755c;
            this.f756d = eVar.f756d;
            this.f757e = eVar.f757e;
            this.f758f = eVar.f758f;
            this.f759g = eVar.f759g;
            this.f760h = eVar.f760h;
            this.f761i = eVar.f761i;
            this.f762j = eVar.f762j;
            this.f763k = eVar.f763k;
            this.l = eVar.l;
            this.m = eVar.m;
            this.n = eVar.n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.O4);
            this.f754b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (a.get(index)) {
                    case 1:
                        this.f755c = obtainStyledAttributes.getFloat(index, this.f755c);
                        break;
                    case 2:
                        this.f756d = obtainStyledAttributes.getFloat(index, this.f756d);
                        break;
                    case 3:
                        this.f757e = obtainStyledAttributes.getFloat(index, this.f757e);
                        break;
                    case 4:
                        this.f758f = obtainStyledAttributes.getFloat(index, this.f758f);
                        break;
                    case 5:
                        this.f759g = obtainStyledAttributes.getFloat(index, this.f759g);
                        break;
                    case 6:
                        this.f760h = obtainStyledAttributes.getDimension(index, this.f760h);
                        break;
                    case 7:
                        this.f761i = obtainStyledAttributes.getDimension(index, this.f761i);
                        break;
                    case 8:
                        this.f762j = obtainStyledAttributes.getDimension(index, this.f762j);
                        break;
                    case 9:
                        this.f763k = obtainStyledAttributes.getDimension(index, this.f763k);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.l = obtainStyledAttributes.getDimension(index, this.l);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.m = true;
                            this.n = obtainStyledAttributes.getDimension(index, this.n);
                            break;
                        } else {
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f724b = sparseIntArray;
        sparseIntArray.append(i.u0, 25);
        f724b.append(i.v0, 26);
        f724b.append(i.x0, 29);
        f724b.append(i.y0, 30);
        f724b.append(i.E0, 36);
        f724b.append(i.D0, 35);
        f724b.append(i.c0, 4);
        f724b.append(i.b0, 3);
        f724b.append(i.Z, 1);
        f724b.append(i.M0, 6);
        f724b.append(i.N0, 7);
        f724b.append(i.j0, 17);
        f724b.append(i.k0, 18);
        f724b.append(i.l0, 19);
        f724b.append(i.s, 27);
        f724b.append(i.z0, 32);
        f724b.append(i.A0, 33);
        f724b.append(i.i0, 10);
        f724b.append(i.h0, 9);
        f724b.append(i.Q0, 13);
        f724b.append(i.T0, 16);
        f724b.append(i.R0, 14);
        f724b.append(i.O0, 11);
        f724b.append(i.S0, 15);
        f724b.append(i.P0, 12);
        f724b.append(i.H0, 40);
        f724b.append(i.s0, 39);
        f724b.append(i.r0, 41);
        f724b.append(i.G0, 42);
        f724b.append(i.q0, 20);
        f724b.append(i.F0, 37);
        f724b.append(i.g0, 5);
        f724b.append(i.t0, 82);
        f724b.append(i.C0, 82);
        f724b.append(i.w0, 82);
        f724b.append(i.a0, 82);
        f724b.append(i.Y, 82);
        f724b.append(i.x, 24);
        f724b.append(i.z, 28);
        f724b.append(i.L, 31);
        f724b.append(i.M, 8);
        f724b.append(i.y, 34);
        f724b.append(i.A, 2);
        f724b.append(i.v, 23);
        f724b.append(i.w, 21);
        f724b.append(i.u, 22);
        f724b.append(i.B, 43);
        f724b.append(i.O, 44);
        f724b.append(i.J, 45);
        f724b.append(i.K, 46);
        f724b.append(i.I, 60);
        f724b.append(i.G, 47);
        f724b.append(i.H, 48);
        f724b.append(i.C, 49);
        f724b.append(i.D, 50);
        f724b.append(i.E, 51);
        f724b.append(i.F, 52);
        f724b.append(i.N, 53);
        f724b.append(i.I0, 54);
        f724b.append(i.m0, 55);
        f724b.append(i.J0, 56);
        f724b.append(i.n0, 57);
        f724b.append(i.K0, 58);
        f724b.append(i.o0, 59);
        f724b.append(i.d0, 61);
        f724b.append(i.f0, 62);
        f724b.append(i.e0, 63);
        f724b.append(i.P, 64);
        f724b.append(i.X0, 65);
        f724b.append(i.V, 66);
        f724b.append(i.Y0, 67);
        f724b.append(i.V0, 79);
        f724b.append(i.t, 38);
        f724b.append(i.U0, 68);
        f724b.append(i.L0, 69);
        f724b.append(i.p0, 70);
        f724b.append(i.T, 71);
        f724b.append(i.R, 72);
        f724b.append(i.S, 73);
        f724b.append(i.U, 74);
        f724b.append(i.Q, 75);
        f724b.append(i.W0, 76);
        f724b.append(i.B0, 77);
        f724b.append(i.Z0, 78);
        f724b.append(i.X, 80);
        f724b.append(i.W, 81);
    }

    private int[] i(View view, String str) {
        int i2;
        Object f2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, DeepLinkIntentReceiver.DeepLinksKeys.ID, context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (f2 = ((ConstraintLayout) view.getParent()).f(0, trim)) != null && (f2 instanceof Integer)) {
                i2 = ((Integer) f2).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    private a j(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.r);
        o(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a k(int i2) {
        if (!this.f727e.containsKey(Integer.valueOf(i2))) {
            this.f727e.put(Integer.valueOf(i2), new a());
        }
        return this.f727e.get(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    private void o(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (index != i.t && i.L != index && i.M != index) {
                aVar.f729c.f743b = true;
                aVar.f730d.f734c = true;
                aVar.f728b.a = true;
                aVar.f731e.f754b = true;
            }
            switch (f724b.get(index)) {
                case 1:
                    b bVar = aVar.f730d;
                    bVar.q = n(typedArray, index, bVar.q);
                    break;
                case 2:
                    b bVar2 = aVar.f730d;
                    bVar2.H = typedArray.getDimensionPixelSize(index, bVar2.H);
                    break;
                case 3:
                    b bVar3 = aVar.f730d;
                    bVar3.p = n(typedArray, index, bVar3.p);
                    break;
                case 4:
                    b bVar4 = aVar.f730d;
                    bVar4.o = n(typedArray, index, bVar4.o);
                    break;
                case 5:
                    aVar.f730d.x = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f730d;
                    bVar5.B = typedArray.getDimensionPixelOffset(index, bVar5.B);
                    break;
                case 7:
                    b bVar6 = aVar.f730d;
                    bVar6.C = typedArray.getDimensionPixelOffset(index, bVar6.C);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar7 = aVar.f730d;
                        bVar7.I = typedArray.getDimensionPixelSize(index, bVar7.I);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    b bVar8 = aVar.f730d;
                    bVar8.u = n(typedArray, index, bVar8.u);
                    break;
                case 10:
                    b bVar9 = aVar.f730d;
                    bVar9.t = n(typedArray, index, bVar9.t);
                    break;
                case 11:
                    b bVar10 = aVar.f730d;
                    bVar10.N = typedArray.getDimensionPixelSize(index, bVar10.N);
                    break;
                case 12:
                    b bVar11 = aVar.f730d;
                    bVar11.O = typedArray.getDimensionPixelSize(index, bVar11.O);
                    break;
                case 13:
                    b bVar12 = aVar.f730d;
                    bVar12.K = typedArray.getDimensionPixelSize(index, bVar12.K);
                    break;
                case 14:
                    b bVar13 = aVar.f730d;
                    bVar13.M = typedArray.getDimensionPixelSize(index, bVar13.M);
                    break;
                case 15:
                    b bVar14 = aVar.f730d;
                    bVar14.P = typedArray.getDimensionPixelSize(index, bVar14.P);
                    break;
                case 16:
                    b bVar15 = aVar.f730d;
                    bVar15.L = typedArray.getDimensionPixelSize(index, bVar15.L);
                    break;
                case 17:
                    b bVar16 = aVar.f730d;
                    bVar16.f737f = typedArray.getDimensionPixelOffset(index, bVar16.f737f);
                    break;
                case 18:
                    b bVar17 = aVar.f730d;
                    bVar17.f738g = typedArray.getDimensionPixelOffset(index, bVar17.f738g);
                    break;
                case 19:
                    b bVar18 = aVar.f730d;
                    bVar18.f739h = typedArray.getFloat(index, bVar18.f739h);
                    break;
                case 20:
                    b bVar19 = aVar.f730d;
                    bVar19.v = typedArray.getFloat(index, bVar19.v);
                    break;
                case 21:
                    b bVar20 = aVar.f730d;
                    bVar20.f736e = typedArray.getLayoutDimension(index, bVar20.f736e);
                    break;
                case 22:
                    C0013d c0013d = aVar.f728b;
                    c0013d.f750b = typedArray.getInt(index, c0013d.f750b);
                    C0013d c0013d2 = aVar.f728b;
                    c0013d2.f750b = a[c0013d2.f750b];
                    break;
                case 23:
                    b bVar21 = aVar.f730d;
                    bVar21.f735d = typedArray.getLayoutDimension(index, bVar21.f735d);
                    break;
                case 24:
                    b bVar22 = aVar.f730d;
                    bVar22.E = typedArray.getDimensionPixelSize(index, bVar22.E);
                    break;
                case 25:
                    b bVar23 = aVar.f730d;
                    bVar23.f740i = n(typedArray, index, bVar23.f740i);
                    break;
                case 26:
                    b bVar24 = aVar.f730d;
                    bVar24.f741j = n(typedArray, index, bVar24.f741j);
                    break;
                case 27:
                    b bVar25 = aVar.f730d;
                    bVar25.D = typedArray.getInt(index, bVar25.D);
                    break;
                case 28:
                    b bVar26 = aVar.f730d;
                    bVar26.F = typedArray.getDimensionPixelSize(index, bVar26.F);
                    break;
                case 29:
                    b bVar27 = aVar.f730d;
                    bVar27.f742k = n(typedArray, index, bVar27.f742k);
                    break;
                case 30:
                    b bVar28 = aVar.f730d;
                    bVar28.l = n(typedArray, index, bVar28.l);
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar29 = aVar.f730d;
                        bVar29.J = typedArray.getDimensionPixelSize(index, bVar29.J);
                        break;
                    } else {
                        break;
                    }
                case 32:
                    b bVar30 = aVar.f730d;
                    bVar30.r = n(typedArray, index, bVar30.r);
                    break;
                case 33:
                    b bVar31 = aVar.f730d;
                    bVar31.s = n(typedArray, index, bVar31.s);
                    break;
                case 34:
                    b bVar32 = aVar.f730d;
                    bVar32.G = typedArray.getDimensionPixelSize(index, bVar32.G);
                    break;
                case 35:
                    b bVar33 = aVar.f730d;
                    bVar33.n = n(typedArray, index, bVar33.n);
                    break;
                case 36:
                    b bVar34 = aVar.f730d;
                    bVar34.m = n(typedArray, index, bVar34.m);
                    break;
                case 37:
                    b bVar35 = aVar.f730d;
                    bVar35.w = typedArray.getFloat(index, bVar35.w);
                    break;
                case 38:
                    aVar.a = typedArray.getResourceId(index, aVar.a);
                    break;
                case 39:
                    b bVar36 = aVar.f730d;
                    bVar36.R = typedArray.getFloat(index, bVar36.R);
                    break;
                case 40:
                    b bVar37 = aVar.f730d;
                    bVar37.Q = typedArray.getFloat(index, bVar37.Q);
                    break;
                case 41:
                    b bVar38 = aVar.f730d;
                    bVar38.S = typedArray.getInt(index, bVar38.S);
                    break;
                case 42:
                    b bVar39 = aVar.f730d;
                    bVar39.T = typedArray.getInt(index, bVar39.T);
                    break;
                case 43:
                    C0013d c0013d3 = aVar.f728b;
                    c0013d3.f752d = typedArray.getFloat(index, c0013d3.f752d);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar = aVar.f731e;
                        eVar.m = true;
                        eVar.n = typedArray.getDimension(index, eVar.n);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    e eVar2 = aVar.f731e;
                    eVar2.f756d = typedArray.getFloat(index, eVar2.f756d);
                    break;
                case 46:
                    e eVar3 = aVar.f731e;
                    eVar3.f757e = typedArray.getFloat(index, eVar3.f757e);
                    break;
                case 47:
                    e eVar4 = aVar.f731e;
                    eVar4.f758f = typedArray.getFloat(index, eVar4.f758f);
                    break;
                case 48:
                    e eVar5 = aVar.f731e;
                    eVar5.f759g = typedArray.getFloat(index, eVar5.f759g);
                    break;
                case 49:
                    e eVar6 = aVar.f731e;
                    eVar6.f760h = typedArray.getDimension(index, eVar6.f760h);
                    break;
                case 50:
                    e eVar7 = aVar.f731e;
                    eVar7.f761i = typedArray.getDimension(index, eVar7.f761i);
                    break;
                case 51:
                    e eVar8 = aVar.f731e;
                    eVar8.f762j = typedArray.getDimension(index, eVar8.f762j);
                    break;
                case 52:
                    e eVar9 = aVar.f731e;
                    eVar9.f763k = typedArray.getDimension(index, eVar9.f763k);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar10 = aVar.f731e;
                        eVar10.l = typedArray.getDimension(index, eVar10.l);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    b bVar40 = aVar.f730d;
                    bVar40.U = typedArray.getInt(index, bVar40.U);
                    break;
                case 55:
                    b bVar41 = aVar.f730d;
                    bVar41.V = typedArray.getInt(index, bVar41.V);
                    break;
                case 56:
                    b bVar42 = aVar.f730d;
                    bVar42.W = typedArray.getDimensionPixelSize(index, bVar42.W);
                    break;
                case 57:
                    b bVar43 = aVar.f730d;
                    bVar43.X = typedArray.getDimensionPixelSize(index, bVar43.X);
                    break;
                case 58:
                    b bVar44 = aVar.f730d;
                    bVar44.Y = typedArray.getDimensionPixelSize(index, bVar44.Y);
                    break;
                case 59:
                    b bVar45 = aVar.f730d;
                    bVar45.Z = typedArray.getDimensionPixelSize(index, bVar45.Z);
                    break;
                case 60:
                    e eVar11 = aVar.f731e;
                    eVar11.f755c = typedArray.getFloat(index, eVar11.f755c);
                    break;
                case 61:
                    b bVar46 = aVar.f730d;
                    bVar46.y = n(typedArray, index, bVar46.y);
                    break;
                case 62:
                    b bVar47 = aVar.f730d;
                    bVar47.z = typedArray.getDimensionPixelSize(index, bVar47.z);
                    break;
                case 63:
                    b bVar48 = aVar.f730d;
                    bVar48.A = typedArray.getFloat(index, bVar48.A);
                    break;
                case 64:
                    c cVar = aVar.f729c;
                    cVar.f744c = n(typedArray, index, cVar.f744c);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f729c.f745d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f729c.f745d = c.f.a.a.a.f2439b[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f729c.f747f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f729c;
                    cVar2.f749h = typedArray.getFloat(index, cVar2.f749h);
                    break;
                case 68:
                    C0013d c0013d4 = aVar.f728b;
                    c0013d4.f753e = typedArray.getFloat(index, c0013d4.f753e);
                    break;
                case 69:
                    aVar.f730d.a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f730d.b0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f730d;
                    bVar49.c0 = typedArray.getInt(index, bVar49.c0);
                    break;
                case 73:
                    b bVar50 = aVar.f730d;
                    bVar50.d0 = typedArray.getDimensionPixelSize(index, bVar50.d0);
                    break;
                case 74:
                    aVar.f730d.g0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f730d;
                    bVar51.k0 = typedArray.getBoolean(index, bVar51.k0);
                    break;
                case 76:
                    c cVar3 = aVar.f729c;
                    cVar3.f746e = typedArray.getInt(index, cVar3.f746e);
                    break;
                case 77:
                    aVar.f730d.h0 = typedArray.getString(index);
                    break;
                case 78:
                    C0013d c0013d5 = aVar.f728b;
                    c0013d5.f751c = typedArray.getInt(index, c0013d5.f751c);
                    break;
                case 79:
                    c cVar4 = aVar.f729c;
                    cVar4.f748g = typedArray.getFloat(index, cVar4.f748g);
                    break;
                case 80:
                    b bVar52 = aVar.f730d;
                    bVar52.i0 = typedArray.getBoolean(index, bVar52.i0);
                    break;
                case 81:
                    b bVar53 = aVar.f730d;
                    bVar53.j0 = typedArray.getBoolean(index, bVar53.j0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f724b.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f724b.get(index));
                    break;
            }
        }
    }

    private String q(int i2) {
        switch (i2) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f727e.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (this.f727e.containsKey(Integer.valueOf(id))) {
                if (this.f726d && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f727e.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.f727e.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            aVar.f730d.e0 = 1;
                        }
                        int i3 = aVar.f730d.e0;
                        if (i3 != -1 && i3 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f730d.c0);
                            barrier.setMargin(aVar.f730d.d0);
                            barrier.setAllowsGoneWidget(aVar.f730d.k0);
                            b bVar = aVar.f730d;
                            int[] iArr = bVar.f0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.g0;
                                if (str != null) {
                                    bVar.f0 = i(barrier, str);
                                    barrier.setReferencedIds(aVar.f730d.f0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.d(bVar2);
                        if (z) {
                            androidx.constraintlayout.widget.a.c(childAt, aVar.f732f);
                        }
                        childAt.setLayoutParams(bVar2);
                        C0013d c0013d = aVar.f728b;
                        if (c0013d.f751c == 0) {
                            childAt.setVisibility(c0013d.f750b);
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 >= 17) {
                            childAt.setAlpha(aVar.f728b.f752d);
                            childAt.setRotation(aVar.f731e.f755c);
                            childAt.setRotationX(aVar.f731e.f756d);
                            childAt.setRotationY(aVar.f731e.f757e);
                            childAt.setScaleX(aVar.f731e.f758f);
                            childAt.setScaleY(aVar.f731e.f759g);
                            if (!Float.isNaN(aVar.f731e.f760h)) {
                                childAt.setPivotX(aVar.f731e.f760h);
                            }
                            if (!Float.isNaN(aVar.f731e.f761i)) {
                                childAt.setPivotY(aVar.f731e.f761i);
                            }
                            childAt.setTranslationX(aVar.f731e.f762j);
                            childAt.setTranslationY(aVar.f731e.f763k);
                            if (i4 >= 21) {
                                childAt.setTranslationZ(aVar.f731e.l);
                                e eVar = aVar.f731e;
                                if (eVar.m) {
                                    childAt.setElevation(eVar.n);
                                }
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            } else {
                Log.w("ConstraintSet", "id unknown " + c.f.a.b.a.a(childAt));
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f727e.get(num);
            int i5 = aVar2.f730d.e0;
            if (i5 != -1 && i5 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar3 = aVar2.f730d;
                int[] iArr2 = bVar3.f0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.g0;
                    if (str2 != null) {
                        bVar3.f0 = i(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f730d.f0);
                    }
                }
                barrier2.setType(aVar2.f730d.c0);
                barrier2.setMargin(aVar2.f730d.d0);
                ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.n();
                aVar2.d(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (aVar2.f730d.f733b) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.d(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    public void e(Context context, int i2) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i2, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f727e.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f726d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f727e.containsKey(Integer.valueOf(id))) {
                this.f727e.put(Integer.valueOf(id), new a());
            }
            a aVar = this.f727e.get(Integer.valueOf(id));
            aVar.f732f = androidx.constraintlayout.widget.a.a(this.f725c, childAt);
            aVar.f(id, bVar);
            aVar.f728b.f750b = childAt.getVisibility();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 17) {
                aVar.f728b.f752d = childAt.getAlpha();
                aVar.f731e.f755c = childAt.getRotation();
                aVar.f731e.f756d = childAt.getRotationX();
                aVar.f731e.f757e = childAt.getRotationY();
                aVar.f731e.f758f = childAt.getScaleX();
                aVar.f731e.f759g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f731e;
                    eVar.f760h = pivotX;
                    eVar.f761i = pivotY;
                }
                aVar.f731e.f762j = childAt.getTranslationX();
                aVar.f731e.f763k = childAt.getTranslationY();
                if (i3 >= 21) {
                    aVar.f731e.l = childAt.getTranslationZ();
                    e eVar2 = aVar.f731e;
                    if (eVar2.m) {
                        eVar2.n = childAt.getElevation();
                    }
                }
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.f730d.k0 = barrier.o();
                aVar.f730d.f0 = barrier.getReferencedIds();
                aVar.f730d.c0 = barrier.getType();
                aVar.f730d.d0 = barrier.getMargin();
            }
        }
    }

    public void g(androidx.constraintlayout.widget.e eVar) {
        int childCount = eVar.getChildCount();
        this.f727e.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = eVar.getChildAt(i2);
            e.a aVar = (e.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f726d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f727e.containsKey(Integer.valueOf(id))) {
                this.f727e.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.f727e.get(Integer.valueOf(id));
            if (childAt instanceof androidx.constraintlayout.widget.b) {
                aVar2.h((androidx.constraintlayout.widget.b) childAt, id, aVar);
            }
            aVar2.g(id, aVar);
        }
    }

    public void h(int i2, int i3, int i4, int i5) {
        if (!this.f727e.containsKey(Integer.valueOf(i2))) {
            this.f727e.put(Integer.valueOf(i2), new a());
        }
        a aVar = this.f727e.get(Integer.valueOf(i2));
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    b bVar = aVar.f730d;
                    bVar.f740i = i4;
                    bVar.f741j = -1;
                    return;
                } else if (i5 == 2) {
                    b bVar2 = aVar.f730d;
                    bVar2.f741j = i4;
                    bVar2.f740i = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + q(i5) + " undefined");
                }
            case 2:
                if (i5 == 1) {
                    b bVar3 = aVar.f730d;
                    bVar3.f742k = i4;
                    bVar3.l = -1;
                    return;
                } else if (i5 == 2) {
                    b bVar4 = aVar.f730d;
                    bVar4.l = i4;
                    bVar4.f742k = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + q(i5) + " undefined");
                }
            case 3:
                if (i5 == 3) {
                    b bVar5 = aVar.f730d;
                    bVar5.m = i4;
                    bVar5.n = -1;
                    bVar5.q = -1;
                    return;
                }
                if (i5 == 4) {
                    b bVar6 = aVar.f730d;
                    bVar6.n = i4;
                    bVar6.m = -1;
                    bVar6.q = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + q(i5) + " undefined");
            case 4:
                if (i5 == 4) {
                    b bVar7 = aVar.f730d;
                    bVar7.p = i4;
                    bVar7.o = -1;
                    bVar7.q = -1;
                    return;
                }
                if (i5 == 3) {
                    b bVar8 = aVar.f730d;
                    bVar8.o = i4;
                    bVar8.p = -1;
                    bVar8.q = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + q(i5) + " undefined");
            case 5:
                if (i5 == 5) {
                    b bVar9 = aVar.f730d;
                    bVar9.q = i4;
                    bVar9.p = -1;
                    bVar9.o = -1;
                    bVar9.m = -1;
                    bVar9.n = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + q(i5) + " undefined");
            case 6:
                if (i5 == 6) {
                    b bVar10 = aVar.f730d;
                    bVar10.s = i4;
                    bVar10.r = -1;
                    return;
                } else if (i5 == 7) {
                    b bVar11 = aVar.f730d;
                    bVar11.r = i4;
                    bVar11.s = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + q(i5) + " undefined");
                }
            case 7:
                if (i5 == 7) {
                    b bVar12 = aVar.f730d;
                    bVar12.u = i4;
                    bVar12.t = -1;
                    return;
                } else if (i5 == 6) {
                    b bVar13 = aVar.f730d;
                    bVar13.t = i4;
                    bVar13.u = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + q(i5) + " undefined");
                }
            default:
                throw new IllegalArgumentException(q(i3) + " to " + q(i5) + " unknown");
        }
    }

    public void l(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a j2 = j(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        j2.f730d.f733b = true;
                    }
                    this.f727e.put(Integer.valueOf(j2.a), j2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0179, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0093. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.m(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void p(int i2, float f2) {
        k(i2).f730d.w = f2;
    }
}
