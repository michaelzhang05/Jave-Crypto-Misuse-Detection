package R;

import O.C1258b;
import R.AbstractC1306c;
import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class b0 extends g0.e {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC1306c f8481b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(AbstractC1306c abstractC1306c, Looper looper) {
        super(looper);
        this.f8481b = abstractC1306c;
    }

    private static final void a(Message message) {
        c0 c0Var = (c0) message.obj;
        c0Var.b();
        c0Var.e();
    }

    private static final boolean b(Message message) {
        int i8 = message.what;
        if (i8 == 2 || i8 == 1 || i8 == 7) {
            return true;
        }
        return false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC1306c.a aVar;
        AbstractC1306c.a aVar2;
        C1258b c1258b;
        C1258b c1258b2;
        C1258b c1258b3;
        C1258b c1258b4;
        boolean z8;
        if (this.f8481b.f8486C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i8 = message.what;
        if ((i8 != 1 && i8 != 7 && ((i8 != 4 || this.f8481b.t()) && message.what != 5)) || this.f8481b.e()) {
            int i9 = message.what;
            PendingIntent pendingIntent = null;
            if (i9 == 4) {
                this.f8481b.f8512z = new C1258b(message.arg2);
                if (AbstractC1306c.h0(this.f8481b)) {
                    AbstractC1306c abstractC1306c = this.f8481b;
                    z8 = abstractC1306c.f8484A;
                    if (!z8) {
                        abstractC1306c.i0(3, null);
                        return;
                    }
                }
                AbstractC1306c abstractC1306c2 = this.f8481b;
                c1258b3 = abstractC1306c2.f8512z;
                if (c1258b3 != null) {
                    c1258b4 = abstractC1306c2.f8512z;
                } else {
                    c1258b4 = new C1258b(8);
                }
                this.f8481b.f8502p.b(c1258b4);
                this.f8481b.L(c1258b4);
                return;
            }
            if (i9 == 5) {
                AbstractC1306c abstractC1306c3 = this.f8481b;
                c1258b = abstractC1306c3.f8512z;
                if (c1258b != null) {
                    c1258b2 = abstractC1306c3.f8512z;
                } else {
                    c1258b2 = new C1258b(8);
                }
                this.f8481b.f8502p.b(c1258b2);
                this.f8481b.L(c1258b2);
                return;
            }
            if (i9 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                C1258b c1258b5 = new C1258b(message.arg2, pendingIntent);
                this.f8481b.f8502p.b(c1258b5);
                this.f8481b.L(c1258b5);
                return;
            }
            if (i9 == 6) {
                this.f8481b.i0(5, null);
                AbstractC1306c abstractC1306c4 = this.f8481b;
                aVar = abstractC1306c4.f8507u;
                if (aVar != null) {
                    aVar2 = abstractC1306c4.f8507u;
                    aVar2.i(message.arg2);
                }
                this.f8481b.M(message.arg2);
                AbstractC1306c.g0(this.f8481b, 5, 1, null);
                return;
            }
            if (i9 == 2 && !this.f8481b.g()) {
                a(message);
                return;
            }
            if (b(message)) {
                ((c0) message.obj).c();
                return;
            }
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        a(message);
    }
}
