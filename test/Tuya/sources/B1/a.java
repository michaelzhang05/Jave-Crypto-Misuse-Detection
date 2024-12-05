package B1;

import B1.d;
import android.content.Context;
import java.util.Date;
import java.util.Iterator;
import y1.C3981n;

/* loaded from: classes3.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f665f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected E1.f f666a = new E1.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f667b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f668c;

    /* renamed from: d, reason: collision with root package name */
    private d f669d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f670e;

    private a(d dVar) {
        this.f669d = dVar;
    }

    public static a a() {
        return f665f;
    }

    private void d() {
        if (this.f668c && this.f667b != null) {
            Iterator it = c.e().a().iterator();
            while (it.hasNext()) {
                ((C3981n) it.next()).w().g(c());
            }
        }
    }

    public void b(Context context) {
        if (!this.f668c) {
            this.f669d.b(context);
            this.f669d.a(this);
            this.f669d.i();
            this.f670e = this.f669d.g();
            this.f668c = true;
        }
    }

    public Date c() {
        Date date = this.f667b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void e() {
        Date a8 = this.f666a.a();
        Date date = this.f667b;
        if (date == null || a8.after(date)) {
            this.f667b = a8;
            d();
        }
    }

    @Override // B1.d.a
    public void a(boolean z8) {
        if (!this.f670e && z8) {
            e();
        }
        this.f670e = z8;
    }
}
