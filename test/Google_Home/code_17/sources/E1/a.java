package E1;

import B1.n;
import E1.d;
import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f2260f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected H1.f f2261a = new H1.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f2262b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2263c;

    /* renamed from: d, reason: collision with root package name */
    private d f2264d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2265e;

    private a(d dVar) {
        this.f2264d = dVar;
    }

    public static a a() {
        return f2260f;
    }

    private void d() {
        if (this.f2263c && this.f2262b != null) {
            Iterator it = c.e().a().iterator();
            while (it.hasNext()) {
                ((n) it.next()).w().l(c());
            }
        }
    }

    public void b(Context context) {
        if (!this.f2263c) {
            this.f2264d.b(context);
            this.f2264d.a(this);
            this.f2264d.i();
            this.f2265e = this.f2264d.g();
            this.f2263c = true;
        }
    }

    public Date c() {
        Date date = this.f2262b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void e() {
        Date a8 = this.f2261a.a();
        Date date = this.f2262b;
        if (date == null || a8.after(date)) {
            this.f2262b = a8;
            d();
        }
    }

    @Override // E1.d.a
    public void a(boolean z8) {
        if (!this.f2265e && z8) {
            e();
        }
        this.f2265e = z8;
    }
}
