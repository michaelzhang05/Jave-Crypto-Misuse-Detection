package f;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.core.content.res.n;
import androidx.core.graphics.drawable.s;
import f.b;
import f.d;
import l.h;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class a extends f.d implements s {

    /* renamed from: o, reason: collision with root package name */
    private c f6519o;

    /* renamed from: p, reason: collision with root package name */
    private g f6520p;

    /* renamed from: q, reason: collision with root package name */
    private int f6521q;

    /* renamed from: r, reason: collision with root package name */
    private int f6522r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f6523s;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: a, reason: collision with root package name */
        private final Animatable f6524a;

        b(Animatable animatable) {
            super();
            this.f6524a = animatable;
        }

        @Override // f.a.g
        public void c() {
            this.f6524a.start();
        }

        @Override // f.a.g
        public void d() {
            this.f6524a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends d.a {
        l.d K;
        h L;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            h hVar;
            if (cVar != null) {
                this.K = cVar.K;
                hVar = cVar.L;
            } else {
                this.K = new l.d();
                hVar = new h();
            }
            this.L = hVar;
        }

        private static long D(int i6, int i7) {
            return i7 | (i6 << 32);
        }

        int B(int[] iArr, Drawable drawable, int i6) {
            int z5 = super.z(iArr, drawable);
            this.L.j(z5, Integer.valueOf(i6));
            return z5;
        }

        int C(int i6, int i7, Drawable drawable, boolean z5) {
            int a6 = super.a(drawable);
            long D = D(i6, i7);
            long j6 = z5 ? 8589934592L : 0L;
            long j7 = a6;
            this.K.a(D, Long.valueOf(j7 | j6));
            if (z5) {
                this.K.a(D(i7, i6), Long.valueOf(4294967296L | j7 | j6));
            }
            return a6;
        }

        int E(int i6) {
            if (i6 < 0) {
                return 0;
            }
            return ((Integer) this.L.f(i6, 0)).intValue();
        }

        int F(int[] iArr) {
            int A = super.A(iArr);
            return A >= 0 ? A : super.A(StateSet.WILD_CARD);
        }

        int G(int i6, int i7) {
            return (int) ((Long) this.K.f(D(i6, i7), -1L)).longValue();
        }

        boolean H(int i6, int i7) {
            return (((Long) this.K.f(D(i6, i7), -1L)).longValue() & 4294967296L) != 0;
        }

        boolean I(int i6, int i7) {
            return (((Long) this.K.f(D(i6, i7), -1L)).longValue() & 8589934592L) != 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // f.d.a, f.b.d
        void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.e f6525a;

        d(androidx.vectordrawable.graphics.drawable.e eVar) {
            super();
            this.f6525a = eVar;
        }

        @Override // f.a.g
        public void c() {
            this.f6525a.start();
        }

        @Override // f.a.g
        public void d() {
            this.f6525a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends g {

        /* renamed from: a, reason: collision with root package name */
        private final ObjectAnimator f6526a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f6527b;

        e(AnimationDrawable animationDrawable, boolean z5, boolean z6) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i6 = z5 ? numberOfFrames - 1 : 0;
            int i7 = z5 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z5);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i6, i7);
            g.b.a(ofInt, true);
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.f6527b = z6;
            this.f6526a = ofInt;
        }

        @Override // f.a.g
        public boolean a() {
            return this.f6527b;
        }

        @Override // f.a.g
        public void b() {
            this.f6526a.reverse();
        }

        @Override // f.a.g
        public void c() {
            this.f6526a.start();
        }

        @Override // f.a.g
        public void d() {
            this.f6526a.cancel();
        }
    }

    /* loaded from: classes.dex */
    private static class f implements TimeInterpolator {

        /* renamed from: a, reason: collision with root package name */
        private int[] f6528a;

        /* renamed from: b, reason: collision with root package name */
        private int f6529b;

        /* renamed from: c, reason: collision with root package name */
        private int f6530c;

        f(AnimationDrawable animationDrawable, boolean z5) {
            b(animationDrawable, z5);
        }

        int a() {
            return this.f6530c;
        }

        int b(AnimationDrawable animationDrawable, boolean z5) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f6529b = numberOfFrames;
            int[] iArr = this.f6528a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f6528a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f6528a;
            int i6 = 0;
            for (int i7 = 0; i7 < numberOfFrames; i7++) {
                int duration = animationDrawable.getDuration(z5 ? (numberOfFrames - i7) - 1 : i7);
                iArr2[i7] = duration;
                i6 += duration;
            }
            this.f6530c = i6;
            return i6;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f6) {
            int i6 = (int) ((f6 * this.f6530c) + 0.5f);
            int i7 = this.f6529b;
            int[] iArr = this.f6528a;
            int i8 = 0;
            while (i8 < i7) {
                int i9 = iArr[i8];
                if (i6 < i9) {
                    break;
                }
                i6 -= i9;
                i8++;
            }
            return (i8 / i7) + (i8 < i7 ? i6 / this.f6530c : 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    public static a l(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.m(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    p(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void o() {
        onStateChange(getState());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r5 != 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r7.getName().equals("vector") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r5 = androidx.vectordrawable.graphics.drawable.j.c(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        r5 = g.c.a(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r5 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r4.f6519o.B(r0, r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r7.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        r5 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r5 != 4) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int p(android.content.Context r5, android.content.res.Resources r6, org.xmlpull.v1.XmlPullParser r7, android.util.AttributeSet r8, android.content.res.Resources.Theme r9) {
        /*
            r4 = this;
            int[] r0 = g.e.f6630h
            android.content.res.TypedArray r0 = androidx.core.content.res.n.k(r6, r9, r8, r0)
            int r1 = g.e.f6631i
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            int r2 = g.e.f6632j
            r3 = -1
            int r2 = r0.getResourceId(r2, r3)
            if (r2 <= 0) goto L1f
            androidx.appcompat.widget.s2 r3 = androidx.appcompat.widget.s2.h()
            android.graphics.drawable.Drawable r5 = r3.j(r5, r2)
            goto L20
        L1f:
            r5 = 0
        L20:
            r0.recycle()
            int[] r0 = r4.j(r8)
            java.lang.String r2 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r5 != 0) goto L65
        L2b:
            int r5 = r7.next()
            r3 = 4
            if (r5 != r3) goto L33
            goto L2b
        L33:
            r3 = 2
            if (r5 != r3) goto L4c
            java.lang.String r5 = r7.getName()
            java.lang.String r3 = "vector"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L47
            androidx.vectordrawable.graphics.drawable.j r5 = androidx.vectordrawable.graphics.drawable.j.c(r6, r7, r8, r9)
            goto L65
        L47:
            android.graphics.drawable.Drawable r5 = g.c.a(r6, r7, r8, r9)
            goto L65
        L4c:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L65:
            if (r5 == 0) goto L6e
            f.a$c r6 = r4.f6519o
            int r5 = r6.B(r0, r5, r1)
            return r5
        L6e:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.p(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (r4 != 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r10.getName().equals("animated-vector") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r4 = androidx.vectordrawable.graphics.drawable.e.b(r8, r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r4 = g.c.a(r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r4 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r1 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r3 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        return r7.f6519o.C(r1, r3, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
    
        if (r4 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        r4 = r10.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        if (r4 != 4) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int q(android.content.Context r8, android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            r7 = this;
            int[] r0 = g.e.f6633k
            android.content.res.TypedArray r0 = androidx.core.content.res.n.k(r9, r12, r11, r0)
            int r1 = g.e.f6636n
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            int r3 = g.e.f6635m
            int r3 = r0.getResourceId(r3, r2)
            int r4 = g.e.f6634l
            int r4 = r0.getResourceId(r4, r2)
            if (r4 <= 0) goto L24
            androidx.appcompat.widget.s2 r5 = androidx.appcompat.widget.s2.h()
            android.graphics.drawable.Drawable r4 = r5.j(r8, r4)
            goto L25
        L24:
            r4 = 0
        L25:
            int r5 = g.e.f6637o
            r6 = 0
            boolean r5 = r0.getBoolean(r5, r6)
            r0.recycle()
            java.lang.String r0 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r4 != 0) goto L6d
        L33:
            int r4 = r10.next()
            r6 = 4
            if (r4 != r6) goto L3b
            goto L33
        L3b:
            r6 = 2
            if (r4 != r6) goto L54
            java.lang.String r4 = r10.getName()
            java.lang.String r6 = "animated-vector"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L4f
            androidx.vectordrawable.graphics.drawable.e r4 = androidx.vectordrawable.graphics.drawable.e.b(r8, r9, r10, r11, r12)
            goto L6d
        L4f:
            android.graphics.drawable.Drawable r4 = g.c.a(r9, r10, r11, r12)
            goto L6d
        L54:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L6d:
            if (r4 == 0) goto L95
            if (r1 == r2) goto L7a
            if (r3 == r2) goto L7a
            f.a$c r8 = r7.f6519o
            int r8 = r8.C(r1, r3, r4, r5)
            return r8
        L7a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            java.lang.String r10 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L95:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.q(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):int");
    }

    private boolean r(int i6) {
        int c6;
        int G;
        g bVar;
        g gVar = this.f6520p;
        if (gVar == null) {
            c6 = c();
        } else {
            if (i6 == this.f6521q) {
                return true;
            }
            if (i6 == this.f6522r && gVar.a()) {
                gVar.b();
                this.f6521q = this.f6522r;
                this.f6522r = i6;
                return true;
            }
            c6 = this.f6521q;
            gVar.d();
        }
        this.f6520p = null;
        this.f6522r = -1;
        this.f6521q = -1;
        c cVar = this.f6519o;
        int E = cVar.E(c6);
        int E2 = cVar.E(i6);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else {
            if (!(current instanceof androidx.vectordrawable.graphics.drawable.e)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((androidx.vectordrawable.graphics.drawable.e) current);
        }
        bVar.c();
        this.f6520p = bVar;
        this.f6522r = c6;
        this.f6521q = i6;
        return true;
    }

    private void s(TypedArray typedArray) {
        c cVar = this.f6519o;
        cVar.f6548d |= g.c.b(typedArray);
        cVar.x(typedArray.getBoolean(g.e.f6626d, cVar.f6553i));
        cVar.t(typedArray.getBoolean(g.e.f6627e, cVar.f6556l));
        cVar.u(typedArray.getInt(g.e.f6628f, cVar.A));
        cVar.v(typedArray.getInt(g.e.f6629g, cVar.B));
        setDither(typedArray.getBoolean(g.e.f6624b, cVar.f6568x));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.d, f.b
    public void h(b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.f6519o = (c) dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // f.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f6520p;
        if (gVar != null) {
            gVar.d();
            this.f6520p = null;
            g(this.f6521q);
            this.f6521q = -1;
            this.f6522r = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public c b() {
        return new c(this.f6519o, this, null);
    }

    public void m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray k6 = n.k(resources, theme, attributeSet, g.e.f6623a);
        setVisible(k6.getBoolean(g.e.f6625c, true), true);
        s(k6);
        i(resources);
        k6.recycle();
        n(context, resources, xmlPullParser, attributeSet, theme);
        o();
    }

    @Override // f.d, f.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f6523s && super.mutate() == this) {
            this.f6519o.r();
            this.f6523s = true;
        }
        return this;
    }

    @Override // f.d, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int F = this.f6519o.F(iArr);
        boolean z5 = F != c() && (r(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? z5 | current.setState(iArr) : z5;
    }

    @Override // f.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        boolean visible = super.setVisible(z5, z6);
        g gVar = this.f6520p;
        if (gVar != null && (visible || z6)) {
            if (z5) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    a(c cVar, Resources resources) {
        super(null);
        this.f6521q = -1;
        this.f6522r = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
