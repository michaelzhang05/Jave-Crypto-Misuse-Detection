package c.s;

import android.view.ViewGroup;

/* compiled from: Scene.java */
/* loaded from: classes.dex */
public class l {
    private ViewGroup a;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f3010b;

    public static l b(ViewGroup viewGroup) {
        return (l) viewGroup.getTag(j.f2995c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(ViewGroup viewGroup, l lVar) {
        viewGroup.setTag(j.f2995c, lVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.a) != this || (runnable = this.f3010b) == null) {
            return;
        }
        runnable.run();
    }
}
