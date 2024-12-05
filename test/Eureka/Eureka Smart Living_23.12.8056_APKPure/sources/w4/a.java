package w4;

import android.content.res.AssetFileDescriptor;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private int f9774b = 0;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList f9773a = new ArrayList();

    public a(AssetFileDescriptor assetFileDescriptor, int i6, float f6) {
        i6 = i6 < 0 ? 1 : i6;
        for (int i7 = 0; i7 < i6; i7++) {
            this.f9773a.add(new b(assetFileDescriptor, f6));
        }
    }

    public void a() {
        ((b) this.f9773a.get(this.f9774b)).b();
        int i6 = this.f9774b + 1;
        this.f9774b = i6;
        this.f9774b = i6 % this.f9773a.size();
    }

    public boolean b() {
        boolean z5 = false;
        for (int i6 = 0; i6 < this.f9773a.size(); i6++) {
            z5 |= ((b) this.f9773a.get(i6)).c();
        }
        return z5;
    }

    public void c(Callable callable) {
        ((b) this.f9773a.get(this.f9774b)).d(callable);
        int i6 = this.f9774b + 1;
        this.f9774b = i6;
        this.f9774b = i6 % this.f9773a.size();
    }

    public void d() {
        if (this.f9773a.size() > 0) {
            ((b) this.f9773a.get(0)).e();
        }
    }

    public void e(float f6) {
        for (int i6 = 0; i6 < this.f9773a.size(); i6++) {
            ((b) this.f9773a.get(i6)).f(f6);
        }
    }

    public void f() {
        for (int i6 = 0; i6 < this.f9773a.size(); i6++) {
            ((b) this.f9773a.get(i6)).g();
        }
    }

    public void g() {
        f();
        for (int i6 = 0; i6 < this.f9773a.size(); i6++) {
            ((b) this.f9773a.get(i6)).h();
        }
        ArrayList arrayList = this.f9773a;
        arrayList.removeAll(arrayList);
    }
}
