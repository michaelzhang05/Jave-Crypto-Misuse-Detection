package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public abstract class a3 {

    /* loaded from: classes.dex */
    static class a {
        static void a(Window window, boolean z5) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z5 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* loaded from: classes.dex */
    static class b {
        static void a(Window window, boolean z5) {
            window.setDecorFitsSystemWindows(z5);
        }
    }

    public static e4 a(Window window, View view) {
        return new e4(window, view);
    }

    public static void b(Window window, boolean z5) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z5);
        } else {
            a.a(window, z5);
        }
    }
}
