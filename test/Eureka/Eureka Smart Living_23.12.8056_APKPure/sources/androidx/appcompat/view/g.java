package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.c2;
import androidx.appcompat.widget.c3;
import androidx.core.view.p0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    static final Class[] f460e;

    /* renamed from: f, reason: collision with root package name */
    static final Class[] f461f;

    /* renamed from: a, reason: collision with root package name */
    final Object[] f462a;

    /* renamed from: b, reason: collision with root package name */
    final Object[] f463b;

    /* renamed from: c, reason: collision with root package name */
    Context f464c;

    /* renamed from: d, reason: collision with root package name */
    private Object f465d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        private static final Class[] f466c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        private Object f467a;

        /* renamed from: b, reason: collision with root package name */
        private Method f468b;

        public a(Object obj, String str) {
            this.f467a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f468b = cls.getMethod(str, f466c);
            } catch (Exception e6) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e6);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f468b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f468b.invoke(this.f467a, menuItem)).booleanValue();
                }
                this.f468b.invoke(this.f467a, menuItem);
                return true;
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a, reason: collision with root package name */
        private Menu f469a;

        /* renamed from: b, reason: collision with root package name */
        private int f470b;

        /* renamed from: c, reason: collision with root package name */
        private int f471c;

        /* renamed from: d, reason: collision with root package name */
        private int f472d;

        /* renamed from: e, reason: collision with root package name */
        private int f473e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f474f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f475g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f476h;

        /* renamed from: i, reason: collision with root package name */
        private int f477i;

        /* renamed from: j, reason: collision with root package name */
        private int f478j;

        /* renamed from: k, reason: collision with root package name */
        private CharSequence f479k;

        /* renamed from: l, reason: collision with root package name */
        private CharSequence f480l;

        /* renamed from: m, reason: collision with root package name */
        private int f481m;

        /* renamed from: n, reason: collision with root package name */
        private char f482n;

        /* renamed from: o, reason: collision with root package name */
        private int f483o;

        /* renamed from: p, reason: collision with root package name */
        private char f484p;

        /* renamed from: q, reason: collision with root package name */
        private int f485q;

        /* renamed from: r, reason: collision with root package name */
        private int f486r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f487s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f488t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f489u;

        /* renamed from: v, reason: collision with root package name */
        private int f490v;

        /* renamed from: w, reason: collision with root package name */
        private int f491w;

        /* renamed from: x, reason: collision with root package name */
        private String f492x;

        /* renamed from: y, reason: collision with root package name */
        private String f493y;

        /* renamed from: z, reason: collision with root package name */
        private String f494z;

        public b(Menu menu) {
            this.f469a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f464c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e6) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e6);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z5 = false;
            menuItem.setChecked(this.f487s).setVisible(this.f488t).setEnabled(this.f489u).setCheckable(this.f486r >= 1).setTitleCondensed(this.f480l).setIcon(this.f481m);
            int i6 = this.f490v;
            if (i6 >= 0) {
                menuItem.setShowAsAction(i6);
            }
            if (this.f494z != null) {
                if (g.this.f464c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f494z));
            }
            if (this.f486r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.i) {
                    ((androidx.appcompat.view.menu.i) menuItem).t(true);
                } else if (menuItem instanceof androidx.appcompat.view.menu.j) {
                    ((androidx.appcompat.view.menu.j) menuItem).h(true);
                }
            }
            String str = this.f492x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f460e, g.this.f462a));
                z5 = true;
            }
            int i7 = this.f491w;
            if (i7 > 0) {
                if (z5) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i7);
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                p0.a(menuItem, bVar);
            }
            p0.c(menuItem, this.B);
            p0.g(menuItem, this.C);
            p0.b(menuItem, this.f482n, this.f483o);
            p0.f(menuItem, this.f484p, this.f485q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                p0.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                p0.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f476h = true;
            i(this.f469a.add(this.f470b, this.f477i, this.f478j, this.f479k));
        }

        public SubMenu b() {
            this.f476h = true;
            SubMenu addSubMenu = this.f469a.addSubMenu(this.f470b, this.f477i, this.f478j, this.f479k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f476h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f464c.obtainStyledAttributes(attributeSet, d.j.f6322o1);
            this.f470b = obtainStyledAttributes.getResourceId(d.j.f6332q1, 0);
            this.f471c = obtainStyledAttributes.getInt(d.j.f6342s1, 0);
            this.f472d = obtainStyledAttributes.getInt(d.j.f6347t1, 0);
            this.f473e = obtainStyledAttributes.getInt(d.j.f6352u1, 0);
            this.f474f = obtainStyledAttributes.getBoolean(d.j.f6337r1, true);
            this.f475g = obtainStyledAttributes.getBoolean(d.j.f6327p1, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            c3 u5 = c3.u(g.this.f464c, attributeSet, d.j.f6357v1);
            this.f477i = u5.n(d.j.f6372y1, 0);
            this.f478j = (u5.k(d.j.B1, this.f471c) & (-65536)) | (u5.k(d.j.C1, this.f472d) & 65535);
            this.f479k = u5.p(d.j.D1);
            this.f480l = u5.p(d.j.E1);
            this.f481m = u5.n(d.j.f6362w1, 0);
            this.f482n = c(u5.o(d.j.F1));
            this.f483o = u5.k(d.j.M1, 4096);
            this.f484p = c(u5.o(d.j.G1));
            this.f485q = u5.k(d.j.Q1, 4096);
            this.f486r = u5.s(d.j.H1) ? u5.a(d.j.H1, false) : this.f473e;
            this.f487s = u5.a(d.j.f6377z1, false);
            this.f488t = u5.a(d.j.A1, this.f474f);
            this.f489u = u5.a(d.j.f6367x1, this.f475g);
            this.f490v = u5.k(d.j.R1, -1);
            this.f494z = u5.o(d.j.I1);
            this.f491w = u5.n(d.j.J1, 0);
            this.f492x = u5.o(d.j.L1);
            String o6 = u5.o(d.j.K1);
            this.f493y = o6;
            boolean z5 = o6 != null;
            if (z5 && this.f491w == 0 && this.f492x == null) {
                this.A = (androidx.core.view.b) e(o6, g.f461f, g.this.f463b);
            } else {
                if (z5) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = u5.p(d.j.N1);
            this.C = u5.p(d.j.S1);
            if (u5.s(d.j.P1)) {
                this.E = c2.d(u5.k(d.j.P1, -1), this.E);
            } else {
                this.E = null;
            }
            if (u5.s(d.j.O1)) {
                this.D = u5.c(d.j.O1);
            } else {
                this.D = null;
            }
            u5.w();
            this.f476h = false;
        }

        public void h() {
            this.f470b = 0;
            this.f471c = 0;
            this.f472d = 0;
            this.f473e = 0;
            this.f474f = true;
            this.f475g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f460e = clsArr;
        f461f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f464c = context;
        Object[] objArr = {context};
        this.f462a = objArr;
        this.f463b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r15 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.d() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r15 = r0.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r15 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r15.a() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r15.equals("menu") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r7 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r15.equals("group") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r15.equals("item") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r15.equals("menu") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r15 == 1) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            androidx.appcompat.view.g$b r0 = new androidx.appcompat.view.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r5
            r6 = 0
            r7 = 0
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r5
            r7 = 0
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.d()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.A
            if (r15 == 0) goto L82
            boolean r15 = r15.a()
            if (r15 == 0) goto L82
            r0.b()
            goto Lb9
        L82:
            r0.a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = 1
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = 1
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.g.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    Object b() {
        if (this.f465d == null) {
            this.f465d = a(this.f464c);
        }
        return this.f465d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i6, Menu menu) {
        if (!(menu instanceof t.a)) {
            super.inflate(i6, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f464c.getResources().getLayout(i6);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e6) {
                    throw new InflateException("Error inflating menu XML", e6);
                }
            } catch (IOException e7) {
                throw new InflateException("Error inflating menu XML", e7);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
