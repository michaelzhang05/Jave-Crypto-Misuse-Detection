package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.m;

/* loaded from: classes.dex */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: a, reason: collision with root package name */
    private g f648a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.appcompat.app.b f649b;

    /* renamed from: c, reason: collision with root package name */
    e f650c;

    /* renamed from: d, reason: collision with root package name */
    private m.a f651d;

    public h(g gVar) {
        this.f648a = gVar;
    }

    @Override // androidx.appcompat.view.menu.m.a
    public void a(g gVar, boolean z5) {
        if (z5 || gVar == this.f648a) {
            c();
        }
        m.a aVar = this.f651d;
        if (aVar != null) {
            aVar.a(gVar, z5);
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public boolean b(g gVar) {
        m.a aVar = this.f651d;
        if (aVar != null) {
            return aVar.b(gVar);
        }
        return false;
    }

    public void c() {
        androidx.appcompat.app.b bVar = this.f649b;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        g gVar = this.f648a;
        b.a aVar = new b.a(gVar.u());
        e eVar = new e(aVar.b(), d.g.f6223j);
        this.f650c = eVar;
        eVar.h(this);
        this.f648a.b(this.f650c);
        aVar.c(this.f650c.b(), this);
        View y5 = gVar.y();
        if (y5 != null) {
            aVar.d(y5);
        } else {
            aVar.e(gVar.w()).i(gVar.x());
        }
        aVar.g(this);
        androidx.appcompat.app.b a6 = aVar.a();
        this.f649b = a6;
        a6.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f649b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f649b.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i6) {
        this.f648a.L((i) this.f650c.b().getItem(i6), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f650c.a(this.f648a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i6, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i6 == 82 || i6 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f649b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f649b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f648a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f648a.performShortcut(i6, keyEvent, 0);
    }
}
