package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class g implements t.a {
    private static final int[] A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    private final Context f622a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f623b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f624c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f625d;

    /* renamed from: e, reason: collision with root package name */
    private a f626e;

    /* renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f634m;

    /* renamed from: n, reason: collision with root package name */
    CharSequence f635n;

    /* renamed from: o, reason: collision with root package name */
    Drawable f636o;

    /* renamed from: p, reason: collision with root package name */
    View f637p;

    /* renamed from: x, reason: collision with root package name */
    private i f645x;

    /* renamed from: z, reason: collision with root package name */
    private boolean f647z;

    /* renamed from: l, reason: collision with root package name */
    private int f633l = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f638q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f639r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f640s = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f641t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f642u = false;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList f643v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList f644w = new CopyOnWriteArrayList();

    /* renamed from: y, reason: collision with root package name */
    private boolean f646y = false;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f627f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f628g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private boolean f629h = true;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f630i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f631j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private boolean f632k = true;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(i iVar);
    }

    public g(Context context) {
        this.f622a = context;
        this.f623b = context.getResources();
        b0(true);
    }

    private static int B(int i6) {
        int i7 = ((-65536) & i6) >> 16;
        if (i7 >= 0) {
            int[] iArr = A;
            if (i7 < iArr.length) {
                return (i6 & 65535) | (iArr[i7] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i6, boolean z5) {
        if (i6 < 0 || i6 >= this.f627f.size()) {
            return;
        }
        this.f627f.remove(i6);
        if (z5) {
            K(true);
        }
    }

    private void W(int i6, CharSequence charSequence, int i7, Drawable drawable, View view) {
        Resources C = C();
        if (view != null) {
            this.f637p = view;
            this.f635n = null;
            this.f636o = null;
        } else {
            if (i6 > 0) {
                this.f635n = C.getText(i6);
            } else if (charSequence != null) {
                this.f635n = charSequence;
            }
            if (i7 > 0) {
                this.f636o = androidx.core.content.a.e(u(), i7);
            } else if (drawable != null) {
                this.f636o = drawable;
            }
            this.f637p = null;
        }
        K(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (androidx.core.view.q2.e(android.view.ViewConfiguration.get(r2.f622a), r2.f622a) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f623b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f622a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f622a
            boolean r3 = androidx.core.view.q2.e(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f625d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.g.b0(boolean):void");
    }

    private i g(int i6, int i7, int i8, int i9, CharSequence charSequence, int i10) {
        return new i(this, i6, i7, i8, i9, charSequence, i10);
    }

    private void i(boolean z5) {
        if (this.f644w.isEmpty()) {
            return;
        }
        d0();
        Iterator it = this.f644w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            m mVar = (m) weakReference.get();
            if (mVar == null) {
                this.f644w.remove(weakReference);
            } else {
                mVar.j(z5);
            }
        }
        c0();
    }

    private boolean j(r rVar, m mVar) {
        if (this.f644w.isEmpty()) {
            return false;
        }
        boolean i6 = mVar != null ? mVar.i(rVar) : false;
        Iterator it = this.f644w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            m mVar2 = (m) weakReference.get();
            if (mVar2 == null) {
                this.f644w.remove(weakReference);
            } else if (!i6) {
                i6 = mVar2.i(rVar);
            }
        }
        return i6;
    }

    private static int n(ArrayList arrayList, int i6) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((i) arrayList.get(size)).f() <= i6) {
                return size + 1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.f641t;
    }

    Resources C() {
        return this.f623b;
    }

    public g D() {
        return this;
    }

    public ArrayList E() {
        if (!this.f629h) {
            return this.f628g;
        }
        this.f628g.clear();
        int size = this.f627f.size();
        for (int i6 = 0; i6 < size; i6++) {
            i iVar = (i) this.f627f.get(i6);
            if (iVar.isVisible()) {
                this.f628g.add(iVar);
            }
        }
        this.f629h = false;
        this.f632k = true;
        return this.f628g;
    }

    public boolean F() {
        return this.f646y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean G() {
        return this.f624c;
    }

    public boolean H() {
        return this.f625d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(i iVar) {
        this.f632k = true;
        K(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(i iVar) {
        this.f629h = true;
        K(true);
    }

    public void K(boolean z5) {
        if (this.f638q) {
            this.f639r = true;
            if (z5) {
                this.f640s = true;
                return;
            }
            return;
        }
        if (z5) {
            this.f629h = true;
            this.f632k = true;
        }
        i(z5);
    }

    public boolean L(MenuItem menuItem, int i6) {
        return M(menuItem, null, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r1 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        e(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if ((r9 & 1) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (r1 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean M(android.view.MenuItem r7, androidx.appcompat.view.menu.m r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.i r7 = (androidx.appcompat.view.menu.i) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.k()
            androidx.core.view.b r2 = r7.b()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.a()
            if (r4 == 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            boolean r5 = r7.j()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.e(r3)
            goto L6b
        L31:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L3f
            if (r4 == 0) goto L3a
            goto L3f
        L3a:
            r7 = r9 & 1
            if (r7 != 0) goto L6b
            goto L2d
        L3f:
            r9 = r9 & 4
            if (r9 != 0) goto L46
            r6.e(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            androidx.appcompat.view.menu.r r9 = new androidx.appcompat.view.menu.r
            android.content.Context r0 = r6.u()
            r9.<init>(r0, r6, r7)
            r7.x(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.r r7 = (androidx.appcompat.view.menu.r) r7
            if (r4 == 0) goto L63
            r2.e(r7)
        L63:
            boolean r7 = r6.j(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.g.M(android.view.MenuItem, androidx.appcompat.view.menu.m, int):boolean");
    }

    public void O(m mVar) {
        Iterator it = this.f644w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            m mVar2 = (m) weakReference.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f644w.remove(weakReference);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem item = getItem(i6);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).P(bundle);
            }
        }
        int i7 = bundle.getInt("android:menu:expandedactionview");
        if (i7 <= 0 || (findItem = findItem(i7)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem item = getItem(i6);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f626e = aVar;
    }

    public g S(int i6) {
        this.f633l = i6;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f627f.size();
        d0();
        for (int i6 = 0; i6 < size; i6++) {
            i iVar = (i) this.f627f.get(i6);
            if (iVar.getGroupId() == groupId && iVar.m() && iVar.isCheckable()) {
                iVar.s(iVar == menuItem);
            }
        }
        c0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g U(int i6) {
        W(0, null, i6, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g X(int i6) {
        W(i6, null, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public g Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    protected MenuItem a(int i6, int i7, int i8, CharSequence charSequence) {
        int B = B(i8);
        i g6 = g(i6, i7, i8, B, charSequence, this.f633l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f634m;
        if (contextMenuInfo != null) {
            g6.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f627f;
        arrayList.add(n(arrayList, B), g6);
        K(true);
        return g6;
    }

    public void a0(boolean z5) {
        this.f647z = z5;
    }

    @Override // android.view.Menu
    public MenuItem add(int i6) {
        return a(0, 0, 0, this.f623b.getString(i6));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i6, int i7, int i8, ComponentName componentName, Intent[] intentArr, Intent intent, int i9, MenuItem[] menuItemArr) {
        int i10;
        PackageManager packageManager = this.f622a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i9 & 1) == 0) {
            removeGroup(i6);
        }
        for (int i11 = 0; i11 < size; i11++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i11);
            int i12 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i12 < 0 ? intent : intentArr[i12]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i6, i7, i8, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i10 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i10] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i6) {
        return addSubMenu(0, 0, 0, this.f623b.getString(i6));
    }

    public void b(m mVar) {
        c(mVar, this.f622a);
    }

    public void c(m mVar, Context context) {
        this.f644w.add(new WeakReference(mVar));
        mVar.d(context, this);
        this.f632k = true;
    }

    public void c0() {
        this.f638q = false;
        if (this.f639r) {
            this.f639r = false;
            K(this.f640s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        i iVar = this.f645x;
        if (iVar != null) {
            f(iVar);
        }
        this.f627f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f636o = null;
        this.f635n = null;
        this.f637p = null;
        K(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f626e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (this.f638q) {
            return;
        }
        this.f638q = true;
        this.f639r = false;
        this.f640s = false;
    }

    public final void e(boolean z5) {
        if (this.f642u) {
            return;
        }
        this.f642u = true;
        Iterator it = this.f644w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            m mVar = (m) weakReference.get();
            if (mVar == null) {
                this.f644w.remove(weakReference);
            } else {
                mVar.a(this, z5);
            }
        }
        this.f642u = false;
    }

    public boolean f(i iVar) {
        boolean z5 = false;
        if (!this.f644w.isEmpty() && this.f645x == iVar) {
            d0();
            Iterator it = this.f644w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                m mVar = (m) weakReference.get();
                if (mVar == null) {
                    this.f644w.remove(weakReference);
                } else {
                    z5 = mVar.e(this, iVar);
                    if (z5) {
                        break;
                    }
                }
            }
            c0();
            if (z5) {
                this.f645x = null;
            }
        }
        return z5;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i6) {
        MenuItem findItem;
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            i iVar = (i) this.f627f.get(i7);
            if (iVar.getItemId() == i6) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.getSubMenu().findItem(i6)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i6) {
        return (MenuItem) this.f627f.get(i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(g gVar, MenuItem menuItem) {
        a aVar = this.f626e;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f647z) {
            return true;
        }
        int size = size();
        for (int i6 = 0; i6 < size; i6++) {
            if (((i) this.f627f.get(i6)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i6, KeyEvent keyEvent) {
        return p(i6, keyEvent) != null;
    }

    public boolean k(i iVar) {
        boolean z5 = false;
        if (this.f644w.isEmpty()) {
            return false;
        }
        d0();
        Iterator it = this.f644w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            m mVar = (m) weakReference.get();
            if (mVar == null) {
                this.f644w.remove(weakReference);
            } else {
                z5 = mVar.g(this, iVar);
                if (z5) {
                    break;
                }
            }
        }
        c0();
        if (z5) {
            this.f645x = iVar;
        }
        return z5;
    }

    public int l(int i6) {
        return m(i6, 0);
    }

    public int m(int i6, int i7) {
        int size = size();
        if (i7 < 0) {
            i7 = 0;
        }
        while (i7 < size) {
            if (((i) this.f627f.get(i7)).getGroupId() == i6) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    public int o(int i6) {
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((i) this.f627f.get(i7)).getItemId() == i6) {
                return i7;
            }
        }
        return -1;
    }

    i p(int i6, KeyEvent keyEvent) {
        ArrayList arrayList = this.f643v;
        arrayList.clear();
        q(arrayList, i6, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (i) arrayList.get(0);
        }
        boolean G = G();
        for (int i7 = 0; i7 < size; i7++) {
            i iVar = (i) arrayList.get(i7);
            char alphabeticShortcut = G ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (G && alphabeticShortcut == '\b' && i6 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i6, int i7) {
        return L(findItem(i6), i7);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i6, KeyEvent keyEvent, int i7) {
        i p6 = p(i6, keyEvent);
        boolean L = p6 != null ? L(p6, i7) : false;
        if ((i7 & 2) != 0) {
            e(true);
        }
        return L;
    }

    void q(List list, int i6, KeyEvent keyEvent) {
        boolean G = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i6 == 67) {
            int size = this.f627f.size();
            for (int i7 = 0; i7 < size; i7++) {
                i iVar = (i) this.f627f.get(i7);
                if (iVar.hasSubMenu()) {
                    ((g) iVar.getSubMenu()).q(list, i6, keyEvent);
                }
                char alphabeticShortcut = G ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((G ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == '\b' && i6 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList E = E();
        if (this.f632k) {
            Iterator it = this.f644w.iterator();
            boolean z5 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                m mVar = (m) weakReference.get();
                if (mVar == null) {
                    this.f644w.remove(weakReference);
                } else {
                    z5 |= mVar.c();
                }
            }
            if (z5) {
                this.f630i.clear();
                this.f631j.clear();
                int size = E.size();
                for (int i6 = 0; i6 < size; i6++) {
                    i iVar = (i) E.get(i6);
                    (iVar.l() ? this.f630i : this.f631j).add(iVar);
                }
            } else {
                this.f630i.clear();
                this.f631j.clear();
                this.f631j.addAll(E());
            }
            this.f632k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i6) {
        int l6 = l(i6);
        if (l6 >= 0) {
            int size = this.f627f.size() - l6;
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                if (i7 >= size || ((i) this.f627f.get(l6)).getGroupId() != i6) {
                    break;
                }
                N(l6, false);
                i7 = i8;
            }
            K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i6) {
        N(o(i6), true);
    }

    public ArrayList s() {
        r();
        return this.f630i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i6, boolean z5, boolean z6) {
        int size = this.f627f.size();
        for (int i7 = 0; i7 < size; i7++) {
            i iVar = (i) this.f627f.get(i7);
            if (iVar.getGroupId() == i6) {
                iVar.t(z6);
                iVar.setCheckable(z5);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z5) {
        this.f646y = z5;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i6, boolean z5) {
        int size = this.f627f.size();
        for (int i7 = 0; i7 < size; i7++) {
            i iVar = (i) this.f627f.get(i7);
            if (iVar.getGroupId() == i6) {
                iVar.setEnabled(z5);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i6, boolean z5) {
        int size = this.f627f.size();
        boolean z6 = false;
        for (int i7 = 0; i7 < size; i7++) {
            i iVar = (i) this.f627f.get(i7);
            if (iVar.getGroupId() == i6 && iVar.y(z5)) {
                z6 = true;
            }
        }
        if (z6) {
            K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z5) {
        this.f624c = z5;
        K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f627f.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f622a;
    }

    public i v() {
        return this.f645x;
    }

    public Drawable w() {
        return this.f636o;
    }

    public CharSequence x() {
        return this.f635n;
    }

    public View y() {
        return this.f637p;
    }

    public ArrayList z() {
        r();
        return this.f631j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i6, int i7, int i8, int i9) {
        return a(i6, i7, i8, this.f623b.getString(i9));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i6, int i7, int i8, int i9) {
        return addSubMenu(i6, i7, i8, this.f623b.getString(i9));
    }

    @Override // android.view.Menu
    public MenuItem add(int i6, int i7, int i8, CharSequence charSequence) {
        return a(i6, i7, i8, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i6, int i7, int i8, CharSequence charSequence) {
        i iVar = (i) a(i6, i7, i8, charSequence);
        r rVar = new r(this.f622a, this, iVar);
        iVar.x(rVar);
        return rVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }
}
