package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b implements m {

    /* renamed from: a, reason: collision with root package name */
    protected Context f557a;

    /* renamed from: b, reason: collision with root package name */
    protected Context f558b;

    /* renamed from: c, reason: collision with root package name */
    protected g f559c;

    /* renamed from: d, reason: collision with root package name */
    protected LayoutInflater f560d;

    /* renamed from: e, reason: collision with root package name */
    protected LayoutInflater f561e;

    /* renamed from: f, reason: collision with root package name */
    private m.a f562f;

    /* renamed from: g, reason: collision with root package name */
    private int f563g;

    /* renamed from: h, reason: collision with root package name */
    private int f564h;

    /* renamed from: i, reason: collision with root package name */
    protected n f565i;

    /* renamed from: j, reason: collision with root package name */
    private int f566j;

    public b(Context context, int i6, int i7) {
        this.f557a = context;
        this.f560d = LayoutInflater.from(context);
        this.f563g = i6;
        this.f564h = i7;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z5) {
        m.a aVar = this.f562f;
        if (aVar != null) {
            aVar.a(gVar, z5);
        }
    }

    protected void b(View view, int i6) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f565i).addView(view, i6);
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(Context context, g gVar) {
        this.f558b = context;
        this.f561e = LayoutInflater.from(context);
        this.f559c = gVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e(g gVar, i iVar) {
        return false;
    }

    public abstract void f(i iVar, n.a aVar);

    @Override // androidx.appcompat.view.menu.m
    public boolean g(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.f562f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.m
    public boolean i(r rVar) {
        m.a aVar = this.f562f;
        r rVar2 = rVar;
        if (aVar == null) {
            return false;
        }
        if (rVar == null) {
            rVar2 = this.f559c;
        }
        return aVar.b(rVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.m
    public void j(boolean z5) {
        ViewGroup viewGroup = (ViewGroup) this.f565i;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f559c;
        int i6 = 0;
        if (gVar != null) {
            gVar.r();
            ArrayList E = this.f559c.E();
            int size = E.size();
            int i7 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                i iVar = (i) E.get(i8);
                if (q(i7, iVar)) {
                    View childAt = viewGroup.getChildAt(i7);
                    i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                    View n6 = n(iVar, childAt, viewGroup);
                    if (iVar != itemData) {
                        n6.setPressed(false);
                        n6.jumpDrawablesToCurrentState();
                    }
                    if (n6 != childAt) {
                        b(n6, i7);
                    }
                    i7++;
                }
            }
            i6 = i7;
        }
        while (i6 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i6)) {
                i6++;
            }
        }
    }

    public n.a k(ViewGroup viewGroup) {
        return (n.a) this.f560d.inflate(this.f564h, viewGroup, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean l(ViewGroup viewGroup, int i6) {
        viewGroup.removeViewAt(i6);
        return true;
    }

    public m.a m() {
        return this.f562f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(i iVar, View view, ViewGroup viewGroup) {
        n.a k6 = view instanceof n.a ? (n.a) view : k(viewGroup);
        f(iVar, k6);
        return (View) k6;
    }

    public n o(ViewGroup viewGroup) {
        if (this.f565i == null) {
            n nVar = (n) this.f560d.inflate(this.f563g, viewGroup, false);
            this.f565i = nVar;
            nVar.b(this.f559c);
            j(true);
        }
        return this.f565i;
    }

    public void p(int i6) {
        this.f566j = i6;
    }

    public abstract boolean q(int i6, i iVar);
}
