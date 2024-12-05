package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.m;

/* compiled from: MenuDialogHelper.java */
/* loaded from: classes.dex */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: f, reason: collision with root package name */
    private g f279f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.appcompat.app.c f280g;

    /* renamed from: h, reason: collision with root package name */
    e f281h;

    /* renamed from: i, reason: collision with root package name */
    private m.a f282i;

    public h(g gVar) {
        this.f279f = gVar;
    }

    public void a() {
        androidx.appcompat.app.c cVar = this.f280g;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public void b(g gVar, boolean z) {
        if (z || gVar == this.f279f) {
            a();
        }
        m.a aVar = this.f282i;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public boolean c(g gVar) {
        m.a aVar = this.f282i;
        if (aVar != null) {
            return aVar.c(gVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        g gVar = this.f279f;
        c.a aVar = new c.a(gVar.w());
        e eVar = new e(aVar.b(), c.a.g.f2224j);
        this.f281h = eVar;
        eVar.g(this);
        this.f279f.b(this.f281h);
        aVar.c(this.f281h.a(), this);
        View A = gVar.A();
        if (A != null) {
            aVar.e(A);
        } else {
            aVar.g(gVar.y()).v(gVar.z());
        }
        aVar.p(this);
        androidx.appcompat.app.c a = aVar.a();
        this.f280g = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f280g.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f280g.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f279f.N((i) this.f281h.a().getItem(i2), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f281h.b(this.f279f, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f280g.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f280g.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f279f.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f279f.performShortcut(i2, keyEvent, 0);
    }
}
